package com.one23.official.resource;

import com.one23.official.model.collectionName;
import com.one23.official.repository.collectionNameRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Setter
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class collectionNameController {

      @Autowired
    private collectionNameRepository repository;


    @PostMapping("/addproducts")
    public String savecollectionName(@RequestBody collectionName collname){
        repository.save(collname);
        return "added products";
    }

    @GetMapping("/findAllProducts")
    public List<collectionName> getcollname(){

        return repository.findAll();
    }

    @GetMapping("/findAllProducts/{id}")
    public Optional<collectionName> getproduct(@PathVariable String id){

        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletebook(@PathVariable String id){
        repository.deleteById(id);
        return "product deleted";
    }

//    @PutMapping("/edit/{id}")
//    public String updateproduct(@PathVariable String id, @RequestBody collectionName newcollname){
//

//        return service.update(id, newcollname);
//
//        Optional<collectionName> coll =  repository.findById(id);
//
//        return "updated";
//    }
//

}
