# YTRemote

مشروع Android متعدد الوحدات لتطبيق تحكم محلي في YouTube:
- `app-tv`: تطبيق الشاشة (Android 9 / API 28 كحد أدنى).
- `app-ph`: تطبيق الهاتف.
- `core`: ثوابت بروتوكول الأوامر المشتركة.

## البناء محلياً
يتطلب JDK 17 و Android SDK Platform 35 و Gradle 8.10.2:

```bash
gradle assembleDebug
```

ملفات APK:
- `app-tv/build/outputs/apk/debug/app-tv-debug.apk`
- `app-ph/build/outputs/apk/debug/app-ph-debug.apk`

## البناء على GitHub
ارفع المشروع إلى مستودع GitHub، ثم افتح تبويب Actions وشغّل `Build YTRemote APKs`.
ستجد الملفين في Artifacts بعد نجاح البناء.

## ملاحظة المرحلة الأولى
هذه نسخة تأسيسية قابلة للتطوير: تطبيق الشاشة يفتح YouTube داخل WebView،
وتطبيق الهاتف يحتوي واجهة أولية. لم يتم بعد تنفيذ WebSocket والاقتران والماوس
والبحث؛ ستتم إضافتها واختبارها في المراحل التالية.
