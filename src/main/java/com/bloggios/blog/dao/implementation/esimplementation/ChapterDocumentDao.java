package com.bloggios.blog.dao.implementation.esimplementation;

import com.bloggios.blog.dao.EsAbstractDao;
import com.bloggios.blog.dao.repository.elasticsearch.ChapterDocumentRepository;
import com.bloggios.blog.document.ChapterDocument;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - blog-provider-application
 * Package - com.bloggios.blog.dao.implementation.esimplementation
 * Created_on - June 01 - 2024
 * Created_at - 20:26
 */

@Component
public class ChapterDocumentDao extends EsAbstractDao<ChapterDocument, ChapterDocumentRepository> {

    protected ChapterDocumentDao(ChapterDocumentRepository repository) {
        super(repository);
    }

    public Optional<ChapterDocument> findById(String chapterId) {
        return repository.findById(chapterId);
    }

    public List<ChapterDocument> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }
}
