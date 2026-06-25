.class public final Lof/c;
.super LBe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lof/b;


# instance fields
.field private final F:LSe/e;

.field private final G:LUe/d;

.field private final H:LUe/h;

.field private final I:LUe/i;

.field private final X:Lof/s;


# direct methods
.method public constructor <init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;LSe/e;LUe/d;LUe/h;LUe/i;Lof/s;Lye/h0;)V
    .locals 11

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p11, :cond_0

    .line 2
    sget-object v0, Lye/h0;->a:Lye/h0;

    move-object v6, v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v0, p0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    :goto_0
    invoke-direct/range {v0 .. v6}, LBe/i;-><init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;Lye/h0;)V

    .line 3
    iput-object v7, p0, Lof/c;->F:LSe/e;

    .line 4
    iput-object v8, p0, Lof/c;->G:LUe/d;

    .line 5
    iput-object v9, p0, Lof/c;->H:LUe/h;

    .line 6
    iput-object v10, p0, Lof/c;->I:LUe/i;

    move-object/from16 v1, p10

    .line 7
    iput-object v1, p0, Lof/c;->X:Lof/s;

    return-void
.end method

.method public synthetic constructor <init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;LSe/e;LUe/d;LUe/h;LUe/i;Lof/s;Lye/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v12, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    goto :goto_1

    :cond_0
    move-object/from16 v12, p11

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {v1 .. v12}, Lof/c;-><init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;LSe/e;LUe/d;LUe/h;LUe/i;Lof/s;Lye/h0;)V

    return-void
.end method


# virtual methods
.method public C()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public E()LUe/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/c;->H:LUe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public I()LUe/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/c;->G:LUe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()Lof/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/c;->X:Lof/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic L0(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/s;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lof/c;->s1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)Lof/c;

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
    invoke-virtual {p0}, Lof/c;->t1()LSe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
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

.method public isSuspend()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic o1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/i;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lof/c;->s1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)Lof/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected s1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)Lof/c;
    .locals 13

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kind"

    .line 7
    .line 8
    move-object/from16 v6, p3

    .line 9
    .line 10
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "annotations"

    .line 14
    .line 15
    move-object/from16 v4, p5

    .line 16
    .line 17
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "source"

    .line 21
    .line 22
    move-object/from16 v12, p6

    .line 23
    .line 24
    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lof/c;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Lye/e;

    .line 31
    .line 32
    move-object v3, p2

    .line 33
    check-cast v3, Lye/l;

    .line 34
    .line 35
    iget-boolean v5, p0, LBe/i;->E:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Lof/c;->t1()LSe/e;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {p0}, Lof/c;->I()LUe/d;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {p0}, Lof/c;->E()LUe/h;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-virtual {p0}, Lof/c;->u1()LUe/i;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-virtual {p0}, Lof/c;->J()Lof/s;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-direct/range {v1 .. v12}, Lof/c;-><init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;LSe/e;LUe/d;LUe/h;LUe/i;Lof/s;Lye/h0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, LBe/s;->Q0()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v1, p1}, LBe/s;->Y0(Z)V

    .line 65
    .line 66
    .line 67
    return-object v1
.end method

.method public t1()LSe/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/c;->F:LSe/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public u1()LUe/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/c;->I:LUe/i;

    .line 2
    .line 3
    return-object v0
.end method
