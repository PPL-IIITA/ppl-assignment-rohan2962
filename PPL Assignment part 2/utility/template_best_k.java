/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * template to find best k according a given criterion
 *
 * @author rohan
 *
 */
public class template_best_k<T> {

    private ArrayList<T> arr = new ArrayList<>();

    public int size() {
        return arr.size();
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public boolean add(Object e) {
        return arr.add((T) e);
    }

    public boolean remove(Object o) {
        return arr.remove((T) o);
    }

    public void clear() {
        arr.clear();
    }

    public T get(int index) {
        return arr.get(index);
    }

    public Object remove(int index) {
        return arr.remove(index);
    }

    public int indexOf(Object o) {
        return arr.indexOf(o);
    }

    public ListIterator listIterator() {
        return arr.listIterator();
    }

    public List subList(int fromIndex, int toIndex) {
        return arr.subList(fromIndex, toIndex);
    }
/**
 * 
 * @param c comparator
 * @param k parameter
 * @return array of best k items
 */
    public ArrayList<T> best_k(Comparator<? super T> c, int k) {
        Collections.sort(arr, c);
        ArrayList<T> sl = new ArrayList<>();
        int i;
        for (i = 0; i < k; i++) {
            sl.add(arr.get(i));
        }
        return sl;
    }

    public void sort(Comparator<? super T> c) {
        Collections.sort(arr, c);
    }
}
