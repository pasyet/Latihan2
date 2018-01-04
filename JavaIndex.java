import java.lang.Math; 

public class JavaIndex {
      public static void main(String[] args) {
       int j,i;
      for (i=0; i<=11; i++)  {
            for (j=0; j<5; j++){
                 if ((i%2)!=1){
                  System.out.print(i*j +" ");
                 } else {
                   System.out.print(Math.pow(i,j)+" ");
                 }
                 
            }
      System.out.println();
      }

}
}
