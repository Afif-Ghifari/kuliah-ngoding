<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <style>
        table {
            background-color: #f5f5f5;
        }

        thead {
            background-color: orange;
        }
    </style>
    <table border="1" cellpadding="10" cellspacing="0" >
        <thead>
            <th>Nama</th>
            <th>Domisili</th>
            <th>Jenis Kelamin</th>
        </thead>

        <tbody>
            <?php
            $Dosen = [
                "Nama" => "Elok Nur Hamdana",
                "Domisili" => "Malang",
                "Jenis Kelamin" => "Perempuan"
            ];
            
            echo "<td>{$Dosen["Nama"]}</td>";
            echo "<td>{$Dosen["Domisili"]}</td>";
            echo "<td>{$Dosen["Jenis Kelamin"]}</td>";
            ?>
            </tbody>

    </table>
</body>

</html>