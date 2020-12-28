import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int first = 0;first< length; first++){
            if (first > 0 && nums[first] == nums[first-1]){
                continue;
            }
            int target = -1* nums[first];
            int third = length-1;
            for (int second = first+1; second < length; second++){
                if (second > first+1 && nums[second] == nums[second-1]){
                    continue;
                }
                while (second < third && nums[second]+nums[third] > target){
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    result.add(list);
                }
            }

        }
        return result;
    }

}
