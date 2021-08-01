package controller;

import model.*;
import view.BoatManagementView;

public class BoatManagementController extends ManagementController<Boat> {

    public BoatManagementController(Registry registry, IdGenerator<Boat> generator) {
        super(registry,generator);
    }

    public boolean manage() {
        boatManagementView.displayOptions();
        String choice = inputHandler.getInput();
        if(boatManagementView.getBoatManagementInputValidator().isChoiceAddBoat(choice))
            add();
        else if(boatManagementView.getBoatManagementInputValidator().isChoiceEditBoat(choice))
            edit();
        else if(boatManagementView.getBoatManagementInputValidator().isChoiceDeleteBoat(choice))
            delete();

        return !boatManagementView.getBoatManagementInputValidator().isChoiceGoBack(choice);
    }

    protected void add() {
        Member member = decideMember();
        Boat boat = new Boat(0, member.getMemberId(),
                idGenerator.generateId(registry.getBoatRegistry().getAll()));
        setBoatLength(boat);
        setBoatType(boat);
        addAndConfirm(member, boat);
    }

    protected void edit() {
        if(registry.getBoatRegistry().isEmpty()) {
            boatManagementView.displayNoBoats();
            return;
        }
        Boat boat = decideBoat();
        editAndConfirm(boat);
    }

    protected void delete() {
        if(registry.getBoatRegistry().isEmpty()) {
            boatManagementView.displayNoBoats();
            return;
        }
        Boat boat = decideBoat();
        deleteAndConfirm(boat);
    }


    private Boat decideBoat() {
        boatManagementView.displayPromptBoatId();
        String id = inputHandler.getBoatIdInput(idGenerator);
        return registry.getBoatRegistry().retrieve(id);
    }

    private void addAndConfirm(Member member, Boat boat) {
        registry.getBoatRegistry().add(boat);
        member.addBoat(boat);
        boatManagementView.displayBoatCreated();
    }

    private void deleteAndConfirm(Boat boat) {
        registry.getMemberRegistry().retrieve(boat.getMemberId()).deleteBoat(boat);
        registry.getBoatRegistry().delete(boat);
        boatManagementView.displayBoatDeleted();
    }

    private void editAndConfirm(Boat boat) {
        setBoatLength(boat);
        setBoatType(boat);
        boatManagementView.displayBoatEdited();
    }

    private void setBoatLength(Boat b){
        boatManagementView.displayPromptBoatLength();
        b.setLength(Float.parseFloat(inputHandler.getBoatLengthInput()));
    }

    private void setBoatType(Boat b){
        boatManagementView.displayOfferBoatType();
        String choice;
        do {
            choice = inputHandler.getBoatTypeInput();
            if(boatManagementView.getBoatManagementInputValidator().isChoiceCruiser(choice))
                b.setType(Type.Cruiser.toString());
            if(boatManagementView.getBoatManagementInputValidator().isChoiceMotorsailer(choice))
                b.setType(Type.Motorsailer.toString());
            if(boatManagementView.getBoatManagementInputValidator().isChoiceSportfish(choice))
                b.setType(Type.Sportfish.toString());
        }while(!boatManagementView.getBoatManagementInputValidator().isChoiceValid(choice));
    }

    public void setBoatManagementView(BoatManagementView boatManagementView) {
        this.boatManagementView = boatManagementView;
    }
}
