package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static sun.nio.cs.Surrogate.is;

public class SmartParkingBoyTest {
    @Test
    public void should_parkToDifferent_lot_when_parkCar_given_several_Car() {
//given
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        parkingLots.add(new ParkingLot(4));
        MostSmartParkingBoy mostSmartParkingBoy = new MostSmartParkingBoy(parkingLots);

//when

        Ticket ticket1 = mostSmartParkingBoy.parkCar(new Car());
        Ticket ticket2 = mostSmartParkingBoy.parkCar(new Car());
        Ticket ticket3 = mostSmartParkingBoy.parkCar(new Car());

//then

        assertNotNull(ticket1);
        assertNotNull(ticket1);
        assertNotNull(ticket3);
        assertThat(mostSmartParkingBoy.getParkingLots().get(0).getStoreCars().size(),is(2));
        assertThat(mostSmartParkingBoy.getParkingLots().get(1).getStoreCars().size(),is(1));
    }

}