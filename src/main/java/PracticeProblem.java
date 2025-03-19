public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[]array, int number){
		for(int i = 0; i < array.length; i++){
			if(array[i] == number){
				return i;
			}
		}
		return -1;
	}
	
	public static int findLast(String[] array, String string){
		for(int i = array.length-1; i >= 0; i--){
			if(array[i].equals(string)){
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] array, char character){
		int index = -1;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == character && count < 2){
				index = i;
				count += 1;
			}
		}
		return index;
	}

}
