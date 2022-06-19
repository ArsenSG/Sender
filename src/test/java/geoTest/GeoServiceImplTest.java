package geoTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoServiceImplTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("172.0.32.11", Country.RUSSIA),
                Arguments.of("96.44.183.149", Country.USA));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void testByIp(String ip, Enum expectedCountry) {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location actLocation = geoService.byIp(ip);

        assertEquals(expectedCountry, actLocation.getCountry());
    }

    @Test
    void testByCoordinates() {
        Throwable exception = assertThrows(
                RuntimeException.class,
                () -> {
                    throw new RuntimeException("Not implemented");
                }
        );
        assertEquals("Not implemented", exception.getMessage());
    }
}
