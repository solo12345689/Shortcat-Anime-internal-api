.class public abstract Ldc/e;
.super Ldc/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lpc/b;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "desiredArgsTypes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Ldc/g;-><init>(Ljava/lang/String;[Lpc/b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic o(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/e;Ljava/lang/String;[Ljava/lang/Object;LUb/d;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ldc/e;->r(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/e;Ljava/lang/String;[Ljava/lang/Object;LUb/d;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Ldc/e;->q(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final q(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V
    .locals 6

    .line 1
    const-string p0, "args"

    .line 2
    .line 3
    invoke-static {p4, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "promiseImpl"

    .line 7
    .line 8
    invoke-static {p5, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ldc/d;

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v5, p3

    .line 16
    move-object v4, p4

    .line 17
    move-object v1, p5

    .line 18
    invoke-direct/range {v0 .. v5}, Ldc/d;-><init>(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/e;Ljava/lang/String;[Ljava/lang/Object;LUb/d;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v5, v0}, Ldc/e;->t(LUb/d;Lie/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final r(Lexpo/modules/kotlin/jni/PromiseImpl;Ldc/e;Ljava/lang/String;[Ljava/lang/Object;LUb/d;)LTd/L;
    .locals 3

    .line 1
    const-string v0, "getCode(...)"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1, p3, p0, p4}, Ldc/e;->s([Ljava/lang/Object;LUb/u;LUb/d;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :catchall_0
    move-exception p3

    .line 11
    :try_start_1
    instance-of p4, p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 12
    .line 13
    if-nez p4, :cond_1

    .line 14
    .line 15
    instance-of p4, p3, Lrb/a;

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    new-instance p4, Lexpo/modules/kotlin/exception/CodedException;

    .line 20
    .line 21
    move-object v1, p3

    .line 22
    check-cast v1, Lrb/a;

    .line 23
    .line 24
    invoke-virtual {v1}, Lrb/a;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v2, p3

    .line 32
    check-cast v2, Lrb/a;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast p3, Lrb/a;

    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-direct {p4, v1, v2, p3}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance p4, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 51
    .line 52
    invoke-direct {p4, p3}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object p4, p3

    .line 57
    check-cast p4, Lexpo/modules/kotlin/exception/CodedException;

    .line 58
    .line 59
    :goto_0
    new-instance p3, Lcc/m;

    .line 60
    .line 61
    invoke-virtual {p1}, Ldc/a;->g()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {p3, p1, p2, p4}, Lcc/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 66
    .line 67
    .line 68
    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    :goto_1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/PromiseImpl;->j()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_4

    .line 74
    .line 75
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    instance-of p2, p1, Lrb/a;

    .line 83
    .line 84
    if-eqz p2, :cond_3

    .line 85
    .line 86
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 87
    .line 88
    check-cast p1, Lrb/a;

    .line 89
    .line 90
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p2, p3, p4, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    move-object p1, p2

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 111
    .line 112
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :goto_3
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/jni/PromiseImpl;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 117
    .line 118
    .line 119
    :goto_4
    sget-object p0, LTd/L;->a:LTd/L;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_4
    throw p1
.end method

.method private final t(LUb/d;Lie/a;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldc/g;->m()Ldc/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldc/m;->b:Ldc/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, LUb/d;->y()LGf/O;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v6, Ldc/e$a;

    .line 15
    .line 16
    invoke-direct {v6, p2, v2}, Ldc/e$a;-><init>(Lie/a;LZd/e;)V

    .line 17
    .line 18
    .line 19
    const/4 v7, 0x3

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v1, Ldc/m;->a:Ldc/m;

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v6, Ldc/e$b;

    .line 36
    .line 37
    invoke-direct {v6, p2, v2}, Ldc/e$b;-><init>(Lie/a;LZd/e;)V

    .line 38
    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    new-instance p1, LTd/r;

    .line 49
    .line 50
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1
.end method


# virtual methods
.method public a(LUb/d;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jsObject"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "moduleName"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Ldc/a;->g()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Ldc/a;->i()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0}, Ldc/a;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p0}, Ldc/a;->f()[Lpc/b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v5, Ljava/util/ArrayList;

    .line 37
    .line 38
    array-length v6, v1

    .line 39
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    array-length v6, v1

    .line 43
    const/4 v7, 0x0

    .line 44
    move v8, v7

    .line 45
    :goto_0
    if-ge v8, v6, :cond_0

    .line 46
    .line 47
    aget-object v9, v1, v8

    .line 48
    .line 49
    invoke-virtual {v9}, Lpc/b;->f()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v8, v8, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-array v1, v7, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 60
    .line 61
    invoke-interface {v5, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move-object v5, v1

    .line 66
    check-cast v5, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 67
    .line 68
    new-instance v6, Ldc/c;

    .line 69
    .line 70
    invoke-direct {v6, v0, p3, p0, p1}, Ldc/c;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;)V

    .line 71
    .line 72
    .line 73
    move-object v1, p2

    .line 74
    invoke-virtual/range {v1 .. v6}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->registerAsyncFunction(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public abstract s([Ljava/lang/Object;LUb/u;LUb/d;)V
.end method
