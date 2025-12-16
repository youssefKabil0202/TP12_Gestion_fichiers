package exercice1;

import java.io.Serializable;

public class Record implements Serializable {
    private static int count;
    private int id;
    private String name;
    private double score;

    public Record( String name, double score) {
        this.id = count++;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Record{id=" + id + ", name='" + name + "', score=" + score + "}";
    }
}
