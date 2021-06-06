package com.example.demo.elasticsearchdemo;

import com.example.demo.elasticsearchdemo.service.TermQueryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ElasticsearchdemoApplicationTests {
    @Autowired
  private TermQueryService termQueryService;
    @Test
   public  void test() throws IOException {
        termQueryService.termQuery();
    }

}
