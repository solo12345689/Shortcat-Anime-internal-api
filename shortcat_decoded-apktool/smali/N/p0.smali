.class public final LN/p0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private final b:LN/l0;

.field private final c:Ljava/lang/Object;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:La1/U;

.field private k:LU0/T0;

.field private l:La1/J;

.field private m:Lr0/h;

.field private n:Lr0/h;

.field private final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field private final p:[F

.field private final q:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;LN/l0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/p0;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, LN/p0;->b:LN/l0;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LN/p0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LN/p0;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    const/4 p2, 0x1

    .line 24
    invoke-static {p1, p2, p1}, Ls0/g1;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LN/p0;->p:[F

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/Matrix;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, LN/p0;->q:Landroid/graphics/Matrix;

    .line 36
    .line 37
    return-void
.end method

.method private final c()V
    .locals 12

    .line 1
    iget-object v0, p0, LN/p0;->b:LN/l0;

    .line 2
    .line 3
    invoke-interface {v0}, LN/l0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LN/p0;->p:[F

    .line 11
    .line 12
    invoke-static {v0}, Ls0/g1;->h([F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LN/p0;->a:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iget-object v1, p0, LN/p0;->p:[F

    .line 18
    .line 19
    invoke-static {v1}, Ls0/g1;->a([F)Ls0/g1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LN/p0;->p:[F

    .line 27
    .line 28
    iget-object v1, p0, LN/p0;->n:Lr0/h;

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lr0/h;->i()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    neg-float v1, v1

    .line 38
    iget-object v2, p0, LN/p0;->n:Lr0/h;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lr0/h;->l()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    neg-float v2, v2

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v0, v1, v2, v3}, Ls0/g1;->n([FFFF)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, LN/p0;->q:Landroid/graphics/Matrix;

    .line 53
    .line 54
    iget-object v1, p0, LN/p0;->p:[F

    .line 55
    .line 56
    invoke-static {v0, v1}, Ls0/P;->a(Landroid/graphics/Matrix;[F)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LN/p0;->b:LN/l0;

    .line 60
    .line 61
    iget-object v1, p0, LN/p0;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 62
    .line 63
    iget-object v2, p0, LN/p0;->j:La1/U;

    .line 64
    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, LN/p0;->l:La1/J;

    .line 69
    .line 70
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, LN/p0;->k:LU0/T0;

    .line 74
    .line 75
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v5, p0, LN/p0;->q:Landroid/graphics/Matrix;

    .line 79
    .line 80
    iget-object v6, p0, LN/p0;->m:Lr0/h;

    .line 81
    .line 82
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v7, p0, LN/p0;->n:Lr0/h;

    .line 86
    .line 87
    invoke-static {v7}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v8, p0, LN/p0;->f:Z

    .line 91
    .line 92
    iget-boolean v9, p0, LN/p0;->g:Z

    .line 93
    .line 94
    iget-boolean v10, p0, LN/p0;->h:Z

    .line 95
    .line 96
    iget-boolean v11, p0, LN/p0;->i:Z

    .line 97
    .line 98
    invoke-static/range {v1 .. v11}, LN/o0;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;La1/U;La1/J;LU0/T0;Landroid/graphics/Matrix;Lr0/h;Lr0/h;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v0, v1}, LN/l0;->updateCursorAnchorInfo(Landroid/view/inputmethod/CursorAnchorInfo;)V

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, LN/p0;->e:Z

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/p0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, LN/p0;->j:La1/U;

    .line 6
    .line 7
    iput-object v1, p0, LN/p0;->l:La1/J;

    .line 8
    .line 9
    iput-object v1, p0, LN/p0;->k:LU0/T0;

    .line 10
    .line 11
    iput-object v1, p0, LN/p0;->m:Lr0/h;

    .line 12
    .line 13
    iput-object v1, p0, LN/p0;->n:Lr0/h;

    .line 14
    .line 15
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
.end method

.method public final b(ZZZZZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/p0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-boolean p3, p0, LN/p0;->f:Z

    .line 5
    .line 6
    iput-boolean p4, p0, LN/p0;->g:Z

    .line 7
    .line 8
    iput-boolean p5, p0, LN/p0;->h:Z

    .line 9
    .line 10
    iput-boolean p6, p0, LN/p0;->i:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, LN/p0;->e:Z

    .line 16
    .line 17
    iget-object p1, p0, LN/p0;->j:La1/U;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, LN/p0;->c()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iput-boolean p2, p0, LN/p0;->d:Z

    .line 28
    .line 29
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    throw p1
.end method

.method public final d(La1/U;La1/J;LU0/T0;Lr0/h;Lr0/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/p0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LN/p0;->j:La1/U;

    .line 5
    .line 6
    iput-object p2, p0, LN/p0;->l:La1/J;

    .line 7
    .line 8
    iput-object p3, p0, LN/p0;->k:LU0/T0;

    .line 9
    .line 10
    iput-object p4, p0, LN/p0;->m:Lr0/h;

    .line 11
    .line 12
    iput-object p5, p0, LN/p0;->n:Lr0/h;

    .line 13
    .line 14
    iget-boolean p1, p0, LN/p0;->e:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-boolean p1, p0, LN/p0;->d:Z

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-direct {p0}, LN/p0;->c()V

    .line 26
    .line 27
    .line 28
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0

    .line 33
    throw p1
.end method
