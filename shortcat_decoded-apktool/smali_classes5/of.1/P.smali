.class public final Lof/P;
.super LBe/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lof/t;


# instance fields
.field private final k:LSe/s;

.field private final l:LUe/d;

.field private final m:LUe/h;

.field private final n:LUe/i;

.field private final o:Lof/s;

.field private p:Lqf/d0;

.field private q:Lqf/d0;

.field private r:Ljava/util/List;

.field private s:Lqf/d0;


# direct methods
.method public constructor <init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lye/u;LSe/s;LUe/d;LUe/h;LUe/i;Lof/s;)V
    .locals 11

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    move-object/from16 v8, p7

    .line 4
    .line 5
    move-object/from16 v9, p8

    .line 6
    .line 7
    move-object/from16 v10, p9

    .line 8
    .line 9
    const-string v0, "storageManager"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "containingDeclaration"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "annotations"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "name"

    .line 25
    .line 26
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "visibility"

    .line 30
    .line 31
    move-object/from16 v6, p5

    .line 32
    .line 33
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "proto"

    .line 37
    .line 38
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "nameResolver"

    .line 42
    .line 43
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "typeTable"

    .line 47
    .line 48
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "versionRequirementTable"

    .line 52
    .line 53
    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v5, Lye/h0;->a:Lye/h0;

    .line 57
    .line 58
    const-string v0, "NO_SOURCE"

    .line 59
    .line 60
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v0, p0

    .line 64
    move-object v1, p1

    .line 65
    move-object v2, p2

    .line 66
    move-object v3, p3

    .line 67
    move-object v4, p4

    .line 68
    invoke-direct/range {v0 .. v6}, LBe/g;-><init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lye/h0;Lye/u;)V

    .line 69
    .line 70
    .line 71
    iput-object v7, p0, Lof/P;->k:LSe/s;

    .line 72
    .line 73
    iput-object v8, p0, Lof/P;->l:LUe/d;

    .line 74
    .line 75
    iput-object v9, p0, Lof/P;->m:LUe/h;

    .line 76
    .line 77
    iput-object v10, p0, Lof/P;->n:LUe/i;

    .line 78
    .line 79
    move-object/from16 v1, p10

    .line 80
    .line 81
    iput-object v1, p0, Lof/P;->o:Lof/s;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public E()LUe/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->m:LUe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public G()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->q:Lqf/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "expandedType"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public I()LUe/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->l:LUe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()Lof/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->o:Lof/s;

    .line 2
    .line 3
    return-object v0
.end method

.method protected R0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->r:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "typeConstructorParameters"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method

.method public U0()LSe/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->k:LSe/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public V0()LUe/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->n:LUe/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W0(Ljava/util/List;Lqf/d0;Lqf/d0;)V
    .locals 1

    .line 1
    const-string v0, "declaredTypeParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "underlyingType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "expandedType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, LBe/g;->S0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lof/P;->p:Lqf/d0;

    .line 20
    .line 21
    iput-object p3, p0, Lof/P;->q:Lqf/d0;

    .line 22
    .line 23
    invoke-static {p0}, Lye/q0;->g(Lye/i;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lof/P;->r:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {p0}, LBe/g;->M0()Lqf/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lof/P;->s:Lqf/d0;

    .line 34
    .line 35
    return-void
.end method

.method public X0(Lqf/G0;)Lye/l0;
    .locals 12

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/G0;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v1, Lof/P;

    .line 14
    .line 15
    invoke-virtual {p0}, LBe/g;->M()Lpf/n;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, LBe/n;->b()Lye/m;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v0, "getContainingDeclaration(...)"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lze/b;->getAnnotations()Lze/h;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v0, "<get-annotations>(...)"

    .line 33
    .line 34
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, LBe/m;->getName()LXe/f;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v0, "getName(...)"

    .line 42
    .line 43
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LBe/g;->getVisibility()Lye/u;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p0}, Lof/P;->U0()LSe/s;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {p0}, Lof/P;->I()LUe/d;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {p0}, Lof/P;->E()LUe/h;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {p0}, Lof/P;->V0()LUe/i;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {p0}, Lof/P;->J()Lof/s;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-direct/range {v1 .. v11}, Lof/P;-><init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lye/u;LSe/s;LUe/d;LUe/h;LUe/i;Lof/s;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, LBe/g;->q()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, Lof/P;->u0()Lqf/d0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v3, Lqf/N0;->e:Lqf/N0;

    .line 82
    .line 83
    invoke-virtual {p1, v2, v3}, Lqf/G0;->n(Lqf/S;Lqf/N0;)Lqf/S;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v4, "safeSubstitute(...)"

    .line 88
    .line 89
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lqf/F0;->a(Lqf/S;)Lqf/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {p0}, Lof/P;->G()Lqf/d0;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5, v3}, Lqf/G0;->n(Lqf/S;Lqf/N0;)Lqf/S;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lqf/F0;->a(Lqf/S;)Lqf/d0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v1, v0, v2, p1}, Lof/P;->W0(Ljava/util/List;Lqf/d0;Lqf/d0;)V

    .line 112
    .line 113
    .line 114
    return-object v1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lof/P;->X0(Lqf/G0;)Lye/l0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic h0()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lof/P;->U0()LSe/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public p()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->s:Lqf/d0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "defaultTypeImpl"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method

.method public u()Lye/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lof/P;->G()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lqf/W;->a(Lqf/S;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lof/P;->G()Lqf/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lqf/v0;->p()Lye/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v2, v0, Lye/e;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    check-cast v0, Lye/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
.end method

.method public u0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/P;->p:Lqf/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "underlyingType"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method
