# FontAwesomeIcon

FontAwesomeIcon is a simple library to use [FontAwesome](http://fontawesome.io) on Android.  
This library only aims to provide to use FontAwesome Icon very simply.  
So please customize your own layout with FontAwesomeIcon.  

# How to use
```java
FaIcon icon = new FaIcon(context);

icon.setIcon("fa-search");
icon.setColor(Color.argb(20, 128, 00, 00));
icon.setSize(context.getResources().getDimension(R.dimen.sample));
```

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:faicon="http://schemas.android.com/apk/res-auto"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:gravity="center">

    <com.teamhiroq.libs.fontawesomeicon.FaIcon
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        faicon:faSize="@dimen/sample"
        faicon:faIcon="fa-search"
        faicon:faColor="#14800000"/>
</LinearLayout>
```

|xmlns|
|-----|
|xmlns:faicon="http://schemas.android.com/apk/res-auto"|
  
| Attribute Name  | Related Method        | Description |
|-----------------|-----------------------|
| faicon:faSize   | setSize(float size)   | Specify font size. Format is completely same as TextSize like `@dimen/width`, `10dp`, `13sp`|
| faicon:faIcon   | setIcon(String name)  | Specify an icon name lile `fa-****`. Please refer to [support names](http://fontawesome.io/icons/)|
| faicon:faColor  | setColor(int color)   | Specify a icon color. Format is completely same as TextColor like `@color/red`, `#FF303030`(ARGB), `#303030`(RGB)|



# Support Icons
FontAwesome 4.2.0 [Icons](http://fontawesome.io/icons/)

# How to setup
## Android Studio
1. Move to project path  
```bash
cd path_to_project
```

2. Checkout FontAwesomeIcon and add git submodule  
```bash
git submodule add https://github.com/hiroq/FontAwesomeIcon.git
```
If your project does not have own git repository, use this command `git clone https://github.com/hiroq/FontAwesomeIcon.git` instead.

3. Configure to include FontAwesome  
Append `include ':FontAwesomeIcon:lib'` to "./settings.gradle".  
Sample is below:  
```./settings.gradle
include ':app'
include ':FontAwesomeIcon:lib'
```

4. Configure to compile FontAwesome  
Append `compile project(':FontAwesomeIcon:lib')` to "./app/build.gradle".  
Sample is below:  
```./app/build.gradle
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile project(':FontAwesomeIcon:lib')
}
```

5. Copy TRUE TYPE FONT to your assets dir  
```bash
cd path_to_project
cp ./FontAwesomeIcon/fontawesome-webfont.ttf ./app/src/main/assets/
```

## Eclipse
1. Clone FontAwesomeIcon to anywhere
2. Copy FaIcon.java and FontAwesome.java to your project. Please make package directories before coping.
3. Copy fontawesome-webfont.ttf to your project assets directory.

# How to fetch latest FontAwesome
To execute following commands, you can fetch the latest FontAwesome to your local library.

```bash
cd FontAwesomeIcon/generator
chmod +x ./generator.sh
./generator.sh
```

NOTE : Please make sure that your computer is Linux/Mac and PHP is installed before to run above generator.sh
