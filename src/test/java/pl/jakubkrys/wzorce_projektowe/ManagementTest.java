package pl.jakubkrys.wzorce_projektowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagementTest {

    @Test
    public void checkIsSame(){
        Management management1 = Management.getInstance();
        Management management2 = Management.getInstance();
        assertSame(management1,management2);
    }
}
