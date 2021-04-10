//Line method
//Kelly Mak
//April 8 2020
//Java
//=================
//required to determine the y and x intercept for the two pairs of coordinates
//=====================
//identifies - let x1,x2 represent the x coordinates (type integer)
//			  - let y1,y2 represent the y coordinates (type integer)
//			  - let let stop represent the begin/end program entered by user (type String)
//            - let le represent an object used for user input (type BufferedReader)
package assignment;
import java.io.*;//allow access to the doing within the io library
public class line { // start of line class
	public static void main(String[] args) throws IOException{ //main method header
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); //declaration and instantiation of a BufferedReader object
		String stop; //declare a String object data typed named stop
		System.out.println("Welcome, this is a program to help you find the y or x intercept from your coordinates. press a button to start. <enter stop to exit the program>");
		//requesting user to begin or end program
		stop = br.readLine(); // assign user input to the variable stop
		while (!stop.equals("stop")) { //while loop used to read the string variable
			line le= new line();
			double x1,x2,y1,y2;
			System.out.println("enter the first x - coordinate:");//requesting x coordinate
			x1 = le.getInput(); //receive input from getInput method
			System.out.println("enter the first y - coordinate:");//requesting x coordinate
			y1 = le.getInput();//receive input from getInput method
			System.out.println("enter the second x - coordinate:");//requesting x coordinate
			x2 = le.getInput();//receive input from getInput method
			System.out.println("enter the second y - coordinate:");//requesting x coordinate
			y2 = le.getInput();//receive input from getInput method
			System.out.println("("+x1+","+y1+"),("+x2+","+y2+")");//output the value of the coordinates
			le.line(x1, x2, y1, y2);//receive input from line method
		System.out.println("Do you wish to continue with this program? <press any button to continue or press stop to exit>");//requesting user input for exiting program
		stop = br.readLine();//read user input 
		}System.out.println("thank you for using this program. Please come again!:)");//output a message
	}
		public double getInput()throws IOException { //method for getting input for the coordinates
			double num;//declare an integer primitive data type named num
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));//Declaration and instantiation of a BufferedReader object
			while (true) {//while loop used to read try catch function
				try { // try and catch function used to read valid input
					num = Double.parseDouble(br.readLine());//assign user input to the variable of num
					break; //end loop
				}
				catch (NumberFormatException e){ //catch used to read invalid input
					System.out.println("I'm sorry. this is an invaild input.:( please try again. :)");//output a message
				}
			}return num;//return num to main method
		}
		private void line (double x1, double x2, double y1, double y2) {// method for determine variables' value
			double m = ((y2-y1)/(x2-x1)),b = y2-(m*x2); //declare variables for linear equation 
			if (x1 !=0&&x2!=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
				if (y1==0&&y2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the x intercept values are"+x1+" and "+x2);//output a message and values
				}
				else if (y1!=0&&y2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the x intercept value is "+x2);//output a message and values
				}
				else if (y1==0&&y2!=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the x intercept value is"+x1);//output a message and values
				}
				else if (y1!=0&&y2!=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("there isn't any x or y intercepts.");//output a message
				}
			}
			else if (x1 ==0 &&x2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
				if (y1!=0&&y2!=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the y intercept values are "+y1+" and "+y2);//output a message and values
				}
				else if (y1==0&&y2!=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the first pair of coordinate is on the origin. The y intercept value is"+y2);//output a message and values
				}
				else if (y1!=0&&y2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the second pair of coordinate is on the origin. The y intercet value is"+y1);//output a message and values
				}
				else if (y1 ==0&&y2==0) {
					System.out.println("they are on the origin.");
				}
			}
			else if (x1 ==0 && x2 !=0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
				if ((y1!=0 && y2 !=0) ||(y1==0&&y2!=0)) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the y intercept value is"+y1);//output a message and value
				}
				else if (y1!=0 && y2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the y intercept value is "+ y1+" and the x intercept value is "+x2);//output a message and value
				}
				else if (y1==0&&y2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the x intercept value is "+x2);//output a message and value
				}
			}
			else if (x1!= 0 &&x2==0) {// if statement for the values of x1,x2,y1 and y2 in different conditions
				if ((y1 ==0 &&y2 ==0) ||(y1==0 &&y2 !=0)) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("the x intercept value is "+x1+" The y intercept value is "+y2);//output a message and value
				}
				else if ((y1!=0&&y2==0) ||(y1!=0&&y2!=0)) {// if statement for the values of x1,x2,y1 and y2 in different conditions
					System.out.println("The y intercept value is "+y2);//output a message and value
				}
			}System.out.println("y= "+m+"x+"+b);//output a message and value
		}
}