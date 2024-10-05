package com.brunov.sistemapedidos.config;

import com.brunov.sistemapedidos.entity.Category;
import com.brunov.sistemapedidos.entity.Order;
import com.brunov.sistemapedidos.entity.Product;
import com.brunov.sistemapedidos.entity.User;
import com.brunov.sistemapedidos.enums.OrderStatus;
import com.brunov.sistemapedidos.repository.CategoryRepository;
import com.brunov.sistemapedidos.repository.OrderRepository;
import com.brunov.sistemapedidos.repository.ProductRepository;
import com.brunov.sistemapedidos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");


        List<User> users = Arrays.asList(u1, u2);
        List<Order> orders = Arrays.asList(o1, o2, o3);
        List<Category> categories = Arrays.asList(cat1, cat2, cat3);
        userRepository.saveAll(users);
        orderRepository.saveAll(orders);
        categoryRepository.saveAll(categories);

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat3);
        p2.getCategories().add(cat1);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        productRepository.saveAll(products);
    }
}
