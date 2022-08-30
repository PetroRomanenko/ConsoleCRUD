package ferros.controller;

import ferros.model.Label;
import ferros.repository.LabelRepository;
import ferros.repository.gson.JsonLabelRepositoryImpl;

import java.util.Scanner;

public class LabelController {

    private final LabelRepository labelRepository = new JsonLabelRepositoryImpl();

    public Label saveLabel(String name) {
        Label label = new Label(null, name);
        return labelRepository.save(label);
    }

}
