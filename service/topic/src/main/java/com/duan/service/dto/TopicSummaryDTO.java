package com.duan.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2020/1/17.
 *
 * @author DuanJiaNing
 */
@Data
public class TopicSummaryDTO implements Serializable {

    private static final long serialVersionUID = -4848404894808120377L;
    private Integer id;
    private Timestamp insertTime;
    private Integer status;
    private String title;

    private Integer agree;
    private Integer disagree;

    private Integer interestUserCount;
}
