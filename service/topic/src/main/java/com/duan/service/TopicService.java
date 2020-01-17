package com.duan.service;


import com.duan.service.dto.TopicCriteriaDTO;
import com.duan.service.dto.TopicDTO;
import com.duan.service.dto.TopicSummaryDTO;
import com.duan.service.exceptions.TopicException;
import com.github.pagehelper.PageInfo;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public interface TopicService extends Service<TopicDTO> {

    TopicDTO add(String topic, String notes, String uid, String appId) throws TopicException;

    PageInfo<TopicDTO> simpleList(TopicCriteriaDTO criteria);

    PageInfo<TopicSummaryDTO> listSummary(TopicCriteriaDTO criteria);

}
