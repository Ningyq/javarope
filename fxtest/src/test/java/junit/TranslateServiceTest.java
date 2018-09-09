package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
public class TranslateServiceTest {
    private TranslateService translator;

    @BeforeEach
    void setup() {
        translator = new TranslateService();
    }

    @Test
    void testTranslateHello() {
        assertEquals("Bonjour", translator.translate("Hello"));
    }

    @Test
    void testTranslateHelloWithUpperCase() {
        assertEquals("Bonjour", translator.translate("HELLO"));
    }

    @Test
    void testTranslateThankyou() {
        assertEquals("Merci", translator.translate("ThanK You"));
    }

    @Test
    void TestWordNotFound() {
        assertEquals("Not found", translator.translate("characteristics"));
    }

    @Test
    void testEmptyWord() {
        assertThrows(IllegalArgumentException.class, () -> {
            translator.translate("");
        });
    }

    @Test
    void testEmptyWord1() {
        Throwable ex = assertThrows(IllegalArgumentException.class, () -> {
            translator.translate("");
        });
        assertEquals("Translating text is not blank", ex.getMessage());
    }
}
