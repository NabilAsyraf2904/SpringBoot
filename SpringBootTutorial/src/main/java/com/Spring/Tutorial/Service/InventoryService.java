package com.Spring.Tutorial.Service;

import java.util.List;

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
    
    public void deleteById(int timesheetID) {
        Inv.deleteById(timesheetID);
    }
    
    public List<InventoryEntity> getAllTimesheets() {
        return Inv.findAll();
    }

    public InventoryEntity getTimesheetById(int timesheetID) {
        return Inv.findById(timesheetID).orElse(null);
    }

    public void updateTimesheet(InventoryEntity timesheet) {
        if (timesheet != null) {
        	Inv.save(timesheet);
        }
    }

}
