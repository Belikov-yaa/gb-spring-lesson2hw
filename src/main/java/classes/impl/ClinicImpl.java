package classes.impl;

import classes.Clinic;
import classes.Doctor;
import classes.DoctorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("clinic")
public class ClinicImpl implements Clinic {
    //    private List<Doctor> doctorList = new ArrayList<>();

    private Doctor doctor;

    @Autowired
    @Qualifier("surgeon")
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void doDoctorVisit() {
        System.out.println("Пришли на прием к:" + doctor.getClass().getName());
        doctor.healMe();
    }
}
