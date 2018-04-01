package com.berning.immoverwaltung.models;
import com.berning.immoverwaltung.models.Definitions.*;

public class RentalProperty {
    private int id;
    private String name;
    private RentalObjectStatus status;
    private boolean isTaxable;
    private boolean isWithLight;
    private float roomSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RentalObjectStatus getStatus() {
        return status;
    }

    public void setStatus(RentalObjectStatus status) {
        this.status = status;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public float getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(float roomSize) {
        this.roomSize = roomSize;
    }

    public boolean isWithLight() {
        return isWithLight;
    }

    public void setWithLight(boolean withLight) {
        isWithLight = withLight;
    }
}
