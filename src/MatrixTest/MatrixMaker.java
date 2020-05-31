import java.util.Random;

public class MatrixMaker {
	String matrix="";
	int counter=0;
   public MatrixMaker(){
	   
   }
   public String makeMatrix() {
	   for(int i=1;i<10;i++) {
		   Random r = new Random();
		   matrix=matrix+r.nextInt(10)+" ";
		   if(counter==2||counter==5) {
		   matrix+="\n";
		   }
		   counter++;
	   }
	   return matrix;
   }
}
