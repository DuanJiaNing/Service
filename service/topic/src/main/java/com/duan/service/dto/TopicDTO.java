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
public class TopicDTO implements Serializable {

    private static final long serialVersionUID = -4848404894808120377L;
    private Integer id;
    private Timestamp insertTime;

    private Integer status;
    private String title;
    private String notes;
    private Integer like;
    private Integer dislike;
}
