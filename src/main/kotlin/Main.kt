fun main(args: Array<String>) {
  find()
    var details = listOf(
          Person("Javan",34,6.5, 56),
          Person("Voster",54,8.9, 87),
        Person("Lucious", 53,6.9,85)
    )
    details.sortedByDescending { it.age }
   println(details)

    var newName = names("Lucky", "Wangari","Gitonga")
    println(newName)


}
//Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun find(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.sorted())
    println(numbers.indexOf(158))
    println(numbers[2] + numbers[5])
}
//. Given a list of Person objects, each with the attributes, name, age, height, and weight. Sort
// the list in order of descending age (2 points)
class Person(var name: String, var age: Int, var height: Double, var weight: Int)

//Create a function that takes in 3 names and returns a string array containing all 3 names.
// (2 points)
fun names(name1: String, name2: String, name3: String): Array<String>{
    return arrayOf(name1, name2, name3)

}
//Write a function that takes in a list of Car objects each with a registration and
//mileage attribute and returns
//the average mileage of all the vehicles in the list. (3 points)
class  Car(var registration: String, var mileage: Int)
fun findMile(vehicle: List<Car>): Int{
    var total = vehicle.sumOf { it.mileage }
    return total

    var final = total.toInt() / vehicle.size
    return final


}


