package view;

import model.Boat;
import model.Member;

public class DisplayListViewEnglishImpl implements DisplayListView {

    @Override
    public void displayCompactList(Iterable<Member> list) {
        System.out.println("\t----------------------------------------");
        for(Member m : list) {
            System.out.println("\tName: "+m.getName() + " " +
                    "Member id: "+m.getMemberId() + " " +
                    "No. of boats: "+m.getList().size());
        }
        System.out.println("\t----------------------------------------");
    }

    @Override
    public void displayVerboseList(Iterable<Member> list) {
        System.out.println("\t----------------------------------------");
        for(Member m : list) {
            System.out.print("\tName:"+m.getName()+" " +
                    "Personal number:"+m.getPersonalNumber()+" " +
                    "Member id:"+m.getMemberId()+" \n");
            for(Boat b : m.getList()) {
                System.out.print("\tBoat id:"+b.getId()+" "+
                        "Type:"+b.getType() +" "+
                        "Length:"+b.getLength() + " m \n");
            }
            System.out.println();
        }
        System.out.println("\t----------------------------------------");
    }
}
