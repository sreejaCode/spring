package se.sda.web.springproject.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class articleService {


    @Autowired
    private ArticleRepository repository;

    public List<Article> getAll() {
        return repository.findAll();
    }


    public Optional<Article> getById(Long id) {
        return repository.findById(id);

    }

    public Article create(Article article) {
         return repository.save(article);

    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    public Article update(Article updatedarticle) {
        return repository.save(updatedarticle);

    }



}


