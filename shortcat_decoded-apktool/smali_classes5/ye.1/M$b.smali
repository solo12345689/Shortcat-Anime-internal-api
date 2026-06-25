.class public final Lye/M$b;
.super LBe/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lye/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final i:Z

.field private final j:Ljava/util/List;

.field private final k:Lqf/u;


# direct methods
.method public constructor <init>(Lpf/n;Lye/m;LXe/f;ZI)V
    .locals 9

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "container"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, Lye/h0;->a:Lye/h0;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v3, p3

    .line 23
    invoke-direct/range {v0 .. v5}, LBe/j;-><init>(Lpf/n;Lye/m;LXe/f;Lye/h0;Z)V

    .line 24
    .line 25
    .line 26
    iput-boolean p4, p0, Lye/M$b;->i:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1, p5}, Loe/j;->x(II)Loe/f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v7, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move-object v1, v8

    .line 55
    check-cast v1, LUd/O;

    .line 56
    .line 57
    invoke-virtual {v1}, LUd/O;->nextInt()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    sget-object v1, Lze/h;->k0:Lze/h$a;

    .line 62
    .line 63
    invoke-virtual {v1}, Lze/h$a;->b()Lze/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v3, Lqf/N0;->e:Lqf/N0;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const/16 v4, 0x54

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v2, 0x0

    .line 91
    move-object v0, p0

    .line 92
    move-object v6, p1

    .line 93
    invoke-static/range {v0 .. v6}, LBe/U;->R0(Lye/m;Lze/h;ZLqf/N0;LXe/f;ILpf/n;)Lye/m0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iput-object v7, p0, Lye/M$b;->j:Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, Lqf/u;

    .line 104
    .line 105
    invoke-static {p0}, Lye/q0;->g(Lye/i;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {p0}, Lff/e;->s(Lye/m;)Lye/H;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v3}, Lye/H;->n()Lve/i;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Lve/i;->i()Lqf/d0;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {v3}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Ljava/util/Collection;

    .line 126
    .line 127
    invoke-direct {v1, p0, v2, v3, p1}, Lqf/u;-><init>(Lye/e;Ljava/util/List;Ljava/util/Collection;Lpf/n;)V

    .line 128
    .line 129
    .line 130
    iput-object v1, p0, Lye/M$b;->k:Lqf/u;

    .line 131
    .line 132
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lye/M$b;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public D()Lye/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public I0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public K0()Ljf/k$b;
    .locals 1

    .line 1
    sget-object v0, Ljf/k$b;->b:Ljf/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public L0()Lqf/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/M$b;->k:Lqf/u;

    .line 2
    .line 3
    return-object v0
.end method

.method protected M0(Lrf/g;)Ljf/k$b;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Ljf/k$b;->b:Ljf/k$b;

    .line 7
    .line 8
    return-object p1
.end method

.method public V()Lye/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    sget-object v0, Lye/t;->e:Lye/u;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public h()Lye/f;
    .locals 1

    .line 1
    sget-object v0, Lye/f;->b:Lye/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Collection;

    .line 6
    .line 7
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic j0(Lrf/g;)Ljf/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lye/M$b;->M0(Lrf/g;)Ljf/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l()Lqf/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lye/M$b;->L0()Lqf/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic o0()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lye/M$b;->K0()Ljf/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public p0()Lye/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/M$b;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Lye/E;
    .locals 1

    .line 1
    sget-object v0, Lye/E;->b:Lye/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    const-string v1, "class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " (not found)"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public z()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
