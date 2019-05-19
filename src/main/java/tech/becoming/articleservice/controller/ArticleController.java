package tech.becoming.articleservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tech.becoming.articleservice.entity.Article;
import tech.becoming.articleservice.service.ArticleService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("article")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String createFile(@RequestBody Article article) {

        return articleService.save(article).getId();
    }

    @PostMapping(
            value = "{id}",
            consumes = MediaType.TEXT_PLAIN_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String uploadFile(@PathVariable String id,
                             @RequestBody String body) throws IOException {

        return articleService.setData(id, body).getId();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Article getFile(@PathVariable String id) {
        return articleService.findById(id);
    }

    @GetMapping(value = "{id}/body", produces = MediaType.TEXT_PLAIN_VALUE)
    public String downloadFile(@PathVariable String id) {
        return articleService.findById(id).getBody();
    }

}
