

package arraylisthw;

import java.util.ArrayList;


public class Student {
    private ArrayList<HomeWork> hw;
    private String id;
    
    public Student(String id){
        this.id = id;
        hw = new ArrayList<HomeWork>();
    }
    
   
    
    public String getID(){
        return id;
    }
    
    public void setScore(String hw, double score){
        this.hw.add(new HomeWork(hw,score));
    }
    public String getHomeWork(int i){
        for(int j = 0 ; j<hw.size(); j++){
            if(hw.get(j).getHW().contains(i+"")){
            
            return hw.get(j).getScore();
            }

        }return"-";
    }   
    
}
