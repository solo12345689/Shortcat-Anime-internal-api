.class final LDe/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LDe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LDe/c;

    .line 2
    .line 3
    invoke-direct {v0}, LDe/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LDe/c;->a:LDe/c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a(Ljava/lang/Class;)Ldf/f;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v1, "getComponentType(...)"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance p1, Ldf/f;

    .line 35
    .line 36
    sget-object v1, LXe/b;->d:LXe/b$a;

    .line 37
    .line 38
    sget-object v2, Lve/o$a;->f:LXe/d;

    .line 39
    .line 40
    invoke-virtual {v2}, LXe/d;->m()LXe/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {p1, v1, v0}, Ldf/f;-><init>(LXe/b;I)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lgf/e;->b(Ljava/lang/String;)Lgf/e;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lgf/e;->m()Lve/l;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v1, "getPrimitiveType(...)"

    .line 65
    .line 66
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    if-lez v0, :cond_2

    .line 70
    .line 71
    new-instance v1, Ldf/f;

    .line 72
    .line 73
    sget-object v2, LXe/b;->d:LXe/b$a;

    .line 74
    .line 75
    invoke-virtual {p1}, Lve/l;->k()LXe/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v2, p1}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    add-int/lit8 v0, v0, -0x1

    .line 84
    .line 85
    invoke-direct {v1, p1, v0}, Ldf/f;-><init>(LXe/b;I)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_2
    new-instance v1, Ldf/f;

    .line 90
    .line 91
    sget-object v2, LXe/b;->d:LXe/b$a;

    .line 92
    .line 93
    invoke-virtual {p1}, Lve/l;->p()LXe/c;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v2, p1}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {v1, p1, v0}, Ldf/f;-><init>(LXe/b;I)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    invoke-static {p1}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object v1, Lxe/c;->a:Lxe/c;

    .line 110
    .line 111
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v1, v2}, Lxe/c;->m(LXe/c;)LXe/b;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-nez v1, :cond_4

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-object p1, v1

    .line 123
    :goto_1
    new-instance v1, Ldf/f;

    .line 124
    .line 125
    invoke-direct {v1, p1, v0}, Ldf/f;-><init>(LXe/b;I)V

    .line 126
    .line 127
    .line 128
    return-object v1
.end method

.method private final c(Ljava/lang/Class;LQe/x$d;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    sget-object v1, LXe/h;->j:LXe/f;

    .line 22
    .line 23
    sget-object v2, LDe/m;->a:LDe/m;

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, LDe/m;->a(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p2, v1, v2}, LQe/x$d;->a(LXe/f;Ljava/lang/String;)LQe/x$e;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/annotation/Annotation;

    .line 58
    .line 59
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v1, v3}, LDe/c;->f(LQe/x$c;Ljava/lang/annotation/Annotation;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    array-length v3, v2

    .line 74
    const/4 v4, 0x0

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v3, v4

    .line 80
    :goto_2
    if-nez v3, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    array-length v0, v0

    .line 87
    array-length v3, v2

    .line 88
    sub-int/2addr v0, v3

    .line 89
    array-length v3, v2

    .line 90
    :goto_3
    if-ge v4, v3, :cond_5

    .line 91
    .line 92
    aget-object v5, v2, v4

    .line 93
    .line 94
    invoke-static {v5}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    :cond_3
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Ljava/lang/annotation/Annotation;

    .line 109
    .line 110
    invoke-static {v6}, Lhe/a;->a(Ljava/lang/annotation/Annotation;)Lpe/d;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v7}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    add-int v8, v4, v0

    .line 119
    .line 120
    invoke-static {v7}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    new-instance v10, LDe/b;

    .line 125
    .line 126
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v10, v6}, LDe/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v8, v9, v10}, LQe/x$e;->c(ILXe/b;Lye/h0;)LQe/x$a;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-eqz v8, :cond_3

    .line 137
    .line 138
    sget-object v9, LDe/c;->a:LDe/c;

    .line 139
    .line 140
    invoke-direct {v9, v8, v6, v7}, LDe/c;->h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-interface {v1}, LQe/x$c;->a()V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_6
    return-void
