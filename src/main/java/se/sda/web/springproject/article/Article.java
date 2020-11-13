package se.sda.web.springproject.article;

import se.sda.web.springproject.Topics.Topics;
import se.sda.web.springproject.comments.Comments;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="title")
    private String title;

    @Column(name ="body")
    private String body;

    @Column(name ="author")
    private String author;




    @OneToMany
    private List<Comments> comment;


    @ManyToMany
    private List<Topics> topic;



    public Article() {
    }

    public Article(Long id, String title, String body, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Comments> getComment() {
        return comment;
    }

    public void setComment(List<Comments> comment) {
        this.comment = comment;
    }
    public List<Topics> getTopic() {
        return topic;
    }

    public void setTopic(List<Topics> topic) {
        this.topic = topic;
    }
}
