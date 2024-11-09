<html>
<head><title>Inserting Account Information</title></head>
<body>
<?php
    $ano = $_POST["ano"];
    $atype = $_POST["atype"];
    $balance = $_POST["balance"];
    $cid = $_POST["cid"];


    $conn = new mysqli("localhost", "root", "root", "sukesh");
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }
    $stmt = $conn->prepare("INSERT INTO account (ano, atype, balance, cid) VALUES (?, ?, ?, ?)");
    $stmt->bind_param("ssds", $ano, $atype, $balance, $cid);
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
