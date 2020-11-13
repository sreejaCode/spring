package se.sda.web.springproject.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.sda.web.springproject.Topics.Topics;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository <Article,Long> {
    List<Article> findAllByTopic_Id(Long topicId);

}
