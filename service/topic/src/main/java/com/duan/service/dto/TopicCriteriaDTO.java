package com.duan.service.dto;

import lombok.Data;

/**
 * Created on 2020/1/12.
 *
 * @author DuanJiaNing
 */
@Data
public class TopicCriteriaDTO extends PageCondition {

    private static final long serialVersionUID = 3003732595421962250L;
    private String userId;
    private String title;
    private Integer id;
    private String appId;
    private Integer status;

}
