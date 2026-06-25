.class public final LE/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE/k;
.implements LF/w;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Object;

.field private final c:Z

.field private final d:I

.field private final e:Z

.field private final f:Li1/t;

.field private final g:I

.field private final h:I

.field private final i:Ljava/util/List;

.field private final j:J

.field private final k:Ljava/lang/Object;

.field private final l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final m:J

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private r:I

.field private s:I

.field private t:I

.field private final u:J

.field private v:J

.field private w:I

.field private x:I

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(ILjava/lang/Object;ZIIZLi1/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LE/v;->a:I

    .line 4
    iput-object p2, p0, LE/v;->b:Ljava/lang/Object;

    .line 5
    iput-boolean p3, p0, LE/v;->c:Z

    .line 6
    iput p4, p0, LE/v;->d:I

    .line 7
    iput-boolean p6, p0, LE/v;->e:Z

    .line 8
    iput-object p7, p0, LE/v;->f:Li1/t;

    .line 9
    iput p8, p0, LE/v;->g:I

    .line 10
    iput p9, p0, LE/v;->h:I

    .line 11
    iput-object p10, p0, LE/v;->i:Ljava/util/List;

    .line 12
    iput-wide p11, p0, LE/v;->j:J

    .line 13
    iput-object p13, p0, LE/v;->k:Ljava/lang/Object;

    .line 14
    iput-object p14, p0, LE/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-wide p1, p15

    .line 15
    iput-wide p1, p0, LE/v;->m:J

    move/from16 p1, p17

    .line 16
    iput p1, p0, LE/v;->n:I

    move/from16 p1, p18

    .line 17
    iput p1, p0, LE/v;->o:I

    const/high16 p1, -0x80000000

    .line 18
    iput p1, p0, LE/v;->r:I

    .line 19
    invoke-interface {p10}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    move p3, p2

    move p4, p3

    :goto_0
    if-ge p3, p1, :cond_1

    .line 20
    invoke-interface {p10, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    .line 21
    check-cast p6, Landroidx/compose/ui/layout/s;

    .line 22
    invoke-virtual {p0}, LE/v;->j()Z

    move-result p7

    if-eqz p7, :cond_0

    invoke-virtual {p6}, Landroidx/compose/ui/layout/s;->P0()I

    move-result p6

    goto :goto_1

    :cond_0
    invoke-virtual {p6}, Landroidx/compose/ui/layout/s;->W0()I

    move-result p6

    :goto_1
    invoke-static {p4, p6}, Ljava/lang/Math;->max(II)I

    move-result p4

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 23
    :cond_1
    iput p4, p0, LE/v;->p:I

    add-int/2addr p5, p4

    .line 24
    invoke-static {p5, p2}, Loe/j;->e(II)I

    move-result p1

    iput p1, p0, LE/v;->q:I

    .line 25
    invoke-virtual {p0}, LE/v;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 26
    iget p1, p0, LE/v;->d:I

    invoke-static {p1, p4}, Li1/s;->a(II)J

    move-result-wide p1

    goto :goto_2

    .line 27
    :cond_2
    iget p1, p0, LE/v;->d:I

    invoke-static {p4, p1}, Li1/s;->a(II)J

    move-result-wide p1

    .line 28
    :goto_2
    iput-wide p1, p0, LE/v;->u:J

    .line 29
    sget-object p1, Li1/n;->b:Li1/n$a;

    invoke-virtual {p1}, Li1/n$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LE/v;->v:J

    const/4 p1, -0x1

    .line 30
    iput p1, p0, LE/v;->w:I

    .line 31
    iput p1, p0, LE/v;->x:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;ZIIZLi1/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p18}, LE/v;-><init>(ILjava/lang/Object;ZIIZLi1/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V

    return-void
.end method

.method private final e(J)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/v;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Li1/n;->l(J)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-static {p1, p2}, Li1/n;->k(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private final q(Landroidx/compose/ui/layout/s;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/v;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, LE/v;->u:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LE/v;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE/v;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p0}, LE/v;->c()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p0}, LE/v;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int/2addr v2, p1

    .line 28
    :goto_0
    invoke-virtual {p0}, LE/v;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    add-int/2addr v0, p1

    .line 39
    :cond_2
    invoke-static {v2, v0}, Li1/o;->a(II)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iput-wide v0, p0, LE/v;->v:J

    .line 44
    .line 45
    invoke-virtual {p0}, LE/v;->g()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v0, 0x0

    .line 50
    :goto_1
    if-ge v0, p1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, LE/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 53
    .line 54
    invoke-virtual {p0}, LE/v;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_2
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/v;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getColumn()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LE/v;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public i()J
    .locals 2

    .line 1
    iget-wide v0, p0, LE/v;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE/v;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public k(IIII)V
    .locals 7

    .line 1
    const/4 v5, -0x1

    .line 2
    const/4 v6, -0x1

    .line 3
    move-object v0, p0

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move v3, p3

    .line 7
    move v4, p4

    .line 8
    invoke-virtual/range {v0 .. v6}, LE/v;->t(IIIIII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public m(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE/v;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/ui/layout/s;

    .line 8
    .line 9
    invoke-interface {p1}, LI0/D;->j()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public n(I)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LE/v;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget v0, p0, LE/v;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE/v;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s(Landroidx/compose/ui/layout/s$a;)V
    .locals 11

    .line 1
    iget v0, p0, LE/v;->r:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, LE/v;->g()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_4

    .line 13
    .line 14
    iget-object v2, p0, LE/v;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v4, v2

    .line 21
    check-cast v4, Landroidx/compose/ui/layout/s;

    .line 22
    .line 23
    invoke-direct {p0, v4}, LE/v;->q(Landroidx/compose/ui/layout/s;)I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LE/v;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    iget-object v5, p0, LE/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 31
    .line 32
    invoke-virtual {p0}, LE/v;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v5, v6, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;

    .line 37
    .line 38
    .line 39
    iget-boolean v5, p0, LE/v;->e:Z

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, LE/v;->j()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    invoke-static {v2, v3}, Li1/n;->k(J)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-static {v2, v3}, Li1/n;->k(J)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    iget v6, p0, LE/v;->r:I

    .line 59
    .line 60
    sub-int/2addr v6, v5

    .line 61
    invoke-direct {p0, v4}, LE/v;->q(Landroidx/compose/ui/layout/s;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    sub-int v5, v6, v5

    .line 66
    .line 67
    :goto_1
    invoke-virtual {p0}, LE/v;->j()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget v3, p0, LE/v;->r:I

    .line 78
    .line 79
    sub-int/2addr v3, v2

    .line 80
    invoke-direct {p0, v4}, LE/v;->q(Landroidx/compose/ui/layout/s;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    sub-int/2addr v3, v2

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    :goto_2
    invoke-static {v5, v3}, Li1/o;->a(II)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    :cond_2
    iget-wide v5, p0, LE/v;->j:J

    .line 95
    .line 96
    invoke-static {v2, v3, v5, v6}, Li1/n;->o(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-virtual {p0}, LE/v;->j()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    const/4 v9, 0x6

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    move-object v3, p1

    .line 111
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/layout/s$a;->y0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    move-object v3, p1

    .line 116
    const/4 v9, 0x6

    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/layout/s$a;->l0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    move-object p1, v3

    .line 126
    goto :goto_0

    .line 127
    :cond_4
    return-void

    .line 128
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    const-string v0, "position() should be called first"

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1
.end method

.method public final t(IIIIII)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/v;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, p4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, p3

    .line 10
    :goto_0
    iput v0, p0, LE/v;->r:I

    .line 11
    .line 12
    invoke-virtual {p0}, LE/v;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move p3, p4

    .line 20
    :goto_1
    invoke-virtual {p0}, LE/v;->j()Z

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    if-eqz p4, :cond_2

    .line 25
    .line 26
    iget-object p4, p0, LE/v;->f:Li1/t;

    .line 27
    .line 28
    sget-object v0, Li1/t;->b:Li1/t;

    .line 29
    .line 30
    if-ne p4, v0, :cond_2

    .line 31
    .line 32
    sub-int/2addr p3, p2

    .line 33
    iget p2, p0, LE/v;->d:I

    .line 34
    .line 35
    sub-int p2, p3, p2

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, LE/v;->j()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-static {p2, p1}, Li1/o;->a(II)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-static {p1, p2}, Li1/o;->a(II)J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    :goto_2
    iput-wide p1, p0, LE/v;->v:J

    .line 53
    .line 54
    iput p5, p0, LE/v;->w:I

    .line 55
    .line 56
    iput p6, p0, LE/v;->x:I

    .line 57
    .line 58
    iget p1, p0, LE/v;->g:I

    .line 59
    .line 60
    neg-int p1, p1

    .line 61
    iput p1, p0, LE/v;->s:I

    .line 62
    .line 63
    iget p1, p0, LE/v;->r:I

    .line 64
    .line 65
    iget p2, p0, LE/v;->h:I

    .line 66
    .line 67
    add-int/2addr p1, p2

    .line 68
    iput p1, p0, LE/v;->t:I

    .line 69
    .line 70
    return-void
.end method

.method public final u(I)V
    .locals 1

    .line 1
    iput p1, p0, LE/v;->r:I

    .line 2
    .line 3
    iget v0, p0, LE/v;->h:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    iput p1, p0, LE/v;->t:I

    .line 7
    .line 8
    return-void
.end method
