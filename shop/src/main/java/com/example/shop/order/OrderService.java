//package com.example.shop.order;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class OrderService {
//
//    private final OrderRepository orderRepository;
//
//    @Transactional
//    public Long createOrder(OrderCreateRequest request) {
//        Order order = new Order(
//                request.getMemberId(),
//                request.getProductId()
//        );
//
//        orderRepository.save(order);
//
//        return order.getId();
//    }
//
//    @Transactional(readOnly = true)
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    @Transactional(readOnly = true)
//    public Order getOrderById(Long id) {
//        Order order = orderRepository.findById(id);
//
//        if (order == null) {
//            throw new RuntimeException("주문을 찾을 수 없습니다.");
//        }
//
//        return order;
//    }
//
//    @Transactional
//    public void cancelOrder(Long id) {
//        Order order = orderRepository.findById(id);
//
//        if (order == null) {
//            throw new RuntimeException("주문을 찾을 수 없습니다.");
//        }
//
//        order.cancel();
//    }
//}
