package furama.util;


public class RegexInput {
    public static void checkId(String iD, String format) throws UserException {
        String regexId = format + "-\\d{4}";
        if (!iD.matches(regexId)) {
            throw new UserException("FormatId");
        }
    }

    public static void checkFullName(String fullName) throws UserException {
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
        if (!fullName.matches(regexName)) {
            throw new UserException("FormatFullName");
        }
    }

    public static void checkIdentify(String identify) throws UserException {
        String regexIdentify = "\\d{9}|\\d{12}";
        if (!identify.matches(regexIdentify)) {
            throw new UserException("FormatIdentify");
        }
    }

    public static void checkPhoneNumber(String phoneNumber) throws UserException {
        String regexPhoneNumber = "0[1-9][0-9]{8}";
        if (!phoneNumber.matches(regexPhoneNumber)) {
            throw new UserException("FormatPhoneNumber");
        }
    }

    public static void checkSalary(int salary) throws UserException{
        if(salary <= 0){
            throw new UserException("SalaryNotValid");
        }
    }
}

