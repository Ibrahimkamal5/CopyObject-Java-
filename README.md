# CopyObject-Java-
CopyObject – Java Object Cloning Example  This is a simple Java example demonstrating how object copying works using a single class.  What this example shows:  Creating a copy of an object  Understanding the difference between copying a reference and copying the actual object  Basic implementation using clone() or Copy Constructor
Purpose:
This example was built to understand how object references behave in Java and how to avoid unintended data sharing between objects.

//-------------------------------------------
Copy Object in Java (Single Class Example)
* Overview
This project demonstrates how object copying works in Java using a single class example.
It focuses on understanding how references behave and how to create an actual copy of an object instead of just copying its reference.
* Purpose
The goal of this project is to:
Understand the difference between copying a reference and copying an object.
Learn how to create a copy using:
Copy Constructor
clone() method
Avoid common mistakes related to shared references in Java.
* Key Concept
In Java, when you assign one object to another:
ClassName obj2 = obj1;
You are not creating a new object
You are copying the reference, meaning both variables point to the same object in memory.
To create a real copy, you must explicitly clone or construct a new object.
* Technologies Used
Java (Core Java)
Object-Oriented Programming Concepts
* What This Example Includes
A simple class with attributes
Object creation
Object copying
Demonstration of how changes affect copied objects
* Learning Outcome
After completing this example, you should understand:
How object references work in Java
The difference between shallow copy and reference copy
Why proper object copying is important



سخ الكائنات في جافا (مثال بكلاس واحد)
📖 نظرة عامة

هذا المشروع يوضح كيفية عمل نسخ للكائنات في جافا باستخدام مثال يحتوي على كلاس واحد فقط.
يركز على فهم طريقة عمل المراجع (References) وكيفية إنشاء نسخة حقيقية من الكائن بدلًا من نسخ المرجع فقط.
* الهدف
الهدف من هذا المشروع هو:
فهم الفرق بين نسخ المرجع ونسخ الكائن نفسه.
تعلم إنشاء نسخة باستخدام:
الـ Copy Constructor
دالة clone()
تجنب الأخطاء الشائعة المتعلقة بمشاركة نفس المرجع بين الكائنات.
* الفكرة الأساسية
في جافا، عند كتابة:
ClassName obj2 = obj1;

فأنت لا تنشئ كائنًا جديدً،
بل تنسخ المرجع فقط، مما يعني أن المتغيرين يشيران لنفس الموقع في الذاكرة.
لإنشاء نسخة حقيقية، يجب إنشاء كائن جديد يدويًا أو استخدام clone().
* التقنيات المستخدمة
جافا (Core Java)
مفاهيم البرمجة كائنية التوجه (OOP)
* ماذا يحتوي المثال
كلاس بسيط يحتوي على خصائص
إنشاء كائنات
نسخ كائن
توضيح تأثير التعديلات على النسخ
* النتيجة التعليمية
بعد إنهاء هذا المثال ستفهم:
كيف تعمل المراجع في جافا
الفرق بين نسخ المرجع والنسخ الفعلي
أهمية إنشاء نسخة صحيحة من الكائن
