
package hospital.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class MedicalRecord {
    private int id;
    private Patient patient;
    private LocalDate createdDate;
    
    
    private List<Diagnosis> diagnosis = new ArrayList<>();
    private List<Treatment> treatment = new ArrayList<>();
    private List<LaboratoryTest> laboratoryTests = new ArrayList<>();
    private List<Prescription> prescription = new ArrayList<>();
    private List<Admission> admission = new ArrayList<>();
    
    public MedicalRecord() {
        
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public List<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public List<Treatment> getTreatment() {
        return treatment;
    }

    public List<LaboratoryTest> getLaboratoryTests() {
        return laboratoryTests;
    }

    public List<Prescription> getPrescription() {
        return prescription;
    }

    public List<Admission> getAdmission() {
        return admission;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDiagnosis(List<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(List<Treatment> treatment) {
        this.treatment = treatment;
    }

    public void setLaboratoryTest(List<LaboratoryTest> laboratoryTests) {
        this.laboratoryTests = laboratoryTests;
    }

    public void setPrescription(List<Prescription> prescription) {
        this.prescription = prescription;
    }

    public void setAdmission(List<Admission> admission) {
        this.admission = admission;
    }
    
   
}
