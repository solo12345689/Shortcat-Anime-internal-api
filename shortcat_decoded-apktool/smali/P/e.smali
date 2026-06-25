.class public final LP/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LU0/e;

.field private b:LU0/Y0;

.field private c:LY0/u$b;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:Ljava/util/List;

.field private i:LP/c;

.field private j:J

.field private k:Li1/d;

.field private l:LU0/q;

.field private m:Li1/t;

.field private n:LU0/T0;

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(LU0/e;LU0/Y0;LY0/u$b;IZIILjava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP/e;->a:LU0/e;

    .line 4
    iput-object p2, p0, LP/e;->b:LU0/Y0;

    .line 5
    iput-object p3, p0, LP/e;->c:LY0/u$b;

    .line 6
    iput p4, p0, LP/e;->d:I

    .line 7
    iput-boolean p5, p0, LP/e;->e:Z

    .line 8
    iput p6, p0, LP/e;->f:I

    .line 9
    iput p7, p0, LP/e;->g:I

    .line 10
    iput-object p8, p0, LP/e;->h:Ljava/util/List;

    .line 11
    sget-object p1, LP/a;->a:LP/a$a;

    invoke-virtual {p1}, LP/a$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LP/e;->j:J

    const/4 p1, -0x1

    .line 12
    iput p1, p0, LP/e;->o:I

    .line 13
    iput p1, p0, LP/e;->p:I

    return-void
.end method

.method public synthetic constructor <init>(LU0/e;LU0/Y0;LY0/u$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LP/e;-><init>(LU0/e;LU0/Y0;LY0/u$b;IZIILjava/util/List;)V

    return-void
.end method

.method private final e(JLi1/t;)LU0/n;
    .locals 7

    .line 1
    invoke-direct {p0, p3}, LP/e;->l(Li1/t;)LU0/q;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v0, LU0/n;

    .line 6
    .line 7
    iget-boolean p3, p0, LP/e;->e:Z

    .line 8
    .line 9
    iget v2, p0, LP/e;->d:I

    .line 10
    .line 11
    invoke-virtual {v1}, LU0/q;->d()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {p1, p2, p3, v2, v3}, LP/b;->a(JZIF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-boolean p1, p0, LP/e;->e:Z

    .line 20
    .line 21
    iget p2, p0, LP/e;->d:I

    .line 22
    .line 23
    iget p3, p0, LP/e;->f:I

    .line 24
    .line 25
    invoke-static {p1, p2, p3}, LP/b;->b(ZII)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget p1, p0, LP/e;->d:I

    .line 30
    .line 31
    sget-object p2, Lg1/v;->a:Lg1/v$a;

    .line 32
    .line 33
    invoke-virtual {p2}, Lg1/v$a;->b()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p1, p2}, Lg1/v;->g(II)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct/range {v0 .. v6}, LU0/n;-><init>(LU0/q;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method private final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LP/e;->l:LU0/q;

    .line 3
    .line 4
    iput-object v0, p0, LP/e;->n:LU0/T0;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, LP/e;->p:I

    .line 8
    .line 9
    iput v0, p0, LP/e;->o:I

    .line 10
    .line 11
    return-void
.end method

.method private final j(LU0/T0;JLi1/t;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, LU0/T0;->w()LU0/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LU0/n;->m()LU0/q;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LU0/q;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p1}, LU0/T0;->l()LU0/S0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, LU0/S0;->d()Li1/t;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eq p4, v1, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    invoke-virtual {p1}, LU0/T0;->l()LU0/S0;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    invoke-virtual {p4}, LU0/S0;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-static {p2, p3, v1, v2}, Li1/b;->f(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz p4, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    invoke-static {p2, p3}, Li1/b;->l(J)I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    invoke-virtual {p1}, LU0/T0;->l()LU0/S0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, LU0/S0;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-static {v2, v3}, Li1/b;->l(J)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eq p4, v2, :cond_4

    .line 64
    .line 65
    return v0

    .line 66
    :cond_4
    invoke-static {p2, p3}, Li1/b;->k(J)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    int-to-float p2, p2

    .line 71
    invoke-virtual {p1}, LU0/T0;->w()LU0/n;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p3}, LU0/n;->k()F

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    cmpg-float p2, p2, p3

    .line 80
    .line 81
    if-ltz p2, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1}, LU0/T0;->w()LU0/n;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, LU0/n;->i()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    return v1

    .line 95
    :cond_6
    :goto_0
    return v0
.end method

.method private final l(Li1/t;)LU0/q;
    .locals 8

    .line 1
    iget-object v0, p0, LP/e;->l:LU0/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LP/e;->m:Li1/t;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LU0/q;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, LP/e;->m:Li1/t;

    .line 16
    .line 17
    iget-object v3, p0, LP/e;->a:LU0/e;

    .line 18
    .line 19
    iget-object v0, p0, LP/e;->b:LU0/Y0;

    .line 20
    .line 21
    invoke-static {v0, p1}, LU0/Z0;->d(LU0/Y0;Li1/t;)LU0/Y0;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v6, p0, LP/e;->k:Li1/d;

    .line 26
    .line 27
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, LP/e;->c:LY0/u$b;

    .line 31
    .line 32
    iget-object p1, p0, LP/e;->h:Ljava/util/List;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_1
    move-object v5, p1

    .line 41
    new-instance v2, LU0/q;

    .line 42
    .line 43
    invoke-direct/range {v2 .. v7}, LU0/q;-><init>(LU0/e;LU0/Y0;Ljava/util/List;Li1/d;LY0/u$b;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :cond_2
    iput-object v0, p0, LP/e;->l:LU0/q;

    .line 48
    .line 49
    return-object v0
.end method

.method private final m(Li1/t;JLU0/n;)LU0/T0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p4 .. p4}, LU0/n;->m()LU0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LU0/q;->d()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual/range {p4 .. p4}, LU0/n;->E()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, LU0/T0;

    .line 20
    .line 21
    new-instance v3, LU0/S0;

    .line 22
    .line 23
    iget-object v4, v0, LP/e;->a:LU0/e;

    .line 24
    .line 25
    iget-object v5, v0, LP/e;->b:LU0/Y0;

    .line 26
    .line 27
    iget-object v6, v0, LP/e;->h:Ljava/util/List;

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    :cond_0
    iget v7, v0, LP/e;->f:I

    .line 36
    .line 37
    iget-boolean v8, v0, LP/e;->e:Z

    .line 38
    .line 39
    iget v9, v0, LP/e;->d:I

    .line 40
    .line 41
    iget-object v10, v0, LP/e;->k:Li1/d;

    .line 42
    .line 43
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v12, v0, LP/e;->c:LY0/u$b;

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    move-object/from16 v11, p1

    .line 50
    .line 51
    move-wide/from16 v13, p2

    .line 52
    .line 53
    invoke-direct/range {v3 .. v15}, LU0/S0;-><init>(LU0/e;LU0/Y0;Ljava/util/List;IZILi1/d;Li1/t;LY0/u$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, LK/I;->a(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual/range {p4 .. p4}, LU0/n;->k()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {v4}, LK/I;->a(F)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-static {v1, v4}, Li1/s;->a(II)J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    invoke-static {v13, v14, v4, v5}, Li1/c;->d(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    const/4 v7, 0x0

    .line 77
    move-object/from16 v4, p4

    .line 78
    .line 79
    invoke-direct/range {v2 .. v7}, LU0/T0;-><init>(LU0/S0;LU0/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    return-object v2
.end method


# virtual methods
.method public final a()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LP/e;->k:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LU0/T0;
    .locals 1

    .line 1
    iget-object v0, p0, LP/e;->n:LU0/T0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LU0/T0;
    .locals 2

    .line 1
    iget-object v0, p0, LP/e;->n:LU0/T0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "You must call layoutWithConstraints first"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final d(ILi1/t;)I
    .locals 3

    .line 1
    iget v0, p0, LP/e;->o:I

    .line 2
    .line 3
    iget v1, p0, LP/e;->p:I

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, p1, v1, v0}, Li1/c;->a(IIII)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-direct {p0, v0, v1, p2}, LP/e;->e(JLi1/t;)LU0/n;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, LU0/n;->k()F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p2}, LK/I;->a(F)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iput p1, p0, LP/e;->o:I

    .line 32
    .line 33
    iput p2, p0, LP/e;->p:I

    .line 34
    .line 35
    return p2
.end method

.method public final f(JLi1/t;)Z
    .locals 8

    .line 1
    iget v0, p0, LP/e;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    sget-object v2, LP/c;->h:LP/c$a;

    .line 7
    .line 8
    iget-object v3, p0, LP/e;->i:LP/c;

    .line 9
    .line 10
    iget-object v5, p0, LP/e;->b:LU0/Y0;

    .line 11
    .line 12
    iget-object v6, p0, LP/e;->k:Li1/d;

    .line 13
    .line 14
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v7, p0, LP/e;->c:LY0/u$b;

    .line 18
    .line 19
    move-object v4, p3

    .line 20
    invoke-virtual/range {v2 .. v7}, LP/c$a;->a(LP/c;Li1/t;LU0/Y0;Li1/d;LY0/u$b;)LP/c;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, LP/e;->i:LP/c;

    .line 25
    .line 26
    iget v0, p0, LP/e;->g:I

    .line 27
    .line 28
    invoke-virtual {p3, p1, p2, v0}, LP/c;->c(JI)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v4, p3

    .line 34
    :goto_0
    iget-object p3, p0, LP/e;->n:LU0/T0;

    .line 35
    .line 36
    invoke-direct {p0, p3, p1, p2, v4}, LP/e;->j(LU0/T0;JLi1/t;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-nez p3, :cond_2

    .line 41
    .line 42
    iget-object p3, p0, LP/e;->n:LU0/T0;

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, LU0/T0;->l()LU0/S0;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, LU0/S0;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-static {p1, p2, v2, v3}, Li1/b;->f(JJ)Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_1

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    return p1

    .line 63
    :cond_1
    iget-object p3, p0, LP/e;->n:LU0/T0;

    .line 64
    .line 65
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, LU0/T0;->w()LU0/n;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-direct {p0, v4, p1, p2, p3}, LP/e;->m(Li1/t;JLU0/n;)LU0/T0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, LP/e;->n:LU0/T0;

    .line 77
    .line 78
    return v1

    .line 79
    :cond_2
    invoke-direct {p0, p1, p2, v4}, LP/e;->e(JLi1/t;)LU0/n;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-direct {p0, v4, p1, p2, p3}, LP/e;->m(Li1/t;JLU0/n;)LU0/T0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, LP/e;->n:LU0/T0;

    .line 88
    .line 89
    return v1
.end method

.method public final h(Li1/t;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP/e;->l(Li1/t;)LU0/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LU0/q;->d()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, LK/I;->a(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final i(Li1/t;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP/e;->l(Li1/t;)LU0/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LU0/q;->f()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, LK/I;->a(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final k(Li1/d;)V
    .locals 5

    .line 1
    iget-object v0, p0, LP/e;->k:Li1/d;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LP/a;->d(Li1/d;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, LP/a;->a:LP/a$a;

    .line 11
    .line 12
    invoke-virtual {v1}, LP/a$a;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-object p1, p0, LP/e;->k:Li1/d;

    .line 19
    .line 20
    iput-wide v1, p0, LP/e;->j:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-wide v3, p0, LP/e;->j:J

    .line 26
    .line 27
    invoke-static {v3, v4, v1, v2}, LP/a;->e(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-void

    .line 35
    :cond_3
    :goto_1
    iput-object p1, p0, LP/e;->k:Li1/d;

    .line 36
    .line 37
    iput-wide v1, p0, LP/e;->j:J

    .line 38
    .line 39
    invoke-direct {p0}, LP/e;->g()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final n(LU0/e;LU0/Y0;LY0/u$b;IZIILjava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/e;->a:LU0/e;

    .line 2
    .line 3
    iput-object p2, p0, LP/e;->b:LU0/Y0;

    .line 4
    .line 5
    iput-object p3, p0, LP/e;->c:LY0/u$b;

    .line 6
    .line 7
    iput p4, p0, LP/e;->d:I

    .line 8
    .line 9
    iput-boolean p5, p0, LP/e;->e:Z

    .line 10
    .line 11
    iput p6, p0, LP/e;->f:I

    .line 12
    .line 13
    iput p7, p0, LP/e;->g:I

    .line 14
    .line 15
    iput-object p8, p0, LP/e;->h:Ljava/util/List;

    .line 16
    .line 17
    invoke-direct {p0}, LP/e;->g()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
