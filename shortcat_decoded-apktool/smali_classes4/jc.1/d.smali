.class public final Ljc/d;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljc/d$a;
    }
.end annotation


# instance fields
.field private final a:Lpc/X;

.field private final b:Lpe/q;

.field private final c:LXb/e;

.field private final d:Lkotlin/Lazy;


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
    const-string v0, "type"

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
    iput-object p1, p0, Ljc/d;->a:Lpc/X;

    .line 15
    .line 16
    iput-object p2, p0, Ljc/d;->b:Lpe/q;

    .line 17
    .line 18
    new-instance p1, LXb/e;

    .line 19
    .line 20
    invoke-direct {p1}, LXb/e;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ljc/d;->c:LXb/e;

    .line 24
    .line 25
    new-instance p1, Ljc/c;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljc/c;-><init>(Ljc/d;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ljc/d;->d:Lkotlin/Lazy;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic g(Ljc/d;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Ljc/d;->p(Ljc/d;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Ljc/d;Lcom/facebook/react/bridge/ReadableMap;LUb/d;Z)Ljc/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ljc/d;->l(Lcom/facebook/react/bridge/ReadableMap;LUb/d;Z)Ljc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l(Lcom/facebook/react/bridge/ReadableMap;LUb/d;Z)Ljc/b;
    .locals 6

    .line 1
    iget-object v0, p0, Ljc/d;->b:Lpe/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lpe/d;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljc/d;->m(Lpe/d;)LXb/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, LXb/a;->a()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0}, Ljc/d;->n()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_6

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lpe/o;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljc/d$a;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljc/d$a;->a()Ljc/a;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, Ljc/a;->key()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/4 v4, 0x0

    .line 74
    :goto_1
    if-nez v4, :cond_1

    .line 75
    .line 76
    invoke-interface {v3}, Lpe/c;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    :cond_1
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-nez v5, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2}, Ljc/d$a;->c()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-instance p1, Lcc/l;

    .line 94
    .line 95
    invoke-direct {p1, v3}, Lcc/l;-><init>(Lpe/o;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_3
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    :try_start_0
    invoke-static {v3}, Lre/c;->b(Lpe/m;)Ljava/lang/reflect/Field;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_1
    invoke-virtual {v2}, Ljc/d$a;->b()Lexpo/modules/kotlin/types/b;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v2, v4, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    const/4 v3, 0x1

    .line 119
    :try_start_2
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    invoke-interface {v4}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catchall_0
    move-exception p1

    .line 132
    goto :goto_3

    .line 133
    :catchall_1
    move-exception p1

    .line 134
    :try_start_3
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 135
    .line 136
    if-nez p2, :cond_5

    .line 137
    .line 138
    instance-of p2, p1, Lrb/a;

    .line 139
    .line 140
    if-eqz p2, :cond_4

    .line 141
    .line 142
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 143
    .line 144
    move-object p3, p1

    .line 145
    check-cast p3, Lrb/a;

    .line 146
    .line 147
    invoke-virtual {p3}, Lrb/a;->a()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    const-string v0, "getCode(...)"

    .line 152
    .line 153
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    move-object v0, p1

    .line 157
    check-cast v0, Lrb/a;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast p1, Lrb/a;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 174
    .line 175
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    move-object p2, p1

    .line 180
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 181
    .line 182
    :goto_2
    new-instance p1, Lcc/k;

    .line 183
    .line 184
    invoke-interface {v3}, Lpe/c;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-interface {v3}, Lpe/c;->getReturnType()Lpe/q;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v4}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/k;-><init>(Ljava/lang/String;Lpe/q;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 197
    .line 198
    .line 199
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 200
    :goto_3
    invoke-interface {v4}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_6
    const-string p1, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter"

    .line 205
    .line 206
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    check-cast v0, Ljc/b;

    .line 210
    .line 211
    return-object v0
.end method

.method private final m(Lpe/d;)LXb/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ljc/d;->c:LXb/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LXb/e;->d(Lpe/d;)LXb/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private final n()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ljc/d;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final p(Ljc/d;)Ljava/util/Map;
    .locals 9

    .line 1
    iget-object v0, p0, Ljc/d;->b:Lpe/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lpe/d;

    .line 13
    .line 14
    invoke-static {v0}, Lqe/c;->b(Lpe/d;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_7

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lpe/o;

    .line 40
    .line 41
    invoke-interface {v2}, Lpe/b;->getAnnotations()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v5, 0x0

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Ljava/lang/annotation/Annotation;

    .line 62
    .line 63
    instance-of v6, v6, Ljc/a;

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v4, v5

    .line 69
    :goto_1
    check-cast v4, Ljc/a;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    iget-object v3, p0, Ljc/d;->a:Lpc/X;

    .line 75
    .line 76
    invoke-interface {v2}, Lpe/c;->getReturnType()Lpe/q;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v3, v6}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v2}, Lpe/b;->getAnnotations()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_5

    .line 97
    .line 98
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    move-object v8, v7

    .line 103
    check-cast v8, Ljava/lang/annotation/Annotation;

    .line 104
    .line 105
    instance-of v8, v8, Ljc/e;

    .line 106
    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    move-object v5, v7

    .line 110
    :cond_5
    check-cast v5, Ljc/e;

    .line 111
    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    goto :goto_2

    .line 116
    :cond_6
    const/4 v5, 0x0

    .line 117
    :goto_2
    new-instance v6, Ljc/d$a;

    .line 118
    .line 119
    invoke-direct {v6, v3, v4, v5}, Ljc/d$a;-><init>(Lexpo/modules/kotlin/types/b;Ljc/a;Z)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    :goto_3
    if-eqz v5, :cond_0

    .line 127
    .line 128
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_7
    invoke-static {v1}, LUd/S;->w(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
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
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    sget-object v1, Lec/a;->m:Lec/a;

    .line 4
    .line 5
    filled-new-array {v1}, [Lec/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ljc/d;->i(Ljava/lang/Object;LUb/d;Z)Ljc/b;

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
    invoke-virtual {p0, p1, p2, p3}, Ljc/d;->j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Ljava/lang/Object;LUb/d;Z)Ljc/b;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Ljc/d;->l(Lcom/facebook/react/bridge/ReadableMap;LUb/d;Z)Ljc/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, p3}, Ljc/d;->k(Ljava/util/Map;LUb/d;Z)Ljc/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    check-cast p1, Ljc/b;

    .line 29
    .line 30
    return-object p1
