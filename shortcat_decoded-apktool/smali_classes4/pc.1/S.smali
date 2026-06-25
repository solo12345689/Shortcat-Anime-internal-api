.class public final Lpc/S;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 4

    .line 1
    const-string v0, "converterProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pairType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lpc/u;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lpc/S;->a:Lpe/q;

    .line 15
    .line 16
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lpe/s;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v2

    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-static {p2, v3}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Lpe/s;

    .line 52
    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_1
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-interface {p1, v2}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/4 p2, 0x2

    .line 66
    new-array p2, p2, [Lexpo/modules/kotlin/types/b;

    .line 67
    .line 68
    aput-object v0, p2, v1

    .line 69
    .line 70
    aput-object p1, p2, v3

    .line 71
    .line 72
    invoke-static {p2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lpc/S;->b:Ljava/util/List;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string p2, "The pair type should contain the type of the second parameter."

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    const-string p2, "The pair type should contain the type of the first parameter."

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public static final synthetic g(Lpc/S;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/S;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lpc/S;)Lpe/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/S;->a:Lpe/q;

    .line 2
    .line 3
    return-object p0
.end method

.method private final i(LUb/d;Lcom/facebook/react/bridge/ReadableArray;IZ)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p2, p3}, Lcom/facebook/react/bridge/ReadableArray;->getDynamic(I)Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    invoke-static {p0}, Lpc/S;->g(Lpc/S;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lexpo/modules/kotlin/types/b;

    .line 14
    .line 15
    invoke-interface {v0, p2, p1, p4}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    instance-of p4, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 25
    .line 26
    if-nez p4, :cond_1

    .line 27
    .line 28
    instance-of p4, p1, Lrb/a;

    .line 29
    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    new-instance p4, Lexpo/modules/kotlin/exception/CodedException;

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, Lrb/a;

    .line 36
    .line 37
    invoke-virtual {v0}, Lrb/a;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "getCode(...)"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v1, p1

    .line 47
    check-cast v1, Lrb/a;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast p1, Lrb/a;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p4, v0, v1, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    new-instance p4, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 66
    .line 67
    invoke-direct {p4, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object p4, p1

    .line 72
    check-cast p4, Lexpo/modules/kotlin/exception/CodedException;

    .line 73
    .line 74
    :goto_0
    new-instance p1, Lcc/a;

    .line 75
    .line 76
    invoke-static {p0}, Lpc/S;->h(Lpc/S;)Lpe/q;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {p0}, Lpc/S;->h(Lpc/S;)Lpe/q;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v1}, Lpe/q;->e()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    check-cast p3, Lpe/s;

    .line 93
    .line 94
    invoke-virtual {p3}, Lpe/s;->c()Lpe/q;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {p1, v0, p3, v1, p4}, Lcc/a;-><init>(Lpe/q;Lpe/q;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 106
    .line 107
    .line 108
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    :goto_1
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method private final l(Lcom/facebook/react/bridge/ReadableArray;LUb/d;Z)Lkotlin/Pair;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p2, p1, v1, p3}, Lpc/S;->i(LUb/d;Lcom/facebook/react/bridge/ReadableArray;IZ)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {p0, p2, p1, v2, p3}, Lpc/S;->i(LUb/d;Lcom/facebook/react/bridge/ReadableArray;IZ)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 5

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    new-instance v1, Lexpo/modules/kotlin/jni/SingleType;

    .line 4
    .line 5
    sget-object v2, Lec/a;->l:Lec/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    invoke-direct {v1, v2, v3, v4, v3}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lec/a;[Lexpo/modules/kotlin/jni/ExpectedType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    filled-new-array {v1}, [Lexpo/modules/kotlin/jni/SingleType;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/SingleType;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/S;->j(Ljava/lang/Object;LUb/d;Z)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/S;->k(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Ljava/lang/Object;LUb/d;Z)Lkotlin/Pair;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableArray;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/bridge/ReadableArray;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lpc/S;->l(Lcom/facebook/react/bridge/ReadableArray;LUb/d;Z)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    check-cast p1, Lkotlin/Pair;

    .line 18
    .line 19
    return-object p1
.end method

.method public k(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Lkotlin/Pair;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asArray()Lcom/facebook/react/bridge/ReadableArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lpc/S;->l(Lcom/facebook/react/bridge/ReadableArray;LUb/d;Z)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 18
    .line 19
    const-class p2, Lcom/facebook/react/bridge/ReadableArray;

    .line 20
    .line 21
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
