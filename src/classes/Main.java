package classes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // AdministrativeEmployee
        AdministrativeEmployee admin = new AdministrativeEmployee("Sam Jonathan", "sam.jonathan@university.edu", 12345);
        admin.manageWork();
        System.out.println("Administrative staff member added: " + admin.getName() + " (Contact: " + admin.getEmail() + ")\n");

        // ResearchAssociate
        ResearchAssociate researcher = new ResearchAssociate("Dr. Senku", "senku@university.edu", 54321, "Computer Science");
        System.out.println("Research staff registered: " + researcher.getName() + ", Department: " + researcher.getFieldOfStudy());
        System.out.println(researcher.publishResearch() + "\n");

        // Lecturer
        Lecturer lecturer = new Lecturer("Prof. Xeno", "xeno@university.edu", 67890, "Mathematics");
        lecturer.teachCourse();
        System.out.println("Teaching faculty member: " + lecturer.getName() + ", Specialization: " + lecturer.getFieldOfStudy() + "\n");

        // Course
        Course mathCourse = new Course(1, "Advanced Calculus", 120.0f);
        Course csCourse = new Course(2, "Data Structures", 90.0f);
        lecturer.addCourse(mathCourse);
        lecturer.addCourse(csCourse);
        System.out.println("Academic offerings:");
        for (Course course : lecturer.getTaughtCourses()) {
            System.out.println("- " + course.getName() + " (Duration: " + course.getHours() + " hours)");
        }
        System.out.println();

        // Faculty
        Faculty cssFaculty = new Faculty("Computer Science Faculty", lecturer);
        System.out.println("Academic division established: " + cssFaculty.getName());
        System.out.println("Dean: " + cssFaculty.getDean().getName() + "\n");

        // Institute
        Institute researchInstitute = new Institute("AI Research Institute", "123 University Ave");
        researchInstitute.AddResearchAssociate(researcher);
        researchInstitute.AddResearchAssociate(lecturer);
        System.out.println("Research center created: " + researchInstitute.getName());
        System.out.println("Location: " + researchInstitute.getAddress());
        System.out.println("Research personnel count: " + researchInstitute.getResearchAssociates().size() + "\n");

        // Project
        Date startDate = new Date(System.currentTimeMillis());
        Date endDate = new Date(System.currentTimeMillis() + 365L * 24 * 60 * 60 * 1000);
        Project aiProject = new Project("Machine Learning Framework", startDate, endDate);
        Project webProject = new Project("University Portal", startDate, endDate);
        System.out.println("Research initiatives:");
        System.out.println("- " + aiProject.getName());
        System.out.println("- " + webProject.getName());
        System.out.println("Project timeline: " + aiProject.calculateDuration() + " days\n");

        // Participation
        Participation participation1 = new Participation(researcher, aiProject, 40);
        Participation participation2 = new Participation(lecturer, webProject, 20);

        aiProject.addParticipation(participation1);
        webProject.addParticipation(participation2);

        researcher.addParticipation(participation1);
        researcher.getProjects().add(aiProject);

        lecturer.addParticipation(participation2);
        lecturer.getProjects().add(webProject);

        System.out.println("Project assignments:");
        System.out.println("- " + participation1.getResearchAssociate().getName() + " contributing " +
                participation1.getHours() + " hours to " + participation1.getProject().getName());
        System.out.println("- " + participation2.getResearchAssociate().getName() + " dedicating " +
                participation2.getHours() + " hours to " + participation2.getProject().getName());

        System.out.println("\n=== Staff Statistics ===");
        System.out.println("Total personnel records: " + Employee.getCounter());

        System.out.println("\n=== Property Access Tests ===");

        // Employee getters/setters
        System.out.println("Administrator identification: " + admin.getSsNo());
        admin.setSsNo(11111);
        System.out.println("Updated administrator ID: " + admin.getSsNo());

        admin.setName("John Updated Smith");
        admin.setEmail("john.updated@university.edu");
        System.out.println("Modified administrator: " + admin.getName() + " (Updated contact: " + admin.getEmail() + ")");

        // Course getters/setters
        System.out.println("Mathematics course identifier: " + mathCourse.getId());
        mathCourse.setName("Advanced Mathematics");
        mathCourse.setHours(150.0f);
        System.out.println("Revised course: " + mathCourse.getName() + " (Extended duration: " + mathCourse.getHours() + " hours)");

        // ResearchAssociate getters/setters
        researcher.setFieldOfStudy("Artificial Intelligence");
        System.out.println("Researcher's new specialization: " + researcher.getFieldOfStudy());

        // Lecturer setters
        List<Course> newCourses = new ArrayList<>();
        newCourses.add(mathCourse);
        lecturer.setTaughtCourses(newCourses);
        System.out.println("Lecturer's course load after modification: " + lecturer.getTaughtCourses().size());

        // Faculty setters
        cssFaculty.setName("Updated Computer Science Faculty");
        cssFaculty.setDean(researcher);
        System.out.println("Modified academic division: " + cssFaculty.getName() + ", New head: " + cssFaculty.getDean().getName());

        // Institute setters
        List<ResearchAssociate> newAssociates = new ArrayList<>();
        newAssociates.add(researcher);
        researchInstitute.setResearchAssociates(newAssociates);
        System.out.println("Research center personnel after adjustment: " + researchInstitute.getResearchAssociates().size());

        // Project getters/setters
        aiProject.setName("Advanced AI Framework");
        System.out.println("Revised project title: " + aiProject.getName());
        System.out.println("Project completion date: " + aiProject.getEnd());

        Date newStartDate = new Date(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000); // 30 days ago
        aiProject.setStart(newStartDate);

        Date newEndDate = new Date(System.currentTimeMillis() + 180L * 24 * 60 * 60 * 1000); // 180 days later
        aiProject.setEnd(newEndDate);
        System.out.println("Adjusted project timeline: " + aiProject.calculateDuration() + " days");

        // Participation getters/setters
        participation1.setHours(50);
        System.out.println("Modified contribution hours: " + participation1.getHours());

        participation1.setResearchAssociate(lecturer);
        participation1.setProject(webProject);
        System.out.println("Updated project assignment: " + participation1.getResearchAssociate().getName() +
                " assigned to " + participation1.getProject().getName());

        // Employee counter setter
        admin.setCounter(10);
        System.out.println("Personnel counter after update: " + Employee.getCounter());

        System.out.println("\n=== Academic Publications ===");
        System.out.println(researcher.publishResearch());
        System.out.println(lecturer.publishResearch());
    }
}