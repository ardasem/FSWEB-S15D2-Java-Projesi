package entity;

public class Task {

    private String project;
    private String desc;
    private String assignee;
    private Priority priority;
    private Status status;


    public Task(String project, String desc, String assignee, Priority priority, Status status) {
        this.project = project;
        this.desc = desc;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
