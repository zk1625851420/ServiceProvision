package com.zb.controller;

import com.zb.entity.Type;
import com.zb.service.MusicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicTypeController {
    @Autowired
    MusicTypeService mts;

    @RequestMapping("/showAllType")
    public List<Type> showAllType(){
        return mts.showAllType();
    }
}
