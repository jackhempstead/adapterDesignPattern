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
public String getFirstName() {
    return record.getName();
}
public String getLastName() {
    return null;
}

public Date getBirthday() {
    return record.getBirthdate();
}
public Gender getGender() {
    Gender token; 
    token = record.getGender().toString();
    return token;
}

public void addVisit(Date date, boolean well, String description) {
    
}

public ArrayList<Visit> getVisitHistory() {
    return null;
}
public String toString() {
    return null;
}
}
