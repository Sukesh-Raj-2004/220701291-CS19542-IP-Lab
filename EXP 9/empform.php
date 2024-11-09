<html>
    <head?>
    <title>Employee Application</title>
    <link rel="stylesheet" href="emp.css">
    </head>
    <body>
        <div class="main">
            <div class="select">
                <h1>Select Employee Detail</h1>
                <form action="empselect.php"  method="get">
                    EMP ID &nbsp; &nbsp; &nbsp; :<input type="text" name="empid" placeholder="Enter EMP ID"><br><br>
                    <input type="submit" class="submit">
                </form>
            </div>
            <br>
            <div class="insert">
                <h1>Insert Employee Detail</h1>
                <form action="empinsert.php" method="post">
                    EMP ID &nbsp; &nbsp; &nbsp;:<input type="text" name="empid" placeholder="Enter EMP ID"><br>
                    ENAME &nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="ename" placeholder="Enter EMP Name"><br>
                    DESIG &nbsp; &nbsp;&nbsp;&nbsp; :<input type="text" name="desig" placeholder="Enter Designation"><br>
                    DEPT &nbsp; &nbsp; &nbsp; &nbsp; :<input type="text" name="dept" placeholder="Enter Department"><br>
                    SALARY &nbsp; :<input type="text" name="salary" placeholder="Enter salary"><br><br>
                    <input type="submit" class="submit">
                </form>
            </div>
            <br>
            <div class="update">
                <h1>Update Employee Detail</h1>
                <form action="empupdate.php" method="post">
                    EMP ID &nbsp; &nbsp; &nbsp; &nbsp;:<input type="text" name="empid" placeholder="Enter EMP ID"><br>
                    Update Field&nbsp;:<input type="text" name="upf" placeholder="Enter Update Filed"><br>
                    Updae Value :<input type="text" name="upv" placeholder="Enter Value"><br><br>
                    <input type="submit" class="submit">
                </form>
            </div>
        </div>
    </body>
</html>