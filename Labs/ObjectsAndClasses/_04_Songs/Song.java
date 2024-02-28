package Labs.ObjectsAndClasses._04_Songs;

public class Song {
    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    private final String typeList;
    private final String name;
    private final String time;
    public Song(String type, String name, String time) {
        this.typeList = type;
        this.name = name;
        this.time = time;
    }
}
