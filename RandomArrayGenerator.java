package labs.lab6;
import java.util.Random;

public class RandomArrayGenerator implements ArrayGenerator{
    Comparable[] c;
    IncreasingArrayGenerator inc = new IncreasingArrayGenerator();
    public Integer[] generate(int n){
        Random rand = new Random();
        Integer[] out = new Integer[n];
        Integer[] incArr = inc.generate(n);
        for(int a = 0; a < n; a++){
            out[a] = incArr[a];
        }
        for(int a = 0; a < out.length; a++){
            int b = rand.nextInt(0, n);
            Integer temp = incArr[a];
            incArr[a] = incArr[b];
            incArr[b] = temp;
        }
        c = incArr;
        return incArr;
    }
    public String toString(){
        String s = "";
        for(int a = 0; a < c.length; a++){
            s += " " + c[a];
        }
        return s;
    }
}
