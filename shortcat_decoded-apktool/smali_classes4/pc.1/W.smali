.class public final Lpc/W;
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
    const-string v0, "setType"

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
    iput-object p2, p0, Lpc/W;->a:Lpe/q;

    .line 15
    .line 16
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lpe/s;

    .line 25
    .line 26
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-interface {p1, p2}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lpc/W;->b:Lexpo/modules/kotlin/types/b;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "The set type should contain the type of elements."

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public static final synthetic g(Lpc/W;)Lexpo/modules/kotlin/types/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/W;->b:Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lpc/W;)Lpe/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lpc/W;->a:Lpe/q;

    .line 2
    .line 3
    return-object p0
.end method

.method private final k(Lcom/facebook/react/bridge/ReadableArray;LUb/d;Z)Ljava/util/Set;
    .locals 5

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDynamic(I)Lcom/facebook/react/bridge/Dynamic;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    :try_start_0
    invoke-static {p0}, Lpc/W;->g(Lpc/W;)Lexpo/modules/kotlin/types/b;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {v4, v3, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    :try_start_1
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    instance-of p2, p1, Lrb/a;

    .line 40
    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 44
    .line 45
    move-object p3, p1

    .line 46
    check-cast p3, Lrb/a;

    .line 47
    .line 48
    invoke-virtual {p3}, Lrb/a;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    const-string v0, "getCode(...)"

    .line 53
    .line 54
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v0, p1

    .line 58
    check-cast v0, Lrb/a;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast p1, Lrb/a;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :cond_0
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move-object p2, p1

    .line 83
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 84
    .line 85
    :goto_1
    new-instance p1, Lcc/a;

    .line 86
    .line 87
    invoke-static {p0}, Lpc/W;->h(Lpc/W;)Lpe/q;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-static {p0}, Lpc/W;->h(Lpc/W;)Lpe/q;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Lpe/q;->e()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lpe/s;

    .line 104
    .line 105
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/a;-><init>(Lpe/q;Lpe/q;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 117
    .line 118
    .line 119
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    :goto_2
    invoke-interface {v3}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_2
    invoke-static {v1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1
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
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 2
    .line 3
    iget-object v1, p0, Lpc/W;->b:Lexpo/modules/kotlin/types/b;

    .line 4
    .line 5
    invoke-interface {v1}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$a;->c(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;

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
    invoke-virtual {p0, p1, p2, p3}, Lpc/W;->i(Ljava/lang/Object;LUb/d;Z)Ljava/util/Set;

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
    invoke-virtual {p0, p1, p2, p3}, Lpc/W;->j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Ljava/lang/Object;LUb/d;Z)Ljava/util/Set;
    .locals 3

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpc/W;->b:Lexpo/modules/kotlin/types/b;

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
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :try_start_0
    invoke-static {p0}, Lpc/W;->g(Lpc/W;)Lexpo/modules/kotlin/types/b;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2, v1, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 64
    .line 65
    if-nez p2, :cond_2

    .line 66
    .line 67
    instance-of p2, p1, Lrb/a;

    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 72
    .line 73
    check-cast p1, Lrb/a;

    .line 74
    .line 75
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    const-string v0, "getCode(...)"

    .line 80
    .line 81
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 97
    .line 98
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object p2, p1

    .line 103
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 104
    .line 105
    :goto_1
    new-instance p1, Lcc/a;

    .line 106
    .line 107
    invoke-static {p0}, Lpc/W;->h(Lpc/W;)Lpe/q;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-static {p0}, Lpc/W;->h(Lpc/W;)Lpe/q;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Lpe/q;->e()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lpe/s;

    .line 124
    .line 125
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/a;-><init>(Lpe/q;Lpe/q;Lpe/d;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_3
    invoke-static {v0}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1
.end method

.method public j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/util/Set;
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
    invoke-direct {p0, p1, p2, p3}, Lpc/W;->k(Lcom/facebook/react/bridge/ReadableArray;LUb/d;Z)Ljava/util/Set;

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
