package model;

import java.util.List;
import java.util.Random;

public class MemberIdGenerator implements IdGenerator<Member> {

    private static MemberIdGenerator idGenerator;

    private MemberIdGenerator(){
    }

    public static MemberIdGenerator getInstance() {
        if(idGenerator == null)
            idGenerator = new MemberIdGenerator();
        return idGenerator;
    }

    // --- Member id generation --- //
    @Override
    public boolean idExists(List<Member> members, String id) {
        for (Member member : members) {
            if (member.getMemberId().equals(id))
                return false;
        }
        return true;
    }

    @Override
    public String generateId(List<Member> members) {
        long id = 100_000 + new Random().nextInt(899_999);
        while(idExists(members,String.valueOf(id)))
            id = 100_000 + new Random().nextInt(899_999);
        return String.valueOf(id);
    }
}
