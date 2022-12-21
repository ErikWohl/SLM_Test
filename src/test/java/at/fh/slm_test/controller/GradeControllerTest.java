package at.fh.slm_test.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeControllerTest {

    @Test
    void calculateGrade1From90Percentage() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der KLasse anlegen die ich testen will)
        var controller = new GradeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.getGradeFromPercentage(90);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht
        Assertions.assertEquals(1, result);
    }

    @Test
    void calculateGrade5From49Percentage() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der KLasse anlegen die ich testen will)
        var controller = new GradeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.getGradeFromPercentage(49);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht
        Assertions.assertEquals(5, result);
    }

    @Test
    void calculateGrade4From51Percentage() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der KLasse anlegen die ich testen will)
        var controller = new GradeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.getGradeFromPercentage(51);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht
        Assertions.assertEquals(4, result);
    }

    @Test
    void calculateGrade3From65Percentage() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der KLasse anlegen die ich testen will)
        var controller = new GradeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.getGradeFromPercentage(65);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht
        Assertions.assertEquals(3, result);
    }
    @Test
    void calculateGrade2From77Percentage() {
        // A - Arrange (vorbereiten, d.h. eine Instanz der KLasse anlegen die ich testen will)
        var controller = new GradeController();

        // A - Act (Test ausführen, d.h. die Methode mit Testdaten ausführen)
        var result = controller.getGradeFromPercentage(77);

        // A - Assert (Vergleichen, ob das Ergebnis der Erwartung entspricht
        Assertions.assertEquals(2, result);
    }
}