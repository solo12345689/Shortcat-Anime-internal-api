.class public final Lpc/e;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lexpo/modules/kotlin/types/b;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 1

    .line 1
    const-string v0, "converterProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arrayType"

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
    iput-object p2, p0, Lpc/e;->a:Lpe/q;

    .line 15
    .line 16
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lpe/s;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p2, 0x0

    .line 34
    :goto_0
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-interface {p1, p2}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lpc/e;->b:Lexpo/modules/kotlin/types/b;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p2, "The array type should contain the type of the elements."

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public static final synthetic g(Lpc/e;)Lexpo/modules/kotlin/types/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/e;->b:Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lpc/e;)Lpe/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/e;->a:Lpe/q;

    .line 2
    .line 3
    return-object p0
.end method

.method private final k(I)[Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lpc/e;->a:Lpe/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lpe/q;->e()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lpe/s;

    .line 12
    .line 13
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v0, Lpe/d;

    .line 30
    .line 31
    invoke-static {v0}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, [Ljava/lang/Object;

    .line 45
    .line 46
    return-object p1
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lpc/e;->b:Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 2
    .line 3
    iget-object v1, p0, Lpc/e;->b:Lexpo/modules/kotlin/types/b;

    .line 4
    .line 5
    invoke-interface {v1}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$a;->a(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/e;->i(Ljava/lang/Object;LUb/d;Z)[Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2, p3}, Lpc/e;->j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Ljava/lang/Object;LUb/d;Z)[Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpc/e;->b:Lexpo/modules/kotlin/types/b;

    .line 7
    .line 8
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    check-cast p1, [Ljava/lang/Object;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    check-cast p1, [Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    array-length v1, p1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    array-length v1, p1

    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_0
    if-ge v3, v1, :cond_3

    .line 31
    .line 32
    aget-object v4, p1, v3

    .line 33
    .line 34
    :try_start_0
    invoke-static {p0}, Lpc/e;->g(Lpc/e;)Lexpo/modules/kotlin/types/b;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {v5, v4, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 50
    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    instance-of p2, p1, Lrb/a;

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 58
    .line 59
    check-cast p1, Lrb/a;

    .line 60
    .line 61
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    const-string v0, "getCode(...)"

    .line 66
    .line 67
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 83
    .line 84
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object p2, p1

    .line 89
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 90
    .line 91
    :goto_1
    new-instance p1, Lcc/a;

    .line 92
    .line 93
    invoke-static {p0}, Lpc/e;->h(Lpc/e;)Lpe/q;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-static {p0}, Lpc/e;->h(Lpc/e;)Lpe/q;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Lpe/q;->e()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lpe/s;

    .line 110
    .line 111
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/a;-><init>(Lpe/q;Lpe/q;Lpe/d;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_3
    new-array p1, v2, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1
.end method

.method public j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)[Ljava/lang/Object;
    .locals 5

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
    if-eqz p1, :cond_3

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-direct {p0, v0}, Lpc/e;->k(I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_2

    .line 26
    .line 27
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDynamic(I)Lcom/facebook/react/bridge/Dynamic;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :try_start_0
    invoke-static {p0}, Lpc/e;->g(Lpc/e;)Lexpo/modules/kotlin/types/b;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v4, v3, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 40
    .line 41
    .line 42
    aput-object v4, v0, v2

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_1
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 49
    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    instance-of p2, p1, Lrb/a;

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 57
    .line 58
    move-object p3, p1

    .line 59
    check-cast p3, Lrb/a;

    .line 60
    .line 61
    invoke-virtual {p3}, Lrb/a;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    const-string v0, "getCode(...)"

    .line 66
    .line 67
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v0, p1

    .line 71
    check-cast v0, Lrb/a;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast p1, Lrb/a;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 90
    .line 91
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object p2, p1

    .line 96
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 97
    .line 98
    :goto_1
    new-instance p1, Lcc/a;

    .line 99
    .line 100
    invoke-static {p0}, Lpc/e;->h(Lpc/e;)Lpe/q;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-static {p0}, Lpc/e;->h(Lpc/e;)Lpe/q;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v0}, Lpe/q;->e()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lpe/s;

    .line 117
    .line 118
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/a;-><init>(Lpe/q;Lpe/q;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 130
    .line 131
    .line 132
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    :goto_2
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_2
    return-object v0

    .line 138
    :cond_3
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 139
    .line 140
    const-class p2, Lcom/facebook/react/bridge/ReadableArray;

    .line 141
    .line 142
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method
