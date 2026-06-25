.class public final Landroidx/compose/ui/graphics/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/graphics/g;


# instance fields
.field private a:I

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:J

.field private i:J

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:J

.field private o:Ls0/E1;

.field private p:Z

.field private q:I

.field private r:J

.field private s:Li1/d;

.field private t:Li1/t;

.field private u:Ls0/u1;

.field private v:Landroidx/compose/ui/graphics/d;

.field private w:I

.field private x:Ls0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/compose/ui/graphics/h;->b:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/compose/ui/graphics/h;->c:F

    .line 9
    .line 10
    iput v0, p0, Landroidx/compose/ui/graphics/h;->d:F

    .line 11
    .line 12
    invoke-static {}, Ls0/a1;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iput-wide v1, p0, Landroidx/compose/ui/graphics/h;->h:J

    .line 17
    .line 18
    invoke-static {}, Ls0/a1;->a()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iput-wide v1, p0, Landroidx/compose/ui/graphics/h;->i:J

    .line 23
    .line 24
    const/high16 v1, 0x41000000    # 8.0f

    .line 25
    .line 26
    iput v1, p0, Landroidx/compose/ui/graphics/h;->m:F

    .line 27
    .line 28
    sget-object v1, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/j$a;->a()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    iput-wide v1, p0, Landroidx/compose/ui/graphics/h;->n:J

    .line 35
    .line 36
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Landroidx/compose/ui/graphics/h;->o:Ls0/E1;

    .line 41
    .line 42
    sget-object v1, Landroidx/compose/ui/graphics/e;->b:Landroidx/compose/ui/graphics/e$a;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/e$a;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, p0, Landroidx/compose/ui/graphics/h;->q:I

    .line 49
    .line 50
    sget-object v1, Lr0/l;->b:Lr0/l$a;

    .line 51
    .line 52
    invoke-virtual {v1}, Lr0/l$a;->a()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    iput-wide v1, p0, Landroidx/compose/ui/graphics/h;->r:J

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static {v0, v3, v1, v2}, Li1/f;->b(FFILjava/lang/Object;)Li1/d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 66
    .line 67
    sget-object v0, Li1/t;->a:Li1/t;

    .line 68
    .line 69
    iput-object v0, p0, Landroidx/compose/ui/graphics/h;->t:Li1/t;

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput v0, p0, Landroidx/compose/ui/graphics/h;->w:I

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public C()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public D()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public E()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public F(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->e:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->e:F

    .line 15
    .line 16
    return-void
.end method

.method public G(Ls0/u1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->u:Ls0/u1;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    const/high16 v1, 0x20000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/ui/graphics/h;->u:Ls0/u1;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public H()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final I()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->t:Li1/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final S()Ls0/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->x:Ls0/i1;

    .line 2
    .line 3
    return-object v0
.end method

.method public U()Ls0/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->u:Ls0/u1;

    .line 2
    .line 3
    return-object v0
.end method

.method public V()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public W()Ls0/E1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->o:Ls0/E1;

    .line 2
    .line 3
    return-object v0
.end method

.method public X(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->q:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/e;->g(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    const v1, 0x8000

    .line 12
    .line 13
    .line 14
    or-int/2addr v0, v1

    .line 15
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 16
    .line 17
    iput p1, p0, Landroidx/compose/ui/graphics/h;->q:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public Y()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final Z()V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->l(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->y(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->e(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->F(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->g(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->v(F)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ls0/a1;->a()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/h;->k(J)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ls0/a1;->a()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/h;->o(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->s(F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->t(F)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->w(F)V

    .line 43
    .line 44
    .line 45
    const/high16 v0, 0x41000000    # 8.0f

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->r(F)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/j$a;->a()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/h;->t0(J)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->s1(Ls0/E1;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/h;->n(Z)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {p0, v1}, Landroidx/compose/ui/graphics/h;->G(Ls0/u1;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroidx/compose/ui/graphics/h;->d(Landroidx/compose/ui/graphics/d;)V

    .line 75
    .line 76
    .line 77
    sget-object v2, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p0, v2}, Landroidx/compose/ui/graphics/h;->c(I)V

    .line 84
    .line 85
    .line 86
    sget-object v2, Landroidx/compose/ui/graphics/e;->b:Landroidx/compose/ui/graphics/e$a;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/e$a;->a()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {p0, v2}, Landroidx/compose/ui/graphics/h;->X(I)V

    .line 93
    .line 94
    .line 95
    sget-object v2, Lr0/l;->b:Lr0/l$a;

    .line 96
    .line 97
    invoke-virtual {v2}, Lr0/l$a;->a()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/graphics/h;->h0(J)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Landroidx/compose/ui/graphics/h;->x:Ls0/i1;

    .line 105
    .line 106
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 107
    .line 108
    return-void
.end method

.method public b()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public c(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->w:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    const/high16 v1, 0x80000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 15
    .line 16
    iput p1, p0, Landroidx/compose/ui/graphics/h;->w:I

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final c0(Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 2
    .line 3
    return-void
.end method

.method public d(Landroidx/compose/ui/graphics/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->v:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    const/high16 v1, 0x40000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/ui/graphics/h;->v:Landroidx/compose/ui/graphics/d;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public e(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->d:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->d:F

    .line 15
    .line 16
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final f0(Li1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/h;->t:Li1/t;

    .line 2
    .line 3
    return-void
.end method

.method public g(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->f:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->f:F

    .line 15
    .line 16
    return-void
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public h0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/graphics/h;->r:J

    .line 2
    .line 3
    return-void
.end method

.method public i()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/h;->W()Ls0/E1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/h;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, p0, Landroidx/compose/ui/graphics/h;->t:Li1/t;

    .line 10
    .line 11
    iget-object v4, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3, v4}, Ls0/E1;->createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/compose/ui/graphics/h;->x:Ls0/i1;

    .line 18
    .line 19
    return-void
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->s:Li1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/l;->j1()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Ls0/r0;->s(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    or-int/lit8 v0, v0, 0x40

    .line 12
    .line 13
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 14
    .line 15
    iput-wide p1, p0, Landroidx/compose/ui/graphics/h;->h:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public l(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->b:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->b:F

    .line 15
    .line 16
    return-void
.end method

.method public m()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public n(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/h;->p:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/h;->p:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public o(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->i:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Ls0/r0;->s(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 14
    .line 15
    iput-wide p1, p0, Landroidx/compose/ui/graphics/h;->i:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/h;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public r(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->m:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x800

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->m:F

    .line 15
    .line 16
    return-void
.end method

.method public r0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->n:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public s(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->j:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x100

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->j:F

    .line 15
    .line 16
    return-void
.end method

.method public s1(Ls0/E1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->o:Ls0/E1;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/compose/ui/graphics/h;->o:Ls0/E1;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public t(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->k:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x200

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->k:F

    .line 15
    .line 16
    return-void
.end method

.method public t0(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/h;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/graphics/j;->e(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 14
    .line 15
    iput-wide p1, p0, Landroidx/compose/ui/graphics/h;->n:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public u()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public v(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->g:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->g:F

    .line 15
    .line 16
    return-void
.end method

.method public w(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->l:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x400

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->l:F

    .line 15
    .line 16
    return-void
.end method

.method public y(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/h;->c:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/graphics/h;->a:I

    .line 13
    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/h;->c:F

    .line 15
    .line 16
    return-void
.end method

.method public z()Landroidx/compose/ui/graphics/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/h;->v:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    return-object v0
.end method
