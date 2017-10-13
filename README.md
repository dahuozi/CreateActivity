# 初识Activity
---
**怎样创建Activity**

> 继承Activity
>重写oncreate()方法
>为Activity提供布局xml方法
>清单文件中配置（Android studio自动配置了)

**如何启动Activity**

 - Intent 意图
    
---
#Activity的生命周期#

**什么是生命周期?**

从创建到消亡

**研究Activity生命周期有何作用**
在不同的状态时，执行不同的代码，发挥组件的最大作用

**Activity生命周期方法**
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestory()
![生命周期图解](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507904778998&di=f6df1f2d2d42c556f360fef0c63db786&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D942579926%2C3925376521%26fm%3D214%26gp%3D0.jpg)


**手机横竖屏切换时生命周期会发生如何变化**
