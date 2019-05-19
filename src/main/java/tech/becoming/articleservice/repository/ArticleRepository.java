package tech.becoming.articleservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.becoming.articleservice.entity.Article;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {
}
