package com.sqlconverter.controller;

import com.sqlconverter.domain.service.SQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teradashoutarou on 2017/01/04.
 */
@RestController
@RequestMapping("/api")
public class SQLController {


    private final SQLService service;

    /**
     * コンストラクタインジェクション
     * @param service
     */
    @Autowired
    public SQLController( SQLService service ) {
        this.service = service;
    }

    /**
     * SQL変換用API
     * @param sql
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/convert/sql")
    public String getConvertSql( String sql ) {
        return null;
    }
}
