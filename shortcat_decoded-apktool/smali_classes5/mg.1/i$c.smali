.class public final Lmg/i$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ltg/Z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:J

.field private b:Z

.field private final c:Ltg/h;

.field private final d:Ltg/h;

.field private e:Ldg/t;

.field private f:Z

.field final synthetic g:Lmg/i;


# direct methods
.method public constructor <init>(Lmg/i;JZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmg/i$c;->g:Lmg/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Lmg/i$c;->a:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lmg/i$c;->b:Z

    .line 9
    .line 10
    new-instance p1, Ltg/h;

    .line 11
    .line 12
    invoke-direct {p1}, Ltg/h;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lmg/i$c;->c:Ltg/h;

    .line 16
    .line 17
    new-instance p1, Ltg/h;

    .line 18
    .line 19
    invoke-direct {p1}, Ltg/h;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lmg/i$c;->d:Ltg/h;

    .line 23
    .line 24
    return-void
.end method

.method private final k(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 2
    .line 3
    sget-boolean v1, Lfg/e;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Thread "

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, " MUST NOT hold lock on "

    .line 38
    .line 39
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    :goto_0
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 54
    .line 55
    invoke-virtual {v0}, Lmg/i;->g()Lmg/f;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p1, p2}, Lmg/f;->i2(J)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public N0(Ltg/h;J)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_9

    .line 17
    .line 18
    :goto_0
    iget-object v6, v1, Lmg/i$c;->g:Lmg/i;

    .line 19
    .line 20
    monitor-enter v6

    .line 21
    :try_start_0
    invoke-virtual {v6}, Lmg/i;->m()Lmg/i$d;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v7}, Ltg/f;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    .line 28
    :try_start_1
    invoke-virtual {v6}, Lmg/i;->h()Lmg/b;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    iget-boolean v7, v1, Lmg/i$c;->b:Z

    .line 35
    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    invoke-virtual {v6}, Lmg/i;->i()Ljava/io/IOException;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    new-instance v7, Lmg/n;

    .line 45
    .line 46
    invoke-virtual {v6}, Lmg/i;->h()Lmg/b;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v7, v8}, Lmg/n;-><init>(Lmg/b;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_0
    const/4 v7, 0x0

    .line 61
    :cond_1
    :goto_1
    iget-boolean v8, v1, Lmg/i$c;->f:Z

    .line 62
    .line 63
    if-nez v8, :cond_8

    .line 64
    .line 65
    iget-object v8, v1, Lmg/i$c;->d:Ltg/h;

    .line 66
    .line 67
    invoke-virtual {v8}, Ltg/h;->size()J

    .line 68
    .line 69
    .line 70
    move-result-wide v8

    .line 71
    cmp-long v8, v8, v4

    .line 72
    .line 73
    const-wide/16 v9, -0x1

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    if-lez v8, :cond_2

    .line 77
    .line 78
    iget-object v8, v1, Lmg/i$c;->d:Ltg/h;

    .line 79
    .line 80
    invoke-virtual {v8}, Ltg/h;->size()J

    .line 81
    .line 82
    .line 83
    move-result-wide v12

    .line 84
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v12

    .line 88
    invoke-virtual {v8, v0, v12, v13}, Ltg/h;->N0(Ltg/h;J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    invoke-virtual {v6}, Lmg/i;->l()J

    .line 93
    .line 94
    .line 95
    move-result-wide v14

    .line 96
    add-long/2addr v14, v12

    .line 97
    invoke-virtual {v6, v14, v15}, Lmg/i;->A(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Lmg/i;->l()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    invoke-virtual {v6}, Lmg/i;->k()J

    .line 105
    .line 106
    .line 107
    move-result-wide v16

    .line 108
    sub-long v14, v14, v16

    .line 109
    .line 110
    if-nez v7, :cond_4

    .line 111
    .line 112
    invoke-virtual {v6}, Lmg/i;->g()Lmg/f;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v8}, Lmg/f;->G0()Lmg/m;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v8}, Lmg/m;->c()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    div-int/lit8 v8, v8, 0x2

    .line 125
    .line 126
    int-to-long v4, v8

    .line 127
    cmp-long v4, v14, v4

    .line 128
    .line 129
    if-ltz v4, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6}, Lmg/i;->g()Lmg/f;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v6}, Lmg/i;->j()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-virtual {v4, v5, v14, v15}, Lmg/f;->o2(IJ)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Lmg/i;->l()J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    invoke-virtual {v6, v4, v5}, Lmg/i;->z(J)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    iget-boolean v4, v1, Lmg/i$c;->b:Z

    .line 151
    .line 152
    if-nez v4, :cond_3

    .line 153
    .line 154
    if-nez v7, :cond_3

    .line 155
    .line 156
    invoke-virtual {v6}, Lmg/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    .line 158
    .line 159
    const/4 v11, 0x1

    .line 160
    :cond_3
    move-wide v12, v9

    .line 161
    :cond_4
    :goto_2
    :try_start_2
    invoke-virtual {v6}, Lmg/i;->m()Lmg/i$d;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v4}, Lmg/i$d;->C()V

    .line 166
    .line 167
    .line 168
    sget-object v4, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    .line 170
    monitor-exit v6

    .line 171
    if-eqz v11, :cond_5

    .line 172
    .line 173
    const-wide/16 v4, 0x0

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_5
    cmp-long v0, v12, v9

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    return-wide v12

    .line 182
    :cond_6
    if-nez v7, :cond_7

    .line 183
    .line 184
    return-wide v9

    .line 185
    :cond_7
    throw v7

    .line 186
    :catchall_1
    move-exception v0

    .line 187
    goto :goto_4

    .line 188
    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 189
    .line 190
    const-string v2, "stream closed"

    .line 191
    .line 192
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 196
    :goto_3
    :try_start_4
    invoke-virtual {v6}, Lmg/i;->m()Lmg/i$d;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Lmg/i$d;->C()V

    .line 201
    .line 202
    .line 203
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 204
    :goto_4
    monitor-exit v6

    .line 205
    throw v0

    .line 206
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v4, "byteCount < 0: "

    .line 212
    .line 213
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v2
.end method

