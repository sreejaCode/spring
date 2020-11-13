package se.sda.web.springproject.article;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se.sda.web.springproject.Topics.Topics;


import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    private articleService artService;


    public ArticleController(@Autowired articleService artService) {
        this.artService = artService;
    }


   /* @GetMapping("/articles")
    public List<Article> getAll() {

            return artService.getAll();

    }*/


    @RequestMapping("/articles/{id}")
    public Article getById(@PathVariable Long id) {
        return artService.getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    @PostMapping("/articles")
    public Article create(@RequestBody Article article) {

        return artService.create(article);

    }
    @PutMapping("/articles")
    public Article update(@RequestBody Article article) {

        return artService.update(article);

    }



    @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable Long id) {
        artService.delete(id);
    }

    @GetMapping("/articles")
    public List<Article> getAll(@RequestParam(required = false) Long topicId) {

        if (topicId == null) {
            return artService.getAll();
        }
        else {
            return artService.getAllByTopicId(topicId);
        }
    }

}
