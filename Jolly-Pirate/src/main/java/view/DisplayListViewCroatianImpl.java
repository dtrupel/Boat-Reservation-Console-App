package view;

import model.Boat;
import model.Member;

public class DisplayListViewCroatianImpl implements  DisplayListView{

    @Override
    public void displayCompactList(Iterable<Member> list) {
        System.out.println("\t----------------------------------------");
        for(Member m : list) {
            System.out.println("\tId broj: "+m.getMemberId() + " " +
                    "Ime: "+m.getName() + " " +
                    "Broj brodova: "+m.getList().size());
        }
        System.out.println("\t----------------------------------------");
    }

    @Override
    public void displayVerboseList(Iterable<Member> list) {
        System.out.println("\t----------------------------------------");
        for(Member m : list) {
            System.out.print("\tOsobni broj:"+m.getPersonalNumber()+" "+
                    "Ime:"+m.getName()+" " +
                    "Id broj :"+m.getMemberId()+" \n");
            for(Boat b : m.getList()) {
                System.out.print("\tId broda:"+b.getId()+" "+
                        "Tip:"+b.getType() +" "+
                        "Dužina:"+b.getLength() + " feet \n");
            }
            System.out.println();
        }
        System.out.println("\t----------------------------------------");
    }
}
