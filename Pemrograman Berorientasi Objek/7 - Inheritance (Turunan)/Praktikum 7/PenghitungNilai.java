import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

class GradedActivity {
    double score;
    String name;

    public GradedActivity() {
    }

    public GradedActivity(String a) {
        this.name = a;
    }

    public void setScore(double b) {
        score = b * 100;
    }

    public double getScore() {
        return score;
    }

    public char getGrade(){
        if (score >= 85) {
            return 'A';
        }
        else if (score < 85 && score >= 75) {
            return 'B';
        }
        else if (score < 75 && score >= 60) {
            return 'C';
        }
        else if (score < 60 && score >= 50) {
            return 'D';
        }
        else if (score < 50) {
            return 'E';
        }
        else {
            return 0;
        }
    }
}

class FinalExam extends GradedActivity {
    int numberOfQuestions;
    int numberMissed;
    double pointsPerQuestion;

    public FinalExam(int questions, int missed) {
        this.numberOfQuestions = questions;
        this.numberMissed = missed;
    }

    public double getPointsPerQuestion() {
        pointsPerQuestion = (double) (numberOfQuestions - numberMissed) / (double) numberOfQuestions;
        return pointsPerQuestion;
    }

    public int getNumberMissed() {
        return numberMissed;
    }
}

class PassFailActivity extends GradedActivity {
    double minimumPassingScore;

    public PassFailActivity(double min) {
        this.minimumPassingScore = min;
    }

    public char getGrade(){
        if (getScore() >= 85) {
            return 'A';
        } 
        else if (getScore() < 85 && getScore() >= 75) {
            return 'B';
        } 
        else if (getScore() < 75 && getScore() >= 60) {
            return 'C';
        } 
        else if (getScore() < 60 && getScore() >= 50) {
            return 'D';
        } 
        else if (getScore() < 50) {
            return 'E';
        }
        else {
            return 0;
        }    
    }
}

class PassFailExam extends PassFailActivity {
    int numberOfQuestions;
    double pointsPerQuestion;
    int numberMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        this.numberOfQuestions = questions;
        this.numberMissed = missed;
    }

    public double getPointsEach() {
        pointsPerQuestion = (double) (numberOfQuestions - numberMissed) / (double) numberOfQuestions;
        return pointsPerQuestion;
    }

    public int getNumMissed() {
        return numberMissed;
    }
}

public class PenghitungNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.println("");
        System.out.print("Masukkan jumlah soal: ");
        int soal = input.nextInt();
        System.out.print("Masukkan jumlah soal yang salah: ");
        int salah = input.nextInt();
        System.out.println("");

        FinalExam exam = new FinalExam(soal, salah);
        exam.setScore(exam.getPointsPerQuestion());

        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + exam.getScore());
        System.out.println("Grade: " + exam.getGrade());
        System.out.println("");

        if (exam.getScore() < 75) {
            System.out.println("Siswa ini dinyatakan remidi.");
            System.out.println("");
            System.out.print("Masukkan jumlah soal remidi: ");
            int soalRemidi = input.nextInt();
            System.out.print("Masukkan jumlah soal yang salah: ");
            int salahRemidi = input.nextInt();
            System.out.println("");

            PassFailExam remidi = new PassFailExam(soalRemidi, salahRemidi, 75);
            remidi.setScore(remidi.getPointsEach());
            exam.setScore(exam.getScore() + remidi.getScore());

            System.out.println("Nama: " + nama);
            System.out.println("Nilai Remidi: " + remidi.getScore());
            System.out.println("Grade Remidi: " + remidi.getGrade());
            String menu = input.nextLine();
        }
        else {
            System.out.println("Siswa ini dinyatakan lulus.");
        }
    }
}