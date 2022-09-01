package ferros.repository;

import ferros.model.Label;

import java.util.List;

public interface LabelRepository extends GenericRepository<Label, Integer>{
    @Override
    default void printList(List<Label> list) {

    }
}
