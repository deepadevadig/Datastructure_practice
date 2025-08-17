public class arrays
{  

    public static void main(String[] args) 
    {
        
        int [] numbers = {19,2,0}; // declare , initialize
        numbers[0] = 10;
        java.util.Arrays.sort(numbers);


        // declare 2 dimensional array
        int [] [] matrix = { 
            {1,2,5},
            {6,89,8}
         };
          System.out.println("printing 2d array");

         System.out.println(matrix[0][0]);
         System.out.println(matrix[0][1]);
         System.out.println(matrix[1][1]);


        System.out.println(numbers.length);
    
        int[] ages = new int[3];
        ages[0]=19;
        ages[1]=11;
        ages[2]=100;
        
        printelements(ages);
        printelements(numbers);
        PrintElements2(ages);
        

       
     
    }
    public static void printelements(int[] elements)
    {
        for (int i=0; i<elements.length; i++)
        {
            System.out.println(" " + elements[i]);
        }
        

    }
    public static void PrintElements2(int[] elements)
    {
        for ( int element : elements)

        {
            System.out.println("elements are =" + element);

        }
    }

}