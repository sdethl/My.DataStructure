package OOD.leetcode;

import java.util.Comparator;

public class Duck implements Comparator<Duck> {

    private String name;
    private int weight;
    private int id;

    public Duck(String name, int weight, int id){
        this.name = name;
        this.weight = weight;
        this.id = id;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return name;
    }

//    @Override
//    public int compareTo(Duck o) {
//        return name.compareTo(o.name);
//    }

    @Override
    public int compare(Duck o1, Duck o2){
        Comparator<Duck> d = Comparator.comparing(o -> o.getWeight());
        d = d.thenComparing(o -> o.getName());
        d = d.thenComparing(o -> o.getId());
        return d.compare(o1, o2);
    }

    public int compareName(Duck o1, Duck o2){
        Comparator<Duck> d = Comparator.comparing(o -> o.getName());
        return d.compare(o1, o2);
    }
}
