class Datecalulate
{
    static int VALID_YEAR = 9999;
    static int STARTING_YR = 1800;
    static boolean isLeap(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
    static boolean isValidDate(int d,int m,int y)
    {
        if (y > VALID_YEAR || y < STARTING_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;
        if (m == 2)
        {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }
        if (m == 4 || m == 6 || m == 9 || m == 11)
            return (d <= 30);
        if (m==1 || m==3 || m==5 || m==7 || m==8|| m==10 || m==12)
            return(d<=31);
        return true;
    }
    public static void main(String[] args)
    {
        if (isValidDate(31, 12, 2000)){
            System.out.println("The date is valid");
        }
        else
            System.out.println("The date is not valid");
 
        if (isValidDate(31, 11, 2000))
            System.out.println("The date is valid");
        else
            System.out.println("The date is not valid");
    }
}