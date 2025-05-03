public class Date implements Orderable {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getYyyyMmDdd(){
        return year + "-" + month + "-" + day;
    }

    public String toString(){
        return year + "-" + month + "-" + day;
    }
}
