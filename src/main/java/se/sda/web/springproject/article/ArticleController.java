package se.sda.web.springproject.article;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private articleService artService;




    @GetMapping("/articles")
    public List<Article> getAll() {
        return artService.getAll();
    }



    @RequestMapping("/articles/{id}")
    public Article getById(@PathVariable Long id) {
        return artService.getById(id);


    }

    @PostMapping("/articles")
    public Article create(@RequestBody Article article) {

        return artService.create(article);

    }

    @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable Long id) {
        artService.delete(id);
    }



}
