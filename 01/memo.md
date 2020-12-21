### 第1週目
- cd /c/Users/saito/Desktop/2_4_ソフトウェア演習4
- git config --global user.name "tut203326"
- git config --global user.email "d203326@gmail.com"
- git init (ls -aで確認)
- git clone https://github.com/tut203326/2020informationQuantity
- cd 2020informationQuantity
- git log
- Hello.javaの出力メッセージを変更
- git add s4/B203326/Hello.java
- git commit (コメントを追加)
- git push


# クラスの定義
class House:
    def __init__(self, name, distance, crime):
        self.name = name
        self.distance = distance
        self.crime = crime
    
    def get_info(self):
        return '名前は' + str(self.name) + '、駅からの距離は' + str(self.distance) + '、犯罪発生率は' + str(self.crime)