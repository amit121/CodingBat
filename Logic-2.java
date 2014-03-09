/////// makeBricks //////////////////////////////////////////////////////////////
public boolean makeBricks(int small, int big, int goal) {
  if(goal>big*5 +small) //fail 1 -- not enough bricks altogether
   return false;
  else if(goal % 5 > small) //fail 2 == not enough small bricks
   return false;
  else
   return true;  
}

/////// loneSum /////////////////////////////////////////////////////////////////
public int loneSum(int a, int b, int c) {
  if(a==b && b==c && a==c)
   return 0;
  else if(a==b)
   return c;
  else if(a==c)
   return b;
  else if(b==c)
   return a;
  else
   return a+b+c;
}
