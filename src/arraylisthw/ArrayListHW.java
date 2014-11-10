
package arraylisthw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ArrayListHW {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        FileReader reader = new FileReader("InputHW.txt");
        BufferedReader in = new BufferedReader(reader);
        ArrayList<Student> s = new ArrayList<Student>();
        int j = 0; int k=j;
        while(true){  
            String inputLine = null;
            try{
                inputLine = in.readLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
     
        if(inputLine == null) break;
        StringTokenizer tokenizer = new StringTokenizer(inputLine,":");
        int index = 0;
        String id = "";
        String hw="";
        double score = 0; 
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if(index == 0){
                id = token;
                index++;
            }
            
            else if(index == 1){
                hw = token;
                index++;
            }else {score = Double.parseDouble(token);
            }
            
            
            
            
        }
        boolean check = false;
        int ss = 0;
            
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).getID().equals(id)){
                check = true; ss = i; 
            //System.out.println(ss);
                break;
                
            }
        }
            
        if(check){
            
            s.get(ss).setScore(hw, score);
        }
        else{
            
            
            s.add(new Student(id));
            s.get(j).setScore(hw,score);
           
            j++;
        }


    }       System.out.println("Student    HW1    HW2     HW3");
            for(int i = 0;i<s.size();i++){
             System.out.println(s.get(i).getID()+" :"
                    +s.get(i).getHomeWork(1)
                    +"  : "+s.get(i).getHomeWork(2)
                    +"      :"+s.get(i).getHomeWork(3));
            
        }
    }
}