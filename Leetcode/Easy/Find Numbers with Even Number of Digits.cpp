#include <string> 

class Solution {
public:
    int findNumbers(vector<int>& nums) { // pass by reference a vector with integers in it, named nums
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            string index = std::to_string(nums[i]);
            if (index.length() % 2 == 0) {
                count++;
            }
        }
        return count;
        
    }
};