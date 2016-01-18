package lesson8.fileSystem;

public abstract class File {
    private String name;
    private String type;

    protected File() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "    type='" + type + '\'' +
                " name='" + name + '\'';
    }
}
