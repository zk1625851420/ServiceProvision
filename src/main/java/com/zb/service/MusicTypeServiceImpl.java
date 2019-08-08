package com.zb.service;

import com.zb.dao.MusicTypeMapper;
import com.zb.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicTypeServiceImpl implements MusicTypeService{

    @Autowired
    MusicTypeMapper mtm;
    @Override
    public List<Type> showAllType() {
        return mtm.showAllType();
    }
}
