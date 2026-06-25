package org.example.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void shouldBeEmptyInitially() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldInsertFirstNodeAtHead() {
        list.insertAtHead(10);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(List.of(10), list.toList());
    }

    @Test
    void shouldInsertMultipleNodesAtHead() {
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        assertEquals(3, list.size());
        assertEquals(List.of(30, 20, 10), list.toList());
    }

    @Test
    void shouldInsertNodesAtTail() {
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        assertEquals(3, list.size());
        assertEquals(List.of(10, 20, 30), list.toList());
    }

    @Test
    void shouldInsertAfterNode() {
        list.insertAtTail(10);
        list.insertAtTail(20);

        list.insertAfterNode(15, 10);

        assertEquals(3, list.size());
        assertEquals(List.of(10, 15, 20), list.toList());
    }

    @Test
    void shouldInsertBeforeNode() {
        list.insertAtTail(10);
        list.insertAtTail(20);

        list.insertBeforeNode(15, 20);

        assertEquals(3, list.size());
        assertEquals(List.of(10, 15, 20), list.toList());
    }

    @Test
    void shouldRemoveHead() {
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.removeHead();

        assertEquals(2, list.size());
        assertEquals(List.of(20, 30), list.toList());
    }

    @Test
    void shouldRemoveTail() {
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.removeTail();

        assertEquals(2, list.size());
        assertEquals(List.of(10, 20), list.toList());
    }

    @Test
    void shouldRemoveOnlyElement() {
        list.insertAtHead(10);

        list.removeHead();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(List.of(), list.toList());
    }

    @Test
    void shouldHandleRemoveTailWhenSingleElementExists() {
        list.insertAtHead(10);

        list.removeTail();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(List.of(), list.toList());
    }

    @Test
    void shouldDoNothingWhenRemovingHeadFromEmptyList() {
        list.removeHead();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldDoNothingWhenRemovingTailFromEmptyList() {
        list.removeTail();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldNotInsertAfterMissingNode() {
        list.insertAtTail(10);
        list.insertAtTail(20);

        list.insertAfterNode(15, 99);

        assertEquals(List.of(10, 20), list.toList());
    }

    @Test
    void shouldNotInsertBeforeMissingNode() {
        list.insertAtTail(10);
        list.insertAtTail(20);

        list.insertBeforeNode(15, 99);

        assertEquals(List.of(10, 20), list.toList());
    }
}
