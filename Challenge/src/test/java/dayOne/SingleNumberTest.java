package dayOne;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber instance = new SingleNumber();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void singleNumber() {
        int[] nums = {4,1,2,1,2};
        assertEquals(4, instance.singleNumber(nums));
    }
}