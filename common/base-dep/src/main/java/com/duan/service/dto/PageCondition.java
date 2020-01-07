package com.duan.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageCondition implements Serializable {

    private static final long serialVersionUID = -895924374084687016L;
    private int pageNum;
    private int pageSize;
}
