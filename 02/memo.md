### 第2週目　
#### よくわからないからもう一つフォルダを作成した
- cd /c/Users/saito/Desktop/2_4_soft4
#### 1~2
- (なくてもいい)git clone https://github.com/tut203326/2020informationQuantity
    cd 2020informationQuantity/　←ここにupstreamの更新を反映させる！！
- git init 
- git remote add upstream https://github.com/TUT3Software4Project/2020informationQuantity
- git pull upstream main --no-edit
- git push

#### 4
- makeのインストール
- bashで(powershellだとすこしコマンドが違う)
    - pwd
    - /mnt/c/Users/saito/Desktop/2_4_soft4/2020informationQuantity
    - cd s4/specification; make javadoc; cd ../..

#### 7~9
- ソースコードにメモしてある

#### 10
- $ pwd
- /c/Users/saito/Desktop/2_4_soft4
- git add 2020informationQuantity
- git commit
    - コメントを追加
- git push


#### よくわからないけど、いじってたらできた
- git clone https://github.com/tut203326/2020informationQuantity
- cd 2020informationQuantity 
- git pull upstream main --no-edit
- git remote add upstream https://github.com/TUT3Software4Project/2020informationQuantity
- git pull upstream main --no-edit
- git push
- git add s4/B203326/TestCase.java
- git commit
- git push

