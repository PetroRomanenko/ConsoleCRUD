package ferros.view;

import ferros.controller.LabelController;
import ferros.model.Label;

import java.util.Scanner;

public class LabelView {
    private final LabelController controller = new LabelController();
    private final Scanner scanner = new Scanner(System.in);

    public void createLabel() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Label createdLabel = controller.saveLabel(name);
        System.out.println("Saved label: " + createdLabel);
    }
}
