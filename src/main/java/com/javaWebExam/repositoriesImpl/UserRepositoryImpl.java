package com.javaWebExam.repositoriesImpl;

import com.javaWebExam.entities.User;
import com.javaWebExam.repositories.UserRepository;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local(UserRepository.class)
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserByName(String username) {
        Query query = entityManager.createQuery("" +
                "SELECT u FROM User As U " +
                "WHERE U.username =: username");
        return null;
    }

    @Override
    public void registerUser(User userToRegister) {
        entityManager.persist(userToRegister);
    }
}
