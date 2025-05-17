package Q1;

import java.util.Objects;

public class ReachOuts {
    private String name;
    private int id;
    private String content;

    // empty constructor
    public ReachOuts() {
    }

    // constructor
    public ReachOuts(String name, int id, String content) {
        this.name = name;
        this.id = id;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ReachOuts reachOuts)) return false;
        return id == reachOuts.id && Objects.equals(content, reachOuts.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "ReachOut: " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", content='" + content + '\'';
    }
}
