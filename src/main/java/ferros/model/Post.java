package ferros.model;

import java.util.List;
import java.util.Objects;

public class Post {
    private Integer id;
    private String content;
    private Long created;
    private Long updated;
    private List<Label> labels;

    public Post() {
    }

    public Post(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Post(Integer id, String content, Long created, Long updated) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (!Objects.equals(id, post.id)) return false;
        if (!Objects.equals(content, post.content)) return false;
        if (!Objects.equals(created, post.created)) return false;
        return Objects.equals(updated, post.updated);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }
}
