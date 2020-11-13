package se.sda.web.springproject.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;


@Service
public class TopicsService {
    @Autowired
    private TopicsRepository repository;

    public List<Topics> getAll() {
        return repository.findAll();
    }


    public Optional<Topics> getById(Long id) {
        return repository.findById(id);

    }

    public Topics create(Topics Topic) {
        return repository.save(Topic);

    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    public Topics update(Topics updatedTopic) {
        return repository.save(updatedTopic);

    }

    public List<Topics> getAllByArticleId(Long articleId) {
        return repository.findAllByArticleId(articleId);
    }



}



