package com.MainProject.SpringOperation.service;

import com.MainProject.SpringOperation.entity.ItemTab;
import com.MainProject.SpringOperation.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemTab> getAllItems() {
        return itemRepository.findAll(); // Returns a list of all items
    }

    public Optional<ItemTab> getItemById(Integer itemId) {
        return itemRepository.findById(itemId); // Get item by ID
    }

    public ItemTab saveItem(ItemTab item) {
        return itemRepository.save(item); // Save new or updated item
    }

    public void deleteItem(Integer itemId) {
        itemRepository.deleteById(itemId); // Delete item by ID
    }

    public List<ItemTab> getItemsByCategory(String categoryName) {
        return itemRepository.findByCategoryIgnoreCase(categoryName); // Get items by category
    }
}
