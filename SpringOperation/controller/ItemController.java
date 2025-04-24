package com.MainProject.SpringOperation.controller;

import com.MainProject.SpringOperation.entity.ItemTab;
import com.MainProject.SpringOperation.service.ItemService;
import jakarta.persistence.PersistenceUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Get all items
    @GetMapping
    public List<ItemTab> getAllItems() {
        return itemService.getAllItems();
    }

    // Get item by ID
    @GetMapping("/{itemId}")
    public ResponseEntity<ItemTab> getItemById(@PathVariable Integer itemId) {
        Optional<ItemTab> item = itemService.getItemById(itemId);
        if (item.isPresent()) {
            return ResponseEntity.ok(item.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add a new item
    @PostMapping
    public ItemTab createItem(@RequestBody ItemTab item) {
        return itemService.saveItem(item);
    }

    // Delete an item
    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable Integer itemId) {
        itemService.deleteItem(itemId);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/put")
    public String putItem() {

        return "This is PUT Method";
    }
    @GetMapping("/get")
    public String getItem() {

        return "This is GET Method";
    }
    @DeleteMapping("/del")
    public String delItem() {

        return "This is Delete Method";
    }
    @PostMapping("/post")
    public String postItem() {

        return "This is POST Method";
    }
    // Get items by category
    @GetMapping("/category/{categoryName}")
    public List<ItemTab> getItemsByCategory(@PathVariable String categoryName) {
        return itemService.getItemsByCategory(categoryName);
    }
}
