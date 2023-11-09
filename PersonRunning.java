class PersonRunning
{
	public static void main(String[] mail)
	{
		
		
		System.out.println("Starting main");
		
		String[] email= new String[4];
		
		email[0]=("email.com");
		email[1]=("gmail.com");
		email[2]=("yahoo.com");
		email[3]=("facebook.com");
		
		Person person = new Person(email);
		person.showInfo();
		
		System.out.println("Ending main");
	}

}