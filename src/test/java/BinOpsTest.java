import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinOpsTest {
    private BinOps binOps;

    @BeforeEach
    void setUp(){
        binOps = new BinOps();
    }

    @ParameterizedTest
    @MethodSource("getArgsSum")
    void sum(String a, String b, String expected) {
        Assertions.assertEquals(binOps.sum(a, b), expected);
    }

    private static Stream<Arguments> getArgsSum() {
        return Stream.of(
                Arguments.of("1100", "100110", "110010")
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsMult")
    void mult(String a, String b, String expected) {
        Assertions.assertEquals(binOps.mult(a, b), expected);
    }

    private static Stream<Arguments> getArgsMult() {
        return Stream.of(
                Arguments.of("1100", "100110", "111001000")
        );
    }
}
