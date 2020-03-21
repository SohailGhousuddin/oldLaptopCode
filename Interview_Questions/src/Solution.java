
class Solution {
   public static void main(String[] args)
   {
	   int[] A = {1, 4, -1, 3, 2} ;
	   int[] B = {1,2,3,4,5};
	   Solution s=new Solution(B);
   }
    public Solution(int[] A) {
        // write your code in Java SE 8
        
        /* step 1: read first value of the Array
           step 2: The actual array starts from the value located at the index[first value]
           step 3: travese the array until you see -1
           step 4: initialize a counter in step 2 if the value is not -1 
        
        */
         
        arraySize(A,0,0);
        
        
    }
    public static void arraySize(int[] A, int index,int arraySize)
    {
      if(A[index]==-1)
      {
         System.out.println(arraySize); 
         return;
      }
      arraySize(A,A[index],++arraySize);
      
    }
}
