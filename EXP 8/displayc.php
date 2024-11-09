<html>
<head><title>Display Customer Informtion</title><head>
<body>
<?php
$cid=$_GET["cid"];
$conn=new mysqli("localhost","root","root","sukesh");
$sql="select cid,cname from customer where cid='$cid'";
$result=$conn->query($sql);
while ($row=$result->fetch_assoc()){
    echo"<center>";
    echo "<table border='1'><tr>
        <td>Customer Id</td>
        <td>Customer Name</td></tr>";
    echo "<tr><td>".$row["cid"]."</td>
          <td>".$row["cname"]."</td></tr>";
    echo "</table></center>";
}

$conn->close();
?>
</body>
</html>