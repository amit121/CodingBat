/////// cigarParty ////////////////////////////////////////////////////////////////
public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend && cigars >= 40)
    return true;
  else if(cigars >= 40 && cigars <=60)
    return true;
  else
    return false;
}

/////// dateFashion ////////////////////////////////////////////////////////////////
public int dateFashion(int you, int date) {
  if(you<= 2 || date <= 2)
   return 0;
  else if(you>= 8 || date >= 8)
   return 2;
  else
   return 1;
}

/////// squirrelPlay ////////////////////////////////////////////////////////////////
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer && temp>=60 && temp<=100)
   return true;
  else if(temp>=60 && temp<=90)
   return true;
  else
   return false;
}

/////// caughtSpeeding ///////////////////////////////////////////////////////////////
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday){
   if(speed<=65)
    return 0;
   else if(speed>=66 && speed<=85)
    return 1;
   else
    return 2;
  }
   
  if(speed<=60)
   return 0;
  else if(speed>=61 && speed<=80)
   return 1;
  else
   return 2;
}

/////// sortaSum //////////////////////////////////////////////////////////////////////
public int sortaSum(int a, int b) {
  if(a+b>=10 && a+b<=19)
   return 20;
  else
   return a+b;
}

/////// alarmClock ////////////////////////////////////////////////////////////////////
public String alarmClock(int day, boolean vacation) {
  if(vacation){
   if(day>=1 && day<=5)
    return "10:00";
   else
    return "off";
  }
  if(day>=1 && day<=5)
   return "7:00";
  else 
   return "10:00";
}

/////// love6 //////////////////////////////////////////////////////////////////////////
public boolean love6(int a, int b) {
  if(a==6 || b==6 ||a+b==6 ||a-Math.abs(b)==6 || Math.abs(b)-Math.abs(a)==6)
   return true;
  else
   return false;
}

/////// in1To10 ////////////////////////////////////////////////////////////////////////
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode){
   if(n<=1 || n>=10)
    return true;
   else
    return false;
  }
  if(n>=1 && n<=10)
   return true;
  else
   return false;
}

/////// specialEleven ///////////////////////////////////////////////////////////////////
public boolean specialEleven(int n) {
  if(n%11==0 || n%11==1)
   return true;
  else 
   return false;
}

/////// more20 ///////////////////////////////////////////////////////////////////////////
public boolean more20(int n) {
  if(n%20==1 || n%20==2)
   return true;
  else
   return false;
}

/////// old35 /////////////////////////////////////////////////////////////////////////////
public boolean old35(int n) {
  if(n%3==0 && n%5==0)
   return false;
  else if(n%3==0 || n%5==0)
   return true;
  else
   return false;
}

/////// less20 ////////////////////////////////////////////////////////////////////////////
public boolean less20(int n) {
  int k =0;
  if(n%20==18 || n%20==19)
    return true;
   else 
    return false;
}

/////// nearTen ///////////////////////////////////////////////////////////////////////////
public boolean nearTen(int num) {
  if(num%10==2 || num%10==9||num%10==8||num%10==1||num%10==0)
   return true;
  else
   return false;
}

/////// teenSum ///////////////////////////////////////////////////////////////////////////
public int teenSum(int a, int b) {
  if(a>=13 && a<=19 || b>=13 && b<=19)
   return 19;
  else
   return a+b;
}
