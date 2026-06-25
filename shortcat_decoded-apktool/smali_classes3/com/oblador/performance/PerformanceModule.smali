.class public Lcom/oblador/performance/PerformanceModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;
.implements Lcom/oblador/performance/g$b;


# static fields
.field public static final BRIDGE_SETUP_START:Ljava/lang/String; = "bridgeSetupStart"

.field public static final PERFORMANCE_MODULE:Ljava/lang/String; = "RNPerformanceManager"

.field private static didEmit:Z = false

.field private static eventsBuffered:Z = true

.field private static final markBuffer:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/oblador/performance/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final startupMarkerListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;


# instance fields
.field private final contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/oblador/performance/PerformanceModule;->markBuffer:Ljava/util/Queue;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lcom/oblador/performance/PerformanceModule;->didEmit:Z

    .line 10
    .line 11
    new-instance v0, Lcom/oblador/performance/e;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/oblador/performance/e;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/oblador/performance/PerformanceModule;->startupMarkerListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/oblador/performance/d;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/oblador/performance/d;-><init>(Lcom/oblador/performance/PerformanceModule;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/oblador/performance/PerformanceModule;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/oblador/performance/PerformanceModule;->setupMarkerListener()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/oblador/performance/PerformanceModule;->setupNativeMarkerListener()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 2

    .line 1
    sget-object p1, Lcom/oblador/performance/PerformanceModule$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p1, p1, p2

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-static {}, Lcom/oblador/performance/PerformanceModule;->clearMarkBuffer()V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/oblador/performance/b;

    .line 17
    .line 18
    const-string p1, "bridgeSetupStart"

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-direct {p0, p1, v0, v1}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lcom/oblador/performance/PerformanceModule;->addMark(Lcom/oblador/performance/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    new-instance v0, Lcom/oblador/performance/b;

    .line 36
    .line 37
    invoke-static {p0}, Lcom/oblador/performance/PerformanceModule;->getMarkName(Lcom/facebook/react/bridge/ReactMarkerConstants;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0, p1, p2}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/oblador/performance/PerformanceModule;->addMark(Lcom/oblador/performance/a;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static addMark(Lcom/oblador/performance/a;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/oblador/performance/PerformanceModule;->markBuffer:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Lcom/oblador/performance/PerformanceModule;Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/oblador/performance/PerformanceModule;->lambda$new$1(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static clearMarkBuffer()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/oblador/performance/g;->c()Lcom/oblador/performance/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/oblador/performance/g;->a()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/oblador/performance/PerformanceModule;->markBuffer:Ljava/util/Queue;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/oblador/performance/a;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/oblador/performance/a;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method private emit(Lcom/oblador/performance/b;)V
    .locals 4

    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 4
    const-string v1, "name"

    invoke-virtual {p1}, Lcom/oblador/performance/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/oblador/performance/a;->c()J

    move-result-wide v1

    long-to-double v1, v1

    const-string v3, "startTime"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 6
    invoke-virtual {p1}, Lcom/oblador/performance/a;->a()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/oblador/performance/a;->a()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 8
    const-string v1, "detail"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 11
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    const-string v1, "mark"

    .line 12
    invoke-interface {p1, v1, v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private emit(Lcom/oblador/performance/c;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method private emitBufferedMarks()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/oblador/performance/PerformanceModule;->didEmit:Z

    .line 3
    .line 4
    sget-object v0, Lcom/oblador/performance/PerformanceModule;->markBuffer:Ljava/util/Queue;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/oblador/performance/a;

    .line 21
    .line 22
    invoke-direct {p0, v1}, Lcom/oblador/performance/PerformanceModule;->emitMark(Lcom/oblador/performance/a;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-direct {p0}, Lcom/oblador/performance/PerformanceModule;->emitNativeBufferedMarks()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private emitMark(Lcom/oblador/performance/a;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/oblador/performance/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/oblador/performance/b;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/oblador/performance/PerformanceModule;->emit(Lcom/oblador/performance/b;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private emitNativeBufferedMarks()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/oblador/performance/g;->c()Lcom/oblador/performance/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/oblador/performance/g;->b()Ljava/util/Queue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/oblador/performance/a;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Lcom/oblador/performance/PerformanceModule;->emitMark(Lcom/oblador/performance/a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method private emitNativeStartupTime()V
    .locals 4

    .line 1
    new-instance v0, Lcom/oblador/performance/b;

    .line 2
    .line 3
    const-string v1, "nativeLaunchStart"

    .line 4
    .line 5
    invoke-static {}, Lcom/oblador/performance/StartTimeProvider;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;J)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/oblador/performance/PerformanceModule;->safelyEmitMark(Lcom/oblador/performance/a;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/oblador/performance/b;

    .line 16
    .line 17
    const-string v1, "nativeLaunchEnd"

    .line 18
    .line 19
    invoke-static {}, Lcom/oblador/performance/StartTimeProvider;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-direct {v0, v1, v2, v3}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/oblador/performance/PerformanceModule;->safelyEmitMark(Lcom/oblador/performance/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private static getMarkName(Lcom/facebook/react/bridge/ReactMarkerConstants;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "_"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    array-length v1, p0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_2

    .line 24
    .line 25
    aget-object v4, p0, v3

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, 0x1

    .line 53
    if-le v5, v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method private synthetic lambda$new$1(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 0

    .line 1
    sget-object p2, Lcom/oblador/performance/PerformanceModule$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    if-eq p1, p2, :cond_1

    .line 11
    .line 12
    const/4 p3, 0x2

    .line 13
    if-eq p1, p3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-boolean p2, Lcom/oblador/performance/PerformanceModule;->eventsBuffered:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    sput-boolean p1, Lcom/oblador/performance/PerformanceModule;->eventsBuffered:Z

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/oblador/performance/PerformanceModule;->emitNativeStartupTime()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/oblador/performance/PerformanceModule;->emitBufferedMarks()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private safelyEmitMark(Lcom/oblador/performance/a;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/oblador/performance/PerformanceModule;->eventsBuffered:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lcom/oblador/performance/PerformanceModule;->addMark(Lcom/oblador/performance/a;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/oblador/performance/PerformanceModule;->emitMark(Lcom/oblador/performance/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static setupListener()V
    .locals 1

    .line 1
    sget-object v0, Lcom/oblador/performance/PerformanceModule;->startupMarkerListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->addListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setupMarkerListener()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/oblador/performance/PerformanceModule;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->addListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setupNativeMarkerListener()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/oblador/performance/g;->c()Lcom/oblador/performance/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/oblador/performance/g;->addListener(Lcom/oblador/performance/g$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNPerformanceManager"

    .line 2
    .line 3
    return-object v0
.end method

.method public invalidate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/oblador/performance/g;->c()Lcom/oblador/performance/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/oblador/performance/g;->removeListener(Lcom/oblador/performance/g$b;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/oblador/performance/PerformanceModule;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->removeListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public logMarker(Lcom/oblador/performance/a;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/oblador/performance/PerformanceModule;->didEmit:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/oblador/performance/PerformanceModule;->emitMark(Lcom/oblador/performance/a;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method
