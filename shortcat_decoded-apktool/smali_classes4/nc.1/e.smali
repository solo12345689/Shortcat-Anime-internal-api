.class public final Lnc/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private b:I

.field private c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Llc/b;)V
    .locals 1

    .line 1
    const-string v0, "runtime"

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
    invoke-static {p1}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lnc/e;->a:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p1}, Lnc/c;->b(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lnc/e;->b:I

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lnc/e;->c:Ljava/util/Map;

    .line 28
    .line 29
    return-void
.end method

.method private final c(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnc/e;->c:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lnc/e;->b:I

    .line 16
    .line 17
    if-lt p1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lcc/y;

    .line 21
    .line 22
    invoke-direct {p1}, Lcc/y;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    return p1
.end method

.method private final d()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lnc/e;->b:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    invoke-static {v1}, Lnc/c;->b(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, p0, Lnc/e;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    monitor-exit p0

    .line 16
    throw v0
.end method


# virtual methods
.method public final a(Lexpo/modules/kotlin/sharedobjects/SharedObject;Lexpo/modules/kotlin/jni/JavaScriptObject;)I
    .locals 13

    .line 1
    const-string v0, "native"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "js"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lnc/e;->d()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p1, v3}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->E(I)V

    .line 16
    .line 17
    .line 18
    const-string v2, "__expo_shared_object_id__"

    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p2

    .line 24
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/jni/JavaScriptObject;->h(Lexpo/modules/kotlin/jni/JavaScriptObject;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lnc/e;->a:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Llc/b;

    .line 34
    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-virtual {p2}, Llc/b;->d()Lexpo/modules/kotlin/jni/JSIContext;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v3, v1}, Lexpo/modules/kotlin/jni/JSIContext;->setNativeStateForSharedObject(ILexpo/modules/kotlin/jni/JavaScriptObject;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->k()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-lez v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/jni/JavaScriptObject;->setExternalMemoryPressure(I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    instance-of v0, p1, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const-string v8, "nativeRefType"

    .line 58
    .line 59
    move-object v0, p1

    .line 60
    check-cast v0, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 61
    .line 62
    invoke-virtual {v0}, Lexpo/modules/kotlin/sharedobjects/SharedRef;->J()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    const/4 v11, 0x4

    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v7, v1

    .line 70
    invoke-static/range {v7 .. v12}, Lexpo/modules/kotlin/jni/JavaScriptObject;->i(Lexpo/modules/kotlin/jni/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {v1}, Lexpo/modules/kotlin/jni/JavaScriptObject;->createWeak()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    monitor-enter p0

    .line 78
    :try_start_0
    invoke-static {v3}, Lnc/c;->a(I)Lnc/c;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v2, p0, Lnc/e;->c:Ljava/util/Map;

    .line 83
    .line 84
    invoke-static {p1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    monitor-exit p0

    .line 94
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->q()Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    invoke-static {p2}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->D(Ljava/lang/ref/WeakReference;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return v3

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    move-object p1, v0

    .line 114
    monitor-exit p0

    .line 115
    throw p1

    .line 116
    :cond_3
    new-instance p1, Lcc/e;

    .line 117
    .line 118
    invoke-direct {p1}, Lcc/e;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final b(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lnc/e;->c:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lkotlin/Pair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {v0}, Lnc/c;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->E(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->H()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1
.end method

.method public final e(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptObject;
    .locals 1

    .line 1
    const-string v0, "native"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lnc/e;->c:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->w()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lkotlin/Pair;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptWeakObject;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptWeakObject;->lock()Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    :goto_0
    monitor-exit p0

    .line 42
    return-object p1

    .line 43
    :goto_1
    monitor-exit p0

    .line 44
    throw p1
.end method

.method public final f(I)Lexpo/modules/kotlin/sharedobjects/SharedObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lnc/e;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lnc/e;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lkotlin/Pair;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    new-instance p1, Lcc/p;

    .line 31
    .line 32
    invoke-direct {p1}, Lcc/p;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public final g(I)Lexpo/modules/kotlin/sharedobjects/SharedObject;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lnc/e;->c:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lkotlin/Pair;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lexpo/modules/kotlin/sharedobjects/SharedObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    monitor-exit p0

    .line 27
    return-object p1

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw p1
.end method

.method public final h(Lexpo/modules/kotlin/sharedobjects/SharedObject;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;
    .locals 1

    .line 1
    const-string v0, "nativeObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lnc/e;->c:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->w()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lnc/c;->a(I)Lnc/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lkotlin/Pair;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptWeakObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    :goto_0
    monitor-exit p0

    .line 36
    return-object p1

    .line 37
    :goto_1
    monitor-exit p0

    .line 38
    throw p1
.end method
