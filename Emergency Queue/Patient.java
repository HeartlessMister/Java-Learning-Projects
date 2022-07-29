public class Patient implements Comparable<Patient>{
    private String name;
    private String complain;

    private int priority;

    public Patient(String name, String complain){

        this.name = name;
        this.complain = complain;

        if (complain.equals("appendicitis")){
            this.priority = 1;
        }else if(complain.equals("scald")){
            this.priority = 2;
        }
        else if(complain.equals("headache")){
            this.priority = 3;
        }else {

            this.priority = 4;
        }}

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", complain='" + complain + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Patient patient) {

        if (this.priority > patient.priority) {
            return 1;
        } else if (this.priority < patient.priority) {
            return -1;
        } else {
            return 0;
        }
    }}





