.class public final Lcom/facebook/react/animated/NativeAnimatedModule;
.super Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lcom/facebook/react/bridge/UIManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/NativeAnimatedModule$a;,
        Lcom/facebook/react/animated/NativeAnimatedModule$b;,
        Lcom/facebook/react/animated/NativeAnimatedModule$c;,
        Lcom/facebook/react/animated/NativeAnimatedModule$d;,
        Lcom/facebook/react/animated/NativeAnimatedModule$e;
    }
.end annotation

.annotation runtime Lk7/a;
    name = "NativeAnimatedModule"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0008\u000e*\u0001v\u0008\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u001b\u0010\u000e\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u000f\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0010J\u000f\u0010#\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008#\u0010\u0010J\u000f\u0010$\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008$\u0010\u0010J\u000f\u0010%\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008%\u0010\u0010J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u001f\u0010,\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008,\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008/\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u00080\u0010.J\u001f\u00102\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016\u00a2\u0006\u0004\u00082\u00103J\u001f\u00104\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016\u00a2\u0006\u0004\u00084\u00103J\u0017\u00105\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u00085\u0010.J\u0017\u00106\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u00086\u0010.J/\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008>\u0010.J\u001f\u0010A\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008A\u00103J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008B\u00103J\u001f\u0010D\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008D\u00103J\u001f\u0010E\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008E\u00103J\u0017\u0010F\u001a\u00020\n2\u0006\u00108\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008F\u0010.J\'\u0010J\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008J\u0010KJ\'\u0010M\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010L\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008R\u0010.J\u001f\u0010U\u001a\u00020\n2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008W\u0010\u0010J\u0017\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020XH\u0016\u00a2\u0006\u0004\u0008Z\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0018\u0010b\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010aR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010lR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010iR\u0016\u0010o\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010iR\u001c\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008p\u0010q\u0012\u0004\u0008r\u0010\u0010R\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008s\u0010qR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010qR\u0016\u0010u\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010iR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR(\u0010y\u001a\u0004\u0018\u00010d2\u0008\u0010y\u001a\u0004\u0018\u00010d8F@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/facebook/react/animated/NativeAnimatedModule;",
        "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;",
        "Lcom/facebook/react/bridge/LifecycleEventListener;",
        "Lcom/facebook/react/bridge/UIManagerListener;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "Lcom/facebook/react/animated/NativeAnimatedModule$d;",
        "operation",
        "LTd/L;",
        "addOperation",
        "(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V",
        "addUnbatchedOperation",
        "addPreOperation",
        "clearFrameCallback",
        "()V",
        "enqueueFrameCallback",
        "",
        "viewTag",
        "initializeLifecycleEventListenersForViewTag",
        "(I)V",
        "decrementInFlightAnimationsForViewTag",
        "userDrivenScrollEnded",
        "initialize",
        "onHostResume",
        "Lcom/facebook/react/bridge/UIManager;",
        "uiManager",
        "didScheduleMountItems",
        "(Lcom/facebook/react/bridge/UIManager;)V",
        "willMountItems",
        "didMountItems",
        "didDispatchMountItems",
        "willDispatchViewUpdates",
        "onHostPause",
        "onHostDestroy",
        "startOperationBatch",
        "finishOperationBatch",
        "",
        "tagDouble",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "config",
        "createAnimatedNode",
        "(DLcom/facebook/react/bridge/ReadableMap;)V",
        "updateAnimatedNodeConfig",
        "startListeningToAnimatedNodeValue",
        "(D)V",
        "stopListeningToAnimatedNodeValue",
        "dropAnimatedNode",
        "value",
        "setAnimatedNodeValue",
        "(DD)V",
        "setAnimatedNodeOffset",
        "flattenAnimatedNodeOffset",
        "extractAnimatedNodeOffset",
        "animationIdDouble",
        "animatedNodeTagDouble",
        "animationConfig",
        "Lcom/facebook/react/bridge/Callback;",
        "endCallback",
        "startAnimatingNode",
        "(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V",
        "stopAnimation",
        "parentNodeTagDouble",
        "childNodeTagDouble",
        "connectAnimatedNodes",
        "disconnectAnimatedNodes",
        "viewTagDouble",
        "connectAnimatedNodeToView",
        "disconnectAnimatedNodeFromView",
        "restoreDefaultValues",
        "",
        "eventName",
        "eventMapping",
        "addAnimatedEventToView",
        "(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V",
        "animatedValueTagDouble",
        "removeAnimatedEventFromView",
        "(DLjava/lang/String;D)V",
        "addListener",
        "(Ljava/lang/String;)V",
        "count",
        "removeListeners",
        "animatedValueNodeTagDouble",
        "callback",
        "getValue",
        "(DLcom/facebook/react/bridge/Callback;)V",
        "invalidate",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "opsAndArgs",
        "queueAndExecuteBatchedOperations",
        "(Lcom/facebook/react/bridge/ReadableArray;)V",
        "Lcom/facebook/react/modules/core/b;",
        "reactChoreographer",
        "Lcom/facebook/react/modules/core/b;",
        "Lcom/facebook/react/animated/NativeAnimatedModule$c;",
        "operations",
        "Lcom/facebook/react/animated/NativeAnimatedModule$c;",
        "preOperations",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "LT6/t;",
        "nodesManagerRef",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "",
        "batchingControlledByJS",
        "Z",
        "",
        "currentFrameNumber",
        "J",
        "currentBatchNumber",
        "initializedForFabric",
        "initializedForNonFabric",
        "uiManagerType",
        "I",
        "getUiManagerType$annotations",
        "numFabricAnimations",
        "numNonFabricAnimations",
        "enqueuedAnimationOnFrame",
        "com/facebook/react/animated/NativeAnimatedModule$g",
        "animatedFrameCallback",
        "Lcom/facebook/react/animated/NativeAnimatedModule$g;",
        "nodesManager",
        "getNodesManager",
        "()LT6/t;",
        "setNodesManager",
        "(LT6/t;)V",
        "Companion",
        "a",
        "d",
        "c",
        "b",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ANIMATED_MODULE_DEBUG:Z = false

