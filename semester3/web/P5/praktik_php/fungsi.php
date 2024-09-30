<?php

function hitungUmur($thn_lahir, $thn_sekarang){
    $umur = $thn_sekarang - $thn_lahir;
    return $umur;
}

function perkenalan($nama, $salam = "Assalamualaikum") {
    echo $salam.", ";
    echo "Perkenalkan, nama saya $nama<br/>";
    echo "Saya berusia ". hitungUmur(2004, 2024). " tahun<br/>";
    echo "Senang berkenalan dengan anda<br/>";
}

perkenalan("Elok")

?>