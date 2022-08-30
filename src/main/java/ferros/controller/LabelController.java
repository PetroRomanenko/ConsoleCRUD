package ferros.controller;

import ferros.model.Label;
import ferros.repository.LabelRepository;
import ferros.repository.gson.JsonLabelRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class LabelController {

    private final LabelRepository labelRepository = new JsonLabelRepositoryImpl();

    public Label saveLabel(String name) {
        Label label = new Label(null, name);
        return labelRepository.save(label);
    }

    public Label findLabelById(Integer id){
        return labelRepository.getById(id);
    }

    public List<Label> showAllLabels(){
        return labelRepository.getAll();
    }
    public Label update(Label label){
        labelRepository.update(label);
     return label;
    }
    public void deleteLabelByID(Integer id){
        labelRepository.deleteById(id);
    }


}
