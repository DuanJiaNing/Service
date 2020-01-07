package com.duan.service.dto;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Data
public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 262572669645248632L;
    private Integer id;
    private Timestamp insertTime;

    private Integer status;
    private String content;
    private Integer like;
    private Integer topicId;
    private Integer dislike;
}
