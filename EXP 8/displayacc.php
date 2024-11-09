<html>
<head><title>Display Account Informtion</title><head>
<body>
<?php
$ano=$_GET["ano"];

$conn=new mysqli("localhost","root","root","sukesh");
$sql="select ano,atype,balance,cid from account where ano='$ano'";
$result=$conn->query($sql);

while ($row=$result->fetch_assoc()){
    echo"<center>";
    echo "<table border='1'><tr>
        <td>Account No</td>
        <td>Account Type</td>
        <td>Account Balance</td>
        <td>Customer ID</td></tr>";
    
        echo "<tr><td>".$row["ano"]."</td>
        <td>".$row["atype"]."</td>
        <td>".$row["balance"]."</td>
        <td>".$row["cid"]."</td></tr>";
    echo "</table></center>";
}

$conn->close();
?>
</body>
</html>