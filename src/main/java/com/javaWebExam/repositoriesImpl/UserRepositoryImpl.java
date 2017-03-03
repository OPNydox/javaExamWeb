package com.javaWebExam.repositoriesImpl;

import com.javaWebExam.entities.User;
import com.javaWebExam.repositories.UserRepository;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Local(UserRepository.class)
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getLoggedUser(String username, String password) {
        Query query = entityManager.createQuery("" +
                "SELECT u FROM User As U " +
                "WHERE U.username =: username AND " +
                "U.password =: password");

        query.setParameter("username", username);
        query.setParameter("password", password);

        List<User> users = new ArrayList<>();
        User user = null;

        if (!users.isEmpty()){
            user = users.stream().findFirst().get();
        }

        return user;
    }

    @Override
    public void registerUser(User userToRegister) {
        entityManager.persist(userToRegister);
    }
}
