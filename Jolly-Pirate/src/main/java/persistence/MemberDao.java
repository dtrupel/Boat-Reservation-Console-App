package persistence;

import model.Member;

import java.util.List;

public interface MemberDao {

    void create(Member member);
    void update(Member member);
    void delete(Member member);
    List<Member> retrieveAll();
}
