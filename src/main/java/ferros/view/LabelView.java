package ferros.view;

import ferros.controller.LabelController;
import ferros.model.Label;

import java.util.Scanner;

public class LabelView {
    MainView mainView = new MainView();
    private final LabelController controller = new LabelController();
    private final Scanner scanner = new Scanner(System.in);

    public void createLabel() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Label createdLabel = controller.saveLabel(name);
        System.out.println("Saved label: " + createdLabel);
    }

    public void findLabelById(){
        System.out.println("Enter ID of desired Label: ");
        Integer lookedId = scanner.nextInt();

        Label findLabel = controller.findLabelById(lookedId);
        System.out.println("Desired Label: " + findLabel);
    }

    public void showAllLabels(){
        System.out.println("All labels: ");
        System.out.println(controller.showAllLabels());
    }

    public void updateLabel() {
        System.out.println("Enter Label id: ");
        Integer updatedLabelID = scanner.nextInt();
        System.out.println("Desired Label: "+ controller.findLabelById(updatedLabelID));


        System.out.println("Change name of Label: ");
        String updatedLabelName = scanner.nextLine();

        Label updatedLabel = new Label(updatedLabelID, updatedLabelName);
        controller.update(updatedLabel);
    }
    public void deleteLabelByID(){
        System.out.println("Enter Label Id: ");
        int deletedLabelID = scanner.nextInt();
        controller.deleteLabelByID(deletedLabelID);
    }

    public void menuChoice() {
        int chose =scanner.nextInt();
        switch (chose){
            case 1:
                createLabel();
                break;
            case  2:
                showAllLabels();
                break;
            case 3:
                findLabelById();
                break;
            case 4:
                updateLabel();
                break;
            case 5:
                deleteLabelByID();
                break;
            case 6:
//                mainView.showMainMenu();
                break;


        }
    }
}
