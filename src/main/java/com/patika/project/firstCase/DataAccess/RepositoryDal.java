package com.patika.project.firstCase.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.patika.project.firstCase.Entities.Products;
import com.patika.project.firstCase.Entities.Productcomments;

@Repository
public class RepositoryDal implements IRepositoryDal{
	
	private EntityManager entityManager;
	
	@Autowired
	public RepositoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Productcomments> getAllProductComment(int productId) {
		Session session = entityManager.unwrap(Session.class);
		List<Productcomments> comments = session.createQuery("from Productcomments where productId = :productId",Productcomments.class).setParameter("productId", productId).getResultList();
		return comments;
	}

	@Override
	@Transactional
	public List<Productcomments> getAllCommentByDate(String productId,String beginDate,String lastDate) {
		Session session = entityManager.unwrap(Session.class);
		List<Productcomments> comments = session.createQuery("from Productcomments where productId = :productId AND commentdate BETWEEN :beginDate AND :lastDate",Productcomments.class)
				.setParameter("productId", Integer.parseInt(productId))
				.setParameter("beginDate", beginDate)
				.setParameter("lastDate", lastDate)
				.getResultList();
		return comments;
	}

	@Override
	@Transactional
	public List<Productcomments> getAllUserComment(int userId) {
		Session session = entityManager.unwrap(Session.class);
		List<Productcomments> comments = session.createQuery("from Productcomments where userId = :userId",Productcomments.class).setParameter("userId", userId).getResultList();
		return comments;
	}

	@Override
	@Transactional
	public List<Productcomments> getAllUserCommentByDate(String userId,String beginDate,String lastDate) {
		Session session = entityManager.unwrap(Session.class);
		List<Productcomments> comments = session.createQuery("from Productcomments where userId = :userId AND commentdate BETWEEN :beginDate AND :lastDate",Productcomments.class)
				.setParameter("userId", Integer.parseInt(userId))
				.setParameter("beginDate", beginDate)
				.setParameter("lastDate", lastDate)
				.getResultList();
		return comments;
	}

	@Override
	@Transactional
	public List<Products> getAllProductByExpirationDate() {
		Session session = entityManager.unwrap(Session.class);
		List<Products> products = session.createQuery("from Products where expirationdate < CURDATE()",Products.class)
				.getResultList();
		return products;
	}

	@Override
	@Transactional
	public List<Products> getAllProductByNotExpirationDate() {
		Session session = entityManager.unwrap(Session.class);
		List<Products> products = session.createQuery("from Products where expirationdate > CURDATE()",Products.class)
				.getResultList();
		return products;
	}
	/*
	@Override
	public void add(City city) {
		// if(id)
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.delete(cityToDelete);
		
	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}*/

}
