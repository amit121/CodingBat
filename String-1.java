/////// helloName ////////////////////////////////////////////////////////////////
public String helloName(String name) {
  return("Hello "+name+"!");
}

/////// makeAbba /////////////////////////////////////////////////////////////////
public String makeAbba(String a, String b) {
  return(a+b+b+a);
}

/////// makeTags /////////////////////////////////////////////////////////////////
public String makeTags(String tag, String word) {
  return("<"+tag+">"+word+"<"+"/"+tag+">");
}

/////// makeOutWord //////////////////////////////////////////////////////////////
public String makeOutWord(String out, String word) {
  return(out.substring(0,2)+word+out.substring(2,4));
}

/////// extraEnd /////////////////////////////////////////////////////////////////
public String extraEnd(String str) {
  String str1 = str.substring(str.length()-2);
  return(str1+str1+str1);
}

/////// firstTwo /////////////////////////////////////////////////////////////////
public String firstTwo(String str) {
  if(str.length()>=2)
   return str.substring(0,2);
  else
   return str;
}

/////// firstHalf ////////////////////////////////////////////////////////////////
public String firstHalf(String str) {
  String str1 = str.substring(0,str.length()/2);
  return str1;
}

/////// withoutEnd ///////////////////////////////////////////////////////////////
public String withoutEnd(String str) {
  return(str.substring(1,str.length()-1));
}

/////// comboString //////////////////////////////////////////////////////////////
public String comboString(String a, String b) {
  if(a.length()>b.length())
   return(b+a+b);
  else
   return(a+b+a);
}

/////// nonStart /////////////////////////////////////////////////////////////////
public String nonStart(String a, String b) {
  String str1 = a.substring(1,a.length());
  String str2 = b.substring(1,b.length());
  return str1+str2;
}

/////// left2 ////////////////////////////////////////////////////////////////////
public String left2(String str) {
  if(str.length() <2)
   return "";
  if(str.length() <3)
   return str;
  
  return str.substring(2, str.length())+str.substring(0,2);
}

/////// right2 ///////////////////////////////////////////////////////////////////
public String right2(String str) {
  return str.substring(str.length()-2)+str.substring(0,str.length()-2);
}

/////// theEnd ///////////////////////////////////////////////////////////////////
public String theEnd(String str, boolean front) {
  if(front){
   return(str.substring(0,1));
  }
  else
   return(str.substring(str.length()-1));
}

/////// withouEnd2 ///////////////////////////////////////////////////////////////
public String withouEnd2(String str) {
  String one="";
  if(str.length()<=2)
   return (one);
  else
   return(str.substring(1,str.length()-1));
}

/////// middleTwo ////////////////////////////////////////////////////////////////
public String middleTwo(String str) {
  String one = str.substring(((str.length()/2)-1), ((str.length()/2)+1));
  if(str.length()<=2)
   return str;
  else
   return one;
}

/////// endsLy ////////////////////////////////////////////////////////////////////
public boolean endsLy(String str) {
  if(str.length()>=2 && str.substring(str.length()-2).equals("ly"))
   return true;
  else
   return false;
}

/////// nTwice ////////////////////////////////////////////////////////////////////
public String nTwice(String str, int n) {
  String one = str.substring(0,n);
  String two = str.substring((str.length()-n),str.length());
  if(str.length()>=2)
   return one+two;
  else
   return str;
}

/////// twoChar ///////////////////////////////////////////////////////////////////
public String twoChar(String str, int index) {
  if(str.length()-1<=index || str.length()<=index ||index<=0)
   return str.substring(0,2);
  else
   return str.substring(index,index+2);
}

/////// middleThree ///////////////////////////////////////////////////////////////
public String middleThree(String str) {
  if(str.length()<3)
   return "";
  if(str.length()==3)
   return str;
  
  int len = str.length();
  int len2 = str.length()/2;
  
  return str.substring(len2-1, len2+2);
}

/////// hasBad ////////////////////////////////////////////////////////////////////
public boolean hasBad(String str) {
  if(str.equals("bad"))
   return true;
  else if(str.length()<=3)
   return false;
  else if(str.substring(0,3).equals("bad"))
   return true;
  else if(str.substring(1,4).equals("bad"))
   return true;
  else
   return false;
}

/////// atFirst ///////////////////////////////////////////////////////////////////
public String atFirst(String str) {
  if(str.length()<1)
   return "@@";
  else if(str.length()<2)
   return (str+"@");
  else
   return str.substring(0,2);
}

