package OOD.leetcode;

import java.util.ArrayList;
import java.util.Comparator;

public class CompareDucks {

    public void sortByAllFields(ArrayList<Duck> ducks){
        Comparator<Duck> sortById = Comparator.comparingInt(Duck::getId);
        Comparator<Duck> sortByWeight = Comparator.comparingInt(Duck::getWeight);
        Comparator<Duck> sortByName = Comparator.comparing(Duck::getName);
        ducks.stream().sorted(
            sortById
            .thenComparing(sortByWeight)
            .thenComparing(sortByName)
        )
        .forEach(duck -> System.out.println(duck));
    }
}
