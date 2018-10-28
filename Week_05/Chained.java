class NotElligible extends Exception{
        NotElligible(String s){
                super(s);
        }
}
class LowMarks extends Exception{
        LowMarks(String s){
                super(s);
        }
}
class LowAttendance extends Exception{
        LowAttendance(String s){
                super(s);
        }
}
public class Chained{
        public static void main(String args[]){
                int attendance=70,marks=20;
                NotElligible N=new NotElligible("Not Qualified");
                try{
                        if(attendance<90){
                                N.initCause(new LowAttendance("Attendance Not Enough: "+attendance));
                                throw N;
                        }
                        else if(marks<20){
                                N.initCause(new LowMarks("Marks Not Enough: "+marks));
                                throw N;
                        }

                }
                catch(NotElligible e){
                        System.out.println(e);
                        System.out.println(e.getCause());
                }
        }
}
