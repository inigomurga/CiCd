package io.github.inigomurga.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greetReturnsHolaMundo() {
        assertEquals("Hola, Mundo", App.greet("Mundo"));
    }

    @Test
    void greetFallbackWhenBlank() {
        assertEquals("Hola", App.greet(" "));
        assertEquals("Hola", App.greet(null));
    }
}
