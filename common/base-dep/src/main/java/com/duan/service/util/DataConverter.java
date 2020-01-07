package com.duan.service.util;

import com.github.pagehelper.PageInfo;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public class DataConverter {
    private static ModelMapper mapper = new ModelMapper();

    public static <D> D map(Object source, Class<D> destinationType) {
        if (source == null) {
            return null;
        }
        return mapper.map(source, destinationType);
    }


    public static <Entity, DTO> PageInfo<DTO> page(List<Entity> pageList, Class<DTO> clasz) {
        PageInfo<Entity> temp = new PageInfo<>(pageList);
        PageInfo<DTO> rpage = new PageInfo<>();
        ArrayList<DTO> dtos = new ArrayList<>(temp.getList().size());
        for (Entity e : temp.getList()) {
            DTO dto = DataConverter.map(e, clasz);
            dtos.add(dto);
        }

        rpage.setList(dtos);
        rpage.setPageNum(temp.getPageNum());
        rpage.setPageSize(temp.getPageSize());
        rpage.setTotal(temp.getTotal());
        rpage.setPages(temp.getPages());

        return rpage;
    }
}
