-------------------------------------------------------------------------------
 [   名称   ] 初学者向けプログラミング学習環境 PEN
                  ( Programming Environment for Novices )
 [  開発者  ] 中村 亮太 : 大阪市立大学 大学院創造都市研究科
              西田 知博 : 大阪学院大学 情報学部
              松浦 敏雄 : 大阪市立大学 大学院創造都市研究科
 [  連絡先  ] pen@s.ogu.ac.jp
 [  配布元  ] http://www.media.osaka-cu.ac.jp/PEN/
 [ 開発環境 ]
     Microsoft Windows 7 pro SP1 64bit + JDK ver 1.6.0 (32bit) + JavaCC ver 5.0
     Microsoft Windows 8.1 pro 64bit + JDK ver 1.5.0 (32bit) + JavaCC ver 5.0
     Mac OS X 10.9.4 Intel 64bit + JDK ver 1.6.0 + JavaCC ver 5.0
 [ 動作確認 ]
     Microsoft Windows 7 pro SP1 64bit    + JDK ver 1.6.0 (64bit)
     Microsoft Windows 8.1 pro 64bit      + JDK ver 1.7.0 (64bit)
     Mac OS X 10.9.4 Intel 64bit          + JDK ver 1.6.0
 [  著作権  ] Copyright(C) 2003-2014 by 中村 亮太, 西田 知博, 松浦 敏雄
 [転載・配布] GPLに準ずる
 [使用上注意] 本プログラムにていかなる問題が発生した場合も
              作者は一切の責任を負わないものとします。
-------------------------------------------------------------------------------

＜内容物＞
./
  |- ./Manual/
  |  |- PEN-QuickReference.pdf      … 操作マニュアルです
  |  |- xDNCL-Language-Manual.pdf   … PENで記述するプログラムの言語仕様書です
  |  |- xDNCL-Draw.pdf              … 描画に関する関数マニュアルです
  |  |- xDNCL-FileIO.pdf            … FileI/Oに関する関数マニュアルです
  |  -- ini.pdf                     … PENの設定ファイルに関するマニュアルです
  |- ./ButtonList/
  |  |- Default.ini                 … プログラム入力支援ボタン 定義ファイル
  |  |- DrawList.ini                … 簡易版 描画専用プログラム入力支援ボタン 定義ファイル
  |  |- Arduino.ini                 … Arduino制御用プログラム入力支援ボタン 定義ファイル
  |  -- ArduinoSimple.ini           … 簡易版 Arduino制御用プログラム入力支援ボタン 定義ファイル
  |- ./lib/                         … Javaのライブラリ
  |- ./lib64/                       … Javaのライブラリ(64bit版)
  |- ./plugin/                      … プラグインファイル
  |- ./sample/                      … PENのサンプルプログラムです
  |- ChangeLog.txt                  … PENの更新履歴です
  |- functionTable.ini              … プラグイン機能で呼び出す関数を定義するファイル
  |- PEN.jar                        … PEN本体です
  |- PEN.url                        … 配布元 Webページのリンクです
  |- Property.ini                   … PENの設定を行うファイルです
  -- ReadMe.txt                     … このファイルです

＜概要＞
PENは初学者向けのプログラミング学習環境です。
PENで動作するプログラム言語は、
　センター試験用手順記述標準言語 DNCL
に拡張を行った xDNCL言語 を用いています。

詳しくは xDNCL-Language-Manual.pdf を参照してください。

＜動作条件＞
PEN は Java で記述しているので JRE v1.6.x 以降が必要です。
Javaは下記のURLよりダウンロードできます

・JRE 1.7.0
　http://www.java.com/ja/

＜インストール＞
使用されるユーザの書き込み権限があるディレクトリなら
どこでも好きな場所に置いていただいて構いません。

＜アンインストール＞
PENのディレクトリごと削除してください。
レジストリ等は操作していません。

＜PENの起動＞
[ PEN.jar ] をダブルクリックして起動してください。
またはコマンドで [ java -jar PEN.jar ] と起動してください。
PENの使い方は [ PEN-QuickReference.pdf ] を参照してください。

＜PENの使い方＞
PENの使い方は [ PEN-QuickReference.pdf ] を参照してください。

＜プログラム入力支援ボタンのカスタマイズ＞
プログラム入力支援ボタンのボタンは ./ButtonList/Default.ini を読み込んで、
記述された内容の通りに配置しています。