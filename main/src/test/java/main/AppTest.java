package test;

import main.App;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void testHello() {
        assertEquals("Hello World", app.Hello());
    }

    @Test
    public void testHelloWithParam() {
        assertEquals("Hello Test", app.Hello("Test"));
    }
}

