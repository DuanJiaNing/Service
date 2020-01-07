package com.duan.service.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Data
public class UserLike implements Serializable {

    private static final long serialVersionUID = -3055368536449586087L;
    private Integer id;
    private Integer topicId;
    private String userId;

    private Integer like;

    private Timestamp insertTime;

}
