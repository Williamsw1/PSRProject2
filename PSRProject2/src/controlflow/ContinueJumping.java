package controlflow;
class ContinueJumping {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        
        int result=add();
        System.out.println("add value:"+result);
        

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }

	private static int add() {
		int a=80;
		int b=67;
		
		// TODO Auto-generated method stub
		return a+b;
	}
}