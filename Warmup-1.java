/////// sleepIn //////////////////////////////////////////////////////////////////
public boolean sleepIn(boolean weekday, boolean vacation) {
  if(weekday == false || vacation == true){
    return true;
  }
  return false;
}

/////// monkeyTrouble ////////////////////////////////////////////////////////////
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile == true && bSmile == true || aSmile == false && bSmile == false){
   return true;
  }
  return false;
}

/////// sumDouble ////////////////////////////////////////////////////////////////
public int sumDouble(int a, int b) {
  int c=0;
  if(a == b){
   return c = (2*(a+b));
  }
  return a +b;
}

/////// diff21 ///////////////////////////////////////////////////////////////////
public int diff21(int n) {
  if(n>21){
   return Math.abs(2*(21-n));
  }
  return Math.abs(21-n);
}

/////// parrotTrouble ////////////////////////////////////////////////////////////
public boolean parrotTrouble(boolean talking, int hour) {
  if(talking == true && (hour<7 || hour>20)){
   return true;
  }
  return false;
}

/////// makes10 //////////////////////////////////////////////////////////////////
public boolean makes10(int a, int b) {
  if(a == 10){
   return true;
  }
  else if(b==10){
   return true;
  }
  else if(a + b == 10){
   return true;
  } 
  else{return false;}
}

/////// nearHundred ///////////////////////////////////////////////////////////////
public boolean nearHundred(int n) {
  if(n >= 90 && n <= 110){
   return true;
  }
  else if(n >= 190 && n<=210){
   return true;
  }
  return false;
}

/////// posNeg ////////////////////////////////////////////////////////////////////
public boolean posNeg(int a, int b, boolean negative) {
  if(negative){
   return (a<0 && b<0);
  }
  else {
   return ((a<0 && b>0) || (a>0 && b<0));
  }
}

/////// notString /////////////////////////////////////////////////////////////////
public String notString(String str) {
  String a = "not ";
  if(str.length()>=3 && str.substring(0,3).equals("not")){
    return str;
  }
  else{
    String b = a + str;
    return b;
  }
}

/////// missingChar ////////////////////////////////////////////////////////////////
public String missingChar(String str, int n) {
  String a = str.substring(0,n);
  String back = str.substring(n+1,str.length());
  return a +back;
}

/////// frontBack //////////////////////////////////////////////////////////////////
public String frontBack(String str) {
  if(str.length() <= 1) return str;
  
  String mid = str.substring(1,str.length()-1);
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}

/////// front3 /////////////////////////////////////////////////////////////////////
public String front3(String str) {
  String front;
  if(str.length() >=3){
   front = str.substring(0,3);
  }
  else{
    front = str;
  }
  return front + front + front;
}

/////// backAround /////////////////////////////////////////////////////////////////
public String backAround(String str) {
  //String mid = str.substring(1,str.length()-1);
  String last = str.substring(str.length()-1);
  return last + str + last;
}

/////// or35 ///////////////////////////////////////////////////////////////////////
public boolean or35(int n) {
  if(n % 3 == 0 ||n%5==0)
   return true;
  return false;
}

/////// front22 ////////////////////////////////////////////////////////////////////
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }
  
  String front = str.substring(0, take);
  return front + str + front;
}

/////// startHi ////////////////////////////////////////////////////////////////////
public boolean startHi(String str) {
  if(str.length() < 2)
   return false;
  String firstTwo = str.substring(0,2);
  if(firstTwo.equals("hi"))
   return true;
  else
   return false;
}

/////// icyHot //////////////////////////////////////////////////////////////////////
public boolean icyHot(int temp1, int temp2) {
  if(temp1< 0 && temp2 >100 || temp2<0 && temp1>100)
   return true;
  else
   return false;
}

/////// in1020 //////////////////////////////////////////////////////////////////////
public boolean in1020(int a, int b) {
  if(a>=10 && a<=20 ||b>=10 && b<=20)
   return true;
  else
   return false;
}

/////// hasTeen /////////////////////////////////////////////////////////////////////
public boolean hasTeen(int a, int b, int c) {
  if(a>=13 && a<=19 ||b>=13 && b<=19||c>=13 && c<=19)
   return true;
  else
   return false;
}

/////// loneTeen /////////////////////////////////////////////////////////////////////
public boolean loneTeen(int a, int b) {
  boolean aTeen = (a>=13 && a<=19);
  boolean bTeen = (b>=13 && b<=19);
  if(aTeen && !bTeen || !aTeen && bTeen) 
   return true;
  else
   return false;
}

/////// delDel ////////////////////////////////////////////////////////////////////////
public String delDel(String str) {
  if(str.length()<4)
   return str;
  else if(str.substring(1,4).equals("del"))
   return str.substring(0,1)+str.substring(4,str.length());
  else
   return str;
}

/////// mixStart ///////////////////////////////////////////////////////////////////////
public boolean mixStart(String str) {
  if(str.length()>=3 && str.substring(1,3).equals("ix"))
   return true;
  else
   return false;
}

/////// startOz /////////////////////////////////////////////////////////////////////////
public String startOz(String str) {
  if(str.length()>=2 && str.substring(0,1).equals("o") && str.substring(1,2).equals("z"))
   return "oz";
  else if(str.length()>=1 && str.substring(0,1).equals("o"))
   return "o";
  else if(str.length()>=1 && str.substring(1,2).equals("z"))
   return "z";
  else
   return "";
}

/////// intMax ///////////////////////////////////////////////////////////////////////////
public int intMax(int a, int b, int c) {
  int max;
  if(a>b)
   max = a;
  else
   max = b;
  if(c>max)
   max = c;
  return max;
}

/////// close10 ///////////////////////////////////////////////////////////////////////////
public int close10(int a, int b) {
  int val =10;
  int adif = Math.abs(a-val);
  int bdif = Math.abs(b-val);
  
  if(adif<bdif)
   return a;
  else if(bdif<adif)
   return b;
  else
   return 0;
}

/////// in3050 /////////////////////////////////////////////////////////////////////////////
public boolean in3050(int a, int b) {
  boolean aRange1 = (a>=30 && a<=40);
  boolean bRange1 = (b>=30 && b<=40);
  boolean aRange2 = (a>=40 && a<=50);
  boolean bRange2 = (b>=40 && b<=50);
  
  if(aRange1 && bRange1 || aRange2 && bRange2)
   return true;
  else
   return false;
  
}

/////// max1020 ////////////////////////////////////////////////////////////////////////////
public int max1020(int a, int b) {
  if (b>a){
   int temp = a;
   a = b;
   b = temp;
  }
  if(a>= 10 && a <= 20) 
   return a;
  else if(b>= 10 && b <= 20) 
   return b;
  else
   return 0;
}

/////// stringE /////////////////////////////////////////////////////////////////////////////
public boolean stringE(String str) {
  int count= 0;
  for(int i=0;i<str.length();i++){
   if(str.length()>=1 && str.substring(i,i+1).equals("e"))
    count++;
  }
  if(count>=1 && count<=3)
   return true;
  else
   return false;
}

/////// lastDigit ////////////////////////////////////////////////////////////////////////////
public boolean lastDigit(int a, int b) {
  if(a % 10 == b% 10)
   return true;
  else
   return false;
}
