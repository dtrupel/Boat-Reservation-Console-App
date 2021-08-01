package view.factory;

import view.*;

public interface ViewFactory {

    MainMenuView createMainMenuView();
    DisplayListView createDisplayListView();
    MemberManagementView createMemberManagementView();
    ChangeView createChangeView();
    BoatManagementView createBoatManagementView();
    InputHandler createInputHandler();

}
