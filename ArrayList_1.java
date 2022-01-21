package ArrayList;

import ArrayList.ArrayList_Scratch;

public class ArrayList_1 {

    public static void main(String[] args) 
    {
        ArrayList_Scratch list = new ArrayList_Scratch(5);

        list.add(2);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(19);
        list.remove();

        // System.out.println(list.size()); 
        // System.out.println(list.capacity());
        // System.out.println(list.front());
        // System.out.println(list.back());
        // System.out.println(list.get(2));

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}