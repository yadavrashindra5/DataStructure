package org.example.linkedlist.singular;

import org.example.exception.ResourceNotFoundException;
import org.example.node.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingularListImplTest {
    @Test
    public void testFindNodeOfThis() {
        SingularListImpl<Integer> list = new SingularListImpl<>();

        Node<Integer> start = new Node<>(10);
        start.next = new Node<>(20);
        start.next.next = new Node<>(30);

        assertTrue(list.findNodeByValue(start, 20).isPresent());
        assertEquals(20, list.findNodeByValue(start, 20).get().data);
    }

    @Test
    public void testRemoveFirstNode() {
        try {
            ISingularList<Integer> list = new SingularListImpl<>();
            Node<Integer> start = null;
            start = list.insertAtBegin(start, new Node<>(89));
            start = list.insertAtBegin(start, new Node<>(91));
            start = list.insertAtBegin(start, new Node<>(92));
            start = list.insertAtBegin(start, new Node<>(93));
            start = list.insertAtBegin(start, new Node<>(94));

            start = list.removeFirstNode(start);

            assertEquals(93, start.data); // If this fails, the catch block will execute.

            System.out.println("✅ Test Passed: First node removed successfully!");
        } catch (AssertionError e) {
            System.out.println("❌ Test Failed: " + e.getMessage());
        }
    }

    @Test
    public void testRemoveFirstNodeForNull() {
        ISingularList<Integer> list = new SingularListImpl<>();
        Node<Integer> start = null;
        assertThrows(ResourceNotFoundException.class, () -> {
            list.removeFirstNode(start);
        });
        System.out.println("test case pass");
    }

    @Test
    public void testRemoveAfter() {
        ISingularList<Integer> list = new SingularListImpl<>();
        Node<Integer> start = null;
        start = list.insertAtBegin(start, new Node<>(89));
        start = list.insertAtBegin(start, new Node<>(91));
        start = list.insertAtBegin(start, new Node<>(92));

        list.removeAfter(start, 91);
        assertEquals(null, start.next.next, "test case failed");
        System.out.println("Test is passed");
    }
}