package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Booking booking1 = new Booking();

        booking1.setDescription("Miete");
        booking1.setAmount(500.00);

//        dll.addBookingToLastPos(booking1);
//        System.out.println("Last: "+dll.getLast().getBooking().getDescription());
//
//        Booking booking2 = new Booking();
//        booking2.setDescription("Einkauf");
//        booking2.setAmount(36.12);
//        dll.addBookingToLastPos(booking2);
//        System.out.println("Last: "+dll.getLast().getBooking().getDescription());

        dll.addBookingAtIndex(0, booking1);
        System.out.println("First: " + dll.getFirst().getBooking().getDescription() + "\n");

        Booking booking2 = new Booking();
        booking2.setDescription("Einkauf");
        booking2.setAmount(36.12);

        dll.addBookingAtIndex(0, booking2);
        System.out.println("(B) First: " + dll.getFirst().getBooking().getDescription());
        System.out.println("(B) Last: " + dll.getLast().getBooking().getDescription() + "\n");

        //in der mitte einfügen
        Booking booking3 = new Booking();
        booking3.setDescription("Tanken");
        booking3.setAmount(85.52);
        dll.addBookingAtIndex(1, booking3);
        System.out.println("(C) First: " + dll.getFirst().getBooking().getDescription());
        System.out.println("(C) Last: " + dll.getLast().getBooking().getDescription() + "\n");

        //am ende einfügen
        Booking booking4 = new Booking();
        booking4.setDescription("Hotel");
        booking4.setAmount(85.52);
        dll.addBookingAtIndex(3, booking4);
        System.out.println("(D) First: " + dll.getFirst().getBooking().getDescription());
        System.out.println("(D) Last: " + dll.getLast().getBooking().getDescription() + "\n");

        //zu große index vervenden
        Booking booking5 = new Booking();
        booking5.setDescription("Autoreparatur");
        booking5.setAmount(1236);
        dll.addBookingAtIndex(100, booking5);
        System.out.println("(E) First: " + dll.getFirst().getBooking().getDescription());
        System.out.println("(E) Last: " + dll.getLast().getBooking().getDescription() + "\n");

    }
}
