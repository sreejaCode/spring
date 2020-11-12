package se.sda.web.springproject.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> getAll() {
        return repository.findAll();
    }


    public Optional<Category> getById(Long id) {
        return repository.findById(id);

    }

    public Category create(Category category) {
        return repository.save(category);

    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    public Category update(Category updatedcategory) {
        return repository.save(updatedcategory);

    }





}




