package com.duan.service.dao;

import com.duan.service.entity.Topic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Repository
public interface TopicDao extends BaseDao<Topic> {

    List<Topic> findAll();

    Topic findByTitle(String title);

    List<Topic> findWithIds(@Param("topic") Topic topic, @Param("ids") List<Integer> ids);
}
