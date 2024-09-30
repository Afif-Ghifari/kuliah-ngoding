<?php
    $loremIpsum = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,
                    molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum
                    numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium
                    optio, eaque rerum! Provident similique accusantium nemo autem.";
    echo "<p>$loremIpsum</p>";
    echo "Panjang karakter: ".strlen($loremIpsum)."<br>";
    echo "Panjang kata: ".str_word_count($loremIpsum)."<br>";
    echo "<p>".strtoupper($loremIpsum)."</p>";
    echo "<p>".strtolower($loremIpsum)."</p>";
?>