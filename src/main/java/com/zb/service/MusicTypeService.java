package com.zb.service;

import com.zb.entity.Type;

import java.util.List;

public interface MusicTypeService {
    /**
     * 查询所有歌曲类别
     * @return
     */
    List<Type> showAllType();
}
