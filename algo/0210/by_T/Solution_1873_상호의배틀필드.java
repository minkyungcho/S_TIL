package day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1873_상호의배틀필드 {
   public static void main(String[] args) throws Exception{
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int testCase=Integer.parseInt(in.readLine());
     StringTokenizer st;
     int row,col,count;
     char [][]arr;
     String move,str;
     char state='\u0000';
     int []currCar;
      
     for(int i=1; i<=testCase; i++) {    
       currCar=new int[2];
       st=new StringTokenizer(in.readLine()," ");
       row=Integer.parseInt(st.nextToken());
       col=Integer.parseInt(st.nextToken());
       arr=new char[row][col];
       for(int j=0; j<row; j++) {
         str=in.readLine();
         for(int k=0; k<col; k++) {
           arr[j][k]=str.charAt(k);
         }       
       }
       for(int j=0; j<row; j++) {
         for(int k=0; k<col; k++) {
            char ch=arr[j][k]; 
            if(ch=='<'||ch=='>'||ch=='^'||ch=='v') {
               currCar[0]=j;
               currCar[1]=k;
               break;
            }
         }
       }
       count=Integer.parseInt(in.readLine());
       move = in.readLine();
       for(int j=0; j<count; j++) {
         char ch = move.charAt(j);
         if(ch=='U') {
            arr[currCar[0]][currCar[1]]='^';
            if(currCar[0]-1>-1) {
               if(arr[currCar[0]-1][currCar[1]]=='.') {
                   arr[currCar[0]][currCar[1]]='.';
                   arr[currCar[0]-1][currCar[1]]='^';
                   currCar[0]--;
               }
            }
         }else if(ch=='D') {
            arr[currCar[0]][currCar[1]]='v';
            if(currCar[0]+1<row) {
                if(arr[currCar[0]+1][currCar[1]]=='.') {
                    arr[currCar[0]][currCar[1]]='.';
                    arr[currCar[0]+1][currCar[1]]='v';
                    currCar[0]++;
                }
            }           
         }else if(ch=='L') {
            arr[currCar[0]][currCar[1]]='<'; 
            if(currCar[1]-1>-1) {
                if(arr[currCar[0]][currCar[1]-1]=='.') {
                    arr[currCar[0]][currCar[1]]='.';
                    arr[currCar[0]][currCar[1]-1]='<';
                    currCar[1]--;
                }
            }
         }else if(ch=='R') {
            arr[currCar[0]][currCar[1]]='>'; 
            if(currCar[1]+1<col) {
                if(arr[currCar[0]][currCar[1]+1]=='.') {
                    arr[currCar[0]][currCar[1]]='.';
                    arr[currCar[0]][currCar[1]+1]='>';
                    currCar[1]++;
                }       
            }
         }else if(ch=='S') {
            int ii=currCar[0];
            int jj=currCar[1];
            state=arr[ii][jj];
            if(state=='^') {
                for(int k=currCar[0]-1; k>-1; k--) {
                   if(arr[k][jj]=='#') break;
                   else if(arr[k][jj]=='*') {
                       arr[k][jj]='.'; break;
                   }
                }
            }else if(state=='v') {
                for(int k=currCar[0]+1; k<row; k++) {
                       if(arr[k][jj]=='#') break;
                       else if(arr[k][jj]=='*') {
                           arr[k][jj]='.'; break;
                       }
                }
            }else if(state=='<') {
                for(int k=currCar[1]-1; k>-1; k--) {
                       if(arr[ii][k]=='#') break;
                       else if(arr[ii][k]=='*') {
                           arr[ii][k]='.'; break;
                       }
                }
            }else if(state=='>') {
                for(int k=currCar[1]+1; k<col; k++) {
                       if(arr[ii][k]=='#') break;
                       else if(arr[ii][k]=='*') {
                           arr[ii][k]='.'; break;
                       }
                }
            }
         }
       }
       System.out.print("#"+i+" ");
       for(int j=0; j<row; j++) {
           for(int k=0; k<col; k++) {
               System.out.print(arr[j][k]);
           }
           System.out.println();
       }
     }
   }
}