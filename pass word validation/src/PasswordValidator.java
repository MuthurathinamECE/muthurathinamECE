
public class PasswordValidator {
//	class PasswordValidator
	//{
	//        public PasswordValidator()
		{
	  //              super();
		}   

	        public static void main(String[]args){
	        {
	                PasswordValidator passwordValidator = new PasswordValidator();
	                
	                String userName = "Anandh";
	                String passWord = "java2011";
	                System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
	                
	                passwordValidator.passwordValidation(userName,passWord);
	                System.out.println();
	                passWord = "v2aLi5D@p9asp^";
	                System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
	                passwordValidator.passwordValidation(userName,passWord);
	        }}  
	        public void passwordValidation(String userName, String password){
	        {
	                boolean valid = true;
	                if (password.length() > 28 || password.length() < 8)
	                {
	                        System.out.println("Password should be less than 15 and more than 8 characters in length.");
	                        valid = false;
	                }
	                if (password.indexOf(userName) > -1)
	                {
	                        System.out.println("Password Should not be same as user name");
	                        valid = false;
	                }
	                String upperCaseChars = "(.*[A-Z]*.)";
	                if (!password.matches(upperCaseChars ))
	                {
	                        System.out.println("Password should contain atleast one upper case alphabet");
	                        valid = false;
	                }
	                String lowerCaseChars = "(.*[a-z].*)";
	                if (!password.matches(lowerCaseChars ))
	                {
	                        System.out.println("Password should contain atleast two lower case alphabet");
	                        valid = false;
	                }
	                String numbers = "(.*[0-9].*)";
	                if (!password.matches(numbers ))
	                {
	                        System.out.println("Password should contain atleast one number.");
	                        valid = false;
	                }
	                String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
	                if (!password.matches(specialChars ))
	                {
	                        System.out.println("Password should contain atleast one special character");
	                        valid = false;
	                }
	                if (valid)
	                {
	                        System.out.println("Password is valid.");
	                }
	        if (!valid)
            {
                System.out.println("Password is invalid.");
        }

	}
	
	
	
	
	
	}
}

