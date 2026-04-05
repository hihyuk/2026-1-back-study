//package com.example.shop.order;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class OrderRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    public Order findById(Long id) {
//        return em.find(Order.class, id);
//    }
//
//    public List<Order> findAll() {
//        return em.createQuery("select o from Order o", Order.class)
//                .getResultList();
//    }
//
//    public void  save(Order order) {
//        em.persist(order);
//    }
//}
