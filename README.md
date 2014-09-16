# FontAwesomeIcon

FontAwesomeIcon is a library to use [FontAwesome](http://fontawesome.io) on Android.


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

# Support Icons
FontAwesome 4.2.0 [Icons](http://fontawesome.io/icons/)

# How to setup
## Android Studio


## Eclipse


# How to update to latest FontAwesome
To execute following commands, you can fetch the latest FontAwesome to your local library.

```sh
cd FontAwesomeIcon/generator
chmod +x ./generator.sh
./generator.sh
```

NOTE : Please make sure that your computer is Linux/Mac and PHP is installed before to run above generator.sh
