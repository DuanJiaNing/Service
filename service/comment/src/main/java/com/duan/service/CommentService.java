package com.duan.service;


import com.duan.service.dto.PageCondition;
import com.duan.service.dto.CommentDTO;
import com.duan.service.exceptions.CommentException;
import com.github.pagehelper.PageInfo;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public interface CommentService extends Service<CommentDTO> {

    CommentDTO add(String content, int topicId) throws CommentException;

    CommentDTO like(int id) throws CommentException;

    CommentDTO dislike(int id) throws CommentException;

    PageInfo<CommentDTO> listByTopic(int topicId, PageCondition pageCondition);

}
