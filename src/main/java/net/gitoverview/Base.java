package net.gitoverview;

public class Base {

    private long id;

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
