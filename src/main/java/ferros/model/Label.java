package ferros.model;

public class Label {
    private  int id=0;
    private String name;

    public Label() {
    }

    public Label (int id, String name) {
        this.id=id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
