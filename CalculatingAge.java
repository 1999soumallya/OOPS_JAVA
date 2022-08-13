import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
public class CalculatingAge {
   public static Date StringToDate(String dob) throws ParseException{
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException {
      Scanner sc = new Scanner(System.in);
      //Here we start insert the name of a person
      System.out.print("Enter your name: ");
      String name = sc.next();//Here we end insert the name of a person
      //Here we start insert the dob of a person
      System.out.print("Enter your date of birth (dd-MM-yyyy): ");
      String dob = sc.next();//Here we end insert the dob of a person
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate();
      Period period = Period.between(givenDate, LocalDate.now());
      System.out.print("Hello "+name+" your current age is: ");
      System.out.print(period.getYears()+" years "+period.getMonths()+" months and "+period.getDays()+" days");
      sc.close();
   }
}