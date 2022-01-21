package ArrayList;

class ArrayList_Scratch
{
    //Data Members
    int arr[];

    int currentSize;

    int maximumSize;

    //Constructor, Destructor and Methods
    public ArrayList_Scratch()
    {
        currentSize = 0;
        maximumSize = 1;
        arr = new int[maximumSize];
    }
    public ArrayList_Scratch(int max_size)
    {
        currentSize = 0;
        maximumSize = max_size;
        arr = new int[maximumSize];
    }

    //Add a new element (If Array List is full, double its size)
    public void add(final int data)
    {
        //Two Cases
        //1. ArrayList is Full
        if(currentSize == maximumSize)
        {
            //Create a new array, delete the previous array and then double the capacity of the array
            int oldArr[];
            oldArr = arr;
            maximumSize = 2 * maximumSize;
            arr = new int[maximumSize];

            //Copy the oldArr elements to arr
            for(int i=0;i<currentSize;i++)
            {
                arr[i] = oldArr[i];
            }
            oldArr = null;
        }

        //2. ArrayList is not Full
        arr[currentSize] = data;
        currentSize++;
    }
    
    //Remove last element
    public void remove()
    {
        if (currentSize > 0) {
            currentSize--;
        }
    }

    //Front
    final int front()
    {
        return arr[0];
    }
    
    //Back
    final int back()
    {
        return arr[currentSize - 1];
    }
    
    //Get an element at ith Index
    final int get(final int i)
    {
        return arr[i];
    }

    //Size of the ArrayList
    final int size()
    {
        return currentSize;
    }

    //Capacity of the ArrayList (Actual Memory Allocated)
    final int capacity()
    {
        maximumSize++;
        return maximumSize;
    }

    //Note : All the constant functions will not modify the data members of the class
}