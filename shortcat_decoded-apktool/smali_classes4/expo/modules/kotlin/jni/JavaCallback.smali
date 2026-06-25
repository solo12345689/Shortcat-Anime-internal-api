.class public final Lexpo/modules/kotlin/jni/JavaCallback;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/Destructible;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0016\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0013\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0008H\u0086\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0014H\u0086\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0017H\u0086\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u001aH\u0086\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u00082\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0086\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ&\u0010!\u001a\u00020\u00082\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060 H\u0086\u0002\u00a2\u0006\u0004\u0008!\u0010\"J \u0010%\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0086\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0008H\u0004\u00a2\u0006\u0004\u0008\'\u0010\u000cJ\u000f\u0010(\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0008H\u0082 \u00a2\u0006\u0004\u0008*\u0010\u000cJ\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0082 \u00a2\u0006\u0004\u0008*\u0010\u0010J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0011H\u0082 \u00a2\u0006\u0004\u0008*\u0010\u0013J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0014H\u0082 \u00a2\u0006\u0004\u0008*\u0010\u0016J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0017H\u0082 \u00a2\u0006\u0004\u0008*\u0010\u0019J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u001aH\u0082 \u00a2\u0006\u0004\u0008*\u0010\u001cJ \u0010*\u001a\u00020\u00082\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0082 \u00a2\u0006\u0004\u0008*\u0010\u001fJ&\u0010*\u001a\u00020\u00082\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060 H\u0082 \u00a2\u0006\u0004\u0008*\u0010\"J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020+H\u0082 \u00a2\u0006\u0004\u0008*\u0010,J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020-H\u0082 \u00a2\u0006\u0004\u0008*\u0010.J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020/H\u0082 \u00a2\u0006\u0004\u0008*\u00100J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u000201H\u0082 \u00a2\u0006\u0004\u0008*\u00102J\u0018\u0010*\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u000203H\u0082 \u00a2\u0006\u0004\u0008*\u00104J \u0010*\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0082 \u00a2\u0006\u0004\u0008*\u0010&J\u0018\u00106\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u000205H\u0082 \u00a2\u0006\u0004\u00086\u00107J\u0018\u00109\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u000208H\u0082 \u00a2\u0006\u0004\u00089\u0010:J\u0018\u0010<\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020;H\u0082 \u00a2\u0006\u0004\u0008<\u0010=J\u0018\u0010?\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020>H\u0082 \u00a2\u0006\u0004\u0008?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010A\u00a8\u0006B"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/JavaCallback;",
        "Lexpo/modules/kotlin/jni/Destructible;",
        "Lcom/facebook/jni/HybridData;",
        "mHybridData",
        "<init>",
        "(Lcom/facebook/jni/HybridData;)V",
        "",
        "value",
        "LTd/L;",
        "f",
        "(Ljava/lang/Object;)V",
        "b",
        "()V",
        "",
        "result",
        "e",
        "(I)V",
        "",
        "k",
        "(Z)V",
        "",
        "c",
        "(D)V",
        "",
        "d",
        "(F)V",
        "",
        "g",
        "(Ljava/lang/String;)V",
        "",
        "i",
        "(Ljava/util/Collection;)V",
        "",
        "j",
        "(Ljava/util/Map;)V",
        "code",
        "errorMessage",
        "h",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "finalize",
        "a",
        "()Lcom/facebook/jni/HybridData;",
        "invokeNative",
        "Lcom/facebook/react/bridge/WritableNativeArray;",
        "(Lcom/facebook/react/bridge/WritableNativeArray;)V",
        "Lcom/facebook/react/bridge/WritableNativeMap;",
        "(Lcom/facebook/react/bridge/WritableNativeMap;)V",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V",
        "Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;",
        "(Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;)V",
        "Lexpo/modules/kotlin/jni/NativeArrayBuffer;",
        "(Lexpo/modules/kotlin/jni/NativeArrayBuffer;)V",
        "",
        "invokeIntArray",
        "([I)V",
        "",
        "invokeLongArray",
        "([J)V",
        "",
        "invokeFloatArray",
        "([F)V",
        "",
        "invokeDoubleArray",
        "([D)V",
        "Lcom/facebook/jni/HybridData;",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method public constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 1

    .line 1
    const-string v0, "mHybridData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 10
    .line 11
    return-void
.end method

