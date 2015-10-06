public class StringManipulation
{
   public static void main(String[]args)
   {
   
      int array[][] = new int[][]
         {
         {1,2,3,4},
         {5,6,7,8},
         {9,0,1,2},
         {3,4,5,6}         
         };
      
      int[] sortedArray = {1,2,3,4,5};
   
      System.out.println(IsAllUniqueChars("abacd"));
      System.out.println(ReverseString("abacd"));
      
      System.out.println(IsAnagram("cinema" , "iceman"));
      System.out.println();
      
      int newArray[][] = RotateMatrix(array,4);      
      Print(newArray , 4);
      
      System.out.println();
      
      int newArray2[][] = SetRowVal(array,4);      
      Print(newArray2 , 4);
   
      System.out.println();
      System.out.println(BinarySearch(sortedArray,6,1,5));
   
      System.out.println();
     // System.out.println(CanCreateString("interview" ,"programming interviews are weird"));
   
   }
   
   public static boolean IsAllUniqueChars(String phrase)
   {
      boolean[] charMap = new boolean[256];      
      
      for(int i = 0 ; i < phrase.length() ; i++)
      {
         int val = phrase.charAt(i);
         
         if(charMap[val])
         {
            return false;
         }
         else
         {
            charMap[val] = true;
         }
      }
      return true;
   }
   
   public static boolean BinarySearch(int arr[] , int x , int min , int max)
   {

   }
   
   
      
   public static String ReverseString(String str)
   {
      char[] characters = str.toCharArray();
      String s = "";
      
      for(int i = 0 ; i < characters.length / 2 ; i++)
      {
         char t = str.charAt(i);
         characters[i] = characters[characters.length - 1 - i];
         characters[characters.length - 1 - i] = t;        
      }
      
      for(int j = 0 ; j < characters.length;j++)
      {
         s += characters[j];
      }
      return s;
   }
   
   
   public static boolean IsAnagram(String str1 , String str2)
   {
      int count = 0;
      if(str1.length() != str2.length())
      {
         return false;
      }
      
      char[] s = str1.toCharArray();
      char[] t = str2.toCharArray();
      
      for(int i = 0; i < s.length; i ++)
      {
         for(int j = 0 ; j < t.length; j++)
         {
            if(s[i] == t[j])
            {
               count += 1;
            }
         }
      }     
      if(count == str1.length()){
         return true;
      }
      else{
         return false;
      }             
   }
   
   /** Rotates matrix by 90 degrees **/
   public static int[][] RotateMatrix(int[][] array , int n )
   {
      int[][] newArray = new int[n][n];
      
      for(int i = 0; i < array.length; i++)
      {
         for(int j = 0; j < array.length; j++)
         {
            newArray[i][j] = array[n - 1 - j][i];
         }
      }      
      return newArray;      
   }
   
   
   public static int[][] SetRowVal(int[][]array , int n)
   {
      int[] zeroLocs = new int[n];     
      int count = 0; 
     
      for(int i = 0; i < n; i++)
      {
         for(int j = 0 ; j < n ; j++)
         {
            if(array[i][j] == 0)
            {
               zeroLocs[count] = i;
            }
         }
         if(zeroLocs[count] != 0)
         {
            count++;
         }
      }
      
      for(int x = 0 ; x < zeroLocs.length ; x++)
      {
         for(int y = 0 ; y < n; y++)
         {
            array[zeroLocs[x]][y] = 0;
         }      
      }
      return array;
   }
   
   
   
   public static boolean CanCreateString(String s , String t)
   {
      boolean[] ASCII = new boolean[256];
      char[] magazine = t.toCharArray();
      int c = 0;
      int count = 0;
      
      for(int i = 0 ; i < magazine.length;i++)
      {
         
         if(s.charAt(c) == magazine[i])
         {
            int val = s.charAt(c);
            ASCII[val] = true;
            c++;
         }
      }   
      
      for(int j = 0 ; j < ASCII.length;j++)
      {
         if(ASCII[j] == true)
         {
            count++;
         }
      }  
      
      if(count == s.length())
      {
         return true;
      }
      {
         return false;
      }
   }
   
   public static void Print(int[][] array , int n)
   {
      for(int i = 0; i < n; i++){
         for(int j = 0 ; j < n; j++)
         {
            System.out.print(array[i][j]);
         }
         System.out.println();
      } 
   }
   
   


}