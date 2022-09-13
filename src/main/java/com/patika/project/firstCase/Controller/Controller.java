package com.patika.project.firstCase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patika.project.firstCase.Business.IRepositoryService;
import com.patika.project.firstCase.Entities.*;
@RestController
@RequestMapping("/api")
public class Controller {
	private IRepositoryService repositoryService;
	
	@Autowired
	public Controller(IRepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}
	
	@GetMapping("/comments")
	public List<Productcomments> getAllProductComment(@RequestBody int productId){
		return repositoryService.getAllProductComment(productId);
	}
	
	@GetMapping("/commentsbyDates")	
	public List<Productcomments>getAllCommentByDate(@RequestBody List<String> list){
		/*
		
		 ["1","2022-09-09","2022-09-11"]
		 
		*/
		return repositoryService.getAllCommentByDate(list.get(0),list.get(1),list.get(2));
	}
	
	
	@GetMapping("/commentsbyUserId")
	public List<Productcomments> getAllUserComment(@RequestBody int userId){
		return repositoryService.getAllUserComment(userId);
	}
	
	@GetMapping("/commentsbyUserDates")	
	public List<Productcomments>getAllUserCommentByDate(@RequestBody List<String> list){
		/*
		
		 ["1","2022-09-09","2022-09-11"]
		 
		*/
		return repositoryService.getAllUserCommentByDate(list.get(0),list.get(1),list.get(2));
	}
	@GetMapping("/productsbyDate")
	public List<Products> getAllProductByExpirationDate(){
		return repositoryService.getAllProductByExpirationDate();
	}
	
	@GetMapping("/productsbyNotDate")
	public List<Products> getAllProductByNotExpirationDate(){
		return repositoryService.getAllProductByNotExpirationDate();
	}
}
