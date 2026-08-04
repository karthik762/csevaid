package jar.controller;

import jar.model.Student;
import jar.repo.StudentRepo;    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Delete {
    @Autowired
    StudentRepo db;
    @DeleteMapping("/api/delete/{id}")
    public String getMethodName(@PathVariable long id) {
     
        db.deleteById(id);
        return "deleted";
    }
    
}
