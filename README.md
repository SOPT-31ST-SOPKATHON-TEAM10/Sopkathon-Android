# 🚀 Sopkathon-Team10-Android 🚀
### IN SOPT 31ST 솝커톤 10조 Android팀

<br>

|<img width="400" src="https://user-images.githubusercontent.com/48701368/202862451-f0f3660f-88f2-4f80-ab3f-67aed6dcc9a5.jpeg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202862467-69e5e7a3-52a3-41a5-a2f9-1d9701001c9d.jpeg">|
| :---: | :---: |
|전체팀 단체 사진|안드팀 단체 사진|

<br>

## About Service
### LP(Listening Present)
당신의 기분, 나아가 당신까지 변화시킬 음악과 메세지를 선물해줍니다. <br>

<br>

## Video
개발 완료 후 업로드 예정 :)
<!-- <img width="270" src="업로드 예정..."> -->

<br>

## Contributors
| [@youngjinc](https://github.com/youngjinc) | [@YuBeen-Park](https://github.com/YuBeen-Park) | [@waterminn](https://github.com/waterminn) | [@Mingmin99](https://github.com/Mingmin99) |
| :---: | :---: | :---: | :---: |
|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863535-62323660-66b7-403a-82e5-4031886e9626.jpg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863438-a253fc64-0e8f-4199-8e45-a20cab19229b.jpg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863454-217efd3f-2600-4f11-ae01-5d9c1ef72631.jpeg">|<img width="400" src="https://user-images.githubusercontent.com/48701368/202863519-4580f5c1-bfb8-4769-9322-3f9e7a393aec.png">|
|**회원가입 뷰 구현 및 서버연동<br>기분 선택 뷰 구현 및 기분 업로드 서버 연동**|**메시지 리스트 조회 서버 연동<br>메시지 리스트 조회 뷰 구현**|**메시지 작성 뷰 구현<br>메시지 작성 서버 연동**|**메세지 디테일 뷰 구현<br>메세지 디테일 뷰 서버연동**|

<br>

## Convention
[Convention 보러가기 Click ✔](https://github.com/SOPT-31ST-SOPKATHON-TEAM10/Sopkathon-Android/wiki/Convention)

<br>

## Error Solved

# 유빈
- NetWork Module에서 DEBUG와 BASE_URL이 import되지 않는 에러
<br>
  =>build:clean project -> build:rebuild project로 해결함
<br>

- Binding이 안되는 문제
<br>
  => xml파일 내부 코드 layout으로 감싸서 해결
  
<br>

# 민영
- Detail view에서 메시지 텍스트 값 max line 설정을 해결하지 못함
<br>
  => 스크롤뷰를 통해 해결

<br>

# 수민
- 뷰에서 margin값을 그대로 주었는데도 불구하고 EditText가 넓게 펼쳐지지 않는 문제
<br>
  => width를 0dp로 주어서 해결
<br>

- HTTP FAILED:java.net.SocketTimeoutException: failed to connect to /3.201.144.66 (port 3000) from /10.0.2.16 (port 48152) after 10000ms 에러
<br>
  => 요청을 시작한 후 서버와의 연결이 제한 시간 내에 이루어지지 않을 경우 발생하는 에러
<br>
  => 에뮬레이터로 실행해서 발생한 문제-> 앱 실행 환경을 바꿔서 해결

<br>