.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lmg/i$c;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lmg/i$c;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lmg/i$c;->f:Z

    .line 6
    .line 7
    iget-object v1, p0, Lmg/i$c;->d:Ltg/h;

    .line 8
    .line 9
    invoke-virtual {v1}, Ltg/h;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object v3, p0, Lmg/i$c;->d:Ltg/h;

    .line 14
    .line 15
    invoke-virtual {v3}, Ltg/h;->g()V

    .line 16
    .line 17
    .line 18
    const-string v3, "null cannot be cast to non-null type java.lang.Object"

    .line 19
    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 24
    .line 25
    .line 26
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    cmp-long v0, v1, v3

    .line 32
    .line 33
    if-lez v0, :cond_0

    .line 34
    .line 35
    invoke-direct {p0, v1, v2}, Lmg/i$c;->k(J)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 39
    .line 40
    invoke-virtual {v0}, Lmg/i;->b()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    monitor-exit v0

    .line 46
    throw v1
.end method

.method public final g(Ltg/j;J)V
    .locals 11

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 7
    .line 8
    sget-boolean v1, Lfg/e;->h:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p3, "Thread "

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    :goto_0
    move-wide v0, p2

    .line 59
    :goto_1
    const-wide/16 v2, 0x0

    .line 60
    .line 61
    cmp-long v4, v0, v2

    .line 62
    .line 63
    if-lez v4, :cond_9

    .line 64
    .line 65
    iget-object v4, p0, Lmg/i$c;->g:Lmg/i;

    .line 66
    .line 67
    monitor-enter v4

    .line 68
    :try_start_0
    iget-boolean v5, p0, Lmg/i$c;->b:Z

    .line 69
    .line 70
    iget-object v6, p0, Lmg/i$c;->d:Ltg/h;

    .line 71
    .line 72
    invoke-virtual {v6}, Ltg/h;->size()J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    add-long/2addr v6, v0

    .line 77
    iget-wide v8, p0, Lmg/i$c;->a:J

    .line 78
    .line 79
    cmp-long v6, v6, v8

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x1

    .line 83
    if-lez v6, :cond_2

    .line 84
    .line 85
    move v6, v8

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move v6, v7

    .line 88
    :goto_2
    sget-object v9, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    .line 90
    monitor-exit v4

    .line 91
    if-eqz v6, :cond_3

    .line 92
    .line 93
    invoke-interface {p1, v0, v1}, Ltg/j;->skip(J)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lmg/i$c;->g:Lmg/i;

    .line 97
    .line 98
    sget-object p2, Lmg/b;->f:Lmg/b;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lmg/i;->f(Lmg/b;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    if-eqz v5, :cond_4

    .line 105
    .line 106
    invoke-interface {p1, v0, v1}, Ltg/j;->skip(J)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    iget-object v4, p0, Lmg/i$c;->c:Ltg/h;

    .line 111
    .line 112
    invoke-interface {p1, v4, v0, v1}, Ltg/Z;->N0(Ltg/h;J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    const-wide/16 v9, -0x1

    .line 117
    .line 118
    cmp-long v6, v4, v9

    .line 119
    .line 120
    if-eqz v6, :cond_8

    .line 121
    .line 122
    sub-long/2addr v0, v4

    .line 123
    iget-object v4, p0, Lmg/i$c;->g:Lmg/i;

    .line 124
    .line 125
    monitor-enter v4

    .line 126
    :try_start_1
    iget-boolean v5, p0, Lmg/i$c;->f:Z

    .line 127
    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    iget-object v2, p0, Lmg/i$c;->c:Ltg/h;

    .line 131
    .line 132
    invoke-virtual {v2}, Ltg/h;->g()V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_0
    move-exception p1

    .line 137
    goto :goto_4

    .line 138
    :cond_5
    iget-object v5, p0, Lmg/i$c;->d:Ltg/h;

    .line 139
    .line 140
    invoke-virtual {v5}, Ltg/h;->size()J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    cmp-long v2, v5, v2

    .line 145
    .line 146
    if-nez v2, :cond_6

    .line 147
    .line 148
    move v7, v8

    .line 149
    :cond_6
    iget-object v2, p0, Lmg/i$c;->d:Ltg/h;

    .line 150
    .line 151
    iget-object v3, p0, Lmg/i$c;->c:Ltg/h;

    .line 152
    .line 153
    invoke-virtual {v2, v3}, Ltg/h;->O0(Ltg/Z;)J

    .line 154
    .line 155
    .line 156
    if-eqz v7, :cond_7

    .line 157
    .line 158
    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    .line 159
    .line 160
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    .line 166
    :cond_7
    :goto_3
    monitor-exit v4

    .line 167
    goto :goto_1

    .line 168
    :goto_4
    monitor-exit v4

    .line 169
    throw p1

    .line 170
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    .line 171
    .line 172
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :catchall_1
    move-exception p1

    .line 177
    monitor-exit v4

    .line 178
    throw p1

    .line 179
    :cond_9
    invoke-direct {p0, p2, p3}, Lmg/i$c;->k(J)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lmg/i$c;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final j(Ldg/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmg/i$c;->e:Ldg/t;

    .line 2
    .line 3
    return-void
.end method

.method public t()Ltg/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lmg/i$c;->g:Lmg/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmg/i;->m()Lmg/i$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
