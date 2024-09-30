<?php
    $pesan = "Saya arek Malang";
    $pesanPerKata = explode(" ", $pesan);
    $pesanPerKata = array_map(fn($pesan) => strrev($pesan), $pesanPerKata);
    $pesan =implode(" ", $pesanPerKata);
    echo $pesan."<br>";
?>