.class public final LH2/f;
.super LH2/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH2/f$d;,
        LH2/f$f;,
        LH2/f$h;,
        LH2/f$b;,
        LH2/f$c;,
        LH2/f$e;,
        LH2/f$g;
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:J

.field public final f:Z

.field public final g:Z

.field public final h:J

.field public final i:Z

.field public final j:I

.field public final k:J

.field public final l:I

.field public final m:J

.field public final n:J

.field public final o:Z

.field public final p:Z

.field public final q:Lq2/q;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/Map;

.field public final u:J

.field public final v:LH2/f$h;

.field public final w:LP9/u;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLq2/q;Ljava/util/List;Ljava/util/List;LH2/f$h;Ljava/util/Map;Ljava/util/List;)V
    .locals 4

    .line 1
    move/from16 v0, p18

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, v0}, LH2/j;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, LH2/f;->d:I

    .line 7
    .line 8
    iput-wide p7, p0, LH2/f;->h:J

    .line 9
    .line 10
    iput-boolean p6, p0, LH2/f;->g:Z

    .line 11
    .line 12
    iput-boolean p9, p0, LH2/f;->i:Z

    .line 13
    .line 14
    iput p10, p0, LH2/f;->j:I

    .line 15
    .line 16
    move-wide p1, p11

    .line 17
    iput-wide p1, p0, LH2/f;->k:J

    .line 18
    .line 19
    move/from16 p1, p13

    .line 20
    .line 21
    iput p1, p0, LH2/f;->l:I

    .line 22
    .line 23
    move-wide/from16 p1, p14

    .line 24
    .line 25
    iput-wide p1, p0, LH2/f;->m:J

    .line 26
    .line 27
    move-wide/from16 p1, p16

    .line 28
    .line 29
    iput-wide p1, p0, LH2/f;->n:J

    .line 30
    .line 31
    move/from16 p1, p19

    .line 32
    .line 33
    iput-boolean p1, p0, LH2/f;->o:Z

    .line 34
    .line 35
    move/from16 p1, p20

    .line 36
    .line 37
    iput-boolean p1, p0, LH2/f;->p:Z

    .line 38
    .line 39
    move-object/from16 p1, p21

    .line 40
    .line 41
    iput-object p1, p0, LH2/f;->q:Lq2/q;

    .line 42
    .line 43
    invoke-static/range {p22 .. p22}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LH2/f;->r:Ljava/util/List;

    .line 48
    .line 49
    invoke-static/range {p23 .. p23}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, LH2/f;->s:Ljava/util/List;

    .line 54
    .line 55
    invoke-static/range {p25 .. p25}, LP9/v;->d(Ljava/util/Map;)LP9/v;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, LH2/f;->t:Ljava/util/Map;

    .line 60
    .line 61
    invoke-static/range {p26 .. p26}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, LH2/f;->w:LP9/u;

    .line 66
    .line 67
    invoke-interface/range {p23 .. p23}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const-wide/16 p2, 0x0

    .line 72
    .line 73
    if-nez p1, :cond_0

    .line 74
    .line 75
    invoke-static/range {p23 .. p23}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, LH2/f$d;

    .line 80
    .line 81
    iget-wide v0, p1, LH2/f$g;->e:J

    .line 82
    .line 83
    iget-wide v2, p1, LH2/f$g;->c:J

    .line 84
    .line 85
    add-long/2addr v0, v2

    .line 86
    iput-wide v0, p0, LH2/f;->u:J

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_1

    .line 94
    .line 95
    invoke-static/range {p22 .. p22}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, LH2/f$f;

    .line 100
    .line 101
    iget-wide v0, p1, LH2/f$g;->e:J

    .line 102
    .line 103
    iget-wide v2, p1, LH2/f$g;->c:J

    .line 104
    .line 105
    add-long/2addr v0, v2

    .line 106
    iput-wide v0, p0, LH2/f;->u:J

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    iput-wide p2, p0, LH2/f;->u:J

    .line 110
    .line 111
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmp-long p1, p4, v0

    .line 117
    .line 118
    if-nez p1, :cond_2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    cmp-long p1, p4, p2

    .line 122
    .line 123
    if-ltz p1, :cond_3

    .line 124
    .line 125
    iget-wide v0, p0, LH2/f;->u:J

    .line 126
    .line 127
    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    goto :goto_1

    .line 132
    :cond_3
    iget-wide v0, p0, LH2/f;->u:J

    .line 133
    .line 134
    add-long/2addr v0, p4

    .line 135
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    :goto_1
    iput-wide v0, p0, LH2/f;->e:J

    .line 140
    .line 141
    cmp-long p1, p4, p2

    .line 142
    .line 143
    if-ltz p1, :cond_4

    .line 144
    .line 145
    const/4 p1, 0x1

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    const/4 p1, 0x0

    .line 148
    :goto_2
    iput-boolean p1, p0, LH2/f;->f:Z

    .line 149
    .line 150
    move-object/from16 p1, p24

    .line 151
    .line 152
    iput-object p1, p0, LH2/f;->v:LH2/f$h;

    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LH2/f;->b(Ljava/util/List;)LH2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Ljava/util/List;)LH2/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public c(JI)LH2/f;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LH2/f;

    .line 4
    .line 5
    iget v2, v0, LH2/f;->d:I

    .line 6
    .line 7
    iget-object v3, v0, LH2/j;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, LH2/j;->b:Ljava/util/List;

    .line 10
    .line 11
    iget-wide v5, v0, LH2/f;->e:J

    .line 12
    .line 13
    iget-boolean v7, v0, LH2/f;->g:Z

    .line 14
    .line 15
    iget-wide v12, v0, LH2/f;->k:J

    .line 16
    .line 17
    iget v14, v0, LH2/f;->l:I

    .line 18
    .line 19
    iget-wide v8, v0, LH2/f;->m:J

    .line 20
    .line 21
    iget-wide v10, v0, LH2/f;->n:J

    .line 22
    .line 23
    iget-boolean v15, v0, LH2/j;->c:Z

    .line 24
    .line 25
    move-object/from16 v16, v1

    .line 26
    .line 27
    iget-boolean v1, v0, LH2/f;->o:Z

    .line 28
    .line 29
    move/from16 v20, v1

    .line 30
    .line 31
    iget-boolean v1, v0, LH2/f;->p:Z

    .line 32
    .line 33
    move/from16 v21, v1

    .line 34
    .line 35
    iget-object v1, v0, LH2/f;->q:Lq2/q;

    .line 36
    .line 37
    move-object/from16 v22, v1

    .line 38
    .line 39
    iget-object v1, v0, LH2/f;->r:Ljava/util/List;

    .line 40
    .line 41
    move-object/from16 v23, v1

    .line 42
    .line 43
    iget-object v1, v0, LH2/f;->s:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v24, v1

    .line 46
    .line 47
    iget-object v1, v0, LH2/f;->v:LH2/f$h;

    .line 48
    .line 49
    move-object/from16 v25, v1

    .line 50
    .line 51
    iget-object v1, v0, LH2/f;->t:Ljava/util/Map;

    .line 52
    .line 53
    move-object/from16 v26, v1

    .line 54
    .line 55
    iget-object v1, v0, LH2/f;->w:LP9/u;

    .line 56
    .line 57
    move-wide/from16 v17, v10

    .line 58
    .line 59
    const/4 v10, 0x1

    .line 60
    move/from16 v11, p3

    .line 61
    .line 62
    move-object/from16 v27, v1

    .line 63
    .line 64
    move/from16 v19, v15

    .line 65
    .line 66
    move-object/from16 v1, v16

    .line 67
    .line 68
    move-wide v15, v8

    .line 69
    move-wide/from16 v8, p1

    .line 70
    .line 71
    invoke-direct/range {v1 .. v27}, LH2/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLq2/q;Ljava/util/List;Ljava/util/List;LH2/f$h;Ljava/util/Map;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    return-object v16
