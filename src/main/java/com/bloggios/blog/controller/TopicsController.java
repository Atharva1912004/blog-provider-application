package com.bloggios.blog.controller;

import com.bloggios.blog.constants.EndpointConstants;
import com.bloggios.blog.payload.response.TopicsListResponse;
import com.bloggios.blog.service.TopicsService;
import com.bloggios.blog.utils.AsyncUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - blog-provider-application
 * Package - com.bloggios.blog.controller
 * Created_on - May 29 - 2024
 * Created_at - 20:47
 */

@RestController
@RequestMapping(EndpointConstants.TopicsController.BASE_PATH)
public class TopicsController {

    private final TopicsService topicsService;

    public TopicsController(
            TopicsService topicsService
    ) {
        this.topicsService = topicsService;
    }

    @GetMapping
    public ResponseEntity<TopicsListResponse> getTags() {
        return ResponseEntity.ok(AsyncUtils.getAsyncResult(topicsService.tagsList()));
    }
}