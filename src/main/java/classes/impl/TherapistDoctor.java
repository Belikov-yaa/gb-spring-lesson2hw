package classes.impl;

import classes.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("therapist")
public class TherapistDoctor implements Doctor {
    @Override
    public void healMe() {
        System.out.println("Терапевт полечит тебя");
    }
}
