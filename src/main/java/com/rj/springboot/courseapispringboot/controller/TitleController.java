package com.rj.springboot.courseapispringboot.controller;

import com.rj.springboot.courseapispringboot.model.Title;
import com.rj.springboot.courseapispringboot.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TitleController {
    
    @Autowired
    private TitleService titleService;
    
    @GetMapping("/titles")
    public List<Title> getAlltitles() {
        return titleService.getAllTitles();
    }

    @PostMapping("/title")
    public void addTitle(@RequestBody Title title) {
        titleService.addTitle(title);
    }

    @PatchMapping("/title/{id}")
            public void updateTitle(@PathVariable String id, @RequestBody Title title) {
        titleService.updateTitle(id,title);
    }

    @DeleteMapping("/title/{id}")
    public void deletetitle(@PathVariable("id") String id) {
        titleService.deleteTitle(id);
    }
}
