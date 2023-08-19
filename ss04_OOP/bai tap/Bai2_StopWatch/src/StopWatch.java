import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    public StopWatch() {
        startTime= LocalTime.now();
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime= LocalTime.now();
        System.out.println("Start at"+ startTime);
    }
    public void end(){
        this.endTime=LocalTime.now();
        System.out.println("End at: "+endTime);

    }
    public void getElapsedTime(){
        int elaspedTime= (startTime.toSecondOfDay()-endTime.toSecondOfDay())*100;
        System.out.println(" the ElaspedTime is: "+elaspedTime);
    }
}

