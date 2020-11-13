package se.sda.web.springproject.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se.sda.web.springproject.comments.Comments;
import se.sda.web.springproject.comments.CommentsService;

import java.util.List;


@RestController
public class TopicsController {

    private TopicsService topicsService;


    public TopicsController(@Autowired TopicsService topicsService) {
        this.topicsService = topicsService;
    }


    @GetMapping("/comments")
    public List<Topics> getAll() {
        return topicsService.getAll();
    }



    @RequestMapping("/topics/{id}")
    public Topics getById(@PathVariable Long id) {
        return topicsService.getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    @PostMapping("/comments")
    public Topics create(@RequestBody Topics article) {

        return topicsService.create(article);

    }
    @PutMapping("/comments")
    public Topics update(@RequestBody Topics article) {

        return topicsService.update(article);

    }



    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id) {
        topicsService.delete(id);
    }



}


