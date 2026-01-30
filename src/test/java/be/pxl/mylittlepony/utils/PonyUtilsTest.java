package be.pxl.mylittlepony.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PonyUtilsTest {

    @Test
    void addOnlyIfPos_shouldAddIfOnlyPositive() {
        var result = PonyUtils.addOnlyIfPos(1, 2);

        assertThat(result).isEqualTo(3);
    }
}
