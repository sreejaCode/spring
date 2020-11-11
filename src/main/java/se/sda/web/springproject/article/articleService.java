package se.sda.web.springproject.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class articleService {



    private List<Article> articles;

    public articleService() {
        this.articles = new ArrayList<>();
        articles.add(new Article(1L,"10 reasons to learn Spring", "this is the body", "Jane"));

    }



    public Article getById(Long id) {
        for(Article a : articles) {
            if( a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }





    public List<Article> getAll() {
        return this.articles;
    }


    public Article create(Article article) {

         this.articles.add(article);
         return article;

    }
    public void delete(Long id) {

       //articles.remove(id);
        articles = articles.stream()
                .filter(a ->!a.getId().equals(id))
                .collect(Collectors.toList());


    }





}


