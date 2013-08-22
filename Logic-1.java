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
