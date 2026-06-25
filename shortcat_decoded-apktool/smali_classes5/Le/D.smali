.class public final LLe/D;
.super LBe/H;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLe/D$a;
    }
.end annotation


# static fields
.field static final synthetic o:[Lpe/m;


# instance fields
.field private final g:LOe/u;

.field private final h:LKe/k;

.field private final i:LUe/c;

.field private final j:Lpf/i;

.field private final k:LLe/f;

.field private final l:Lpf/i;

.field private final m:Lze/h;

.field private final n:Lpf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LLe/D;

    .line 4
    .line 5
    const-string v2, "binaryClasses"

    .line 6
    .line 7
    const-string v3, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/F;

    .line 18
    .line 19
    const-string v3, "partToFacade"

    .line 20
    .line 21
    const-string v5, "getPartToFacade()Ljava/util/HashMap;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Lpe/m;

    .line 32
    .line 33
    aput-object v0, v2, v4

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v2, v0

    .line 37
    .line 38
    sput-object v2, LLe/D;->o:[Lpe/m;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(LKe/k;LOe/u;)V
    .locals 8

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jPackage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LKe/k;->d()Lye/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p2}, LOe/u;->f()LXe/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, v0, v1}, LBe/H;-><init>(Lye/H;LXe/c;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, LLe/D;->g:LOe/u;

    .line 23
    .line 24
    const/4 v6, 0x6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move-object v2, p1

    .line 30
    invoke-static/range {v2 .. v7}, LKe/c;->f(LKe/k;Lye/g;LOe/z;IILjava/lang/Object;)LKe/k;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, v3, LLe/D;->h:LKe/k;

    .line 35
    .line 36
    invoke-virtual {v2}, LKe/k;->a()LKe/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LKe/d;->b()LQe/n;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, LQe/n;->f()Lmf/n;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Lmf/o;->d()LUe/c;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, v3, LLe/D;->i:LUe/c;

    .line 57
    .line 58
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, LLe/A;

    .line 63
    .line 64
    invoke-direct {v1, p0}, LLe/A;-><init>(LLe/D;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, v3, LLe/D;->j:Lpf/i;

    .line 72
    .line 73
    new-instance v0, LLe/f;

    .line 74
    .line 75
    invoke-direct {v0, p1, p2, p0}, LLe/f;-><init>(LKe/k;LOe/u;LLe/D;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, v3, LLe/D;->k:LLe/f;

    .line 79
    .line 80
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, LLe/B;

    .line 85
    .line 86
    invoke-direct {v1, p0}, LLe/B;-><init>(LLe/D;)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v0, v1, v2}, Lpf/n;->i(Lie/a;Ljava/lang/Object;)Lpf/i;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, v3, LLe/D;->l:Lpf/i;

    .line 98
    .line 99
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, LKe/d;->i()LHe/D;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, LHe/D;->b()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    sget-object p2, Lze/h;->k0:Lze/h$a;

    .line 114
    .line 115
    invoke-virtual {p2}, Lze/h$a;->b()Lze/h;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-static {p1, p2}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    :goto_0
    iput-object p2, v3, LLe/D;->m:Lze/h;

    .line 125
    .line 126
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance p2, LLe/C;

    .line 131
    .line 132
    invoke-direct {p2, p0}, LLe/C;-><init>(LLe/D;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, p2}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, v3, LLe/D;->n:Lpf/i;

    .line 140
    .line 141
    return-void
.end method

.method static synthetic H0(LLe/D;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/D;->M0(LLe/D;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic K0(LLe/D;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/D;->S0(LLe/D;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic L0(LLe/D;)Ljava/util/HashMap;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/D;->R0(LLe/D;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final M0(LLe/D;)Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, LLe/D;->h:LKe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LKe/d;->o()LQe/D;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LBe/H;->f()LXe/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, LXe/c;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, LQe/D;->a(Ljava/lang/String;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    sget-object v3, LXe/b;->d:LXe/b$a;

    .line 45
    .line 46
    invoke-static {v2}, Lgf/d;->d(Ljava/lang/String;)Lgf/d;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lgf/d;->e()LXe/c;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "getFqNameForTopLevelClassMaybeWithDollars(...)"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v4, p0, LLe/D;->h:LKe/k;

    .line 64
    .line 65
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, LKe/d;->j()LQe/v;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v5, p0, LLe/D;->i:LUe/c;

    .line 74
    .line 75
    invoke-static {v4, v3, v5}, LQe/w;->b(LQe/v;LXe/b;LUe/c;)LQe/x;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    invoke-static {v2, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    const/4 v2, 0x0

    .line 87
    :goto_1
    if-eqz v2, :cond_0

    .line 88
    .line 89
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-static {v1}, LUd/S;->w(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method private static final R0(LLe/D;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LLe/D;->O0()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LQe/x;

    .line 41
    .line 42
    invoke-static {v2}, Lgf/d;->d(Ljava/lang/String;)Lgf/d;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "byInternalName(...)"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, LQe/x;->d()LRe/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LRe/a;->c()LRe/a$a;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    sget-object v4, LLe/D$a;->a:[I

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    aget v3, v4, v3

    .line 66
    .line 67
    const/4 v4, 0x1

    .line 68
    if-eq v3, v4, :cond_1

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    if-eq v3, v1, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-interface {v0, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v1}, LRe/a;->e()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-static {v1}, Lgf/d;->d(Ljava/lang/String;)Lgf/d;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    return-object v0
.end method

.method private static final S0(LLe/D;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, LLe/D;->g:LOe/u;

    .line 2
    .line 3
    invoke-interface {p0}, LOe/u;->u()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-static {p0, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LOe/u;

    .line 35
    .line 36
    invoke-interface {v1}, LOe/u;->f()LXe/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final N0(LOe/g;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/D;->k:LLe/f;

    .line 7
    .line 8
    invoke-virtual {v0}, LLe/f;->i()LLe/G;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, LLe/G;->k0(LOe/g;)Lye/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final O0()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/D;->j:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/D;->o:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, Lpf/m;->a(Lpf/i;Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Map;

    .line 13
    .line 14
    return-object v0
.end method

.method public P0()LLe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/D;->k:LLe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/D;->l:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/D;->m:Lze/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lye/h0;
    .locals 1

    .line 1
    new-instance v0, LQe/y;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LQe/y;-><init>(LLe/D;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic o()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/D;->P0()LLe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Lazy Java package fragment: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LBe/H;->f()LXe/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " of module "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, LLe/D;->h:LKe/k;

    .line 24
    .line 25
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, LKe/d;->m()Lye/H;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method
