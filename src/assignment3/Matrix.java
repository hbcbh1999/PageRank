package assignment3;

public class Matrix {
	
	//Vector is actually a row vector so we use the transpose of it
	public static double[] MatrixDotVector(double[][] matrix, double[] vector){
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		if(numCols != vector.length) return null;
		double[] result = new double[numCols];
		for(int i = 0; i < numRows; i++){
			result[i] = dotVector(matrix[i],vector);
		}
		return result;
	}
	
	//Dot product of two arrays
	public static double dotVector(double[] left, double[] right){
		int size = left.length;
		if(size != right.length) return -1;
		double result = 0.0;
		for(int i = 0; i < size; i++){
			result = result + left[i]*right[i];
		}
		return result;
	}
	
	//Makes sure the components of the matrices column vector sum to one
	public static void constrainSumToOne(double[][] matrix){
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		for(int i = 0; i < numCols; i++){
			//Find the sum of the column vector
			double sum = 0.0;
			for(int j = 0; j < numRows; j++){
				sum = sum + matrix[j][i];
			}
			if(sum != 0.0){
				//Divide each element by the sum
				for(int j = 0; j < numRows; j++){
					matrix[j][i] = matrix[j][i]/sum;
				}
			}
		}
	}
	
	public static void constMultVector(double scalar, double[] vector){
		int size = vector.length;
		for(int i = 0; i < size; i++){
			vector[i] = scalar*vector[i];
		}
	}
	
	public static double[] makeVector(int size, double value){
		double[] ar = new double[size];
		for(int i = 0; i < size; i++){
			ar[i] = value;
		}
		return ar;
	}
}
