public class FracAddSub {

    public String FracAddSub(String expr) {
        int nume = 0;
        int deno = 0;

        int i = 0;
        int n= expr.length();
        while(i < n){
            int currNume = 0; // Current fraction numerator
            int currDeno = 0; // Current fraction denomenator

            boolean isNeg = (expr.charAt(i) == '-');

//            skip + or -

            if(expr.charAt(i) == '+' || expr.charAt(i) == '-'){
                i++;
            }
//            Build the current numerator
            while(i < n && Character.isDigit(expr.charAt(i))){
                int val = expr.charAt(i) - '0';
                currNume = (currNume*10) + val;
                i++;
            }
            i++; // skip the division character

            if(isNeg){
                currNume *= -1; // apply negative sign when it is needed
            }
//            Build the current denominator
            while(i < n && Character.isDigit(expr.charAt(i))){
                int val = expr.charAt(i) - '0';
                currDeno = (currDeno*10) + val;
                i++;
            }

            /*  Update the accumulated numerator & denominator */

            nume = (nume * currDeno) + (currNume * deno);
            deno = deno * currDeno;
        }
//        Now we use the term Greatest common divisor
        int gcd = gcd(Math.abs(nume), deno);
//        return the result in terms of numerator & denominator
        return nume+"/"+deno;
    }
    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
