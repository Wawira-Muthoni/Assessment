fun main(){
    division(50,3)
    school("codeHive")
    var statement = sentence("Christine",20)
    println(statement)
    vehicles("Jeep")
}
fun school(k:String){
    var name =(k[4].toString()+k[5]+k[6]+k[7])
    println(name)
}
//Write a string "codeHive" and a function that prints out
//the fifth,sixth, seventh and eighth characters of string.
fun division(q:Int,h:Int){
    var modulus = q %h
    println(modulus)
}
//Create and invoke a function that given two numbers returns
// the remainder of division.
fun sentence(p:String,z:Int):String{
    var x = "Hi,my name is $p and I am  $z years old"
    return x
}
//Write a function that given two parameters, name and age returns
//the string of the structure"Hi, my name is p and I am z years old.
fun vehicles(k:String){
    println(k. length)
}
//Write a function that takes in a string and returns its length