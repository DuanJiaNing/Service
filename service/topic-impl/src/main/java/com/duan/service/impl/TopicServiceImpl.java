package com.duan.service.impl;

import com.duan.service.TopicService;
import com.duan.service.enums.TopicStatus;
import com.duan.service.dao.TopicDao;
import com.duan.service.dto.TopicCriteriaDTO;
import com.duan.service.dto.TopicDTO;
import com.duan.service.entity.Topic;
import com.duan.service.exceptions.InternalException;
import com.duan.service.exceptions.TopicException;
import com.duan.service.util.DataConverter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Override
    public TopicDTO get(int id) {
        Topic topic = topicDao.findById(id);
        return DataConverter.map(topic, TopicDTO.class);
    }

    @Override
    public TopicDTO add(String title, String notes, String uid, String appId) throws TopicException {
        if (title == null || StringUtils.isBlank(title)) {
            throw new TopicException("Fail to add topic: topic title can not be empty");
        }

        if (topicDao.findByTitle(title) != null) {
            throw new TopicException("Fail to add topic: topic with same title exist");
        }

        Topic topic = new Topic();
        if (StringUtils.isNotBlank(notes)) {
            topic.setNotes(notes);
        }
        topic.setTitle(title);
        topic.setStatus(TopicStatus.FINE.getCode());
        topic.setUserId(uid);
        topic.setAppId(appId);
        if (topicDao.insert(topic) != 1) {
            throw new TopicException("Fail to add topic", new InternalException("DB"));
        }

        return DataConverter.map(topic, TopicDTO.class);
    }

    @Override
    public PageInfo<TopicDTO> list(TopicCriteriaDTO criteria) {
        if (criteria.getPageNum() < 0 || criteria.getPageSize() <= 0) {
            // no page query is not allowed, set default to 0,10
            criteria.setPageNum(0);
            criteria.setPageSize(10);
        }

        Topic st = DataConverter.map(criteria, Topic.class);
        PageHelper.startPage(criteria.getPageNum(), criteria.getPageSize());
        List<Topic> pageList = topicDao.find(st);
        return DataConverter.page(pageList, TopicDTO.class);
    }
}
