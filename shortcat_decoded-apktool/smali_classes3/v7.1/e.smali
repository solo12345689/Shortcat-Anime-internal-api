.class public final Lv7/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lv7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv7/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lv7/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv7/e;->a:Lv7/e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b(Ljava/lang/String;Ldg/C;)V
    .locals 9

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "request"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lh7/b;->r()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_7

    .line 16
    .line 17
    sget-object v0, Lv7/e;->a:Lv7/e;

    .line 18
    .line 19
    invoke-virtual {p1}, Ldg/C;->b()Ldg/t;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lv7/e;->a(Ldg/t;)Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    sget-boolean v0, LY6/a;->b:Z

    .line 28
    .line 29
    const-string v1, ""

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    invoke-virtual {p1}, Ldg/C;->a()Ldg/D;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v0, Lv7/h;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast v0, Lv7/h;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v3

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lv7/h;->h()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v1, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ldg/C;->a()Ldg/D;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_3
    if-nez v3, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move-object v1, v3

    .line 71
    :cond_5
    :goto_2
    move-object v6, v1

    .line 72
    invoke-virtual {p1}, Ldg/C;->d()Ldg/u;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ldg/u;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {p1}, Ldg/C;->c()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {p1}, Ldg/C;->a()Ldg/D;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    invoke-virtual {p1}, Ldg/D;->a()J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    :goto_3
    move-object v2, p0

    .line 95
    move-wide v7, v0

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    const-wide/16 v0, 0x0

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :goto_4
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportRequestStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v5}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportConnectionTiming(Ljava/lang/String;Ljava/util/Map;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    return-void
.end method

.method public static final c(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;[B)V
    .locals 1

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rawData"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lh7/b;->r()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-static {p4, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    const-string v0, "encodeToString(...)"

    .line 28
    .line 29
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-static {p2, p4, v0}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->maybeStoreResponseBody(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    :cond_0
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, p3}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, LTd/L;->a:LTd/L;

    .line 49
    .line 50
    const-string p1, "didReceiveNetworkData"

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public static final d(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "responseType"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lh7/b;->r()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, p3

    .line 23
    :goto_0
    const-string v1, "base64"

    .line 24
    .line 25
    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-static {p2, v0, p4}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->maybeStoreResponseBody(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance p4, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 39
    .line 40
    invoke-direct {p4, p2}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4, p3}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, LTd/L;->a:LTd/L;

    .line 50
    .line 51
    const-string p1, "didReceiveNetworkData"

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public static final e(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 13
    .line 14
    .line 15
    long-to-int p1, p2

    .line 16
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 17
    .line 18
    .line 19
    long-to-int p1, p4

    .line 20
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    const-string p1, "didReceiveNetworkDataProgress"

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static final f(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 13
    .line 14
    .line 15
    long-to-int p1, p2

    .line 16
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 17
    .line 18
    .line 19
    long-to-int p1, p4

    .line 20
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    const-string p1, "didSendNetworkData"

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static final g(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;JJ)V
    .locals 1

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh7/b;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-static {p2, p3}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportDataReceived(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->maybeStoreResponseBodyIncremental(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 27
    .line 28
    invoke-direct {v0, p2}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p3}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    long-to-int p1, p4

    .line 38
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 39
    .line 40
    .line 41
    long-to-int p1, p6

    .line 42
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 43
    .line 44
    .line 45
    sget-object p1, LTd/L;->a:LTd/L;

    .line 46
    .line 47
    const-string p1, "didReceiveNetworkIncrementalData"

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public static final h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh7/b;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p2, v0}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportRequestFailed(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p0, :cond_3

    .line 17
    .line 18
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v0, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 23
    .line 24
    invoke-direct {v0, p2}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p3}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p4, :cond_1

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    const-class p3, Ljava/net/SocketTimeoutException;

    .line 42
    .line 43
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(Z)V

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 54
    .line 55
    const-string p1, "didCompleteNetworkResponse"

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    return-void
.end method

.method public static final i(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V
    .locals 1

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh7/b;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {p2, p3, p4}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportResponseEnd(Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance p3, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 22
    .line 23
    invoke-direct {p3, p2}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->add(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Lcom/facebook/react/bridge/ReadableArrayBuilder;->addNull()V

    .line 30
    .line 31
    .line 32
    sget-object p1, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    const-string p1, "didCompleteNetworkResponse"

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public static final j(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;ILjava/util/Map;J)V
    .locals 8

    .line 1
    const-string v0, "devToolsRequestId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headers"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {}, Lh7/b;->r()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    if-nez p3, :cond_1

    .line 59
    .line 60
    const-string v1, ""

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    :goto_1
    move-object v2, p2

    .line 64
    move v4, p4

    .line 65
    move-object v5, p5

    .line 66
    move-wide v6, p6

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    move-object v3, p3

    .line 69
    goto :goto_1

    .line 70
    :goto_2
    invoke-static/range {v2 .. v7}, Lcom/facebook/react/modules/network/InspectorNetworkReporter;->reportResponseStart(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;J)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    move v4, p4

    .line 75
    :goto_3
    if-eqz p0, :cond_3

    .line 76
    .line 77
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p2, p3}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, LTd/L;->a:LTd/L;

    .line 98
    .line 99
    const-string p1, "didReceiveNetworkResponse"

    .line 100
    .line 101
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Ldg/t;)Ljava/util/Map;
    .locals 7

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ldg/t;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ldg/t;->f(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p1, v2}, Ldg/t;->p(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v4, ", "

    .line 45
    .line 46
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {p1, v2}, Ldg/t;->p(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-object v0
.end method
