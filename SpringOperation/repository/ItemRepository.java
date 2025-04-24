package com.MainProject.SpringOperation.repository;

import com.MainProject.SpringOperation.entity.ItemTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemTab, Integer> {
    List<ItemTab> findByCategoryIgnoreCase(String categoryName);
}
