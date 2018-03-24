/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author harry
 */
public class Test {
     static ArrayList<Integer> ARRAY_A = new ArrayList<Integer>();
     static ArrayList<Integer> ARRAY_B = new ArrayList<Integer>();
     static ArrayList<Integer> ARRAY_FINAL = new ArrayList<Integer>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int finalResult = 0;
       
        System.out.println("Please input the length for the two arrary");
        Scanner numInput = new Scanner(System.in);
        int arrayLength = numInput.nextInt();
        
        arrayGen(arrayLength);  //Generate two array
        
        System.out.println("The array A is: "+ ARRAY_A);
        System.out.println("The array B is: "+ ARRAY_B);
        
        arrayCombine(arrayLength);  //Combine two array
            
        finalResult = resultCal();  //Calculate the final result
        System.out.println("The final array is: "+ ARRAY_FINAL);
        System.out.println("The final result is: "+ finalResult);
            
        }
    
    public static void arrayGen(int arrayLength){
        Random random = new Random();
        for(int i=0;i<arrayLength;i++){
            int temp = random.nextInt(100);
            ARRAY_A.add(temp);
            temp = random.nextInt(100);
            ARRAY_B.add(temp);
        }
    }
    
    
    public static Integer resultCal(){
        int finalResult = 0;
        
         for(int z=0; z<ARRAY_FINAL.size();){
                finalResult= ARRAY_FINAL.get(z)*ARRAY_FINAL.get(z+1)+finalResult;
                z = z+2;
            }
        
        
        return finalResult;
    }
    
    public static void arrayCombine(int arrayLength){        
        Random random = new Random();
         for(int j = 0; j<arrayLength*2; j++)
         {
            boolean judgeFLG = random.nextBoolean();
            if(judgeFLG){
                if(ARRAY_A.size()!=0){
                int temp = ARRAY_A.get(0);
                ARRAY_FINAL.add(temp);
                ARRAY_A.remove(0);}
                else{
                int temp = ARRAY_B.get(0);
                ARRAY_FINAL.add(temp);
                ARRAY_B.remove(0);
                }
            }else{
                if(ARRAY_B.size()!=0){
                int temp = ARRAY_B.get(0);
                ARRAY_FINAL.add(temp);
                ARRAY_B.remove(0);
                }
                else{
                int temp = ARRAY_A.get(0);
                ARRAY_FINAL.add(temp);
                ARRAY_A.remove(0);
                }
            }
        }
    }
       
        
    }
    

