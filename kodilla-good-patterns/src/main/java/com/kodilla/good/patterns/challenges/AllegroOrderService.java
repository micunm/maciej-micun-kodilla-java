package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class AllegroOrderService implements ProductOrderService {
    @Override
    public boolean process(OrderRequest orderRequest) {
        Random random=new Random();
        return random.nextBoolean();
    }
}
