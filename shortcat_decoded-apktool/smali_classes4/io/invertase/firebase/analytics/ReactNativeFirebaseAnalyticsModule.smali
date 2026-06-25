.class public Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;
.super Lio/invertase/firebase/common/ReactNativeFirebaseModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final LONG_NUMERIC_PARAM_KEYS:[Ljava/lang/String;

.field private static final SERVICE_NAME:Ljava/lang/String; = "Analytics"


# instance fields
.field private final module:Lio/invertase/firebase/analytics/v;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "number_of_rooms"

    .line 2
    .line 3
    const-string v6, "score"

    .line 4
    .line 5
    const-string v0, "quantity"

    .line 6
    .line 7
    const-string v1, "index"

    .line 8
    .line 9
    const-string v2, "level"

    .line 10
    .line 11
    const-string v3, "number_of_nights"

    .line 12
    .line 13
    const-string v4, "number_of_passengers"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->LONG_NUMERIC_PARAM_KEYS:[Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    const-string v0, "Analytics"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lio/invertase/firebase/analytics/v;

    .line 7
    .line 8
    invoke-direct {v1, p1, v0}, Lio/invertase/firebase/analytics/v;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private static coerceLongNumericParams(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    sget-object v0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->LONG_NUMERIC_PARAM_KEYS:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    double-to-long v4, v4

    .line 20
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method private static coerceSuccessParamToLong(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const-string v0, "success"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    const-wide/16 v3, 0x1

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-wide v3, v5

    .line 35
    :cond_2
    :goto_0
    move-wide v5, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    instance-of v2, v1, Ljava/lang/Number;

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    cmp-long v1, v1, v5

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    instance-of v2, v1, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "1"

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    const-string v2, "true"

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    const-string v2, "yes"

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    :goto_1
    invoke-virtual {p0, v0, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->doubleValue()D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic h(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic k(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const-string v0, "items"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    new-array v1, v3, [Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    instance-of v5, v4, Landroid/os/Bundle;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    check-cast v4, Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-static {v4}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->coerceLongNumericParams(Landroid/os/Bundle;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    new-array v1, v3, [Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, [Landroid/os/Parcelable;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_1
    invoke-static {p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->coerceLongNumericParams(Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->coerceSuccessParamToLong(Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    const-string v0, "extend_session"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 90
    .line 91
    .line 92
    move-result-wide v1

    .line 93
    double-to-long v1, v1

    .line 94
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 95
    .line 96
    .line 97
    :cond_5
    return-object p1
.end method


# virtual methods
.method public getAppInstanceId(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->l()Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/invertase/firebase/analytics/a;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/a;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public getSessionId(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->m()Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/invertase/firebase/analytics/f;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/f;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public logEvent(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->w(Ljava/lang/String;Landroid/os/Bundle;)Ln9/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, Lio/invertase/firebase/analytics/e;

    .line 12
    .line 13
    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/e;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public resetAnalyticsData(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/invertase/firebase/analytics/v;->x()Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/invertase/firebase/analytics/g;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lio/invertase/firebase/analytics/g;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setAnalyticsCollectionEnabled(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->y(Ljava/lang/Boolean;)Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lio/invertase/firebase/analytics/d;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/d;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setConsent(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->z(Landroid/os/Bundle;)Ln9/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lio/invertase/firebase/analytics/c;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/c;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setDefaultEventParameters(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->A(Landroid/os/Bundle;)Ln9/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lio/invertase/firebase/analytics/h;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/h;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setSessionTimeoutDuration(DLcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    double-to-long p1, p1

    .line 4
    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->B(J)Ln9/i;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Lio/invertase/firebase/analytics/j;

    .line 9
    .line 10
    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/j;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setUserId(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->C(Ljava/lang/String;)Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lio/invertase/firebase/analytics/k;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/k;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setUserProperties(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lio/invertase/firebase/analytics/v;->D(Landroid/os/Bundle;)Ln9/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lio/invertase/firebase/analytics/i;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lio/invertase/firebase/analytics/i;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->module:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/invertase/firebase/analytics/v;->E(Ljava/lang/String;Ljava/lang/String;)Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Lio/invertase/firebase/analytics/b;

    .line 8
    .line 9
    invoke-direct {p2, p3}, Lio/invertase/firebase/analytics/b;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method
