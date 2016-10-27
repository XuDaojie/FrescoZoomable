FrescoZoomable
===
[![](https://jitpack.io/v/XuDaojie/FrescoZoomable.svg)](https://jitpack.io/#XuDaojie/FrescoZoomable)

使[Fresco](https://github.com/facebook/fresco)可以支持手势放大图片,
源码从**Fresco**的[sample](https://github.com/facebook/fresco/tree/master/samples/zoomableapp)中提取的,
只是为了方便引入

## Use
``` java
ZoomableDraweeView draweeView = (ZoomableDraweeView) findViewById(R.id.zoomable_view);
draweeView.setAllowTouchInterceptionWhileZoomed(true);
DraweeController controller = Fresco.newDraweeControllerBuilder()
        .setUri(imageUri)
        .build();
draweeView.setController(controller);
```

## How to
To get a Git project into your build:
### Step1. Add the JitPack repository to your build file
``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
### Step2. Add the dependency
``` gradle
dependencies {
    compile 'com.github.XuDaojie:FrescoZoomable:v0.1.0'
    compile 'com.facebook.fresco:fresco:0.14.1'
    //compile('com.facebook.fresco:fresco:0.14.1', {
    //    exclude group: 'com.android.support'
    //})
}
```