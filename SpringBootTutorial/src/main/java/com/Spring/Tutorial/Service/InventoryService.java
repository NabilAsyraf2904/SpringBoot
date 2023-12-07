package com.Spring.Tutorial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Tutorial.Entity.InventoryEntity;
import com.Spring.Tutorial.Repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private final InventoryRepository Inv;
	
	
    public InventoryService(InventoryRepository Inv) {
        this.Inv = Inv;
    }

    public void saveUser(InventoryEntity inv) {
        Inv.save(inv);
    }

}
