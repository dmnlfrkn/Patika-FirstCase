package com.patika.project.firstCase.DataAccess;

import java.util.List;

import com.patika.project.firstCase.Entities.Products;
import com.patika.project.firstCase.Entities.Productcomments;

public interface IRepositoryDal {
	List<Productcomments> getAllProductComment(int productId);
	List<Productcomments> getAllCommentByDate(String productId,String beginDate,String lastDate);
	List<Productcomments> getAllUserComment(int id);
	List<Productcomments> getAllUserCommentByDate(String userId,String beginDate,String lastDate);
	List<Products> getAllProductByExpirationDate();
	List<Products> getAllProductByNotExpirationDate();

}