.end method

.method public d()LH2/f;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LH2/f;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v2, LH2/f;

    .line 9
    .line 10
    iget v3, v0, LH2/f;->d:I

    .line 11
    .line 12
    iget-object v4, v0, LH2/j;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, LH2/j;->b:Ljava/util/List;

    .line 15
    .line 16
    iget-wide v6, v0, LH2/f;->e:J

    .line 17
    .line 18
    iget-boolean v8, v0, LH2/f;->g:Z

    .line 19
    .line 20
    iget-wide v9, v0, LH2/f;->h:J

    .line 21
    .line 22
    iget-boolean v11, v0, LH2/f;->i:Z

    .line 23
    .line 24
    iget v12, v0, LH2/f;->j:I

    .line 25
    .line 26
    iget-wide v13, v0, LH2/f;->k:J

    .line 27
    .line 28
    iget v15, v0, LH2/f;->l:I

    .line 29
    .line 30
    move-object/from16 v16, v2

    .line 31
    .line 32
    iget-wide v1, v0, LH2/f;->m:J

    .line 33
    .line 34
    move-wide/from16 v17, v1

    .line 35
    .line 36
    iget-wide v1, v0, LH2/f;->n:J

    .line 37
    .line 38
    move-wide/from16 v19, v1

    .line 39
    .line 40
    iget-boolean v1, v0, LH2/j;->c:Z

    .line 41
    .line 42
    iget-boolean v2, v0, LH2/f;->p:Z

    .line 43
    .line 44
    move/from16 v21, v1

    .line 45
    .line 46
    iget-object v1, v0, LH2/f;->q:Lq2/q;

    .line 47
    .line 48
    move-object/from16 v23, v1

    .line 49
    .line 50
    iget-object v1, v0, LH2/f;->r:Ljava/util/List;

    .line 51
    .line 52
    move-object/from16 v24, v1

    .line 53
    .line 54
    iget-object v1, v0, LH2/f;->s:Ljava/util/List;

    .line 55
    .line 56
    move-object/from16 v25, v1

    .line 57
    .line 58
    iget-object v1, v0, LH2/f;->v:LH2/f$h;

    .line 59
    .line 60
    move-object/from16 v26, v1

    .line 61
    .line 62
    iget-object v1, v0, LH2/f;->t:Ljava/util/Map;

    .line 63
    .line 64
    move-object/from16 v27, v1

    .line 65
    .line 66
    iget-object v1, v0, LH2/f;->w:LP9/u;

    .line 67
    .line 68
    move/from16 v22, v2

    .line 69
    .line 70
    move-object/from16 v2, v16

    .line 71
    .line 72
    move-wide/from16 v16, v17

    .line 73
    .line 74
    move-wide/from16 v18, v19

    .line 75
    .line 76
    move/from16 v20, v21

    .line 77
    .line 78
    const/16 v21, 0x1

    .line 79
    .line 80
    move-object/from16 v28, v1

    .line 81
    .line 82
    invoke-direct/range {v2 .. v28}, LH2/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLq2/q;Ljava/util/List;Ljava/util/List;LH2/f$h;Ljava/util/Map;Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    return-object v2
.end method

.method public e()J
    .locals 4

    .line 1
    iget-wide v0, p0, LH2/f;->h:J

    .line 2
    .line 3
    iget-wide v2, p0, LH2/f;->u:J

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    return-wide v0
.end method

.method public f(LH2/f;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iget-wide v1, p0, LH2/f;->k:J

    .line 5
    .line 6
    iget-wide v3, p1, LH2/f;->k:J

    .line 7
    .line 8
    cmp-long v5, v1, v3

    .line 9
    .line 10
    if-lez v5, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    cmp-long v1, v1, v3

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    iget-object v1, p0, LH2/f;->r:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v3, p1, LH2/f;->r:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sub-int/2addr v1, v3

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    if-lez v1, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    return v2

    .line 38
    :cond_3
    iget-object v1, p0, LH2/f;->s:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v3, p1, LH2/f;->s:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-gt v1, v3, :cond_5

    .line 51
    .line 52
    if-ne v1, v3, :cond_4

    .line 53
    .line 54
    iget-boolean v1, p0, LH2/f;->o:Z

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-boolean p1, p1, LH2/f;->o:Z

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    return v2

    .line 64
    :cond_5
    :goto_0
    return v0
.end method
