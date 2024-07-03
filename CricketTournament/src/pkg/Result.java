
package pkg;


public class Result {
 String winTeam;
 String looseTeam;
 boolean runOrWicket;
 int winValue;
 @Override
 public String toString() {
 return "Result{" +
 "winTeam='" + winTeam + '\'' +
 ", looseTeam='" + looseTeam + '\'' +
 ", runOrWicket=" + runOrWicket +
 ", winValue=" + winValue +
 '}';
 }
 public void getResult(boolean runOrWicket, int winValue){
 if(runOrWicket)
 {
 System.out.println(winTeam+" won by "+winValue+" runs!");
 }
 else
 {
 System.out.println(winTeam+" won by "+winValue+"wickets!");
 }
 }
}