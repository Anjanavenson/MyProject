package org.springlearning.MyProject;

import org.springframework.stereotype.Component;

@Component("anjana")
public class InternetConnection{
    private String IpAddress;
    private int speed;

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void switchOn(){
        System.out.println("Switching on the Internet");
    }
}
