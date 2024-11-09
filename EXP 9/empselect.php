<html>
<head><title>Select Employee Detail</title></head>
<body>
<?php
    $empid=$_GET["empid"];
    $conn = new mysqli("localhost", "root", "root", "sukesh");
    $sql="select empid,ename,desig,dept,salary from empdetails where empid='$empid'";
    $result=$conn->query($sql);
    while ($row=$result->fetch_assoc()){
        echo"<center>";
        echo "<table border='1'><tr>
            <td>EmpId</td>
            <td>EmpName</td>
            <td>Designation</td>
            <td>Department</td>
            <td>Salary</td></tr>";

        echo "<tr><td>".$row["empid"]."</td>
              <td>".$row["ename"]."</td>
              <td>".$row["desig"]."</td>
              <td>".$row["dept"]."</td>
              <td>".$row["salary"]."</td></tr>";
        echo "</table></center>";
    }
    
    $conn->close();
?>
</body>
</html>