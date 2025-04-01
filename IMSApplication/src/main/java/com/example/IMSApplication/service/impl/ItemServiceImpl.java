package com.example.IMSApplication.service.impl;

import com.example.IMSApplication.model.Item;
import com.example.IMSApplication.repository.ItemRepository;
import com.example.IMSApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    //add item
    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    //get item by email
    @Override
    public Item getItemById(long id) {
        return itemRepository.findById(id).orElse(null);
    }

    //get item by id
    @Override
    public Item findByEmail(String email) {
        return itemRepository.findByEmail(email);
    }

    //get all items
    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
