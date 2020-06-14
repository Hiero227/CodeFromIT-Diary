import java.util.Random;

public class Matrix {
	String baseMatrix="";		//First matrix
	String additionMatrix="";	//Matrix that will be added to First matrix (variable name = baseMatrix)
	String sumMatrix="";										//Result matrix
	
	
	
	public String MatrixAdd() { 								//Function that will generate matrices
		Random r = new Random();								//Random number generator initialized
		int generated;											//Variable that will hold a generated number from Random generator
		int temp;												//Variable that will hold a sum of two generated numbers								
		for(int i = 1 ; i < 10 ; i++) {							//For loop
			generated = r.nextInt(10);							//First number from Random class is assigned to generated variable
			temp = generated;									//First random generated number is assigned to temp variable
		    baseMatrix += generated + " ";						//First number is added to baseMatrix
		    generated = r.nextInt(10);							//Second number from Random class is assigned to generated variable
		    temp += generated;									//Second random generated number is added to temp variable
		    additionMatrix = additionMatrix + generated + " ";	//Second number is added to additionMatrix
		    sumMatrix += temp + " ";							//Sum of two previously generated numbers is added to sumMatrix
		    if(i==3||i==6) {									//Checking if current number that was generated is on the end of a row
		    	baseMatrix +="\n";								//
		    	additionMatrix +="\n";							//   Simulating enter or end of the row
		    	sumMatrix +="\n";								//
		    }
		    
		}
		return "The first generated matrix: "+"\n"+baseMatrix+"\n"+"plus the second generated matrix: "+"\n"+additionMatrix+"\n"+"Equals this matrix: "+"\n"+sumMatrix;
				//Output
	}	
	
	
	
	
}
