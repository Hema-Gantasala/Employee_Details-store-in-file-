final class Clerk extends Employee
{
    
     Clerk()
     {
      sal=20000;
      Designation="Clerk";
     }    
  
    public void raiseSal()
     {
        sal=sal+(sal*10)/100;
        
      }
  }   
