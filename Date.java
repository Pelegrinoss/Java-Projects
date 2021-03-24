class date {

    private int day;
    private int month;
    private int year;

    public date(int d, int m, int y){
        setDate(d,m,y);
    }

    public void setDate(int d, int m, int y){
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    public void setDay(int d){
        day = ((d>=1 && d<31) ?d:1);
    }
    public void setMonth(int m){
        month = ((m>=1 && m<13) ?m:1);
    }
    public void setYear(int y){
        year = ((y>=1900 && y<2100) ?y:1900);
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public String toMilitary() {
        return String.format("%02d/%02d/%02d", getDay(), getMonth(), getYear());
    }

}
