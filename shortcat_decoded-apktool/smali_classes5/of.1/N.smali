.class public final Lof/N;
.super LBe/K;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lof/b;


# instance fields
.field private final C:LSe/o;

.field private final D:LUe/d;

.field private final E:LUe/h;

.field private final F:LUe/i;

.field private final G:Lof/s;


# direct methods
.method public constructor <init>(Lye/m;Lye/Z;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/b$a;ZZZZZLSe/o;LUe/d;LUe/h;LUe/i;Lof/s;)V
    .locals 16

    move-object/from16 v0, p14

    move-object/from16 v1, p15

    move-object/from16 v2, p16

    move-object/from16 v3, p17

    const-string v4, "containingDeclaration"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "annotations"

    move-object/from16 v6, p3

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "modality"

    move-object/from16 v7, p4

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "visibility"

    move-object/from16 v8, p5

    invoke-static {v8, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "name"

    move-object/from16 v9, p7

    invoke-static {v9, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "kind"

    move-object/from16 v10, p8

    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "proto"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nameResolver"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "typeTable"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "versionRequirementTable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v9, Lye/h0;->a:Lye/h0;

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v11, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v12, p13

    move-object v1, v5

    move-object v3, v6

    move-object v4, v7

    move-object v5, v8

    move-object v8, v10

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v10, p9

    .line 2
    invoke-direct/range {v0 .. v15}, LBe/K;-><init>(Lye/m;Lye/Z;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/b$a;Lye/h0;ZZZZZZ)V

    move-object/from16 v1, p14

    .line 3
    iput-object v1, v0, Lof/N;->C:LSe/o;

    move-object/from16 v1, p15

    .line 4
    iput-object v1, v0, Lof/N;->D:LUe/d;

    move-object/from16 v2, p16

    .line 5
    iput-object v2, v0, Lof/N;->E:LUe/h;

    move-object/from16 v3, p17

    .line 6
    iput-object v3, v0, Lof/N;->F:LUe/i;

    move-object/from16 v1, p18

    .line 7
    iput-object v1, v0, Lof/N;->G:Lof/s;

    return-void
.end method


# virtual methods
.method public E()LUe/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/N;->E:LUe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public I()LUe/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/N;->D:LUe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()Lof/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/N;->G:Lof/s;

    .line 2
    .line 3
    return-object v0
.end method

.method protected P0(Lye/m;Lye/E;Lye/u;Lye/Z;Lye/b$a;LXe/f;Lye/h0;)LBe/K;
    .locals 20

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "newModality"

    .line 9
    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "newVisibility"

    .line 16
    .line 17
    move-object/from16 v6, p3

    .line 18
    .line 19
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "kind"

    .line 23
    .line 24
    move-object/from16 v9, p5

    .line 25
    .line 26
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "newName"

    .line 30
    .line 31
    move-object/from16 v8, p6

    .line 32
    .line 33
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "source"

    .line 37
    .line 38
    move-object/from16 v1, p7

    .line 39
    .line 40
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lof/N;

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, Lze/b;->getAnnotations()Lze/h;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual/range {p0 .. p0}, LBe/Y;->N()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual/range {p0 .. p0}, LBe/K;->z0()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-virtual/range {p0 .. p0}, LBe/K;->d0()Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    invoke-virtual/range {p0 .. p0}, Lof/N;->isExternal()Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    invoke-virtual/range {p0 .. p0}, LBe/K;->B()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    invoke-virtual/range {p0 .. p0}, LBe/K;->m0()Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    invoke-virtual/range {p0 .. p0}, Lof/N;->f1()LSe/o;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    invoke-virtual/range {p0 .. p0}, Lof/N;->I()LUe/d;

    .line 78
    .line 79
    .line 80
    move-result-object v16

    .line 81
    invoke-virtual/range {p0 .. p0}, Lof/N;->E()LUe/h;

    .line 82
    .line 83
    .line 84
    move-result-object v17

    .line 85
    invoke-virtual/range {p0 .. p0}, Lof/N;->g1()LUe/i;

    .line 86
    .line 87
    .line 88
    move-result-object v18

    .line 89
    invoke-virtual/range {p0 .. p0}, Lof/N;->J()Lof/s;

    .line 90
    .line 91
    .line 92
    move-result-object v19

    .line 93
    move-object/from16 v3, p4

    .line 94
    .line 95
    invoke-direct/range {v1 .. v19}, Lof/N;-><init>(Lye/m;Lye/Z;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/b$a;ZZZZZLSe/o;LUe/d;LUe/h;LUe/i;Lof/s;)V

    .line 96
    .line 97
    .line 98
    return-object v1
.end method

.method public f1()LSe/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/N;->C:LSe/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public g1()LUe/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/N;->F:LUe/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic h0()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lof/N;->f1()LSe/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->E:LUe/b$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lof/N;->f1()LSe/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LSe/o;->f0()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "get(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method
