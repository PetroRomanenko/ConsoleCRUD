package ferros;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ferros.controller.LabelController;
import ferros.model.Label;
import ferros.reository.JsonLabelRepositoryImpl;
import ferros.reository.WriterRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello creator, this is your small step for creating new life in the internet universe \n" +
//                "                ==============LET's OUR PARTY BEGIN==============");
//        System.err.println();
//
//        Writer writer = new OutputStreamWriter(new FileOutputStream("Output.json") , "UTF-8");
//        Gson gson = new GsonBuilder().create();
//
//        // создание лейбла
//        Label label = new Label(2,"Второй лейбл");
//
//         String path = "src/main/resources/labels.json";
//
//         try (PrintWriter out = new PrintWriter(new FileWriter(path))){
//             Gson gson1 = new Gson();
//             String gsonString = gson1.toJson(label);
//                     out.write(gsonString);
//         }catch (Exception e){
//             e.printStackTrace();
//         }

        JsonLabelRepositoryImpl j= new JsonLabelRepositoryImpl();
        System.out.println(j.getAll());
//        System.out.println(j.getById(3));
//        j.save(new Label(8,"Eight"));
//        j.save(new Label(7,"Sevens"));
        Label label = new Label(3,"3");
        j.update(label);
        System.out.println(j.getAll());
//        j.deleteById(7);
//        System.out.println(j.getById(4));
//        System.out.println(j.getAll());



//        LabelController lc = new LabelController();
//        Label label = lc.saveLabelInFile();
//
//        GsonBuilder gsonBuilder = new GsonBuilder();
//
//        gsonBuilder.setPrettyPrinting();
//
//        Gson gson = gsonBuilder.create();
//
//        File jsonFileLabel = new File("C:\\Users\\Petro\\IdeaProjects\\ConsoleCRUD\\src\\main\\resources\\labels.json");
//
//        String gsonString = gson.toJson(label);
//        Files.write(Paths.get("C:\\Users\\Petro\\IdeaProjects\\ConsoleCRUD\\src\\main\\resources\\labels.json"),
//                gsonString.getBytes(), StandardOpenOption.APPEND);
//        try {
//            JsonWriter jsonReader = new JsonWriter(new FileWriter(jsonFileLabel));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
////        try (FileWriter fileWriter = new FileWriter("Лейбл.txt", true);) {
////            fileWriter.write(label);
////        } catch (IOException e) {
////            throw new RuntimeException(e);
        }
    }



