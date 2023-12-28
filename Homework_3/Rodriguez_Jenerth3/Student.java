package HW.HW3.Assignment3Files;

//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String firstName, String lastName, Address home,
                   Address school)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      homeAddress = home;
      schoolAddress = school;
   }
   
   public String getFirstName()
   {
      return firstName;
   }   
   
   public String getLastName()
   {
      return lastName;
   }   
   
   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;

      return result;
   }
}