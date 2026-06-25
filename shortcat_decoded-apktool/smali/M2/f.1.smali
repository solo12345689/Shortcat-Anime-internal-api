.class public final LM2/f;
.super LM2/p0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/f$b;,
        LM2/f$d;,
        LM2/f$c;
    }
.end annotation


# instance fields
.field private final m:J

.field private final n:J

.field private final o:Z

.field private final p:Z

.field private final q:Z

.field private final r:Z

.field private final s:Ljava/util/ArrayList;

.field private final t:Lq2/Y$d;

.field private u:LM2/f$c;

.field private v:LM2/f$d;

.field private w:J

.field private x:J


# direct methods
.method private constructor <init>(LM2/f$b;)V
    .locals 2

    .line 2
    invoke-static {p1}, LM2/f$b;->a(LM2/f$b;)LM2/D;

    move-result-object v0

    invoke-direct {p0, v0}, LM2/p0;-><init>(LM2/D;)V

    .line 3
    invoke-static {p1}, LM2/f$b;->b(LM2/f$b;)J

    move-result-wide v0

    iput-wide v0, p0, LM2/f;->m:J

    .line 4
    invoke-static {p1}, LM2/f$b;->c(LM2/f$b;)J

    move-result-wide v0

    iput-wide v0, p0, LM2/f;->n:J

    .line 5
    invoke-static {p1}, LM2/f$b;->d(LM2/f$b;)Z

    move-result v0

    iput-boolean v0, p0, LM2/f;->o:Z

    .line 6
    invoke-static {p1}, LM2/f$b;->e(LM2/f$b;)Z

    move-result v0

    iput-boolean v0, p0, LM2/f;->p:Z

    .line 7
    invoke-static {p1}, LM2/f$b;->f(LM2/f$b;)Z

    move-result v0

    iput-boolean v0, p0, LM2/f;->q:Z

    .line 8
    invoke-static {p1}, LM2/f$b;->g(LM2/f$b;)Z

    move-result p1

    iput-boolean p1, p0, LM2/f;->r:Z

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Lq2/Y$d;

    invoke-direct {p1}, Lq2/Y$d;-><init>()V

    iput-object p1, p0, LM2/f;->t:Lq2/Y$d;

    return-void
.end method

