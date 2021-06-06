package com.example.demo.elasticsearchdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.elasticsearchdemo.bean.User;
import com.example.demo.elasticsearchdemo.service.TermQueryService;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.collapse.CollapseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class TermQueryServiceImpl implements TermQueryService {

    private static final Logger logger = LoggerFactory.getLogger(TermQueryServiceImpl.class);

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Override
    public void termQuery() throws IOException {
        // 构建查询条件
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termQuery("tags", "B")).collapse(new CollapseBuilder("studentNo"));
        // 构建查询请求对象
        SearchRequest searchRequest = new SearchRequest("test");
        searchRequest.types("user");
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        // 根据状态和数据条数验证是否返回了数据
        if (RestStatus.OK.equals(searchResponse.status()) && searchResponse.getHits().totalHits > 0) {
            SearchHits hits = searchResponse.getHits();
            for (SearchHit hit : hits) {
                // 将 JSON 转换成对象
                User user = JSON.parseObject(hit.getSourceAsString(), User.class);
                // 输出查询信息
                logger.info(user.toString());
            }

        }
    }
}
