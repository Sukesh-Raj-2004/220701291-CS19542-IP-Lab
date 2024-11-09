<html>
<head><title>Insert Employee Detail</title></head>
<body>
<?php
    $empid = $_POST["empid"];
    $ename = $_POST["ename"];
    $desig = $_POST["desig"];
    $dept= $_POST["dept"];
    $salary = $_POST["salary"];

    $conn = new mysqli("localhost", "root", "root", "sukesh");
    $stmt = $conn->prepare("INSERT INTO empdetails (empid,ename,desig,dept,salary) VALUES (?, ?, ?, ?, ?)");
    $stmt->bind_param("sssss",$empid,$ename,$desig,$dept,$salary);
    if ($stmt->execute()) {
        echo "New record created successfully.";
    } else {
        echo "Error: " . $stmt->error;
    }
    $stmt->close();
    $conn->close();
?>
</body>
</html>