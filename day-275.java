<<<<<<< HEAD
static int B,H;
static boolean flag;

static{
    Scanner cin=new Scanner(System.in);
    B=cin.nextInt();
    H=cin.nextInt();
    if(B>0&&H>0){
        flag=true;
    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}



=======
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void solve(int[] nums, int[] per, int c) {
        if (c == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : per) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (per[i] == 11) {
                per[i] = nums[c];
                solve(nums, per, c + 1);
                per[i] = 11;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int[] per = new int[n];
        for (int i = 0; i < n; i++) {
            per[i] = 11;
        }
        solve(nums, per, 0);
        return ans;
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
