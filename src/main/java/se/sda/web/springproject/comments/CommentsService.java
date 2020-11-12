package se.sda.web.springproject.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CommentsService {
    @Autowired
    private CommentsRepository repository;

    public List<Comments> getAll() {
        return repository.findAll();
    }


    public Optional<Comments> getById(Long id) {
        return repository.findById(id);

    }

    public Comments create(Comments comment) {
        return repository.save(comment);

    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    public Comments update(Comments updatedcomment) {
        return repository.save(updatedcomment);

    }

    public List<Comments> getAllByArticleId(Long articleId) {
        return repository.findAllByArticleId(articleId);
    }




}





