.class public final Landroidx/media3/exoplayer/s;
.super Lq2/N;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:Lq2/x;

.field public final n:I

.field public final o:LM2/D$b;

.field final p:Z


# direct methods
.method private constructor <init>(ILjava/lang/Throwable;I)V
    .locals 11

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v4, p3

    .line 1
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/s;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILq2/x;ILM2/D$b;Z)V

    return-void
.end method

.method private constructor <init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILq2/x;ILM2/D$b;Z)V
    .locals 13

    move v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v4, p7

    move/from16 v5, p8

    .line 2
    invoke-static/range {v0 .. v5}, Landroidx/media3/exoplayer/s;->l(ILjava/lang/String;Ljava/lang/String;ILq2/x;I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    move-object v0, p0

    move v4, p1

    move-object v2, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v12, p10

    .line 4
    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILq2/x;ILM2/D$b;JZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILq2/x;ILM2/D$b;JZ)V
    .locals 8

    move/from16 v0, p12

    .line 5
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide/from16 v6, p10

    invoke-direct/range {v1 .. v7}, Lq2/N;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILandroid/os/Bundle;J)V

    const/4 p1, 0x0

    const/4 p3, 0x1

    if-eqz v0, :cond_1

    if-ne p4, p3, :cond_0

    goto :goto_0

    :cond_0
    move v2, p1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, p3

    .line 6
    :goto_1
    invoke-static {v2}, Lt2/a;->a(Z)V

    if-nez p2, :cond_2

    const/4 p2, 0x3

    if-ne p4, p2, :cond_3

    :cond_2
    move p1, p3

    .line 7
    :cond_3
    invoke-static {p1}, Lt2/a;->a(Z)V

    .line 8
    iput p4, p0, Landroidx/media3/exoplayer/s;->j:I

    .line 9
    iput-object p5, p0, Landroidx/media3/exoplayer/s;->k:Ljava/lang/String;

    .line 10
    iput p6, p0, Landroidx/media3/exoplayer/s;->l:I

    .line 11
    iput-object p7, p0, Landroidx/media3/exoplayer/s;->m:Lq2/x;

    move/from16 p1, p8

    .line 12
    iput p1, p0, Landroidx/media3/exoplayer/s;->n:I

    move-object/from16 p1, p9

    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/s;->o:LM2/D$b;

    .line 14
    iput-boolean v0, p0, Landroidx/media3/exoplayer/s;->p:Z

    return-void
.end method

.method public static i(Ljava/lang/Throwable;Ljava/lang/String;ILq2/x;ILM2/D$b;ZI)Landroidx/media3/exoplayer/s;
    .locals 11

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x4

    .line 6
    :cond_0
    move v8, p4

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move-object v5, p1

    .line 11
    move v6, p2

    .line 12
    move-object v7, p3

    .line 13
    move-object/from16 v9, p5

    .line 14
    .line 15
    move/from16 v10, p6

    .line 16
    .line 17
    move/from16 v4, p7

    .line 18
    .line 19
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/s;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILq2/x;ILM2/D$b;Z)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static j(Ljava/io/IOException;I)Landroidx/media3/exoplayer/s;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, Landroidx/media3/exoplayer/s;-><init>(ILjava/lang/Throwable;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static k(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p0, p1}, Landroidx/media3/exoplayer/s;-><init>(ILjava/lang/Throwable;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private static l(ILjava/lang/String;Ljava/lang/String;ILq2/x;I)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 p2, 0x3

    .line 7
    if-eq p0, p2, :cond_0

    .line 8
    .line 9
    const-string p0, "Unexpected runtime error"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "Remote error"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p2, " error, index="

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p2, ", format="

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p2, ", format_supported="

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {p5}, Lt2/a0;->f0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const-string p0, "Source error"

    .line 57
    .line 58
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, ": "

    .line 73
    .line 74
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_3
    return-object p0
.end method


# virtual methods
.method public c(Lq2/N;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lq2/N;->c(Lq2/N;)Z

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
    invoke-static {p1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroidx/media3/exoplayer/s;

    .line 14
    .line 15
    iget v0, p0, Landroidx/media3/exoplayer/s;->j:I

    .line 16
    .line 17
    iget v2, p1, Landroidx/media3/exoplayer/s;->j:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/s;->k:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p1, Landroidx/media3/exoplayer/s;->k:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget v0, p0, Landroidx/media3/exoplayer/s;->l:I

    .line 32
    .line 33
    iget v2, p1, Landroidx/media3/exoplayer/s;->l:I

    .line 34
    .line 35
    if-ne v0, v2, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/s;->m:Lq2/x;

    .line 38
    .line 39
    iget-object v2, p1, Landroidx/media3/exoplayer/s;->m:Lq2/x;

    .line 40
    .line 41
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget v0, p0, Landroidx/media3/exoplayer/s;->n:I

    .line 48
    .line 49
    iget v2, p1, Landroidx/media3/exoplayer/s;->n:I

    .line 50
    .line 51
    if-ne v0, v2, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/s;->o:LM2/D$b;

    .line 54
    .line 55
    iget-object v2, p1, Landroidx/media3/exoplayer/s;->o:LM2/D$b;

    .line 56
    .line 57
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-boolean v0, p0, Landroidx/media3/exoplayer/s;->p:Z

    .line 64
    .line 65
    iget-boolean p1, p1, Landroidx/media3/exoplayer/s;->p:Z

    .line 66
    .line 67
    if-ne v0, p1, :cond_1

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_1
    return v1
.end method

.method h(LM2/D$b;)Landroidx/media3/exoplayer/s;
    .locals 13

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget v3, p0, Lq2/N;->a:I

    .line 18
    .line 19
    iget v4, p0, Landroidx/media3/exoplayer/s;->j:I

    .line 20
    .line 21
    iget-object v5, p0, Landroidx/media3/exoplayer/s;->k:Ljava/lang/String;

    .line 22
    .line 23
    iget v6, p0, Landroidx/media3/exoplayer/s;->l:I

    .line 24
    .line 25
    iget-object v7, p0, Landroidx/media3/exoplayer/s;->m:Lq2/x;

    .line 26
    .line 27
    iget v8, p0, Landroidx/media3/exoplayer/s;->n:I

    .line 28
    .line 29
    iget-wide v10, p0, Lq2/N;->b:J

    .line 30
    .line 31
    iget-boolean v12, p0, Landroidx/media3/exoplayer/s;->p:Z

    .line 32
    .line 33
    move-object v9, p1

    .line 34
    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILq2/x;ILM2/D$b;JZ)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method
