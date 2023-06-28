package Heap;

public class MinHeap_Array {

    public static void main(String[] args) {
        //index:         0  1   2   3   4   5   6   7   8   9   10  11
        int[] minHeap = {5, 14, 19, 15, 23, 30, 70, 85, 51, 25, 26, 35};

        //elternelement ausrechnen:  (index-1)/2
        //linkes kind ausrechnen:    (index*2)+1
        //rechtes kind ausrechnen:   (index*2)+2

        //swim: von unten bis oben - beim tauschen: es geht so oben bis wann ist kleiner
                                // - beim neu hinzufügen - ich füge nach regeln hinzu, dann gehe auf
        //sink: von oben bis unten - beim tauschen: richtung kleinere zahl
                                // - beim löschen benutzen wir auch - wir nehmen die letzte element als root

        //LAUFZEITEN:
        //suchen: O(1)
        //swim: O(log2n)
        //sink: O(log2n)
        //heap aufbauen: O(n*log2n)
    }
}
