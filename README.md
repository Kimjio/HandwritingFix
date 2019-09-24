# HandwritingFix
[ ![Download](https://api.bintray.com/packages/kimji/maven/HandwritingFix/images/download.svg) ](https://bintray.com/kimji/maven/HandwritingFix/_latestVersion)

Wear OS용 구글 필기 입력 버그 수정

### Usage

On your build.gradle, add the library to the dependencies section:
```gradle
dependencies {
  // ...
  implementation 'com.kimjio:handwritingfix:1.0'
  // ...
}
```

Code:
```java
/*
 * Without OnEditorActionListener
 */
EditText editText = findViewById(R.id.edit_text);
new HandwritingHelper().attachToTextView(editText);
```
```java
/*
 * With OnEditorActionListener
 */
EditText editText = findViewById(R.id.edit_text);
new HandwritingHelper((v, actionId, event) -> {
    //TODO Handle Editor Action
}).attachToTextView(editText);
```
