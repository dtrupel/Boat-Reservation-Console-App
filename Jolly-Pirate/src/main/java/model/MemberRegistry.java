package model;

import persistence.MemberDao;
import persistence.MemberDaoImpl;

import java.util.List;

public class MemberRegistry implements DataRegistry<Member>, SaveOnExit{

    private final List<Member> members;
    private final MemberDao memberDao;

    public MemberRegistry() {
        memberDao = new MemberDaoImpl();
        members = memberDao.retrieveAll();
    }

    // --- In-memory storage (Implements DataRegistry) --- ///
    @Override
    public void add(Member member) {
        members.add(member);
    }
    @Override
    public void delete(Member member) {
        members.remove(member);
    }
    @Override
    public Member retrieve(String id) {
        for (Member m : members) {
            if (id.equals(m.getMemberId()))
                return m;
        }
        return null;
    }
    @Override
    public List<Member> getAll() {
        return members;
    }
    @Override
    public boolean isEmpty() {
        return members.size() == 0;
    }

    // --- Updating database (Implements SaveOnExit) --- //
    @Override
    public void deleteAll() {
        for(Member dbMember : memberDao.retrieveAll()) {
            boolean flag = false;
            for(Member inMemoryMember : members) {
                if (dbMember.getMemberId().equals(inMemoryMember.getMemberId())) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                memberDao.delete(dbMember);
        }
    }

    @Override
    public void createAll() {
        for(Member inMemoryMember : members) {
            boolean flag = false;
            for(Member dbMember : memberDao.retrieveAll()) {
                if (inMemoryMember.getMemberId().equals(dbMember.getMemberId())) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                memberDao.create(inMemoryMember);
        }
    }
    @Override
    public void updateAll() {
        for(Member dbMember : memberDao.retrieveAll()) {
            boolean flag = false;
            for(Member inMemoryMember : members) {
                if (dbMember.equals(inMemoryMember)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                memberDao.update(dbMember);
        }
    }
    @Override
    public void saveDataOnExit() {
        deleteAll();
        createAll();
        updateAll();
    }
}
