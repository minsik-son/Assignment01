import java.util.Locale;

public class Name {
    private String first;
    private String last;

    public Name(String first, String last){
        this.first = first;
        this.last = last;
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public String getPrettyName(){
        String prettyName;
        String tmpFirst = first.toLowerCase();
        String tmpLast = last.toLowerCase();
        prettyName = tmpFirst.substring(0, 1).toUpperCase() +
                     tmpFirst.substring(1) +
                     tmpLast.substring(0, 1).toUpperCase() +
                     tmpLast.substring(1);
        return prettyName;
    }

    public String getInitials(){
        return first.substring(0,1).toUpperCase() +
                "." +
                last.substring(0, 1).toUpperCase() +
                ".";
    }


}
