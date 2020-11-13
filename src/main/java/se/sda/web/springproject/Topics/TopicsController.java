package se.sda.web.springproject.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;


@RestController
public class TopicsController {

    private TopicsService topicsService;


    public TopicsController(@Autowired TopicsService topicsService) {
        this.topicsService = topicsService;
    }


    @GetMapping("/topics")
    public List<Topics> getAll(@RequestParam(required = false) Long articleId) {
        if (articleId == null) {
            return topicsService.getAll();
        } else {
            return topicsService.getAllByArticleId(articleId);
        }
    }



    @RequestMapping("/topics/{id}")
    public Topics getById(@PathVariable Long id) {
        return topicsService.getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    @PostMapping("/topics")
    public Topics create(@RequestBody Topics article) {

        return topicsService.create(article);

    }
    @PutMapping("/topics")
    public Topics update(@RequestBody Topics article) {

        return topicsService.update(article);

    }



    @DeleteMapping("/topics/{id}")
    public void delete(@PathVariable Long id) {
        topicsService.delete(id);
    }



}


