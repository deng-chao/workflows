package name.dengchao.workflows.utils;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {

    public static <E> ArrayList<E> newArrayList(E... elements) {
        int capacity = elements.length;
        ArrayList<E> list = new ArrayList<>(capacity);
        Collections.addAll(list, elements);
        return list;
    }
}
