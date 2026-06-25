.class public final LU0/I0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU0/e$a;


# instance fields
.field private final a:Lg1/p;

.field private final b:J

.field private final c:LY0/L;

.field private final d:LY0/H;

.field private final e:LY0/I;

.field private final f:LY0/u;

.field private final g:Ljava/lang/String;

.field private final h:J

.field private final i:Lg1/a;

.field private final j:Lg1/q;

.field private final k:Lc1/e;

.field private final l:J

.field private final m:Lg1/k;

.field private final n:Ls0/C1;

.field private final o:LU0/F;

.field private final p:Lu0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V
    .locals 22

    .line 26
    sget-object v0, Lg1/p;->a:Lg1/p$a;

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Lg1/p$a;->b(J)Lg1/p;

    move-result-object v2

    const/16 v21, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-wide/from16 v15, p15

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    .line 27
    invoke-direct/range {v1 .. v21}, LU0/I0;-><init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 21
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v1}, Ls0/r0$a;->j()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 22
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

    .line 23
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

    .line 24
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
    move-wide/from16 v18, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v1, p18

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v2, p19

    :goto_e
    const v20, 0x8000

    and-int v0, v0, v20

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v0, p20

    :goto_f
    const/16 v20, 0x0

    move-object/from16 p1, p0

    move-object/from16 p21, v0

    move-object/from16 p19, v1

    move-object/from16 p20, v2

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

    move-wide/from16 p2, v18

    move-object/from16 p22, v20

    .line 25
    invoke-direct/range {p1 .. p22}, LU0/I0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p20}, LU0/I0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V

    return-void
.end method

.method private constructor <init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LU0/I0;->a:Lg1/p;

    .line 6
    iput-wide p2, p0, LU0/I0;->b:J

    .line 7
    iput-object p4, p0, LU0/I0;->c:LY0/L;

    .line 8
    iput-object p5, p0, LU0/I0;->d:LY0/H;

    .line 9
    iput-object p6, p0, LU0/I0;->e:LY0/I;

    .line 10
    iput-object p7, p0, LU0/I0;->f:LY0/u;

    .line 11
    iput-object p8, p0, LU0/I0;->g:Ljava/lang/String;

    .line 12
    iput-wide p9, p0, LU0/I0;->h:J

    .line 13
    iput-object p11, p0, LU0/I0;->i:Lg1/a;

    .line 14
    iput-object p12, p0, LU0/I0;->j:Lg1/q;

    .line 15
    iput-object p13, p0, LU0/I0;->k:Lc1/e;

    .line 16
    iput-wide p14, p0, LU0/I0;->l:J

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, LU0/I0;->m:Lg1/k;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, LU0/I0;->n:Ls0/C1;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, LU0/I0;->o:LU0/F;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, LU0/I0;->p:Lu0/g;

    return-void
.end method

.method public synthetic constructor <init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p19}, LU0/I0;-><init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V

    return-void
.end method

.method private constructor <init>(Ls0/h0;FJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V
    .locals 22

    .line 28
    sget-object v0, Lg1/p;->a:Lg1/p$a;

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lg1/p$a;->a(Ls0/h0;F)Lg1/p;

    move-result-object v2

    const/16 v21, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-wide/from16 v15, p15

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    .line 29
    invoke-direct/range {v1 .. v21}, LU0/I0;-><init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ls0/h0;FJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p20}, LU0/I0;-><init>(Ls0/h0;FJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)V

    return-void
.end method

