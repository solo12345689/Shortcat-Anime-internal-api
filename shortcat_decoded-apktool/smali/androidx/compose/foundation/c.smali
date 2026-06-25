.class final Landroidx/compose/foundation/c;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/t;
.implements LK0/j0;


# instance fields
.field private a:J

.field private b:Ls0/h0;

.field private c:F

.field private d:Ls0/E1;

.field private e:J

.field private f:Li1/t;

.field private g:Ls0/i1;

.field private h:Ls0/E1;


# direct methods
.method private constructor <init>(JLs0/h0;FLs0/E1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-wide p1, p0, Landroidx/compose/foundation/c;->a:J

    .line 4
    iput-object p3, p0, Landroidx/compose/foundation/c;->b:Ls0/h0;

    .line 5
    iput p4, p0, Landroidx/compose/foundation/c;->c:F

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 7
    sget-object p1, Lr0/l;->b:Lr0/l$a;

    invoke-virtual {p1}, Lr0/l$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/c;->e:J

    return-void
.end method

.method public synthetic constructor <init>(JLs0/h0;FLs0/E1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/c;-><init>(JLs0/h0;FLs0/E1;)V

    return-void
.end method

.method private final E1(Lu0/c;)V
    .locals 10

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->G1(Lu0/c;)Ls0/i1;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/c;->a:J

    .line 6
    .line 7
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls0/r0$a;->j()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-wide v2, p0, Landroidx/compose/foundation/c;->a:J

    .line 20
    .line 21
    const/16 v8, 0x3c

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    move-object v0, p1

    .line 29
    invoke-static/range {v0 .. v9}, Ls0/j1;->e(Lu0/f;Ls0/i1;JFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, p1

    .line 34
    :goto_0
    iget-object v2, p0, Landroidx/compose/foundation/c;->b:Ls0/h0;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget v3, p0, Landroidx/compose/foundation/c;->c:F

    .line 39
    .line 40
    const/16 v7, 0x38

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static/range {v0 .. v8}, Ls0/j1;->c(Lu0/f;Ls0/i1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method private final F1(Lu0/c;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Landroidx/compose/foundation/c;->a:J

    .line 4
    .line 5
    sget-object v3, Ls0/r0;->b:Ls0/r0$a;

    .line 6
    .line 7
    invoke-virtual {v3}, Ls0/r0$a;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-static {v1, v2, v3, v4}, Ls0/r0;->s(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-wide v3, v0, Landroidx/compose/foundation/c;->a:J

    .line 18
    .line 19
    const/16 v13, 0x7e

    .line 20
    .line 21
    const/4 v14, 0x0

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    move-object/from16 v2, p1

    .line 31
    .line 32
    invoke-static/range {v2 .. v14}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, v0, Landroidx/compose/foundation/c;->b:Ls0/h0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget v2, v0, Landroidx/compose/foundation/c;->c:F

    .line 40
    .line 41
    const/16 v25, 0x76

    .line 42
    .line 43
    const/16 v26, 0x0

    .line 44
    .line 45
    const-wide/16 v17, 0x0

    .line 46
    .line 47
    const-wide/16 v19, 0x0

    .line 48
    .line 49
    const/16 v22, 0x0

    .line 50
    .line 51
    const/16 v23, 0x0

    .line 52
    .line 53
    const/16 v24, 0x0

    .line 54
    .line 55
    move-object/from16 v15, p1

    .line 56
    .line 57
    move-object/from16 v16, v1

    .line 58
    .line 59
    move/from16 v21, v2

    .line 60
    .line 61
    invoke-static/range {v15 .. v26}, Lu0/f;->P(Lu0/f;Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method private final G1(Lu0/c;)Ls0/i1;
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lu0/f;->f()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iget-wide v3, p0, Landroidx/compose/foundation/c;->e:J

    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4}, Lr0/l;->f(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lu0/f;->getLayoutDirection()Li1/t;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/c;->f:Li1/t;

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/foundation/c;->h:Ls0/E1;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/c;->g:Ls0/i1;

    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v1, Landroidx/compose/foundation/c$a;

    .line 45
    .line 46
    invoke-direct {v1, v0, p0, p1}, Landroidx/compose/foundation/c$a;-><init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/c;Lu0/c;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v1}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Ls0/i1;

    .line 55
    .line 56
    iput-object v1, p0, Landroidx/compose/foundation/c;->g:Ls0/i1;

    .line 57
    .line 58
    invoke-interface {p1}, Lu0/f;->f()J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    iput-wide v1, p0, Landroidx/compose/foundation/c;->e:J

    .line 63
    .line 64
    invoke-interface {p1}, Lu0/f;->getLayoutDirection()Li1/t;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Landroidx/compose/foundation/c;->f:Li1/t;

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 71
    .line 72
    iput-object p1, p0, Landroidx/compose/foundation/c;->h:Ls0/E1;

    .line 73
    .line 74
    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    check-cast p1, Ls0/i1;

    .line 80
    .line 81
    return-object p1
.end method


# virtual methods
.method public final H1()Ls0/E1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I1(Ls0/h0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/c;->b:Ls0/h0;

    .line 2
    .line 3
    return-void
.end method

.method public final J1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/foundation/c;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public draw(Lu0/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 2
    .line 3
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->F1(Lu0/c;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->E1(Lu0/c;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {p1}, Lu0/c;->B1()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/c;->c:F

    .line 2
    .line 3
    return-void
.end method

.method public q0()V
    .locals 2

    .line 1
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr0/l$a;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Landroidx/compose/foundation/c;->e:J

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroidx/compose/foundation/c;->f:Li1/t;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/foundation/c;->g:Ls0/i1;

    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/foundation/c;->h:Ls0/E1;

    .line 15
    .line 16
    invoke-static {p0}, LK0/u;->a(LK0/t;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final s1(Ls0/E1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/c;->d:Ls0/E1;

    .line 2
    .line 3
    return-void
.end method
