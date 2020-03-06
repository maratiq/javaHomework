package homeWork4;

import java.util.ArrayList;
import java.util.Arrays;

public class MathBox {

    private Number[] numberArray;
    ArrayList<Number> arrayList;

    MathBox(Number[] numberArray) {
        this.numberArray = numberArray;
        this.arrayList = new ArrayList<>(Arrays.asList(numberArray));
    }

    public ArrayList<Number> getArrayList() {
        return arrayList;
    }

    public int summator() {
        int sum = 0;
        for (Number number : arrayList) {
            int temp = (int) number;
            sum += temp;
        }
        return sum;
    }

    public ArrayList<Number> splitter(double divider) {
        for (int i = 0; i < arrayList.size(); i++) {
            double temp = (int) arrayList.get(i) / divider;
            arrayList.set(i, temp);
        }
        return arrayList;
    }

    public ArrayList<Number> removeElement(int element) {
        for (int i = 0; i < arrayList.size(); i ++) {
            if (arrayList.get(i).equals(element)) {
                arrayList.remove(i);
            }
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "numberArray=" + Arrays.toString(numberArray) +
                ", arrayList=" + arrayList +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
