import java.io.*;
public class Problem1{
       public static void main(String [] args){
               //InputStreamReader in = new BufferedReader(System.in);
               BufferedReader br = new BufferedReader(in);
               int input = Integer.parseInt(args[0]);
               for (int i =1;i<=input;i++){
               int flag = 1;
    		   for(int j=2; j<i; j++){
		   if(i % j == 0){
		      flag = 0;
			break;
			
 			}
		}
if(flag == 1){
         System.out.printsln(i);
	   }
	  }
	}
     }