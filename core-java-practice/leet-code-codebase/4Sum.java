class Solution{
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> lst = new ArrayList<>();
                            lst.addAll(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            Collections.sort(lst);
                            set.add(lst);
                        }
                    }
                }
            }
        }
        for (List<Integer> list : set) {
            ans.add(list);
        }
        return ans;
    }
}