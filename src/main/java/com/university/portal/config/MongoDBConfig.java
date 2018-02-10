package com.university.portal.config;


import com.university.portal.document.Article;
import com.university.portal.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static java.util.Arrays.asList;

@EnableMongoRepositories(basePackageClasses = ArticleRepository.class)
@Configuration
public class MongoDBConfig {
}
