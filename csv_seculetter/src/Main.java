import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GoCSV goCSV = new GoCSV("C:\\Users\\82105\\Desktop\\test.csv");
        String[] line=null;
        String benign="BENIGN";
        while((line = goCSV.nextRead())!=null){
            for(String a : line){
                System.out.print(a +"|");
                //System.out.println(line[0]+"|"+line[2]);
            }
        }
//        int count = 0 ;
//        for (int i = 0; i < line.length; i++) {
//            if(line[2]==benign){
//                count++;
//
//            }
//        }
//        System.out.println("3번째줄 : "+line[2]);
//        System.out.println(count);
    }
}