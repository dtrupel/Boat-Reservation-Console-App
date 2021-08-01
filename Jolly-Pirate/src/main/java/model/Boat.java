package model;

import java.util.Objects;

public class Boat {

    private final String memberId;
    private final String id;
    private float length;
    private String type;


    public Boat(float length, String memberId, String id) {
        this.length = length;
        this.memberId = memberId;
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getId() {
        return id;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return id.equals(boat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
