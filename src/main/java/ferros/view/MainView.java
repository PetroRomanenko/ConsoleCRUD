package ferros.view;


import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);
    private final LabelView labelView = new LabelView();

    private final String damagedDataMessage = "Данные повреждены";

    private final String menuMessage = "Chose action: \n" +
            "1. Label \n" +
            "2. Post:\n" +
            "3. Author \n" +
            "4. Exit";

    private final String CRUDMassage = "Chose action: \n"+
            "1.Create \n"+
            "2.Show all \n"+
            "3.Show by ID \n"+
            "4.Update \n"+
            "5.Delete "+
            "6.Exit to previous menu";

    public void showMainMenu() {
        System.out.println(menuMessage);
        int chose = scanner.nextInt();
        if (chose<1&&chose>5){
            System.out.println("Enter again: ");
            chose=scanner.nextInt();
        }
        switch (chose){
            case 1:
                System.out.println(CRUDMassage);
                labelView.menuChoice();
        }
    }



}
