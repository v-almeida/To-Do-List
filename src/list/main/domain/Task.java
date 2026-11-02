package domain;

public class Task {

    private String name;
    private String description;
    private boolean completed = false;

    public Task(String name, String description){
        this.name = name;
        this.description = description;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void completeTask(){
        this.completed = true;
    }

}
