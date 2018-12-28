package AugustSession;

public class Day4Array {

    public static void main(String[] args) {
        int i[] = new int[4];
        i[0]=5;
        i[1]=7;
        i[2]=8;
        i[3]=9;
        
        
       // for(int j=3; j>=0; j--) {
         //   System.out.println(i[j]);   }
        
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println(a.length);
        
        Object ob[]=new Object[5];
        ob[0]= "james";
        ob[1]= "bond";
        ob[2]= "31";
        ob[3]= "M";
        ob[4]= "12.45";
        
       /* System.out.println(ob[3]); //print index value 4
        for (int obj=0; obj<ob.length; obj++) {
            System.out.println(ob[obj]);
        }*/
        //2D array
        int marks[][]= {{12,23,34,45,56,67}, //row0
                        {76,65,54,43,32,21}, //row1
                        {11,22,33,44,55,66}};//row2
                //column 0  1  2  3  4  5

        //S ystem.out.println(marks.length);
        System.out.println(marks[0][2]);
        
        //int sum=0;
        for(int counter=0; counter<marks.length; counter++) {
        }
        
        
        for(int row=0; row<marks.length; row++) {
            for(int col=0; col<marks[row].length; col++) {
            System.out.print(marks[row][col]+"\t");
            }System.out.println();
        }
    } 
}
