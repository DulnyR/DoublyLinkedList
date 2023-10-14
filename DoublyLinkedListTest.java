package csu22011_a2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for Doubly Linked List
 *
 *  @author  
 *  @version 13/10/16 18:15
 */
@RunWith(JUnit4.class)
public class DoublyLinkedListTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
      new DoublyLinkedList<Integer>();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check if the insertBefore works
     */
    @Test
    public void testInsertBefore()
    {
        // test non-empty list
        DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(0,1);
        testDLL.insertBefore(1,2);
        testDLL.insertBefore(2,3);

        testDLL.insertBefore(0,4);
        assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", "4,1,2,3", testDLL.toString() );
        testDLL.insertBefore(1,5);
        assertEquals( "Checking insertBefore to a list containing 4 elements at position 1", "4,5,1,2,3", testDLL.toString() );
        testDLL.insertBefore(2,6);       
        assertEquals( "Checking insertBefore to a list containing 5 elements at position 2", "4,5,6,1,2,3", testDLL.toString() );
        testDLL.insertBefore(-1,7);        
        assertEquals( "Checking insertBefore to a list containing 6 elements at position -1 - expected the element at the head of the list", "7,4,5,6,1,2,3", testDLL.toString() );
        testDLL.insertBefore(7,8);        
        assertEquals( "Checking insertBefore to a list containing 7 elemenets at position 8 - expected the element at the tail of the list", "7,4,5,6,1,2,3,8", testDLL.toString() );
        testDLL.insertBefore(700,9);        
        assertEquals( "Checking insertBefore to a list containing 8 elements at position 700 - expected the element at the tail of the list", "7,4,5,6,1,2,3,8,9", testDLL.toString() );

        // test empty list
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(0,1);        
        assertEquals( "Checking insertBefore to an empty list at position 0 - expected the element at the head of the list", "1", testDLL.toString() );
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(10,1);        
        assertEquals( "Checking insertBefore to an empty list at position 10 - expected the element at the head of the list", "1", testDLL.toString() );
        testDLL = new DoublyLinkedList<Integer>();
        testDLL.insertBefore(-10,1);        
        assertEquals( "Checking insertBefore to an empty list at position -10 - expected the element at the head of the list", "1", testDLL.toString() );
     }

     @Test 
     public void testDeleteAt()
     {
      DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
      testDLL.insertBefore(0,1);
      testDLL.insertBefore(1,2);
      testDLL.insertBefore(2,3);
      testDLL.insertBefore(0,4);
      assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", "4,1,2,3", testDLL.toString() );

      testDLL.deleteAt(-4);
      assertEquals( "Checking deleteAt to a list containing 4 elements at position -4", "4,1,2,3", testDLL.toString() );
      testDLL.deleteAt(97);
      assertEquals("Checking deleteAt to a list containing 4 elements at position 97", "4,1,2,3", testDLL.toString() );
      testDLL.deleteAt(2);
      assertEquals("Checking deleteAt to a list containing 4 elements at position 2", "4,1,3", testDLL.toString() );
     }

     @Test 
     public void testReverse()
     {
      DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
      testDLL.insertBefore(0,1);
      testDLL.insertBefore(1,2);
      testDLL.insertBefore(2,3);
      testDLL.insertBefore(0,4);
      testDLL.insertBefore(2,5);
      assertEquals( "Checking insertBefore to a list containing 4 elements at position 2", "4,1,5,2,3", testDLL.toString() );

      testDLL.reverse();
      assertEquals( "Checking insertBefore to a list containing 4 elements", "3,2,5,1,4", testDLL.toString() );
     }

     @Test
     public void testMakeUnique()
     {
      DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
      testDLL.insertBefore(0,1);
      testDLL.insertBefore(1,2);
      testDLL.insertBefore(2,3);
      testDLL.insertBefore(0,4);
      testDLL.insertBefore(2,4);
      testDLL.insertBefore(0,3);
      assertEquals( "Checking insertBefore to a list containing 5 elements", "3,4,1,4,2,3", testDLL.toString() );

      testDLL.makeUnique();
      assertEquals("Checking makeUnique to a list containing 6 elements", "3,4,1,2", testDLL.toString());
     }

     @Test
     public void getNode()
     {
      DoublyLinkedList<Integer> testDLL = new DoublyLinkedList<Integer>();
      assertEquals( "Checking getNode() for an empty DLL", null, testDLL.getNode(0) );
     }

    // TODO: add more tests here. Each line of code in DoublyLinkedList.java should
    // be executed at least once from at least one test.

}

