package com.university.portal.resource.Service;

import com.university.portal.document.Article;
import com.university.portal.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void prePopulateData() {
        List<Article> articles = new ArrayList<Article>();

        articles.add(new Article(20, Arrays.asList("Networks", "Java"), "Learn Networks in Java", "This is a sample body which explains networks in java" ));
        articles.add(new Article(10, Arrays.asList("C","DataStructures"), "Arrays and their uses", "General usage of arrays in C"));
        articles.add(new Article(55, Arrays.asList("C", "Cpp"), "Low Level Programming", "Intro to low level programming in C, some assembly and C++. You will also need to know a few concepts in Haskell for the excersice"));
        articles.add(new Article(67, Arrays.asList("Nginx"), "Server Config with Nginx", "This is a tutorial to configure the reverse proxy server - NGINX. This article will demonstrate how to set up your reverse proxy so that you can have multiple services being called in accordance to what is required by proxy passing request.\\nThis server also allows you to add security via headers and also support load balancing which is a very useful feature."));
        articles.add(new Article(88, Arrays.asList("PHP"), "Using PHP to set up Server", "This article gives a brief insight as to set up server configurations using PHP and related tools"));

        for(Article article: articles) {
            articleRepository.save(article);
        }


    }
}
