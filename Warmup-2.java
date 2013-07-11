/////// stringTimes //////////////////////////////////////////////////////////////
public String stringTimes(String str, int n) {
  String one = "";
  for(int i=0;i<n;i++){
   one=one+str;
  }
  return one;
}

/////// frontTimes ///////////////////////////////////////////////////////////////
public String frontTimes(String str, int n) {
  String one = "";   
   for(int i=0; i<n; i++){
    if(str.length() ==1)
     one = one + str.substring(0,1);
    else if(str.length() == 2)
     one = one + str.substring(0,2);
    else if(str.length() > 2)
     one = one + str.substring(0,3);
    else
     return "";
   }
   return one;
}

/////// countXX //////////////////////////////////////////////////////////////////
int countXX(String str) {
  int count = 0;
  for(int i=0; i<str.length()-1;i++){
   if(str.substring(i,i+2).equals("xx")){
     count++;
    }
  }
  return count;
}

/////// doubleX //////////////////////////////////////////////////////////////////
boolean doubleX(String str) {
  int i = str.indexOf("x");
  
  if(i == -1)
   return false;
  
  if(i+1 >= str.length())
   return false;
  
  return str.substring(i+1, i+2).equals("x");
  
}

/////// stringBits ///////////////////////////////////////////////////////////////
public String stringBits(String str) {
  String one = "";
  if(str.length()<1){
   return "";
  }
  else if (str.length()==2)
   return str.substring(0,1);
  else
  for(int i=0; i<str.length(); i+=2){
   one = one +str.substring(i,i+1);
   
  }
  return one;
}

/////// stringSplosion ///////////////////////////////////////////////////////////
public String stringSplosion(String str) {
  String one ="";
  for(int i=0; i<str.length();i++)
   one = one + str.substring(0,i+1);
  return one;
}

/////// last2 ////////////////////////////////////////////////////////////////////
public int last2(String str) {
  
  if(str.length()<2)
   return 0;
  
  String one = str.substring(str.length()-2);
  int count = 0;

  for(int i=0; i<str.length()-2; i++){
   String sub = str.substring(i,i+2);
    if(sub.equals(one)){
     count++;
   }
  }
  return count;
}

/////// arrayCount9 ///////////////////////////////////////////////////////////////
public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i=0;i<nums.length;i++){
   if(nums[i]==9){
    count++;
   }
  }
  return count;
}

/////// arrayFront9 ///////////////////////////////////////////////////////////////
public boolean arrayFront9(int[] nums) {
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;
  
  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }
  
  return false;
}

/////// array123 //////////////////////////////////////////////////////////////////
public boolean array123(int[] nums) {
  int one = 1;
  int two = 2;
  int three = 3;
  for(int i=0;i<nums.length-2;i++){
   if(nums[i] == one && nums[i+1] == two && nums[i+2]==three)
    return true;
  }
  return false;

}

/////// stringMatch ////////////////////////////////////////////////////////////////
public int stringMatch(String a, String b) {
  // Figure which string is shorter.
  int len = Math.min(a.length(), b.length());
  int count = 0;
  
  // Look at both substrings starting at i
  for (int i=0; i<len-1; i++) {
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}

/////// stringX /////////////////////////////////////////////////////////////////////
public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    // Only append the char if it is not the "x" case
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    }
  }
  return result;
}

/////// altPairs /////////////////////////////////////////////////////////////////////
public String altPairs(String str) {
  String result="";

   for(int i=0;i<str.length();i+=4){
    int end =i+2;
    if(end > str.length()){
     end = str.length();
    }
    result = result + str.substring(i,end);
   }
   return result;
 
}

/////// stringYak /////////////////////////////////////////////////////////////////////
public String stringYak(String str) {
  String result = "";
  for(int i=0;i<str.length();i++){
   if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
    i=i+2;
  }
  else{
   result = result + str.charAt(i);
  }
 }
 return result;
}

/////// array667 ///////////////////////////////////////////////////////////////////////
public int array667(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length-1; i++){
   if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7)
    count++;
  }
  return count;
}

/////// noTriples ///////////////////////////////////////////////////////////////////////
public boolean noTriples(int[] nums) {
  for(int i =0; i<nums.length-2; i++){
   if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2])
    return false;
  }
  return true;
}

/////// has271 ///////////////////////////////////////////////////////////////////////////
public boolean has271(int[] nums) {
  for(int i =0; i<nums.length-2; i++){
   int val = nums[i];
   if(nums[i+1] == (val + 5) && Math.abs(nums[i+2] - (val-1)) <= 2)
    return true;
  }
  return false;
}
