package pset3;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 2, section 2.5, page 86

// Modified by August Shi for Problem Set 3 in EE360T, Spring 2021

public class Queue
{ // Overview:  a Queue is a mutable, bounded FIFO data structure
  // of fixed size  (size is 10, for this exercise).
  // A typical Queue is [], [o1], [o1, o2], etc., where no elements
  // are ever non-positive.  Older elements are listed before newer ones.
  // Specifically, elements will be postive integers.
  private int[] elements;
  private int size, front, back;
  private static final int capacity = 10;

  public Queue ()
  {
     elements = new int [capacity];
     size  = 0; front = 0; back  = 0;
  }

  public void enqueue (int i)
  {  // Modifies: this
     // Effects:   If this is full or i is not positive, do nothing
     // else make i the newest element of this
     if (size == capacity || i <= 0)
        return;
     else
     {
        size++;
        elements [back] = i;
        back = (back+1) % capacity;
     }
  }

  public int dequeue ()
  {  // Modifies: this
     // Effects:   If queue is empty, return -1,
     // else remove and return oldest element of this
  
     if (size == 0)
        return -1;
     else
     {
        size--;
        int i = elements [ (front % capacity) ];
        elements [front] = 0;
        front = (front+1) % capacity;
        return i;
     }
  }

  public boolean isEmpty()
  { 
     return (size == 0); 
  }

  public boolean isFull() 
  { 
     return (size == capacity); 
  }

  public String toString()
  {
     String result = "[";
     for (int i = 0; i < size; i++)
     {
        result += Integer.toString(elements[ (front + i) % capacity ]);
        if (i < size -1) {
           result += ", ";
        }
     }
     result += "]";
     return result;
  }

}
