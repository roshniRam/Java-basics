import java.io.*;
import java.util.*;
class ReadWrite{
	public static void main(String[] args) {
		ArrayList<String> id = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> cpi = new ArrayList<Double>();

         try{ 
         	  String s=null;
	          BufferedReader br = new BufferedReader(new FileReader("\\C:\\Users\\Dell\\Desktop\\Java\\cpi14.csv"));
	         // File file=new File("\\C:\\Users\\Dell\\Desktop\\Java\\cpi14.csv");
	          //if()
 
               while((s=br.readLine())!=null){
               	String[] content=s.split(",");
               	System.out.println(" [ID= " + content[0] + " , name=" + content[1] + " , cpi="+ content[2]+ "]");

                id.add(content[0]);
                names.add(content[1]);
                double c= Double.parseDouble(content[2]);
                cpi.add(c);
               }
	        }
	      catch(Exception e){
	      System.out.println(e);
	      }
	      double average=0,sum=0;
	      
	      double max=cpi.get(0);

	     for(int i=0;i<cpi.size();i++)
	        {
	        	if(cpi.get(i)>max)
	        		max=cpi.get(i);
	        	sum+=cpi.get(i);
            }

          System.out.println("The average cpi of the batch is "+ (sum/cpi.size()));
	    
          int i=0;
          while(i<cpi.size())
          {
          	if(max==cpi.get(i))
          		break;
          	else
          		i++;
          }
           
          System.out.println("The student named "+names.get(i)+ " id "+ id.get(i) + " has scored highest cpi of "+cpi.get(i));
	    }
	}