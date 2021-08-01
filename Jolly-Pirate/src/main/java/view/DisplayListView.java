package view;

import model.Member;

public interface DisplayListView {

    void displayCompactList(Iterable<Member> list);
    void displayVerboseList(Iterable<Member> list);
}
