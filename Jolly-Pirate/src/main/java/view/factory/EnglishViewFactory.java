package view.factory;

import view.*;

public class EnglishViewFactory implements ViewFactory {

    @Override
    public MainMenuView createMainMenuView() {
        return new MainMenuViewEnglishImpl();
    }

    @Override
    public DisplayListView createDisplayListView() {
        return new DisplayListViewEnglishImpl();
    }

    @Override
    public MemberManagementView createMemberManagementView() {
        return new MemberManagementViewEnglishImpl();
    }

    @Override
    public ChangeView createChangeView() {
        return new ChangeViewEnglishImpl();
    }

    @Override
    public BoatManagementView createBoatManagementView() {
        return new BoatManagementViewEnglishImpl();
    }

    @Override
    public InputHandler createInputHandler() {
        return new InputHandlerImpl(
                new DisplayWarningViewEnglishImpl(),
                new EnterPropertyValidatorEnglishImpl()
        );
    }
}
