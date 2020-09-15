# Groovy学习记录

![在这里插入图片描述](https://github.com/ChenYikunReal/groovy_training/blob/master/images/groovy.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg5NjMxOA==,size_16,color_FFFFFF,t_70)


![在这里插入图片描述](https://github.com/ChenYikunReal/groovy_training/blob/master/images/groovy-java.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg5NjMxOA==,size_16,color_FFFFFF,t_70)



为什么突然想捯饬Groovy呢？<br/>
因为我在翻IDEA的时候发现有个叫Groovy的东西，也不知道啥时候有的，也毕竟是JVM系列的编程语言，就想着简单试试呗。

## Groovy安装
- [官网下载](https://groovy.apache.org/download.html)


我觉得不需要安装包，用现成的zip解压，添加bin路径到path即可。

## Groovy相关产品
| 项目 | 说明 |
|:---:|:---:|
| Groovy Version | 3.0.5 |
| JVM Version | 1.8.0_131 |
| JVM Vendor | Oracle Corporation |
| OS | Windows 10 |

## Groovy语言简介
1. Groovy有同时支持静态和动态类型（Java本质上只支持静态类型）
2. Groovy支持运算符重载（Java不支持）
3. Groovy支持本地语法列表和关联数组
4. Groovy有对正则表达式的本地支持
5. Groovy有各种标记语言，如XML和HTML原生支持
6. Groovy和Java的语法非常相似
7. 可以使用现有的Java库
8. Groovy扩展了java.lang.Object


毕竟Groovy何止是和Java像啊，甚至可以说就是拿Java写的啊！（Maven建立Groovy项目也行）Groovy虽然本质上挣脱不出Java的局限，但是从语法形式上对Java的某些不尽完美的地方做了自己认为更合适的尝试。


## Groovy关键词
- as
- assert
- break
- case
- catch
- class
- const
- continue
- def
- default
- do
- else
- enum
- extends
- false
- finally
- for
- goto
- if
- implements
- import
- `in`
- instanceof
- interface
- new
- `pull`
- package
- return
- super
- switch
- this
- throw
- throws
- `trait`
- true
- try
- while	 	 	 

## Groovy学习札记
1. 基本格式是：`def regex = ~'Groovy'`，当Groovy运算符=〜在if和while语句中作为谓词(返回布尔值的表达式)出现时，左侧的String操作数与右侧的正则表达式操作数匹配。
2. Groovy的OOP语法感觉和Java基本一样。
3. Groovy的泛型感觉和Java也一样，甚至支持菱形语法。
4. 定义变量可以不强行指定类型，即`def a = 1;`，感觉有点儿像Java10的`var`。
5. 增强的迭代列表for循环不是Java那种格式了，改成了`for...in`的格式。
6. 对于函数/方法的使用，感觉也没啥特殊的。
7. Groovy也有装箱和拆箱的说法。
8. Groovy把字符串重复增强了，Java得用repeat()，Groovy直接用`*`即可，如`"Hello"*2`就是`"HelloHello"`
9. Groovy可以定义一个叫`范围`的东西，就是一个序列，可以是数值，可以是字符，可以升序，可以降序，便于速记一个间隔固定的范围区间。
10. Java数组用的是真难受，而我们亲爱的Groovy把数组做成了列表，和Python似的，极度便捷易用，嵌套、索引不在话下。
11. Java想弄映射一般得用Map，Groovy又做了个和Python字典很像的东西，用中括号括起来，就是一堆kv对儿的映射，空的格式是`[:]`。
12. Groovy日期用起来和Java手感差不多。
13. Groovy好像不搞什么Lambda表达式了，做了个闭包，这个概念在很多编程语言中也都有的。
14. JMX是defacto标准，Groovy可用其监控与Java虚拟环境有任何关系的所有应用程序。
15. 用JDBC的包就能直接连数据库，挺方便的。
16. 其实Groovy不需要用分号。
17. 感觉Trait像抽象类，具体没深入探究。
