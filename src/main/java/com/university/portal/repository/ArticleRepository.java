package com.university.portal.repository;

import com.university.portal.document.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, Integer> {
}
