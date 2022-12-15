package labs.lab6;

public class IncreasingArrayGenerator implements ArrayGenerator{
    Comparable[] c;
    public Integer[] generate(int n){
        Integer[] out = new Integer[n];
        for(int a = 0; a < n; a++){
            out[a] = a;
        }
        c = out;
        return out;
    }
    public String toString(){
        String s = "";
        for(int a = 0; a < c.length; a++){
            s += " " + c[a];
        }
        return s;
    }
}
