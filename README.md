# Tugas-PBO
APLIKASI DELIFOOD

Nama: Made Yurista Indani Sukma
Nim: 2205551078
Kelas: Pemrograman Berbasis Objek (D)

Tugas membuat program untuk membeli makanan online berbasis command line.
Program yang saya buat ada sebuah aplikasi pesan online makanan sederhana yang berbasis command line. 
Dalam aplikasi ini saya menggunakan Bahasa Java dalam perancangannganya. Dalam kode ini terdapat 8 kelas diantaranya class Main, Admin, Customer, Restaurant, Menu, Order,
HapusLayar, dan Tampilan. Dalam README ini akan dilampirkan beberapa hasil run program aplikasi Delifood serta UML dari program ini.

Di bawah ini merupakan UML dari program resto online.
![UML DELIFOOD](https://user-images.githubusercontent.com/113998797/232740467-6d47ecf1-d934-4aa0-b51b-3d3e2eb870af.jpg)


Di bawah ini merupakan hasil run dari program yang telah di buat.
1. Tampilan awal
![Tampilan Awal](https://user-images.githubusercontent.com/113998797/232741287-712c4989-4e0d-4d64-b87c-f3e96be75100.png)

Pada tampilan awal, program akan menampilkan pilihan untuk masuk sebagai admin atau customer.

2. Login sebagai admin
![Admin Login](https://user-images.githubusercontent.com/113998797/232742960-0756274c-4dc1-4ec4-b4d0-0f4889ad5775.png)

Di atas merupakan tampilan apabila user memilih login sebagai admin. Dalam tampilan di atas user akan diminta untuk memasukkan username (adminyuris) dan password (yuris123) agar bisa melakukan login.

3. Login admin gagal
![ADMIN-LOGIN GAGAL](https://user-images.githubusercontent.com/113998797/232745952-7aa7f0ef-f9e8-42e7-a247-65b1b0c79099.png)

Pada gambar diatas merupakan tampilan jika admin salah melakukan input terhadap username dan password. Apabila salah melakukan input username dan password maka program akan menampilan pesan bahwa login tidak berhasil dan perlu melakukan login ulang.

4. Login admin berhasil
![ADMIN-LOGIN BERHASIL](https://user-images.githubusercontent.com/113998797/232746973-7450d756-064c-43cb-a218-dbc6f62850fb.png)

Tampilan di atas akan muncul apabila login sebagai admin berhasil dilakukan. Program akan menampilkan pesan bahwa login sebagai admin berhasil. Selain itu program juga akan menampilkan menu yang dapat dipilih oleh admin yaitu:
- List restaurant
- Add restaurant
- Delete restaurant
- Back to login

5. List restaurant
![ADMIN-List Resto Italiano](https://user-images.githubusercontent.com/113998797/232747846-0bf26501-7b8d-42f2-89c9-fe69d62a3c68.png)
![ADMIN-List Resto Rasa Lokal](https://user-images.githubusercontent.com/113998797/232747885-7eccd076-1534-444b-a8ed-73dd5107e752.png)
![ADMIN-List Resto Japanese](https://user-images.githubusercontent.com/113998797/232748082-0bb12689-cf1a-4eae-8b85-b56e4ea69f4d.png)
![ADMIN-List Resto Chinese](https://user-images.githubusercontent.com/113998797/232748043-f44eda3c-28b1-430b-8b42-b84e1601ca22.png)

Gambar di atas merupakan output yang akan ditampilkan apabila admin memilih menu 1 yaitu list restaurant. List restaurant akan menampilkan data-data restaurant berupa id restaurant, nama, alamat, kontak, dan menu restaurant. Setelah menampilkan seluruh list restaurant, program juga kembali menampilkan "ADMIN HOME PAGE". 

6. Add restaurant
![ADMIN-Add Resto](https://user-images.githubusercontent.com/113998797/232750558-f2f6896c-6798-44d0-9872-7abf483d598f.png)

Apabila admin memilih menu 2 yaitu add restaurant maka tampilan yang akan muncul adalah seperti di atas. Pada menu ini, admin akan diminta untuk menginputkan data-data restaurant yaitu id, nama, alamat, dan kontak restaurant. Setelah menginputkan data restaurant, maka admin akan diminta kembali untuk menginputkan data-data menu yaitu berupa nama menu dan juga harga menu. Apabila sudah selesai, admin dapat menginputkan "DONE". Setelah itu data restaurant baru akan ditambahkan dan program akan kembali menampilkan tampilan "ADMIN HOME PAGE".

7. Delete Restaurant
![ADMIN-Delete Resto](https://user-images.githubusercontent.com/113998797/232751919-c74c6f68-a3bb-48a8-b810-8555b04894f3.png)

Apabila admin memilih menu 3 yaitu delete restaurant, maka program akan menampilkan tampilan diatas. Admin akan diminta menginputkan id restaurant untuk menghapus restaurant yang diinginkan. Setelah selesai, program akan menampilkan pesan berhasil dan kembali menampilkan "ADMIN HOME PAGE".

8. Back to login
![ADMIN-back to home](https://user-images.githubusercontent.com/113998797/232753483-8d88b57c-54e5-4c46-9c81-5e8d825b43da.png)

Pada tampilan diatas, jika admin memilih menu 4 maka program akan menampilkan kembali menu "ADMIN HOME PAGE"

9. Login sebagai customer
![USER - Login Berhasil](https://user-images.githubusercontent.com/113998797/232753995-e2dfdf16-fee8-44fa-ac45-a4e9876b0284.png)

Tampilan diatas akan muncul apabila user memilih untuk login sebagai customer. Pada pilihan ini, program akan menampilkan pilihan untuk login, sign up, dan back.

10. Sign up berhasi
![USER - Login Berhasil](https://user-images.githubusercontent.com/113998797/232754372-9c4dc60d-8f41-41fd-88f1-e4266beb1136.png)

Tampilan di atas akan muncul apabila customer berhasil melakukan sign up. Pada menu ini customer diminta untuk menginputkan username dan password.

11. Sign up gagal
![USER - SignUp Gagal](https://user-images.githubusercontent.com/113998797/232754662-40bb2a50-11c6-425e-8302-e49de844aeb9.png)

Tampilan di atas akan muncuk apabila customer tidak berhasil melakukan sign up. Hal ini dikarenakan username yang digunakan sudah terdaftar. Apabila customer gagal pada tahap sign up, maka program akan kembali ke menu "CUSTOMER LOGIN/SIGN UP".

12. Login gagal
![USER-Login Gagal](https://user-images.githubusercontent.com/113998797/232755186-01d13463-197c-492a-9022-248d81c5fc73.png)

Tampilan di atas akan muncul apabila customer tidak berhasil dalam melakukan login. Hal ini dikarenakan username atau password yang diinputkan salah. Selanjutnya program akan menampilkan pesan login gagal dan kembali ke menu "CUSTOMER LOGIN/SIGN UP".

13. Login berhasil
![Screenshot 2023-04-18 185958](https://user-images.githubusercontent.com/113998797/232757703-f6cfc4dd-a706-48d0-a76b-9d3fc2693b64.png)

Tampilan diatas akan muncul apabila customer berhasil melakukan login. Program akan menmapilkan "CUSTOMER HOME PAGE", dimana terdapat beberapa pilihan yaitu:
- Order
- View order
- Back

14. Order
![USER-Order](https://user-images.githubusercontent.com/113998797/232758437-3ffc2d30-850c-4dd3-b664-da7b8efd52a3.png)

Pada tampilan di atas, program akan menampilkan beberapa pilihan restaurant. Dalam tampilan ini customer akan diminta untuk memilih restaurant. Setelah memilih restaurant, customer dapat memilih menu yang diinginkan dengan menginputkan nomer menu dan jumlah menu yang ingin dipesan. Setelah itu program akan menanyakan ingin menambah menu atau tidak. Apabila tidak program akan meminta customer untuk menginputkan jarak customer dengan restaurant. Setelah itu customer akan diminta untuk melihat pesanan pada menu view order.

15. View Order
![USER-View Order](https://user-images.githubusercontent.com/113998797/232760538-e604856e-3315-4e11-9654-2c1bb1a620ea.png)

Apabila user memilih menu 2 maka program akan menampilkan menu di atas. Menu ini akan muncul apabila customer sudah melakukan order.

16. Back 
![USER- BACK TO HOME](https://user-images.githubusercontent.com/113998797/232761096-4ab75837-9cf5-4080-a65c-4a24883ca896.png)

Tampilan di atas akan muncul apabila customer memilih menu 4. Program akan menampilkan kembali tampilan "CUSTOMER LOGIN/SIGN UP". Dan apabila customer memilih menu untuk back pada tampilan "CUSTOMER LOGIN/SIGN UP" maka program akan kembali ke tampilan awal.

16. Tampilan akhir
![TAMPILAN AKHIR](https://user-images.githubusercontent.com/113998797/232761890-449552ff-892b-40ca-8f94-e1405643cb20.png)

Apabila user memilih menu 3 pada program akan menampilkan pesan "THANK YOU" dan program akan berhenti.
