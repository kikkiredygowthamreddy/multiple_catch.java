public class laptop{
    public static void main(String args[]){
        int i = 33;
        int j = 0;
        int nums[] = new int[5];
        String Str = null;
        try {
            j = i/j;
            System.out.println(Str.length());
            System.out.println(nums[1]);
            System.out.println(nums[6]);
            
        } 
        catch(ArithmeticException e) 
        {
     System.out.println("canndot divide");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay down in area");
        }
        catch(Exception e){
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);
    System.out.println("show it");
    }
}