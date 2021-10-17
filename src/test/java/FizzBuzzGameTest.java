import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    public void should_return_int_string_when_input_is_1(){
        // Given
        int digit = 1;
        // When
        String result = FizzBuzzGame.handleSingleDigit(digit);
        // Then
        assertEquals("1", result);
    }

}