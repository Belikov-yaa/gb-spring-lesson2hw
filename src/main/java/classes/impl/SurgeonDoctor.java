package classes.impl;

import classes.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("surgeon")
public class SurgeonDoctor implements Doctor {

    @Override
    public void healMe() {
        System.out.println("Хирург полечит тебя");
    }
}
