<h1>POLIMORFISME</h1>
<h6>Polimorfisme yaitu Satu referensi bisa menunjuk ke banyak tipe objek, dan perilaku yang dijalankan bergantung pada objek sebenarnya saat runtime .</h6>
<pre><img width="226" height="322" alt="image" src="https://github.com/user-attachments/assets/96dd30c4-4d4c-4df1-8ee4-4c6687d41fc0" />
</pre>

<h3>LATIHAN 1 ANIMAL</h3>
<h4>Ouput</h4>
<pre><img width="346" height="140" alt="image" src="https://github.com/user-attachments/assets/f2c36354-63ff-4810-8e39-bdee31bfefa8" />
</pre>
<h6>1. Animal punya method umum speak(). 
<h6>2. Dog dan Bird override speak() → ini polimorfisme runtime.</h6>
<h6>3. Data disimpan dalam List<Animal> tetapi objek aktualnya bisa Dog dan Bird.</h6>
<h6>4. Saat dilakukan looping: </h6>
    a. animal.speak() memanggil method sesuai objeknya (dynamic dispatch).
    b. instanceof Dog digunakan agar bisa memanggil fetch() (khusus Dog).</h6>
