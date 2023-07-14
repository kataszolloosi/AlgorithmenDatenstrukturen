package UE3_Bookstack;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Main {
    public static void main(String[] args) throws StackEmptyException {
        Bookstack bookStack = new Bookstack();

        assertEquals("leerer Stapel", 0, bookStack.getCount());

        bookStack.push("1984");
        assertEquals("ein Buch", 1, bookStack.getCount());

        bookStack.push("Der kleine Prinz");
        assertEquals("zwei Bücher", 2, bookStack.getCount());

        bookStack.push("Robinson Crusoe");
        assertEquals("drei Bücher", 3, bookStack.getCount());

        bookStack.pop();
        assertEquals("zwei Bücher", 2, bookStack.getCount());

        bookStack.pop();
        assertEquals("ein Buch", 1, bookStack.getCount());

        bookStack.pop();
        assertEquals("leerer Stapel", 0, bookStack.getCount());
    }

    @Test(expected = StackEmptyException.class)
    public void testPopEmptyStack() throws StackEmptyException {
        Bookstack bookStack = new Bookstack();
        bookStack.pop();
    }

    @Test
    public void testFirstBookTitle() {
        Bookstack bookStack = new Bookstack();

        bookStack.push("Nichts als die Wahrheit");
        bookStack.push("Die Physiker");

        Node firstBook = bookStack.getTop();
        assertEquals("Die Physiker", firstBook.getTitel());
    }
}
