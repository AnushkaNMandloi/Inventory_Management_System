package com.example.IMSApplication.controller;

import com.example.IMSApplication.model.Item;
import com.example.IMSApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    public ItemService itemService;

    @PostMapping("/add")
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }

    @GetMapping("/email/{email}")
    public Item getItemByEmail(@PathVariable String email){
        return itemService.findByEmail(email);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

}
