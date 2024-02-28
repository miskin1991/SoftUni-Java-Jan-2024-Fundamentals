package Exercises.ObjectsAndClassesExercise._02_Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void Rename(String title) {
        this.title = title;
    }

    public void Edit(String content) {
        this.content = content;
    }

    public void ChangeAuthor(String author) {
        this.author = author;
    }

    @Override public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }
}
