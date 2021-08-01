package controller;

import model.*;
import view.*;
import view.factory.CroatianViewFactory;
import view.factory.EnglishViewFactory;
import view.factory.ViewFactory;

public class Console {

    private ViewFactory viewFactory;

    private MainMenuView mainMenuView;
    private DisplayListView displayListView;
    private MemberManagementView memberManagementView;
    private BoatManagementView boatManagementView;
    private ChangeView changeView;
    private InputHandler inputHandler;

    private final ManagementController<Member> memberManagementController;
    private final ManagementController<Boat> boatManagementController;

    public Console() {
        memberManagementController = new MemberManagementController(Registry.getInstance(),
                MemberIdGenerator.getInstance());
        boatManagementController = new BoatManagementController(Registry.getInstance(),
                BoatIdGenerator.getInstance());
        setupLanguage(new EnglishViewFactory());
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public void run(Registry registry) {
        registry.loadDataOnStart();
        String choice;
        mainMenuView.displayWelcomeMessage();
        do {
            mainMenuView.displayMenuOptions();
            choice = inputHandler.getInput();
            if (mainMenuView.getMainMenuInputValidator().isChoiceDisplayCompact(choice))
                displayListView.displayCompactList(registry.getMemberRegistry().getAll());
            if (mainMenuView.getMainMenuInputValidator().isChoiceDisplayVerbose(choice))
                displayListView.displayVerboseList(registry.getMemberRegistry().getAll());
            if (mainMenuView.getMainMenuInputValidator().isChoiceMemberManagement(choice))
                while (memberManagementController.manage());
            if (mainMenuView.getMainMenuInputValidator().isChoiceBoatManagement(choice))
                while (boatManagementController.manage());
            if (mainMenuView.getMainMenuInputValidator().isChoiceChangeLanguage(choice)) {
                while (!changeLanguage());
            }
        } while (!mainMenuView.getMainMenuInputValidator().isChoiceExit(choice));
        registry.saveDataOnExit();
        System.exit(0);
    }

    private boolean changeLanguage() {
        changeView.displayChangeView();
        String choice = inputHandler.getInput();
        if (changeView.getChangeViewInputValidator().isChoiceCroatian(choice)) {
            setupLanguage(new CroatianViewFactory());
            return true;
        } else if (changeView.getChangeViewInputValidator().isChoiceEnglish(choice)) {
            setupLanguage(new EnglishViewFactory());
            return true;
        }
        return choice.equals("1") || choice.equals("2");
    }

    public void setupLanguage(ViewFactory viewFactory) {
        setupView(viewFactory);
        syncControllersAndLanguage();
    }

    private void setupView(ViewFactory viewFactory) {
        setViewFactory(viewFactory);
        inputHandler = viewFactory.createInputHandler();
        mainMenuView = viewFactory.createMainMenuView();
        displayListView = viewFactory.createDisplayListView();
        memberManagementView = viewFactory.createMemberManagementView();
        boatManagementView = viewFactory.createBoatManagementView();
        changeView = viewFactory.createChangeView();
    }

    private void setViewFactory(ViewFactory viewFactory) {
        this.viewFactory = viewFactory;
    }

    private void syncControllersAndLanguage() {
        memberManagementController.setMemberManagementView(memberManagementView);
        memberManagementController.setInputHandler(inputHandler);
        boatManagementController.setMemberManagementView(memberManagementView);
        boatManagementController.setBoatManagementView(boatManagementView);
        boatManagementController.setInputHandler(inputHandler);
    }
}