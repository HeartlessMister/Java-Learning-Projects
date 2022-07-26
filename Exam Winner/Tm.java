public class Tm extends Candidate{




    public Tm(String name, int turkish, int mathematics, int biology, int chemistry, int physics, int english, int literature, int geography, int history) {
        super(name, turkish, mathematics, biology, chemistry, physics, english, literature, geography, history);
    }

    @Override
    public int calculatePoint() {
        return getTurkish() *5+ getMathematics()*3+ getEnglish()*2 +getLiterature()*5+getGeography()*2+getHistory()*2;
    }
}
