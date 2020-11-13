package se.sda.web.springproject.Topics;

import se.sda.web.springproject.article.Article;

import javax.persistence.*;


@Entity
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToMany
    private Article article;





    public Topics() {
    }

    public Topics(Long id, String name, Article article) {
        this.id = id;
        this.name = name;
        this.article = article;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
