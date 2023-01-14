<?php
require("db.php");
require_once("classes.php");
$db = new db();
//echo strtotime("now");

$db->operate("insert", "teacher", new teacher("Mario", "Hernandez", "39448387Y", "mariomonlau@gmail.com", "2012-12-31", 2000));
