package labs.lab6;

public class DecreasingArrayGenerator implements ArrayGenerator{
    Comparable[] c;
    public Integer[] generate(int n){
        Integer[] out = new Integer[n];
        for(int a = n; a > 0; a--){
            out[n - a] = a;
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
