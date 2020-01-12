package com.duan.service.entity;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = -256865085363011189L;
    private Integer id;
    private Integer topicId;
    private Timestamp insertTime;

    private String content;
    private Integer status;
    private Integer like;
    private Integer dislike;
}
