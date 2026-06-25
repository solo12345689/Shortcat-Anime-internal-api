.class public final LC2/P;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LC2/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/P$g;,
        LC2/P$e;,
        LC2/P$d;,
        LC2/P$n;,
        LC2/P$k;,
        LC2/P$m;,
        LC2/P$f;,
        LC2/P$h;,
        LC2/P$c;,
        LC2/P$b;,
        LC2/P$l;,
        LC2/P$o;,
        LC2/P$i;,
        LC2/P$j;
    }
.end annotation


# static fields
.field public static q0:Z = false

.field private static final r0:Ljava/lang/Object;

.field private static s0:Ljava/util/concurrent/ScheduledExecutorService;

.field private static t0:I


# instance fields
.field private A:LC2/e;

.field private B:LC2/i;

.field private C:LC2/P$l;

.field private D:Lq2/c;

.field private E:LC2/P$k;

.field private F:LC2/P$k;

.field private G:Lq2/O;

.field private H:Z

.field private I:Ljava/nio/ByteBuffer;

.field private J:I

.field private K:J

.field private L:J

.field private M:J

.field private N:J

.field private O:I

.field private P:Z

.field private Q:Z

.field private R:J

.field private S:F

.field private T:Ljava/nio/ByteBuffer;

.field private U:I

.field private V:Ljava/nio/ByteBuffer;

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private final a:Landroid/content/Context;

.field private a0:Z

.field private final b:Lr2/p;

.field private b0:I

.field private final c:Z

.field private c0:Z

.field private final d:LC2/C;

.field private d0:Lq2/g;

.field private final e:LC2/f0;

.field private e0:LC2/j;

.field private final f:Lr2/t;

.field private f0:Z

.field private final g:LC2/e0;

.field private g0:J

.field private final h:LP9/u;

.field private h0:J

.field private final i:LC2/B;

.field private i0:Z

.field private final j:Ljava/util/ArrayDeque;

.field private j0:Z

.field private final k:Z

.field private k0:Landroid/os/Looper;

.field private l:I

.field private l0:J

.field private m:LC2/P$o;

.field private m0:J

.field private final n:LC2/P$m;

.field private n0:Landroid/os/Handler;

.field private final o:LC2/P$m;

.field private o0:Landroid/content/Context;

.field private final p:LC2/P$e;

.field private p0:Z

.field private final q:LC2/P$d;

.field private final r:Landroidx/media3/exoplayer/ExoPlayer$a;

.field private final s:LC2/P$f;

.field private final t:I

.field private u:LB2/K1;

.field private v:LC2/z$d;

.field private w:LC2/P$h;

.field private x:LC2/P$h;

.field private y:Lr2/n;

