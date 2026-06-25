.class public final Lof/S;
.super LBe/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final k:Lmf/p;

.field private final l:LSe/t;

.field private final m:Lof/a;


# direct methods
.method public constructor <init>(Lmf/p;LSe/t;I)V
    .locals 11

    .line 1
    const-string v0, "c"

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
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Lmf/p;->e()Lye/m;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p1}, Lmf/p;->g()LUe/d;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, LSe/t;->O()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget-object v0, Lmf/O;->a:Lmf/O;

    .line 38
    .line 39
    invoke-virtual {p2}, LSe/t;->U()LSe/t$c;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v6, "getVariance(...)"

    .line 44
    .line 45
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lmf/O;->d(LSe/t$c;)Lqf/N0;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {p2}, LSe/t;->P()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sget-object v9, Lye/h0;->a:Lye/h0;

    .line 57
    .line 58
    sget-object v10, Lye/k0$a;->a:Lye/k0$a;

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move v8, p3

    .line 62
    invoke-direct/range {v1 .. v10}, LBe/b;-><init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lqf/N0;ZILye/h0;Lye/k0;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v1, Lof/S;->k:Lmf/p;

    .line 66
    .line 67
    iput-object p2, v1, Lof/S;->l:LSe/t;

    .line 68
    .line 69
    new-instance p2, Lof/a;

    .line 70
    .line 71
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p3, Lof/Q;

    .line 76
    .line 77
    invoke-direct {p3, p0}, Lof/Q;-><init>(Lof/S;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p2, p1, p3}, Lof/a;-><init>(Lpf/n;Lie/a;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, v1, Lof/S;->m:Lof/a;

    .line 84
    .line 85
    return-void
.end method

.method static synthetic M0(Lof/S;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/S;->N0(Lof/S;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final N0(Lof/S;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lof/S;->k:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lmf/n;->d()Lmf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lof/S;->l:LSe/t;

    .line 12
    .line 13
    iget-object p0, p0, Lof/S;->k:Lmf/p;

    .line 14
    .line 15
    invoke-virtual {p0}, Lmf/p;->g()LUe/d;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {v0, v1, p0}, Lmf/h;->a(LSe/t;LUe/d;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public bridge synthetic K0(Lqf/S;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lof/S;->P0(Lqf/S;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected L0()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lof/S;->l:LSe/t;

    .line 2
    .line 3
    iget-object v1, p0, Lof/S;->k:Lmf/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmf/p;->j()LUe/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, LUe/g;->s(LSe/t;LUe/h;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lff/e;->m(Lye/m;)Lve/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lve/i;->z()Lqf/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    iget-object v1, p0, Lof/S;->k:Lmf/p;

    .line 33
    .line 34
    invoke-virtual {v1}, Lmf/p;->i()Lmf/X;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, LSe/r;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Lmf/X;->u(LSe/r;)Lqf/S;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-object v2
.end method

.method public O0()Lof/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/S;->m:Lof/a;

    .line 2
    .line 3
    return-object v0
.end method

.method protected P0(Lqf/S;)Ljava/lang/Void;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "There should be no cycles for deserialized type parameters, but found for: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public bridge synthetic getAnnotations()Lze/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lof/S;->O0()Lof/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
