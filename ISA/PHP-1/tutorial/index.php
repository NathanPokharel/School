<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<?php
    /*$a = "pewpew";
    for($i = 0; $i <= 5;$i++ ){
        echo $a."ugabuga<br>";
    }
    $colors = ["red","green","blue"];
    $associative = ["name"=>"John Doe","Age"=>69];
    $associativemultidimen = [
        "name"=>["John Doe","Kai","Speed","Ray"],
        "Age"=>[69,420,32,11]
    ];
    for($i=0;$i<=count($colors);$i++){
        echo $colors[$i];
    }
    foreach($associativemultidimen as $key => $values){
        echo "$key contains <br>";
        foreach($values as $value){
            echo "$value in $key";
            echo"<br>";
        };
        echo"<br>";
    };
    $value = $associativemultidimen["name"][3];
    switch ($value){
        case "Kai":
            echo "Kai cenate";
            break;
        case "Speed":
            echo "I Show Meat";
            break;
        default:
            echo "PEWPEW";
    }
    function addNumbers($num1,$num2){
        return $num1+$num2;
    }
    echo addNumbers(3,5);
    $myarray = [1,2,3,4,5,6,7];
    $newarr = array_filter($myarray,function($a){
        return $a % 2 ==0;
    });
    $newarr = array_map(function($a){
        return $a**2;
    },$myarray);
    foreach ($newarr as $items){
        echo $items."<br>";
    }
*/
    $age=69;
    $name = "Kai";
    echo "$name is $age years old <br>";
    
    $price = 9.99;
    $newprice = number_format(($price - ((10/100) * $price)),2);
    echo "$price after 10% discount is $newprice <br>";

    $fname = "Jhon";
    $lname = "Doe";
    echo "$fname $lname <br>";

    $isLogged = false;
    echo $isLogged? "Welcome": "Please Log In<br>";

    $fruits = ["Apple","Banana","Orange","Tomato","Kiwi"];
    echo $fruits[2]."<br>";
    
    define("PI",3.141592653);
    $area = PI*5**2;
    echo "Area of the circle is $area <br>";
    
    $students = ["Volibear","Annie","Gusion","Yin","Zed"];
    sort($students);
    foreach ($students as $student){
        echo $student."<br>";
    }

    $num = 88;
    if ($num % 2 != 0){
        echo "$num is odd <br>";
    }else{
        echo "$num is even<br>";
    }

    if ($num > 0){
        echo "$num is positive<br>";
    }elseif ($num <0){
        echo "$num is negative<br>";
    }else{
        echo "$num is 0<br>";
    }

    $num1 = 69;
    $num2 = 420;
    $num3 = 32;

    if ($num1 > $num2 && $num1 > $num3)
        echo "$num1 is greatest<br>";
    elseif ($num2 > $num1 && $num2 > $num3)
        echo "$num2 is greatest<br>";
    else 
        echo "$num3 is the greatest<br>";
   $sum_of_all_nums = 0;
    for($i=1;$i<=100;$i++){
        $sum_of_all_nums+=$i;
    }
    echo "$sum_of_all_nums is the sum of all nums from 1 to a 100<br>";
    $a=0;
    $b=1;
    $c=0;
    echo $a . "<br>";
    echo $b . "<br>";
    for($i=1;$i<=10;$i++){
        $c = $a + $b;
        echo $c . "<br>";
        $a = $b;
        $b = $c;
    };

    function factorial($n){
        if ($n == 1 || $n == 0){
            return 1;
        }else{
            return $n * factorial($n-1);
        }
    }

    echo factorial(5);
    echo "<br>";


    $price = 69;
    $quantity = 2;
    $total = $price * $quantity;
    echo "$price * $quantity = $total <br>";
    $students_name = ["Name"=>"Zed","Age"=>69,"Grade"=>"A+"];
    foreach($students_name as $key=>$value){
        echo "$key = $value <br>";
    }
    $current_date = date("Y M D");
    echo "Todays Date: $current_date <br>";

    $countries = ["Iceland","America","Greenland"];
    foreach ($countries as $country){
        echo "$country <br>";
    }
    $names_and_ages= ["Jhon"=>69,"Kai"=>32,];
    echo $names_and_ages["Jhon"]."<br>";

    $array1 = ["apple", "banana", "cherry", "date", "elderberry"];
    $array2 =["banana", "date", "fig", "grape"];
    $diff_arr = array_diff($array1,$array2);
    foreach($diff_arr as $items){
        echo "$items <br>";
    }
    shuffle($array1);
    print_r($array1);
    echo "<br>";
    echo "Num of elements in array1 is ". count($array1) . "<br>";


    function calculateSum(...$nums){
        return array_sum($nums);
    }
    echo calculateSum(1,2,3,4,5);

    function BMI_Calculator($weight,$height){
        return ($weight / $height ** 2);
    }

    echo "<br>";
    echo number_format(BMI_Calculator(69,1.8),2);
?>
</body>
</html>
