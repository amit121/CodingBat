/////// firstLast6 //////////////////////////////////////////////////////////////
public boolean firstLast6(int[] nums) {
  if(nums[0] == 6 || nums[nums.length-1] == 6)
   return true;
  else 
   return false;
}

/////// sameFirstLast ////////////////////////////////////////////////////////////
public boolean sameFirstLast(int[] nums) {
  if(nums.length >= 1 && nums[0] == nums[nums.length-1])
   return true;
  else
   return false;
}

/////// makePi ///////////////////////////////////////////////////////////////////
public int[] makePi() {
  int[] pi = {3,1,4};
  return pi;
}