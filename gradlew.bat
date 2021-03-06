????   4F .kotlinx/coroutines/android/HandlerDispatcherKt  java/lang/Object  from V(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher; Lkotlin/jvm/JvmName; name Lkotlin/jvm/JvmOverloads; #Lorg/jetbrains/annotations/NotNull; $Lorg/jetbrains/annotations/Nullable; )kotlinx/coroutines/android/HandlerContext  <init> )(Landroid/os/Handler;Ljava/lang/String;)V  
   ,kotlinx/coroutines/android/HandlerDispatcher  $this$asCoroutineDispatcher Landroid/os/Handler; Ljava/lang/String; from$default i(Landroid/os/Handler;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/android/HandlerDispatcher;  
   	asHandler *(Landroid/os/Looper;Z)Landroid/os/Handler; 'Landroidx/annotation/VisibleForTesting; java/lang/NoSuchMethodException  android/os/Build$VERSION   SDK_INT I " #	 ! $ android/os/Handler & (Landroid/os/Looper;)V  (
 ' ) createAsync + java/lang/Class - android/os/Looper / getDeclaredMethod @(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method; 1 2
 . 3 java/lang/reflect/Method 5 invoke 9(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object; 7 8
 6 9 java/lang/NullPointerException ; 7null cannot be cast to non-null type android.os.Handler = (Ljava/lang/String;)V  ?
 < @ android/os/Handler$Callback B java/lang/Boolean D TYPE Ljava/lang/Class; F G	 E H getDeclaredConstructor 3([Ljava/lang/Class;)Ljava/lang/reflect/Constructor; J K
 . L valueOf (Z)Ljava/lang/Boolean; N O
 E P java/lang/reflect/Constructor R newInstance '([Ljava/lang/Object;)Ljava/lang/Object; T U
 S V factoryMethod Ljava/lang/reflect/Method; ignored !Ljava/lang/NoSuchMethodException; constructor Ljava/lang/reflect/Constructor; $this$asHandler Landroid/os/Looper; async Z [Ljava/lang/Object; b [Ljava/lang/Class; d getMain$annotations ()V Lkotlin/Deprecated; message Use Dispatchers.Main instead level Lkotlin/DeprecationLevel; HIDDEN 
awaitFrame 4(Lkotlin/coroutines/Continuation;)Ljava/lang/Object; G(Lkotlin/coroutines/Continuation<-Ljava/lang/Long;>;)Ljava/lang/Object; choreographer Landroid/view/Choreographer; q r	  s .kotlinx/coroutines/CancellableContinuationImpl u )kotlin/coroutines/intrinsics/IntrinsicsKt w intercepted B(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation; y z
 x { $(Lkotlin/coroutines/Continuation;I)V  }
 v ~ initCancellability ? g
 v ? *kotlinx/coroutines/CancellableContinuation ? access$postFrameCallback K(Landroid/view/Choreographer;Lkotlinx/coroutines/CancellableContinuation;)V ? ?
  ? 	getResult ()Ljava/lang/Object; ? ?
 v ? getCOROUTINE_SUSPENDED ? ?
 x ? ,kotlin/corout