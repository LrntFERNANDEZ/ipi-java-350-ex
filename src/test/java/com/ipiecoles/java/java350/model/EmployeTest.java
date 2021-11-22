package com.ipiecoles.java.java350.model;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    @Test
    void getNombreAnneeAncienneteWithDateEmbaucheNow() {
    //Given
    Employe employe = new Employe("Doe", "John", "T12345", LocalDate.now(), 2500d, 1, 1.0 );

    //When
    Integer nbAnnees = employe.getNombreAnneeAnciennete();

    //Then
    Assertions.assertThat(nbAnnees).isEqualTo(0);

    }

    @Test
    void getNombreAnneeAncienneteWithPastDateEmbauche() {
        //Given
        Employe employe = new Employe("Doe", "John", "T12345", LocalDate.now().minusYears(6), 2500d, 1, 1.0 );

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(6);

    }

    @Test
    void getNombreAnneeAncienneteWithFutureDateEmbauche() {
        //Given
        Employe employe = new Employe("Doe", "John", "T12345", LocalDate.now().plusYears(1), 2500d, 1, 1.0 );

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(0);

    }

    @Test
    void getNombreAnneeAncienneteWithDateEmbaucheNull() {
        //Given
        Employe employe = new Employe("Doe", "Jane", "T23456", null, 2500d, 1, 1.0 );

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isNull();

    }
}