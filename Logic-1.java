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