.field private z:Landroid/media/AudioTrack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC2/P;->r0:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(LC2/P$g;)V
    .locals 11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LC2/P$g;->a(LC2/P$g;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, LC2/P$g;->a(LC2/P$g;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LC2/P;->a:Landroid/content/Context;

    .line 4
    sget-object v2, Lq2/c;->h:Lq2/c;

    iput-object v2, p0, LC2/P;->D:Lq2/c;

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {p1}, LC2/P$g;->e(LC2/P$g;)LC2/e;

    move-result-object v0

    :goto_1
    iput-object v0, p0, LC2/P;->A:LC2/e;

    .line 6
    invoke-static {p1}, LC2/P$g;->f(LC2/P$g;)Lr2/p;

    move-result-object v0

    iput-object v0, p0, LC2/P;->b:Lr2/p;

    .line 7
    invoke-static {p1}, LC2/P$g;->g(LC2/P$g;)Z

    move-result v0

    iput-boolean v0, p0, LC2/P;->c:Z

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p1}, LC2/P$g;->h(LC2/P$g;)Z

    move-result v2

    iput-boolean v2, p0, LC2/P;->k:Z

    const/4 v2, 0x0

    .line 9
    iput v2, p0, LC2/P;->l:I

    .line 10
    invoke-static {p1}, LC2/P$g;->i(LC2/P$g;)LC2/P$e;

    move-result-object v3

    iput-object v3, p0, LC2/P;->p:LC2/P$e;

    .line 11
    invoke-static {p1}, LC2/P$g;->j(LC2/P$g;)LC2/P$d;

    move-result-object v3

    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC2/P$d;

    iput-object v3, p0, LC2/P;->q:LC2/P$d;

    .line 12
    new-instance v3, LC2/B;

    new-instance v4, LC2/P$n;

    invoke-direct {v4, p0, v1}, LC2/P$n;-><init>(LC2/P;LC2/P$a;)V

    invoke-direct {v3, v4}, LC2/B;-><init>(LC2/B$a;)V

    iput-object v3, p0, LC2/P;->i:LC2/B;

    .line 13
    new-instance v1, LC2/C;

    invoke-direct {v1}, LC2/C;-><init>()V

    iput-object v1, p0, LC2/P;->d:LC2/C;

    .line 14
    new-instance v3, LC2/f0;

    invoke-direct {v3}, LC2/f0;-><init>()V

    iput-object v3, p0, LC2/P;->e:LC2/f0;

    .line 15
    new-instance v4, Lr2/t;

    invoke-direct {v4}, Lr2/t;-><init>()V

    iput-object v4, p0, LC2/P;->f:Lr2/t;

    .line 16
    new-instance v4, LC2/e0;

    invoke-direct {v4}, LC2/e0;-><init>()V

    iput-object v4, p0, LC2/P;->g:LC2/e0;

    .line 17
    invoke-static {v3, v1}, LP9/u;->D(Ljava/lang/Object;Ljava/lang/Object;)LP9/u;

    move-result-object v1

    iput-object v1, p0, LC2/P;->h:LP9/u;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    iput v1, p0, LC2/P;->S:F

    .line 19
    iput v2, p0, LC2/P;->b0:I

    .line 20
    new-instance v1, Lq2/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lq2/g;-><init>(IF)V

    iput-object v1, p0, LC2/P;->d0:Lq2/g;

    .line 21
    new-instance v4, LC2/P$k;

    sget-object v5, Lq2/O;->d:Lq2/O;

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v4 .. v10}, LC2/P$k;-><init>(Lq2/O;JJLC2/P$a;)V

    iput-object v4, p0, LC2/P;->F:LC2/P$k;

    .line 22
    iput-object v5, p0, LC2/P;->G:Lq2/O;

    .line 23
    iput-boolean v2, p0, LC2/P;->H:Z

    .line 24
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 25
    new-instance v1, LC2/P$m;

    invoke-direct {v1}, LC2/P$m;-><init>()V

    iput-object v1, p0, LC2/P;->n:LC2/P$m;

    .line 26
    new-instance v1, LC2/P$m;

    invoke-direct {v1}, LC2/P$m;-><init>()V

    iput-object v1, p0, LC2/P;->o:LC2/P$m;

    .line 27
    invoke-static {p1}, LC2/P$g;->b(LC2/P$g;)Landroidx/media3/exoplayer/ExoPlayer$a;

    move-result-object v1

    iput-object v1, p0, LC2/P;->r:Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 28
    invoke-static {p1}, LC2/P$g;->c(LC2/P$g;)LC2/P$f;

    move-result-object v1

    iput-object v1, p0, LC2/P;->s:LC2/P$f;

    const/16 v1, 0x22

    if-lt v0, v1, :cond_3

    .line 29
    invoke-static {p1}, LC2/P$g;->a(LC2/P$g;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 30
    :cond_2
    invoke-static {p1}, LC2/P$g;->a(LC2/P$g;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LC2/P;->X(Landroid/content/Context;)I

    move-result v0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v0, -0x1

    :goto_3
    iput v0, p0, LC2/P;->t:I

    .line 31
    invoke-static {p1}, LC2/P$g;->d(LC2/P$g;)Z

    move-result p1

    iput-boolean p1, p0, LC2/P;->p0:Z

    return-void
.end method

.method synthetic constructor <init>(LC2/P$g;LC2/P$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC2/P;-><init>(LC2/P$g;)V

    return-void
.end method

.method private A0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, v0, LC2/P$h;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private static B0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method private C0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    mul-long v8, p4, v2

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    move v6, p3

    .line 15
    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    move-object v4, p1

    .line 21
    move-object v5, p2

    .line 22
    move v6, p3

    .line 23
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x10

    .line 28
    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    sget-object p2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    const p2, 0x55550001

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    :cond_1
    iget p1, p0, LC2/P;->J:I

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    const/4 p3, 0x4

    .line 56
    invoke-virtual {p1, p3, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    mul-long/2addr p4, v2

    .line 64
    invoke-virtual {p1, p3, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    iput v6, p0, LC2/P;->J:I

    .line 73
    .line 74
    :cond_2
    iget-object p1, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-lez p1, :cond_4

    .line 81
    .line 82
    iget-object p3, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    const/4 p4, 0x1

    .line 85
    invoke-virtual {v4, p3, p1, p4}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    if-gez p3, :cond_3

    .line 90
    .line 91
    iput p2, p0, LC2/P;->J:I

    .line 92
    .line 93
    return p3

    .line 94
    :cond_3
    if-ge p3, p1, :cond_4

    .line 95
    .line 96
    return p2

    .line 97
    :cond_4
    invoke-static {v4, v5, v6}, LC2/P;->B0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-gez p1, :cond_5

    .line 102
    .line 103
    iput p2, p0, LC2/P;->J:I

    .line 104
    .line 105
    return p1

    .line 106
    :cond_5
    iget p2, p0, LC2/P;->J:I

    .line 107
    .line 108
    sub-int/2addr p2, p1

    .line 109
    iput p2, p0, LC2/P;->J:I

    .line 110
    .line 111
    return p1
.end method

.method private S(LC2/P$h;)Landroid/media/AudioTrack;
    .locals 8

    .line 1
    :try_start_0
    iget v0, p0, LC2/P;->b0:I

    .line 2
    .line 3
    iget v1, p0, LC2/P;->t:I
    :try_end_0
    .catch LC2/z$c; {:try_start_0 .. :try_end_0} :catch_2

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v1, v2, :cond_1

    .line 7
    .line 8
    :try_start_1
    iget-object v2, p0, LC2/P;->a:Landroid/content/Context;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v4, 0x22

    .line 15
    .line 16
    if-lt v3, v4, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LC2/P;->o0:Landroid/content/Context;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {v2, v1}, LC2/K;->a(Landroid/content/Context;I)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LC2/P;->o0:Landroid/content/Context;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    move-object v2, p0

    .line 32
    goto :goto_3

    .line 33
    :cond_0
    :goto_0
    iget-object v0, p0, LC2/P;->o0:Landroid/content/Context;
    :try_end_1
    .catch LC2/z$c; {:try_start_1 .. :try_end_1} :catch_0

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    move-object v7, v0

    .line 37
    move v5, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    move v5, v0

    .line 41
    move-object v7, v1

    .line 42
    :goto_1
    :try_start_2
    invoke-virtual {p1}, LC2/P$h;->a()LC2/z$a;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v4, p0, LC2/P;->D:Lq2/c;

    .line 47
    .line 48
    iget-object v6, p1, LC2/P$h;->a:Lq2/x;
    :try_end_2
    .catch LC2/z$c; {:try_start_2 .. :try_end_2} :catch_2

    .line 49
    .line 50
    move-object v2, p0

    .line 51
    :try_start_3
    invoke-direct/range {v2 .. v7}, LC2/P;->v(LC2/z$a;Lq2/c;ILq2/x;Landroid/content/Context;)Landroid/media/AudioTrack;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, v2, LC2/P;->r:Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-static {p1}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$a;->D(Z)V
    :try_end_3
    .catch LC2/z$c; {:try_start_3 .. :try_end_3} :catch_1

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :catch_1
    move-exception v0

    .line 68
    :goto_2
    move-object p1, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    return-object p1

    .line 71
    :catch_2
    move-exception v0

    .line 72
    move-object v2, p0

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    iget-object v0, v2, LC2/P;->v:LC2/z$d;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-interface {v0, p1}, LC2/z$d;->g(Ljava/lang/Exception;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    throw p1
.end method

.method private T()Landroid/media/AudioTrack;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC2/P$h;

    .line 8
    .line 9
    invoke-direct {p0, v0}, LC2/P;->S(LC2/P$h;)Landroid/media/AudioTrack;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch LC2/z$c; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    iget-object v1, p0, LC2/P;->x:LC2/P$h;

    .line 16
    .line 17
    iget v2, v1, LC2/P$h;->h:I

    .line 18
    .line 19
    const v3, 0xf4240

    .line 20
    .line 21
    .line 22
    if-le v2, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v3}, LC2/P$h;->c(I)LC2/P$h;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :try_start_1
    invoke-direct {p0, v1}, LC2/P;->S(LC2/P$h;)Landroid/media/AudioTrack;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v1, p0, LC2/P;->x:LC2/P$h;
    :try_end_1
    .catch LC2/z$c; {:try_start_1 .. :try_end_1} :catch_1

    .line 33
    .line 34
    return-object v2

    .line 35
    :catch_1
    move-exception v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-direct {p0}, LC2/P;->j0()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method private U(J)V
    .locals 9

    .line 1
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :goto_0
    move-object v1, p0

    .line 6
    goto/16 :goto_8

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LC2/P;->o:LC2/P$m;

    .line 9
    .line 10
    invoke-virtual {v0}, LC2/P$m;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-boolean v0, p0, LC2/P;->f0:Z

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v0, p1, v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move v0, v8

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v7

    .line 41
    :goto_1
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 42
    .line 43
    .line 44
    const-wide/high16 v0, -0x8000000000000000L

    .line 45
    .line 46
    cmp-long v0, p1, v0

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    iget-wide p1, p0, LC2/P;->g0:J

    .line 51
    .line 52
    :goto_2
    move-wide v5, p1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    iput-wide p1, p0, LC2/P;->g0:J

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :goto_3
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 58
    .line 59
    iget-object v3, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    invoke-direct/range {v1 .. v6}, LC2/P;->C0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move-object v1, p0

    .line 68
    iget-object p1, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 69
    .line 70
    iget-object p2, v1, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    invoke-static {p1, p2, v4}, LC2/P;->B0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    iput-wide v2, v1, LC2/P;->h0:J

    .line 81
    .line 82
    const-wide/16 v2, 0x0

    .line 83
    .line 84
    if-gez p1, :cond_a

    .line 85
    .line 86
    invoke-static {p1}, LC2/P;->g0(I)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    invoke-direct {p0}, LC2/P;->c0()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    cmp-long p2, v4, v2

    .line 97
    .line 98
    if-lez p2, :cond_5

    .line 99
    .line 100
    :goto_5
    move v7, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget-object p2, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 103
    .line 104
    invoke-static {p2}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_6

    .line 109
    .line 110
    invoke-direct {p0}, LC2/P;->j0()V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    :goto_6
    new-instance p2, LC2/z$f;

    .line 115
    .line 116
    iget-object v0, v1, LC2/P;->x:LC2/P$h;

    .line 117
    .line 118
    iget-object v0, v0, LC2/P$h;->a:Lq2/x;

    .line 119
    .line 120
    invoke-direct {p2, p1, v0, v7}, LC2/z$f;-><init>(ILq2/x;Z)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, LC2/P;->v:LC2/z$d;

    .line 124
    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    invoke-interface {p1, p2}, LC2/z$d;->g(Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget-boolean p1, p2, LC2/z$f;->b:Z

    .line 131
    .line 132
    if-eqz p1, :cond_9

    .line 133
    .line 134
    iget-object p1, v1, LC2/P;->a:Landroid/content/Context;

    .line 135
    .line 136
    if-nez p1, :cond_8

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_8
    sget-object p1, LC2/e;->c:LC2/e;

    .line 140
    .line 141
    iput-object p1, v1, LC2/P;->A:LC2/e;

    .line 142
    .line 143
    iget-object v0, v1, LC2/P;->B:LC2/i;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, LC2/i;->g(LC2/e;)V

    .line 146
    .line 147
    .line 148
    throw p2

    .line 149
    :cond_9
    :goto_7
    iget-object p1, v1, LC2/P;->o:LC2/P$m;

    .line 150
    .line 151
    invoke-virtual {p1, p2}, LC2/P$m;->c(Ljava/lang/Exception;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_a
    iget-object p2, v1, LC2/P;->o:LC2/P$m;

    .line 156
    .line 157
    invoke-virtual {p2}, LC2/P$m;->a()V

    .line 158
    .line 159
    .line 160
    iget-object p2, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 161
    .line 162
    invoke-static {p2}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_c

    .line 167
    .line 168
    iget-wide v5, v1, LC2/P;->N:J

    .line 169
    .line 170
    cmp-long p2, v5, v2

    .line 171
    .line 172
    if-lez p2, :cond_b

    .line 173
    .line 174
    iput-boolean v7, v1, LC2/P;->j0:Z

    .line 175
    .line 176
    :cond_b
    iget-boolean p2, v1, LC2/P;->Z:Z

    .line 177
    .line 178
    if-eqz p2, :cond_c

    .line 179
    .line 180
    iget-object p2, v1, LC2/P;->v:LC2/z$d;

    .line 181
    .line 182
    if-eqz p2, :cond_c

    .line 183
    .line 184
    if-ge p1, v4, :cond_c

    .line 185
    .line 186
    iget-boolean v0, v1, LC2/P;->j0:Z

    .line 187
    .line 188
    if-nez v0, :cond_c

    .line 189
    .line 190
    invoke-interface {p2}, LC2/z$d;->h()V

    .line 191
    .line 192
    .line 193
    :cond_c
    iget-object p2, v1, LC2/P;->x:LC2/P$h;

    .line 194
    .line 195
    iget p2, p2, LC2/P$h;->c:I

    .line 196
    .line 197
    if-nez p2, :cond_d

    .line 198
    .line 199
    iget-wide v2, v1, LC2/P;->M:J

    .line 200
    .line 201
    int-to-long v5, p1

    .line 202
    add-long/2addr v2, v5

    .line 203
    iput-wide v2, v1, LC2/P;->M:J

    .line 204
    .line 205
    :cond_d
    if-ne p1, v4, :cond_10

    .line 206
    .line 207
    if-eqz p2, :cond_f

    .line 208
    .line 209
    iget-object p1, v1, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    iget-object p2, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 212
    .line 213
    if-ne p1, p2, :cond_e

    .line 214
    .line 215
    move v7, v8

    .line 216
    :cond_e
    invoke-static {v7}, Lt2/a;->g(Z)V

    .line 217
    .line 218
    .line 219
    iget-wide p1, v1, LC2/P;->N:J

    .line 220
    .line 221
    iget v0, v1, LC2/P;->O:I

    .line 222
    .line 223
    int-to-long v2, v0

    .line 224
    iget v0, v1, LC2/P;->U:I

    .line 225
    .line 226
    int-to-long v4, v0

    .line 227
    mul-long/2addr v2, v4

    .line 228
    add-long/2addr p1, v2

    .line 229
    iput-wide p1, v1, LC2/P;->N:J

    .line 230
    .line 231
    :cond_f
    const/4 p1, 0x0

    .line 232
    iput-object p1, v1, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 233
    .line 234
    :cond_10
    :goto_8
    return-void
.end method

.method private V()Z
    .locals 5

    .line 1
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/n;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const-wide/high16 v3, -0x8000000000000000L

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, v3, v4}, LC2/P;->U(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    return v1

    .line 22
    :cond_1
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 23
    .line 24
    invoke-virtual {v0}, Lr2/n;->h()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v3, v4}, LC2/P;->p0(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 31
    .line 32
    invoke-virtual {v0}, Lr2/n;->e()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    return v1
.end method

.method private static W(III)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x2

    .line 6
    if-eq p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    return p0
.end method

.method private static X(Landroid/content/Context;)I
    .locals 1

    .line 1
    invoke-static {p0}, LC2/G;->a(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    return v0
.end method

.method private static Y(ILjava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-eq p0, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, 0x1e

    .line 6
    .line 7
    if-eq p0, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    const/16 v1, 0x400

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    packed-switch p0, :pswitch_data_1

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Unexpected audio encoding: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :pswitch_0
    invoke-static {p1}, LU2/c;->f(Ljava/nio/ByteBuffer;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :pswitch_1
    return v1

    .line 47
    :pswitch_2
    const/16 p0, 0x200

    .line 48
    .line 49
    return p0

    .line 50
    :pswitch_3
    invoke-static {p1}, LU2/b;->b(Ljava/nio/ByteBuffer;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ne p0, v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_0
    invoke-static {p1, p0}, LU2/b;->i(Ljava/nio/ByteBuffer;I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    mul-int/lit8 p0, p0, 0x10

    .line 63
    .line 64
    return p0

    .line 65
    :pswitch_4
    const/16 p0, 0x800

    .line 66
    .line 67
    return p0

    .line 68
    :pswitch_5
    return v1

    .line 69
    :pswitch_6
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p1, p0}, Lt2/a0;->R(Ljava/nio/ByteBuffer;I)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p0}, LU2/F;->m(I)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eq p0, v0, :cond_1

    .line 82
    .line 83
    return p0

    .line 84
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :pswitch_7
    invoke-static {p1}, LU2/b;->e(Ljava/nio/ByteBuffer;)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    :cond_2
    :pswitch_8
    invoke-static {p1}, LU2/o;->f(Ljava/nio/ByteBuffer;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0

    .line 100
    :cond_3
    invoke-static {p1}, LU2/H;->h(Ljava/nio/ByteBuffer;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    return p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method private static Z(Landroid/os/Looper;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static a0(I)I
    .locals 1

    .line 1
    invoke-static {p0}, LU2/s;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, -0x7fffffff

    .line 6
    .line 7
    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    return p0
.end method

.method private b0()J
    .locals 5

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    iget v1, v0, LC2/P$h;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, LC2/P;->K:J

    .line 8
    .line 9
    iget v0, v0, LC2/P$h;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, LC2/P;->L:J

    .line 15
    .line 16
    return-wide v0
.end method

.method private c0()J
    .locals 5

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    iget v1, v0, LC2/P$h;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, LC2/P;->M:J

    .line 8
    .line 9
    iget v0, v0, LC2/P$h;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    invoke-static {v1, v2, v3, v4}, Lt2/a0;->o(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-wide v0, p0, LC2/P;->N:J

    .line 18
    .line 19
    return-wide v0
.end method

.method private d0(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, LC2/P;->m0:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, LC2/P;->m0:J

    .line 5
    .line 6
    iget-object p1, p0, LC2/P;->n0:Landroid/os/Handler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LC2/P;->n0:Landroid/os/Handler;

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, LC2/P;->n0:Landroid/os/Handler;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LC2/P;->n0:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance p2, LC2/N;

    .line 30
    .line 31
    invoke-direct {p2, p0}, LC2/N;-><init>(LC2/P;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v0, 0x64

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static e0()Z
    .locals 2

    .line 1
    sget-object v0, LC2/P;->r0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LC2/P;->t0:I

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public static synthetic f(LC2/z$d;LC2/z$a;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LC2/z$d;->c(LC2/z$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private f0()Z
    .locals 11

    .line 1
    iget-object v0, p0, LC2/P;->n:LC2/P$m;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/P$m;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, LC2/P;->T()Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 16
    .line 17
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 24
    .line 25
    invoke-direct {p0, v0}, LC2/P;->q0(Landroid/media/AudioTrack;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 29
    .line 30
    iget-boolean v2, v0, LC2/P$h;->k:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 35
    .line 36
    iget-object v0, v0, LC2/P$h;->a:Lq2/x;

    .line 37
    .line 38
    iget v3, v0, Lq2/x;->J:I

    .line 39
    .line 40
    iget v0, v0, Lq2/x;->K:I

    .line 41
    .line 42
    invoke-static {v2, v3, v0}, LC2/J;->a(Landroid/media/AudioTrack;II)V

    .line 43
    .line 44
    .line 45
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x1f

    .line 48
    .line 49
    if-lt v0, v2, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, LC2/P;->u:LB2/K1;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 56
    .line 57
    invoke-static {v2, v0}, LC2/P$c;->a(Landroid/media/AudioTrack;LB2/K1;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v3, p0, LC2/P;->i:LC2/B;

    .line 61
    .line 62
    iget-object v4, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 63
    .line 64
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 65
    .line 66
    iget v2, v0, LC2/P$h;->c:I

    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    const/4 v10, 0x1

    .line 70
    if-ne v2, v5, :cond_3

    .line 71
    .line 72
    move v5, v10

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move v5, v1

    .line 75
    :goto_0
    iget v6, v0, LC2/P$h;->g:I

    .line 76
    .line 77
    iget v7, v0, LC2/P$h;->d:I

    .line 78
    .line 79
    iget v8, v0, LC2/P$h;->h:I

    .line 80
    .line 81
    iget-boolean v9, p0, LC2/P;->p0:Z

    .line 82
    .line 83
    invoke-virtual/range {v3 .. v9}, LC2/B;->u(Landroid/media/AudioTrack;ZIIIZ)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, LC2/P;->w0()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, LC2/P;->d0:Lq2/g;

    .line 90
    .line 91
    iget v0, v0, Lq2/g;->a:I

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 101
    .line 102
    iget-object v2, p0, LC2/P;->d0:Lq2/g;

    .line 103
    .line 104
    iget v2, v2, Lq2/g;->b:F

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 107
    .line 108
    .line 109
    :cond_4
    iget-object v0, p0, LC2/P;->e0:LC2/j;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 114
    .line 115
    invoke-static {v2, v0}, LC2/P$b;->b(Landroid/media/AudioTrack;LC2/j;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, LC2/P;->B:LC2/i;

    .line 119
    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    iget-object v2, p0, LC2/P;->e0:LC2/j;

    .line 123
    .line 124
    iget-object v2, v2, LC2/j;->a:Landroid/media/AudioDeviceInfo;

    .line 125
    .line 126
    invoke-virtual {v0, v2}, LC2/i;->j(Landroid/media/AudioDeviceInfo;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    iget-object v0, p0, LC2/P;->B:LC2/i;

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    new-instance v2, LC2/P$l;

    .line 134
    .line 135
    iget-object v3, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 136
    .line 137
    invoke-direct {v2, v3, v0}, LC2/P$l;-><init>(Landroid/media/AudioTrack;LC2/i;)V

    .line 138
    .line 139
    .line 140
    iput-object v2, p0, LC2/P;->C:LC2/P$l;

    .line 141
    .line 142
    :cond_6
    iput-boolean v10, p0, LC2/P;->Q:Z

    .line 143
    .line 144
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iget v2, p0, LC2/P;->b0:I

    .line 151
    .line 152
    if-eq v0, v2, :cond_7

    .line 153
    .line 154
    move v1, v10

    .line 155
    :cond_7
    iput v0, p0, LC2/P;->b0:I

    .line 156
    .line 157
    iget-object v0, p0, LC2/P;->v:LC2/z$d;

    .line 158
    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    iget-object v2, p0, LC2/P;->x:LC2/P$h;

    .line 162
    .line 163
    invoke-virtual {v2}, LC2/P$h;->a()LC2/z$a;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v0, v2}, LC2/z$d;->e(LC2/z$a;)V

    .line 168
    .line 169
    .line 170
    if-eqz v1, :cond_8

    .line 171
    .line 172
    iput-boolean v10, p0, LC2/P;->c0:Z

    .line 173
    .line 174
    iget-object v0, p0, LC2/P;->v:LC2/z$d;

    .line 175
    .line 176
    iget v1, p0, LC2/P;->b0:I

    .line 177
    .line 178
    invoke-interface {v0, v1}, LC2/z$d;->d(I)V

    .line 179
    .line 180
    .line 181
    :cond_8
    return v10
.end method

.method public static synthetic g(LC2/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LC2/P;->l0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static g0(I)Z
    .locals 1

    .line 1
    const/4 v0, -0x6

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/16 v0, -0x20

    .line 5
    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public static synthetic h(Landroid/media/AudioTrack;LC2/z$d;Landroid/os/Handler;LC2/z$a;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    new-instance p0, LC2/O;

    .line 25
    .line 26
    invoke-direct {p0, p1, p3}, LC2/O;-><init>(LC2/z$d;LC2/z$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, LC2/P;->r0:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter p0

    .line 35
    :try_start_1
    sget p1, LC2/P;->t0:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    sput p1, LC2/P;->t0:I

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    sget-object p1, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 46
    .line 47
    .line 48
    sput-object v0, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    monitor-exit p0

    .line 54
    return-void

    .line 55
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    new-instance v1, LC2/O;

    .line 75
    .line 76
    invoke-direct {v1, p1, p3}, LC2/O;-><init>(LC2/z$d;LC2/z$a;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p1, LC2/P;->r0:Ljava/lang/Object;

    .line 83
    .line 84
    monitor-enter p1

    .line 85
    :try_start_2
    sget p2, LC2/P;->t0:I

    .line 86
    .line 87
    add-int/lit8 p2, p2, -0x1

    .line 88
    .line 89
    sput p2, LC2/P;->t0:I

    .line 90
    .line 91
    if-nez p2, :cond_3

    .line 92
    .line 93
    sget-object p2, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 96
    .line 97
    .line 98
    sput-object v0, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_2
    move-exception p0

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    :goto_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    throw p0

    .line 105
    :goto_3
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 106
    throw p0
.end method

.method private h0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method static synthetic i(LC2/P;)Landroid/media/AudioTrack;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 2
    .line 3
    return-object p0
.end method

.method private static i0(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LC2/H;->a(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method static synthetic j(LC2/P;)LC2/z$d;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/P;->v:LC2/z$d;

    .line 2
    .line 3
    return-object p0
.end method

.method private j0()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/P$h;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LC2/P;->i0:Z

    .line 12
    .line 13
    return-void
.end method

.method static synthetic k(LC2/P;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LC2/P;->Z:Z

    .line 2
    .line 3
    return p0
.end method

.method private k0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 5

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    iget v0, v0, LC2/P$h;->c:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide/16 v0, 0x14

    .line 9
    .line 10
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, LC2/P;->x:LC2/P$h;

    .line 15
    .line 16
    iget v2, v2, LC2/P$h;->e:I

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lt2/a0;->H(JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int v0, v0

    .line 23
    invoke-direct {p0}, LC2/P;->c0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    int-to-long v3, v0

    .line 28
    cmp-long v3, v1, v3

    .line 29
    .line 30
    if-ltz v3, :cond_1

    .line 31
    .line 32
    :goto_0
    return-object p1

    .line 33
    :cond_1
    iget-object v3, p0, LC2/P;->x:LC2/P$h;

    .line 34
    .line 35
    iget v4, v3, LC2/P$h;->g:I

    .line 36
    .line 37
    iget v3, v3, LC2/P$h;->d:I

    .line 38
    .line 39
    long-to-int v1, v1

    .line 40
    invoke-static {p1, v4, v3, v1, v0}, LC2/c0;->a(Ljava/nio/ByteBuffer;IIII)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method static synthetic l(LC2/P;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/P;->Y:Z

    .line 2
    .line 3
    return p1
.end method

.method private l0()V
    .locals 4

    .line 1
    iget-wide v0, p0, LC2/P;->m0:J

    .line 2
    .line 3
    const-wide/32 v2, 0x493e0

    .line 4
    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LC2/P;->v:LC2/z$d;

    .line 11
    .line 12
    invoke-interface {v0}, LC2/z$d;->b()V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    iput-wide v0, p0, LC2/P;->m0:J

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method static synthetic m(LC2/P;)J
    .locals 2

    .line 1
    invoke-direct {p0}, LC2/P;->b0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method private m0()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LC2/P;->B:LC2/i;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, LC2/P;->k0:Landroid/os/Looper;

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 17
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "DefaultAudioSink accessed on multiple threads: "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, LC2/P;->k0:Landroid/os/Looper;

    .line 28
    .line 29
    invoke-static {v3}, LC2/P;->Z(Landroid/os/Looper;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v3, " and "

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, LC2/P;->Z(Landroid/os/Looper;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v2}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, LC2/P;->B:LC2/i;

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, LC2/P;->a:Landroid/content/Context;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iput-object v0, p0, LC2/P;->k0:Landroid/os/Looper;

    .line 64
    .line 65
    new-instance v0, LC2/i;

    .line 66
    .line 67
    new-instance v2, LC2/M;

    .line 68
    .line 69
    invoke-direct {v2, p0}, LC2/M;-><init>(LC2/P;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, LC2/P;->D:Lq2/c;

    .line 73
    .line 74
    iget-object v4, p0, LC2/P;->e0:LC2/j;

    .line 75
    .line 76
    invoke-direct {v0, v1, v2, v3, v4}, LC2/i;-><init>(Landroid/content/Context;LC2/i$f;Lq2/c;LC2/j;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, LC2/P;->B:LC2/i;

    .line 80
    .line 81
    invoke-virtual {v0}, LC2/i;->h()LC2/e;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, LC2/P;->A:LC2/e;

    .line 86
    .line 87
    :cond_2
    iget-object v0, p0, LC2/P;->A:LC2/e;

    .line 88
    .line 89
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method static synthetic n(LC2/P;)J
    .locals 2

    .line 1
    invoke-direct {p0}, LC2/P;->c0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method static synthetic o(LC2/P;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LC2/P;->h0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private o0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LC2/P;->X:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LC2/P;->X:Z

    .line 7
    .line 8
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 9
    .line 10
    invoke-direct {p0}, LC2/P;->c0()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, LC2/B;->h(J)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 18
    .line 19
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iput-boolean v1, p0, LC2/P;->Y:Z

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 31
    .line 32
    .line 33
    iput v1, p0, LC2/P;->J:I

    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method static synthetic p()Z
    .locals 1

    .line 1
    invoke-static {}, LC2/P;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private p0(J)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, LC2/P;->U(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr2/n;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    invoke-direct {p0, v0}, LC2/P;->v0(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, p2}, LC2/P;->U(J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 29
    .line 30
    invoke-virtual {v0}, Lr2/n;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_5

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 37
    .line 38
    invoke-virtual {v0}, Lr2/n;->d()Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-direct {p0, v0}, LC2/P;->v0(Ljava/nio/ByteBuffer;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, p2}, LC2/P;->U(J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object v0, p0, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 71
    .line 72
    iget-object v1, p0, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lr2/n;->i(Ljava/nio/ByteBuffer;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic q(I)I
    .locals 0

    .line 1
    invoke-static {p0}, LC2/P;->a0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private q0(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->m:LC2/P$o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LC2/P$o;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LC2/P$o;-><init>(LC2/P;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LC2/P;->m:LC2/P$o;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LC2/P;->m:LC2/P$o;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LC2/P$o;->a(Landroid/media/AudioTrack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private r(J)V
    .locals 8

    .line 1
    invoke-direct {p0}, LC2/P;->A0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, LC2/P;->y0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LC2/P;->b:Lr2/p;

    .line 14
    .line 15
    iget-object v1, p0, LC2/P;->G:Lq2/O;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lr2/p;->c(Lq2/O;)Lq2/O;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, Lq2/O;->d:Lq2/O;

    .line 23
    .line 24
    :goto_0
    iput-object v0, p0, LC2/P;->G:Lq2/O;

    .line 25
    .line 26
    :goto_1
    move-object v2, v0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    sget-object v0, Lq2/O;->d:Lq2/O;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_2
    invoke-direct {p0}, LC2/P;->y0()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, LC2/P;->b:Lr2/p;

    .line 38
    .line 39
    iget-boolean v1, p0, LC2/P;->H:Z

    .line 40
    .line 41
    invoke-interface {v0, v1}, Lr2/p;->e(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const/4 v0, 0x0

    .line 47
    :goto_3
    iput-boolean v0, p0, LC2/P;->H:Z

    .line 48
    .line 49
    iget-object v0, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    new-instance v1, LC2/P$k;

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    iget-object p1, p0, LC2/P;->x:LC2/P$h;

    .line 60
    .line 61
    invoke-direct {p0}, LC2/P;->c0()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    invoke-virtual {p1, v5, v6}, LC2/P$h;->d(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-direct/range {v1 .. v7}, LC2/P$k;-><init>(Lq2/O;JJLC2/P$a;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, LC2/P;->x0()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, LC2/P;->v:LC2/z$d;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-boolean p2, p0, LC2/P;->H:Z

    .line 84
    .line 85
    invoke-interface {p1, p2}, LC2/z$d;->f(Z)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void
.end method

.method private static r0(Landroid/media/AudioTrack;LC2/z$d;LC2/z$a;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LC2/P;->r0:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    sget-object v2, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "ExoPlayer:AudioTrackReleaseThread"

    .line 18
    .line 19
    invoke-static {v2}, Lt2/a0;->X0(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    sget v2, LC2/P;->t0:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    sput v2, LC2/P;->t0:I

    .line 33
    .line 34
    sget-object v2, LC2/P;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 35
    .line 36
    new-instance v3, LC2/L;

    .line 37
    .line 38
    invoke-direct {v3, p0, p1, v0, p2}, LC2/L;-><init>(Landroid/media/AudioTrack;LC2/z$d;Landroid/os/Handler;LC2/z$a;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    const-wide/16 p1, 0x14

    .line 44
    .line 45
    invoke-interface {v2, v3, p1, p2, p0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 46
    .line 47
    .line 48
    monitor-exit v1

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p0
.end method

.method private s(J)J
    .locals 5

    .line 1
    :goto_0
    iget-object v0, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LC2/P$k;

    .line 16
    .line 17
    iget-wide v0, v0, LC2/P$k;->c:J

    .line 18
    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LC2/P$k;

    .line 30
    .line 31
    iput-object v0, p0, LC2/P;->F:LC2/P$k;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, LC2/P;->F:LC2/P$k;

    .line 35
    .line 36
    iget-wide v1, v0, LC2/P$k;->c:J

    .line 37
    .line 38
    sub-long/2addr p1, v1

    .line 39
    iget-object v0, v0, LC2/P$k;->a:Lq2/O;

    .line 40
    .line 41
    iget v0, v0, Lq2/O;->a:F

    .line 42
    .line 43
    invoke-static {p1, p2, v0}, Lt2/a0;->j0(JF)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-object v2, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    iget-object v2, p0, LC2/P;->b:Lr2/p;

    .line 56
    .line 57
    invoke-interface {v2, p1, p2}, Lr2/p;->a(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object v2, p0, LC2/P;->F:LC2/P$k;

    .line 62
    .line 63
    iget-wide v3, v2, LC2/P$k;->b:J

    .line 64
    .line 65
    add-long/2addr v3, p1

    .line 66
    sub-long/2addr p1, v0

    .line 67
    iput-wide p1, v2, LC2/P$k;->d:J

    .line 68
    .line 69
    return-wide v3

    .line 70
    :cond_1
    iget-object p1, p0, LC2/P;->F:LC2/P$k;

    .line 71
    .line 72
    iget-wide v2, p1, LC2/P$k;->b:J

    .line 73
    .line 74
    add-long/2addr v2, v0

    .line 75
    iget-wide p1, p1, LC2/P$k;->d:J

    .line 76
    .line 77
    add-long/2addr v2, p1

    .line 78
    return-wide v2
.end method

.method private s0()V
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LC2/P;->K:J

    .line 4
    .line 5
    iput-wide v0, p0, LC2/P;->L:J

    .line 6
    .line 7
    iput-wide v0, p0, LC2/P;->M:J

    .line 8
    .line 9
    iput-wide v0, p0, LC2/P;->N:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, LC2/P;->j0:Z

    .line 13
    .line 14
    iput v2, p0, LC2/P;->O:I

    .line 15
    .line 16
    new-instance v3, LC2/P$k;

    .line 17
    .line 18
    iget-object v4, p0, LC2/P;->G:Lq2/O;

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    invoke-direct/range {v3 .. v9}, LC2/P$k;-><init>(Lq2/O;JJLC2/P$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, LC2/P;->F:LC2/P$k;

    .line 29
    .line 30
    iput-wide v0, p0, LC2/P;->R:J

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, LC2/P;->E:LC2/P$k;

    .line 34
    .line 35
    iget-object v1, p0, LC2/P;->j:Ljava/util/ArrayDeque;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iput v2, p0, LC2/P;->U:I

    .line 43
    .line 44
    iput-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iput-boolean v2, p0, LC2/P;->X:Z

    .line 47
    .line 48
    iput-boolean v2, p0, LC2/P;->W:Z

    .line 49
    .line 50
    iput-boolean v2, p0, LC2/P;->Y:Z

    .line 51
    .line 52
    iput-object v0, p0, LC2/P;->I:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    iput v2, p0, LC2/P;->J:I

    .line 55
    .line 56
    iget-object v0, p0, LC2/P;->e:LC2/f0;

    .line 57
    .line 58
    invoke-virtual {v0}, LC2/f0;->n()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, LC2/P;->x0()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private t(J)J
    .locals 5

    .line 1
    iget-object v0, p0, LC2/P;->b:Lr2/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lr2/p;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LC2/P;->x:LC2/P$h;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, LC2/P$h;->d(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    add-long/2addr p1, v2

    .line 14
    iget-wide v2, p0, LC2/P;->l0:J

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    iget-object v4, p0, LC2/P;->x:LC2/P$h;

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    invoke-virtual {v4, v2, v3}, LC2/P$h;->d(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iput-wide v0, p0, LC2/P;->l0:J

    .line 29
    .line 30
    invoke-direct {p0, v2, v3}, LC2/P;->d0(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-wide p1
.end method

.method private t0(Lq2/O;)V
    .locals 7

    .line 1
    new-instance v0, LC2/P$k;

    .line 2
    .line 3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v6}, LC2/P$k;-><init>(Lq2/O;JJLC2/P$a;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput-object v0, p0, LC2/P;->E:LC2/P$k;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iput-object v0, p0, LC2/P;->F:LC2/P$k;

    .line 28
    .line 29
    return-void
.end method

.method private u0()V
    .locals 3

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LC2/P;->G:Lq2/O;

    .line 17
    .line 18
    iget v1, v1, Lq2/O;->a:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, LC2/P;->G:Lq2/O;

    .line 25
    .line 26
    iget v1, v1, Lq2/O;->b:F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    iget-object v1, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v1, "DefaultAudioSink"

    .line 45
    .line 46
    const-string v2, "Failed to set playback params"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v0, Lq2/O;

    .line 52
    .line 53
    iget-object v1, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {v0, v1, v2}, Lq2/O;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, LC2/P;->G:Lq2/O;

    .line 77
    .line 78
    iget-object v1, p0, LC2/P;->i:LC2/B;

    .line 79
    .line 80
    iget v0, v0, Lq2/O;->a:F

    .line 81
    .line 82
    invoke-virtual {v1, v0}, LC2/B;->v(F)V

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void
.end method

.method private v(LC2/z$a;Lq2/c;ILq2/x;Landroid/content/Context;)Landroid/media/AudioTrack;
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, LC2/P;->s:LC2/P$f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p5}, LC2/P$f;->a(LC2/z$a;Lq2/c;ILandroid/content/Context;)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 p3, 0x1

    .line 12
    if-ne v1, p3, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    new-instance v0, LC2/z$c;

    .line 19
    .line 20
    iget v2, p1, LC2/z$a;->b:I

    .line 21
    .line 22
    iget v3, p1, LC2/z$a;->c:I

    .line 23
    .line 24
    iget v4, p1, LC2/z$a;->a:I

    .line 25
    .line 26
    iget v5, p1, LC2/z$a;->f:I

    .line 27
    .line 28
    iget-boolean v7, p1, LC2/z$a;->e:Z

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    move-object v6, p4

    .line 32
    invoke-direct/range {v0 .. v8}, LC2/z$c;-><init>(IIIIILq2/x;ZLjava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    :goto_0
    move-object v6, p4

    .line 38
    move-object p2, v0

    .line 39
    move-object v9, p2

    .line 40
    goto :goto_1

    .line 41
    :catch_2
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    new-instance v1, LC2/z$c;

    .line 44
    .line 45
    iget v3, p1, LC2/z$a;->b:I

    .line 46
    .line 47
    iget v4, p1, LC2/z$a;->c:I

    .line 48
    .line 49
    iget v5, p1, LC2/z$a;->a:I

    .line 50
    .line 51
    move-object v7, v6

    .line 52
    iget v6, p1, LC2/z$a;->f:I

    .line 53
    .line 54
    iget-boolean v8, p1, LC2/z$a;->e:Z

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-direct/range {v1 .. v9}, LC2/z$c;-><init>(IIIIILq2/x;ZLjava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method private v0(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-direct {p0, p1}, LC2/P;->k0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LC2/P;->V:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    return-void
.end method

.method private w0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 8
    .line 9
    iget v1, p0, LC2/P;->S:F

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private x0()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 2
    .line 3
    iget-object v0, v0, LC2/P$h;->i:Lr2/n;

    .line 4
    .line 5
    iput-object v0, p0, LC2/P;->y:Lr2/n;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr2/n;->b()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private y0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/P;->f0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 6
    .line 7
    iget v1, v0, LC2/P$h;->c:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LC2/P$h;->a:Lq2/x;

    .line 12
    .line 13
    iget v0, v0, Lq2/x;->I:I

    .line 14
    .line 15
    invoke-direct {p0, v0}, LC2/P;->z0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private z0(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC2/P;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lt2/a0;->K0(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method


# virtual methods
.method public A(Lq2/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, LC2/P;->d0:Lq2/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/g;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p1, Lq2/g;->a:I

    .line 11
    .line 12
    iget v1, p1, Lq2/g;->b:F

    .line 13
    .line 14
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    iget-object v3, p0, LC2/P;->d0:Lq2/g;

    .line 19
    .line 20
    iget v3, v3, Lq2/g;->a:I

    .line 21
    .line 22
    if-eq v3, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 25
    .line 26
    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 32
    .line 33
    .line 34
    :cond_2
    iput-object p1, p0, LC2/P;->d0:Lq2/g;

    .line 35
    .line 36
    return-void
.end method

.method public B(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, LC2/P;->l:I

    .line 14
    .line 15
    return-void
.end method

.method public C()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LC2/P;->f0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LC2/P;->f0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LC2/P;->flush()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public D(Lq2/x;)I
    .locals 4

    .line 1
    invoke-direct {p0}, LC2/P;->m0()V

    .line 2
    .line 3
    .line 4
    const-string v0, "audio/raw"

    .line 5
    .line 6
    iget-object v1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget v0, p1, Lq2/x;->I:I

    .line 17
    .line 18
    invoke-static {v0}, Lt2/a0;->L0(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "Invalid PCM encoding: "

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget p1, p1, Lq2/x;->I:I

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "DefaultAudioSink"

    .line 44
    .line 45
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_0
    iget p1, p1, Lq2/x;->I:I

    .line 50
    .line 51
    if-eq p1, v2, :cond_2

    .line 52
    .line 53
    iget-boolean v0, p0, LC2/P;->c:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-ne p1, v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_2
    :goto_0
    return v2

    .line 64
    :cond_3
    iget-object v0, p0, LC2/P;->A:LC2/e;

    .line 65
    .line 66
    iget-object v3, p0, LC2/P;->D:Lq2/c;

    .line 67
    .line 68
    invoke-virtual {v0, p1, v3}, LC2/e;->j(Lq2/x;Lq2/c;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    return v2

    .line 75
    :cond_4
    return v1
.end method

.method public E(LC2/z$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/P;->v:LC2/z$d;

    .line 2
    .line 3
    return-void
.end method

.method public F(Lq2/x;)LC2/k;
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/P;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, LC2/k;->d:LC2/k;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, LC2/P;->q:LC2/P$d;

    .line 9
    .line 10
    iget-object v1, p0, LC2/P;->D:Lq2/c;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, LC2/P$d;->a(Lq2/x;Lq2/c;)LC2/k;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public G(Ljava/nio/ByteBuffer;JI)Z
    .locals 17

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
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Lt2/a;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, LC2/P;->w:LC2/P$h;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v5, :cond_7

    .line 28
    .line 29
    invoke-direct {v1}, LC2/P;->V()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v7

    .line 36
    :cond_2
    iget-object v5, v1, LC2/P;->w:LC2/P$h;

    .line 37
    .line 38
    iget-object v9, v1, LC2/P;->x:LC2/P$h;

    .line 39
    .line 40
    invoke-virtual {v5, v9}, LC2/P$h;->b(LC2/P$h;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    invoke-direct {v1}, LC2/P;->o0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, LC2/P;->x()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    return v7

    .line 56
    :cond_3
    invoke-virtual {v1}, LC2/P;->flush()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v5, v1, LC2/P;->w:LC2/P$h;

    .line 61
    .line 62
    iput-object v5, v1, LC2/P;->x:LC2/P$h;

    .line 63
    .line 64
    iput-object v8, v1, LC2/P;->w:LC2/P$h;

    .line 65
    .line 66
    iget-object v5, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 67
    .line 68
    if-eqz v5, :cond_6

    .line 69
    .line 70
    invoke-static {v5}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_6

    .line 75
    .line 76
    iget-object v5, v1, LC2/P;->x:LC2/P$h;

    .line 77
    .line 78
    iget-boolean v5, v5, LC2/P$h;->k:Z

    .line 79
    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    iget-object v5, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v9, 0x3

    .line 89
    if-ne v5, v9, :cond_5

    .line 90
    .line 91
    iget-object v5, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 92
    .line 93
    invoke-static {v5}, LC2/I;->a(Landroid/media/AudioTrack;)V

    .line 94
    .line 95
    .line 96
    iget-object v5, v1, LC2/P;->i:LC2/B;

    .line 97
    .line 98
    invoke-virtual {v5}, LC2/B;->a()V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v5, v1, LC2/P;->z:Landroid/media/AudioTrack;

    .line 102
    .line 103
    iget-object v9, v1, LC2/P;->x:LC2/P$h;

    .line 104
    .line 105
    iget-object v9, v9, LC2/P$h;->a:Lq2/x;

    .line 106
    .line 107
    iget v10, v9, Lq2/x;->J:I

    .line 108
    .line 109
    iget v9, v9, Lq2/x;->K:I

    .line 110
    .line 111
    invoke-static {v5, v10, v9}, LC2/J;->a(Landroid/media/AudioTrack;II)V

    .line 112
    .line 113
    .line 114
    iput-boolean v6, v1, LC2/P;->j0:Z

    .line 115
    .line 116
    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3}, LC2/P;->r(J)V

    .line 117
    .line 118
    .line 119
    :cond_7
    invoke-direct {v1}, LC2/P;->h0()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_9

    .line 124
    .line 125
    :try_start_0
    invoke-direct {v1}, LC2/P;->f0()Z

    .line 126
    .line 127
    .line 128
    move-result v5
    :try_end_0
    .catch LC2/z$c; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    if-nez v5, :cond_9

    .line 130
    .line 131
    return v7

    .line 132
    :catch_0
    move-exception v0

    .line 133
    iget-boolean v2, v0, LC2/z$c;->b:Z

    .line 134
    .line 135
    if-nez v2, :cond_8

    .line 136
    .line 137
    iget-object v2, v1, LC2/P;->n:LC2/P$m;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, LC2/P$m;->c(Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    return v7

    .line 143
    :cond_8
    throw v0

    .line 144
    :cond_9
    iget-object v5, v1, LC2/P;->n:LC2/P$m;

    .line 145
    .line 146
    invoke-virtual {v5}, LC2/P$m;->a()V

    .line 147
    .line 148
    .line 149
    iget-boolean v5, v1, LC2/P;->Q:Z

    .line 150
    .line 151
    const-wide/16 v9, 0x0

    .line 152
    .line 153
    if-eqz v5, :cond_b

    .line 154
    .line 155
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    iput-wide v11, v1, LC2/P;->R:J

    .line 160
    .line 161
    iput-boolean v7, v1, LC2/P;->P:Z

    .line 162
    .line 163
    iput-boolean v7, v1, LC2/P;->Q:Z

    .line 164
    .line 165
    invoke-direct {v1}, LC2/P;->A0()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_a

    .line 170
    .line 171
    invoke-direct {v1}, LC2/P;->u0()V

    .line 172
    .line 173
    .line 174
    :cond_a
    invoke-direct {v1, v2, v3}, LC2/P;->r(J)V

    .line 175
    .line 176
    .line 177
    iget-boolean v5, v1, LC2/P;->Z:Z

    .line 178
    .line 179
    if-eqz v5, :cond_b

    .line 180
    .line 181
    invoke-virtual {v1}, LC2/P;->u()V

    .line 182
    .line 183
    .line 184
    :cond_b
    iget-object v5, v1, LC2/P;->i:LC2/B;

    .line 185
    .line 186
    invoke-direct {v1}, LC2/P;->c0()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    invoke-virtual {v5, v11, v12}, LC2/B;->m(J)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_c

    .line 195
    .line 196
    return v7

    .line 197
    :cond_c
    iget-object v5, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    if-nez v5, :cond_17

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 206
    .line 207
    if-ne v5, v11, :cond_d

    .line 208
    .line 209
    move v5, v6

    .line 210
    goto :goto_3

    .line 211
    :cond_d
    move v5, v7

    .line 212
    :goto_3
    invoke-static {v5}, Lt2/a;->a(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_e

    .line 220
    .line 221
    return v6

    .line 222
    :cond_e
    iget-object v5, v1, LC2/P;->x:LC2/P$h;

    .line 223
    .line 224
    iget v11, v5, LC2/P$h;->c:I

    .line 225
    .line 226
    if-eqz v11, :cond_f

    .line 227
    .line 228
    iget v11, v1, LC2/P;->O:I

    .line 229
    .line 230
    if-nez v11, :cond_f

    .line 231
    .line 232
    iget v5, v5, LC2/P$h;->g:I

    .line 233
    .line 234
    invoke-static {v5, v0}, LC2/P;->Y(ILjava/nio/ByteBuffer;)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iput v5, v1, LC2/P;->O:I

    .line 239
    .line 240
    if-nez v5, :cond_f

    .line 241
    .line 242
    return v6

    .line 243
    :cond_f
    iget-object v5, v1, LC2/P;->E:LC2/P$k;

    .line 244
    .line 245
    if-eqz v5, :cond_11

    .line 246
    .line 247
    invoke-direct {v1}, LC2/P;->V()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_10

    .line 252
    .line 253
    return v7

    .line 254
    :cond_10
    invoke-direct {v1, v2, v3}, LC2/P;->r(J)V

    .line 255
    .line 256
    .line 257
    iput-object v8, v1, LC2/P;->E:LC2/P$k;

    .line 258
    .line 259
    :cond_11
    iget-wide v11, v1, LC2/P;->R:J

    .line 260
    .line 261
    iget-object v5, v1, LC2/P;->x:LC2/P$h;

    .line 262
    .line 263
    invoke-direct {v1}, LC2/P;->b0()J

    .line 264
    .line 265
    .line 266
    move-result-wide v13

    .line 267
    iget-object v15, v1, LC2/P;->e:LC2/f0;

    .line 268
    .line 269
    invoke-virtual {v15}, LC2/f0;->m()J

    .line 270
    .line 271
    .line 272
    move-result-wide v15

    .line 273
    sub-long/2addr v13, v15

    .line 274
    invoke-virtual {v5, v13, v14}, LC2/P$h;->e(J)J

    .line 275
    .line 276
    .line 277
    move-result-wide v13

    .line 278
    add-long/2addr v11, v13

    .line 279
    iget-boolean v5, v1, LC2/P;->P:Z

    .line 280
    .line 281
    if-nez v5, :cond_13

    .line 282
    .line 283
    sub-long v13, v11, v2

    .line 284
    .line 285
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v13

    .line 289
    const-wide/32 v15, 0x30d40

    .line 290
    .line 291
    .line 292
    cmp-long v5, v13, v15

    .line 293
    .line 294
    if-lez v5, :cond_13

    .line 295
    .line 296
    iget-object v5, v1, LC2/P;->v:LC2/z$d;

    .line 297
    .line 298
    if-eqz v5, :cond_12

    .line 299
    .line 300
    new-instance v13, LC2/z$e;

    .line 301
    .line 302
    invoke-direct {v13, v2, v3, v11, v12}, LC2/z$e;-><init>(JJ)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v5, v13}, LC2/z$d;->g(Ljava/lang/Exception;)V

    .line 306
    .line 307
    .line 308
    :cond_12
    iput-boolean v6, v1, LC2/P;->P:Z

    .line 309
    .line 310
    :cond_13
    iget-boolean v5, v1, LC2/P;->P:Z

    .line 311
    .line 312
    if-eqz v5, :cond_15

    .line 313
    .line 314
    invoke-direct {v1}, LC2/P;->V()Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-nez v5, :cond_14

    .line 319
    .line 320
    return v7

    .line 321
    :cond_14
    sub-long v11, v2, v11

    .line 322
    .line 323
    iget-wide v13, v1, LC2/P;->R:J

    .line 324
    .line 325
    add-long/2addr v13, v11

    .line 326
    iput-wide v13, v1, LC2/P;->R:J

    .line 327
    .line 328
    iput-boolean v7, v1, LC2/P;->P:Z

    .line 329
    .line 330
    invoke-direct {v1, v2, v3}, LC2/P;->r(J)V

    .line 331
    .line 332
    .line 333
    iget-object v5, v1, LC2/P;->v:LC2/z$d;

    .line 334
    .line 335
    if-eqz v5, :cond_15

    .line 336
    .line 337
    cmp-long v9, v11, v9

    .line 338
    .line 339
    if-eqz v9, :cond_15

    .line 340
    .line 341
    invoke-interface {v5}, LC2/z$d;->k()V

    .line 342
    .line 343
    .line 344
    :cond_15
    iget-object v5, v1, LC2/P;->x:LC2/P$h;

    .line 345
    .line 346
    iget v5, v5, LC2/P$h;->c:I

    .line 347
    .line 348
    if-nez v5, :cond_16

    .line 349
    .line 350
    iget-wide v9, v1, LC2/P;->K:J

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    int-to-long v11, v5

    .line 357
    add-long/2addr v9, v11

    .line 358
    iput-wide v9, v1, LC2/P;->K:J

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_16
    iget-wide v9, v1, LC2/P;->L:J

    .line 362
    .line 363
    iget v5, v1, LC2/P;->O:I

    .line 364
    .line 365
    int-to-long v11, v5

    .line 366
    int-to-long v13, v4

    .line 367
    mul-long/2addr v11, v13

    .line 368
    add-long/2addr v9, v11

    .line 369
    iput-wide v9, v1, LC2/P;->L:J

    .line 370
    .line 371
    :goto_4
    iput-object v0, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 372
    .line 373
    iput v4, v1, LC2/P;->U:I

    .line 374
    .line 375
    :cond_17
    invoke-direct {v1, v2, v3}, LC2/P;->p0(J)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_18

    .line 385
    .line 386
    iput-object v8, v1, LC2/P;->T:Ljava/nio/ByteBuffer;

    .line 387
    .line 388
    iput v7, v1, LC2/P;->U:I

    .line 389
    .line 390
    return v6

    .line 391
    :cond_18
    iget-object v0, v1, LC2/P;->i:LC2/B;

    .line 392
    .line 393
    invoke-direct {v1}, LC2/P;->c0()J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    invoke-virtual {v0, v2, v3}, LC2/B;->l(J)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_19

    .line 402
    .line 403
    const-string v0, "DefaultAudioSink"

    .line 404
    .line 405
    const-string v2, "Resetting stalled audio track"

    .line 406
    .line 407
    invoke-static {v0, v2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, LC2/P;->flush()V

    .line 411
    .line 412
    .line 413
    return v6

    .line 414
    :cond_19
    return v7
.end method

.method public H(Lt2/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LC2/B;->w(Lt2/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public I()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LC2/P;->W:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LC2/P;->V()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, LC2/P;->o0()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, LC2/P;->W:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public J(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, v0, LC2/P$h;->k:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0, p1, p2}, LC2/J;->a(Landroid/media/AudioTrack;II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public K(Lq2/x;I[I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-direct {v1}, LC2/P;->m0()V

    .line 6
    .line 7
    .line 8
    const-string v0, "audio/raw"

    .line 9
    .line 10
    iget-object v2, v3, Lq2/x;->o:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v4, -0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget v0, v3, Lq2/x;->I:I

    .line 21
    .line 22
    invoke-static {v0}, Lt2/a0;->L0(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 27
    .line 28
    .line 29
    iget v0, v3, Lq2/x;->I:I

    .line 30
    .line 31
    iget v6, v3, Lq2/x;->G:I

    .line 32
    .line 33
    invoke-static {v0, v6}, Lt2/a0;->o0(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    new-instance v6, LP9/u$a;

    .line 38
    .line 39
    invoke-direct {v6}, LP9/u$a;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v7, v1, LC2/P;->h:LP9/u;

    .line 43
    .line 44
    invoke-virtual {v6, v7}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 45
    .line 46
    .line 47
    iget v7, v3, Lq2/x;->I:I

    .line 48
    .line 49
    invoke-direct {v1, v7}, LC2/P;->z0(I)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    iget-object v7, v1, LC2/P;->g:LC2/e0;

    .line 56
    .line 57
    invoke-virtual {v6, v7}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v7, v1, LC2/P;->f:Lr2/t;

    .line 62
    .line 63
    invoke-virtual {v6, v7}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 64
    .line 65
    .line 66
    iget-object v7, v1, LC2/P;->b:Lr2/p;

    .line 67
    .line 68
    invoke-interface {v7}, Lr2/p;->b()[Lr2/o;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v6, v7}, LP9/u$a;->i([Ljava/lang/Object;)LP9/u$a;

    .line 73
    .line 74
    .line 75
    :goto_0
    new-instance v7, Lr2/n;

    .line 76
    .line 77
    invoke-virtual {v6}, LP9/u$a;->k()LP9/u;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-direct {v7, v6}, Lr2/n;-><init>(LP9/u;)V

    .line 82
    .line 83
    .line 84
    iget-object v6, v1, LC2/P;->y:Lr2/n;

    .line 85
    .line 86
    invoke-virtual {v7, v6}, Lr2/n;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_1

    .line 91
    .line 92
    iget-object v7, v1, LC2/P;->y:Lr2/n;

    .line 93
    .line 94
    :cond_1
    iget-object v6, v1, LC2/P;->e:LC2/f0;

    .line 95
    .line 96
    iget v8, v3, Lq2/x;->J:I

    .line 97
    .line 98
    iget v9, v3, Lq2/x;->K:I

    .line 99
    .line 100
    invoke-virtual {v6, v8, v9}, LC2/f0;->o(II)V

    .line 101
    .line 102
    .line 103
    iget-object v6, v1, LC2/P;->d:LC2/C;

    .line 104
    .line 105
    move-object/from16 v8, p3

    .line 106
    .line 107
    invoke-virtual {v6, v8}, LC2/C;->m([I)V

    .line 108
    .line 109
    .line 110
    new-instance v6, Lr2/o$a;

    .line 111
    .line 112
    invoke-direct {v6, v3}, Lr2/o$a;-><init>(Lq2/x;)V

    .line 113
    .line 114
    .line 115
    :try_start_0
    invoke-virtual {v7, v6}, Lr2/n;->a(Lr2/o$a;)Lr2/o$a;

    .line 116
    .line 117
    .line 118
    move-result-object v6
    :try_end_0
    .catch Lr2/o$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    iget v8, v6, Lr2/o$a;->c:I

    .line 120
    .line 121
    iget v9, v6, Lr2/o$a;->a:I

    .line 122
    .line 123
    iget-object v10, v1, LC2/P;->s:LC2/P$f;

    .line 124
    .line 125
    iget v11, v6, Lr2/o$a;->b:I

    .line 126
    .line 127
    invoke-interface {v10, v11}, LC2/P$f;->b(I)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    iget v6, v6, Lr2/o$a;->b:I

    .line 132
    .line 133
    invoke-static {v8, v6}, Lt2/a0;->o0(II)I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    iget-boolean v11, v1, LC2/P;->k:Z

    .line 138
    .line 139
    move v15, v5

    .line 140
    move v14, v8

    .line 141
    move v8, v10

    .line 142
    move v10, v11

    .line 143
    move-object v11, v7

    .line 144
    move v7, v6

    .line 145
    move v6, v15

    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :catch_0
    move-exception v0

    .line 149
    new-instance v2, LC2/z$b;

    .line 150
    .line 151
    invoke-direct {v2, v0, v3}, LC2/z$b;-><init>(Ljava/lang/Throwable;Lq2/x;)V

    .line 152
    .line 153
    .line 154
    throw v2

    .line 155
    :cond_2
    new-instance v7, Lr2/n;

    .line 156
    .line 157
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {v7, v0}, Lr2/n;-><init>(LP9/u;)V

    .line 162
    .line 163
    .line 164
    iget v9, v3, Lq2/x;->H:I

    .line 165
    .line 166
    iget v0, v1, LC2/P;->l:I

    .line 167
    .line 168
    if-eqz v0, :cond_3

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p1}, LC2/P;->F(Lq2/x;)LC2/k;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    goto :goto_1

    .line 175
    :cond_3
    sget-object v0, LC2/k;->d:LC2/k;

    .line 176
    .line 177
    :goto_1
    iget v6, v1, LC2/P;->l:I

    .line 178
    .line 179
    if-eqz v6, :cond_4

    .line 180
    .line 181
    iget-boolean v6, v0, LC2/k;->a:Z

    .line 182
    .line 183
    if-eqz v6, :cond_4

    .line 184
    .line 185
    iget-object v6, v3, Lq2/x;->o:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v6}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Ljava/lang/String;

    .line 192
    .line 193
    iget-object v8, v3, Lq2/x;->k:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v6, v8}, Lq2/K;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    iget-object v6, v1, LC2/P;->s:LC2/P$f;

    .line 200
    .line 201
    iget v10, v3, Lq2/x;->G:I

    .line 202
    .line 203
    invoke-interface {v6, v10}, LC2/P$f;->b(I)I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    iget-boolean v0, v0, LC2/k;->b:Z

    .line 208
    .line 209
    move v6, v0

    .line 210
    move v0, v4

    .line 211
    move-object v11, v7

    .line 212
    move v14, v8

    .line 213
    move v8, v10

    .line 214
    const/4 v10, 0x1

    .line 215
    const/4 v15, 0x1

    .line 216
    :goto_2
    move v7, v0

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    iget-object v0, v1, LC2/P;->A:LC2/e;

    .line 219
    .line 220
    iget-object v6, v1, LC2/P;->D:Lq2/c;

    .line 221
    .line 222
    invoke-virtual {v0, v3, v6}, LC2/e;->h(Lq2/x;Lq2/c;)Landroid/util/Pair;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_c

    .line 227
    .line 228
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    iget-boolean v11, v1, LC2/P;->k:Z

    .line 245
    .line 246
    const/4 v0, 0x2

    .line 247
    move v15, v0

    .line 248
    move v0, v4

    .line 249
    move v6, v5

    .line 250
    move v14, v8

    .line 251
    move v8, v10

    .line 252
    move v10, v11

    .line 253
    move-object v11, v7

    .line 254
    goto :goto_2

    .line 255
    :goto_3
    const-string v12, ") for: "

    .line 256
    .line 257
    if-eqz v14, :cond_b

    .line 258
    .line 259
    if-eqz v8, :cond_a

    .line 260
    .line 261
    iget v12, v3, Lq2/x;->j:I

    .line 262
    .line 263
    const-string v13, "audio/vnd.dts.hd;profile=lbr"

    .line 264
    .line 265
    iget-object v2, v3, Lq2/x;->o:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_5

    .line 272
    .line 273
    if-ne v12, v4, :cond_5

    .line 274
    .line 275
    const v12, 0xbb800

    .line 276
    .line 277
    .line 278
    :cond_5
    move/from16 v18, v12

    .line 279
    .line 280
    if-eqz p2, :cond_6

    .line 281
    .line 282
    move/from16 v2, p2

    .line 283
    .line 284
    move/from16 v17, v9

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_6
    iget-object v12, v1, LC2/P;->p:LC2/P$e;

    .line 288
    .line 289
    invoke-static {v9, v8, v14}, LC2/P;->W(III)I

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-eq v7, v4, :cond_7

    .line 294
    .line 295
    move/from16 v16, v7

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_7
    const/16 v16, 0x1

    .line 299
    .line 300
    :goto_4
    if-eqz v10, :cond_8

    .line 301
    .line 302
    const-wide/high16 v19, 0x4020000000000000L    # 8.0

    .line 303
    .line 304
    :goto_5
    move/from16 v17, v9

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_8
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :goto_6
    invoke-interface/range {v12 .. v20}, LC2/P$e;->a(IIIIIID)I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    :goto_7
    iput-boolean v5, v1, LC2/P;->i0:Z

    .line 315
    .line 316
    move v12, v10

    .line 317
    move v10, v2

    .line 318
    new-instance v2, LC2/P$h;

    .line 319
    .line 320
    move v9, v14

    .line 321
    iget-boolean v14, v1, LC2/P;->f0:Z

    .line 322
    .line 323
    move v4, v0

    .line 324
    move v13, v6

    .line 325
    move v6, v7

    .line 326
    move v5, v15

    .line 327
    move/from16 v7, v17

    .line 328
    .line 329
    invoke-direct/range {v2 .. v14}, LC2/P$h;-><init>(Lq2/x;IIIIIIILr2/n;ZZZ)V

    .line 330
    .line 331
    .line 332
    invoke-direct {v1}, LC2/P;->h0()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_9

    .line 337
    .line 338
    iput-object v2, v1, LC2/P;->w:LC2/P$h;

    .line 339
    .line 340
    return-void

    .line 341
    :cond_9
    iput-object v2, v1, LC2/P;->x:LC2/P$h;

    .line 342
    .line 343
    return-void

    .line 344
    :cond_a
    new-instance v0, LC2/z$b;

    .line 345
    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const-string v4, "Invalid output channel config (mode="

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-direct {v0, v2, v3}, LC2/z$b;-><init>(Ljava/lang/String;Lq2/x;)V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :cond_b
    new-instance v0, LC2/z$b;

    .line 374
    .line 375
    new-instance v2, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    const-string v4, "Invalid output encoding (mode="

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-direct {v0, v2, v3}, LC2/z$b;-><init>(Ljava/lang/String;Lq2/x;)V

    .line 399
    .line 400
    .line 401
    throw v0

    .line 402
    :cond_c
    new-instance v0, LC2/z$b;

    .line 403
    .line 404
    new-instance v2, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 407
    .line 408
    .line 409
    const-string v4, "Unable to configure passthrough for: "

    .line 410
    .line 411
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-direct {v0, v2, v3}, LC2/z$b;-><init>(Ljava/lang/String;Lq2/x;)V

    .line 422
    .line 423
    .line 424
    throw v0
.end method

.method public L(Z)J
    .locals 4

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, LC2/P;->Q:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, LC2/P;->i:LC2/B;

    .line 13
    .line 14
    invoke-virtual {p1}, LC2/B;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, LC2/P;->x:LC2/P$h;

    .line 19
    .line 20
    invoke-direct {p0}, LC2/P;->c0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {p1, v2, v3}, LC2/P$h;->d(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-direct {p0, v0, v1}, LC2/P;->s(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, v0, v1}, LC2/P;->t(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 42
    .line 43
    return-wide v0
.end method

.method public N()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC2/P;->P:Z

    .line 3
    .line 4
    return-void
.end method

.method public O()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LC2/P;->a0:Z

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LC2/P;->f0:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LC2/P;->f0:Z

    .line 12
    .line 13
    invoke-virtual {p0}, LC2/P;->flush()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public P(Lq2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->D:Lq2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/c;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, LC2/P;->D:Lq2/c;

    .line 11
    .line 12
    iget-boolean v0, p0, LC2/P;->f0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    iget-object v0, p0, LC2/P;->B:LC2/i;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LC2/i;->i(Lq2/c;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p0}, LC2/P;->flush()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public Q(LB2/K1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/P;->u:LB2/K1;

    .line 2
    .line 3
    return-void
.end method

.method public R(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/P;->H:Z

    .line 2
    .line 3
    invoke-direct {p0}, LC2/P;->A0()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lq2/O;->d:Lq2/O;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, LC2/P;->G:Lq2/O;

    .line 13
    .line 14
    :goto_0
    invoke-direct {p0, p1}, LC2/P;->t0(Lq2/O;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->B:LC2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LC2/i;->k()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(Lq2/x;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC2/P;->D(Lq2/x;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P;->G:Lq2/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, LC2/P;->W:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LC2/P;->x()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public e(Lq2/O;)V
    .locals 5

    .line 1
    new-instance v0, Lq2/O;

    .line 2
    .line 3
    iget v1, p1, Lq2/O;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lt2/a0;->q(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v4, p1, Lq2/O;->b:F

    .line 15
    .line 16
    invoke-static {v4, v2, v3}, Lt2/a0;->q(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2}, Lq2/O;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LC2/P;->G:Lq2/O;

    .line 24
    .line 25
    invoke-direct {p0}, LC2/P;->A0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, LC2/P;->u0()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-direct {p0, p1}, LC2/P;->t0(Lq2/O;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public flush()V
    .locals 4

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-direct {p0}, LC2/P;->s0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 12
    .line 13
    invoke-virtual {v0}, LC2/B;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 25
    .line 26
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, LC2/P;->m:LC2/P$o;

    .line 33
    .line 34
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LC2/P$o;

    .line 39
    .line 40
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, LC2/P$o;->b(Landroid/media/AudioTrack;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, LC2/P;->x:LC2/P$h;

    .line 46
    .line 47
    invoke-virtual {v0}, LC2/P$h;->a()LC2/z$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v2, p0, LC2/P;->w:LC2/P$h;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iput-object v2, p0, LC2/P;->x:LC2/P$h;

    .line 56
    .line 57
    iput-object v1, p0, LC2/P;->w:LC2/P$h;

    .line 58
    .line 59
    :cond_2
    iget-object v2, p0, LC2/P;->i:LC2/B;

    .line 60
    .line 61
    invoke-virtual {v2}, LC2/B;->s()V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, LC2/P;->C:LC2/P$l;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, LC2/P$l;->c()V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LC2/P;->C:LC2/P$l;

    .line 72
    .line 73
    :cond_3
    iget-object v2, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 74
    .line 75
    iget-object v3, p0, LC2/P;->v:LC2/z$d;

    .line 76
    .line 77
    invoke-static {v2, v3, v0}, LC2/P;->r0(Landroid/media/AudioTrack;LC2/z$d;LC2/z$a;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 81
    .line 82
    :cond_4
    iget-object v0, p0, LC2/P;->o:LC2/P$m;

    .line 83
    .line 84
    invoke-virtual {v0}, LC2/P$m;->a()V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LC2/P;->n:LC2/P$m;

    .line 88
    .line 89
    invoke-virtual {v0}, LC2/P$m;->a()V

    .line 90
    .line 91
    .line 92
    const-wide/16 v2, 0x0

    .line 93
    .line 94
    iput-wide v2, p0, LC2/P;->l0:J

    .line 95
    .line 96
    iput-wide v2, p0, LC2/P;->m0:J

    .line 97
    .line 98
    iget-object v0, p0, LC2/P;->n0:Landroid/os/Handler;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/os/Handler;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    return-void
.end method

.method public n0(LC2/e;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LC2/P;->k0:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Current looper ("

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, LC2/P;->Z(Landroid/os/Looper;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ") is not the playback looper ("

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LC2/P;->k0:Landroid/os/Looper;

    .line 35
    .line 36
    invoke-static {v0}, LC2/P;->Z(Landroid/os/Looper;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ")"

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v1, v0}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LC2/P;->A:LC2/e;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1, v0}, LC2/e;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    iput-object p1, p0, LC2/P;->A:LC2/e;

    .line 66
    .line 67
    iget-object p1, p0, LC2/P;->v:LC2/z$d;

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-interface {p1}, LC2/z$d;->j()V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LC2/P;->Z:Z

    .line 3
    .line 4
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 11
    .line 12
    invoke-virtual {v0}, LC2/B;->r()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, LC2/P;->X:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LC2/P;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC2/P;->h:LP9/u;

    .line 5
    .line 6
    invoke-virtual {v0}, LP9/u;->l()LP9/X;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lr2/o;

    .line 21
    .line 22
    invoke-interface {v1}, Lr2/o;->reset()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, LC2/P;->f:Lr2/t;

    .line 27
    .line 28
    invoke-virtual {v0}, Lr2/q;->reset()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LC2/P;->g:LC2/e0;

    .line 32
    .line 33
    invoke-virtual {v0}, Lr2/q;->reset()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LC2/P;->y:Lr2/n;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Lr2/n;->j()V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, LC2/P;->Z:Z

    .line 45
    .line 46
    iput-boolean v0, p0, LC2/P;->i0:Z

    .line 47
    .line 48
    return-void
.end method

.method public setPreferredDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, LC2/j;

    .line 6
    .line 7
    invoke-direct {v0, p1}, LC2/j;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    iput-object v0, p0, LC2/P;->e0:LC2/j;

    .line 11
    .line 12
    iget-object v0, p0, LC2/P;->B:LC2/i;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LC2/i;->j(Landroid/media/AudioDeviceInfo;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, LC2/P;->e0:LC2/j;

    .line 24
    .line 25
    invoke-static {p1, v0}, LC2/P$b;->b(Landroid/media/AudioTrack;LC2/j;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC2/P;->Z:Z

    .line 3
    .line 4
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 11
    .line 12
    invoke-virtual {v0}, LC2/B;->x()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, LC2/P;->X:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0}, LC2/P;->i0(Landroid/media/AudioTrack;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public w(F)V
    .locals 1

    .line 1
    iget v0, p0, LC2/P;->S:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, LC2/P;->S:F

    .line 8
    .line 9
    invoke-direct {p0}, LC2/P;->w0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public x()Z
    .locals 3

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, LC2/H;->a(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, LC2/P;->Y:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LC2/P;->i:LC2/B;

    .line 26
    .line 27
    invoke-direct {p0}, LC2/P;->c0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, LC2/B;->j(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public y(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/P;->c0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, LC2/P;->b0:I

    .line 7
    .line 8
    if-ne v0, p1, :cond_2

    .line 9
    .line 10
    iput-boolean v1, p0, LC2/P;->c0:Z

    .line 11
    .line 12
    :cond_0
    iget v0, p0, LC2/P;->b0:I

    .line 13
    .line 14
    if-eq v0, p1, :cond_2

    .line 15
    .line 16
    iput p1, p0, LC2/P;->b0:I

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :cond_1
    iput-boolean v1, p0, LC2/P;->a0:Z

    .line 22
    .line 23
    invoke-virtual {p0}, LC2/P;->flush()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public z()J
    .locals 2

    .line 1
    invoke-direct {p0}, LC2/P;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-object v0, p0, LC2/P;->z:Landroid/media/AudioTrack;

    .line 14
    .line 15
    iget-object v1, p0, LC2/P;->x:LC2/P$h;

    .line 16
    .line 17
    invoke-static {v0, v1}, LC2/P$b;->a(Landroid/media/AudioTrack;LC2/P$h;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method
