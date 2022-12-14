package ferros.view;

import ferros.controller.LabelController;
import ferros.model.Label;
import ferros.model.PostStatus;

import java.util.Scanner;

public class LabelView  {

    private final Scanner scanner = new Scanner(System.in);
    private final LabelController controller = new LabelController();



    private final String CRUDMassage = "Chose action in Label: \n" +
            "1.Create \n" +
            "2.Show all \n" +
            "3.Show by ID \n" +
            "4.Update \n" +
            "5.Delete \n" +
            "6.Exit to previous menu";
    private final String line = "****************************************";

    public void createLabel() {
        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Label createdLabel = controller.saveLabel(name);
        System.out.println("Saved label: " + createdLabel);
    }

    public void findLabelById() {
        System.out.println("Enter ID of desired Label: ");
        int lookedId = scanner.nextInt();
        scanner.skip("\n");

        Label findLabel = controller.findLabelById(lookedId);
        System.out.println("Desired Label: " + findLabel);
    }

    public void showAllLabels() {
        System.out.println("All labels: ");
        controller.printLabelList(controller.getAllLabels());
    }

    public void updateLabel() {
        System.out.println("Enter Label id: ");
        int updatedLabelID = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Desired Label: " + controller.findLabelById(updatedLabelID));


        System.out.println("Change name of Label: ");
        String updatedLabelName = scanner.nextLine();

        Label updatedLabel = new Label(updatedLabelID, updatedLabelName);
        controller.update(updatedLabel);
    }

    public void deleteLabelByID() {
        System.out.println("Enter Label Id: ");
        int deletedLabelID = scanner.nextInt();
        scanner.skip("\n");
        Label label = controller.findLabelById(deletedLabelID);
        controller.deleteLabelByID(deletedLabelID);
        System.out.println(label + "  successfully deleted");
    }

    public void showMenuMassage() {
        System.out.println(line);
        System.out.println(CRUDMassage);
        System.out.println(line);
    }

    public void menuChoice() {
        int chose;
        do {
            showMenuMassage();
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    createLabel();

                    break;
                case 2:
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

            }
        } while (chose != 6);


    }
}
