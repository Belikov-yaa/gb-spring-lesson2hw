package classes.impl;

import classes.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("psychologist")
public class PsychologistDoctor implements Doctor {
    @Override
    public void healMe() {
        System.out.println("Психолог полечит тебя");
    }
}
