package com.sinysoft.examplepersonnel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personnel")
public class ControlePersonnel {
    private List<Person> personList=new ArrayList<>();

    private ResponseEntity<List<Person>> getAllPerson(){
        personList.addAll()
        return ResponseEntity.ok()
    }
}
