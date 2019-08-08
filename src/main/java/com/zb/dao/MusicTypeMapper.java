package com.zb.dao;

import com.zb.entity.Type;

import java.util.List;

public interface MusicTypeMapper {

    /**
     * 查询所有歌曲类别
     * @return
     */
    List<Type> showAllType();
}
