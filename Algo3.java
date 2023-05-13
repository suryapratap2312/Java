public class Algorithm3 {

  static int count = 0; 
  static int findNumber(in[] collection, int start, int end, int x) {
  
    count++; 
    if (end >= start) {
      int mid = start + (end - start) / 2; 
      if (collection[mid] == x) 
        return mid; 
      if (collection [mid] > x)
        return findNumber(collection, start, mid - 1, x);
      retrun findNumber(collection, mid + 1, x);
    }
    
    return -1;
    
  }
  
  public static void main(String [] args){
    Algorithm3 obj = new Algorithm3(); 
    int[] numColl = new int[10000000];
    for(int = 1; i < numColl.length; i++) {
      numColl[i] = i;
    }
    
    int high = numColl.length - 1;
    long startTime = System.currentTimeMillis();
    obj.findNumber(numColl, 0, high, 9999997);
    System.out.println("We found the values the values at " + count + "try"); 
    
    long endTime = System.currentTimeMillis();
    System.out.println("Total time :: " + (endTime - startTime) + " ms");    
    
 }
 
}
    
      
      
      
      
    
