package Lesson14.Comparator;

import java.util.Comparator;

// Comparator to sort fish by name (alphabetical)
class FishNameComparator implements Comparator<Fish> {
    @Override
    public int compare(Fish f1, Fish f2) {
        return f1.getName().compareToIgnoreCase(f2.getName());
    }
}

