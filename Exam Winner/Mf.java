public class Mf extends Candidate{


    public Mf(String name, int turkish, int mathematics, int biology, int chemistry, int physics, int english, int literature, int geography, int history) {
        super(name, turkish, mathematics, biology, chemistry, physics, english, literature, geography, history);
    }

    @Override
    public int calculatePoint() {
        return getTurkish() *2+ getMathematics()*5+ getBiology()*3+ getChemistry()*3+ getPhysics()+1* getEnglish();
    }
}
