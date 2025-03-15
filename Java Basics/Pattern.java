package firstPackage;

public class Pattern {
	public static void main(String[] args) {
		//11 12 22 21 20 10 00 01 02
		int n =3;
		int [][] matr = new int[3][3];
		int k =1;
		for(int i =0;i<3;i++) {
			 for(int j =0;j<3;j++) {
				 matr[i][j] =k;
				 k++;
			 }
//			 System.out.println();
		}
//		for(int i =0;i<3;i++) {
//			 for(int j =0;j<3;j++) {
//				 System.out.print(matr[i][j]);
//				 k++;
//			 }
//			 System.out.println();
//		}
		 for(int i =1; i<n;i++) {
			 for(int j=1;j<n;j++) {
				 if(i>j) {
					 System.out.print(i+""+j+" ");	 
					 
					
				 }
//					
				 else {
					
					 System.out.print(i+""+j+" ");
				 }
					
			 }
//			 System.out.println();
		 }
		 for(int i = 2;i>0;i--) {
			 for(int j=i-1;j>=0;j--) {
				 System.out.print(i+""+j+" ");
//				 matr[i][j] = k;
//			 	 k++;
			 }
//			 System.out.println();
		 }
		 for(int i =0; i<1;i++) {
			 for(int j =0;j<3;j++) {
//				 matr[i][j] = k;
//			 	 k++;
				 System.out.print(i+""+j+" ");
			 }
		 }
		
		
		
	}
	}
	
