<html>
<head><title>Inserting Customer Information</title></head>
<body>
<?php

    $cid = $_POST["cid"];
    $cname = $_POST["cname"];

    $conn = new mysqli("localhost", "root", "root", "sukesh");
    $stmt = $conn->prepare("INSERT INTO customer (cid, cname) VALUES (?, ?)");
    $stmt->bind_param("ss", $cid, $cname);
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
