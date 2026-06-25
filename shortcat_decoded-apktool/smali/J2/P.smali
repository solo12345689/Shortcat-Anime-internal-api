.class public final LJ2/P;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJ2/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/P$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/MediaCodec;

.field private final b:LJ2/o;


# direct methods
.method private constructor <init>(Landroid/media/MediaCodec;LJ2/o;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 4
    iput-object p2, p0, LJ2/P;->b:LJ2/o;

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p2, p1}, LJ2/o;->b(Landroid/media/MediaCodec;)V

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Landroid/media/MediaCodec;LJ2/o;LJ2/P$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LJ2/P;-><init>(Landroid/media/MediaCodec;LJ2/o;)V

    return-void
.end method

.method public static synthetic r(LJ2/P;LJ2/q$d;Landroid/media/MediaCodec;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object p2, p1

    .line 5
    move-object p1, p0

    .line 6
    move-object p0, p2

    .line 7
    move-wide p2, p3

    .line 8
    move-wide p4, p5

    .line 9
    invoke-interface/range {p0 .. p5}, LJ2/q$d;->a(LJ2/q;JJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1e

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v2, 0x21

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    if-lt v1, v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LJ2/P;->b:LJ2/o;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, LJ2/o;->d(Landroid/media/MediaCodec;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt v2, v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, LJ2/P;->b:LJ2/o;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v2, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, LJ2/o;->d(Landroid/media/MediaCodec;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 54
    .line 55
    .line 56
    throw v1
.end method

.method public b(IILz2/c;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {p3}, Lz2/c;->a()Landroid/media/MediaCodec$CryptoInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move-wide v4, p4

    .line 10
    move v6, p6

    .line 11
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(IIIJI)V
    .locals 7

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move v6, p6

    .line 8
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-static {v0}, LJ2/a;->a(Landroid/media/MediaCodec;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(LJ2/q$d;Landroid/os/Handler;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    new-instance v1, LJ2/O;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LJ2/O;-><init>(LJ2/P;LJ2/q$d;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public l(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m()I
    .locals 3

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public o(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x3

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v0
.end method

.method public p(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/P;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
