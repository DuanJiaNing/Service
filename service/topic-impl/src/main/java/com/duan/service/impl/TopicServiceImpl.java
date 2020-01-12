package com.duan.service.impl;

import com.duan.service.TopicService;
import com.duan.service.common.TopicStatus;
import com.duan.service.entity.Topic;
import com.duan.service.dao.TopicDao;
import com.duan.service.dto.PageCondition;
import com.duan.service.dto.TopicDTO;
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

        Topic fcheck = new Topic();
        fcheck.setTitle(title);
        List<Topic> topics = topicDao.find(fcheck);
        if (topics.size() == 1) {
            throw new TopicException("Fail to add topic: topic with same title exist");
        }

        Topic topic = new Topic();
        if (StringUtils.isNotBlank(notes)) {
            topic.setNotes(notes);
        }
        topic.setTitle(title);
        topic.setStatus(TopicStatus.FINE.ordinal());
        topic.setUserId(uid);
        topic.setAppId(appId);
        if (topicDao.insert(topic) != 1) {
            throw new TopicException("Fail to add topic", new InternalException("DB"));
        }

        return DataConverter.map(topic, TopicDTO.class);
    }

    @Override
    public PageInfo<TopicDTO> list(PageCondition pageCondition) {
        if (pageCondition == null || pageCondition.getPageNum() < 0 || pageCondition.getPageSize() <= 0) {
            // no page query is not allowed, set default to 0,10
            pageCondition = new PageCondition();
            pageCondition.setPageNum(0);
            pageCondition.setPageSize(10);
        }

        PageHelper.startPage(pageCondition.getPageNum(), pageCondition.getPageSize());
        List<Topic> pageList = topicDao.findAll();
        return DataConverter.page(pageList, TopicDTO.class);
    }
}
