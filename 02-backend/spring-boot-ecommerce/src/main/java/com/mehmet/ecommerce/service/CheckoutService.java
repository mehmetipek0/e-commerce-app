package com.mehmet.ecommerce.service;

import com.mehmet.ecommerce.dto.Purchase;
import com.mehmet.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
