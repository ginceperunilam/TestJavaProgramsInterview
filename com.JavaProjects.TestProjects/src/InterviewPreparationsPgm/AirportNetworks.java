package InterviewPreparationsPgm;

public class AirportNetworks {
	public static int getCount(boolean[][] matrix) {
        int size = matrix.length;
	        boolean[] visited = new boolean[size];
	        int componentCount = 0;

           for (int i = 0; i < size; i++) {
	            if (!visited[i]) {
	                componentCount++;
	                search(matrix, visited, i, size);
	            }
	        }
    return componentCount - 1;
   }

    private static void search(boolean[][] matrix, boolean[] visited, int airport, int n) {
	        visited[airport] = true;

	        for (int i = 0; i < n; i++) {
	            if (matrix[airport][i] && !visited[i] && Math.abs(airport - i) > 1) {
	            	search(matrix, visited, i, n);
	            }
	        }
	    }

   public static void main(String[] args) {
       boolean[][] matrix = {
           {false, true, false, false, false},
           {true, false, false, false, false},
           {false, false, false, true, false},
           {false, false, true, false, false},
           {false, false, false, false, false}
       };
       System.out.println(getCount(matrix)); // should print 6
   }
}