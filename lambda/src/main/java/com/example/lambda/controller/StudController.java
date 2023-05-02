package com.example.lambda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.lambda.entity.stud;
import com.example.lambda.service.StudService;

@RestController
	public class StudController {
	    @Autowired
	    private StudService studService;

//	    @GetMapping("/studs")
//	    public List<stud> getAllStudsOver18() {
//	        return studService.getAllStudsOver18();
//	    }
//	    
	    
	    @GetMapping("/studs/{pageNum}/{pageSize}")
	    public List<stud> getAllStudsOver18(@PathVariable int pageNum, @PathVariable int pageSize) {
	        return studService.getAllStudsOver18(pageNum, pageSize);
	    }
	    
	    
	}
