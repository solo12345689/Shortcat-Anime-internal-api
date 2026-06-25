.class public final LG/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG/f;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/List;

.field private final d:J

.field private final e:Ljava/lang/Object;

.field private final f:Ll0/e$b;

.field private final g:Ll0/e$c;

.field private final h:Li1/t;

.field private final i:Z

.field private final j:Z

.field private final k:I

.field private final l:[I

.field private m:I

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(IILjava/util/List;JLjava/lang/Object;Lz/q;Ll0/e$b;Ll0/e$c;Li1/t;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LG/e;->a:I

    .line 4
    iput p2, p0, LG/e;->b:I

    .line 5
    iput-object p3, p0, LG/e;->c:Ljava/util/List;

    .line 6
    iput-wide p4, p0, LG/e;->d:J

    .line 7
    iput-object p6, p0, LG/e;->e:Ljava/lang/Object;

    .line 8
    iput-object p8, p0, LG/e;->f:Ll0/e$b;

    .line 9
    iput-object p9, p0, LG/e;->g:Ll0/e$c;

    .line 10
    iput-object p10, p0, LG/e;->h:Li1/t;

    .line 11
    iput-boolean p11, p0, LG/e;->i:Z

    .line 12
    sget-object p1, Lz/q;->a:Lz/q;

    const/4 p2, 0x0

    if-ne p7, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, LG/e;->j:Z

    .line 13
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    move p4, p2

    :goto_1
    if-ge p2, p1, :cond_2

    .line 14
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    .line 15
    check-cast p5, Landroidx/compose/ui/layout/s;

    .line 16
    iget-boolean p6, p0, LG/e;->j:Z

    if-nez p6, :cond_1

    invoke-virtual {p5}, Landroidx/compose/ui/layout/s;->P0()I

    move-result p5

    goto :goto_2

    :cond_1
    invoke-virtual {p5}, Landroidx/compose/ui/layout/s;->W0()I

    move-result p5

    :goto_2
    invoke-static {p4, p5}, Ljava/lang/Math;->max(II)I

    move-result p4

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 17
    :cond_2
    iput p4, p0, LG/e;->k:I

    .line 18
    iget-object p1, p0, LG/e;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, LG/e;->l:[I

    const/high16 p1, -0x80000000

    .line 19
    iput p1, p0, LG/e;->n:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/List;JLjava/lang/Object;Lz/q;Ll0/e$b;Ll0/e$c;Li1/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, LG/e;-><init>(IILjava/util/List;JLjava/lang/Object;Lz/q;Ll0/e$b;Ll0/e$c;Li1/t;Z)V

    return-void
.end method

.method private final d(Landroidx/compose/ui/layout/s;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, LG/e;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method private final e(I)J
    .locals 2

    .line 1
    iget-object v0, p0, LG/e;->l:[I

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget v1, v0, p1

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    invoke-static {v1, p1}, Li1/o;->a(II)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LG/e;->getOffset()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    iput v0, p0, LG/e;->m:I

    .line 7
    .line 8
    iget-object v0, p0, LG/e;->l:[I

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_3

    .line 13
    .line 14
    iget-boolean v2, p0, LG/e;->j:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    rem-int/lit8 v3, v1, 0x2

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq v3, v4, :cond_1

    .line 22
    .line 23
    :cond_0
    if-nez v2, :cond_2

    .line 24
    .line 25
    rem-int/lit8 v2, v1, 0x2

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    :cond_1
    iget-object v2, p0, LG/e;->l:[I

    .line 30
    .line 31
    aget v3, v2, v1

    .line 32
    .line 33
    add-int/2addr v3, p1

    .line 34
    aput v3, v2, v1

    .line 35
    .line 36
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    return-void
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, LG/e;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LG/e;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LG/e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroidx/compose/ui/layout/s$a;)V
    .locals 11

    .line 1
    iget v0, p0, LG/e;->n:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, LG/e;->c:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_4

    .line 15
    .line 16
    iget-object v2, p0, LG/e;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v4, v2

    .line 23
    check-cast v4, Landroidx/compose/ui/layout/s;

    .line 24
    .line 25
    invoke-direct {p0, v1}, LG/e;->e(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    iget-boolean v5, p0, LG/e;->i:Z

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    iget-boolean v5, p0, LG/e;->j:Z

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    invoke-static {v2, v3}, Li1/n;->k(J)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-static {v2, v3}, Li1/n;->k(J)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget v6, p0, LG/e;->n:I

    .line 47
    .line 48
    sub-int/2addr v6, v5

    .line 49
    invoke-direct {p0, v4}, LG/e;->d(Landroidx/compose/ui/layout/s;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    sub-int v5, v6, v5

    .line 54
    .line 55
    :goto_1
    iget-boolean v6, p0, LG/e;->j:Z

    .line 56
    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget v3, p0, LG/e;->n:I

    .line 64
    .line 65
    sub-int/2addr v3, v2

    .line 66
    invoke-direct {p0, v4}, LG/e;->d(Landroidx/compose/ui/layout/s;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sub-int/2addr v3, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    :goto_2
    invoke-static {v5, v3}, Li1/o;->a(II)J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    :cond_2
    iget-wide v5, p0, LG/e;->d:J

    .line 81
    .line 82
    invoke-static {v2, v3, v5, v6}, Li1/n;->o(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    iget-boolean v2, p0, LG/e;->j:Z

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    const/4 v9, 0x6

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    move-object v3, p1

    .line 95
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/layout/s$a;->y0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move-object v3, p1

    .line 100
    const/4 v9, 0x6

    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/layout/s$a;->l0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    move-object p1, v3

    .line 110
    goto :goto_0

    .line 111
    :cond_4
    return-void

    .line 112
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    const-string v0, "position() should be called first"

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LG/e;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getOffset()I
    .locals 1

    .line 1
    iget v0, p0, LG/e;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(III)V
    .locals 9

    .line 1
    iput p1, p0, LG/e;->m:I

    .line 2
    .line 3
    iget-boolean v0, p0, LG/e;->j:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, p3

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, p2

    .line 10
    :goto_0
    iput v0, p0, LG/e;->n:I

    .line 11
    .line 12
    iget-object v0, p0, LG/e;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_1
    if-ge v2, v1, :cond_4

    .line 20
    .line 21
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroidx/compose/ui/layout/s;

    .line 26
    .line 27
    mul-int/lit8 v4, v2, 0x2

    .line 28
    .line 29
    iget-boolean v5, p0, LG/e;->j:Z

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    iget-object v5, p0, LG/e;->l:[I

    .line 34
    .line 35
    iget-object v6, p0, LG/e;->f:Ll0/e$b;

    .line 36
    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->W0()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    iget-object v8, p0, LG/e;->h:Li1/t;

    .line 44
    .line 45
    invoke-interface {v6, v7, p2, v8}, Ll0/e$b;->a(IILi1/t;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    aput v6, v5, v4

    .line 50
    .line 51
    iget-object v5, p0, LG/e;->l:[I

    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    aput p1, v5, v4

    .line 56
    .line 57
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->P0()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_2
    add-int/2addr p1, v3

    .line 62
    goto :goto_3

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string p2, "null horizontalAlignment"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    iget-object v5, p0, LG/e;->l:[I

    .line 72
    .line 73
    aput p1, v5, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    iget-object v6, p0, LG/e;->g:Ll0/e$c;

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->P0()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-interface {v6, v7, p3}, Ll0/e$c;->a(II)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    aput v6, v5, v4

    .line 90
    .line 91
    invoke-virtual {v3}, Landroidx/compose/ui/layout/s;->W0()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    goto :goto_2

    .line 96
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    const-string p2, "null verticalAlignment"

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_4
    return-void
.end method
