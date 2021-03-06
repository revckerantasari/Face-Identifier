# ๐ฅ MLKit Demo
A demo app for Firebase ML-Kit which is a mobile SDK provided by Google to bring Google's machine learning expertise to mobile apps in a powerful yet easy-to-use way

> ML-kit is in beta release for now ๐ฉโ๐ฌ

## ๐ฑ About the app
The app contains various examples of ML-Kit (Vision part), each example is presented as a single activity (All in one app ๐คญ)

## ๐ซ Available Examples

### ๐ธ Camera
- [๐ท CameraX example](app/src/main/java/com/asmaamir/mlkitdemo/CameraX): Preview, Capture and Analyze functionalities ๐คนโโ๏ธ 

### ๐ผ ML Kit Models
- [๐ฉโ๐ Real time face detection](app/src/main/java/com/asmaamir/mlkitdemo/RealTimeFaceDetection): Contour detecting 
- [๐ด Face detection from a picked image](app/src/main/java/com/asmaamir/mlkitdemo/CaptureFaceDetection): Contour, landmarks and face classification
- [๐ต๏ธโโ๏ธ Face detection and tracking](app/src/main/java/com/asmaamir/mlkitdemo/FaceTracking): Tracking faces over frames
- [๐ Real time object detection](app/src/main/java/com/asmaamir/mlkitdemo/RealTimeObjectDetection): Object detection and classification

### ๐ Custom Models (Local ๐)
- [๐ต๏ธโโ๏ธ Object Detection](app/src/main/java/com/asmaamir/mlkitdemo/CustomModelDetection)
> Still has drawing issue ๐

#### ๐ Used Models
- Object Detection: [๐ COCO SSD MobileNet v1](https://www.tensorflow.org/lite/models/object_detection/overview#performance_benchmarks)

## ๐ Note
- ๐ฎโโ๏ธ Presented codes are not optimized, since it is a demo it aims **simplicity**
- ๐ Check out best practices that will be suitable to your project

## ๐ Known Bug
- ๐ Face contour detection functionality can detect contours of an only single face in the image 
  - [๐ Stack Overflow](https://stackoverflow.com/q/57203678)
- ๐ฉโ๐ป Please tell me if you have a solution

## ๐คณ Screenshots
### ๐ Nav Menu
<div float="left">
	<img src="./res/all.png" width="200" />
</div>

### ๐ฉโ๐ Real Time Face Detection
<div float="left">
	<img src="./res/realtime_face_detection.png" width="200" />
</div>

### ๐ด Face Detection From a Picked Image
<div float="left">
	<img src="./res/pick_face_detection.png" width="200" />
</div>

### ๐ Real Time Object Detection
<div float="left">
	<img src="./res/object_detection.png" width="200" />
</div>


### ๐ต๏ธโโ๏ธ Face Detection and Tracking
<div float="left">
	<img src="./res/track.gif" width="200" />
</div>

### ๐ Custom Object Detection
<div float="left">
	<img src="./res/custom_det.jpg" width="200" />
</div>


## ๐ผ Contact and Support
Find me on [LinkedIn](https://www.linkedin.com/in/asmaamirkhan/) and feel free to mail me, [Asmaa ๐ฆ](mailto:asmaamirkhan.am@gmail.com)

