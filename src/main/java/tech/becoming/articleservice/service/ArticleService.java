package tech.becoming.articleservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.becoming.articleservice.entity.Article;
import tech.becoming.articleservice.exception.BadRequestException;
import tech.becoming.articleservice.exception.NotFoundException;
import tech.becoming.articleservice.repository.ArticleRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article setData(String id, String body) {
        final Article article = articleRepository
                .findById(id)
                .orElseThrow(NotFoundException::new);

        article.setUpdated(LocalDateTime.now());
        article.setBody(body);

        return articleRepository.save(article);
    }

    public Article findById(String id) {
        return articleRepository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public Article save(Article newArticle) {
        if(isNewArticleValid(newArticle)) {
            newArticle.setCreated(LocalDateTime.now());
            newArticle.setUpdated(LocalDateTime.now());

            return articleRepository.save(newArticle);
        }

        throw new BadRequestException();
    }

    private boolean isNewArticleValid(Article article) {
        return article.getAuthor() != null && article.getAuthor().replaceAll(" ", "").length() > 0;

    }
}
