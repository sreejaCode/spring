package se.sda.web.springproject.Topics;

import se.sda.web.springproject.article.Article;

import javax.persistence.*;
import java.util.List;


@Entity
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "topic")
    private List <Article> article;





    public Topics() {
    }

    public Topics(Long id, String name) {
        this.id = id;
        this.name = name;

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




}
