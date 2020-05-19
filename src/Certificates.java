class StudentResults{
    private String Full_Name;

    StudentResults() {
        Full_Name = "No Name Given";
    }
    String fullName(String aName) {
        if (aName.equals("Bill Gates")) { aName="BG";}
        if (aName.equals("Bill Clinton")) {aName="BC";}
        Full_Name = aName;
    return Full_Name;
    }
}

public class Certificates extends StudentResults {
    private String certificate;

    Certificates(){
        super();
        certificate = "No Certificate Awarded";
    }
}


class ExamDetails{
    public static void main(String[] args){
       StudentResults aStudent = new StudentResults();
       String sName = aStudent.fullName("Bill Gates");
       
       System.out.println(sName);
    }
}