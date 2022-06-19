package i18nTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    @Test
    public void testLocale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String expGreetingRuss = "Добро пожаловать";
        String actualRuss = localizationService.locale(Country.RUSSIA);

        String expGreetingUs = "Welcome";
        String actualUs = localizationService.locale(Country.USA);

        Assertions.assertEquals(expGreetingRuss, actualRuss);
        Assertions.assertEquals(expGreetingUs, actualUs);
    }
}
