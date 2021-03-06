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

/////// answerCell /////////////////////////////////////////////////////////////////////////
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isMorning && isMom && !isAsleep)
   return true;
  else if(!isAsleep && !isMorning)
   return true;
  else
   return false;
}

/////// teaParty ////////////////////////////////////////////////////////////////////////////
public int teaParty(int tea, int candy) {
  if(tea<5 || candy <5)
   return 0;
  if(tea>= candy*2|| candy>= tea*2)
   return 2;
  else if(tea >= 5 && candy >=5)
   return 1;
  else
   return 0;
}

/////// fizzString ///////////////////////////////////////////////////////////////////////////
public String fizzString(String str) {
  if(str.substring(0,1).equals("f") && str.substring(str.length()-1,str.length()).equals("b"))
   return "FizzBuzz";
  else if(str.substring(0,1).equals("f"))
   return "Fizz";
  else if(str.substring(str.length()-1,str.length()).equals("b"))
   return "Buzz";
  else
   return str;
}

/////// fizzString2 //////////////////////////////////////////////////////////////////////////
public String fizzString2(int n) {
  if(n%3==0 && n%5==0)
   return "FizzBuzz!";
  else if(n%3==0)
   return "Fizz!";
  else if(n%5==0)
   return "Buzz!";
  else
   return n+"!";
}

/////// twoAsOne //////////////////////////////////////////////////////////////////////////////
public boolean twoAsOne(int a, int b, int c) {
  if(a+b==c || b+c==a || a+c==b)
   return true;
  else
   return false;
}

/////// inOrder ////////////////////////////////////////////////////////////////////////////////
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk && c>b)
   return true;
  else if(!bOk && b>a && c>b)
   return true;
  else
   return false;
}

/////// inOrderEqual ////////////////////////////////////////////////////////////////////////////
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk && b>=a && c>=b)
   return true;
  else if(!equalOk && b>a && c>b)
   return true;
  else
   return false;
}

/////// lastDigit ////////////////////////////////////////////////////////////////////////////////
public boolean lastDigit(int a, int b, int c) {
  if(a%10==b%10 ||a%10==c%10||b%10==c%10)
   return true;
  else
   return false;
}

/////// lessBy10 //////////////////////////////////////////////////////////////////////////////////
public boolean lessBy10(int a, int b, int c) {
  if(Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10)
   return true;
  else
   return false;
}

/////// withoutDoubles /////////////////////////////////////////////////////////////////////////////
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles && die1==die2){
   die1++;
   if(die1>=7){
    die1 = 1;
    return die1+die2;
    }
   else
    return die1+die2;
   }
   else
    return die1+die2;
}
