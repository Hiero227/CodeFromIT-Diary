import java.util.Random;

public class Matrix {
	String matrix="";
	String matrix2="";
	String matresult="";
	int m1;
	int m2;
	int counter = 0;

	public Matrix() {

	}

	public String MatrixAdd() {
		for(int i=1;i<10;i++) {
			Random r = new Random();
			Random r2 = new Random();
			m1 = r.nextInt(10);
			m2 = r2.nextInt(10);
		    matrix = matrix+m1+" ";
		    matrix2 = matrix2+m2+" ";
		    matresult =matresult+(m1+m2)+" ";
		    if(counter==2||counter==5) {
		    	matrix +="\n";
		    	matrix2 +="\n";
		    	matresult +="\n";
		    }
		    counter ++;
		}
		
		
		return "The first generated matrix: "+"\n"+matrix+"\n"+"plus the second generated matrix: "+"\n"+matrix2+"\n"+"Equals this matrix: "+"\n"+matresult;
	}
}
