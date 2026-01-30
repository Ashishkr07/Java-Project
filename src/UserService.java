public class UserService {

    public void onBoardUser(String name){
        UserRepository userRepository = new UserRepository();
        UserValidator userValidator = new UserValidator();
        EmailService emailService = new EmailService();
        userValidator.validate(name);
        userRepository.saveToDB(name);
        emailService.sendEmail(name);
    }
}
