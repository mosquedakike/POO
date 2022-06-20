<?php
require_once("car.php");
require_once("uberX.php");
require_once("accordion.php");

$uberX = new UberX("Dev2115", new Account("Luis Enrique", "HEML940715"), "Ford", "Focus RS");
$uberX->printDataCar();
?>