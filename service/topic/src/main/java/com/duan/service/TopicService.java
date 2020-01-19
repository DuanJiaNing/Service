package com.duan.service;


import com.duan.service.dto.TopicCriteriaDTO;
import com.duan.service.dto.TopicDTO;
import com.duan.service.exceptions.TopicException;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public interface TopicService extends Service<TopicDTO> {

    TopicDTO add(String topic, String notes, String uid, String appId) throws TopicException;

    PageInfo<TopicDTO> simpleList(TopicCriteriaDTO criteria);

    PageInfo<TopicDTO> simpleList(TopicCriteriaDTO criteria, List<Integer> ids);
}
