package com.university.portal.resource;


import com.university.portal.document.Article;
import com.university.portal.repository.ArticleRepository;
import com.university.portal.resource.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/article")
public class ArticleResource {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    @GetMapping("/search")
    public List<Article> searchArticle(@RequestParam String searchString) {
        return articleRepository.findByHeadingContainingOrTagContaining(searchString, searchString);
    }

    @GetMapping("/prepopulate")
    public void prePopulate() {
        articleService.prePopulateData();
    }

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    public void addArticle(@RequestBody Article article) {
        System.out.println("just a test");
        articleRepository.save(new Article(article.getId(), article.getTag(), article.getHeading(), article.getBody()));
    }

}