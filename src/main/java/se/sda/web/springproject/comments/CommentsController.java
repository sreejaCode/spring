package se.sda.web.springproject.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;


@RestController
public class CommentsController {

    private CommentsService commentsService;


    public CommentsController(@Autowired CommentsService commentsService) {
        this.commentsService = commentsService;
    }




    @GetMapping("/comments")
    public List<Comments> getAll(@RequestParam(required = false) Long articleId) {
        if (articleId == null) {
            return commentsService.getAll();
        } else {
            return commentsService.getAllByArticleId(articleId);
        }
    }


    @RequestMapping("/comments/{id}")
    public Comments getById(@PathVariable Long id) {
        return commentsService.getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    @PostMapping("/comments")
    public Comments create(@RequestBody Comments comment) {

        return commentsService.create(comment);

    }
    @PutMapping("/comments")
    public Comments update(@RequestBody Comments comment) {

        return commentsService.update(comment);

    }



    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id) {
        commentsService.delete(id);
    }



}


