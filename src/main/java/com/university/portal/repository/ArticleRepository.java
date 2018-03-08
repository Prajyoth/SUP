package com.university.portal.repository;

import com.university.portal.document.Article;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, Integer> {
    List<Article> findByHeadingContainingOrTagContaining(String heading, String tag);
}
