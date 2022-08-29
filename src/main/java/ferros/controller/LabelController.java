package ferros.controller;

import ferros.model.Label;

import java.util.Scanner;

public class LabelController {
    //запись лейбла в файл
    static int count = 0;
    Scanner   scanner = new Scanner(System.in);

    public Label saveLabelInFile(){
        System.out.println("Введите название Поста: ");
        count++;
        String str = scanner.nextLine();
        Label label = new Label(1,str);

        return label;
    }

}
