.class public final LUb/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lgc/c;

.field private final b:Ljava/lang/String;

.field private final c:Lgc/e;

.field private d:Z

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lgc/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "module"

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
    iput-object p1, p0, LUb/r;->a:Lgc/c;

    .line 10
    .line 11
    iput-object p2, p0, LUb/r;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lgc/c;->n()Lgc/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LUb/r;->c:Lgc/e;

    .line 18
    .line 19
    new-instance p1, LUb/q;

    .line 20
    .line 21
    invoke-direct {p1, p0}, LUb/q;-><init>(LUb/r;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LUb/r;->e:Lkotlin/Lazy;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic a(LUb/r;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;
    .locals 0

    .line 1
    invoke-static {p0}, LUb/r;->j(LUb/r;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LUb/r;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;LUb/d;Llc/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LUb/r;->d(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;LUb/d;Llc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;LUb/d;Llc/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LUb/r;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->k(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Lgc/e;->f()Lhc/h;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1, v1}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->e(Lhc/h;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lgc/e;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, v1, v2, p2}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->f(Lhc/h;Ljava/lang/String;LUb/d;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1, p2}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->g(Lhc/h;LUb/d;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lgc/e;->h()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lgc/e;->e()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p1, v1, v2, p2, p3}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->j(Ljava/util/Map;Ljava/lang/String;LUb/d;Llc/b;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lgc/e;->b()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0, p2, p3}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->d(Ljava/util/List;LUb/d;Llc/b;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private static final j(LUb/r;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LUb/r;->d:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LUb/r;->h()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, ".jsObject"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "["

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "ExpoModulesCore"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "] "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-virtual {p0}, LUb/r;->g()Lgc/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lgc/c;->i()LUb/d;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, LUb/r;->g()Lgc/c;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lgc/c;->p()Llc/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Llc/b;->c()Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v3, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;

    .line 76
    .line 77
    invoke-direct {v3, v2}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;-><init>(Lexpo/modules/kotlin/jni/JNIDeallocator;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v3, v0, v1}, LUb/r;->b(LUb/r;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;LUb/d;Llc/b;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lexpo/modules/kotlin/jni/JavaScriptModuleObject;

    .line 84
    .line 85
    invoke-virtual {p0}, LUb/r;->h()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v0, v2, p0}, Lexpo/modules/kotlin/jni/JavaScriptModuleObject;-><init>(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/jni/JavaScriptModuleObject;->decorate(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    invoke-static {}, LX3/a;->f()V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :catchall_0
    move-exception p0

    .line 100
    invoke-static {}, LX3/a;->f()V

    .line 101
    .line 102
    .line 103
    throw p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;[Ljava/lang/Object;LUb/u;)V
    .locals 2

    .line 1
    const-string v0, "methodName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "args"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "promise"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, LUb/r;->e()Lgc/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lgc/e;->a()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ldc/g;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    instance-of v1, v0, Ldc/e;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    check-cast v0, Ldc/e;

    .line 37
    .line 38
    invoke-virtual {p0}, LUb/r;->g()Lgc/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, p2, p3, v1}, Ldc/e;->s([Ljava/lang/Object;LUb/u;LUb/d;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, LTd/L;->a:LTd/L;

    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance p3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "Cannot call a "

    .line 62
    .line 63
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, " method in test context"

    .line 70
    .line 71
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p2

    .line 82
    :cond_1
    new-instance p2, Lcc/q;

    .line 83
    .line 84
    invoke-direct {p2}, Lcc/q;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :goto_0
    instance-of p3, p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 89
    .line 90
    if-nez p3, :cond_3

    .line 91
    .line 92
    instance-of p3, p2, Lrb/a;

    .line 93
    .line 94
    if-eqz p3, :cond_2

    .line 95
    .line 96
    new-instance p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 97
    .line 98
    check-cast p2, Lrb/a;

    .line 99
    .line 100
    invoke-virtual {p2}, Lrb/a;->a()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "getCode(...)"

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-direct {p3, v0, v1, p2}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    new-instance p3, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 122
    .line 123
    invoke-direct {p3, p2}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object p3, p2

    .line 128
    check-cast p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 129
    .line 130
    :goto_1
    new-instance p2, Lcc/m;

    .line 131
    .line 132
    invoke-virtual {p0}, LUb/r;->h()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {p2, p1, v0, p3}, Lcc/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 137
    .line 138
    .line 139
    throw p2
.end method

.method public final e()Lgc/e;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/r;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/kotlin/jni/JavaScriptModuleObject;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g()Lgc/c;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/r;->a:Lgc/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LUb/r;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Lgc/e;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    return-object v0
.end method

.method public final i()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;
    .locals 1

    .line 1
    iget-boolean v0, p0, LUb/r;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LUb/r;->f()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final k(Lbc/e;)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgc/e;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lbc/c;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    instance-of v0, p1, Lbc/a;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p1, Lbc/a;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lbc/a;->a()V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_1
    return-void
.end method

.method public final l(Lbc/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    const-string p2, "eventName"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LUb/r;->c:Lgc/e;

    .line 7
    .line 8
    invoke-virtual {p2}, Lgc/e;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lbc/c;

    .line 17
    .line 18
    return-void
.end method

.method public final m(Lbc/e;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgc/e;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lbc/c;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    instance-of v0, p1, Lbc/d;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p1, Lbc/d;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Lbc/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_1
    return-void
.end method

.method public final n()V
    .locals 8

    .line 1
    iget-object v0, p0, LUb/r;->c:Lgc/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgc/e;->g()Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LUb/r;->a:Lgc/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, LUb/d;->x()LGf/O;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v5, LUb/r$a;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v5, v0, p0, v1}, LUb/r$a;-><init>(Lkotlin/jvm/functions/Function2;LUb/r;LZd/e;)V

    .line 23
    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
