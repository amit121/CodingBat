/////// makeBricks //////////////////////////////////////////////////////////////
public boolean makeBricks(int small, int big, int goal) {
  if(goal>big*5 +small) //fail 1 -- not enough bricks altogether
   return false;
  else if(goal % 5 > small) //fail 2 == not enough small bricks
   return false;
  else
   return true;  
}
