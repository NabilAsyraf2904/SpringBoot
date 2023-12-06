package com.Spring.Tutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timesheet")
public class InventoryEntity {
	
	@Id
	private int TimesheetID;
	private int UserID;
    private int StatusID;
    private String Project;
    private String Task;
    private String DateFrom;
    private String DateTo;
    
    public InventoryEntity(int TimesheetID, int UserID, int StatusID, String Project, String Task, String DateFrom, String DateTo) {
    	super();
    	this.TimesheetID = TimesheetID;
    	this.UserID = UserID;
    	this.StatusID = StatusID;
    	this.Project = Project;
    	this.Task = Task;
    	this.DateFrom = DateFrom;
    	this.DateTo = DateTo;
    }
    
    public InventoryEntity() {
    	
    }

	public int getTimesheetID() {
		return TimesheetID;
	}

	public void setTimesheetID(int timesheetID) {
		TimesheetID = timesheetID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getStatusID() {
		return StatusID;
	}

	public void setStatusID(int statusID) {
		StatusID = statusID;
	}

	public String getProject() {
		return Project;
	}

	public void setProject(String project) {
		Project = project;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}

	public String getDateFrom() {
		return DateFrom;
	}

	public void setDateFrom(String dateFrom) {
		DateFrom = dateFrom;
	}

	public String getDateTo() {
		return DateTo;
	}

	public void setDateTo(String dateTo) {
		DateTo = dateTo;
	}

}
