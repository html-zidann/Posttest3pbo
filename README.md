# Posttest3pbo
## posttest 3 Pemrograman berbasis objek 
## Zidan Daffa Ramadhan 
## 2409116056
## Tema : Manajemen Pendataan Warga Rt 41

<img width="328" height="150" alt="image" src="https://github.com/user-attachments/assets/b512e682-9a1b-401d-a504-264790384665" />

disini, di file main saya, saya menggunakan 3 model yang saya buat file berbeda, dan akan saya jelaskan 1 per 1

## Penjelasan Program
### Person

<img width="531" height="604" alt="image" src="https://github.com/user-attachments/assets/c739b9bc-89ae-4d31-8c06-a410492594a6" />

berbeda dengan posstest sebelumnya, saya membuat 1 class baru yaitu person, yang dimana class ini dibuat bertujuan untuk menambahkan inheritance pada class warga sebagai pewaris class.
di class ini berisi untuk input nama dan umur, yang dimana menggunakan program constructor, dan getter setter
protected berfungsi agar dapat diakses oleh seluruh class

### Warga

disini saya menggunakan extends sebagai pewaris class, di class warga ini saya membuat string baru yaitu setatus keluarga, apakah beliau sebagai kepala keluarga atau anggota.

<img width="860" height="417" alt="image" src="https://github.com/user-attachments/assets/792815bf-0a71-4615-b73c-b33b3fd4f4fb" />

Override sebagai subclass yang menimpa method dari superclass, jadi di override ini fungsinya untuk menimpa superclass ketika di tampilan output.

### ServisWarga

<img width="729" height="493" alt="image" src="https://github.com/user-attachments/assets/cee4cdf8-cc3d-4f98-96d6-aadb3d140cc7" />

Tidak jauh berbeda dengan sistem Create, Read, Update, dan Delete pada posttest sebelumnya.

<img width="676" height="594" alt="image" src="https://github.com/user-attachments/assets/9edc72ca-d882-4db5-91c3-f1042622d9c5" />

dan saya masih menggunakan fitur search

<img width="591" height="309" alt="image" src="https://github.com/user-attachments/assets/275f3a35-bfd8-4fa2-a430-eefb0fc0b9dd" />

### MainClass

disini saya menggunakan perintah do and while untuk program menampilkan output yang diinginkan oleh user itu aendiri. Dan juga, saya telah menambahkan fitur jika user menginput umur dengan huruf.

<img width="777" height="625" alt="image" src="https://github.com/user-attachments/assets/bb6571d3-7675-402c-9a06-fa9abf734225" />

disini saya menggunakan tanda -> (Switch rule) agar tidak perlu menambah break di setiap 1 line.


## Penjelasan alur program/ output

Disini saya meng-run File Mainapp saya

<img width="389" height="174" alt="image" src="https://github.com/user-attachments/assets/06eda44f-bfdc-4b85-b335-ddce04e774f6" />

ketika di run, output akan menjalankan program yang saya buat, dan menampilkan list list menu yang dapat dijalankan oleh program. Dan, bentuk output harus integer.

<img width="397" height="213" alt="image" src="https://github.com/user-attachments/assets/6995adff-55f1-48ef-8939-1f55f8732936" />

### Fitur Tambah

untuk menu create, user hanya perlu memasukkan nama, umur, dan status yang ingin di input.

<img width="574" height="260" alt="image" src="https://github.com/user-attachments/assets/a137f945-ba1f-4ce4-bc8d-6b684d9946c4" />

### Sistem Lihat/Read

ketika user menginput angka 2 (lihat data) maka sistem akan otomatis menampilkan daftar warga yang telah diinput.

<img width="442" height="198" alt="image" src="https://github.com/user-attachments/assets/8cb82964-7fb7-4ab1-b76a-2939c9b0bc75" />

### Sistem Update

ketika user menginput angka 3 (update data) maka sistem akan meminta input kembali kepada user. Yaitu, berupa id dari data yang ingin diubah, nama baru, umur baru, dan status baru.

<img width="442" height="305" alt="image" src="https://github.com/user-attachments/assets/d7679e9a-cfe3-4ed1-b4ce-395782c20262" />

<img width="439" height="200" alt="image" src="https://github.com/user-attachments/assets/aec30c83-8d62-4d29-b999-a0f37d1b799c" />


### Sistem Hapus/Delete

<img width="427" height="230" alt="image" src="https://github.com/user-attachments/assets/88d8dc48-00f2-48c9-9ef9-b2e57662f5f9" />

ketika user menginput angka 3 (Hapus data) maka sistem akan meminta user untuk input angka dari id data yang ingin dihapus.

<img width="349" height="198" alt="image" src="https://github.com/user-attachments/assets/7f1d6372-90d5-4ac9-8f59-bec63cb84b1a" />

### Fitur Search

disini saya sudah menambahkan 5 nama yang berbeda untuk pengimplementasian fitur search.

<img width="511" height="286" alt="image" src="https://github.com/user-attachments/assets/15d2e4a3-002a-4271-b923-769de7f9f9b5" />

implementasi :

misalnya disini ada 5 data, kemudian saya ingin mencari yang nama awalnya ada huruf t
maka otomatis sistem akan menampilkannya.

<img width="558" height="221" alt="image" src="https://github.com/user-attachments/assets/0932b4d8-81d4-4dc7-b9fd-4bfdf15f575d" />
