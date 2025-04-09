public class CountSpaces {
    public static void main(String[] args) {
        // Step 1: Declare a String variable and store an inspirational quote
        String quote = "The only limit to our realization of tomorrow is our doubts of today.";
        
        // Step 2: Initialize a counter for spaces
        int spaceCount = 0;
        
        // Step 3: Loop through each character in the quote
        for (int i = 0; i < quote.length(); i++) {
            // If the character is a space, increment the counter
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        // Step 4: Display the total number of spaces in the quote
        System.out.println("The total number of spaces in the quote is: " + spaceCount);
    }
}