.end method

.method public j(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljc/b;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p1, p2, p3}, Ljc/d;->h(Ljc/d;Lcom/facebook/react/bridge/ReadableMap;LUb/d;Z)Ljc/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 20
    .line 21
    const-class p2, Lcom/facebook/react/bridge/ReadableMap;

    .line 22
    .line 23
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 28
    .line 29
    .line 30
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :goto_0
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 32
    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    instance-of p2, p1, Lrb/a;

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 40
    .line 41
    check-cast p1, Lrb/a;

    .line 42
    .line 43
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    const-string v0, "getCode(...)"

    .line 48
    .line 49
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object p2, p1

    .line 71
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 72
    .line 73
    :goto_1
    new-instance p1, Lcc/w;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljc/d;->o()Lpe/q;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-direct {p1, p3, p2}, Lcc/w;-><init>(Lpe/q;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public final k(Ljava/util/Map;LUb/d;Z)Ljc/b;
    .locals 7

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljc/d;->b:Lpe/q;

    .line 7
    .line 8
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Lpe/d;

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljc/d;->m(Lpe/d;)LXb/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, LXb/a;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p0}, Ljc/d;->n()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_b

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lpe/o;

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljc/d$a;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljc/d$a;->a()Ljc/a;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-interface {v4}, Ljc/a;->key()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_0

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    const/4 v4, 0x0

    .line 79
    :goto_1
    if-nez v4, :cond_1

    .line 80
    .line 81
    invoke-interface {v3}, Lpe/c;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    :cond_1
    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    invoke-virtual {v2}, Ljc/d$a;->c()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    new-instance p1, Lcc/l;

    .line 99
    .line 100
    invoke-direct {p1, v3}, Lcc/l;-><init>(Lpe/o;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_3
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    instance-of v5, v4, Ljava/lang/Number;

    .line 109
    .line 110
    if-eqz v5, :cond_8

    .line 111
    .line 112
    invoke-interface {v3}, Lpe/c;->getReturnType()Lpe/q;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-interface {v5}, Lpe/q;->c()Lpe/f;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 121
    .line 122
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_4

    .line 131
    .line 132
    check-cast v4, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_5

    .line 154
    .line 155
    check-cast v4, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    goto :goto_2

    .line 166
    :cond_5
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_6

    .line 177
    .line 178
    check-cast v4, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    goto :goto_2

    .line 189
    :cond_6
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 190
    .line 191
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_7

    .line 200
    .line 201
    check-cast v4, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    goto :goto_2

    .line 212
    :cond_7
    check-cast v4, Ljava/lang/Number;

    .line 213
    .line 214
    :cond_8
    :goto_2
    invoke-static {v3}, Lre/c;->b(Lpe/m;)Ljava/lang/reflect/Field;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :try_start_0
    invoke-virtual {v2}, Ljc/d$a;->b()Lexpo/modules/kotlin/types/b;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-interface {v2, v4, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    const/4 v3, 0x1

    .line 230
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :catchall_0
    move-exception p1

    .line 239
    instance-of p2, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 240
    .line 241
    if-nez p2, :cond_a

    .line 242
    .line 243
    instance-of p2, p1, Lrb/a;

    .line 244
    .line 245
    if-eqz p2, :cond_9

    .line 246
    .line 247
    new-instance p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 248
    .line 249
    check-cast p1, Lrb/a;

    .line 250
    .line 251
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    const-string v0, "getCode(...)"

    .line 256
    .line 257
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-direct {p2, p3, v0, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_9
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 273
    .line 274
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_a
    move-object p2, p1

    .line 279
    check-cast p2, Lexpo/modules/kotlin/exception/CodedException;

    .line 280
    .line 281
    :goto_3
    new-instance p1, Lcc/k;

    .line 282
    .line 283
    invoke-interface {v3}, Lpe/c;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p3

    .line 287
    invoke-interface {v3}, Lpe/c;->getReturnType()Lpe/q;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {p0}, Ljc/d;->o()Lpe/q;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {p1, p3, v0, v1, p2}, Lcc/k;-><init>(Ljava/lang/String;Lpe/q;Lpe/q;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :cond_b
    const-string p1, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter"

    .line 300
    .line 301
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    check-cast v0, Ljc/b;

    .line 305
    .line 306
    return-object v0
.end method

.method public final o()Lpe/q;
    .locals 1

    .line 1
    iget-object v0, p0, Ljc/d;->b:Lpe/q;

    .line 2
    .line 3
    return-object v0
.end method
