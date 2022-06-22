public class Fizzbuzz {

    public static String FizzBuzzP(Integer n){

        if(n==null){
            throw new IllegalArgumentException("Number can not be null");
        }

        if(n%3==0 && n%5==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        else{
            return Integer.toString(n);
        }
    }

    public static String[] FizzBuzzE(Integer m){

        if (m==null || m<1){
            throw new IllegalArgumentException("Number can not be null");
        }
        if (m<1){
            throw new IllegalArgumentException("Number needs to be above 0");
        }

        String[] r = new String[m];
        for(int i =0; i<m;i++){
            r[i] = FizzBuzzP(i);
        }

        return r;

    }


}