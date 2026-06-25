.class public abstract LQe/d;
.super LQe/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lmf/e;


# instance fields
.field private final c:Lpf/g;


# direct methods
.method public constructor <init>(Lpf/n;LQe/v;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinClassFinder"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, LQe/e;-><init>(LQe/v;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, LQe/a;

    .line 15
    .line 16
    invoke-direct {p2, p0}, LQe/a;-><init>(LQe/d;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2}, Lpf/n;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LQe/d;->c:Lpf/g;

    .line 24
    .line 25
    return-void
.end method

.method static synthetic B(LQe/d;LQe/x;)LQe/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LQe/d;->L(LQe/d;LQe/x;)LQe/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic C(LQe/g;LQe/A;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LQe/d;->G(LQe/g;LQe/A;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic D(LQe/g;LQe/A;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LQe/d;->K(LQe/g;LQe/A;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final G(LQe/g;LQe/A;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "$this$loadConstantFromProperty"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LQe/g;->b()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private final H(LQe/x;)LQe/g;
    .locals 6

    .line 1
    new-instance v2, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v5, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v4, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, LQe/d$a;

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move-object v3, p1

    .line 20
    invoke-direct/range {v0 .. v5}, LQe/d$a;-><init>(LQe/d;Ljava/util/HashMap;LQe/x;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, LQe/e;->r(LQe/x;)[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v3, v0, p1}, LQe/x;->c(LQe/x$d;[B)V

    .line 28
    .line 29
    .line 30
    new-instance p1, LQe/g;

    .line 31
    .line 32
    invoke-direct {p1, v2, v5, v4}, LQe/g;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method private final J(Lmf/N;LSe/o;Lmf/d;Lqf/S;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, LQe/e;->b:LQe/e$b;

    .line 2
    .line 3
    sget-object v1, LUe/b;->B:LUe/b$b;

    .line 4
    .line 5
    invoke-virtual {p2}, LSe/o;->f0()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1, v2}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {p2}, LWe/h;->f(LSe/o;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {p0}, LQe/e;->u()LQe/v;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p0}, LQe/e;->v()LUe/c;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x1

    .line 27
    move-object v1, p1

    .line 28
    invoke-virtual/range {v0 .. v7}, LQe/e$b;->a(Lmf/N;ZZLjava/lang/Boolean;ZLQe/v;LUe/c;)LQe/x;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, v1, p1}, LQe/e;->p(Lmf/N;LQe/x;)LQe/x;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, LRe/a;->d()LUe/c;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, LQe/n;->b:LQe/n$a;

    .line 49
    .line 50
    invoke-virtual {v3}, LQe/n$a;->a()LUe/c;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3}, LUe/a;->d(LUe/a;)Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-virtual {v1}, Lmf/N;->b()LUe/d;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v1}, Lmf/N;->d()LUe/h;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    move-object v4, p0

    .line 67
    move-object v5, p2

    .line 68
    move-object v8, p3

    .line 69
    invoke-virtual/range {v4 .. v9}, LQe/e;->s(LZe/p;LUe/d;LUe/h;Lmf/d;Z)LQe/A;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-nez p2, :cond_1

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_1
    iget-object p3, v4, LQe/d;->c:Lpf/g;

    .line 77
    .line 78
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p5, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    invoke-static {p4}, Lve/s;->d(Lqf/S;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0, p1}, LQe/d;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_3
    return-object p1
.end method

.method private static final K(LQe/g;LQe/A;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "$this$loadConstantFromProperty"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LQe/g;->c()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private static final L(LQe/d;LQe/x;)LQe/g;
    .locals 1

    .line 1
    const-string v0, "kotlinClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LQe/d;->H(LQe/x;)LQe/g;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method protected E(LQe/x;)LQe/g;
    .locals 1

    .line 1
    const-string v0, "binaryClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/d;->c:Lpf/g;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LQe/g;

    .line 13
    .line 14
    return-object p1
.end method

.method protected final F(LXe/b;Ljava/util/Map;)Z
    .locals 2

    .line 1
    const-string v0, "annotationClassId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lue/a;->a:Lue/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lue/a;->a()LXe/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x0

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    const-string p1, "value"

    .line 26
    .line 27
    invoke-static {p1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    instance-of p2, p1, Ldf/s;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    check-cast p1, Ldf/s;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p1, v1

    .line 44
    :goto_0
    if-nez p1, :cond_2

    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    instance-of p2, p1, Ldf/s$b$b;

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    check-cast v1, Ldf/s$b$b;

    .line 57
    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    return v0

    .line 61
    :cond_4
    invoke-virtual {v1}, Ldf/s$b$b;->b()LXe/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, LQe/e;->w(LXe/b;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1
.end method

.method protected abstract I(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract M(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public k(Lmf/N;LSe/o;Lqf/S;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "expectedType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, Lmf/d;->b:Lmf/d;

    .line 17
    .line 18
    sget-object v6, LQe/c;->a:LQe/c;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v5, p3

    .line 24
    invoke-direct/range {v1 .. v6}, LQe/d;->J(Lmf/N;LSe/o;Lmf/d;Lqf/S;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public l(Lmf/N;LSe/o;Lqf/S;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "expectedType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, Lmf/d;->c:Lmf/d;

    .line 17
    .line 18
    sget-object v6, LQe/b;->a:LQe/b;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v5, p3

    .line 24
    invoke-direct/range {v1 .. v6}, LQe/d;->J(Lmf/N;LSe/o;Lmf/d;Lqf/S;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public bridge synthetic q(LQe/x;)LQe/e$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQe/d;->E(LQe/x;)LQe/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
