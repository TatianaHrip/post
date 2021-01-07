package ru.netology.manager;

import ru.netology.domain.PurchaseItem;
import ru.netology.domain.PosterItem;


public class PosterManager {
    private PosterItem[] items = new PosterItem[0];
    private int outItemCount = 10;

    public PosterManager() {
    }

    public PosterManager(int outItemCount) {
        if (outItemCount >= 0) {
            this.outItemCount = outItemCount;
        }
    }

    public PosterItem[] getLast() {
        int count = items.length > outItemCount ? outItemCount : items.length;
        PosterItem[] result = new PosterItem[count];
        for (int i = 0; i < count; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PosterItem[] getAll() {
        return items;
    }

    public void add(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

}

