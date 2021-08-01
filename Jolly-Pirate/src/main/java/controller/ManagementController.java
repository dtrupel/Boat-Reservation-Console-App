package controller;

import model.*;
import view.BoatManagementView;
import view.InputHandler;
import view.MemberManagementView;

public abstract class ManagementController<T>{

    protected final IdGenerator<T> idGenerator;
    protected final Registry registry;

    protected InputHandler inputHandler;
    protected BoatManagementView boatManagementView;
    protected MemberManagementView memberManagementView;

    protected ManagementController(Registry registry, IdGenerator<T> idGenerator) {
        this.registry = registry;
        this.idGenerator = idGenerator;
    }

    public void setInputHandler(InputHandler inputHandler){
        this.inputHandler = inputHandler;
    }
    public void setBoatManagementView(BoatManagementView boatManagementView) {
        this.boatManagementView = boatManagementView;
    }
    public void setMemberManagementView(MemberManagementView memberManagementView) {
        this.memberManagementView = memberManagementView;
    }

    protected Member decideMember() {
        memberManagementView.displayPromptMemberId();
        String id = inputHandler.getMemberIdInput(MemberIdGenerator.getInstance());
        return registry.getMemberRegistry().retrieve(id);
    }
    protected abstract boolean manage();
    protected abstract void add();
    protected abstract void edit();
    protected abstract void delete();

}
