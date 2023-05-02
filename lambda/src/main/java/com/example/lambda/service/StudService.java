package com.example.lambda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.lambda.DAO.StudDAO;
import com.example.lambda.entity.stud;

//@Service
//public class StudService {
//    @Autowired
//    private StudDAO studDAO;
//
//    public List<stud> getAllStudsOver18() {
//        List<stud> studs = studDAO.getAllStudsOver18();
//
//        // Use lambda expressions for map, filter, and foreach operations
//        return studs.stream()
//                .filter(s -> s.getAge() > 18)
//                .map(s -> {
//                    String fullName = s.getFirstName() + " " + s.getLastName();
//                    s.setFirstName(fullName);
//                    s.setLastName(""); 
//                    s.setFullName(fullName); 
//                    return s;
//                })
//                .peek(System.out::println) 
//                .collect(Collectors.toList());
//    }
//}


@Service
public class StudService {
  @Autowired
  private StudDAO studDAO;


public List<stud> getAllStudsOver18(@PathVariable int pageNum,@PathVariable int pageSize) {
    List<stud> studs = studDAO.getAllStudsOver18( pageNum,pageSize);
    
    // Use lambda expressions for map, filter, and foreach operations
    return studs.stream()
            .filter(s -> s.getAge() > 18)
            .map(s -> {
                String fullName = s.getFirstName() + " " + s.getLastName();
                s.setFirstName(fullName);
                s.setLastName(""); 
                s.setFullName(fullName); 
                return s;
            })
            .skip((pageNum - 1) * pageSize)
            .limit(pageSize)
            .peek(System.out::println) 
            .collect(Collectors.toList());
}

}
