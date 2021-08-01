package model;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private String personalNumber;

    private final String memberId;
    private final List<Boat> boats;

    public Member(String name, String personalNumber, String memberId) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.memberId = memberId;
        boats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Boat> getList() {
        return boats;
    }

    public void addBoat(Boat boat) {
        boats.add(boat);
    }
    public void deleteBoat(Boat boat) {
        boats.remove(boat);
    }
}
