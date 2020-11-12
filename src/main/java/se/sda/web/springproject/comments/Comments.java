package se.sda.web.springproject.comments;

import se.sda.web.springproject.article.Article;
import javax.persistence.*;
import java.util.List;


@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String body;

    private String author;

    @ManyToOne
    private Article article;





    public Comments() {
    }

    public Comments(Long id, String body, String author,Article article ) {
        this.id = id;
        this.body = body;
        this.author = author;
        this.article = article;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
