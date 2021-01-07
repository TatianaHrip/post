package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    private PosterManager manager;
    private PosterItem item1 = new PosterItem(1, "first", "http://", "");
    private PosterItem item2 = new PosterItem(2, "second", "http://", "");
    private PosterItem item3 = new PosterItem(3, "third", "http://", "");
    private PosterItem item4 = new PosterItem(4, "fourth", "http://", "");
    private PosterItem item5 = new PosterItem(5, "fifth", "http://", "");
    private PosterItem item6 = new PosterItem(6, "sixth", "http://", "");
    private PosterItem item7 = new PosterItem(7, "seventh", "http://", "");
    private PosterItem item8 = new PosterItem(8, "eigth", "http://", "");
    private PosterItem item9 = new PosterItem(9, "ninth", "http://", "");
    private PosterItem item10 = new PosterItem(10, "tenth", "http://", "");

    private void fillFirstData() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);

    }

    @Test
    void getLastLessOutCount() {
        manager = new PosterManager(5);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);

        PosterItem[] expected = new PosterItem[]{item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.getLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastEqualOutCount() {
        manager = new PosterManager(10);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);

        PosterItem[] allItems = manager.getAll();
        PosterItem[] expected = new PosterItem[allItems.length];
        for (int i = 0; i < allItems.length; i++) {
            expected[i] = allItems[allItems.length - i - 1];
        }

        PosterItem[] actual = manager.getLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMoreOutCount() {
        manager = new PosterManager(3);
        fillFirstData();

        PosterItem[] expected = new PosterItem[]{item10, item9, item8,};
        PosterItem[] actual = manager.getLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void add() {
        manager = new PosterManager(7);
        fillFirstData();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{item1, item2, item3, item4, item5, item6, item7, item8, item9, item10 };

        assertArrayEquals(expected, actual);
    }
}