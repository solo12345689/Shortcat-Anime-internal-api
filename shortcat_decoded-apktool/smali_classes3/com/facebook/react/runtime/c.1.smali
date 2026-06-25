.class public final Lcom/facebook/react/runtime/c;
.super Lcom/facebook/react/bridge/ReactApplicationContext;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/events/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/c$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/runtime/ReactHostImpl;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactHost"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactApplicationContext;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/facebook/react/runtime/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    const-class p1, Lcom/facebook/react/runtime/c;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string p2, "getSimpleName(...)"

    .line 30
    .line 31
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/react/runtime/c;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {}, Lh7/i;->c()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->initializeInteropModules()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Lq7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getDefaultBackButtonHandler$ReactAndroid_release()Lq7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()Lc7/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getDevSupportManager()Lc7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public destroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 7
    .line 8
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->fromJavaArgs([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "RCTDeviceEventEmitter"

    .line 17
    .line 18
    const-string v1, "emit"

    .line 19
    .line 20
    invoke-virtual {v0, p2, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->callFunctionOnModule$ReactAndroid_release(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Ly7/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->c:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "[WARNING] Bridgeless doesn\'t support CatalystInstance. Accessing an API that\'s not part of the new architecture is not encouraged usage."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/facebook/react/runtime/b;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/b;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    const-string v1, "CatalystInstance is not supported when Bridgeless mode is enabled."

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public getEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getFabricUIManager()Lcom/facebook/react/bridge/UIManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getUiManager$ReactAndroid_release()Lcom/facebook/react/fabric/FabricUIManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getJsCallInvokerHolder$ReactAndroid_release()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    .locals 4

    .line 1
    const-string v0, "jsInterface"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/bridge/ReactContext;->mInteropModuleRegistry:Lcom/facebook/react/bridge/interop/InteropModuleRegistry;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/interop/InteropModuleRegistry;->getInteropModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-class v1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lcom/facebook/react/runtime/c;->c:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v2, "getJSModule(RCTEventEmitter) is not recommended in the new architecture and will stop working with interop disabled. Please use UIManagerHelper.getEventDispatcher or UIManagerHelper.getEventDispatcherForReactTag instead"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Lcom/facebook/react/runtime/c$a;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 48
    .line 49
    invoke-direct {v2, v3, p1}, Lcom/facebook/react/runtime/c$a;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Class;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule"

    .line 57
    .line 58
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast p1, Lcom/facebook/react/bridge/JavaScriptModule;

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    return-object p1
.end method

.method public getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getJavaScriptContextHolder$ReactAndroid_release()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "nativeModuleInterface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->getNativeModule$ReactAndroid_release(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->getNativeModule$ReactAndroid_release(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModules()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getNativeModules$ReactAndroid_release()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSourceURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->handleHostException$ReactAndroid_release(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public hasActiveCatalystInstance()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/c;->hasActiveReactInstance()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public hasActiveReactInstance()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->isInstanceInitialized$ReactAndroid_release()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public hasCatalystInstance()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public hasNativeModule(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-string v0, "nativeModuleInterface"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->hasNativeModule$ReactAndroid_release(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public hasReactInstance()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->isInstanceInitialized$ReactAndroid_release()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isBridgeless()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public registerSegment(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->registerSegment$ReactAndroid_release(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Ly7/n;

    .line 14
    .line 15
    .line 16
    return-void
.end method
