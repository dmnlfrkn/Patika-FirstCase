package com.patika.project.firstCase.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patika.project.firstCase.DataAccess.IRepositoryDal;
import com.patika.project.firstCase.Entities.Products;
import com.patika.project.firstCase.Entities.Productcomments;

@Service
public class RepositoryManager implements IRepositoryService {
	
	private IRepositoryDal repositoryDal;
	@Autowired
	public RepositoryManager(IRepositoryDal repositoryDal) {
		this.repositoryDal = repositoryDal;
	}

	@Override
	@Transactional
	public List<Productcomments> getAllProductComment(int productId) {
		return repositoryDal.getAllProductComment(productId);
	}

	@Override
	@Transactional
	public List<Productcomments> getAllCommentByDate(String productId,String begindate, String lastdate) {
		return repositoryDal.getAllCommentByDate(productId,begindate,lastdate);
	}

	@Override
	@Transactional
	public List<Productcomments> getAllUserComment(int id) {
		return repositoryDal.getAllUserComment(id);
	}

	@Override
	@Transactional
	public List<Productcomments> getAllUserCommentByDate(String userId,String begindate, String lastdate) {
		return repositoryDal.getAllUserCommentByDate(userId,begindate,lastdate);
	}

	@Override
	@Transactional
	public List<Products> getAllProductByExpirationDate() {
		return repositoryDal.getAllProductByExpirationDate();
	}

	@Override
	@Transactional
	public List<Products> getAllProductByNotExpirationDate() {
		
		return repositoryDal.getAllProductByNotExpirationDate();
	}
}
