.class final Landroidx/compose/ui/platform/c1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:J

.field private b:J

.field private c:LY0/L;

.field private d:LY0/H;

.field private e:LY0/I;

.field private f:LY0/u;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:Lg1/a;

.field private j:Lg1/q;

.field private k:Lc1/e;

.field private l:J

.field private m:Lg1/k;

.field private n:Ls0/C1;


# direct methods
.method private constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->a:J

    .line 4
    iput-wide p3, p0, Landroidx/compose/ui/platform/c1;->b:J

    .line 5
    iput-object p5, p0, Landroidx/compose/ui/platform/c1;->c:LY0/L;

    .line 6
    iput-object p6, p0, Landroidx/compose/ui/platform/c1;->d:LY0/H;

    .line 7
    iput-object p7, p0, Landroidx/compose/ui/platform/c1;->e:LY0/I;

    .line 8
    iput-object p8, p0, Landroidx/compose/ui/platform/c1;->f:LY0/u;

    .line 9
    iput-object p9, p0, Landroidx/compose/ui/platform/c1;->g:Ljava/lang/String;

    .line 10
    iput-wide p10, p0, Landroidx/compose/ui/platform/c1;->h:J

    .line 11
    iput-object p12, p0, Landroidx/compose/ui/platform/c1;->i:Lg1/a;

    .line 12
    iput-object p13, p0, Landroidx/compose/ui/platform/c1;->j:Lg1/q;

    .line 13
    iput-object p14, p0, Landroidx/compose/ui/platform/c1;->k:Lc1/e;

    move-wide p1, p15

    .line 14
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->l:J

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->m:Lg1/k;

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->n:Ls0/C1;

    return-void
.end method

.method public synthetic constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v1}, Ls0/r0$a;->j()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 18
    sget-object v3, Li1/v;->b:Li1/v$a;

    invoke-virtual {v3}, Li1/v$a;->a()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 19
    sget-object v11, Li1/v;->b:Li1/v$a;

    invoke-virtual {v11}, Li1/v$a;->a()J

    move-result-wide v11

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    and-int/lit16 v6, v0, 0x800

    if-eqz v6, :cond_b

    .line 20
    sget-object v6, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v6}, Ls0/r0$a;->j()J

    move-result-wide v16

    goto :goto_b

    :cond_b
    move-wide/from16 v16, p15

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v6, p17

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v0, p18

    :goto_d
    const/16 v18, 0x0

    move-object/from16 p1, p0

    move-object/from16 p19, v0

    move-wide/from16 p2, v1

    move-wide/from16 p4, v3

    move-object/from16 p6, v5

    move-object/from16 p18, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-wide/from16 p16, v16

    move-object/from16 p20, v18

    .line 21
    invoke-direct/range {p1 .. p20}, Landroidx/compose/ui/platform/c1;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p18}, Landroidx/compose/ui/platform/c1;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->l:J

    .line 2
    .line 3
    return-void
.end method

.method public final b(Lg1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->i:Lg1/a;

    .line 2
    .line 3
    return-void
.end method

.method public final c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final e(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->b:J

    .line 2
    .line 3
    return-void
.end method

.method public final f(LY0/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->d:LY0/H;

    .line 2
    .line 3
    return-void
.end method

.method public final g(LY0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->e:LY0/I;

    .line 2
    .line 3
    return-void
.end method

.method public final h(LY0/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->c:LY0/L;

    .line 2
    .line 3
    return-void
.end method

.method public final i(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/c1;->h:J

    .line 2
    .line 3
    return-void
.end method

.method public final j(Ls0/C1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->n:Ls0/C1;

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lg1/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->m:Lg1/k;

    .line 2
    .line 3
    return-void
.end method

.method public final l(Lg1/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/c1;->j:Lg1/q;

    .line 2
    .line 3
    return-void
.end method

.method public final m()LU0/I0;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LU0/I0;

    .line 4
    .line 5
    iget-wide v2, v0, Landroidx/compose/ui/platform/c1;->a:J

    .line 6
    .line 7
    iget-wide v4, v0, Landroidx/compose/ui/platform/c1;->b:J

    .line 8
    .line 9
    iget-object v6, v0, Landroidx/compose/ui/platform/c1;->c:LY0/L;

    .line 10
    .line 11
    iget-object v7, v0, Landroidx/compose/ui/platform/c1;->d:LY0/H;

    .line 12
    .line 13
    iget-object v8, v0, Landroidx/compose/ui/platform/c1;->e:LY0/I;

    .line 14
    .line 15
    iget-object v9, v0, Landroidx/compose/ui/platform/c1;->f:LY0/u;

    .line 16
    .line 17
    iget-object v10, v0, Landroidx/compose/ui/platform/c1;->g:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v11, v0, Landroidx/compose/ui/platform/c1;->h:J

    .line 20
    .line 21
    iget-object v13, v0, Landroidx/compose/ui/platform/c1;->i:Lg1/a;

    .line 22
    .line 23
    iget-object v14, v0, Landroidx/compose/ui/platform/c1;->j:Lg1/q;

    .line 24
    .line 25
    iget-object v15, v0, Landroidx/compose/ui/platform/c1;->k:Lc1/e;

    .line 26
    .line 27
    move-object/from16 v16, v1

    .line 28
    .line 29
    move-wide/from16 v17, v2

    .line 30
    .line 31
    iget-wide v1, v0, Landroidx/compose/ui/platform/c1;->l:J

    .line 32
    .line 33
    iget-object v3, v0, Landroidx/compose/ui/platform/c1;->m:Lg1/k;

    .line 34
    .line 35
    move-wide/from16 v19, v1

    .line 36
    .line 37
    iget-object v1, v0, Landroidx/compose/ui/platform/c1;->n:Ls0/C1;

    .line 38
    .line 39
    const v22, 0xc000

    .line 40
    .line 41
    .line 42
    const/16 v23, 0x0

    .line 43
    .line 44
    move-wide/from16 v24, v17

    .line 45
    .line 46
    move-object/from16 v18, v3

    .line 47
    .line 48
    move-wide/from16 v2, v24

    .line 49
    .line 50
    move-wide/from16 v24, v19

    .line 51
    .line 52
    move-object/from16 v19, v1

    .line 53
    .line 54
    move-object/from16 v1, v16

    .line 55
    .line 56
    move-wide/from16 v16, v24

    .line 57
    .line 58
    const/16 v20, 0x0

    .line 59
    .line 60
    const/16 v21, 0x0

    .line 61
    .line 62
    invoke-direct/range {v1 .. v23}, LU0/I0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method
