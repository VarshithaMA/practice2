public class ggg{
    public static void main(String[]args){
        System.out.println("hj");
    }
}
package expp.expp;
		import java.io.FileReader;

		import org.json.simple.JSONObject;
		import org.json.simple.parser.JSONParser;

		public class example {

		    public static void main(String[] args) throws Exception {

		        JSONParser jsonparser = new JSONParser();

		        FileReader filereader = new FileReader(".\\jsonfile\\exp.json");

		        Object obj = jsonparser.parse(filereader);

		        JSONObject empobj = (JSONObject) obj;

		        String fname = (String) empobj.get("firstname");
		        String lname = (String) empobj.get("secondname");

		        System.out.println(fname);
		        System.out.println(lname);
		    }
		

}
