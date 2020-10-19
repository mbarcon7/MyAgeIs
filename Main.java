class Main
{
  public static void main(String[] args)
  {
    
    int myAge = 15;
    int myBirthday = 711;
    int todaysDate = 921;
    
    if(myBirthday == todaysDate)
    {
      System.out.print("It is my birthday.");
       myAge++;
    System.out.print(" I am now " + myAge + " years old.");  
    }else{
      System.out.print("It isn't my birthday.");
   
    System.out.println(" I am still " + myAge + " years old.");
    }
  }
}