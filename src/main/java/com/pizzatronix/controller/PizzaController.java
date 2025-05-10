package com.pizzatronix.controller;

import com.pizzatronix.model.Customer;
import com.pizzatronix.model.Pizza;
import com.pizzatronix.model.Topping;
import com.pizzatronix.repository.CustomerRepository;
import com.pizzatronix.repository.PizzaRepository;
import com.pizzatronix.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private ToppingRepository toppingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public String showOrderForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("customer", new Customer());
        model.addAttribute("toppings", toppingRepository.findAll());
        return "order";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute Pizza pizza, @ModelAttribute Customer customer) {
        customerRepository.save(customer);
        pizza.setCustomer(customer);
        pizzaRepository.save(pizza);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String orderSuccess() {
        return "success";
    }
}