.method synthetic constructor <init>(LM2/f$b;LM2/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM2/f;-><init>(LM2/f$b;)V

    return-void
.end method

.method private T(Lq2/Y;)V
    .locals 14

    .line 1
    iget-object v0, p0, LM2/f;->t:Lq2/Y$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v3, p1

    .line 5
    invoke-virtual {p1, v1, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LM2/f;->t:Lq2/Y$d;

    .line 9
    .line 10
    invoke-virtual {v0}, Lq2/Y$d;->f()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    iget-object v0, p0, LM2/f;->u:LM2/f$c;

    .line 15
    .line 16
    const-wide/high16 v6, -0x8000000000000000L

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-boolean v0, p0, LM2/f;->p:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-wide v8, p0, LM2/f;->w:J

    .line 34
    .line 35
    sub-long/2addr v8, v4

    .line 36
    iget-wide v10, p0, LM2/f;->n:J

    .line 37
    .line 38
    cmp-long v0, v10, v6

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-wide v6, p0, LM2/f;->x:J

    .line 44
    .line 45
    sub-long/2addr v6, v4

    .line 46
    :goto_0
    move-wide v4, v8

    .line 47
    goto :goto_4

    .line 48
    :cond_2
    :goto_1
    iget-wide v8, p0, LM2/f;->m:J

    .line 49
    .line 50
    iget-wide v10, p0, LM2/f;->n:J

    .line 51
    .line 52
    iget-boolean v0, p0, LM2/f;->q:Z

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, LM2/f;->t:Lq2/Y$d;

    .line 57
    .line 58
    invoke-virtual {v0}, Lq2/Y$d;->d()J

    .line 59
    .line 60
    .line 61
    move-result-wide v12

    .line 62
    add-long/2addr v8, v12

    .line 63
    add-long/2addr v10, v12

    .line 64
    :cond_3
    add-long v12, v4, v8

    .line 65
    .line 66
    iput-wide v12, p0, LM2/f;->w:J

    .line 67
    .line 68
    iget-wide v12, p0, LM2/f;->n:J

    .line 69
    .line 70
    cmp-long v0, v12, v6

    .line 71
    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    add-long v6, v4, v10

    .line 76
    .line 77
    :goto_2
    iput-wide v6, p0, LM2/f;->x:J

    .line 78
    .line 79
    iget-object v0, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    move v2, v1

    .line 86
    :goto_3
    if-ge v2, v0, :cond_5

    .line 87
    .line 88
    iget-object v4, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, LM2/e;

    .line 95
    .line 96
    iget-wide v5, p0, LM2/f;->w:J

    .line 97
    .line 98
    iget-wide v12, p0, LM2/f;->x:J

    .line 99
    .line 100
    invoke-virtual {v4, v5, v6, v12, v13}, LM2/e;->x(JJ)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move-wide v6, v10

    .line 107
    goto :goto_0

    .line 108
    :goto_4
    :try_start_0
    new-instance v2, LM2/f$c;

    .line 109
    .line 110
    iget-boolean v8, p0, LM2/f;->r:Z

    .line 111
    .line 112
    invoke-direct/range {v2 .. v8}, LM2/f$c;-><init>(Lq2/Y;JJZ)V

    .line 113
    .line 114
    .line 115
    iput-object v2, p0, LM2/f;->u:LM2/f$c;
    :try_end_0
    .catch LM2/f$d; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    invoke-virtual {p0, v2}, LM2/a;->B(Lq2/Y;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catch_0
    move-exception v0

    .line 122
    iput-object v0, p0, LM2/f;->v:LM2/f$d;

    .line 123
    .line 124
    :goto_5
    iget-object v0, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ge v1, v0, :cond_6

    .line 131
    .line 132
    iget-object v0, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, LM2/e;

    .line 139
    .line 140
    iget-object v2, p0, LM2/f;->v:LM2/f$d;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, LM2/e;->v(LM2/f$d;)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v1, v1, 0x1

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_6
    return-void
.end method


# virtual methods
.method protected C()V
    .locals 1

    .line 1
    invoke-super {p0}, LM2/h;->C()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LM2/f;->v:LM2/f$d;

    .line 6
    .line 7
    iput-object v0, p0, LM2/f;->u:LM2/f$c;

    .line 8
    .line 9
    return-void
.end method

.method protected Q(Lq2/Y;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/f;->v:LM2/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1}, LM2/f;->T(Lq2/Y;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(Lq2/C;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LM2/p0;->a()Lq2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lq2/C;->f:Lq2/C$d;

    .line 6
    .line 7
    iget-object v1, p1, Lq2/C;->f:Lq2/C$d;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lq2/C$d;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LM2/D;->e(Lq2/C;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public f(LM2/D$b;LQ2/b;J)LM2/C;
    .locals 7

    .line 1
    new-instance v0, LM2/e;

    .line 2
    .line 3
    iget-object v1, p0, LM2/p0;->k:LM2/D;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2, p3, p4}, LM2/D;->f(LM2/D$b;LQ2/b;J)LM2/C;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, p0, LM2/f;->o:Z

    .line 10
    .line 11
    iget-wide v3, p0, LM2/f;->w:J

    .line 12
    .line 13
    iget-wide v5, p0, LM2/f;->x:J

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, LM2/e;-><init>(LM2/C;ZJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/f;->v:LM2/f$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, LM2/h;->l()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    throw v0
.end method

.method public m(LM2/C;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 11
    .line 12
    check-cast p1, LM2/e;

    .line 13
    .line 14
    iget-object p1, p1, LM2/e;->a:LM2/C;

    .line 15
    .line 16
    invoke-interface {v0, p1}, LM2/D;->m(LM2/C;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LM2/f;->s:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-boolean p1, p0, LM2/f;->p:Z

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, LM2/f;->u:LM2/f$c;

    .line 32
    .line 33
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, LM2/f$c;

    .line 38
    .line 39
    iget-object p1, p1, LM2/w;->e:Lq2/Y;

    .line 40
    .line 41
    invoke-direct {p0, p1}, LM2/f;->T(Lq2/Y;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
