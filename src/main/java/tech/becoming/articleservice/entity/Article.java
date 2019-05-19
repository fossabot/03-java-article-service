package tech.becoming.articleservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Article {

    @Id
    private String id;

    private String author;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<String> tags;

    @JsonIgnore
    private String body;
}
