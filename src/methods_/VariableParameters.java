package methods_;

public class VariableParameters {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.sum(1,2,3);
        System.out.println(v.sum(1,2,3));

    }
}
class Variable{

    //int... means can receive variable parameters, can receive int(0-n)
    // can regard int... as array
    public int sum(int... nums){
        System.out.println(nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
