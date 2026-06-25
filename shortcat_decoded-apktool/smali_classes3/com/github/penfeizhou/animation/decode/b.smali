.class public abstract Lcom/github/penfeizhou/animation/decode/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/penfeizhou/animation/decode/b$k;,
        Lcom/github/penfeizhou/animation/decode/b$j;
    }
.end annotation


# static fields
.field private static final u:Ljava/lang/String; = "b"

.field private static final v:Landroid/graphics/Rect;


# instance fields
.field private final a:I

.field private final b:Lj8/b;

.field private final c:Landroid/os/Handler;

.field protected d:Ljava/util/List;

.field protected e:I

.field private f:I

.field private g:Ljava/lang/Integer;

.field private final h:Ljava/util/Set;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final j:Ljava/lang/Runnable;

.field protected k:I

.field private final l:Ljava/util/Set;

.field private final m:Ljava/lang/Object;

.field protected n:Ljava/util/Map;

.field protected o:Ljava/nio/ByteBuffer;

.field protected volatile p:Landroid/graphics/Rect;

.field private q:Lcom/github/penfeizhou/animation/io/e;

.field private r:Lcom/github/penfeizhou/animation/io/Reader;

.field private s:Z

.field private volatile t:Lcom/github/penfeizhou/animation/decode/b$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lj8/b;Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->g:Ljava/lang/Integer;

    .line 16
    .line 17
    new-instance v1, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->h:Ljava/util/Set;

    .line 23
    .line 24
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    new-instance v2, Lcom/github/penfeizhou/animation/decode/b$a;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/github/penfeizhou/animation/decode/b$a;-><init>(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 38
    .line 39
    iput v3, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 40
    .line 41
    new-instance v2, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 47
    .line 48
    new-instance v2, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->m:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance v2, Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->C()Lcom/github/penfeizhou/animation/io/e;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->q:Lcom/github/penfeizhou/animation/io/e;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    iput-boolean v0, p0, Lcom/github/penfeizhou/animation/decode/b;->s:Z

    .line 72
    .line 73
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b$k;->a:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 74
    .line 75
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 76
    .line 77
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->b:Lj8/b;

    .line 78
    .line 79
    if-eqz p2, :cond_0

    .line 80
    .line 81
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-static {}, Le8/a;->b()Le8/a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Le8/a;->a()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/b;->a:I

    .line 93
    .line 94
    new-instance p2, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-static {}, Le8/a;->b()Le8/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0, p1}, Le8/a;->c(I)Landroid/os/Looper;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 105
    .line 106
    .line 107
    iput-object p2, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 108
    .line 109
    return-void
.end method

.method private D(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    int-to-long v2, p1

    .line 13
    mul-long/2addr v0, v2

    .line 14
    iget p1, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 15
    .line 16
    int-to-long v2, p1

    .line 17
    int-to-long v4, p1

    .line 18
    mul-long/2addr v2, v4

    .line 19
    div-long/2addr v0, v2

    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    const-wide/16 v2, 0x4

    .line 24
    .line 25
    mul-long/2addr v0, v2

    .line 26
    long-to-int p1, v0

    .line 27
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->q:Lcom/github/penfeizhou/animation/io/e;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->C()Lcom/github/penfeizhou/animation/io/e;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->q:Lcom/github/penfeizhou/animation/io/e;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void

    .line 47
    :goto_0
    sget-object v2, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 48
    .line 49
    long-to-double v3, v0

    .line 50
    const-wide/high16 v5, 0x4130000000000000L    # 1048576.0

    .line 51
    .line 52
    div-double/2addr v3, v5

    .line 53
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)"

    .line 66
    .line 67
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 78
    .line 79
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 80
    .line 81
    throw p1
.end method