.method public static synthetic b(LU0/I0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;ILjava/lang/Object;)LU0/I0;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    invoke-virtual {v0}, LU0/I0;->g()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    .line 2
    iget-wide v4, v0, LU0/I0;->b:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    .line 3
    iget-object v6, v0, LU0/I0;->c:LY0/L;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    .line 4
    iget-object v7, v0, LU0/I0;->d:LY0/H;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    .line 5
    iget-object v8, v0, LU0/I0;->e:LY0/I;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    .line 6
    iget-object v9, v0, LU0/I0;->f:LY0/u;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    .line 7
    iget-object v10, v0, LU0/I0;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    .line 8
    iget-wide v11, v0, LU0/I0;->h:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    .line 9
    iget-object v13, v0, LU0/I0;->i:Lg1/a;

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    .line 10
    iget-object v14, v0, LU0/I0;->j:Lg1/q;

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    .line 11
    iget-object v15, v0, LU0/I0;->k:Lc1/e;

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    .line 12
    iget-wide v2, v0, LU0/I0;->l:J

    goto :goto_b

    :cond_b
    move-wide/from16 v2, p15

    :goto_b
    move-wide/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    .line 13
    iget-object v2, v0, LU0/I0;->m:Lg1/k;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p17

    :goto_c
    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    .line 14
    iget-object v3, v0, LU0/I0;->n:Ls0/C1;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p18

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    .line 15
    iget-object v2, v0, LU0/I0;->o:LU0/F;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p19

    :goto_e
    const v18, 0x8000

    and-int v1, v1, v18

    if-eqz v1, :cond_f

    .line 16
    iget-object v1, v0, LU0/I0;->p:Lu0/g;

    move-object/from16 p21, v1

    :goto_f
    move-wide/from16 p16, p1

    move-object/from16 p18, p3

    move-object/from16 p1, v0

    move-object/from16 p20, v2

    move-object/from16 p19, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_10

    :cond_f
    move-object/from16 p21, p20

    goto :goto_f

    .line 17
    :goto_10
    invoke-virtual/range {p1 .. p21}, LU0/I0;->a(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)LU0/I0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)LU0/I0;
    .locals 21

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    new-instance v2, LU0/I0;

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, LU0/I0;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-static {v0, v1, v3, v4}, Ls0/r0;->s(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move-object/from16 v3, p0

    .line 16
    .line 17
    iget-object v0, v3, LU0/I0;->a:Lg1/p;

    .line 18
    .line 19
    :goto_0
    move-object v1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object/from16 v3, p0

    .line 22
    .line 23
    sget-object v4, Lg1/p;->a:Lg1/p$a;

    .line 24
    .line 25
    invoke-virtual {v4, v0, v1}, Lg1/p$a;->b(J)Lg1/p;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v20, 0x0

    .line 31
    .line 32
    move-object/from16 v4, p5

    .line 33
    .line 34
    move-object/from16 v5, p6

    .line 35
    .line 36
    move-object/from16 v6, p7

    .line 37
    .line 38
    move-object/from16 v7, p8

    .line 39
    .line 40
    move-object/from16 v8, p9

    .line 41
    .line 42
    move-wide/from16 v9, p10

    .line 43
    .line 44
    move-object/from16 v11, p12

    .line 45
    .line 46
    move-object/from16 v12, p13

    .line 47
    .line 48
    move-object/from16 v13, p14

    .line 49
    .line 50
    move-wide/from16 v14, p15

    .line 51
    .line 52
    move-object/from16 v16, p17

    .line 53
    .line 54
    move-object/from16 v17, p18

    .line 55
    .line 56
    move-object/from16 v18, p19

    .line 57
    .line 58
    move-object/from16 v19, p20

    .line 59
    .line 60
    move-object v0, v2

    .line 61
    move-wide/from16 v2, p3

    .line 62
    .line 63
    invoke-direct/range {v0 .. v20}, LU0/I0;-><init>(Lg1/p;JLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->a:Lg1/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lg1/p;->a()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU0/I0;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()Lg1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->i:Lg1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LU0/I0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LU0/I0;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LU0/I0;->v(LU0/I0;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, LU0/I0;->w(LU0/I0;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v2
.end method

.method public final f()Ls0/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->a:Lg1/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lg1/p;->i()Ls0/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-object v0, p0, LU0/I0;->a:Lg1/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lg1/p;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final h()Lu0/g;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->p:Lu0/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    invoke-virtual {p0}, LU0/I0;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ls0/r0;->y(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    invoke-virtual {p0}, LU0/I0;->f()Ls0/h0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    invoke-virtual {p0}, LU0/I0;->c()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    mul-int/lit8 v0, v0, 0x1f

    .line 37
    .line 38
    iget-wide v3, p0, LU0/I0;->b:J

    .line 39
    .line 40
    invoke-static {v3, v4}, Li1/v;->i(J)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, LU0/I0;->c:LY0/L;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, LY0/L;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v1, v2

    .line 57
    :goto_1
    add-int/2addr v0, v1

    .line 58
    mul-int/lit8 v0, v0, 0x1f

    .line 59
    .line 60
    iget-object v1, p0, LU0/I0;->d:LY0/H;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v1}, LY0/H;->i()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v1}, LY0/H;->g(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v1, v2

    .line 74
    :goto_2
    add-int/2addr v0, v1

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    .line 77
    iget-object v1, p0, LU0/I0;->e:LY0/I;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-virtual {v1}, LY0/I;->m()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1}, LY0/I;->i(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move v1, v2

    .line 91
    :goto_3
    add-int/2addr v0, v1

    .line 92
    mul-int/lit8 v0, v0, 0x1f

    .line 93
    .line 94
    iget-object v1, p0, LU0/I0;->f:LY0/u;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move v1, v2

    .line 104
    :goto_4
    add-int/2addr v0, v1

    .line 105
    mul-int/lit8 v0, v0, 0x1f

    .line 106
    .line 107
    iget-object v1, p0, LU0/I0;->g:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    goto :goto_5

    .line 116
    :cond_5
    move v1, v2

    .line 117
    :goto_5
    add-int/2addr v0, v1

    .line 118
    mul-int/lit8 v0, v0, 0x1f

    .line 119
    .line 120
    iget-wide v3, p0, LU0/I0;->h:J

    .line 121
    .line 122
    invoke-static {v3, v4}, Li1/v;->i(J)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    add-int/2addr v0, v1

    .line 127
    mul-int/lit8 v0, v0, 0x1f

    .line 128
    .line 129
    iget-object v1, p0, LU0/I0;->i:Lg1/a;

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    invoke-virtual {v1}, Lg1/a;->h()F

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-static {v1}, Lg1/a;->f(F)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    goto :goto_6

    .line 142
    :cond_6
    move v1, v2

    .line 143
    :goto_6
    add-int/2addr v0, v1

    .line 144
    mul-int/lit8 v0, v0, 0x1f

    .line 145
    .line 146
    iget-object v1, p0, LU0/I0;->j:Lg1/q;

    .line 147
    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    invoke-virtual {v1}, Lg1/q;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    goto :goto_7

    .line 155
    :cond_7
    move v1, v2

    .line 156
    :goto_7
    add-int/2addr v0, v1

    .line 157
    mul-int/lit8 v0, v0, 0x1f

    .line 158
    .line 159
    iget-object v1, p0, LU0/I0;->k:Lc1/e;

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v1}, Lc1/e;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    goto :goto_8

    .line 168
    :cond_8
    move v1, v2

    .line 169
    :goto_8
    add-int/2addr v0, v1

    .line 170
    mul-int/lit8 v0, v0, 0x1f

    .line 171
    .line 172
    iget-wide v3, p0, LU0/I0;->l:J

    .line 173
    .line 174
    invoke-static {v3, v4}, Ls0/r0;->y(J)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    add-int/2addr v0, v1

    .line 179
    mul-int/lit8 v0, v0, 0x1f

    .line 180
    .line 181
    iget-object v1, p0, LU0/I0;->m:Lg1/k;

    .line 182
    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    invoke-virtual {v1}, Lg1/k;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    goto :goto_9

    .line 190
    :cond_9
    move v1, v2

    .line 191
    :goto_9
    add-int/2addr v0, v1

    .line 192
    mul-int/lit8 v0, v0, 0x1f

    .line 193
    .line 194
    iget-object v1, p0, LU0/I0;->n:Ls0/C1;

    .line 195
    .line 196
    if-eqz v1, :cond_a

    .line 197
    .line 198
    invoke-virtual {v1}, Ls0/C1;->hashCode()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    goto :goto_a

    .line 203
    :cond_a
    move v1, v2

    .line 204
    :goto_a
    add-int/2addr v0, v1

    .line 205
    mul-int/lit8 v0, v0, 0x1f

    .line 206
    .line 207
    iget-object v1, p0, LU0/I0;->o:LU0/F;

    .line 208
    .line 209
    if-eqz v1, :cond_b

    .line 210
    .line 211
    invoke-virtual {v1}, LU0/F;->hashCode()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    goto :goto_b

    .line 216
    :cond_b
    move v1, v2

    .line 217
    :goto_b
    add-int/2addr v0, v1

    .line 218
    mul-int/lit8 v0, v0, 0x1f

    .line 219
    .line 220
    iget-object v1, p0, LU0/I0;->p:Lu0/g;

    .line 221
    .line 222
    if-eqz v1, :cond_c

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    :cond_c
    add-int/2addr v0, v2

    .line 229
    return v0
.end method

.method public final i()LY0/u;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->f:LY0/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU0/I0;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final l()LY0/H;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->d:LY0/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()LY0/I;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->e:LY0/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LY0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->c:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU0/I0;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final p()Lc1/e;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->k:Lc1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()LU0/F;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->o:LU0/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ls0/C1;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->n:Ls0/C1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lg1/k;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->m:Lg1/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Lg1/p;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->a:Lg1/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SpanStyle(color="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LU0/I0;->g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {v1, v2}, Ls0/r0;->z(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", brush="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, LU0/I0;->f()Ls0/h0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", alpha="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, LU0/I0;->c()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", fontSize="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-wide v1, p0, LU0/I0;->b:J

    .line 52
    .line 53
    invoke-static {v1, v2}, Li1/v;->j(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", fontWeight="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, LU0/I0;->c:LY0/L;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", fontStyle="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, LU0/I0;->d:LY0/H;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", fontSynthesis="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, LU0/I0;->e:LY0/I;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", fontFamily="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, LU0/I0;->f:LY0/u;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", fontFeatureSettings="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, LU0/I0;->g:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", letterSpacing="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-wide v1, p0, LU0/I0;->h:J

    .line 116
    .line 117
    invoke-static {v1, v2}, Li1/v;->j(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", baselineShift="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, LU0/I0;->i:Lg1/a;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", textGeometricTransform="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, LU0/I0;->j:Lg1/q;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", localeList="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, LU0/I0;->k:Lc1/e;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", background="

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-wide v1, p0, LU0/I0;->l:J

    .line 160
    .line 161
    invoke-static {v1, v2}, Ls0/r0;->z(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v1, ", textDecoration="

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, LU0/I0;->m:Lg1/k;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, ", shadow="

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, LU0/I0;->n:Ls0/C1;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v1, ", platformStyle="

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, LU0/I0;->o:LU0/F;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v1, ", drawStyle="

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget-object v1, p0, LU0/I0;->p:Lu0/g;

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const/16 v1, 0x29

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0
.end method

.method public final u()Lg1/q;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/I0;->j:Lg1/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(LU0/I0;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-wide v1, p0, LU0/I0;->b:J

    .line 6
    .line 7
    iget-wide v3, p1, LU0/I0;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2, v3, v4}, Li1/v;->e(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    return v2

    .line 17
    :cond_1
    iget-object v1, p0, LU0/I0;->c:LY0/L;

    .line 18
    .line 19
    iget-object v3, p1, LU0/I0;->c:LY0/L;

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    iget-object v1, p0, LU0/I0;->d:LY0/H;

    .line 29
    .line 30
    iget-object v3, p1, LU0/I0;->d:LY0/H;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget-object v1, p0, LU0/I0;->e:LY0/I;

    .line 40
    .line 41
    iget-object v3, p1, LU0/I0;->e:LY0/I;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    iget-object v1, p0, LU0/I0;->f:LY0/u;

    .line 51
    .line 52
    iget-object v3, p1, LU0/I0;->f:LY0/u;

    .line 53
    .line 54
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_5

    .line 59
    .line 60
    return v2

    .line 61
    :cond_5
    iget-object v1, p0, LU0/I0;->g:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, p1, LU0/I0;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_6

    .line 70
    .line 71
    return v2

    .line 72
    :cond_6
    iget-wide v3, p0, LU0/I0;->h:J

    .line 73
    .line 74
    iget-wide v5, p1, LU0/I0;->h:J

    .line 75
    .line 76
    invoke-static {v3, v4, v5, v6}, Li1/v;->e(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_7

    .line 81
    .line 82
    return v2

    .line 83
    :cond_7
    iget-object v1, p0, LU0/I0;->i:Lg1/a;

    .line 84
    .line 85
    iget-object v3, p1, LU0/I0;->i:Lg1/a;

    .line 86
    .line 87
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    return v2

    .line 94
    :cond_8
    iget-object v1, p0, LU0/I0;->j:Lg1/q;

    .line 95
    .line 96
    iget-object v3, p1, LU0/I0;->j:Lg1/q;

    .line 97
    .line 98
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_9

    .line 103
    .line 104
    return v2

    .line 105
    :cond_9
    iget-object v1, p0, LU0/I0;->k:Lc1/e;

    .line 106
    .line 107
    iget-object v3, p1, LU0/I0;->k:Lc1/e;

    .line 108
    .line 109
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_a

    .line 114
    .line 115
    return v2

    .line 116
    :cond_a
    iget-wide v3, p0, LU0/I0;->l:J

    .line 117
    .line 118
    iget-wide v5, p1, LU0/I0;->l:J

    .line 119
    .line 120
    invoke-static {v3, v4, v5, v6}, Ls0/r0;->s(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_b

    .line 125
    .line 126
    return v2

    .line 127
    :cond_b
    iget-object v1, p0, LU0/I0;->o:LU0/F;

    .line 128
    .line 129
    iget-object p1, p1, LU0/I0;->o:LU0/F;

    .line 130
    .line 131
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_c

    .line 136
    .line 137
    return v2

    .line 138
    :cond_c
    return v0
.end method

.method public final w(LU0/I0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LU0/I0;->a:Lg1/p;

    .line 2
    .line 3
    iget-object v1, p1, LU0/I0;->a:Lg1/p;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, LU0/I0;->m:Lg1/k;

    .line 14
    .line 15
    iget-object v2, p1, LU0/I0;->m:Lg1/k;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-object v0, p0, LU0/I0;->n:Ls0/C1;

    .line 25
    .line 26
    iget-object v2, p1, LU0/I0;->n:Ls0/C1;

    .line 27
    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    iget-object v0, p0, LU0/I0;->p:Lu0/g;

    .line 36
    .line 37
    iget-object p1, p1, LU0/I0;->p:Lu0/g;

    .line 38
    .line 39
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    const/4 p1, 0x1

    .line 47
    return p1
.end method

.method public final x(LU0/I0;)LU0/I0;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v1, v0, LU0/I0;->a:Lg1/p;

    .line 7
    .line 8
    invoke-interface {v1}, Lg1/p;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    iget-object v1, v0, LU0/I0;->a:Lg1/p;

    .line 13
    .line 14
    invoke-interface {v1}, Lg1/p;->i()Ls0/h0;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object v1, v0, LU0/I0;->a:Lg1/p;

    .line 19
    .line 20
    invoke-interface {v1}, Lg1/p;->a()F

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    iget-wide v7, v0, LU0/I0;->b:J

    .line 25
    .line 26
    iget-object v9, v0, LU0/I0;->c:LY0/L;

    .line 27
    .line 28
    iget-object v10, v0, LU0/I0;->d:LY0/H;

    .line 29
    .line 30
    iget-object v11, v0, LU0/I0;->e:LY0/I;

    .line 31
    .line 32
    iget-object v12, v0, LU0/I0;->f:LY0/u;

    .line 33
    .line 34
    iget-object v13, v0, LU0/I0;->g:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v14, v0, LU0/I0;->h:J

    .line 37
    .line 38
    iget-object v1, v0, LU0/I0;->i:Lg1/a;

    .line 39
    .line 40
    iget-object v2, v0, LU0/I0;->j:Lg1/q;

    .line 41
    .line 42
    move-object/from16 v16, v1

    .line 43
    .line 44
    iget-object v1, v0, LU0/I0;->k:Lc1/e;

    .line 45
    .line 46
    move-object/from16 v18, v1

    .line 47
    .line 48
    move-object/from16 v17, v2

    .line 49
    .line 50
    iget-wide v1, v0, LU0/I0;->l:J

    .line 51
    .line 52
    move-wide/from16 v19, v1

    .line 53
    .line 54
    iget-object v1, v0, LU0/I0;->m:Lg1/k;

    .line 55
    .line 56
    iget-object v2, v0, LU0/I0;->n:Ls0/C1;

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    iget-object v1, v0, LU0/I0;->o:LU0/F;

    .line 61
    .line 62
    iget-object v0, v0, LU0/I0;->p:Lu0/g;

    .line 63
    .line 64
    move-object/from16 v24, v0

    .line 65
    .line 66
    move-object/from16 v23, v1

    .line 67
    .line 68
    move-object/from16 v22, v2

    .line 69
    .line 70
    move-object/from16 v2, p0

    .line 71
    .line 72
    invoke-static/range {v2 .. v24}, LU0/K0;->b(LU0/I0;JLs0/h0;FJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;)LU0/I0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method

.method public final y(LU0/I0;)LU0/I0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU0/I0;->x(LU0/I0;)LU0/I0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
