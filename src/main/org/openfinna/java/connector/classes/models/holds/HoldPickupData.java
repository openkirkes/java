package org.openfinna.java.connector.classes.models.holds;

import java.io.Serializable;

public class HoldPickupData implements Serializable {
    private String pickupLocation;
    private int reservationNumber;

    public HoldPickupData(String pickupLocation, int reservationNumber) {
        this.pickupLocation = pickupLocation;
        this.reservationNumber = reservationNumber;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
}
