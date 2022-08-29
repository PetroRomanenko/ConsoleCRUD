package ferros.reository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ferros.model.Label;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonLabelRepositoryImpl implements LabelRepository{

    @Override
    public Label getById(Integer id) {
        List<Label> labelList =getAll();
       for(Label label: labelList){
           if(label.getId()==id)
               return label;
       }
        return null;
    }

    @Override
    public List<Label> getAll() {
        List<Label> labelList;
        Gson gson = new Gson();
        File file = new File("src/main/resources/labels.json");
        try {
            FileReader fileReader = new FileReader(file);
            Type typeOfList =  new TypeToken<ArrayList<Label>>(){}.getType();
            labelList= gson.fromJson(fileReader,typeOfList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return labelList;
    }

    @Override
    public Label save(Label label) {
       List<Label> labelList = getAll();
       labelList.add(label);
       Gson gson = new Gson();
       Type typeOfLabelList = new TypeToken<ArrayList<Label>>(){}.getType();
       String json = gson.toJson(labelList,typeOfLabelList);

        File file = new File("src/main/resources/labels.json");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    @Override
    public Label update(Label label) {
        List<Label> labelList = getAll();
        for (Label labelItr : labelList) {
            if(labelItr.getId()==label.getId()){
                labelItr.setName(label.getName());
            }
        }
        Gson gson = new Gson();

        Type typeOfLabelList = new TypeToken<ArrayList<Label>>(){}.getType();
        String json = gson.toJson(labelList,typeOfLabelList);

        File file = new File("src/main/resources/labels.json");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    @Override
    public void deleteById(Integer id) {

        List<Label> labelList = getAll();
        labelList.removeIf(label -> label.getId() == id);

        Gson gson = new Gson();

        Type typeOfLabelList = new TypeToken<ArrayList<Label>>(){}.getType();
        String json = gson.toJson(labelList,typeOfLabelList);

        File file = new File("src/main/resources/labels.json");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
