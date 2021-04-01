package com.rj.springboot.courseapispringboot.service;

import com.rj.springboot.courseapispringboot.model.Title;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TitleService {

    private List<Title> titles = new ArrayList<>(Arrays.asList(
            new Title("spring","Spring in Action","spring in action description"),
            new Title("java","Java in Action","java in action description"),
            new Title("java ee","Java EE in Action","java EE in action description"),
            new Title("hibernate","Hibernate in Action","hibernate in action description")
    ));

    public List<Title> getAllTitles() {
        return titles;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public void updateTitle(String id, Title title) {
       for(int i = 0; i < titles.size(); i++) {
           if(titles.get(i).getId().equalsIgnoreCase(id)) {
               titles.set(i,title);
               System.out.println(i+"\n");
               break;
           }
       }
    }

    public void deleteTitle(String id) {
        titles.removeIf(t->t.getId().equalsIgnoreCase(id));
    }
}
