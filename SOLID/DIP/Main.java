package LLD.SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Devoloper frontEndDev = new FrontEnd();
        project.writeCode(frontEndDev);

        Devoloper backEndDev = new BackEnd();
        project.writeCode(backEndDev);
    }
}


/*
 In this case we reduce the dependency Between Low Level Module (FrontEnd & Backend) with the
 High Level Module (project),

 So in this case we directly use a developer interface and FE & BE class implements the interface
 and we pass the object of developer object in the project class function

 so we can use the FE & BE whenever it will be required by using the object so dependency of project class
 among FE && BE will be reduced
*/