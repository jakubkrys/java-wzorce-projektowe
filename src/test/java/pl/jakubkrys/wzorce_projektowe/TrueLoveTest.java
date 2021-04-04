package pl.jakubkrys.wzorce_projektowe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TrueLoveTest {

    @Test
    public void checkIsStillSame(){
        TrueLove girlfriend1 = TrueLove.getInstance();
        TrueLove girlfriend2 = TrueLove.getInstance();
        assertSame(girlfriend1,girlfriend2);
    }
}
