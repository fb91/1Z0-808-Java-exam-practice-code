package creatingAndUsingArrays;

public class InitializationWithDefaults {
    public static void main(String[] args) {
        int[] ints1 = new int[]{1,2,3};
//        int[] ints2 = new Integer[]{1,2,3,4,5};//mismatch type
        Integer[] ints2 = new Integer[]{1,2,3};
        int ints3 [] = new int[]{1,2,3}; //no problem switching the variable name and [], or adding spaces.
        Integer ints4[] = new Integer[]{1,2,3};
//        int [] ints5 = new int[];//you MUST initializate knowing the size
        int [] ints5 = new int[3];
        ints5[0]=1;ints5[1]=2;ints5[2]=3;
        int ints6[] = {1,2,3};
        int[]ints7=new int[3];
        Integer ints8[]=new Integer[3];
        for(Integer i : ints1) System.out.print("for using Integer in int[] ints1: " + i + " ");
        System.out.println("-");
        for(int i=0; i<ints1.length;i++) System.out.print("ints1[i] = " + ints1[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints2.length;i++) System.out.print("ints2[i] = " + ints2[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints3.length;i++) System.out.print("ints3[i] = " + ints3[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints4.length;i++) System.out.print("ints4[i] = " + ints4[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints5.length;i++) System.out.print("ints5[i] = " + ints5[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints6.length;i++) System.out.print("ints6[i] = " + ints6[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints7.length;i++) System.out.print("int ints7[i] = " + ints7[i]+" ");
        System.out.println("-");
        for(int i=0; i<ints8.length;i++) System.out.print("Integer ints8[i] = " + ints8[i]+" ");
//        ints8[1]++;//unchecked exception: NullpointerException

        System.out.println("3/2 = " + 3/2);
        System.out.println("3.0/2.0 = " + 3.0/2.0);
    }
}