.end method

.method private final d(Ljava/lang/Class;LQe/x$d;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "identifier(...)"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, LDe/m;->a:LDe/m;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, LDe/m;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-interface {p2, v1, v2, v3}, LQe/x$d;->b(LXe/f;Ljava/lang/String;Ljava/lang/Object;)LQe/x$c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/annotation/Annotation;

    .line 70
    .line 71
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v1, v2}, LDe/c;->f(LQe/x$c;Ljava/lang/annotation/Annotation;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-interface {v1}, LQe/x$c;->a()V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    return-void
.end method

.method private final e(Ljava/lang/Class;LQe/x$d;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "identifier(...)"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, LDe/m;->a:LDe/m;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, LDe/m;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {p2, v1, v2}, LQe/x$d;->a(LXe/f;Ljava/lang/String;)LQe/x$e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/annotation/Annotation;

    .line 69
    .line 70
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v1, v3}, LDe/c;->f(LQe/x$c;Ljava/lang/annotation/Annotation;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v2, "getParameterAnnotations(...)"

    .line 82
    .line 83
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    check-cast v0, [[Ljava/lang/annotation/Annotation;

    .line 87
    .line 88
    array-length v2, v0

    .line 89
    const/4 v3, 0x0

    .line 90
    :goto_2
    if-ge v3, v2, :cond_4

    .line 91
    .line 92
    aget-object v4, v0, v3

    .line 93
    .line 94
    invoke-static {v4}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    :cond_2
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Ljava/lang/annotation/Annotation;

    .line 109
    .line 110
    invoke-static {v5}, Lhe/a;->a(Ljava/lang/annotation/Annotation;)Lpe/d;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v6}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    new-instance v8, LDe/b;

    .line 123
    .line 124
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v8, v5}, LDe/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1, v3, v7, v8}, LQe/x$e;->c(ILXe/b;Lye/h0;)LQe/x$a;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    if-eqz v7, :cond_2

    .line 135
    .line 136
    sget-object v8, LDe/c;->a:LDe/c;

    .line 137
    .line 138
    invoke-direct {v8, v7, v5, v6}, LDe/c;->h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-interface {v1}, LQe/x$c;->a()V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_5
    return-void
.end method

.method private final f(LQe/x$c;Ljava/lang/annotation/Annotation;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lhe/a;->a(Ljava/lang/annotation/Annotation;)Lpe/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, LDe/b;

    .line 14
    .line 15
    invoke-direct {v2, p2}, LDe/b;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1, v2}, LQe/x$c;->b(LXe/b;Lye/h0;)LQe/x$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object v1, LDe/c;->a:LDe/c;

    .line 25
    .line 26
    invoke-direct {v1, p1, p2, v0}, LDe/c;->h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private final g(LQe/x$a;LXe/f;Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "null cannot be cast to non-null type java.lang.Class<*>"

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p3, Ljava/lang/Class;

    .line 19
    .line 20
    invoke-direct {p0, p3}, LDe/c;->a(Ljava/lang/Class;)Ldf/f;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-interface {p1, p2, p3}, LQe/x$a;->f(LXe/f;Ldf/f;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {}, LDe/i;->a()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, p2, p3}, LQe/x$a;->d(LXe/f;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {v0}, LEe/f;->l(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const-string v4, "identifier(...)"

    .line 47
    .line 48
    const-string v5, "null cannot be cast to non-null type kotlin.Enum<*>"

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p3, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    check-cast p3, Ljava/lang/Enum;

    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-static {p3}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-static {p3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, p2, v0, p3}, LQe/x$a;->b(LXe/f;LXe/b;LXe/f;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    const-class v2, Ljava/lang/annotation/Annotation;

    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    const-string v7, "null cannot be cast to non-null type kotlin.Annotation"

    .line 97
    .line 98
    if-eqz v6, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "getInterfaces(...)"

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, LUd/n;->H0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/Class;

    .line 114
    .line 115
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {p1, p2, v1}, LQe/x$a;->c(LXe/f;LXe/b;)LQe/x$a;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-nez p1, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast p3, Ljava/lang/annotation/Annotation;

    .line 133
    .line 134
    invoke-direct {p0, p1, p3, v0}, LDe/c;->h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_c

    .line 143
    .line 144
    invoke-interface {p1, p2}, LQe/x$a;->e(LXe/f;)LQe/x$b;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_6

    .line 149
    .line 150
    :goto_1
    return-void

    .line 151
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/4 v6, 0x0

    .line 160
    const-string v8, "null cannot be cast to non-null type kotlin.Array<*>"

    .line 161
    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p2}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    check-cast p3, [Ljava/lang/Object;

    .line 175
    .line 176
    array-length v0, p3

    .line 177
    :goto_2
    if-ge v6, v0, :cond_b

    .line 178
    .line 179
    aget-object v1, p3, v6

    .line 180
    .line 181
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    check-cast v1, Ljava/lang/Enum;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {p1, p2, v1}, LQe/x$b;->c(LXe/b;LXe/f;)V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v6, v6, 0x1

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast p3, [Ljava/lang/Object;

    .line 213
    .line 214
    array-length p2, p3

    .line 215
    :goto_3
    if-ge v6, p2, :cond_b

    .line 216
    .line 217
    aget-object v0, p3, v6

    .line 218
    .line 219
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    check-cast v0, Ljava/lang/Class;

    .line 223
    .line 224
    invoke-direct {p0, v0}, LDe/c;->a(Ljava/lang/Class;)Ldf/f;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {p1, v0}, LQe/x$b;->d(Ldf/f;)V

    .line 229
    .line 230
    .line 231
    add-int/lit8 v6, v6, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_8
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_a

    .line 239
    .line 240
    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    check-cast p3, [Ljava/lang/Object;

    .line 244
    .line 245
    array-length v0, p3

    .line 246
    :goto_4
    if-ge v6, v0, :cond_b

    .line 247
    .line 248
    aget-object v1, p3, v6

    .line 249
    .line 250
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-static {p2}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-interface {p1, v2}, LQe/x$b;->b(LXe/b;)LQe/x$a;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    if-nez v2, :cond_9

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_9
    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 268
    .line 269
    invoke-direct {p0, v2, v1, p2}, LDe/c;->h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 270
    .line 271
    .line 272
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_a
    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    check-cast p3, [Ljava/lang/Object;

    .line 279
    .line 280
    array-length p2, p3

    .line 281
    :goto_6
    if-ge v6, p2, :cond_b

    .line 282
    .line 283
    aget-object v0, p3, v6

    .line 284
    .line 285
    invoke-interface {p1, v0}, LQe/x$b;->e(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    add-int/lit8 v6, v6, 0x1

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_b
    invoke-interface {p1}, LQe/x$b;->a()V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 296
    .line 297
    new-instance p2, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    const-string v1, "Unsupported annotation argument value ("

    .line 303
    .line 304
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v0, "): "

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p1
.end method

.method private final h(LQe/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p3}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :catch_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Method;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v2, "identifier(...)"

    .line 38
    .line 39
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1, v0, v1}, LDe/c;->g(LQe/x$a;LXe/f;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p1}, LQe/x$a;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;LQe/x$c;)V
    .locals 1

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "visitor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/annotation/Annotation;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p2, v0}, LDe/c;->f(LQe/x$c;Ljava/lang/annotation/Annotation;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p2}, LQe/x$c;->a()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final i(Ljava/lang/Class;LQe/x$d;)V
    .locals 1

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "memberVisitor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LDe/c;->e(Ljava/lang/Class;LQe/x$d;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, LDe/c;->c(Ljava/lang/Class;LQe/x$d;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, p2}, LDe/c;->d(Ljava/lang/Class;LQe/x$d;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
