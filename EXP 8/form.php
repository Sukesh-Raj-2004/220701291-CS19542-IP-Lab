<!DOCTYPE html>
<html lang="en">

<head>
  <title>Banking Application</title>
  <link rel="stylesheet" href="bank.css">
</head>

<body>
  <div class="main">
    <div class="displayc">
      <h2>Displaying Customer Information</h2>
      <form action="displayc.php" method="GET">
        Customer Id &nbsp;&nbsp; : <input type="number" name="cid" placeholder="Enter Customer ID" required><br><br>
        <input type="submit" class="submit">
      </form>
    </div>

    <div class="displayacc">
      <h2>Displaying Account Information</h2>
      <form action="displayacc.php" method="GET">
        Account Number &nbsp; : <input type="text" name="ano" placeholder="Enter Account Number" required><br><br>
        <input type="submit" class="submit">
      </form>
    </div>

    <div class="insertc">
      <h2>Inserting Customer Information</h2>
      <form action="insertc.php" method="POST">
        Customer Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type="number" name="cid" placeholder="Enter Customer Id" required><br><br>
        Customer Name &nbsp;&nbsp;&nbsp; : <input type="text" name="cname" placeholder="Enter Customer Name" required><br><br>
        <input type="submit" class="submit">
      </form>
    </div>

    <div class="insertacc">
      <h2>Inserting Account Information</h2>
      <form action="insertacc.php" method="POST">
        Account No. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type="number" name="ano" placeholder="Enter Account Number" required><br><br>
        Account Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type="text" name="atype" placeholder="Enter Account Type" required><br><br>
        Account Balance &nbsp;&nbsp;&nbsp; : <input type="text" name="balance" placeholder="Enter Account Balance" required><br><br>
        Customer ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type="text" name="cid" placeholder="Enter Customer ID" required><br><br>
        <input type="submit" class="submit">
      </form>
    </div>
  </div>
</body>

</html>
