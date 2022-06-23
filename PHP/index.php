<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");

$uberX = new UberX("Dev2115", new Account("Luis Enrique", "HEML940715"), "Ford", "Focus RS");
$uberX->printDataCar();

$uberPool = new uberPool("Frontend", new Account("Quique Mosqueda", "HEML940718"), "Golf", "GTI");
$uberPool->printDataCar();
?>