package se.sda.web.springproject.article;



import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name ="id")
    private Long id;

    @Column(name ="title")
    private String title;

    @Column(name ="body")
    private String body;

    @Column(name ="author")
    private String author;






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




}
