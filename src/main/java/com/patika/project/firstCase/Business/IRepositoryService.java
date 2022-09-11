package com.patika.project.firstCase.Business;


import java.util.List;

import com.patika.project.firstCase.Entities.Products;
import com.patika.project.firstCase.Entities.Productcomments;

public interface IRepositoryService {
	List<Productcomments> getAllProductComment(int productId);
	List<Productcomments> getAllCommentByDate(String productId,String begin,String last);
	List<Productcomments> getAllUserComment(int id);
	List<Productcomments> getAllUserCommentByDate(String userId,String begin,String last);
	List<Products> getAllProductByExpirationDate();
	List<Products> getAllProductByNotExpirationDate();
}