/////// lastChars /////////////////////////////////////////////////////////////////
public String lastChars(String a, String b) {
  if(a.length()<1 && b.length()<1)
   return "@@";
  else if(b.length()<=1)
   return a.substring(0,1)+"@";
  else if(a.length()<1)
   return "@"+b.substring(b.length()-1,b.length());
  else if(a.length()<=1)
   return a.substring(0,1)+b.substring(b.length()-1,b.length());
  else
   return a.substring(0,1)+b.substring(b.length()-1,b.length());
}

/////// conCat ////////////////////////////////////////////////////////////////////
public String conCat(String a, String b) {
  if(b.length()<1)
   return a;
  else if(a.length()<1)
   return b;
  else if(a.substring(a.length()-1).equals(b.substring(0,1)))
   return a.substring(0,a.length()-1)+b.substring(0,b.length());
  else
   return a+b;
}

/////// lastTwo //////////////////////////////////////////////////////////////////
public String lastTwo(String str) {
  if(str.length()<=1)
   return str;
  else
   return str.substring(0,str.length()-2)+str.substring(str.length()-1, str.length())+str.substring(str.length()-2, str.length()-1);
}
/////// seeColor //////////////////////////////////////////////////////////////////
public String seeColor(String str) {
  if(str.length()<=2)
   return "";

  if(str.substring(0,3).equals("red"))
   return "red";
  else if(str.length() > 3 && str.substring(0,4).equals("blue"))
   return "blue";
  else
   return "";
}

/////// frontAgain /////////////////////////////////////////////////////////////////
public boolean frontAgain(String str) {
  if(str.length()<=1)
   return false;
  else if(str.length()<=2)
   return true;
  else if (str.substring(0,2).equals(str.substring(str.length()-2)))
   return true;
  else
   return false;
}

/////// minCat /////////////////////////////////////////////////////////////////////
public String minCat(String a, String b) {
  if(a.length() == b.length()){
   return a + b;
  }
  else{
   if(a.length() > b.length()){
    return a.substring(a.length() - b.length(), a.length()) + b;
   }
   else{
    return a + b.substring(b.length() - a.length(), b.length());
   }
 }
}

/////// extraFront //////////////////////////////////////////////////////////////////
public String extraFront(String str) {
  if(str.length()<1)
   return str;
  else if(str.length()==1)
   return str.substring(0,1)+str.substring(0,1)+str.substring(0,1);
  else
   return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
}

/////// without2 ////////////////////////////////////////////////////////////////////
public String without2(String str) {
  if(str.length() == 1)
   return str.substring(0,1);
  if(str.length()<3)
   return "";
   
  if(str.substring(0,2).equals(str.substring(str.length()-2)))
   return str.substring(2,str.length());
  else
   return str;
}

/////// deFront //////////////////////////////////////////////////////////////////////
public String deFront(String str) {    
  
  for(int i=0;i<str.length();i++){
   if(str.substring(0,1).equals("a") && str.substring(1,2).equals("b"))
    return str;
   
   else if(!str.substring(0,1).equals("a") && !str.substring(1,2).equals("b"))
    return str.substring(2,str.length());
   
   else if(!str.substring(0,1).equals("a"))
    return str.substring(1,str.length());
   
   //else if(str.substring(0,1).equals("a"))
    //return str.substring(0,1)+str.substring(2,str.length());
   
   else if(!str.substring(1,2).equals("b"))
    return str.substring(0,1)+str.substring(2,str.length());
    
   //else if(str.substring(1,2).equals("b"))
    //return str.substring(1,str.length());
  }
  return str;
  
}

/////// startWord //////////////////////////////////////////////////////////////////////
public String startWord(String str, String word) {
 if(str.length() >= word.length()){
  if(str.substring(1, word.length()).equals(word.substring(1, word.length())) || str.substring(0,word.length()).equals(word))
   return str.substring(0, word.length());
  
  else
   return "";
  
 
 }
  else
   return "";
  
 
}
/////// withoutX ///////////////////////////////////////////////////////////////////////
public String withoutX(String str) {
  
  if(str.length()<1)
   return "";
  
  if(str.length() == 1 && str.substring(0,1).equals("x"))
   return "";
  

   if(str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x"))
    return str.substring(1,str.length()-1);
   else if(str.substring(0,1).equals("x"))
    return str.substring(1,str.length());
   else if(str.substring(str.length()-1).equals("x"))
    return str.substring(0,str.length()-1);

  return str;
}

/////// withoutX2 //////////////////////////////////////////////////////////////////////
public String withoutX2(String str) {
  if(str.length()<2)
   return "";
  else if(str.substring(0,1).equals("x") && str.substring(1,2).equals("x"))
   return str.substring(2,str.length());
  else if(str.substring(0,1).equals("x"))
   return str.substring(1,str.length());
  else if(str.substring(1,2).equals("x"))
   return str.substring(0,1)+ str.substring(2,str.length());
  else
   return str;
}
