class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    HashMap <Integer, Integer> map = new HashMap<>();
    int [] indexes = new int[2];
    for (int i=0; i<nums.length;i++) 
    {
        int j = target - nums[i];
        if (map.containsKey(j)) 
        {
            indexes[0] = map.get(j);
            indexes[1] = i;
        
        }
        else 
        {
            map.put(nums[i],i);
        }
    }
   return indexes;
   }
}
        
        
    
