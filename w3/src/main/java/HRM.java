public class HRM {
    // check valid or invalid
    public boolean validAge (Age age) {
        return age.getAge() >= 0 && age.getAge() <= 99;
    }

    //check to hire
    public String hrm (Age age) {
            if (validAge(age) && (age.getAge() <=15 || age.getAge() >= 55)) {
                return "Khong thue";
            } else if (age.getAge() == 16 || age.getAge() == 17) {
                return "Thue dang ban thoi gian";
            } else if (age.getAge() >=18 && age.getAge() <= 54) {
                return "Thue toan thoi gian";
            } else {
                return "Khong hop le";
            }
    }
}