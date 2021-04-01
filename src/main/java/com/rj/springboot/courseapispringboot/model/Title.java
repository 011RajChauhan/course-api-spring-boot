package com.rj.springboot.courseapispringboot.model;

import java.util.Objects;

public class Title {

    private String id;
    private String title;
    private String description;

    public Title() {
    }

    public Title(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title course = (Title) o;
        return Objects.equals(id, course.id) &&
                Objects.equals(title, course.title) &&
                Objects.equals(description, course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
