.class public Lof/M;
.super Lof/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final g:Lye/N;

.field private final h:Ljava/lang/String;

.field private final i:LXe/c;


# direct methods
.method public constructor <init>(Lye/N;LSe/m;LUe/d;LUe/a;Lof/s;Lmf/n;Ljava/lang/String;Lie/a;)V
    .locals 9

    .line 1
    move-object/from16 v7, p7

    .line 2
    .line 3
    const-string v0, "packageDescriptor"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "proto"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "nameResolver"

    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "metadataVersion"

    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "components"

    .line 24
    .line 25
    move-object v3, p6

    .line 26
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "debugName"

    .line 30
    .line 31
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "classNames"

    .line 35
    .line 36
    move-object/from16 v8, p8

    .line 37
    .line 38
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v3, LUe/h;

    .line 42
    .line 43
    invoke-virtual {p2}, LSe/m;->W()LSe/u;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v4, "getTypeTable(...)"

    .line 48
    .line 49
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v0}, LUe/h;-><init>(LSe/u;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, LUe/i;->b:LUe/i$a;

    .line 56
    .line 57
    invoke-virtual {p2}, LSe/m;->X()LSe/x;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v6, "getVersionRequirementTable(...)"

    .line 62
    .line 63
    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4}, LUe/i$a;->a(LSe/x;)LUe/i;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    move-object v1, p1

    .line 71
    move-object v2, p3

    .line 72
    move-object v5, p4

    .line 73
    move-object v6, p5

    .line 74
    move-object v0, p6

    .line 75
    invoke-virtual/range {v0 .. v6}, Lmf/n;->a(Lye/N;LUe/d;LUe/h;LUe/i;LUe/a;Lof/s;)Lmf/p;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p2}, LSe/m;->P()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v1, "getFunctionList(...)"

    .line 84
    .line 85
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, LSe/m;->S()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const-string v1, "getPropertyList(...)"

    .line 93
    .line 94
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, LSe/m;->V()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const-string v1, "getTypeAliasList(...)"

    .line 102
    .line 103
    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move-object v1, v0

    .line 107
    move-object v5, v8

    .line 108
    move-object v0, p0

    .line 109
    invoke-direct/range {v0 .. v5}, Lof/w;-><init>(Lmf/p;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lie/a;)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Lof/M;->g:Lye/N;

    .line 113
    .line 114
    iput-object v7, p0, Lof/M;->h:Ljava/lang/String;

    .line 115
    .line 116
    invoke-interface {p1}, Lye/N;->f()LXe/c;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, Lof/M;->i:LXe/c;

    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public B(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 3

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LGe/d;->m:LGe/d;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0}, Lof/w;->m(Ljf/d;Lkotlin/jvm/functions/Function1;LGe/b;)Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lof/w;->s()Lmf/p;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lmf/p;->c()Lmf/n;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Lmf/n;->l()Ljava/lang/Iterable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LAe/b;

    .line 49
    .line 50
    iget-object v2, p0, Lof/M;->i:LXe/c;

    .line 51
    .line 52
    invoke-interface {v1, v2}, LAe/b;->c(LXe/c;)Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-static {v0, v1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {p1, v0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
.end method

.method public C(LXe/f;LGe/b;)V
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lof/w;->s()Lmf/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lmf/n;->p()LGe/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lof/M;->g:Lye/N;

    .line 24
    .line 25
    invoke-static {v0, p2, v1, p1}, LFe/a;->b(LGe/c;LGe/b;Lye/N;LXe/f;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public e(LXe/f;LGe/b;)Lye/h;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lof/M;->C(LXe/f;LGe/b;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Lof/w;->e(LXe/f;LGe/b;)Lye/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public bridge synthetic g(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lof/M;->B(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected j(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected p(LXe/f;)LXe/b;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LXe/b;

    .line 7
    .line 8
    iget-object v1, p0, Lof/M;->i:LXe/c;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/M;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected v()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected w()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected x()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected z(LXe/f;)Z
    .locals 3

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lof/w;->z(LXe/f;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Lof/w;->s()Lmf/p;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lmf/n;->l()Ljava/lang/Iterable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Ljava/util/Collection;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, LAe/b;

    .line 53
    .line 54
    iget-object v2, p0, Lof/M;->i:LXe/c;

    .line 55
    .line 56
    invoke-interface {v1, v2, p1}, LAe/b;->b(LXe/c;LXe/f;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 64
    return p1

    .line 65
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 66
    return p1
.end method
