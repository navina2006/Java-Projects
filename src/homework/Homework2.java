package homework;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee{
	String employeed;
	String attendanceStatus;
	Employee(String employeed,String attendanceStatus){
		this.employeed = employeed;
		this.attendanceStatus = attendanceStatus;
	}
}
class InvalidAttendanceException extends Exception{
	public InvalidAttendanceException(String message) {
		super(message);
	}
}
public class Homework2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> o = new ArrayList<>();
        o.add(new Employee("EMP001","PRESENT"));
        o.add(new Employee("EMP002","PRESENT"));
        o.add(new Employee("EMP003","PRESENT"));
        o.add(new Employee("EMP004","ABSENT"));
        o.add(new Employee("EMP005","LEAVE"));
        int presentCount =0;
		 int absentCount = 0;
		 int totalEmployees =0;
        try {
        FileOutputStream fos = new FileOutputStream("attendance_report.txt");
        for(Employee b : o) {
        	try {
        	if(b.attendanceStatus.equalsIgnoreCase("PRESENT")) {
        		presentCount++;
        		totalEmployees++;
        		String data = b.employeed + "," +b.attendanceStatus +"\n";
       		 fos.write(data.getBytes());
        	}
        else if(b.attendanceStatus.equalsIgnoreCase("ABSENT"))//|| b.attendanceStatus.equalsIgnoreCase("LEAVE")){
        		{
        		absentCount++;
          	totalEmployees++;
     	String data = b.employeed + "," +b.attendanceStatus +"\n";
		 fos.write(data.getBytes());
        }
		else//(b.attendanceStatus.equalsIgnoreCase("LEAVE")) {
		 {
			if(b.attendanceStatus.equalsIgnoreCase("LEAVE")) {
				absentCount++;
	          	totalEmployees++;
	          	String data = b.employeed + "," +b.attendanceStatus +"\n";
	       		 fos.write(data.getBytes());
			}
       throw new InvalidAttendanceException("Invalid Attendance");
        }
        	}
        
        	catch(InvalidAttendanceException e) {
        	 	System.out.println("Invalid record found : " +b.employeed +"," +b.attendanceStatus);
   			 
        		System.out.println("Skipping entry...");
        	}
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
	System.out.println("Attendance Summary:");
	System.out.println("Total Employees:" +totalEmployees);
    System.out.println("Present :" +presentCount);
    System.out.println("Absent :" +absentCount);
        }
	}
