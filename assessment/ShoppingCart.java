public class ShoppingCart{
    private Product[] items= new Product[10];
    private List<Product> items = new ArrayList<>();
    public void addproduct(Product product){
        items.add(product);
    }
 
}

//2. ADDING ELEMENTS 

students.add("rithvik")
//adding at specific index
students.add(1,"rithvik")

//Add all from another collection
List<String> moreStudents = new ArrayList<>();
moreStudents.add("John");
students.addAll(moreStudents);

//accessing elements
String student = students.get(0);

//removing elements
students.remove(0); //removes the first element
students.remove("rithvik"); //removes the first occurrence of "rithvik"

//remove all elements matching a condition
students.removeIf(name -> name.startsWith("J")); //removes all students whose names start with "J"

//checking contents
boolean hasAlice =student.contains("Alice"); //true
boolean hasBob = student.contains("Bob"); //false
System.out.println("contains Alice);