import java.io.*;
import java.util.*;
class myfile{
	
	static List<String> datatype=new ArrayList<String>();	
	
	static String classname="",file_name="Polymorph1.java";
	static List<String> output=new ArrayList<String>();	
	public static void main(String[] args){
		String file;
		File f=new File(file_name);
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader(f));
			System.out.println("Rajvirsinh Mangrola");
			System.out.println("K00370820 \n");
		}
		catch(Exception e){
			System.out.println("exp"+e);
		}
		readClassNames();
		file="";
		do{
			try{
                            //read file lin by line
				file=br.readLine();
				setCurrClass(file);
				braces(file);		
				generalize(file);	
				realization(file);		
				associate(file);		
				depend(file);		
				var_ct(file);
				attrbt(file);
				func(file);
			}
			catch(NullPointerException e){
				
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		while(file!=null); 
		
		for(String l:output)		
			System.out.println(l);
	}
	
	
	static int open_braces=0,open_block=0;
	static void func(String line){
		
		String signvalue="",sign="",method="",type="",methodname="";
		line=line.trim();
		if(line.contains("(") && line.contains(")") && (open_block==2 
				|| open_block==1) && (line.endsWith("{") || line.endsWith(")") || 
						(open_block==1 && line.endsWith("}")) || 
						(line.contains("abstract") && line.endsWith(";")))){
			int datatype=0;
			String output="";
			if(line.contains("(") && line.contains(")")){
				method=line.substring(0,line.indexOf('('));
				String subline=line.substring(line.indexOf('(')+1,line.indexOf(')'));
				String []parameters=subline.split(",");
				if(method.contains("private")){
					method=method.replace("private","").trim();
					sign="-";
				}
				else {
					method=method.replace("public","").trim();
					sign="+";
				}
				if(method.contains("static"))
					method=method.replace("static", "").trim();
				if(method.contains("abstract"))
					method=method.replace("abstract", "").trim();
				String []div=method.split(" ");
				try{
					type=div[0];
					methodname=div[1];
				}
				catch(Exception e){
					type="";
					methodname=div[0];
				}
				for(String s:parameters){
					s=s.trim();
					String dtype[]=s.split(" ");
					output+=" "+dtype[0];
				}
			}
			if(line.contains("long") || line.contains("double") || 
					line.contains("float") || line.contains("int") 
					|| line.contains("short") || line.contains("byte") || 
					line.contains("char") || line.contains("boolean") || 
					line.contains("String") || line.contains("void")){
				String assignment[]=line.trim().split(" ");
				if(line.contains("private")){
					signvalue="-";
				}
				else {
					signvalue="+";
				}
			}
			System.out.println("	"+sign+methodname+"("+output.replaceFirst(" ","")+")"+":"+type);
		}
	}
	
	static void braces(String line){		
		if(line.contains("{")){
			open_block++;
			if(open_block==1)
			System.out.println("class "+classname+"{");
		}
		if(line.contains("(")){
			open_braces++;
		}
		if(line.contains("}")){
			open_block--;
			open_braces=0;
			if(open_block==0)
				System.out.println("}");
		}
	}
	
	static void attrbt(String line){
		String sign="";
		if(open_block==1 && !line.contains("(") && !line.contains(")") && !line.contains("class")){
			
			for(String cs:classes){
				if(line.contains(cs)){
					String [] assignment=line.trim().split(" ");
					if(assignment[0].equals("private")){
						sign="-";
					}
					else if(assignment[0].equals("public")){
						sign="+";
					}
					else{
						sign="+";
					}
					System.out.println("	"+sign+assignment[2].replace(";",":")+assignment[1]);
				}
			}
		} 
		
	}
	static void var_ct(String line){
		String sign="";
		datatypelist();
		if(open_block==1 && !line.contains("(") && !line.contains(")") && !line.contains("class")){
			
			for(String d:datatype){
				if(line.contains(d)){
					String []assignment=line.trim().split(" ");
					if(assignment[0].equals("private")){
						sign="-";
					}
					else if(assignment[0].equals("public")){
						sign="+";
					}
					else{
						sign="+";
					}
					System.out.println("	"+sign+assignment[2].replace(";",":")+assignment[1]);
					break;
				}
			}
		} 
		
	}
	
	static void methods_classtypes(String line){
		String sign="";
		line.trim();
		if((open_block==2 || open_block==1) && line.contains("(") && line.contains(")") && (line.endsWith("{ ") || line.endsWith(")") || (open_block==1 && line.endsWith("}")))){
			for(String c:classes){
				if(line.contains(c)){
					String []assignment=line.trim().split(" ");
					if(line.contains("private")){
						sign="-";
					}
					else {//if(line.contains("public")){
						sign="+";
					}
				}
			}
		}
	}
	static List<String> classes=new ArrayList<String>();	
	static void readClassNames(){		
		String file;
		File f=new File(file_name);
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader(f));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		file="";
		do{
			try{
				file=br.readLine();
				if(file.contains("class")){
					String []line=file.split(" ");
					for(int i=0;i<line.length;i++){
						if(line[i].equals("class")){
							classes.add(line[i+1]);
						}
					}
				}
			}
			catch(NullPointerException e){
				
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		while(file!=null);
	}
	
	static void generalize(String line){		
		if(line.contains("class") && line.contains("extends")){
			String data[]=line.split(" ");
			for(int i=0;i<data.length;i++){
				if(data[i].equals("extends")){
					String assignment=data[i-1]+"--|>"+data[i+1]+" : Inheritance";
					output.add(assignment);
				}
			}
		}
	}
	static void realization(String line){		
		if(line.contains("class") && line.contains("implements")){
			String data[]=line.split(" ");
			for(int i=0;i<data.length;i++){
				if(data[i].equals("implements")){
					String assignment=data[i-1]+"..|>"+data[i+1]+" : Inheritance";
					output.add(assignment);
				}
			}
		}
	}
	static void associate(String line){		
		String assignment="";
		setCurrClass(line);
		if(open_block==1){
			for(String class_name:classes){
				if(line.trim().startsWith(class_name) && !line.contains("class") && !class_name.equals(classname)){
					assignment=classname+"-->"+class_name;
					output.add(assignment);
				}
			}
		}
	}
	static void depend(String line){		
		String assignment="";
		setCurrClass(line);
		if(open_block>1 && open_braces>=1){
			for(String class_name:classes){
				if(line.trim().startsWith(class_name) && !line.contains("class") && !class_name.equals(classname)){
					assignment=classname+"..>"+class_name;
					output.add(assignment);
				}
			}
		}
	}
	
	
	static void setCurrClass(String line){
		if(line.contains("class")){
			String []lines=line.split(" ");
			for(int i=0;i<lines.length;i++){
				if(lines[i].equals("class")){
					classname=lines[i+1];
				}
			}
		}
		
	}
	
	
	static void datatypelist(){
		datatype.add("int");
		datatype.add("String");
		datatype.add("short");
		datatype.add("long");
		datatype.add("byte");
		datatype.add("boolean");
		datatype.add("float");
		datatype.add("double");
		datatype.add("char");
		datatype.add("void");
	}
	
}

