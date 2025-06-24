package vn.quangit.laptopshop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.quangit.laptopshop.domain.Order;
import vn.quangit.laptopshop.domain.User;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order,Long>{
    Order findById(long id);
    List<Order> findByUser(User user);
    Page<Order> findAll(Pageable pageable);
    
}
