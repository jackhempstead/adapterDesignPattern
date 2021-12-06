import java.util.ArrayList;
import java.util.Date;

/**
 * BY Jack Hempstead 
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;
    
public MedicalRecordAdapter(HealthRecord record) {
    this.record = record;
}
/**
 * Using substring to get first part of name
 * @return
 */
public String getFirstName() {
    String temp = record.getName();
    int ret = temp.indexOf(" ");
    String first = temp.substring(0, ret);
    return first;
}
/**
 * Using part 2 of substring for last name
 * @return
 */
public String getLastName() {
    String temp = record.getName();
    int ret = temp.indexOf(" ");
    String last = temp.substring(ret + 1);
    return last;
}

public Date getBirthday() {
    return record.getBirthdate();
}
/**
 * Returning the appropriate enumeration of Gender as a String
 * @return
 */
public Gender getGender() {
    Gender token;
    if (record.getGender().equals("MALE")) {
        token = Gender.MALE;
    } else if (record.getGender().equals("FEMALE")) {
        token = Gender.FEMALE;
    } else {
        token = Gender.OTHER;
    }
    return token;
}
/**
 * Adds a visit to the arrayList
 * @param date
 * @param well
 * @param description
 */
public void addVisit(Date date, boolean well, String description) {
    record.addHistory(date, well, description);
}
/**
 * COuld not figure out how to get it from type Visit to String and gave up
 * @return
 */
public ArrayList<Visit> getVisitHistory() {
    ArrayList<Visit> token = null;
    ArrayList<String> temp = record.getHistory();
    // for (int i = 0; i < temp.size(); i++) {
    //     Visit ret = new Visit(temp.get(i));
    // }

    return token;
}
public String toString() {
    return null;
}
}
