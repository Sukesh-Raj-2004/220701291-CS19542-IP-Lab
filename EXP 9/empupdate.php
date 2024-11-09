<html>
<head><title>Update Employee Detail</title></head>
<body>
<?php
    $empid = $_POST["empid"];
    $upf = $_POST["upf"];
    $upv = $_POST["upv"];
    
    $conn = new mysqli("localhost", "root", "root", "sukesh");
    $stmt = $conn->prepare("update empdetails set $upf=? where empid=?");
    $stmt->bind_param("ss",$upv,$empid);
    if ($stmt->execute()) {
        echo "Record Updated Successfully.";
    } else {
        echo "Error: " . $stmt->error;
    }
    $stmt->close();
    $conn->close();
?>
</body>
</html>