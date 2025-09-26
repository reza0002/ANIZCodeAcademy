package Lesson14.Comparator;

import java.util.Comparator;

// Comparator to sort fish by weight
class FishWeightComparator implements Comparator<Fish> {
    @Override
    public int compare(Fish f1, Fish f2) {
        return Double.compare(f1.getWeight(), f2.getWeight());
    }
}