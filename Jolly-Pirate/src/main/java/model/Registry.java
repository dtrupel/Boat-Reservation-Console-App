package model;

public class Registry {

    private static Registry registry;

    private final MemberRegistry memberRegistry;
    private final BoatRegistry boatRegistry;

    private Registry() {
        memberRegistry = new MemberRegistry();
        boatRegistry = new BoatRegistry();
    }

    public static synchronized Registry getInstance() {
        if(registry == null)
            registry = new Registry();
        return registry;
    }
    public DataRegistry<Member> getMemberRegistry() {
        return memberRegistry;
    }

    public DataRegistry<Boat> getBoatRegistry() {
        return boatRegistry;
    }

    public void loadDataOnStart() {
        for(Member m : memberRegistry.getAll()) {
            for(Boat b : boatRegistry.getAll()) {
                if(m.getMemberId().equals(b.getMemberId()))
                    m.addBoat(b);
            }
        }
    }
    public void saveDataOnExit() {
        memberRegistry.saveDataOnExit();
        boatRegistry.saveDataOnExit();
    }
}
