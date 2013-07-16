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

/////// commonEnd ////////////////////////////////////////////////////////////////
public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length-1] == b[b.length-1])
   return true;
  else 
   return false;
}

/////// sum3 /////////////////////////////////////////////////////////////////////
public int sum3(int[] nums) {
  int sum = 0;
  for(int i = 0; i<nums.length; i++){
   sum = sum + nums[i];
  }
  return sum;
}
