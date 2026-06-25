.class public final Ldc/r;
.super Ldc/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final g:Lpc/U;

.field private final h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "argTypes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "returnType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "body"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, Ldc/a;-><init>(Ljava/lang/String;[Lpc/b;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Ldc/r;->g:Lpc/U;

    .line 25
    .line 26
    iput-object p4, p0, Ldc/r;->h:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic m(Ldc/r;Ljava/lang/String;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ldc/r;->q(Ldc/r;Ljava/lang/String;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Ldc/r;)Lpc/U;
    .locals 0

    .line 1
    iget-object p0, p0, Ldc/r;->g:Lpc/U;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final q(Ldc/r;Ljava/lang/String;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p3, p2}, Ldc/r;->o([Ljava/lang/Object;LUb/d;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p0}, Ldc/r;->n(Ldc/r;)Lpc/U;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-virtual {p3, p2}, Lpc/U;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p2

    .line 20
    instance-of p3, p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    instance-of p3, p2, Lrb/a;

    .line 25
    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    new-instance p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 29
    .line 30
    check-cast p2, Lrb/a;

    .line 31
    .line 32
    invoke-virtual {p2}, Lrb/a;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "getCode(...)"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p3, v0, v1, p2}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p3, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 54
    .line 55
    invoke-direct {p3, p2}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object p3, p2

    .line 60
    check-cast p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 61
    .line 62
    :goto_0
    new-instance p2, Lcc/m;

    .line 63
    .line 64
    invoke-virtual {p0}, Ldc/a;->g()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {p2, p0, p1, p3}, Lcc/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 69
    .line 70
    .line 71
    throw p2
.end method


# virtual methods
.method public a(LUb/d;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V
    .locals 8

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
    invoke-virtual {p0}, Ldc/a;->g()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Ldc/a;->i()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Ldc/a;->j()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {p0}, Ldc/a;->e()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 41
    .line 42
    iget-object v0, p0, Ldc/r;->g:Lpc/U;

    .line 43
    .line 44
    invoke-virtual {v0}, Lpc/U;->c()Lec/i;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lec/i;->b()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {p0, p3, p1}, Ldc/r;->p(Ljava/lang/String;LUb/d;)Lexpo/modules/kotlin/jni/JNIFunctionBody;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    move-object v1, p2

    .line 57
    invoke-virtual/range {v1 .. v7}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->registerSyncFunction(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;ILexpo/modules/kotlin/jni/JNIFunctionBody;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final o([Ljava/lang/Object;LUb/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldc/r;->h:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    invoke-static/range {v1 .. v6}, Ldc/a;->c(Ldc/a;[Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final p(Ljava/lang/String;LUb/d;)Lexpo/modules/kotlin/jni/JNIFunctionBody;
    .locals 1

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldc/q;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Ldc/q;-><init>(Ldc/r;Ljava/lang/String;LUb/d;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
