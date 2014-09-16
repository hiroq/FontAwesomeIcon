#!/bin/bash

#clean up
rm ../lib/src/main/java/com/teamhiroq/libs/fontawesomeicon/FontAwesome.java
rm ../fontawesome-webfont.ttf
rm ../test/src/main/assets/fontawesome-webfont.ttf
rm -r ./tmp

# download and extract a ttf file
filename=`php ./util/getfilename.php`
mkdir ./tmp
curl -o ./tmp/fontawesome.zip "http://fontawesome.io/assets/"$filename".zip"
unzip ./tmp/fontawesome.zip -d ./tmp
cp ./tmp/$filename/fonts/fontawesome-webfont.ttf ../fontawesome-webfont.ttf
cp ./tmp/$filename/fonts/fontawesome-webfont.ttf ../test/src/main/assets/fontawesome-webfont.ttf
rm -r ./tmp

# generate FontAwesome.java
php ./util/generator.php > ../lib/src/main/java/com/teamhiroq/libs/fontawesomeicon/FontAwesome.java

