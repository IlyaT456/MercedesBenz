package testMersedesBens;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;

public class MersedesBensTests extends BaseTest {

    BaseSteps baseSteps = new BaseSteps();

    @Test
    @DisplayName("Проверка соответствия главного меню")
    public void checkingComplianceMainMenu() {
        baseSteps.openMain()
                .selectDesiredSectionInMainMenu("ПРОДАЖИ")
                .selectDesiredSectionISubMenu("Автомобили в наличии")
                .checkingOperationTheCarsInStockSectionTheWebsite();
    }

    @Test
    @DisplayName("Сортеруем Mercedes Benz GLC по цене")
    public void sortingMercedesBenzGLKByPrice() {
        baseSteps.openMain();
    }
}
