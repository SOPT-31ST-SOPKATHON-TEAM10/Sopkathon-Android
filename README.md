# ๐ Sopkathon-Team10-Android ๐
### IN SOPT 31ST ์์ปคํค 10์กฐ Androidํ

<br>

|<img width="400" src="https://user-images.githubusercontent.com/48701368/202862451-f0f3660f-88f2-4f80-ab3f-67aed6dcc9a5.jpeg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202862467-69e5e7a3-52a3-41a5-a2f9-1d9701001c9d.jpeg">|
| :---: | :---: |
|์ ์ฒดํ ๋จ์ฒด ์ฌ์ง|์๋ํ ๋จ์ฒด ์ฌ์ง|

<br>

## About Service
### LP(Listening Present)
๋น์ ์ ๊ธฐ๋ถ, ๋์๊ฐ ๋น์ ๊น์ง ๋ณํ์ํฌ ์์๊ณผ ๋ฉ์ธ์ง๋ฅผ ์ ๋ฌผํด์ค๋๋ค. <br>

<br>

## Video
<img width="270" src="https://user-images.githubusercontent.com/48701368/202875367-ad250da9-8257-48cc-9bc2-e19fd8000f6b.mov">

<br>

## Contributors
| [@youngjinc](https://github.com/youngjinc) | [@YuBeen-Park](https://github.com/YuBeen-Park) | [@waterminn](https://github.com/waterminn) | [@Mingmin99](https://github.com/Mingmin99) |
| :---: | :---: | :---: | :---: |
|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863535-62323660-66b7-403a-82e5-4031886e9626.jpg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863438-a253fc64-0e8f-4199-8e45-a20cab19229b.jpg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863454-217efd3f-2600-4f11-ae01-5d9c1ef72631.jpeg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863519-4580f5c1-bfb8-4769-9322-3f9e7a393aec.png">|
|**ํ์๊ฐ์ ๋ทฐ ๊ตฌํ ๋ฐ ์๋ฒ์ฐ๋<br>๊ธฐ๋ถ ์ ํ ๋ทฐ ๊ตฌํ ๋ฐ ๊ธฐ๋ถ ์๋ก๋ ์๋ฒ ์ฐ๋**|**๋ฉ์์ง ๋ฆฌ์คํธ ์กฐํ ์๋ฒ ์ฐ๋<br>๋ฉ์์ง ๋ฆฌ์คํธ ์กฐํ ๋ทฐ ๊ตฌํ**|**๋ฉ์์ง ์์ฑ ๋ทฐ ๊ตฌํ<br>๋ฉ์์ง ์์ฑ ์๋ฒ ์ฐ๋**|**๋ฉ์ธ์ง ๋ํ์ผ ๋ทฐ ๊ตฌํ<br>๋ฉ์ธ์ง ๋ํ์ผ ๋ทฐ ์๋ฒ์ฐ๋**|

<br>

## Convention
[Convention ๋ณด๋ฌ๊ฐ๊ธฐ Click โ](https://github.com/SOPT-31ST-SOPKATHON-TEAM10/Sopkathon-Android/wiki/Convention)

<br>

## Error Solved

# ์ ๋น
- NetWork Module์์ DEBUG์ BASE_URL์ด import๋์ง ์๋ ์๋ฌ
<br>
  =>build:clean project -> build:rebuild project๋ก ํด๊ฒฐํจ
<br>

- Binding์ด ์๋๋ ๋ฌธ์ 
<br>
  => xmlํ์ผ ๋ด๋ถ ์ฝ๋ layout์ผ๋ก ๊ฐ์ธ์ ํด๊ฒฐ
  
<br>

# ๋ฏผ์
- Detail view์์ ๋ฉ์์ง ํ์คํธ ๊ฐ max line ์ค์ ์ ํด๊ฒฐํ์ง ๋ชปํจ
<br>
  => ์คํฌ๋กค๋ทฐ๋ฅผ ํตํด ํด๊ฒฐ

<br>

# ์๋ฏผ
- ๋ทฐ์์ margin๊ฐ์ ๊ทธ๋๋ก ์ฃผ์๋๋ฐ๋ ๋ถ๊ตฌํ๊ณ  EditText๊ฐ ๋๊ฒ ํผ์ณ์ง์ง ์๋ ๋ฌธ์ 
<br>
  => width๋ฅผ 0dp๋ก ์ฃผ์ด์ ํด๊ฒฐ
<br>

- HTTP FAILED:java.net.SocketTimeoutException: failed to connect to /3.201.144.66 (port 3000) from /10.0.2.16 (port 48152) after 10000ms ์๋ฌ
<br>
  => ์์ฒญ์ ์์ํ ํ ์๋ฒ์์ ์ฐ๊ฒฐ์ด ์ ํ ์๊ฐ ๋ด์ ์ด๋ฃจ์ด์ง์ง ์์ ๊ฒฝ์ฐ ๋ฐ์ํ๋ ์๋ฌ
<br>
  => ์๋ฎฌ๋ ์ดํฐ๋ก ์คํํด์ ๋ฐ์ํ ๋ฌธ์ -> ์ฑ ์คํ ํ๊ฒฝ์ ๋ฐ๊ฟ์ ํด๊ฒฐ
<br>

# ์์ง
- ๋ ํธ๋กํ ์ฌ์ฉ ์ ์ธํฐ๋ท ํผ๋ฏธ์์ ์ฃผ์ง ์์์ Crash๊ฐ ๋ฐ์ํ ๋ฌธ์ 
<br>
   => ์ธํฐ๋ท ํผ๋ฏธ์ ์ถ๊ฐ
<br>
