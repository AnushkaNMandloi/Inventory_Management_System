package com.example.IMSApplication.service;


import com.example.IMSApplication.model.Item;

import java.util.List;

public interface ItemService {

    Item addItem(Item item);

    Item getItemById(long id);

    Item findByEmail(String email);

    List<Item> getAllItems();

}
