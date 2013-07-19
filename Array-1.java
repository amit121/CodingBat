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

/////// rotateLeft3 //////////////////////////////////////////////////////////////
public int[] rotateLeft3(int[] nums) {
  int[] new1 = new int[nums.length];//make new array same size as nums
  for(int i=0; i<nums.length; i++){
   new1[i] = nums[i]; //copy all data
  }

  nums[0] = new1[1];
  nums[1] = new1[2];
  nums[2] = new1[0];
  return nums;
  
}

/////// reverse3 //////////////////////////////////////////////////////////////////
public int[] reverse3(int[] nums) {
  int[] rev = new int[nums.length];
  for(int i=0; i<nums.length; i++){
   rev[i] = nums[i];
  }
  nums[0]=rev[2];
  nums[1]=rev[1];
  nums[2]=rev[0];
  return nums;
}

/////// maxEnd3 ////////////////////////////////////////////////////////////////////
public int[] maxEnd3(int[] nums) {
  int max;
  if(nums[0]>nums[2])
   max=nums[0];
  else
   max=nums[2];

  for(int i=0; i<nums.length; i++){
   nums[i] = max;
  }
  return nums;
}
