package com.thoughtworks.tdd;

import sun.security.krb5.internal.Ticket;
import java.util.Map;

public class ParkingLot {
    private int capacity;
    private Map<Ticket, Car> storeCars;
    private Manager manager;

    public ParkingLot(int i, int capacity, Map<Ticket, Car> storeCars, Manager manager) {
        this.capacity = capacity;
        this.storeCars = storeCars;
        this.manager = manager;
    }

    public ParkingLot() {

    }

    public boolean isFull() {
        int capacity = 0;
        return storeCars.size() >= capacity;
    }
    public Car parkCar(Car car) {
        if (car == null) {
            System.out.print("请提供您的停车票\n");
            return null;
        }
        for (Ticket ticket : storeCars.keySet()) {
            if (storeCars.get(ticket).equals(car)) {
                System.out.print("这辆车已经停过了\n");
                return null;
            }
        }

        public Car fetchCar (Ticket Object ticket;
        ticket){
            Car fetchCar = null;
            if (ticket == null) {
                System.out.print("未识别的停车单\n");
                return null;
            }
        }

            public void parkCar (Car car){
            }
            public void fetchCar (com.thoughtworks.tdd.Ticket ticket){
            }
            public void getStoreCars () {
            }
            public void setManager (Manager manager){
            }

        
        }

    public boolean getRemainder() {
    }

    public Car fetchCar(Ticket ticket1) {
    }

    public void setManager(Manager manager) {
    }

    public Map<Object, Object> getStoreCars() {
    }

