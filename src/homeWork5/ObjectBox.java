package homeWork5;

import java.util.ArrayList;

public class ObjectBox{

    private ArrayList<Object> objList;

    ObjectBox(ArrayList<Object> objList) {
        this.objList = objList;
    }

    public ArrayList<Object> getObjList() {
        return objList;
    }

    public ArrayList<Object> addObject(Object obj) {
        objList.add(obj);
        return objList;
    }

    public ArrayList<Object> removeObject(Object obj) {
        for (int i = 0; i < objList.size(); i ++) {
            if (objList.get(i).equals(obj)) {
                objList.remove(i);
            }
        }
        return objList;
    }

    public StringBuilder dump() {
        StringBuilder sb = new StringBuilder();
        for (Object s : objList)
        {
            sb.append(s);
            sb.append("\t");
        }
        return sb;
    }


    public static void main(String[] args) {
        ArrayList<Object> objList1 = new ArrayList<>();
        objList1.add(1);
        objList1.add(2);
        objList1.add(3);
        ObjectBox objBox = new ObjectBox(objList1);

        objBox.getObjList();
    }
}
