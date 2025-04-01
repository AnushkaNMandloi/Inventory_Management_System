package com.example.IMSApplication.repository;

import com.example.IMSApplication.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.IMSApplication.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByEmail(String email);

    List<Item> findAll();
}
