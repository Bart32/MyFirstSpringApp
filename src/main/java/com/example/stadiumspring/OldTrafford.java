package com.example.stadiumspring;

public class OldTrafford implements Stadium {
    private CapacityInterface capacity;
    public OldTrafford(CapacityInterface capacity){
        this.capacity = capacity;
    }
    @Override
    public String getOwnerName() {
        return "Owner: Manchester United";
    }

    @Override
    public String getActualCapacity() {
        return "76000" + capacity.getCapacity();
    }
}
