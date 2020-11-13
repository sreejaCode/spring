package se.sda.web.springproject.Topics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TopicsRepository extends JpaRepository<Topics,Long> {
}