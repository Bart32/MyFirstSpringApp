package com.example.stadiumspring;

public class CampNou implements Stadium {
    private CapacityInterface capacity;
    public CampNou(CapacityInterface capacity){
        this.capacity = capacity;
    }

    @Override
    public String getOwnerName() {
        return "Owner: FC Barcelona";
    }

    @Override
    public String getActualCapacity() {
        return "99 354 " + capacity.getCapacity();
    }
}