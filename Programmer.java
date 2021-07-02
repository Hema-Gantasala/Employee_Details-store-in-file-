final class Programmer extends Employee
{
   Programmer()
      {
        sal=100000;
        Designation="Programmer";
      }
   
    public void raiseSal()
     {
        sal=sal+(sal*10)/100;
         
      }
  }
