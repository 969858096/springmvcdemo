package array;

import java.util.Objects;

/**
 * @FileName: ArrayList
 * @Description:
 * @AuthOr: lsp
 * @Date: 2019/12/7 17:56
 */
public class ArrayList<E> {
    private int size;
    private E[] elements;
    private static final int DEFAULT_SIZE = 10;
    private static final int ELEMENT_NOT_FOUND = -1;

    public ArrayList(int capacity) {
        elements = (E[]) new Objects[capacity];
    }

    public ArrayList(){
        this(DEFAULT_SIZE);
    }

    /**
     * 元素的数量
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 清除所有元素
     */
    public void clear(){
        size = 0;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        return size ==0 ? true:false;
    }


    /**
     * 获取index位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("数组越界");
        }else {
            return  elements[index];
        }
    }

    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    public int indexOf(E element){
        if (element == null){
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (elements[i] == element){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E e){
        return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    public E set(int index,E element){
        rangeCheck(index);
        E oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }
}
