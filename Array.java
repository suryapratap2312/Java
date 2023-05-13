// Array implementation using Searching Algorithms

package datastructure;
import java.util.Arrays; 

public class Array {
  public int search(int[] array, int value) {
    // 0, 1, 2, 3, 4, 5
    // 1, 5, 2, 8, 7, 3
    for (int i = 0; i < array.length; i++) {
      if(array[i] == value) {
        loc = i; 
        break; 
      }
      
    }
    return loc;
   
  }
 
   public int[] deleteElement(int[] array, int value) {
    // 0, 1, 2, 3, 4, 5, 6
    // 1, 5, 2, 8, 15, 7, 3
    int  loc = search(array, value);
    if (loc >= 0) {
      for(int i = loc + 1; i < array.length; i++) {
        array[i - 1] = array[i];
      }
     
     }
     return Arrays.copyOf(array, array.length - 1);
   
   }
    public void printAllElement(String msg, nt[] arr) {
      System.out.print(msg); 
      for (nt i = 0; i < arr.length; i++) {
        System.out.print(" " + arr[i]); 
      }
      
    // 4,, 15
    public int [] addElement(int[] array, int position, int value) {
      // 0, 1, 2, 3, 4, 5 
      // 1, 5, 2, 8, 7, 3
      int[] result = new int[array.length + 1];
      for (int i = 0; i < position; i++) {
        result[i] = array[i];
      }
      return result; 
      
     }
     
     public static void main(String [] args) {
      // index 0, 1, 2, 3, 4, 5 
      int arr[] = {1, 5, 2, 8, 7, 3} ; 
      System.out.println(arr[3]);
      Array array = new Array();
      
      // Adding new element to the Array 
      array.printAllElement("All Element before adding :: ", arr); 
      arr = array.addElement(arr, 4, 15);
      array.printAllElement(All Element after adding :: ", arr); 
      System.out.println("----------------------------------------------");
      
      // Search element from Array 
      int index = array.search(arr, 100); 
      System.out.println("Value found at :: " + index); 
      System.out.println("----------------------------------------------");
      
      // Delete the element from Array
      array.printAllElement("All Element before delete :: ", arr); 
      arr = array.deleteElement(arr, 7); 
      arrayprintAllElement("All Element after delete :: ", arr); 
      
    }
    
  } 

     }
     
     
        
