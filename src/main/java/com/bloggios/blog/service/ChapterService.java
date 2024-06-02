package com.bloggios.blog.service;

import com.bloggios.blog.payload.request.ChapterRequest;
import com.bloggios.blog.payload.response.ModuleResponse;

import java.util.concurrent.CompletableFuture;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - blog-provider-application
 * Package - com.bloggios.blog.service
 * Created_on - June 02 - 2024
 * Created_at - 12:06
 */

public interface ChapterService {

    CompletableFuture<ModuleResponse> addChapter(ChapterRequest chapterRequest);
}
