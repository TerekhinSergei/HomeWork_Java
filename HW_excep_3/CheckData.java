package hw_excep_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class CheckData {
    public static int dataCount = 6;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthDay;
    private long phone;
    private Gender gender;

    public void CheckInputData(String[] splitedString) throws InputDataException {
        if (splitedString == null) {
            throw new NullPointerException("Данные не введены");
        }

        StringBuilder errorsMessages = new StringBuilder();
        for (String string : splitedString) {
            if (Character.isLetter(string.charAt(0))) {
                if (string.length() == 1) {
                    if (this.gender == null) {
                        try {
                            this.gender = checkGender(string);
                        } catch (GenderException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else {
                        errorsMessages.append("Пол указан несколько раз\n");
                    }
                } else {
                    if (this.lastName == null) {
                        try {
                            this.lastName = checkName(string);
                        } catch (NameException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else if (this.firstName == null) {
                        try {
                            this.firstName = checkName(string);
                        } catch (NameException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else if (this.patronymic == null) {
                        try {
                            this.patronymic = checkName(string);
                        } catch (NameException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else {
                        errorsMessages.append("Много элементов ФИО. Двойные фамилии надо писать через дефис\n");
                    }
                }
            } else {

                if (string.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}")) {
                    if (this.birthDay == null) {
                        try {
                            this.birthDay = checkBirthDay(string);
                        } catch (BirthDayException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else {
                        errorsMessages.append("Несколько данных по формату 'ДД.ММ.ГГГГ' распознаны как дата рождения'"
                                + this.birthDay + "','" + string + "'\n");
                    }
                } else {
                    if (this.phone == 0) {
                        try {
                            this.phone = (long) checkPhone(string);
                        } catch (PhoneException e) {
                            errorsMessages.append(e.getMessage());
                        }
                    } else {
                        errorsMessages.append("Допустим только один номер телефона: '"
                                + this.phone + "','" + string + "'\n");
                    }
                }

            }
        }
        if (!errorsMessages.isEmpty()) {
            throw new InputDataException(errorsMessages.toString());
        }
    }

    public String getLastName() {
        return lastName;
    }

    private String checkName(String inputString) throws NameException {
        if (inputString.toLowerCase().matches("^[a-zа-яё-]*$")) {
            return inputString;
        } else {
            throw new NameException(inputString);
        }
    }

    private LocalDate checkBirthDay(String inputString) throws BirthDayException {
        try {
            return LocalDate.parse(inputString,
                    DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(Locale.US));
        } catch (DateTimeParseException e) {
            throw new BirthDayException(inputString);
        }
    }
   
    private long checkPhone(String inputString) throws PhoneException {
        if (inputString.length() == 10) {
            try {
                return Long.parseLong(inputString);
            } catch (NumberFormatException e) {
                throw new PhoneException(inputString);
            }
        } else {
            throw new PhoneException(inputString);
        }
    }

    public enum Gender {
        m,
        f
    }

    private Gender checkGender(String inputString) throws GenderException {
        try {
            return Gender.valueOf(inputString);
        } catch (IllegalArgumentException e) {
            throw new GenderException(inputString);
        }
    }
    
    public String toString() {        
        String str =  "<"+ lastName +">" + "<"+ firstName +">" + "<"+ patronymic +">" + 
                    "<"+ birthDay.toString() +">" + "<"+ phone +">" + "<"+ gender +">";
        return str;
    }

}