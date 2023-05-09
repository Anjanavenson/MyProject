package org.springlearning.MyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")    // If we want to call the constructor again we should use this.
public class Home {
    public Home(){
        System.out.println("Home");
    }
    //POJO classes
    private String owner;
    private int doorNo;
    @Autowired       // search by type
    @Qualifier("anjana")      // search by name
    private InternetConnection modem;
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public void connect(){
        modem.switchOn();
        System.out.println("Connecting to the Internet");
    }
}
