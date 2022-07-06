package Learning;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Tester {
    public int rizn(int a, int b){
        return  a-b;
    }
    public int dilen(int a,int b){
        return a/b;
    }
    @Test
    public void Dzeshka(){
        String[] vsyakoe = {"Phones","Foods","Cars","Pets","Computers","Books"};
        System.out.println(Arrays.toString(vsyakoe));
        System.out.println(Arrays.toString(vsyakoe).substring(1,8));
    }
}
