package Week2.Day1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare variables
		int input=123;
        int output=0;
        int rem;
    	
    	
    	// Implement FOR Loop
    	for (int i = input; i > 0; i = i / 10) {
    		// calculate the remainder by dividing the ‘input’ by 10
    		rem = i % 10;
    		output = output * 10 + rem;		

    	}

        
        
	//if statement to compare the output with the given input.
	
	if (input == output) {
		System.out.println("This is a palindrome");
	} else {
		System.out.println("This is not a palindrome");
	}
}

}


