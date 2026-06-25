.class public final Lsf/c;
.super LBe/O;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lye/e;)V
    .locals 17

    .line 1
    const-string v0, "containingDeclaration"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    sget-object v0, Lsf/b;->c:Lsf/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Lsf/b;->b()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LXe/f;->q(Ljava/lang/String;)LXe/f;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v6, Lye/b$a;->a:Lye/b$a;

    .line 25
    .line 26
    sget-object v7, Lye/h0;->a:Lye/h0;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move-object/from16 v1, p0

    .line 30
    .line 31
    invoke-direct/range {v1 .. v7}, LBe/O;-><init>(Lye/m;Lye/g0;Lze/h;LXe/f;Lye/b$a;Lye/h0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v12

    .line 42
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    sget-object v0, Lsf/k;->k:Lsf/k;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    new-array v1, v1, [Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    sget-object v15, Lye/E;->d:Lye/E;

    .line 56
    .line 57
    sget-object v16, Lye/t;->e:Lye/u;

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    move-object/from16 v8, p0

    .line 62
    .line 63
    invoke-virtual/range {v8 .. v16}, LBe/O;->n1(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;)LBe/O;

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public E0(Ljava/util/Collection;)V
    .locals 1

    .line 1
    const-string v0, "overriddenDescriptors"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected L0(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/s;
    .locals 0

    .line 1
    const-string p2, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "kind"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "annotations"

    .line 12
    .line 13
    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "source"

    .line 17
    .line 18
    invoke-static {p6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public isSuspend()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public k1(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/g0;
    .locals 0

    .line 1
    const-string p5, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "modality"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "visibility"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "kind"

    .line 17
    .line 18
    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public bridge synthetic l0(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/b;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lsf/c;->k1(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/g0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public n0(Lye/a$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public v()Lye/z$a;
    .locals 1

    .line 1
    new-instance v0, Lsf/c$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lsf/c$a;-><init>(Lsf/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
