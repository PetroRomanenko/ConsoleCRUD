package ferros.view;

import ferros.controller.LabelController;
import ferros.reository.*;

import java.util.Scanner;

public class ConsoleRunner {
    BaseView labelView;
    BaseView postView;
    BaseView WriterView;

    private final String damagedDataMessage = "Данные повреждены";

    private final String menuMessage = "Выберете дейстиве: \n" +
            "1. Лейбл \n" +
            "2. Пост:\n" +
            "3. Автор \n" +
            "4. Выход";

//    private Scanner sc = new Scanner(System.in);
//    //create repositories
//    LabelRepository labelRepository = new JsonLabelRepositoryImpl();
//    PostRepository postRepository = new JsonPostRepositoryImpl();
//    WriterRepository writerRepository = new JsonWriterRepositoryImpl();
//
//    //create services
//    LabelService labelService = new
//
//
//    //create controller
//    LabelController labelController = new LabelController();
//    //create views
//
//    labelView = new
}
