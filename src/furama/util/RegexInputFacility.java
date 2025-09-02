package furama.util;

public class RegexInputFacility {

    public static void checkIdFacility(String iD, String format) throws UserException {
        String regex = "SV" + format + "-\\d{4}";
        if (!iD.matches(regex)) {
            throw new UserException("FormatId");
        }
    }

    public static void checkTextFormat(String name) throws UserException {
        String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!name.matches(regex)) {
            throw new UserException("FormatName");
        }
    }

    public static void checkAreaPoolAndUse(double area) throws UserException {
        if (area < 30) {
            throw new UserException("AreaNotValid");
        }
    }

    public static void checkFeeRent(double fee) throws UserException {
        if (fee <= 0) {
            throw new UserException("FeeRentNotValid");
        }
    }

    public static void checkMaxPeople(int maxPeople) throws UserException {
        if (maxPeople < 0 || maxPeople > 20) {
            throw new UserException("MaxPeopleNotValid");
        }
    }

}
