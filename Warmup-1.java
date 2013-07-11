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

/////// posNeg ////////////////////////////////////////////////////////////////////
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
