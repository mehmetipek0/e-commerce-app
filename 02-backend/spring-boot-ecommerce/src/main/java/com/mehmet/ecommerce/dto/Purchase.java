package com.mehmet.ecommerce.dto;

import com.mehmet.ecommerce.entity.Address;
import com.mehmet.ecommerce.entity.Customer;
import com.mehmet.ecommerce.entity.Order;
import com.mehmet.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
