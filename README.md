<h1>POLIMORFISME</h1>
<h6>Polimorfisme yaitu Satu referensi bisa menunjuk ke banyak tipe objek, dan perilaku yang dijalankan bergantung pada objek sebenarnya saat runtime .</h6>
<pre><img width="226" height="322" alt="image" src="https://github.com/user-attachments/assets/96dd30c4-4d4c-4df1-8ee4-4c6687d41fc0" />
</pre>

<h3>LATIHAN 1 ANIMAL</h3>
<h4>Ouput</h4>
<pre><img width="346" height="140" alt="image" src="https://github.com/user-attachments/assets/f2c36354-63ff-4810-8e39-bdee31bfefa8" />
</pre>
<h6>1. Animal punya method umum speak(). 
<h6>2. Dog dan Bird override speak() ini polimorfisme runtime.</h6>
<h6>3. Data disimpan dalam List<Animal> tetapi objek aktualnya bisa Dog dan Bird.</h6>
<h6>4. Saat dilakukan looping: </h6> a. animal.speak() memanggil method sesuai objeknya (dynamic dispatch). b. instanceof Dog digunakan agar bisa memanggil fetch() (khusus Dog).</h6>

<h3>LATIHAN 2 SHAPE</h3>
<h4>Output</h4>
<pre><img width="353" height="50" alt="image" src="https://github.com/user-attachments/assets/d202435a-478b-46e9-965d-96efe6269956" />
</pre>
<h6>1.Shape adalah abstract class tidak bisa dibuat objeknya.</h6>
<h6>2.Circle dan Rectangle meng-override method area().</h6>
<h6>3.List<Shape> menyimpan berbagai objek bentuk melalui polimorfisme.</h6>
<h6>4.Saat looping, Java memanggil area() sesuai objek asli (circle/rectangle).</h6>

<h3>LATIHAN 3 PAYABLE</h3>
<h4>Output</h4>
<pre><img width="317" height="47" alt="image" src="https://github.com/user-attachments/assets/cb9d6b70-aa1b-448e-9b93-8306aa27515c" />
</pre>
<h6>1.Payable adalah interface yang menuntut implementasi method pay().</h6>
<h6>2.Employee dan Contractor mengimplementasikan interface tersebut.</h6>
<h6>3.List<Payable> memungkinkan berbagai jenis objek dihitung bersama → polimorfisme.</h6>
<h6>4.Loop menghitung total pembayaran seluruh pekerja.</h6>

<h3>LATIHAN 4 OVERLOADING</h3>
<h4>Output</h4>
<pre><img width="310" height="55" alt="image" src="https://github.com/user-attachments/assets/3c7e3e6d-c465-4463-8ecb-d2eee2c92dd5" />
</pre>
<h6> Overloading = ditentukan saat compile time berdasarkan tipe referensi dan Overriding = ditentukan saat runtime berdasarkan tipe objek</h6>
<h6>1. Sub tidak override f(Number)</h6>
<h6>2. Sub hanya menambahkan overload baru: f(Integer)</h6>
<h6>3. Karena referensi adalah Base, maka Base.f(Number) yang dipilih.</h6>
