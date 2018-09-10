package andersen.com.homeWork4;

import java.util.HashSet;
import java.util.Set;

public class Collections implements Operations  {

    @Override
    public boolean equals(Set a, Set b) {
        return a.equals(b);
    }

    @Override
    public Set union(Set a, Set b) {
        Set<Integer> listFinal = new HashSet<>();
        listFinal.addAll(a);
        listFinal.addAll(b);
        return listFinal;
    }

    @Override
    public Set subtract(Set a, Set b) {
        Set<Integer> subtriction = new HashSet<>();
        subtriction.addAll(a);
        subtriction.removeAll(b);
        return subtriction;
    }

    @Override
    public Set intersect(Set a, Set b) {
        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(a);
        intersection.retainAll(b);
        return intersection;
    }

    @Override
    public Set symmetricSubtract(Set a, Set b) {
        Set<Integer> complementB = new HashSet<>();
        complementB.addAll(b);
        complementB.removeAll(a);

        Set<Integer> complementA = new HashSet<>();
        complementA.addAll(a);
        complementA.removeAll(b);

        Set<Integer> listFinal = new HashSet<>();
        listFinal.addAll(complementB);
        listFinal.addAll(complementA);
        return listFinal;
    }
}