.method private E()V
    .locals 8

    .line 1
    const-string v0, " Set state to RUNNING,cost "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    :try_start_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->w()I

    .line 15
    .line 16
    .line 17
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    :try_start_1
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->b:Lj8/b;

    .line 25
    .line 26
    invoke-interface {v3}, Lj8/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0, v3}, Lcom/github/penfeizhou/animation/decode/b;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iput-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v3

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-interface {v3}, Lcom/github/penfeizhou/animation/io/Reader;->reset()V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lcom/github/penfeizhou/animation/decode/b;->K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {p0, v3}, Lcom/github/penfeizhou/animation/decode/b;->D(Landroid/graphics/Rect;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :catchall_1
    move-exception v3

    .line 57
    goto :goto_6

    .line 58
    :cond_1
    :goto_2
    sget-object v3, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    sub-long/2addr v5, v1

    .line 80
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b$k;->b:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 93
    .line 94
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->z()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    iget-boolean v0, p0, Lcom/github/penfeizhou/animation/decode/b;->s:Z

    .line 101
    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " No need to started"

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_3
    :goto_3
    const/4 v0, -0x1

    .line 131
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 132
    .line 133
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 134
    .line 135
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->h:Ljava/util/Set;

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_4

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Lcom/github/penfeizhou/animation/decode/b$j;

    .line 162
    .line 163
    invoke-interface {v1}, Lcom/github/penfeizhou/animation/decode/b$j;->b()V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_4
    :goto_5
    return-void

    .line 168
    :goto_6
    sget-object v4, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 169
    .line 170
    new-instance v5, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    sub-long/2addr v6, v1

    .line 190
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b$k;->b:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 201
    .line 202
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 203
    .line 204
    throw v3
.end method

.method private F()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->m:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_5

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iput-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 64
    .line 65
    .line 66
    :try_start_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->close()V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->q:Lcom/github/penfeizhou/animation/io/e;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/e;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 87
    .line 88
    .line 89
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->M()V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b$k;->a:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->h:Ljava/util/Set;

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lcom/github/penfeizhou/animation/decode/b$j;

    .line 113
    .line 114
    invoke-interface {v1}, Lcom/github/penfeizhou/animation/decode/b$j;->c()V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    return-void

    .line 119
    :goto_5
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    throw v1
.end method

.method private T()J
    .locals 2

    .line 1
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->w()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 15
    .line 16
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->f:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/b;->f:I

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->u(I)Lcom/github/penfeizhou/animation/decode/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_1
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->O(Lcom/github/penfeizhou/animation/decode/a;)V

    .line 34
    .line 35
    .line 36
    iget v0, v0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 37
    .line 38
    int-to-long v0, v0

    .line 39
    return-wide v0
.end method

.method static synthetic a(Lcom/github/penfeizhou/animation/decode/b;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lcom/github/penfeizhou/animation/decode/b;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic c(Lcom/github/penfeizhou/animation/decode/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->E()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic d(Lcom/github/penfeizhou/animation/decode/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->F()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic e(Lcom/github/penfeizhou/animation/decode/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/b;->f:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic f(Lcom/github/penfeizhou/animation/decode/b;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/penfeizhou/animation/decode/b;->s:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic g(Lcom/github/penfeizhou/animation/decode/b;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->T()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method static synthetic h(Lcom/github/penfeizhou/animation/decode/b;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i(Lcom/github/penfeizhou/animation/decode/b;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(Lcom/github/penfeizhou/animation/decode/b;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->h:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k(Lcom/github/penfeizhou/animation/decode/b;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic l(Lcom/github/penfeizhou/animation/decode/b;Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic m(Lcom/github/penfeizhou/animation/decode/b;)Lj8/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/penfeizhou/animation/decode/b;->b:Lj8/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic n(Lcom/github/penfeizhou/animation/decode/b;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/penfeizhou/animation/decode/b;->D(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic o()Landroid/graphics/Rect;
    .locals 1

    .line 1
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method private q()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->w()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->z()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-gtz v0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->f:I

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->z()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-int/2addr v3, v2

    .line 31
    if-ge v0, v3, :cond_3

    .line 32
    .line 33
    return v2

    .line 34
    :cond_3
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->f:I

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->z()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int/2addr v3, v2

    .line 41
    if-ne v0, v3, :cond_4

    .line 42
    .line 43
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->w()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-int/2addr v3, v2

    .line 50
    if-ge v0, v3, :cond_4

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    iput-boolean v2, p0, Lcom/github/penfeizhou/animation/decode/b;->s:Z

    .line 54
    .line 55
    return v1
.end method

.method private r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    return-object v0
.end method

.method private z()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->x()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method


# virtual methods
.method protected abstract A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 2
    .line 3
    return v0
.end method

.method protected abstract C()Lcom/github/penfeizhou/animation/io/e;
.end method

.method public G()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public H()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 2
    .line 3
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->b:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 8
    .line 9
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->c:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method protected I(II)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v3, v2

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_3

    .line 17
    .line 18
    mul-int v3, p1, p2

    .line 19
    .line 20
    mul-int/lit8 v3, v3, 0x4

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Landroid/graphics/Bitmap;

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-lt v5, v3, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-ne v1, p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eq v1, p2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_6

    .line 54
    :cond_0
    :goto_1
    if-lez p1, :cond_1

    .line 55
    .line 56
    if-lez p2, :cond_1

    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    invoke-virtual {v4, p1, p2, v1}, Landroid/graphics/Bitmap;->reconfigure(IILandroid/graphics/Bitmap$Config;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    invoke-virtual {v4, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 65
    .line 66
    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    return-object v4

    .line 69
    :cond_2
    move-object v3, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    if-lez p1, :cond_5

    .line 72
    .line 73
    if-gtz p2, :cond_4

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    :try_start_1
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 77
    .line 78
    invoke-static {p1, p2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    goto :goto_4

    .line 83
    :catch_0
    move-exception p1

    .line 84
    goto :goto_2

    .line 85
    :catch_1
    move-exception p1

    .line 86
    goto :goto_3

    .line 87
    :goto_2
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    goto :goto_4

    .line 91
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    .line 93
    .line 94
    :goto_4
    monitor-exit v0

    .line 95
    return-object v3

    .line 96
    :cond_5
    :goto_5
    monitor-exit v0

    .line 97
    return-object v2

    .line 98
    :goto_6
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    throw p1
.end method

.method public J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected abstract K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
.end method

.method protected L(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
.end method

.method protected abstract M()V
.end method

.method public N(Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/github/penfeizhou/animation/decode/b$c;-><init>(Lcom/github/penfeizhou/animation/decode/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected abstract O(Lcom/github/penfeizhou/animation/decode/a;)V
.end method

.method public P()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$h;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/github/penfeizhou/animation/decode/b$h;-><init>(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public Q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public R(II)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/b;->t(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->B()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eq p1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->H()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->j:Ljava/lang/Runnable;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$i;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/b$i;-><init>(Lcom/github/penfeizhou/animation/decode/b;IZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    return p1
.end method

.method public S()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 2
    .line 3
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 9
    .line 10
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->b:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 11
    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 15
    .line 16
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->c:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 22
    .line 23
    sget-object v2, Lcom/github/penfeizhou/animation/decode/b$k;->d:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 24
    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " Processing,wait for finish at "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-ne v0, v1, :cond_3

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->E()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 77
    .line 78
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$f;

    .line 79
    .line 80
    invoke-direct {v1, p0}, Lcom/github/penfeizhou/animation/decode/b$f;-><init>(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    :goto_0
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v2, " Already started"

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public U()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 2
    .line 3
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 9
    .line 10
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->d:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 11
    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 15
    .line 16
    sget-object v2, Lcom/github/penfeizhou/animation/decode/b$k;->a:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 17
    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 22
    .line 23
    sget-object v2, Lcom/github/penfeizhou/animation/decode/b$k;->c:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 24
    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "Processing,wait for finish at "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-ne v0, v1, :cond_3

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->F()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 77
    .line 78
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$g;

    .line 79
    .line 80
    invoke-direct {v1, p0}, Lcom/github/penfeizhou/animation/decode/b$g;-><init>(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    :goto_0
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v2, "No need to stop"

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/github/penfeizhou/animation/decode/b$d;-><init>(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public p(Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/github/penfeizhou/animation/decode/b$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/github/penfeizhou/animation/decode/b$b;-><init>(Lcom/github/penfeizhou/animation/decode/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public s()Landroid/graphics/Rect;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 6
    .line 7
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->d:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "In finishing,do not interrupt"

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->c:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v2, Lcom/github/penfeizhou/animation/decode/b$e;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, Lcom/github/penfeizhou/animation/decode/b$e;-><init>(Lcom/github/penfeizhou/animation/decode/b;Ljava/lang/Thread;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b;->v:Landroid/graphics/Rect;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 43
    .line 44
    return-object v0
.end method

.method protected t(II)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    div-int/2addr v1, p1

    .line 16
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    div-int/2addr p1, p2

    .line 25
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    :goto_0
    mul-int/lit8 p2, v0, 0x2

    .line 30
    .line 31
    if-gt p2, p1, :cond_1

    .line 32
    .line 33
    move v0, p2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return v0
.end method

.method public u(I)Lcom/github/penfeizhou/animation/decode/a;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/github/penfeizhou/animation/decode/a;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public v(I)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 2
    .line 3
    sget-object v1, Lcom/github/penfeizhou/animation/decode/b$k;->a:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/github/penfeizhou/animation/decode/b;->u:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->r()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ",stop first"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object v0, Lcom/github/penfeizhou/animation/decode/b$k;->b:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->t:Lcom/github/penfeizhou/animation/decode/b$k;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->b:Lj8/b;

    .line 59
    .line 60
    invoke-interface {v0}, Lj8/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->reset()V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->r:Lcom/github/penfeizhou/animation/io/Reader;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->D(Landroid/graphics/Rect;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    if-gez p1, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    add-int/2addr p1, v0

    .line 92
    :cond_3
    if-gez p1, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v2, p1

    .line 96
    :goto_1
    const/4 p1, -0x1

    .line 97
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 98
    .line 99
    :goto_2
    iget p1, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 100
    .line 101
    if-ge p1, v2, :cond_5

    .line 102
    .line 103
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->q()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->T()J

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->B()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    div-int/2addr p1, v0

    .line 131
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->B()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    div-int/2addr v0, v1

    .line 144
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 145
    .line 146
    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/decode/b;->F()V

    .line 156
    .line 157
    .line 158
    return-object p1
.end method

.method public w()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

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

.method protected abstract x()I
.end method

.method public y()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->l:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroid/graphics/Bitmap;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    add-int/2addr v2, v3

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v2, v1

    .line 47
    :cond_2
    monitor-exit v0

    .line 48
    return v2

    .line 49
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw v1
.end method
