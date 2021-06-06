package com.example.demo.elasticsearchdemo.controller;

import com.example.demo.elasticsearchdemo.service.TermQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/test")
public class ElasticSearchQueryController {

    @Autowired
    private TermQueryService termQueryService;

    @RequestMapping(value = "/search")
    public  void query() throws IOException {
        termQueryService.termQuery();
    }
}
