.class public abstract Ldc/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[Lpc/b;

.field private c:Z

.field private d:Lpe/q;

.field private e:Z

.field private final f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lpc/b;)V
    .locals 2

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldc/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Ldc/a;->b:[Lpc/b;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Ldc/a;->e:Z

    .line 20
    .line 21
    invoke-static {p2}, LUd/n;->F0([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p2, 0x0

    .line 30
    move v0, p2

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lpc/b;

    .line 42
    .line 43
    invoke-virtual {v1}, Lpc/b;->g()Lpe/q;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Lpe/q;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, -0x1

    .line 58
    :goto_1
    if-gez v0, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    iget-object p1, p0, Ldc/a;->b:[Lpc/b;

    .line 62
    .line 63
    array-length p1, p1

    .line 64
    sub-int p2, p1, v0

    .line 65
    .line 66
    :goto_2
    iput p2, p0, Ldc/a;->f:I

    .line 67
    .line 68
    return-void
.end method

.method public static synthetic c(Ldc/a;[Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ldc/a;->b([Ljava/lang/Object;LUb/d;Z)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: convertArgs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method


# virtual methods
.method public abstract a(LUb/d;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V
.end method

.method protected final b([Ljava/lang/Object;LUb/d;Z)[Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ldc/a;->f:I

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    if-gt v0, v1, :cond_5

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    iget-object v1, p0, Ldc/a;->b:[Lpc/b;

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-gt v0, v2, :cond_5

    .line 16
    .line 17
    array-length v0, v1

    .line 18
    array-length v2, p1

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    array-length v0, v1

    .line 24
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    :goto_0
    array-length v1, p1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-ge v2, v1, :cond_4

    .line 29
    .line 30
    aget-object v3, p1, v2

    .line 31
    .line 32
    iget-object v4, p0, Ldc/a;->b:[Lpc/b;

    .line 33
    .line 34
    aget-object v4, v4, v2

    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v4, v3, p2, p3}, Lpc/b;->b(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    aput-object v5, v0, v2

    .line 41
    .line 42
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    instance-of p2, p1, Lrb/a;

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 60
    .line 61
    check-cast p1, Lrb/a;

    .line 62
    .line 63
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    const-string v0, "getCode(...)"

    .line 68
    .line 69
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    move-object p1, p2

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 86
    .line 87
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_3
    new-instance p2, Lexpo/modules/kotlin/exception/a;

    .line 92
    .line 93
    invoke-virtual {v4}, Lpc/b;->g()Lpe/q;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    const/4 v0, 0x0

    .line 105
    :goto_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {p2, p3, v2, v0, p1}, Lexpo/modules/kotlin/exception/a;-><init>(Lpe/q;ILjava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 110
    .line 111
    .line 112
    throw p2

    .line 113
    :cond_4
    return-object v0

    .line 114
    :cond_5
    new-instance p2, Lexpo/modules/kotlin/exception/InvalidArgsNumberException;

    .line 115
    .line 116
    array-length p1, p1

    .line 117
    iget-object p3, p0, Ldc/a;->b:[Lpc/b;

    .line 118
    .line 119
    array-length p3, p3

    .line 120
    iget v0, p0, Ldc/a;->f:I

    .line 121
    .line 122
    invoke-direct {p2, p1, p3, v0}, Lexpo/modules/kotlin/exception/InvalidArgsNumberException;-><init>(III)V

    .line 123
    .line 124
    .line 125
    throw p2
.end method

.method public final d(Z)Ldc/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldc/a;->e:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Ldc/a;->b:[Lpc/b;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_0

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Lpc/b;->f()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1
.end method

.method protected final f()[Lpc/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/a;->b:[Lpc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lpe/q;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/a;->d:Lpe/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldc/a;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    iget-object v0, p0, Ldc/a;->b:[Lpc/b;

    .line 7
    .line 8
    invoke-static {v0}, LUd/n;->Y([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lpc/b;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lpc/b;->g()Lpe/q;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v2

    .line 29
    :goto_0
    instance-of v3, v0, Lpe/d;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    check-cast v0, Lpe/d;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v0, v2

    .line 37
    :goto_1
    if-nez v0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    const-class v3, Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0

    .line 54
    :cond_3
    iget-object v3, p0, Ldc/a;->d:Lpe/q;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-interface {v3}, Lpe/q;->c()Lpe/f;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move-object v3, v2

    .line 64
    :goto_2
    instance-of v4, v3, Lpe/d;

    .line 65
    .line 66
    if-eqz v4, :cond_5

    .line 67
    .line 68
    move-object v2, v3

    .line 69
    check-cast v2, Lpe/d;

    .line 70
    .line 71
    :cond_5
    if-nez v2, :cond_6

    .line 72
    .line 73
    return v1

    .line 74
    :cond_6
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    return v0

    .line 79
    :cond_7
    return v1
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldc/a;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldc/a;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public final l(Lpe/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldc/a;->d:Lpe/q;

    .line 2
    .line 3
    return-void
.end method
