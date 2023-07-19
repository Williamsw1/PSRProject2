package controlflow;

class ContinueJumping {
	
	static void add(int a2, int b2) {
		int a=80;
		int b=67;
		System.out.println("add value:"+(a+b));
		
		// TODO Auto-generated method stub
		//return a+b;
	}
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        int a=90;
        int b=80;
        add(a,b);
        
        

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }

	
}