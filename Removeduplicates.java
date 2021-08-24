package Week2.Day2;
public class Removeduplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0, i, j;
		String[] charArray = text.split(" ");
		String temp = null;
		// char[] charArray = text.toCharArray();
		for (i = 0; i < charArray.length-1; i++) {

			for (j = i; j < charArray.length-1; j++) {
				if (charArray[i].equals(charArray[j])) {
					temp = charArray[i];
					count++;
					//if (count > 1) {
						//System.out.println("");
					}
			
				}
			
			
		
		}
		
		if(count>1)
		{
			System.out.println(text.replace(temp, ""));

		}
	
		

	}

}
		

	



