public class Date implements Comparable<Date>, Orderable<Date> {
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

    public int checkLastDate(int year, int month){
        int lastDate;
        switch (month){
            case 1:
                lastDate = 31;
                break;
            case 2:
                lastDate = 28;
                break;
            case 3:
                lastDate = 31;
                break;
            case 4:
                lastDate = 30;
                break;
            case 5:
                lastDate = 31;
                break;
            case 6:
                lastDate = 30;
                break;
            case 7:
                lastDate = 31;
                break;
            case 8:
                lastDate = 31;
                break;
            case 9:
                lastDate = 30;
                break;
            case 10:
                lastDate = 31;
                break;
            case 11:
                lastDate = 30;
                break;
            case 12:
                lastDate = 31;
                break;
        }
        return lastDate;
    }

    public Orderable next(){
        if(day)
    }

    public Orderable previous(){

    }
}
