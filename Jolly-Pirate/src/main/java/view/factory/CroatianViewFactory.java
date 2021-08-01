package view.factory;

import view.*;

public class CroatianViewFactory implements ViewFactory {
    @Override
    public MainMenuView createMainMenuView() {
        return new  MainMenuViewCroatianImpl();
    }

    @Override
    public DisplayListView createDisplayListView() {
        return new DisplayListViewCroatianImpl();
    }

    @Override
    public MemberManagementView createMemberManagementView() {
        return new MemberManagementViewCroatianImpl();
    }

    @Override
    public ChangeView createChangeView() {
        return new ChangeViewCroatianImpl();
    }

    @Override
    public BoatManagementView createBoatManagementView() {
        return new BoatManagementViewCroatianImpl();
    }

    @Override
    public InputHandler createInputHandler() {
        return new InputHandlerImpl(
                new DisplayWarningViewCroatianImpl(),
                new EnterPropertyValidatorCroatianImpl()
        );
    }
}
