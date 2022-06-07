# Gramoday
To Check deep link working or not via ADB command line run this command: ``` adb shell am start -W -a android.intent.action.VIEW -d "https://app.gramoday.net/<profile slug>" com.example.gramoday```

Add deep link verification to your app.

To add deep link verification to your app you need to add Digital Asset Links file to associate your website with your app.
1. To Create Digital Asset Links file, you have to get SHA-256 hash of your App.
2. To get SHA-256 hash of your App, you have to run the following command in your terminal:
    ```keytool -list -v -keystore "C:\<Path of keystore file>\android.jks" -alias <keyAlias> -storepass 1password -keypass 2password```
3. You will get the SHA-256 hash of your App.
4. Than create Digital Asset Links json file name by `assetlinks.json` and add the following content to it:
```
   [{
   "relation": ["delegate_permission/common.handle_all_urls"],
   "target": {
   "namespace": "android_app",
   "package_name": "<APP_PACKAGE_NAME>",
   "sha256_cert_fingerprints":["<HASH_OF_YOUR_APP>"]
   }
   }]
```
5. Upload the `assetlinks.json` file to your site, with read-access for everyone, at `https://<yoursite>/assetlinks.json`.
    
