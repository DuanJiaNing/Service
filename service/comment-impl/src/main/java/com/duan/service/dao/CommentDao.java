package com.duan.service.dao;

import com.duan.service.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Repository
public interface CommentDao extends BaseDao<Comment> {

    List<Comment> findByTopicId(int topicId);
}
