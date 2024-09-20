<?php
    $a = 10;
    $b = 5;
    
    $hasilTambah = $a + $b;
    $hasilkurang = $a = $b;
    $hasilkali = $a * $b;
    $hasilBagi = $a / $b;
    $sisaBagi = $a % $b;
    $pangkat = $a ** $b;
    echo $hasilTambah."<br>";
    echo $hasilkurang."<br>";
    echo $hasilkali."<br>";
    echo $hasilBagi."<br>";
    echo $sisaBagi."<br>";
    echo $pangkat."<br>";
    echo "<br><br>";

    $hasilSama = $a == $b;
    $hasilTidakSama = $a != $b; 
    $hasilLebihkecil = $a < $b;
    $hasilLebihBesar = $a > $b;
    $hasilLebihKecilSama = $a <= $b; 
    $hasilLebihBesarSama = $a >= $b;
    echo var_dump($hasilSama) ."<br>";
    echo var_dump($hasilTidakSama)  ."<br>";
    echo var_dump($hasilLebihkecil) ."<br>";
    echo var_dump($hasilLebihBesar) ."<br>";
    echo var_dump($hasilLebihKecilSama) ."<br>";
    echo var_dump($hasilLebihBesarSama) ."<br>";
    echo "<br><br>";

    $hasilAnd = $a && $b;
    $hasilOr = $a || $b;
    $hasilNotA = !$a;
    $hasilNotB = !$b;
    echo var_dump($hasilAnd)."<br>";
    echo var_dump($hasilOr)."<br>";
    echo var_dump($hasilNotA)."<br>";
    echo var_dump($hasilNotB)."<br>";
    echo "<br><br>";

    echo var_dump($a += $b)."<br>";
    echo var_dump($a -= $b)."<br>";
    echo var_dump($a *= $b)."<br>";
    echo var_dump($a /= $b)."<br>";
    echo var_dump($a %= $b)."<br>";
    echo "<br><br>";

    echo var_dump($hasilIdentik = $a === $b)."<br>";
    echo var_dump($hasilTidakIdentik = $a !== $b)."<br>";
    echo "<br><br>";

    $totalKursi = 45;
    $kursiTerpakai = 28;
    $persenKursiKosong = ($kursiTerpakai / $totalKursi) * 100;
    echo "Persentase kursi kosong adalah: " . $persenKursiKosong . "%";
?>