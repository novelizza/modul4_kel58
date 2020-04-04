<?php
declare(strict_types = 1);
	class pendefinisi {
	public function akar(float $angka) : float {
		return sqrt($angka);
	}
	public function staysafe (string $noun1, string $noun2) {
		echo "Jangan lupa cuci tangan dengan $noun1 dan $noun2";
	}
}
$angka = 64;
$objek = new pendefinisi();

echo "akar dari $angka adalah ".$objek -> akar($angka);
echo "<hr>";
$objek ->  staysafe('air', 'sabun');

?>