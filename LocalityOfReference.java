import java.util.*;

public class LocalityOfReference{
   
  public static void main(String[] args) {
    Random r=new Random(); 
    int a=r.nextInt(100);
    
    int [][] A = new int[a][a];

    //int b=r.nextInt(200000000);
    int [][] B = new int[a][a];

   // int c=r.nextInt(300000000);
    int [][] C = new int[a][a];
    long startTime=System.nanoTime();

    for(int i =0; i<a ;i++){
        for(int j =0; j<a;j++){
            for(int k =0; k<a ;k++){
                C[i][j]=C[i][j]+A[i][k]*B[k][j];

    }
}
    }
    long endTime=System.nanoTime();
    long runTime= endTime-startTime; 
    System.out.print("Run time :"+ runTime +"\n");
    long start1Time=System.nanoTime();
    
    for(int i =0; i<a ;i++){
            for(int k =0; k<a ;k++){
                for(int j =0; j<a;j++){
                C[i][j]=C[i][j]+A[i][k]*B[k][j];

    }
            }
    }
    long end1Time=System.nanoTime();
    long run1Time= end1Time-start1Time; 
    System.out.println("Run time :"+ run1Time);
    
    

    
    


    

    

}

}

