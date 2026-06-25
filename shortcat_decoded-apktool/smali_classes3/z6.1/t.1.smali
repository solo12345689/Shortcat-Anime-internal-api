.class public final Lz6/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/t$a;,
        Lz6/t$b;
    }
.end annotation


# static fields
.field public static final n:Lz6/t$a;

.field private static final o:Ljava/util/concurrent/CancellationException;

.field private static final p:Ljava/util/concurrent/CancellationException;

.field private static final q:Ljava/util/concurrent/CancellationException;


# instance fields
.field private final a:Lz6/W;

.field private final b:Ly5/n;

.field private final c:Ly5/n;

.field private final d:LG6/e;

.field private final e:LG6/d;

.field private final f:Lx6/x;

.field private final g:Lx6/x;

.field private final h:Lx6/k;

.field private final i:Lcom/facebook/imagepipeline/producers/p0;

.field private final j:Ly5/n;

.field private final k:Ljava/util/concurrent/atomic/AtomicLong;

.field private final l:Ly5/n;

.field private final m:Lz6/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz6/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz6/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz6/t;->n:Lz6/t$a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 10
    .line 11
    const-string v1, "Prefetching is not enabled"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lz6/t;->o:Ljava/util/concurrent/CancellationException;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    const-string v1, "ImageRequest is null"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lz6/t;->p:Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 28
    .line 29
    const-string v1, "Modified URL is null"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lz6/t;->q:Ljava/util/concurrent/CancellationException;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Lz6/W;Ljava/util/Set;Ljava/util/Set;Ly5/n;Lx6/x;Lx6/x;Ly5/n;Lx6/k;Lcom/facebook/imagepipeline/producers/p0;Ly5/n;Ly5/n;Lu5/a;Lz6/v;)V
    .locals 0

    .line 1
    const-string p12, "producerSequenceFactory"

    .line 2
    .line 3
    invoke-static {p1, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p12, "requestListeners"

    .line 7
    .line 8
    invoke-static {p2, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p12, "requestListener2s"

    .line 12
    .line 13
    invoke-static {p3, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p12, "isPrefetchEnabledSupplier"

    .line 17
    .line 18
    invoke-static {p4, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p12, "bitmapMemoryCache"

    .line 22
    .line 23
    invoke-static {p5, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p12, "encodedMemoryCache"

    .line 27
    .line 28
    invoke-static {p6, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p12, "diskCachesStoreSupplier"

    .line 32
    .line 33
    invoke-static {p7, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p12, "cacheKeyFactory"

    .line 37
    .line 38
    invoke-static {p8, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p12, "threadHandoffProducerQueue"

    .line 42
    .line 43
    invoke-static {p9, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string p12, "suppressBitmapPrefetchingSupplier"

    .line 47
    .line 48
    invoke-static {p10, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p12, "lazyDataSource"

    .line 52
    .line 53
    invoke-static {p11, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p12, "config"

    .line 57
    .line 58
    invoke-static {p13, p12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lz6/t;->a:Lz6/W;

    .line 65
    .line 66
    iput-object p4, p0, Lz6/t;->b:Ly5/n;

    .line 67
    .line 68
    iput-object p7, p0, Lz6/t;->c:Ly5/n;

    .line 69
    .line 70
    new-instance p1, LG6/c;

    .line 71
    .line 72
    invoke-direct {p1, p2}, LG6/c;-><init>(Ljava/util/Set;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lz6/t;->d:LG6/e;

    .line 76
    .line 77
    new-instance p1, LG6/b;

    .line 78
    .line 79
    invoke-direct {p1, p3}, LG6/b;-><init>(Ljava/util/Set;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lz6/t;->e:LG6/d;

    .line 83
    .line 84
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lz6/t;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 90
    .line 91
    iput-object p5, p0, Lz6/t;->f:Lx6/x;

    .line 92
    .line 93
    iput-object p6, p0, Lz6/t;->g:Lx6/x;

    .line 94
    .line 95
    iput-object p8, p0, Lz6/t;->h:Lx6/k;

    .line 96
    .line 97
    iput-object p9, p0, Lz6/t;->i:Lcom/facebook/imagepipeline/producers/p0;

    .line 98
    .line 99
    iput-object p10, p0, Lz6/t;->j:Ly5/n;

    .line 100
    .line 101
    iput-object p11, p0, Lz6/t;->l:Ly5/n;

    .line 102
    .line 103
    iput-object p13, p0, Lz6/t;->m:Lz6/v;

    .line 104
    .line 105
    return-void
.end method

.method private static final A(Landroid/net/Uri;Ls5/d;)Z
    .locals 1

    .line 1
    const-string v0, "$uri"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0}, Ls5/d;->b(Landroid/net/Uri;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method private final D(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;LG6/e;Ljava/lang/String;)LI5/c;
    .locals 8

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v7}, Lz6/t;->E(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;LG6/e;Ljava/lang/String;Ljava/util/Map;)LI5/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final E(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;LG6/e;Ljava/lang/String;Ljava/util/Map;)LI5/c;
    .locals 13

    .line 1
    move-object v2, p2

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    move-object/from16 v3, p5

    .line 5
    .line 6
    move-object/from16 v12, p7

    .line 7
    .line 8
    invoke-static {}, LL6/b;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "getMax(...)"

    .line 15
    .line 16
    if-nez v4, :cond_2

    .line 17
    .line 18
    move v4, v5

    .line 19
    new-instance v5, Lcom/facebook/imagepipeline/producers/F;

    .line 20
    .line 21
    invoke-virtual {p0, p2, v3}, Lz6/t;->s(LK6/b;LG6/e;)LG6/e;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v8, p0, Lz6/t;->e:LG6/d;

    .line 26
    .line 27
    invoke-direct {v5, v3, v8}, Lcom/facebook/imagepipeline/producers/F;-><init>(LG6/e;LG6/d;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p2}, LK6/b;->k()LK6/b$c;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, v1}, LK6/b$c;->a(LK6/b$c;LK6/b$c;)LK6/b$c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v7, v1

    .line 42
    new-instance v1, Lcom/facebook/imagepipeline/producers/l0;

    .line 43
    .line 44
    invoke-virtual {p0}, Lz6/t;->p()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {p2}, LK6/b;->p()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2}, LK6/b;->v()Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v8}, LG5/f;->n(Landroid/net/Uri;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v9, v6

    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    :goto_0
    move v9, v4

    .line 70
    :goto_1
    invoke-virtual {p2}, LK6/b;->o()Ly6/f;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    iget-object v11, p0, Lz6/t;->m:Lz6/v;

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    move-object/from16 v6, p4

    .line 78
    .line 79
    move-object/from16 v4, p6

    .line 80
    .line 81
    invoke-direct/range {v1 .. v11}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LK6/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LK6/b$c;ZZLy6/f;Lz6/v;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v12}, Lcom/facebook/imagepipeline/producers/e;->w(Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v1, v5}, LA6/c;->G(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)LI5/c;

    .line 88
    .line 89
    .line 90
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    return-object v0

    .line 92
    :goto_2
    invoke-static {v0}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_2
    move v4, v5

    .line 98
    const-string v5, "ImagePipeline#submitFetchRequest"

    .line 99
    .line 100
    invoke-static {v5}, LL6/b;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :try_start_1
    new-instance v5, Lcom/facebook/imagepipeline/producers/F;

    .line 104
    .line 105
    invoke-virtual {p0, p2, v3}, Lz6/t;->s(LK6/b;LG6/e;)LG6/e;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget-object v8, p0, Lz6/t;->e:LG6/d;

    .line 110
    .line 111
    invoke-direct {v5, v3, v8}, Lcom/facebook/imagepipeline/producers/F;-><init>(LG6/e;LG6/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    :try_start_2
    invoke-virtual {p2}, LK6/b;->k()LK6/b$c;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3, v1}, LK6/b$c;->a(LK6/b$c;LK6/b$c;)LK6/b$c;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object v7, v1

    .line 126
    new-instance v1, Lcom/facebook/imagepipeline/producers/l0;

    .line 127
    .line 128
    invoke-virtual {p0}, Lz6/t;->p()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {p2}, LK6/b;->p()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v8, :cond_4

    .line 137
    .line 138
    invoke-virtual {p2}, LK6/b;->v()Landroid/net/Uri;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v8}, LG5/f;->n(Landroid/net/Uri;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-nez v8, :cond_3

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    move v9, v6

    .line 150
    goto :goto_4

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    goto :goto_7

    .line 153
    :catch_1
    move-exception v0

    .line 154
    goto :goto_5

    .line 155
    :cond_4
    :goto_3
    move v9, v4

    .line 156
    :goto_4
    invoke-virtual {p2}, LK6/b;->o()Ly6/f;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    iget-object v11, p0, Lz6/t;->m:Lz6/v;

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    move-object/from16 v6, p4

    .line 164
    .line 165
    move-object/from16 v4, p6

    .line 166
    .line 167
    invoke-direct/range {v1 .. v11}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LK6/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LK6/b$c;ZZLy6/f;Lz6/v;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v12}, Lcom/facebook/imagepipeline/producers/e;->w(Ljava/util/Map;)V

    .line 171
    .line 172
    .line 173
    invoke-static {p1, v1, v5}, LA6/c;->G(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)LI5/c;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 177
    goto :goto_6

    .line 178
    :goto_5
    :try_start_3
    invoke-static {v0}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    :goto_6
    invoke-static {}, LL6/b;->b()V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :goto_7
    invoke-static {}, LL6/b;->b()V

    .line 187
    .line 188
    .line 189
    throw v0
.end method

.method private final F(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;Ly6/f;LG6/e;)LI5/c;
    .locals 10

    .line 1
    new-instance v3, Lcom/facebook/imagepipeline/producers/F;

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    invoke-virtual {p0, p2, v0}, Lz6/t;->s(LK6/b;LG6/e;)LG6/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lz6/t;->e:LG6/d;

    .line 10
    .line 11
    invoke-direct {v3, v0, v1}, Lcom/facebook/imagepipeline/producers/F;-><init>(LG6/e;LG6/d;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, LK6/b;->v()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getSourceUri(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lm6/b;->b:Lm6/c;

    .line 24
    .line 25
    invoke-interface {v1, v0, p4}, Lm6/c;->a(Landroid/net/Uri;Ljava/lang/Object;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    sget-object p1, Lz6/t;->q:Ljava/util/concurrent/CancellationException;

    .line 32
    .line 33
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "immediateFailedDataSource(...)"

    .line 38
    .line 39
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :goto_0
    move-object v1, p2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {p2}, LK6/c;->b(LK6/b;)LK6/c;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, v1}, LK6/c;->R(Landroid/net/Uri;)LK6/c;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, LK6/c;->a()LK6/b;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    goto :goto_0

    .line 64
    :goto_1
    :try_start_0
    invoke-virtual {v1}, LK6/b;->k()LK6/b$c;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {p2, p3}, LK6/b$c;->a(LK6/b$c;LK6/b$c;)LK6/b$c;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string p2, "getMax(...)"

    .line 73
    .line 74
    invoke-static {v5, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lcom/facebook/imagepipeline/producers/l0;

    .line 78
    .line 79
    invoke-virtual {p0}, Lz6/t;->p()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object p2, p0, Lz6/t;->m:Lz6/v;

    .line 84
    .line 85
    invoke-interface {p2}, Lz6/v;->G()Lz6/x;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-eqz p2, :cond_2

    .line 90
    .line 91
    invoke-virtual {p2}, Lz6/x;->b()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    const/4 p3, 0x1

    .line 96
    if-ne p2, p3, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1}, LK6/b;->p()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_2

    .line 103
    .line 104
    :goto_2
    move v7, p3

    .line 105
    goto :goto_3

    .line 106
    :catch_0
    move-exception v0

    .line 107
    move-object p1, v0

    .line 108
    goto :goto_4

    .line 109
    :cond_2
    const/4 p3, 0x0

    .line 110
    goto :goto_2

    .line 111
    :goto_3
    iget-object v9, p0, Lz6/t;->m:Lz6/v;

    .line 112
    .line 113
    const/4 v6, 0x1

    .line 114
    move-object v4, p4

    .line 115
    move-object v8, p5

    .line 116
    invoke-direct/range {v0 .. v9}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LK6/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LK6/b$c;ZZLy6/f;Lz6/v;)V

    .line 117
    .line 118
    .line 119
    sget-object p2, LA6/d;->j:LA6/d$a;

    .line 120
    .line 121
    invoke-virtual {p2, p1, v0, v3}, LA6/d$a;->a(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LG6/d;)LI5/c;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    return-object p1

    .line 126
    :goto_4
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method

.method public static synthetic a(Landroid/net/Uri;Ls5/d;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz6/t;->A(Landroid/net/Uri;Ls5/d;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Ls5/d;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/t;->f(Ls5/d;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final f(Ls5/d;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method public static synthetic n(Lz6/t;LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;ILjava/lang/Object;)LI5/c;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x8

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    and-int/lit8 p6, p6, 0x10

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    move-object p5, v0

    .line 17
    :cond_2
    invoke-virtual/range {p0 .. p5}, Lz6/t;->m(LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;)LI5/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final y(LK6/b;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz6/t;->c:Ly5/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "get(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lz6/c;

    .line 13
    .line 14
    iget-object v1, p0, Lz6/t;->h:Lx6/k;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v1, p1, v2}, Lx6/k;->d(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, LK6/b;->f()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Lz6/c;->c()Ly5/g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lx6/j;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lx6/j;->k(Ls5/d;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_0
    return v2

    .line 49
    :cond_1
    invoke-interface {v0}, Lz6/c;->c()Ly5/g;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/util/Map$Entry;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lx6/j;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lx6/j;->k(Ls5/d;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    return p1

    .line 90
    :cond_3
    return v2
.end method

.method private final z(Landroid/net/Uri;)Ly5/l;
    .locals 1

    .line 1
    new-instance v0, Lz6/r;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz6/r;-><init>(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final B(LK6/b;Ljava/lang/Object;)LI5/c;
    .locals 2

    .line 1
    sget-object v0, Ly6/f;->c:Ly6/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Lz6/t;->C(LK6/b;Ljava/lang/Object;Ly6/f;LG6/e;)LI5/c;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final C(LK6/b;Ljava/lang/Object;Ly6/f;LG6/e;)LI5/c;
    .locals 8

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/t;->b:Ly5/n;

    .line 7
    .line 8
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Lz6/t;->o:Ljava/util/concurrent/CancellationException;

    .line 21
    .line 22
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "immediateFailedDataSource(...)"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    if-nez p1, :cond_1

    .line 33
    .line 34
    new-instance p1, Ljava/lang/NullPointerException;

    .line 35
    .line 36
    const-string p2, "imageRequest is null"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_1
    :try_start_0
    iget-object v0, p0, Lz6/t;->a:Lz6/W;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lz6/W;->G(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v4, LK6/b$c;->b:LK6/b$c;

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    move-object v3, p1

    .line 59
    move-object v5, p2

    .line 60
    move-object v6, p3

    .line 61
    move-object v7, p4

    .line 62
    invoke-direct/range {v1 .. v7}, Lz6/t;->F(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;Ly6/f;LG6/e;)LI5/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_0
    return-object p1
.end method

.method public final c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz6/t;->e()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lz6/t;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/t;->c:Ly5/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "get(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lz6/c;

    .line 13
    .line 14
    invoke-interface {v0}, Lz6/c;->b()Lx6/j;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lx6/j;->h()Lu4/f;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lz6/c;->a()Lx6/j;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lx6/j;->h()Lu4/f;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lz6/c;->c()Ly5/g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lx6/j;

    .line 57
    .line 58
    invoke-virtual {v1}, Lx6/j;->h()Lu4/f;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    new-instance v0, Lz6/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lz6/s;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lz6/t;->f:Lx6/x;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lx6/x;->g(Ly5/l;)I

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lz6/t;->g:Lx6/x;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lx6/x;->g(Ly5/l;)I

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Landroid/net/Uri;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lz6/t;->j(Landroid/net/Uri;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lz6/t;->i(Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h(LK6/b;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lz6/t;->h:Lx6/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-interface {v0, p1, v1}, Lx6/k;->d(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lz6/t;->c:Ly5/n;

    .line 12
    .line 13
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "get(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lz6/c;

    .line 23
    .line 24
    invoke-interface {v0}, Lz6/c;->b()Lx6/j;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lx6/j;->s(Ls5/d;)Lu4/f;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lz6/c;->a()Lx6/j;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p1}, Lx6/j;->s(Ls5/d;)Lu4/f;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lz6/c;->c()Ly5/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lx6/j;

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Lx6/j;->s(Ls5/d;)Lu4/f;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    :goto_1
    return-void
.end method

.method public final i(Landroid/net/Uri;)V
    .locals 1

    .line 1
    invoke-static {p1}, LK6/b;->a(Landroid/net/Uri;)LK6/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lz6/t;->h(LK6/b;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v0, "Required value was null."

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public final j(Landroid/net/Uri;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lz6/t;->z(Landroid/net/Uri;)Ly5/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lz6/t;->f:Lx6/x;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lx6/x;->g(Ly5/l;)I

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lz6/t;->g:Lx6/x;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lx6/x;->g(Ly5/l;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final k(LK6/b;Ljava/lang/Object;)LI5/c;
    .locals 8

    .line 1
    const/16 v6, 0x18

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    invoke-static/range {v0 .. v7}, Lz6/t;->n(Lz6/t;LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;ILjava/lang/Object;)LI5/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final l(LK6/b;Ljava/lang/Object;LK6/b$c;)LI5/c;
    .locals 9

    .line 1
    const-string v0, "lowestPermittedRequestLevelOnSubmit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v7, 0x10

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    invoke-static/range {v1 .. v8}, Lz6/t;->n(Lz6/t;LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;ILjava/lang/Object;)LI5/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final m(LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;)LI5/c;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "immediateFailedDataSource(...)"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lz6/t;->a:Lz6/W;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lz6/W;->E(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    sget-object p3, LK6/b$c;->b:LK6/b$c;

    .line 27
    .line 28
    :cond_1
    move-object v1, p0

    .line 29
    move-object v3, p1

    .line 30
    move-object v5, p2

    .line 31
    move-object v4, p3

    .line 32
    move-object v6, p4

    .line 33
    move-object v7, p5

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_1

    .line 38
    :goto_0
    invoke-direct/range {v1 .. v7}, Lz6/t;->D(Lcom/facebook/imagepipeline/producers/d0;LK6/b;LK6/b$c;Ljava/lang/Object;LG6/e;Ljava/lang/String;)LI5/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    return-object p1

    .line 43
    :goto_1
    invoke-static {p1}, LI5/d;->b(Ljava/lang/Throwable;)LI5/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final o(LK6/b;Ljava/lang/Object;)LI5/c;
    .locals 1

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK6/b$c;->e:LK6/b$c;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, v0}, Lz6/t;->l(LK6/b;Ljava/lang/Object;LK6/b$c;)LI5/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/t;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final q()Lx6/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/t;->f:Lx6/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lx6/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/t;->h:Lx6/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(LK6/b;LG6/e;)LG6/e;
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x2

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, LK6/b;->q()LG6/e;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lz6/t;->d:LG6/e;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p2, LG6/c;

    .line 18
    .line 19
    iget-object v3, p0, Lz6/t;->d:LG6/e;

    .line 20
    .line 21
    invoke-virtual {p1}, LK6/b;->q()LG6/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-array v2, v2, [LG6/e;

    .line 26
    .line 27
    aput-object v3, v2, v1

    .line 28
    .line 29
    aput-object p1, v2, v0

    .line 30
    .line 31
    invoke-direct {p2, v2}, LG6/c;-><init>([LG6/e;)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_1
    invoke-virtual {p1}, LK6/b;->q()LG6/e;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    new-instance p1, LG6/c;

    .line 42
    .line 43
    iget-object v3, p0, Lz6/t;->d:LG6/e;

    .line 44
    .line 45
    new-array v2, v2, [LG6/e;

    .line 46
    .line 47
    aput-object v3, v2, v1

    .line 48
    .line 49
    aput-object p2, v2, v0

    .line 50
    .line 51
    invoke-direct {p1, v2}, LG6/c;-><init>([LG6/e;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    new-instance v3, LG6/c;

    .line 56
    .line 57
    iget-object v4, p0, Lz6/t;->d:LG6/e;

    .line 58
    .line 59
    invoke-virtual {p1}, LK6/b;->q()LG6/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 v5, 0x3

    .line 64
    new-array v5, v5, [LG6/e;

    .line 65
    .line 66
    aput-object v4, v5, v1

    .line 67
    .line 68
    aput-object p2, v5, v0

    .line 69
    .line 70
    aput-object p1, v5, v2

    .line 71
    .line 72
    invoke-direct {v3, v5}, LG6/c;-><init>([LG6/e;)V

    .line 73
    .line 74
    .line 75
    return-object v3

    .line 76
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string p2, "Required value was null."

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public final t(LK6/b;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lz6/t;->h:Lx6/k;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, p1, v1}, Lx6/k;->a(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lz6/t;->f:Lx6/x;

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lx6/x;->get(Ljava/lang/Object;)LC5/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :try_start_0
    invoke-static {p1}, LC5/a;->H(LC5/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 26
    .line 27
    .line 28
    return v0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final u(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lz6/t;->z(Landroid/net/Uri;)Ly5/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lz6/t;->f:Lx6/x;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lx6/x;->f(Ly5/l;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final v(LK6/b;)Z
    .locals 5

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/t;->c:Ly5/n;

    .line 7
    .line 8
    invoke-interface {v0}, Ly5/n;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "get(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Lz6/c;

    .line 18
    .line 19
    iget-object v1, p0, Lz6/t;->h:Lx6/k;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-interface {v1, p1, v2}, Lx6/k;->d(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1}, LK6/b;->c()LK6/b$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "getCacheChoice(...)"

    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :try_start_0
    sget-object v4, Lz6/t$b;->a:[I

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    aget v2, v4, v2

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    if-eq v2, v4, :cond_2

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    if-eq v2, v4, :cond_1

    .line 52
    .line 53
    const/4 v0, 0x3

    .line 54
    if-ne v2, v0, :cond_0

    .line 55
    .line 56
    invoke-direct {p0, p1}, Lz6/t;->y(LK6/b;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    new-instance p1, LTd/r;

    .line 64
    .line 65
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    invoke-interface {v0}, Lz6/c;->a()Lx6/j;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lx6/j;->k(Ls5/d;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-interface {v0}, Lz6/c;->b()Lx6/j;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v1}, Lx6/j;->k(Ls5/d;)Z

    .line 89
    .line 90
    .line 91
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :goto_0
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 93
    .line 94
    .line 95
    return p1

    .line 96
    :goto_1
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public final w(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    sget-object v0, LK6/b$b;->a:LK6/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lz6/t;->x(Landroid/net/Uri;LK6/b$b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, LK6/b$b;->b:LK6/b$b;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lz6/t;->x(Landroid/net/Uri;LK6/b$b;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, LK6/b$b;->c:LK6/b$b;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lz6/t;->x(Landroid/net/Uri;LK6/b$b;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final x(Landroid/net/Uri;LK6/b$b;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LK6/c;->x(Landroid/net/Uri;)LK6/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, LK6/c;->A(LK6/b$b;)LK6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LK6/c;->a()LK6/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lz6/t;->v(LK6/b;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method
