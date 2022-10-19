class Solution {
    public int reverse(int x) {
        int ans = 0;
        int temp = 0;
        boolean neg = false; 
        
        if(x < 0){
            neg = true;
            x = -x;
        }
    
        while(x > 0){
            temp = x % 10;
            if(ans > Integer.MAX_VALUE / 10 || 
              (ans == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)){
                return 0;
            }
            ans = ans * 10 + temp;
            x /= 10;
        }
       return (neg == true)? -ans : ans;
    }
}