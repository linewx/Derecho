package com.cloudrain.dercho.foundation;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lugan on 5/11/2016.
 */
public class ListTest {

    private List<Integer> intList;

    @Before
    public void setup() {
        intList = new ArrayList<>(Arrays.asList(5,4,3,2,1));
    }

    @Test
    public void removeTest() {
        intList.remove(new Integer(1));
        intList.forEach(System.out::println);
    }
}
