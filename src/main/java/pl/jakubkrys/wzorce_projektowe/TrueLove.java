package pl.jakubkrys.wzorce_projektowe;

public class TrueLove {

    private static TrueLove girlfriend;

    private TrueLove (){}

    public static TrueLove getInstance() {
        if (girlfriend == null){
            girlfriend = new TrueLove();
        }
        return girlfriend;
    }
}
