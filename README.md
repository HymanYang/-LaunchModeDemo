# LaunchModeDemo

> 阿里ARouter打开页面失效，引发的问题

**Q:** 一个关于FLAG_ACTIVITY_NEW_TASK使用问题,现在有 A,B,C,D四个Activity,luanchMode为默认模式，页面间的跳转方式使用getApplicationContex与addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)的方式跳转
页面交互流程，A->B->C->D->C ,
其中A,C是先调用打开下一个页面，在调用finish(),B是先finish(),然后调用打开下一个页面,
此时，D调用addFlags方式，无法打开C，为什么？

**A:** 需要探索
