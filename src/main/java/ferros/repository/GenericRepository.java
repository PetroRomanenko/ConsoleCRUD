package ferros.repository;

import java.util.List;

interface GenericRepository <T,ID>{
    T getById(ID id);
    List<T> getAll();
    T save(T t);
    T update(T t);
    void deleteById(ID id);

    void printList(List<T> list);

     boolean isValidId(Integer id);

}