.field public static final Companion:Lcom/facebook/react/animated/NativeAnimatedModule$b;

.field public static final NAME:Ljava/lang/String; = "NativeAnimatedModule"


# instance fields
.field private final animatedFrameCallback:Lcom/facebook/react/animated/NativeAnimatedModule$g;

.field private batchingControlledByJS:Z

.field private volatile currentBatchNumber:J

.field private volatile currentFrameNumber:J

.field private enqueuedAnimationOnFrame:Z

.field private initializedForFabric:Z

.field private initializedForNonFabric:Z

.field private final nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LT6/t;",
            ">;"
        }
    .end annotation
.end field

.field private numFabricAnimations:I

.field private numNonFabricAnimations:I

.field private final operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

.field private final preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

.field private final reactChoreographer:Lcom/facebook/react/modules/core/b;

.field private uiManagerType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule;->Companion:Lcom/facebook/react/animated/NativeAnimatedModule$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/facebook/react/modules/core/b;->f:Lcom/facebook/react/modules/core/b$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/b$b;->a()Lcom/facebook/react/modules/core/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->reactChoreographer:Lcom/facebook/react/modules/core/b;

    .line 16
    .line 17
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 23
    .line 24
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 40
    .line 41
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$g;

    .line 42
    .line 43
    invoke-direct {v0, p1, p0}, Lcom/facebook/react/animated/NativeAnimatedModule$g;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->animatedFrameCallback:Lcom/facebook/react/animated/NativeAnimatedModule$g;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->willDispatchViewUpdates$lambda$4(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$decrementInFlightAnimationsForViewTag(Lcom/facebook/react/animated/NativeAnimatedModule;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$enqueueFrameCallback(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueueFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getReactApplicationContextIfActiveOrWarn(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setEnqueuedAnimationOnFrame$p(Lcom/facebook/react/animated/NativeAnimatedModule;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueuedAnimationOnFrame:Z

    .line 2
    .line 3
    return-void
.end method

.method private final addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->c(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final addPreOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->c(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->c(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/facebook/react/animated/NativeAnimatedModule;->startListeningToAnimatedNodeValue$lambda$6(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->willDispatchViewUpdates$lambda$3(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final clearFrameCallback()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->reactChoreographer:Lcom/facebook/react/modules/core/b;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/modules/core/b$a;->d:Lcom/facebook/react/modules/core/b$a;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->animatedFrameCallback:Lcom/facebook/react/animated/NativeAnimatedModule$g;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/b;->n(Lcom/facebook/react/modules/core/b$a;Landroid/view/Choreographer$FrameCallback;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueuedAnimationOnFrame:Z

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic d(Ljava/util/Set;Lcom/facebook/react/bridge/ReadableArrayBuilder;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->userDrivenScrollEnded$lambda$2$lambda$1(Ljava/util/Set;Lcom/facebook/react/bridge/ReadableArrayBuilder;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final decrementInFlightAnimationsForViewTag(I)V
    .locals 2

    .line 1
    invoke-static {p1}, LC7/a;->a(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x2

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numNonFabricAnimations:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numNonFabricAnimations:I

    .line 20
    .line 21
    :goto_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numNonFabricAnimations:I

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 26
    .line 27
    if-lez v1, :cond_1

    .line 28
    .line 29
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 30
    .line 31
    if-eq v1, v0, :cond_1

    .line 32
    .line 33
    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    if-lez p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    if-eq p1, v0, :cond_2

    .line 46
    .line 47
    iput v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method private final enqueueFrameCallback()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueuedAnimationOnFrame:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->reactChoreographer:Lcom/facebook/react/modules/core/b;

    .line 6
    .line 7
    sget-object v1, Lcom/facebook/react/modules/core/b$a;->d:Lcom/facebook/react/modules/core/b$a;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->animatedFrameCallback:Lcom/facebook/react/animated/NativeAnimatedModule$g;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/b;->k(Lcom/facebook/react/modules/core/b$a;Landroid/view/Choreographer$FrameCallback;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueuedAnimationOnFrame:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static synthetic getUiManagerType$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final initializeLifecycleEventListenersForViewTag(I)V
    .locals 3

    .line 1
    invoke-static {p1}, LC7/a;->a(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numFabricAnimations:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numNonFabricAnimations:I

    .line 18
    .line 19
    add-int/2addr p1, v0

    .line 20
    iput p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->numNonFabricAnimations:I

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 29
    .line 30
    invoke-virtual {p1, v2}, LT6/t;->p(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v2, "initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"

    .line 37
    .line 38
    invoke-direct {p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v2, "NativeAnimatedModule"

    .line 42
    .line 43
    invoke-static {v2, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 47
    .line 48
    if-ne p1, v1, :cond_2

    .line 49
    .line 50
    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->initializedForFabric:Z

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->initializedForNonFabric:Z

    .line 54
    .line 55
    :goto_2
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 65
    .line 66
    invoke-static {p1, v2}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    invoke-interface {p1, p0}, Lcom/facebook/react/bridge/UIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 73
    .line 74
    .line 75
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 76
    .line 77
    if-ne p1, v1, :cond_4

    .line 78
    .line 79
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->initializedForFabric:Z

    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->initializedForNonFabric:Z

    .line 83
    .line 84
    :cond_5
    :goto_3
    return-void
.end method

.method private static final startListeningToAnimatedNodeValue$lambda$6(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "tag"

    .line 11
    .line 12
    invoke-virtual {v1, v2, p1}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    const-string p1, "value"

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2, p3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 18
    .line 19
    .line 20
    const-string p1, "offset"

    .line 21
    .line 22
    invoke-virtual {v1, p1, p4, p5}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const-string p1, "onAnimatedValueUpdate"

    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method private static final userDrivenScrollEnded$lambda$2$lambda$1(Ljava/util/Set;Lcom/facebook/react/bridge/ReadableArrayBuilder;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "$this$putArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p0
.end method

.method private static final willDispatchViewUpdates$lambda$3(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p3, p1, p2, p0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->c(JLT6/t;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final willDispatchViewUpdates$lambda$4(Lcom/facebook/react/animated/NativeAnimatedModule;JLcom/facebook/react/uimanager/y;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p3, p1, p2, p0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->c(JLT6/t;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public addAnimatedEventToView(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventMapping"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    double-to-int p1, p1

    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$f;

    .line 16
    .line 17
    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$f;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public connectAnimatedNodeToView(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    double-to-int p2, p3

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    .line 4
    .line 5
    .line 6
    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$h;

    .line 7
    .line 8
    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$h;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public connectAnimatedNodes(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    double-to-int p2, p3

    .line 3
    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$i;

    .line 4
    .line 5
    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$i;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public createAnimatedNode(DLcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    double-to-int p1, p1

    .line 7
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$j;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$j;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 6

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 13
    .line 14
    const-wide/16 v2, 0x1

    .line 15
    .line 16
    sub-long/2addr v0, v2

    .line 17
    iget-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->batchingControlledByJS:Z

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 22
    .line 23
    add-long/2addr v4, v2

    .line 24
    iput-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 25
    .line 26
    iget-wide v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 27
    .line 28
    iget-wide v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 29
    .line 30
    sub-long/2addr v2, v4

    .line 31
    const-wide/16 v4, 0x2

    .line 32
    .line 33
    cmp-long p1, v2, v4

    .line 34
    .line 35
    if-lez p1, :cond_1

    .line 36
    .line 37
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 40
    .line 41
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->c(JLT6/t;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()LT6/t;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->c(JLT6/t;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 4

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    add-long/2addr v0, v2

    .line 11
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentFrameNumber:J

    .line 12
    .line 13
    return-void
.end method

.method public disconnectAnimatedNodeFromView(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    double-to-int p2, p3

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    .line 4
    .line 5
    .line 6
    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$k;

    .line 7
    .line 8
    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$k;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public disconnectAnimatedNodes(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    double-to-int p2, p3

    .line 3
    new-instance p3, Lcom/facebook/react/animated/NativeAnimatedModule$l;

    .line 4
    .line 5
    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$l;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p3}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public dropAnimatedNode(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$m;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$m;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public extractAnimatedNodeOffset(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$n;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$n;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public finishOperationBatch()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->batchingControlledByJS:Z

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    add-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 10
    .line 11
    return-void
.end method

.method public flattenAnimatedNodeOffset(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$o;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$o;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final getNodesManager()LT6/t;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    new-instance v2, LT6/t;

    .line 18
    .line 19
    invoke-direct {v2, v0}, LT6/t;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v1, v0, v2}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LT6/t;

    .line 33
    .line 34
    return-object v0
.end method

.method public getValue(DLcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    double-to-int p1, p1

    .line 7
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$p;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$p;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/Callback;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public initialize()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->initialize()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public invalidate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->clearFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->clearFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostResume()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->enqueueFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public queueAndExecuteBatchedOperations(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 5

    .line 1
    const-string v0, "opsAndArgs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    sget-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$a;->a:Lcom/facebook/react/animated/NativeAnimatedModule$a$a;

    .line 14
    .line 15
    add-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v2, v4}, Lcom/facebook/react/animated/NativeAnimatedModule$a$a;->a(I)Lcom/facebook/react/animated/NativeAnimatedModule$a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v4, Lcom/facebook/react/animated/NativeAnimatedModule$e;->a:[I

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    aget v2, v4, v2

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    new-instance p1, LTd/r;

    .line 37
    .line 38
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :pswitch_0
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-direct {p0, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    .line 47
    .line 48
    .line 49
    :pswitch_1
    add-int/lit8 v1, v1, 0x4

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    add-int/lit8 v2, v1, 0x2

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x3

    .line 55
    .line 56
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-direct {p0, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->initializeLifecycleEventListenersForViewTag(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_3
    add-int/lit8 v1, v1, 0x3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_4
    add-int/lit8 v1, v1, 0x2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->startOperationBatch()V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lcom/facebook/react/animated/NativeAnimatedModule$q;

    .line 74
    .line 75
    invoke-direct {v1, p0, v0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$q;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableArray;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->finishOperationBatch()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public removeAnimatedEventFromView(DLjava/lang/String;D)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    double-to-int p1, p1

    .line 7
    double-to-int p2, p4

    .line 8
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->decrementInFlightAnimationsForViewTag(I)V

    .line 9
    .line 10
    .line 11
    new-instance p4, Lcom/facebook/react/animated/NativeAnimatedModule$r;

    .line 12
    .line 13
    invoke-direct {p4, p0, p1, p3, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$r;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILjava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p4}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public restoreDefaultValues(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$s;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$s;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addPreOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setAnimatedNodeOffset(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$t;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$t;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ID)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setAnimatedNodeValue(DD)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$u;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1, p3, p4}, Lcom/facebook/react/animated/NativeAnimatedModule$u;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ID)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setNodesManager(LT6/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startAnimatingNode(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    const-string v0, "animationConfig"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "endCallback"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    double-to-int p1, p1

    .line 12
    double-to-int p4, p3

    .line 13
    move p3, p1

    .line 14
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule$v;

    .line 15
    .line 16
    move-object p2, p0

    .line 17
    invoke-direct/range {p1 .. p6}, Lcom/facebook/react/animated/NativeAnimatedModule$v;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->addUnbatchedOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public startListeningToAnimatedNodeValue(D)V
    .locals 1

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, LT6/n;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, LT6/n;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$w;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$w;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILT6/c;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public startOperationBatch()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->batchingControlledByJS:Z

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    add-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 10
    .line 11
    return-void
.end method

.method public stopAnimation(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$x;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$x;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public stopListeningToAnimatedNodeValue(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$y;

    .line 3
    .line 4
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$y;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public updateAnimatedNodeConfig(DLcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    double-to-int p1, p1

    .line 7
    new-instance p2, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;->addOperation(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final userDrivenScrollEnded(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->nodesManagerRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT6/t;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "topScrollEnded"

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, LT6/t;->l(ILjava/lang/String;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, LT6/o;

    .line 35
    .line 36
    invoke-direct {v2, p1}, LT6/o;-><init>(Ljava/util/Set;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "tags"

    .line 40
    .line 41
    invoke-virtual {v1, p1, v2}, Lcom/facebook/react/bridge/ReadableMapBuilder;->putArray(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    const-string v1, "onUserDrivenAnimationEnded"

    .line 51
    .line 52
    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 4

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->operations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->preOperations:Lcom/facebook/react/animated/NativeAnimatedModule$c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->uiManagerType:I

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    sget-boolean v0, LY6/a;->f:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 34
    .line 35
    const-wide/16 v2, 0x1

    .line 36
    .line 37
    add-long/2addr v2, v0

    .line 38
    iput-wide v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule;->currentBatchNumber:J

    .line 39
    .line 40
    new-instance v2, LT6/p;

    .line 41
    .line 42
    invoke-direct {v2, p0, v0, v1}, LT6/p;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V

    .line 43
    .line 44
    .line 45
    new-instance v3, LT6/q;

    .line 46
    .line 47
    invoke-direct {v3, p0, v0, v1}, LT6/q;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Lcom/facebook/react/uimanager/UIManagerModule;->prependUIBlock(Lcom/facebook/react/uimanager/d0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v3}, Lcom/facebook/react/uimanager/UIManagerModule;->addUIBlock(Lcom/facebook/react/uimanager/d0;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
