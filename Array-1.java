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

/////// reverse3 /////////////////////////////////////////////////////////////////
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

/////// maxEnd3 ///////////////////////////////////////////////////////////////////
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

/////// sum2 ///////////////////////////////////////////////////////////////////////
public int sum2(int[] nums) {
  int sum;
  if(nums.length == 0){
   return 0;
  }
  else if(nums.length<2){
   sum = nums[0];
   return sum;
  }
  else{
   sum = nums[0] + nums[1];
   return sum;
  }
}

/////// middleWay //////////////////////////////////////////////////////////////////
public int[] middleWay(int[] a, int[] b) {
  int[] arrayNew = new int[2];
  arrayNew[0] = a[1];
  arrayNew[1] = b[1];
  return arrayNew;
}

/////// makeEnds ////////////////////////////////////////////////////////////////////
public int[] makeEnds(int[] nums) {
  int[] newArray = new int[2];
  newArray[0] = nums[0];
  newArray[1] = nums[nums.length-1];
  return newArray;
}

/////// has23 ////////////////////////////////////////////////////////////////////////
public boolean has23(int[] nums) {
  if((nums[0] == 2 || nums[1] == 3) || (nums[0] == 3 || nums[1] == 2))
   return true;
  else 
   return false;
}

/////// no23 /////////////////////////////////////////////////////////////////////////
public boolean no23(int[] nums) {
  if(nums[0] != 2 && nums[0] != 3){
   if(nums[1] != 3 && nums[1] != 2)
    return true;
  }
  return false;
}

/////// makeLast /////////////////////////////////////////////////////////////////////
public int[] makeLast(int[] nums) {
  int[] doubleArray = new int[nums.length*2];
  doubleArray[doubleArray.length-1]=nums[nums.length-1];
  return doubleArray;
}

/////// double23 /////////////////////////////////////////////////////////////////////
public boolean double23(int[] nums) {
  if(nums.length == 0)
   return false;
  else if(nums.length == 1 && (nums[0] != 2 || nums[0] != 3))
   return false;
  else if((nums[0] == 2 && nums[1] == 2) ||(nums[0] == 3 && nums[1] == 3))
   return true;
  else
   return false;
}

/////// fix23 /////////////////////////////////////////////////////////////////////////
public int[] fix23(int[] nums) {
  if(nums[0] == 2 && nums[1] ==3){
   nums[1]=0;
   return nums;
  }
  else if(nums[1] == 2 && nums[2] ==3){
   nums[2]=0;
   return nums;
  }
  else
   return nums;
}

/////// start1 /////////////////////////////////////////////////////////////////////////
public int start1(int[] a, int[] b) {
  if(a.length <1 && b.length<1)
   return 0;
  if(b.length<1 && a[0] == 1)
   return 1;
  if(a.length<1 && b[0] == 1)
   return 1;
  if(a.length>=1 && b.length>=1){
    if(a[0] == 1 && b[0] == 1)
     return 2;
    else if(a[0] != 1 && b[0] == 1)
     return 1;
    else if(a[0] == 1 && b[0] != 1)
     return 1;
    else
     return 0;
    }
    return 0;
}

/////// biggerTwo ///////////////////////////////////////////////////////////////////////
public int[] biggerTwo(int[] a, int[] b) {
  int suma = a[0]+a[1];
  int sumb = b[0]+b[1];
  
  if(sumb>suma)
   return b;
  else return a;
}

/////// makeMiddle //////////////////////////////////////////////////////////////////////
public int[] makeMiddle(int[] nums) {
  if(nums.length == 2)
   return nums;
  int[] one = new int[2];
  one[0] = nums[(nums.length/2)-1];
  one[1] = nums[(nums.length/2)];
  return one;
}

/////// plusTwo //////////////////////////////////////////////////////////////////////////
public int[] plusTwo(int[] a, int[] b) {
  int[] newArray = new int[4];
  int a0 = a[0];
  int a1 = a[1];
  int b0 = b[0];
  int b1 = b[1];
  newArray[0] = a0;
  newArray[1] = a1;
  newArray[2] = b0;
  newArray[3] = b1;
  return newArray;
}

/////// swapEnds /////////////////////////////////////////////////////////////////////////
public int[] swapEnds(int[] nums) {
  int[] temp = new int[nums.length];
  for(int i=0; i<nums.length; i++){
   temp[i] = nums[i];
  }
  temp[0] = nums[nums.length-1];
  temp[nums.length-1] = nums[0];
  return temp;
}

/////// midThree /////////////////////////////////////////////////////////////////////////
public int[] midThree(int[] nums) {
  if(nums.length == 3)
   return nums;
  
  int[] one = new int[3];
  one[0] = nums[(int)(nums.length/2)-1];
  one[1] = nums[(int)(nums.length/2)];
  one[2] = nums[(int)(nums.length/2)+1];
   return one;
}

/////// maxTriple ////////////////////////////////////////////////////////////////////////
public int maxTriple(int[] nums) {
  int max;
  if(nums[0]>nums[nums.length-1])
   max = nums[0];
  else
   max = nums[nums.length-1];
   
  if(nums[nums.length/2] > max){
   max=nums[nums.length/2];}
   return max;
}

/////// frontPiece ///////////////////////////////////////////////////////////////////////
public int[] frontPiece(int[] nums) {
  int[] temp = new int[2];
  if(nums.length<2)
   return nums;
  else if(nums.length>=2){
   temp[0] = nums[0];
   temp[1] = nums[1];
  }
  return temp;
}