.method private final native invokeDoubleArray([D)V
.end method

.method private final native invokeFloatArray([F)V
.end method

.method private final native invokeIntArray([I)V
.end method

.method private final native invokeLongArray([J)V
.end method

.method private final native invokeNative()V
.end method

.method private final native invokeNative(D)V
.end method

.method private final native invokeNative(F)V
.end method

.method private final native invokeNative(I)V
.end method

.method private final native invokeNative(Lcom/facebook/react/bridge/WritableNativeArray;)V
.end method

.method private final native invokeNative(Lcom/facebook/react/bridge/WritableNativeMap;)V
.end method

.method private final native invokeNative(Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;)V
.end method

.method private final native invokeNative(Lexpo/modules/kotlin/jni/NativeArrayBuffer;)V
.end method

.method private final native invokeNative(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V
.end method

.method private final native invokeNative(Ljava/lang/String;)V
.end method

.method private final native invokeNative(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private final native invokeNative(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method private final native invokeNative(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method private final native invokeNative(Z)V
.end method


# virtual methods
.method public a()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "Invalidated JavaCallback was invoked"

    .line 19
    .line 20
    invoke-virtual {v1, v2, v0}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    throw v0
.end method

.method public final c(D)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(D)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    iget-object p2, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "Invalidated JavaCallback was invoked"

    .line 19
    .line 20
    invoke-virtual {p2, v0, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    throw p1
.end method

.method public final d(F)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    throw p1
.end method

.method public final e(I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    throw p1
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lpc/K;->a:Lpc/K;

    .line 2
    .line 3
    const/4 v4, 0x2

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    move-object v1, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lpc/K;->b(Lpc/K;Ljava/lang/Object;Lpc/K$a;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p1, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    invoke-direct {p0, v0, v1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(D)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(F)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    instance-of v0, p1, Ljava/util/Collection;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    check-cast p1, Ljava/util/Collection;

    .line 93
    .line 94
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_6
    instance-of v0, p1, Ljava/util/Map;

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    check-cast p1, Ljava/util/Map;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    instance-of v0, p1, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    check-cast p1, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 113
    .line 114
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Lcom/facebook/react/bridge/WritableNativeArray;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    instance-of v0, p1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 119
    .line 120
    if-eqz v0, :cond_9

    .line 121
    .line 122
    check-cast p1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 123
    .line 124
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Lcom/facebook/react/bridge/WritableNativeMap;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_9
    instance-of v0, p1, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 129
    .line 130
    if-eqz v0, :cond_a

    .line 131
    .line 132
    check-cast p1, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 133
    .line 134
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_a
    instance-of v0, p1, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;

    .line 139
    .line 140
    if-eqz v0, :cond_b

    .line 141
    .line 142
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;

    .line 143
    .line 144
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_b
    instance-of v0, p1, Lexpo/modules/kotlin/jni/NativeArrayBuffer;

    .line 149
    .line 150
    if-eqz v0, :cond_c

    .line 151
    .line 152
    check-cast p1, Lexpo/modules/kotlin/jni/NativeArrayBuffer;

    .line 153
    .line 154
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Lexpo/modules/kotlin/jni/NativeArrayBuffer;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_c
    instance-of v0, p1, [I

    .line 159
    .line 160
    if-eqz v0, :cond_d

    .line 161
    .line 162
    check-cast p1, [I

    .line 163
    .line 164
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeIntArray([I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_d
    instance-of v0, p1, [J

    .line 169
    .line 170
    if-eqz v0, :cond_e

    .line 171
    .line 172
    check-cast p1, [J

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeLongArray([J)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_e
    instance-of v0, p1, [F

    .line 179
    .line 180
    if-eqz v0, :cond_f

    .line 181
    .line 182
    check-cast p1, [F

    .line 183
    .line 184
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeFloatArray([F)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_f
    instance-of v0, p1, [D

    .line 189
    .line 190
    if-eqz v0, :cond_10

    .line 191
    .line 192
    check-cast p1, [D

    .line 193
    .line 194
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeDoubleArray([D)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_10
    new-instance v0, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string v2, "Unknown type: "

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :goto_0
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_11

    .line 232
    .line 233
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 238
    .line 239
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_11
    throw p1
.end method

.method protected final finalize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    throw p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "errorMessage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    iget-object p2, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "Invalidated JavaCallback was invoked"

    .line 29
    .line 30
    invoke-virtual {p2, v0, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    throw p1
.end method

.method public final i(Ljava/util/Collection;)V
    .locals 2

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lpc/J;->s(Ljava/util/Collection;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    throw p1
.end method

.method public final j(Ljava/util/Map;)V
    .locals 2

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lpc/J;->u(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    throw p1
.end method

.method public final k(Z)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invokeNative(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaCallback;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Invalidated JavaCallback was invoked"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    throw p1
.end method
