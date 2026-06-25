.class public final LD/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD/q;
.implements LI0/C;


# instance fields
.field private final a:LD/t;

.field private b:I

.field private c:Z

.field private d:F

.field private final e:F

.field private final f:Z

.field private final g:LGf/O;

.field private final h:Li1/d;

.field private final i:J

.field private final j:Ljava/util/List;

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Z

.field private final o:Lz/q;

.field private final p:I

.field private final q:I

.field private final synthetic r:LI0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(LD/t;IZFLI0/C;FZLGf/O;Li1/d;JLjava/util/List;IIIZLz/q;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LD/s;->a:LD/t;

    .line 4
    iput p2, p0, LD/s;->b:I

    .line 5
    iput-boolean p3, p0, LD/s;->c:Z

    .line 6
    iput p4, p0, LD/s;->d:F

    .line 7
    iput p6, p0, LD/s;->e:F

    .line 8
    iput-boolean p7, p0, LD/s;->f:Z

    .line 9
    iput-object p8, p0, LD/s;->g:LGf/O;

    .line 10
    iput-object p9, p0, LD/s;->h:Li1/d;

    .line 11
    iput-wide p10, p0, LD/s;->i:J

    .line 12
    iput-object p12, p0, LD/s;->j:Ljava/util/List;

    .line 13
    iput p13, p0, LD/s;->k:I

    .line 14
    iput p14, p0, LD/s;->l:I

    .line 15
    iput p15, p0, LD/s;->m:I

    move/from16 p1, p16

    .line 16
    iput-boolean p1, p0, LD/s;->n:Z

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, LD/s;->o:Lz/q;

    move/from16 p1, p18

    .line 18
    iput p1, p0, LD/s;->p:I

    move/from16 p1, p19

    .line 19
    iput p1, p0, LD/s;->q:I

    .line 20
    iput-object p5, p0, LD/s;->r:LI0/C;

    return-void
.end method

.method public synthetic constructor <init>(LD/t;IZFLI0/C;FZLGf/O;Li1/d;JLjava/util/List;IIIZLz/q;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p19}, LD/s;-><init>(LD/t;IZFLI0/C;FZLGf/O;Li1/d;JLjava/util/List;IIIZLz/q;II)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->r:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->A()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public B()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->r:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->B()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a()Lz/q;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->o:Lz/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LD/s;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LD/s;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Li1/s;->a(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/s;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    neg-int v0, v0

    .line 6
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->r:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->r:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, LD/s;->a:LD/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LD/t;->getIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, LD/s;->b:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LD/s;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LD/s;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final m()F
    .locals 1

    .line 1
    iget v0, p0, LD/s;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final n()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->g:LGf/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->h:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LD/t;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->a:LD/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget v0, p0, LD/s;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()F
    .locals 1

    .line 1
    iget v0, p0, LD/s;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final s(IZ)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LD/s;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {p0}, LD/s;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    iget-object v0, p0, LD/s;->a:LD/t;

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, LD/t;->l()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, LD/s;->b:I

    .line 25
    .line 26
    sub-int/2addr v2, p1

    .line 27
    if-ltz v2, :cond_4

    .line 28
    .line 29
    if-ge v2, v0, :cond_4

    .line 30
    .line 31
    invoke-virtual {p0}, LD/s;->i()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LD/t;

    .line 40
    .line 41
    invoke-virtual {p0}, LD/s;->i()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, LD/t;

    .line 50
    .line 51
    invoke-virtual {v0}, LD/t;->e()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2}, LD/t;->e()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    if-gez p1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0}, LD/t;->getOffset()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v0}, LD/t;->l()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-int/2addr v3, v0

    .line 75
    invoke-virtual {p0}, LD/s;->f()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    sub-int/2addr v3, v0

    .line 80
    invoke-virtual {v2}, LD/t;->getOffset()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v2}, LD/t;->l()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v0, v2

    .line 89
    invoke-virtual {p0}, LD/s;->d()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    sub-int/2addr v0, v2

    .line 94
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    neg-int v2, p1

    .line 99
    if-le v0, v2, :cond_4

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p0}, LD/s;->f()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {v0}, LD/t;->getOffset()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    sub-int/2addr v3, v0

    .line 111
    invoke-virtual {p0}, LD/s;->d()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v2}, LD/t;->getOffset()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    sub-int/2addr v0, v2

    .line 120
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-le v0, p1, :cond_4

    .line 125
    .line 126
    :goto_0
    iget v0, p0, LD/s;->b:I

    .line 127
    .line 128
    sub-int/2addr v0, p1

    .line 129
    iput v0, p0, LD/s;->b:I

    .line 130
    .line 131
    invoke-virtual {p0}, LD/s;->i()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    :goto_1
    if-ge v1, v2, :cond_2

    .line 140
    .line 141
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, LD/t;

    .line 146
    .line 147
    invoke-virtual {v3, p1, p2}, LD/t;->a(IZ)V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    int-to-float p2, p1

    .line 154
    iput p2, p0, LD/s;->d:F

    .line 155
    .line 156
    iget-boolean p2, p0, LD/s;->c:Z

    .line 157
    .line 158
    const/4 v0, 0x1

    .line 159
    if-nez p2, :cond_3

    .line 160
    .line 161
    if-lez p1, :cond_3

    .line 162
    .line 163
    iput-boolean v0, p0, LD/s;->c:Z

    .line 164
    .line 165
    :cond_3
    return v0

    .line 166
    :cond_4
    :goto_2
    return v1
.end method

.method public z()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LD/s;->r:LI0/C;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/C;->z()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
