public abstract class Candidate {
    private String name;
    private int turkish;
    private int mathematics;
    private int english;
    private int biology;
    private int chemistry;
    private int physics;
    private int literature;
    private int geography;
    private int history;


    public Candidate(String name, int turkish, int mathematics, int biology, int chemistry, int physics, int english, int literature, int geography, int history) {
        this.name = name;
        this.turkish = turkish;
        this.mathematics = mathematics;
        this.biology = biology;
        this.chemistry = chemistry;
        this.physics = physics;
        this.english = english;
        this.literature = literature;
        this.geography = geography;
        this.history = history;
    }

    public abstract int calculatePoint();

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTurkish() {
        return turkish;
    }

    public void setTurkish(int turkish) {
        this.turkish = turkish;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
