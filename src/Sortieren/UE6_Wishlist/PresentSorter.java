package Sortieren.UE6_Wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
        // TODO: Implementierung

        for (int i = 1; i < presents.length; i++) {
            for (int j = (i-1); j >= 0; j--) {
                if (presents[j+1].desire < presents[j].desire){
                    Present temp = presents[j+1];
                    presents[j+1] = presents[j];
                    presents[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
