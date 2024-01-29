package org.contratssb.contratssb.domain;

import java.util.Date;

public class Contract {
    public String Name;
    public  int id;
    public int id_entreprise;
    public Date StartDate;
    public Date EndDate;
    public Date LastInter;
    public Date NextInter;
    public String Description;
    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Getter and Setter for startDate
    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        this.StartDate = StartDate;
    }
    // Getter and Setter for endDate
    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    // Getter and Setter for LastInter
    public Date getLastInter() {
        return LastInter;
    }

    public void setLastInter(Date LastInter) {
        this.LastInter = LastInter;
    }
    // Getter and Setter for NextInter
    public Date getNextInter() {
        return NextInter;
    }

    public void setNextInter(Date NextInter) {
        this.NextInter = NextInter;
    }
    // Getter and Setter for Description
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
