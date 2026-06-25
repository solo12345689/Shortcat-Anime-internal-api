.class public final Lexpo/modules/kotlin/views/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/d;

.field private final b:Lpe/q;

.field private final c:Lpc/X;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Map;

.field private f:Lkotlin/jvm/functions/Function1;

.field private g:Lkotlin/jvm/functions/Function1;

.field private h:Lexpo/modules/kotlin/views/b;

.field private i:Ljava/util/Map;

.field private j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lpe/d;Lpe/q;Lpc/X;)V
    .locals 1

    .line 1
    const-string v0, "viewClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewType"

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
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/views/p;->b:Lpe/q;

    .line 17
    .line 18
    iput-object p3, p0, Lexpo/modules/kotlin/views/p;->c:Lpc/X;

    .line 19
    .line 20
    invoke-interface {p1}, Lpe/d;->v()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string p1, "getSimpleName(...)"

    .line 35
    .line 36
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object p2, p0, Lexpo/modules/kotlin/views/p;->d:Ljava/lang/String;

    .line 40
    .line 41
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->e:Ljava/util/Map;

    .line 47
    .line 48
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->i:Ljava/util/Map;

    .line 54
    .line 55
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->j:Ljava/util/Map;

    .line 61
    .line 62
    return-void
.end method

.method public static synthetic a(Lexpo/modules/kotlin/views/p;Landroid/content/Context;LUb/d;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/views/p;->e(Lexpo/modules/kotlin/views/p;Landroid/content/Context;LUb/d;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/kotlin/views/o;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/views/o;-><init>(Lexpo/modules/kotlin/views/p;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final e(Lexpo/modules/kotlin/views/p;Landroid/content/Context;LUb/d;)Landroid/view/View;
    .locals 4

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "appContext"

    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 15
    .line 16
    invoke-static {v2}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-class v3, LUb/d;

    .line 21
    .line 22
    filled-new-array {v0, v3}, [Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-object v2, v1

    .line 32
    :goto_0
    if-eqz v2, :cond_0

    .line 33
    .line 34
    :try_start_1
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v0, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-direct {p0, p1, p2, v0}, Lexpo/modules/kotlin/views/p;->i(Landroid/content/Context;LUb/d;Ljava/lang/Throwable;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    return-object v0

    .line 54
    :cond_0
    :try_start_2
    iget-object v2, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 55
    .line 56
    invoke-static {v2}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 65
    .line 66
    .line 67
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 68
    :catch_1
    if-eqz v1, :cond_1

    .line 69
    .line 70
    :try_start_3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast v0, Landroid/view/View;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    invoke-direct {p0, p1, p2, v0}, Lexpo/modules/kotlin/views/p;->i(Landroid/content/Context;LUb/d;Ljava/lang/Throwable;)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_2
    return-object v0

    .line 90
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    iget-object p0, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 93
    .line 94
    new-instance p2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v0, "Didn\'t find a correct constructor for "

    .line 100
    .line 101
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method private final i(Landroid/content/Context;LUb/d;Ljava/lang/Throwable;)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Couldn\'t create view of type "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "ExpoModulesCore"

    .line 21
    .line 22
    invoke-static {v1, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, LUb/d;->r()LZb/b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    instance-of v0, p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    move-object v0, p3

    .line 36
    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 43
    .line 44
    invoke-direct {v0, p3}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p2, v0}, LZb/b;->B(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object p2, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 51
    .line 52
    invoke-static {p2}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-class p3, Landroid/view/ViewGroup;

    .line 57
    .line 58
    invoke-virtual {p3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    new-instance p2, Lexpo/modules/kotlin/views/d;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/views/d;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    return-object p2

    .line 70
    :cond_3
    new-instance p2, Lexpo/modules/kotlin/views/e;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/views/e;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    return-object p2
.end method


# virtual methods
.method public final varargs b([Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "callbacks"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/views/b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/views/b;-><init>([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lexpo/modules/kotlin/views/p;->h:Lexpo/modules/kotlin/views/b;

    .line 12
    .line 13
    return-void
.end method

.method public final c()Lexpo/modules/kotlin/views/r;
    .locals 14

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/p;->i:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/views/p;->j:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {v3}, LUd/S;->e(I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ldc/b;

    .line 49
    .line 50
    invoke-virtual {v3}, Ldc/b;->a()Ldc/g;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {v0, v2}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/util/Map$Entry;

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ldc/g;

    .line 87
    .line 88
    sget-object v3, Ldc/m;->a:Ldc/m;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ldc/g;->n(Ldc/m;)Ldc/g;

    .line 91
    .line 92
    .line 93
    iget-object v3, p0, Lexpo/modules/kotlin/views/p;->b:Lpe/q;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    .line 96
    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    invoke-virtual {v2, v3}, Ldc/a;->k(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    new-instance v4, Lexpo/modules/kotlin/views/r;

    .line 104
    .line 105
    invoke-direct {p0}, Lexpo/modules/kotlin/views/p;->d()Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v1, p0, Lexpo/modules/kotlin/views/p;->a:Lpe/d;

    .line 110
    .line 111
    invoke-static {v1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iget-object v7, p0, Lexpo/modules/kotlin/views/p;->e:Ljava/util/Map;

    .line 116
    .line 117
    iget-object v8, p0, Lexpo/modules/kotlin/views/p;->d:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v9, p0, Lexpo/modules/kotlin/views/p;->f:Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    iget-object v10, p0, Lexpo/modules/kotlin/views/p;->h:Lexpo/modules/kotlin/views/b;

    .line 122
    .line 123
    iget-object v12, p0, Lexpo/modules/kotlin/views/p;->g:Lkotlin/jvm/functions/Function1;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Iterable;

    .line 130
    .line 131
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    const/4 v11, 0x0

    .line 136
    invoke-direct/range {v4 .. v13}, Lexpo/modules/kotlin/views/r;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/views/b;Lexpo/modules/kotlin/views/q;Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    return-object v4
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/p;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lpc/X;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/p;->c:Lpc/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/p;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/views/p;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method
