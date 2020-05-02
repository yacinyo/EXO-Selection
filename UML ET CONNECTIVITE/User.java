

                                   

                        //création des classes et associations


//Creating User class
public class User {
private int id
private String email;
private String password;
private Date birthday;
//créer les liens venant des autres classes
ArrayList<Topic>ListTopic=new ArrayList<Topic>();
ArrayList<Post>ListPost=new ArrayList<Post>;
//créer les guetters et seters pour les attributs privés
public int getid(){
return id;
}

public void setid(int id){
this.id=id;
}

public String getemail(){
	return email;

}
public void setemail(String email){
this.email=email;
}

public String getpassword(){
return password;
}

public void setpassword(String password){
this.password=password;
}

public Date getbirthday(){
	return birthday;
}
 public void setbirthday(Date birthday){
 this.birthday=birthday;

 }

}


//création de la classe Toipc
class Topic {
private int id;
private String title;

//création des liens venant des autres classes

User user=new User ();
Arraylist<Post>ListPost=new Arraylist<Post>();
Cateogory=new Category();

//créer des geters et seters pour les attributes privés de la classe Topic
public int getid(){
 return id;	
}
public void setid(int id){
this.id=id;	
}
public String gettitle(){
	return title;
}
public void settitle(String title){
	this.title=title
}
}
 
 //création de la classe Post
class Post{
private int id;
private Date postDate;
private String content;

//creation des liesn venant des autres classes
Topic topic=new Topic;
User user=new User;

//création des getters et seters pour les attributs privés
public int getid(){
	return id;
}
public void setid(int id){
	this.id=id;
}
public Date getpostDate(){
	return postDate;
}
public void setpostDate(Date postDate){
 this.postDate=postDate;
}
publi String getcontent(){
	return content;
}

public void setcontent(String){
this.content=content;
}
}

//création de la classe Category
class Category{
	
	private int id;
	private String label;
	//création des liens venant des autres classes

	Arraylist<Topic>ListTopic=new Arraylist<Topic>();
	
	//créer les geters et seters des attributs privés
	public int getid(){
		return id;
		}
		public void setid(int id){
			this.id=id;
		}
		private String getlabel(){
		return label;	
		}
		private void setlabel(String label){
		 this.label=label;

		}
	}







