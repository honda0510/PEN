-------------------------------------------------------------------------------
 [   ����   ] ���w�Ҍ����v���O���~���O�w�K�� PEN
                  ( Programming Environment for Novices )
 [  �J����  ] ���� ���� : ���s����w ��w�@�n���s�s������
              ���c �m�� : ���w�@��w ���w��
              ���Y �q�Y : ���s����w ��w�@�n���s�s������
 [ Applet�� ] ���@ �i�@ : ���d�C�ʐM��w
 [  �A����  ] pen@s.ogu.ac.jp
 [  �z�z��  ] http://www.media.osaka-cu.ac.jp/PEN/
 [ �J���� ]
     Microsoft Windows 7 pro SP1 64bit + JDK ver 1.5.0 (32bit) + JavaCC ver 5.0
     Microsoft Windows 8.1 pro 64bit + JDK ver 1.5.0 (32bit) + JavaCC ver 5.0
     Mac OS X 10.9.4 Intel 64bit + JDK ver 1.6.0 + JavaCC ver 5.0
 [ ����m�F ]
     Microsoft Windows 7 pro SP1 64bit    + JDK ver 1.6.0 (32bit)
     Microsoft Windows 7 pro SP1 64bit    + JRE ver 1.6.0 (64bit)
     Microsoft Windows 8.1 pro 64bit      + JDK ver 1.6.0 (32bit)
     Microsoft Windows 8.1 pro 64bit      + JRE ver 1.7.0 (64bit)
     Mac OS X 10.9.4 Intel 64bit          + JRE v 1.6.0
 [  ���쌠  ] Copyright(C) 2003-2014 by ���� ����, ���c �m��, ���Y �q�Y, ���@ �i
 [�]�ځE�z�z] GPL�ɏ�����
 [�g�p�㒍��] �{�v���O�����ɂĂ����Ȃ��肪���������ꍇ��
              ��҂͈�؂̐ӔC�𕉂�Ȃ����̂Ƃ��܂��B
-------------------------------------------------------------------------------

�����e����
./
  |- ./Manual/
  |  |- PEN-QuickReference.pdf      �c ����}�j���A���ł�
  |  |- xDNCL-Language-Manual.pdf   �c PEN�ŋL�q����v���O�����̌���d�l���ł�
  |  |- xDNCL-Draw.pdf              �c �`��Ɋւ���֐��}�j���A���ł�
  |  |- xDNCL-FileIO.pdf            �c FileI/O�Ɋւ���֐��}�j���A���ł�
  |  -- ini.pdf                     �c PEN�̐ݒ�t�@�C���Ɋւ���}�j���A���ł�
  |- ./ButtonList/
  |  |- Default.ini                 �c �v���O�������͎x���{�^�� ��`�t�@�C��
  |  -- DrawList.ini                �c �`���p�ȈՃv���O�������͎x���{�^�� ��`�t�@�C��
  |- ./lib/                         �c Java�̃��C�u����
  |- ./lib64/                       �c Java�̃��C�u����(64bit��)
  |- ./plugin/                      �c �v���O�C���t�@�C��
  |- ./sample/                      �c PEN�̃T���v���v���O�����ł�
  |- ChangeLog.txt                  �c PEN�̍X�V�����ł�
  |- functionTable.ini              �c �v���O�C���@�\�ŌĂяo���֐����`����t�@�C��
  |- PEN.jar                        �c PEN�{�̂ł�
  |- PEN.bat                        �c Windows��PEN���N�����邽�߂̃t�@�C��
  |- PEN.command                    �c MacOS��PEN���N�����邽�߂̃t�@�C��
  |- PEN.sh                         �c Linux��PEN���N�����邽�߂̃V�F���X�N���v�g
  |- PEN64.sh                       �c Linux 64bit��PEN���N�����邽�߂̃V�F���X�N���v�g
  |- PEN.url                        �c �z�z�� Web�y�[�W�̃����N�ł�
  |- Property.ini                   �c PEN�̐ݒ���s���t�@�C���ł�
  -- ReadMe.txt                     �c ���̃t�@�C���ł�

���T�v��
PEN�͏��w�Ҍ����̃v���O���~���O�w�K���ł��B
PEN�œ��삷��v���O��������́A
  ��w�����Z���^�[�̎菇�L�q���� DNCL 
�Ɋg�����s���� xDNCL���� ��p���Ă��܂��B

�ڂ����� xDNCL-Language-Manual.pdf ���Q�Ƃ��Ă��������B

�����������
PEN �� Java �ŋL�q���Ă���̂� JRE v1.6.x �ȍ~���K�v�ł��B
Java�͉��L��URL���_�E�����[�h�ł��܂�

�EJRE 1.7.0
�@http://www.java.com/ja/

���C���X�g�[����
[ PEN ] �̃t�H���_��K���ȏꏊ�ɃR�s�[���Ă��������B
CD-ROM����R�s�[�������̓R�s�[��ɁA
�u�ǂݎ���p�v�̃`�F�b�N���O���Ă��������B

���A���C���X�g�[����
�C���X�g�[�������f�B���N�g�����ƍ폜���Ă��������B
���W�X�g�����͑��삵�Ă��܂���B

��PEN�̋N����
Windows�̏ꍇ          �F[ PEN.bat ] ���_�u���N���b�N���ċN�����Ă��������B
MacOS�̏ꍇ            �F[ PEN.command ] ���_�u���N���b�N���ċN�����Ă��������B
���̑���OS(32bit)�̏ꍇ�F[ PEN.sh ] ���_�u���N���b�N�܂��̓R�}���h���C������N�����Ă��������B
���̑���OS(64bit)�̏ꍇ�F[ PEN64.sh ] ���_�u���N���b�N�܂��̓R�}���h���C������N�����Ă��������B

���R�}���h���C������̋N����
Windows 32bit �̏ꍇ�F java -cp "lib/RXTXcomm.jar;PEN.jar" -Djava.library.path=lib PEN
Wondows 64bit �̏ꍇ�F java -cp "lib64/RXTXcomm.jar;PEN.jar" -Djava.library.path=lib64 PEN
���̑��� 32bit OS �̏ꍇ�Fjava -jar -Djava.library.path=./lib PEN.jar
���̑��� 64bit OS �̏ꍇ�Fjava -jar -Djava.library.path=./lib64 PEN.jar

��PEN�̎g������
PEN�̎g������ [ PEN-QuickReference.pdf ] ���Q�Ƃ��Ă��������B

���v���O�������͎x���{�^���̃J�X�^�}�C�Y��
�v���O�������͎x���{�^���̃{�^���� ./ButtonList/Default.ini ��ǂݍ���ŁA
�L�q���ꂽ���e�̒ʂ�ɔz�u���Ă��܂��B

-------------------------------------------------------------------------------

���ӎ���
Applet�ŊJ���ɂ����� ���d�C�ʐM��w ���@ �i �搶�ɑ���Ȃ邲���͂����������A
�܂��AMac OS X �ł̓���m�F�̂��߂̊��𖳏��Œ񋟂��Ă�������ȂǁA
���̏�����؂肵�ĐS���炨���\���グ�܂��B

-------------------------------------------------------------------------------
