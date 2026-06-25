.class public final Lmd/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmd/d$a;
    }
.end annotation


# static fields
.field private static final h:Lmd/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Landroidx/media3/exoplayer/ExoPlayer;

.field private c:Landroid/graphics/SurfaceTexture;

.field private d:Landroid/view/Surface;

.field private e:Ljava/lang/String;

.field private final f:LPf/a;

.field private final g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lmd/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lmd/d;->h:Lmd/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lmd/d;->a:Landroid/content/Context;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, p1, v0}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lmd/d;->f:LPf/a;

    .line 19
    .line 20
    new-instance p1, Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lmd/d;->g:Landroid/os/Handler;

    .line 30
    .line 31
    return-void
.end method

.method private static final A(Lmd/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/d;->d:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lmd/d;->c:Landroid/graphics/SurfaceTexture;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->a()V

    .line 20
    .line 21
    .line 22
    :cond_2
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 24
    .line 25
    iput-object v0, p0, Lmd/d;->d:Landroid/view/Surface;

    .line 26
    .line 27
    iput-object v0, p0, Lmd/d;->c:Landroid/graphics/SurfaceTexture;

    .line 28
    .line 29
    iput-object v0, p0, Lmd/d;->e:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method private final B()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lmd/a;

    .line 7
    .line 8
    const-string v1, "Player not initialized"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method private final C()Landroid/view/Surface;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/d;->d:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lmd/a;

    .line 7
    .line 8
    const-string v1, "Surface not initialized"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method private final D(Landroidx/media3/exoplayer/ExoPlayer;DJ)V
    .locals 2

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    mul-double/2addr p2, v0

    .line 5
    double-to-long p2, p2

    .line 6
    invoke-direct {p0, p4, p5}, Lmd/d;->p(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p4

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "["

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p4, "ms] Seeking to "

    .line 24
    .line 25
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p4, "ms"

    .line 32
    .line 33
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    invoke-direct {p0, p4}, Lmd/d;->w(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p2, p3}, Lq2/P;->z(J)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private final E(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/d;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    return p1
.end method

.method private final F(Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p4}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p2, p3}, Lmd/d;->b(Lmd/d;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p2

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "["

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p2, "ms] Waiting for frame render..."

    .line 32
    .line 33
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p0, p2}, Lmd/d;->g(Lmd/d;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Lmd/d$i;

    .line 44
    .line 45
    invoke-direct {p2, p1, v0}, Lmd/d$i;-><init>(Landroidx/media3/exoplayer/ExoPlayer;LGf/n;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p2}, Lq2/P;->a0(Lq2/P$d;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lmd/d;->e(Lmd/d;)Landroid/os/Handler;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    new-instance v1, Lmd/d$g;

    .line 56
    .line 57
    invoke-direct {v1, v0, p1, p2}, Lmd/d$g;-><init>(LGf/n;Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$i;)V

    .line 58
    .line 59
    .line 60
    const-wide/16 v2, 0x1f4

    .line 61
    .line 62
    invoke-virtual {p3, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 63
    .line 64
    .line 65
    new-instance p3, Lmd/d$h;

    .line 66
    .line 67
    invoke-direct {p3, p1, p2}, Lmd/d$h;-><init>(Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$i;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, p3}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-ne p1, p2, :cond_0

    .line 82
    .line 83
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    if-ne p1, p2, :cond_1

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 94
    .line 95
    return-object p1
.end method

.method private final G(Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lq2/P;->p()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    sget-object p1, LTd/u;->b:LTd/u$a;

    .line 22
    .line 23
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Lmd/d$l;

    .line 34
    .line 35
    invoke-direct {v1, p1, v0}, Lmd/d$l;-><init>(Landroidx/media3/exoplayer/ExoPlayer;LGf/n;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v1}, Lq2/P;->a0(Lq2/P$d;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lmd/d;->e(Lmd/d;)Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Lmd/d$j;

    .line 46
    .line 47
    invoke-direct {v3, v0, p1, v1}, Lmd/d$j;-><init>(LGf/n;Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$l;)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v4, 0x1388

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 53
    .line 54
    .line 55
    new-instance v2, Lmd/d$k;

    .line 56
    .line 57
    invoke-direct {v2, p1, v1}, Lmd/d$k;-><init>(Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$l;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v2}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-ne p1, v0, :cond_1

    .line 72
    .line 73
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-ne p1, p2, :cond_2

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 84
    .line 85
    return-object p1
.end method

.method public static synthetic a(Lmd/d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lmd/d;->A(Lmd/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lmd/d;J)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lmd/d;->p(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic c(Lmd/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/d;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;JLjava/lang/Integer;Ljava/lang/Integer;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lmd/d;->r(Landroidx/media3/exoplayer/ExoPlayer;JLjava/lang/Integer;Ljava/lang/Integer;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lmd/d;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lmd/d;->g:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lmd/d;->u(Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lmd/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmd/d;->w(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Lmd/d;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lmd/d;->x(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic i(Lmd/d;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/d;->B()Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;DJ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lmd/d;->D(Landroidx/media3/exoplayer/ExoPlayer;DJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic k(Lmd/d;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmd/d;->E(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic l(Lmd/d;Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lmd/d;->F(Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m(Lq2/x;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lq2/x;->v:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget p1, p1, Lq2/x;->w:I

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lmd/d;->c:Landroid/graphics/SurfaceTexture;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0, p1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private final n(IILjava/lang/Integer;Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    new-instance p1, Lkotlin/Pair;

    .line 6
    .line 7
    invoke-direct {p1, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    if-eqz p3, :cond_1

    .line 12
    .line 13
    int-to-float p2, p2

    .line 14
    int-to-float p1, p1

    .line 15
    div-float/2addr p2, p1

    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    int-to-float p1, p1

    .line 21
    mul-float/2addr p1, p2

    .line 22
    float-to-int p1, p1

    .line 23
    new-instance p2, Lkotlin/Pair;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p2, p3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_1
    if-eqz p4, :cond_2

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    int-to-float p2, p2

    .line 37
    div-float/2addr p1, p2

    .line 38
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    int-to-float p2, p2

    .line 43
    mul-float/2addr p2, p1

    .line 44
    float-to-int p1, p2

    .line 45
    new-instance p2, Lkotlin/Pair;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p1, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_2
    new-instance p3, Lkotlin/Pair;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p3
.end method

.method private final o()LP2/n;
    .locals 3

    .line 1
    new-instance v0, LP2/n;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/d;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LP2/n;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LP2/n;->G()LP2/n$e$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/16 v2, 0x280

    .line 13
    .line 14
    invoke-virtual {v1, v2, v2}, LP2/n$e$a;->x0(II)LP2/n$e$a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, LP2/n$e$a;->v0(Z)LP2/n$e$a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, LP2/n$e$a;->o0()LP2/n$e;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, LP2/n;->m(Lq2/d0;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private final p(J)J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p1

    .line 6
    return-wide v0
.end method

.method private final q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lmd/d;->o()LP2/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 11
    .line 12
    iget-object v2, p0, Lmd/d;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->n(LP2/G;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->i()Landroidx/media3/exoplayer/ExoPlayer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, LA2/Q;->d:LA2/Q;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer;->d(LA2/Q;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {v0, v1}, Lq2/P;->w(F)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-static {v0}, Lmd/b;->a(Z)Landroid/graphics/SurfaceTexture;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 v1, 0x280

    .line 42
    .line 43
    const/16 v2, 0x168

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lmd/d;->c:Landroid/graphics/SurfaceTexture;

    .line 49
    .line 50
    new-instance v0, Landroid/view/Surface;

    .line 51
    .line 52
    iget-object v1, p0, Lmd/d;->c:Landroid/graphics/SurfaceTexture;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lmd/d;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-interface {v1, v0}, Lq2/P;->B(Landroid/view/Surface;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iput-object v0, p0, Lmd/d;->d:Landroid/view/Surface;

    .line 65
    .line 66
    return-void
.end method

.method private final r(Landroidx/media3/exoplayer/ExoPlayer;JLjava/lang/Integer;Ljava/lang/Integer;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p6, Lmd/d$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lmd/d$b;

    .line 7
    .line 8
    iget v1, v0, Lmd/d$b;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmd/d$b;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmd/d$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lmd/d$b;-><init>(Lmd/d;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lmd/d$b;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lmd/d$b;->h:I

    .line 32
    .line 33
    const-string v3, "["

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget p1, v0, Lmd/d$b;->e:I

    .line 41
    .line 42
    iget p2, v0, Lmd/d$b;->d:I

    .line 43
    .line 44
    iget p3, v0, Lmd/d$b;->c:I

    .line 45
    .line 46
    iget p4, v0, Lmd/d$b;->b:I

    .line 47
    .line 48
    iget-wide v0, v0, Lmd/d$b;->a:J

    .line 49
    .line 50
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->j()Lq2/x;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget p6, p1, Lq2/x;->v:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/16 p6, 0x280

    .line 76
    .line 77
    :goto_1
    if-eqz p1, :cond_4

    .line 78
    .line 79
    iget p1, p1, Lq2/x;->w:I

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    const/16 p1, 0x168

    .line 83
    .line 84
    :goto_2
    invoke-direct {p0, p6, p1, p4, p5}, Lmd/d;->n(IILjava/lang/Integer;Ljava/lang/Integer;)Lkotlin/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    invoke-virtual {p4}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p5

    .line 92
    check-cast p5, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p5

    .line 98
    invoke-virtual {p4}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p4

    .line 102
    check-cast p4, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    invoke-direct {p0, p2, p3}, Lmd/d;->p(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v5, "ms] Extracting "

    .line 124
    .line 125
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v5, "x"

    .line 132
    .line 133
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v6, " -> "

    .line 140
    .line 141
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v5, " bitmap"

    .line 154
    .line 155
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-direct {p0, v2}, Lmd/d;->w(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0}, Lmd/d;->C()Landroid/view/Surface;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iput-wide p2, v0, Lmd/d$b;->a:J

    .line 170
    .line 171
    iput p6, v0, Lmd/d$b;->b:I

    .line 172
    .line 173
    iput p1, v0, Lmd/d$b;->c:I

    .line 174
    .line 175
    iput p5, v0, Lmd/d$b;->d:I

    .line 176
    .line 177
    iput p4, v0, Lmd/d$b;->e:I

    .line 178
    .line 179
    iput v4, v0, Lmd/d$b;->h:I

    .line 180
    .line 181
    invoke-direct {p0, v2, p6, p1, v0}, Lmd/d;->s(Landroid/view/Surface;IILZd/e;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-ne v0, v1, :cond_5

    .line 186
    .line 187
    return-object v1

    .line 188
    :cond_5
    move-wide v7, p2

    .line 189
    move p3, p1

    .line 190
    move p1, p4

    .line 191
    move p4, p6

    .line 192
    move-object p6, v0

    .line 193
    move-wide v0, v7

    .line 194
    move p2, p5

    .line 195
    :goto_3
    check-cast p6, Landroid/graphics/Bitmap;

    .line 196
    .line 197
    if-ne p2, p4, :cond_7

    .line 198
    .line 199
    if-eq p1, p3, :cond_6

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_6
    return-object p6

    .line 203
    :cond_7
    :goto_4
    invoke-direct {p0, v0, v1}, Lmd/d;->p(J)J

    .line 204
    .line 205
    .line 206
    move-result-wide p3

    .line 207
    new-instance p5, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string p3, "ms] Resizing bitmap to preserve aspect ratio"

    .line 219
    .line 220
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    invoke-direct {p0, p3}, Lmd/d;->w(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {p6, p2, p1, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    const-string p2, "createScaledBitmap(...)"

    .line 235
    .line 236
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p6}, Landroid/graphics/Bitmap;->recycle()V

    .line 240
    .line 241
    .line 242
    return-object p1
.end method

.method private final s(Landroid/view/Surface;IILZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p4}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    invoke-static {p2, p3, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "createBitmap(...)"

    .line 21
    .line 22
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    new-instance p3, Lmd/d$c;

    .line 26
    .line 27
    invoke-direct {p3, v0, p2}, Lmd/d$c;-><init>(LGf/n;Landroid/graphics/Bitmap;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lmd/d;->e(Lmd/d;)Landroid/os/Handler;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p1, p2, p3, v1}, Landroid/view/PixelCopy;->request(Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p1

    .line 39
    invoke-interface {v0}, LGf/n;->b()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    sget-object p2, LTd/u;->b:LTd/u$a;

    .line 46
    .line 47
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    :goto_0
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p1, p2, :cond_1

    .line 67
    .line 68
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-object p1
.end method

.method private final u(Landroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;JLjava/util/Map;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, Lmd/d$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lmd/d$f;

    .line 7
    .line 8
    iget v1, v0, Lmd/d$f;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmd/d$f;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmd/d$f;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lmd/d$f;-><init>(Lmd/d;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lmd/d$f;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lmd/d$f;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lmd/d$f;->b:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, v0, Lmd/d$f;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroidx/media3/exoplayer/ExoPlayer;

    .line 46
    .line 47
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p3, p4}, Lmd/d;->p(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    new-instance p6, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v2, "["

    .line 73
    .line 74
    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v4, "ms] Loading new media"

    .line 81
    .line 82
    invoke-virtual {p6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p6

    .line 89
    invoke-direct {p0, p6}, Lmd/d;->w(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Lq2/P;->stop()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Lq2/P;->G()V

    .line 96
    .line 97
    .line 98
    new-instance p6, Lq2/C$c;

    .line 99
    .line 100
    invoke-direct {p6}, Lq2/C$c;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p6, p2}, Lq2/C$c;->k(Ljava/lang/String;)Lq2/C$c;

    .line 104
    .line 105
    .line 106
    move-result-object p6

    .line 107
    const-string v4, "setUri(...)"

    .line 108
    .line 109
    invoke-static {p6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    if-eqz p5, :cond_5

    .line 113
    .line 114
    invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    new-instance v4, Lq2/C$i$a;

    .line 122
    .line 123
    invoke-direct {v4}, Lq2/C$i$a;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance v5, Landroid/os/Bundle;

    .line 127
    .line 128
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object p5

    .line 135
    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p5

    .line 139
    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_4

    .line 144
    .line 145
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, Ljava/util/Map$Entry;

    .line 150
    .line 151
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Ljava/lang/String;

    .line 156
    .line 157
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_4
    sget-object p5, LTd/L;->a:LTd/L;

    .line 168
    .line 169
    invoke-virtual {v4, v5}, Lq2/C$i$a;->e(Landroid/os/Bundle;)Lq2/C$i$a;

    .line 170
    .line 171
    .line 172
    move-result-object p5

    .line 173
    invoke-virtual {p5}, Lq2/C$i$a;->d()Lq2/C$i;

    .line 174
    .line 175
    .line 176
    move-result-object p5

    .line 177
    invoke-virtual {p6, p5}, Lq2/C$c;->g(Lq2/C$i;)Lq2/C$c;

    .line 178
    .line 179
    .line 180
    :cond_5
    :goto_2
    invoke-virtual {p6}, Lq2/C$c;->a()Lq2/C;

    .line 181
    .line 182
    .line 183
    move-result-object p5

    .line 184
    const-string p6, "build(...)"

    .line 185
    .line 186
    invoke-static {p5, p6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p1, p5}, Lq2/P;->h(Lq2/C;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p1}, Lq2/P;->s()V

    .line 193
    .line 194
    .line 195
    invoke-direct {p0, p3, p4}, Lmd/d;->p(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide p3

    .line 199
    new-instance p5, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string p3, "ms] Waiting for player ready..."

    .line 211
    .line 212
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    invoke-direct {p0, p3}, Lmd/d;->w(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iput-object p1, v0, Lmd/d$f;->a:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object p2, v0, Lmd/d$f;->b:Ljava/lang/Object;

    .line 225
    .line 226
    iput v3, v0, Lmd/d$f;->e:I

    .line 227
    .line 228
    invoke-direct {p0, p1, v0}, Lmd/d;->G(Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    if-ne p3, v1, :cond_6

    .line 233
    .line 234
    return-object v1

    .line 235
    :cond_6
    :goto_3
    iput-object p2, p0, Lmd/d;->e:Ljava/lang/String;

    .line 236
    .line 237
    invoke-direct {p0, p1}, Lmd/d;->v(Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->j()Lq2/x;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-direct {p0, p2}, Lmd/d;->y(Lq2/x;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->j()Lq2/x;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-direct {p0, p1}, Lmd/d;->m(Lq2/x;)V

    .line 252
    .line 253
    .line 254
    sget-object p1, LTd/L;->a:LTd/L;

    .line 255
    .line 256
    return-object p1
.end method

.method private final v(Landroidx/media3/exoplayer/ExoPlayer;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final w(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final x(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, ": "

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "FrameExtractor"

    .line 26
    .line 27
    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final y(Lq2/x;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;LZd/e;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v2, v0, Lmd/d$d;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lmd/d$d;

    .line 9
    .line 10
    iget v3, v2, Lmd/d$d;->i:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, Lmd/d$d;->i:I

    .line 20
    .line 21
    :goto_0
    move-object v9, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, Lmd/d$d;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, Lmd/d$d;-><init>(Lmd/d;LZd/e;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v9, Lmd/d$d;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget v2, v9, Lmd/d$d;->i:I

    .line 36
    .line 37
    const/4 v11, 0x2

    .line 38
    const/4 v3, 0x1

    .line 39
    const/4 v12, 0x0

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    if-ne v2, v11, :cond_1

    .line 45
    .line 46
    iget-object v2, v9, Lmd/d$d;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LPf/a;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    iget-wide v2, v9, Lmd/d$d;->f:D

    .line 67
    .line 68
    iget-object v4, v9, Lmd/d$d;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, LPf/a;

    .line 71
    .line 72
    iget-object v5, v9, Lmd/d$d;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Ljava/util/Map;

    .line 75
    .line 76
    iget-object v6, v9, Lmd/d$d;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Ljava/lang/Integer;

    .line 79
    .line 80
    iget-object v7, v9, Lmd/d$d;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v7, Ljava/lang/Integer;

    .line 83
    .line 84
    iget-object v8, v9, Lmd/d$d;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v8, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v13, v7

    .line 92
    move-object v7, v6

    .line 93
    move-object v6, v13

    .line 94
    move-object v13, v4

    .line 95
    move-object v4, v8

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lmd/d;->f:LPf/a;

    .line 101
    .line 102
    move-object/from16 v2, p1

    .line 103
    .line 104
    iput-object v2, v9, Lmd/d$d;->a:Ljava/lang/Object;

    .line 105
    .line 106
    move-object/from16 v4, p4

    .line 107
    .line 108
    iput-object v4, v9, Lmd/d$d;->b:Ljava/lang/Object;

    .line 109
    .line 110
    move-object/from16 v5, p5

    .line 111
    .line 112
    iput-object v5, v9, Lmd/d$d;->c:Ljava/lang/Object;

    .line 113
    .line 114
    move-object/from16 v6, p6

    .line 115
    .line 116
    iput-object v6, v9, Lmd/d$d;->d:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v0, v9, Lmd/d$d;->e:Ljava/lang/Object;

    .line 119
    .line 120
    move-wide/from16 v7, p2

    .line 121
    .line 122
    iput-wide v7, v9, Lmd/d$d;->f:D

    .line 123
    .line 124
    iput v3, v9, Lmd/d$d;->i:I

    .line 125
    .line 126
    invoke-interface {v0, v12, v9}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-ne v3, v10, :cond_4

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    move-object v13, v4

    .line 134
    move-object v4, v2

    .line 135
    move-wide v2, v7

    .line 136
    move-object v7, v5

    .line 137
    move-object v5, v6

    .line 138
    move-object v6, v13

    .line 139
    move-object v13, v0

    .line 140
    :goto_2
    :try_start_1
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    new-instance v0, Lmd/d$e;

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    move-object v1, p0

    .line 148
    invoke-direct/range {v0 .. v8}, Lmd/d$e;-><init>(Lmd/d;DLjava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;LZd/e;)V

    .line 149
    .line 150
    .line 151
    iput-object v13, v9, Lmd/d$d;->a:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v12, v9, Lmd/d$d;->b:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v12, v9, Lmd/d$d;->c:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v12, v9, Lmd/d$d;->d:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v12, v9, Lmd/d$d;->e:Ljava/lang/Object;

    .line 160
    .line 161
    iput v11, v9, Lmd/d$d;->i:I

    .line 162
    .line 163
    invoke-static {v14, v0, v9}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    if-ne v0, v10, :cond_5

    .line 168
    .line 169
    :goto_3
    return-object v10

    .line 170
    :cond_5
    move-object v2, v13

    .line 171
    :goto_4
    :try_start_2
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    .line 173
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    move-object v2, v13

    .line 179
    :goto_5
    invoke-interface {v2, v12}, LPf/a;->e(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    throw v0
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/d;->g:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lmd/c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lmd/c;-><init>(Lmd/d;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
