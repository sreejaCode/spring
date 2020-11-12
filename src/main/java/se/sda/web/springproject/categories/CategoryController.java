package se.sda.web.springproject.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



import java.util.List;


    @RestController
    public class CategoryController {

        private CategoryService categoryService;


        public CategoryController(@Autowired CategoryService categoryService) {
            this.categoryService = categoryService;
        }


        @GetMapping("/categories")
        public List<Category> getAll() {
            return categoryService.getAll();
        }



        @RequestMapping("/categories/{id}")
        public Category getById(@PathVariable Long id) {
            return categoryService.getById(id)
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));


        }

        @PostMapping("/categories")
        public Category create(@RequestBody Category article) {

            return categoryService.create(article);

        }
        @PutMapping("/categories")
        public Category update(@RequestBody Category article) {

            return categoryService.update(article);

        }



        @DeleteMapping("/categories/{id}")
        public void delete(@PathVariable Long id) {
            categoryService.delete(id);
        }



    }


