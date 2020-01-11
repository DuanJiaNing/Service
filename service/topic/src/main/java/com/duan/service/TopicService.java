package com.duan.service;


import com.duan.service.dto.PageCondition;
import com.duan.service.Service;
import com.duan.service.dto.TopicDTO;
import com.duan.service.exceptions.TopicException;
import com.github.pagehelper.PageInfo;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public interface TopicService extends Service<TopicDTO> {

    TopicDTO add(String topic, String notes, String uid, String appId) throws TopicException;

    PageInfo<TopicDTO> list(PageCondition pageCondition);

}
