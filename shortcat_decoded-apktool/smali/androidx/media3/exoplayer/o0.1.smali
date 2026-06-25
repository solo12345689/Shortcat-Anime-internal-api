.class final Landroidx/media3/exoplayer/o0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements LM2/C$a;
.implements LP2/G$a;
.implements Landroidx/media3/exoplayer/J0$d;
.implements Landroidx/media3/exoplayer/k$a;
.implements Landroidx/media3/exoplayer/L0$a;
.implements Landroidx/media3/exoplayer/g$a;
.implements LS2/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/o0$f;,
        Landroidx/media3/exoplayer/o0$e;,
        Landroidx/media3/exoplayer/o0$h;,
        Landroidx/media3/exoplayer/o0$b;,
        Landroidx/media3/exoplayer/o0$c;,
        Landroidx/media3/exoplayer/o0$d;,
        Landroidx/media3/exoplayer/o0$g;
    }
.end annotation


# static fields
.field private static final I0:J


# instance fields
.field private final A:Z

.field private A0:Landroidx/media3/exoplayer/s;

.field private final B:Landroidx/media3/exoplayer/g;

.field private B0:J

.field private C:LA2/Q;

.field private C0:J

.field private D:LA2/P;

.field private D0:Landroidx/media3/exoplayer/ExoPlayer$c;

.field private E:LA2/Q;

.field private E0:Lq2/Y;

.field private F:Z

.field private F0:J

.field private G:Z

.field private G0:Z

.field private H:Landroidx/media3/exoplayer/o0$h;

.field private H0:F

.field private I:Landroidx/media3/exoplayer/K0;

.field private X:Landroidx/media3/exoplayer/o0$e;

.field private Y:Z

.field private Z:Z

.field private final a:[Landroidx/media3/exoplayer/P0;

.field private final b:[Landroidx/media3/exoplayer/O0;

.field private final c:[Z

.field private final d:LP2/G;

.field private final e:LP2/H;

.field private final f:Landroidx/media3/exoplayer/p0;

.field private final g:LQ2/d;

.field private final h:Lt2/s;

.field private final i:LA2/M;

.field private final j:Landroid/os/Looper;

.field private final k:Lq2/Y$d;

.field private final l:Lq2/Y$b;

.field private l0:Z

.field private final m:J

.field private m0:Z

.field private final n:Z

.field private n0:J

.field private final o:Landroidx/media3/exoplayer/k;

.field private o0:Z

.field private final p:Ljava/util/ArrayList;

.field private p0:I

.field private final q:Lt2/j;

.field private q0:Z

.field private final r:Landroidx/media3/exoplayer/o0$f;

.field private r0:Z

.field private final s:Landroidx/media3/exoplayer/u0;

.field private s0:Z

.field private final t:Landroidx/media3/exoplayer/J0;

.field private t0:Z

.field private final u:LA2/K;

.field private u0:I

.field private final v:J

.field private v0:Landroidx/media3/exoplayer/o0$h;

.field private final w:LB2/K1;

.field private w0:J

.field private final x:Z

.field private x0:J

.field private final y:LB2/a;

.field private y0:I

.field private final z:Lt2/s;

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Landroidx/media3/exoplayer/o0;->I0:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Landroidx/media3/exoplayer/N0;[Landroidx/media3/exoplayer/N0;LP2/G;LP2/H;Landroidx/media3/exoplayer/p0;LQ2/d;IZLB2/a;LA2/Q;LA2/K;JZZLandroid/os/Looper;Lt2/j;Landroidx/media3/exoplayer/o0$f;LB2/K1;LA2/M;Landroidx/media3/exoplayer/ExoPlayer$c;LS2/u;)V
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p10

    move-wide/from16 v5, p13

    move-object/from16 v7, p18

    move-object/from16 v8, p20

    move-object/from16 v9, p22

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v10, p0, Landroidx/media3/exoplayer/o0;->F0:J

    move-object/from16 v12, p19

    .line 3
    iput-object v12, p0, Landroidx/media3/exoplayer/o0;->r:Landroidx/media3/exoplayer/o0$f;

    .line 4
    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->d:LP2/G;

    move-object/from16 v12, p5

    .line 5
    iput-object v12, p0, Landroidx/media3/exoplayer/o0;->e:LP2/H;

    .line 6
    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 7
    iput-object v3, p0, Landroidx/media3/exoplayer/o0;->g:LQ2/d;

    move/from16 v13, p8

    .line 8
    iput v13, p0, Landroidx/media3/exoplayer/o0;->p0:I

    move/from16 v13, p9

    .line 9
    iput-boolean v13, p0, Landroidx/media3/exoplayer/o0;->q0:Z

    move-object/from16 v13, p11

    .line 10
    iput-object v13, p0, Landroidx/media3/exoplayer/o0;->C:LA2/Q;

    move-object/from16 v13, p12

    .line 11
    iput-object v13, p0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 12
    iput-wide v5, p0, Landroidx/media3/exoplayer/o0;->v:J

    .line 13
    iput-wide v5, p0, Landroidx/media3/exoplayer/o0;->B0:J

    move/from16 v5, p15

    .line 14
    iput-boolean v5, p0, Landroidx/media3/exoplayer/o0;->Z:Z

    move/from16 v5, p16

    .line 15
    iput-boolean v5, p0, Landroidx/media3/exoplayer/o0;->x:Z

    .line 16
    iput-object v7, p0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 17
    iput-object v8, p0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 18
    iput-object v9, p0, Landroidx/media3/exoplayer/o0;->D0:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 19
    iput-object v4, p0, Landroidx/media3/exoplayer/o0;->y:LB2/a;

    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    iput v5, p0, Landroidx/media3/exoplayer/o0;->H0:F

    .line 21
    sget-object v5, LA2/P;->i:LA2/P;

    iput-object v5, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 22
    iput-wide v10, p0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 23
    iput-wide v10, p0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 24
    invoke-interface {v2, v8}, Landroidx/media3/exoplayer/p0;->h(LB2/K1;)J

    move-result-wide v5

    iput-wide v5, p0, Landroidx/media3/exoplayer/o0;->m:J

    .line 25
    invoke-interface {v2, v8}, Landroidx/media3/exoplayer/p0;->j(LB2/K1;)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/media3/exoplayer/o0;->n:Z

    .line 26
    sget-object v2, Lq2/Y;->a:Lq2/Y;

    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->E0:Lq2/Y;

    .line 27
    invoke-static {v12}, Landroidx/media3/exoplayer/K0;->k(LP2/H;)Landroidx/media3/exoplayer/K0;

    move-result-object v2

    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 28
    new-instance v5, Landroidx/media3/exoplayer/o0$e;

    invoke-direct {v5, v2}, Landroidx/media3/exoplayer/o0$e;-><init>(Landroidx/media3/exoplayer/K0;)V

    iput-object v5, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 29
    array-length v2, v0

    new-array v2, v2, [Landroidx/media3/exoplayer/O0;

    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->b:[Landroidx/media3/exoplayer/O0;

    .line 30
    array-length v2, v0

    new-array v2, v2, [Z

    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->c:[Z

    .line 31
    invoke-virtual {v1}, LP2/G;->d()Landroidx/media3/exoplayer/O0$a;

    move-result-object v2

    .line 32
    array-length v5, v0

    new-array v5, v5, [Landroidx/media3/exoplayer/P0;

    iput-object v5, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    const/4 v5, 0x0

    move v6, v5

    .line 33
    :goto_0
    array-length v10, v0

    const/4 v11, 0x1

    if-ge v5, v10, :cond_2

    .line 34
    aget-object v10, v0, v5

    invoke-interface {v10, v5, v8, v7}, Landroidx/media3/exoplayer/N0;->w(ILB2/K1;Lt2/j;)V

    .line 35
    iget-object v10, p0, Landroidx/media3/exoplayer/o0;->b:[Landroidx/media3/exoplayer/O0;

    aget-object v12, v0, v5

    invoke-interface {v12}, Landroidx/media3/exoplayer/N0;->G()Landroidx/media3/exoplayer/O0;

    move-result-object v12

    aput-object v12, v10, v5

    if-eqz v2, :cond_0

    .line 36
    iget-object v10, p0, Landroidx/media3/exoplayer/o0;->b:[Landroidx/media3/exoplayer/O0;

    aget-object v10, v10, v5

    invoke-interface {v10, v2}, Landroidx/media3/exoplayer/O0;->H(Landroidx/media3/exoplayer/O0$a;)V

    .line 37
    :cond_0
    aget-object v10, p3, v5

    if-eqz v10, :cond_1

    .line 38
    invoke-interface {v10, v5, v8, v7}, Landroidx/media3/exoplayer/N0;->w(ILB2/K1;Lt2/j;)V

    move v6, v11

    .line 39
    :cond_1
    iget-object v10, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    new-instance v11, Landroidx/media3/exoplayer/P0;

    aget-object v12, v0, v5

    aget-object v13, p3, v5

    invoke-direct {v11, v12, v13, v5}, Landroidx/media3/exoplayer/P0;-><init>(Landroidx/media3/exoplayer/N0;Landroidx/media3/exoplayer/N0;I)V

    aput-object v11, v10, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 40
    :cond_2
    iput-boolean v6, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 41
    new-instance v0, Landroidx/media3/exoplayer/k;

    invoke-direct {v0, p0, v7}, Landroidx/media3/exoplayer/k;-><init>(Landroidx/media3/exoplayer/k$a;Lt2/j;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Lq2/Y$d;

    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 44
    new-instance v0, Lq2/Y$b;

    invoke-direct {v0}, Lq2/Y$b;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 45
    invoke-virtual {v1, p0, v3}, LP2/G;->e(LP2/G$a;LQ2/d;)V

    .line 46
    iput-boolean v11, p0, Landroidx/media3/exoplayer/o0;->z0:Z

    const/4 v0, 0x0

    move-object/from16 v1, p17

    .line 47
    invoke-interface {v7, v1, v0}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->z:Lt2/s;

    .line 48
    new-instance v1, Landroidx/media3/exoplayer/u0;

    new-instance v2, Landroidx/media3/exoplayer/m0;

    invoke-direct {v2, p0}, Landroidx/media3/exoplayer/m0;-><init>(Landroidx/media3/exoplayer/o0;)V

    invoke-direct {v1, v4, v0, v2, v9}, Landroidx/media3/exoplayer/u0;-><init>(LB2/a;Lt2/s;Landroidx/media3/exoplayer/r0$a;Landroidx/media3/exoplayer/ExoPlayer$c;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 49
    new-instance v1, Landroidx/media3/exoplayer/J0;

    invoke-direct {v1, p0, v4, v0, v8}, Landroidx/media3/exoplayer/J0;-><init>(Landroidx/media3/exoplayer/J0$d;LB2/a;Lt2/s;LB2/K1;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    if-nez p21, :cond_3

    .line 50
    new-instance v0, LA2/M;

    invoke-direct {v0}, LA2/M;-><init>()V

    goto :goto_1

    :cond_3
    move-object/from16 v0, p21

    :goto_1
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->i:LA2/M;

    .line 51
    invoke-virtual {v0}, LA2/M;->a()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 52
    invoke-interface {v7, v0, p0}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    move-result-object v1

    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 53
    new-instance v2, Landroidx/media3/exoplayer/g;

    invoke-direct {v2, p1, v0, p0}, Landroidx/media3/exoplayer/g;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroidx/media3/exoplayer/g$a;)V

    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 54
    new-instance p1, Landroidx/media3/exoplayer/n0;

    move-object/from16 v0, p23

    invoke-direct {p1, p0, v0}, Landroidx/media3/exoplayer/n0;-><init>(Landroidx/media3/exoplayer/o0;LS2/u;)V

    const/16 v0, 0x23

    .line 55
    invoke-interface {v1, v0, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    move-result-object p1

    .line 56
    invoke-interface {p1}, Lt2/s$a;->a()V

    return-void
.end method

.method private A(Landroidx/media3/exoplayer/s0;J)Landroidx/media3/exoplayer/r0;
    .locals 11

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->b:[Landroidx/media3/exoplayer/O0;

    .line 4
    .line 5
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->d:LP2/G;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 8
    .line 9
    invoke-interface {v2}, Landroidx/media3/exoplayer/p0;->f()LQ2/b;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v6, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 14
    .line 15
    iget-object v8, p0, Landroidx/media3/exoplayer/o0;->e:LP2/H;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->D0:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 18
    .line 19
    iget-wide v9, v2, Landroidx/media3/exoplayer/ExoPlayer$c;->a:J

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    move-wide v2, p2

    .line 23
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/r0;-><init>([Landroidx/media3/exoplayer/O0;JLP2/G;LQ2/b;Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/s0;LP2/H;J)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method private A0()V
    .locals 14

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_9

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v2, :cond_c

    .line 22
    .line 23
    iget-boolean v2, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->g0()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto/16 :goto_9

    .line 36
    .line 37
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 50
    .line 51
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v2, v3, :cond_3

    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-boolean v2, v2, Landroidx/media3/exoplayer/r0;->f:Z

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroidx/media3/exoplayer/r0;->n()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    cmp-long v2, v2, v4

    .line 78
    .line 79
    if-gez v2, :cond_4

    .line 80
    .line 81
    goto/16 :goto_9

    .line 82
    .line 83
    :cond_4
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->d()Landroidx/media3/exoplayer/r0;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    invoke-virtual {v12}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 98
    .line 99
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 100
    .line 101
    iget-object v3, v12, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 102
    .line 103
    iget-object v3, v3, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 104
    .line 105
    iget-object v1, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 106
    .line 107
    iget-object v4, v1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 108
    .line 109
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    move-object v1, v2

    .line 116
    move-object v2, v3

    .line 117
    move-object v3, v1

    .line 118
    move-object v0, p0

    .line 119
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/o0;->i2(Lq2/Y;LM2/D$b;Lq2/Y;LM2/D$b;JZ)V

    .line 120
    .line 121
    .line 122
    iget-boolean v1, v12, Landroidx/media3/exoplayer/r0;->f:Z

    .line 123
    .line 124
    if-eqz v1, :cond_b

    .line 125
    .line 126
    iget-boolean v1, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 127
    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    iget-wide v1, p0, Landroidx/media3/exoplayer/o0;->F0:J

    .line 131
    .line 132
    cmp-long v1, v1, v8

    .line 133
    .line 134
    if-nez v1, :cond_6

    .line 135
    .line 136
    :cond_5
    iget-object v1, v12, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 137
    .line 138
    invoke-interface {v1}, LM2/C;->k()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    cmp-long v1, v1, v8

    .line 143
    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    :cond_6
    iput-wide v8, p0, Landroidx/media3/exoplayer/o0;->F0:J

    .line 147
    .line 148
    iget-boolean v1, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 149
    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    iget-boolean v1, p0, Landroidx/media3/exoplayer/o0;->G0:Z

    .line 153
    .line 154
    if-nez v1, :cond_7

    .line 155
    .line 156
    const/4 v1, 0x1

    .line 157
    goto :goto_0

    .line 158
    :cond_7
    move v1, v10

    .line 159
    :goto_0
    if-eqz v1, :cond_a

    .line 160
    .line 161
    move v2, v10

    .line 162
    :goto_1
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 163
    .line 164
    array-length v3, v3

    .line 165
    if-ge v2, v3, :cond_a

    .line 166
    .line 167
    invoke-virtual {v13, v2}, LP2/H;->c(I)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_9

    .line 172
    .line 173
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 174
    .line 175
    aget-object v3, v3, v2

    .line 176
    .line 177
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->m()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/4 v4, -0x2

    .line 182
    if-ne v3, v4, :cond_8

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    iget-object v3, v13, LP2/H;->c:[LP2/A;

    .line 186
    .line 187
    aget-object v3, v3, v2

    .line 188
    .line 189
    invoke-interface {v3}, LP2/A;->q()Lq2/x;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget-object v3, v3, Lq2/x;->o:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v4, v13, LP2/H;->c:[LP2/A;

    .line 196
    .line 197
    aget-object v4, v4, v2

    .line 198
    .line 199
    invoke-interface {v4}, LP2/A;->q()Lq2/x;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    iget-object v4, v4, Lq2/x;->k:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v3, v4}, Lq2/K;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_9

    .line 210
    .line 211
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 212
    .line 213
    aget-object v3, v3, v2

    .line 214
    .line 215
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-nez v3, :cond_9

    .line 220
    .line 221
    move v1, v10

    .line 222
    goto :goto_3

    .line 223
    :cond_9
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_a
    :goto_3
    if-nez v1, :cond_b

    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/media3/exoplayer/r0;->n()J

    .line 229
    .line 230
    .line 231
    move-result-wide v1

    .line 232
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/o0;->k1(J)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/media3/exoplayer/r0;->s()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-nez v1, :cond_11

    .line 240
    .line 241
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 242
    .line 243
    invoke-virtual {v1, v12}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 244
    .line 245
    .line 246
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_b
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 254
    .line 255
    array-length v2, v1

    .line 256
    :goto_4
    if-ge v10, v2, :cond_11

    .line 257
    .line 258
    aget-object v3, v1, v10

    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/media3/exoplayer/r0;->n()J

    .line 261
    .line 262
    .line 263
    move-result-wide v4

    .line 264
    invoke-virtual {v3, v11, v13, v4, v5}, Landroidx/media3/exoplayer/P0;->F(LP2/H;LP2/H;J)V

    .line 265
    .line 266
    .line 267
    add-int/lit8 v10, v10, 0x1

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_c
    :goto_5
    iget-object v2, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 271
    .line 272
    iget-boolean v2, v2, Landroidx/media3/exoplayer/s0;->j:Z

    .line 273
    .line 274
    if-nez v2, :cond_d

    .line 275
    .line 276
    iget-boolean v2, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 277
    .line 278
    if-eqz v2, :cond_11

    .line 279
    .line 280
    :cond_d
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 281
    .line 282
    array-length v3, v2

    .line 283
    :goto_6
    if-ge v10, v3, :cond_11

    .line 284
    .line 285
    aget-object v4, v2, v10

    .line 286
    .line 287
    invoke-virtual {v4, v1}, Landroidx/media3/exoplayer/P0;->x(Landroidx/media3/exoplayer/r0;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-nez v5, :cond_e

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_e
    invoke-virtual {v4, v1}, Landroidx/media3/exoplayer/P0;->r(Landroidx/media3/exoplayer/r0;)Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_10

    .line 299
    .line 300
    iget-object v5, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 301
    .line 302
    iget-wide v5, v5, Landroidx/media3/exoplayer/s0;->e:J

    .line 303
    .line 304
    cmp-long v7, v5, v8

    .line 305
    .line 306
    if-eqz v7, :cond_f

    .line 307
    .line 308
    const-wide/high16 v11, -0x8000000000000000L

    .line 309
    .line 310
    cmp-long v5, v5, v11

    .line 311
    .line 312
    if-eqz v5, :cond_f

    .line 313
    .line 314
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->m()J

    .line 315
    .line 316
    .line 317
    move-result-wide v5

    .line 318
    iget-object v7, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 319
    .line 320
    iget-wide v11, v7, Landroidx/media3/exoplayer/s0;->e:J

    .line 321
    .line 322
    add-long/2addr v5, v11

    .line 323
    goto :goto_7

    .line 324
    :cond_f
    move-wide v5, v8

    .line 325
    :goto_7
    invoke-virtual {v4, v1, v5, v6}, Landroidx/media3/exoplayer/P0;->O(Landroidx/media3/exoplayer/r0;J)V

    .line 326
    .line 327
    .line 328
    :cond_10
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_11
    :goto_9
    return-void
.end method

.method private B(Landroidx/media3/exoplayer/L0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->f()Landroidx/media3/exoplayer/L0$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->h()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/L0$b;->v(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method private B0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Landroidx/media3/exoplayer/r0;->i:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->l2()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, v0, Landroidx/media3/exoplayer/r0;->i:Z

    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method

.method private B1(Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->G:Z

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 7
    .line 8
    const/16 v2, 0x25

    .line 9
    .line 10
    invoke-interface {v1, v2}, Lt2/s;->l(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/o0;->e1(Landroidx/media3/exoplayer/o0$h;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 22
    .line 23
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->F:Z

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->x()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private C()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->h()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget-object v5, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 25
    .line 26
    invoke-virtual {v3, v5}, Landroidx/media3/exoplayer/P0;->c(Landroidx/media3/exoplayer/k;)V

    .line 27
    .line 28
    .line 29
    iget v5, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 30
    .line 31
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->h()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v4, v3

    .line 36
    sub-int/2addr v5, v4

    .line 37
    iput v5, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide v0, p0, Landroidx/media3/exoplayer/o0;->F0:J

    .line 48
    .line 49
    :cond_2
    :goto_1
    return-void
.end method

.method private C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/J0;->i()Lq2/Y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private D(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/P0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 10
    .line 11
    aget-object v1, v1, p1

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/P0;->b(Landroidx/media3/exoplayer/k;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p0, p1, v1}, Landroidx/media3/exoplayer/o0;->t0(IZ)V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 23
    .line 24
    sub-int/2addr p1, v0

    .line 25
    iput p1, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 26
    .line 27
    return-void
.end method

.method private D0(Landroidx/media3/exoplayer/o0$c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    iget v1, p1, Landroidx/media3/exoplayer/o0$c;->a:I

    .line 10
    .line 11
    iget v2, p1, Landroidx/media3/exoplayer/o0$c;->b:I

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/o0$c;->c:I

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/media3/exoplayer/o0$c;->d:LM2/e0;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/media3/exoplayer/J0;->v(IIILM2/e0;)Lq2/Y;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private D1(LA2/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private E()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->D(I)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Landroidx/media3/exoplayer/o0;->F0:J

    .line 19
    .line 20
    return-void
.end method

.method private F()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 4
    .line 5
    invoke-interface {v1}, Lt2/j;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-interface {v3, v4}, Lt2/s;->l(I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->c2()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    iget v3, v3, Landroidx/media3/exoplayer/K0;->e:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v3, v5, :cond_1d

    .line 24
    .line 25
    const/4 v6, 0x4

    .line 26
    if-ne v3, v6, :cond_0

    .line 27
    .line 28
    goto/16 :goto_c

    .line 29
    .line 30
    :cond_0
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/o0;->b1(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string v7, "doSomeWork"

    .line 43
    .line 44
    invoke-static {v7}, Lt2/P;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->h2()V

    .line 48
    .line 49
    .line 50
    iget-boolean v7, v3, Landroidx/media3/exoplayer/r0;->f:Z

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v7, :cond_6

    .line 54
    .line 55
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 56
    .line 57
    invoke-interface {v7}, Lt2/j;->c()J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    invoke-static {v9, v10}, Lt2/a0;->V0(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    iput-wide v9, v0, Landroidx/media3/exoplayer/o0;->x0:J

    .line 66
    .line 67
    iget-object v7, v3, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 68
    .line 69
    iget-object v9, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 70
    .line 71
    iget-wide v9, v9, Landroidx/media3/exoplayer/K0;->s:J

    .line 72
    .line 73
    iget-wide v11, v0, Landroidx/media3/exoplayer/o0;->m:J

    .line 74
    .line 75
    sub-long/2addr v9, v11

    .line 76
    iget-boolean v11, v0, Landroidx/media3/exoplayer/o0;->n:Z

    .line 77
    .line 78
    invoke-interface {v7, v9, v10, v11}, LM2/C;->u(JZ)V

    .line 79
    .line 80
    .line 81
    move v9, v5

    .line 82
    move v10, v9

    .line 83
    move v7, v8

    .line 84
    :goto_0
    iget-object v11, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 85
    .line 86
    array-length v12, v11

    .line 87
    if-ge v7, v12, :cond_7

    .line 88
    .line 89
    aget-object v11, v11, v7

    .line 90
    .line 91
    invoke-virtual {v11}, Landroidx/media3/exoplayer/P0;->h()I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-nez v12, :cond_2

    .line 96
    .line 97
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/o0;->t0(IZ)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_2
    iget-wide v12, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 102
    .line 103
    iget-wide v14, v0, Landroidx/media3/exoplayer/o0;->x0:J

    .line 104
    .line 105
    invoke-virtual {v11, v12, v13, v14, v15}, Landroidx/media3/exoplayer/P0;->I(JJ)V

    .line 106
    .line 107
    .line 108
    if-eqz v9, :cond_3

    .line 109
    .line 110
    invoke-virtual {v11}, Landroidx/media3/exoplayer/P0;->t()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_3

    .line 115
    .line 116
    move v9, v5

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    move v9, v8

    .line 119
    :goto_1
    invoke-virtual {v11, v3}, Landroidx/media3/exoplayer/P0;->a(Landroidx/media3/exoplayer/r0;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-direct {v0, v7, v11}, Landroidx/media3/exoplayer/o0;->t0(IZ)V

    .line 124
    .line 125
    .line 126
    if-eqz v10, :cond_4

    .line 127
    .line 128
    if-eqz v11, :cond_4

    .line 129
    .line 130
    move v10, v5

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move v10, v8

    .line 133
    :goto_2
    if-nez v11, :cond_5

    .line 134
    .line 135
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/o0;->s0(I)V

    .line 136
    .line 137
    .line 138
    :cond_5
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_6
    iget-object v7, v3, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 142
    .line 143
    invoke-interface {v7}, LM2/C;->o()V

    .line 144
    .line 145
    .line 146
    move v9, v5

    .line 147
    move v10, v9

    .line 148
    :cond_7
    iget-object v7, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 149
    .line 150
    iget-wide v11, v7, Landroidx/media3/exoplayer/s0;->e:J

    .line 151
    .line 152
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    if-eqz v9, :cond_9

    .line 158
    .line 159
    iget-boolean v7, v3, Landroidx/media3/exoplayer/r0;->f:Z

    .line 160
    .line 161
    if-eqz v7, :cond_9

    .line 162
    .line 163
    cmp-long v7, v11, v13

    .line 164
    .line 165
    if-eqz v7, :cond_8

    .line 166
    .line 167
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 168
    .line 169
    move-wide v15, v13

    .line 170
    iget-wide v13, v7, Landroidx/media3/exoplayer/K0;->s:J

    .line 171
    .line 172
    cmp-long v7, v11, v13

    .line 173
    .line 174
    if-gtz v7, :cond_a

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_8
    move-wide v15, v13

    .line 178
    :goto_4
    move v7, v5

    .line 179
    goto :goto_5

    .line 180
    :cond_9
    move-wide v15, v13

    .line 181
    :cond_a
    move v7, v8

    .line 182
    :goto_5
    if-eqz v7, :cond_b

    .line 183
    .line 184
    iget-boolean v9, v0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 185
    .line 186
    if-eqz v9, :cond_b

    .line 187
    .line 188
    iput-boolean v8, v0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 189
    .line 190
    iget-object v9, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 191
    .line 192
    iget v9, v9, Landroidx/media3/exoplayer/K0;->n:I

    .line 193
    .line 194
    const/4 v11, 0x5

    .line 195
    invoke-direct {v0, v8, v9, v8, v11}, Landroidx/media3/exoplayer/o0;->u1(ZIZI)V

    .line 196
    .line 197
    .line 198
    :cond_b
    const/4 v9, 0x3

    .line 199
    if-eqz v7, :cond_c

    .line 200
    .line 201
    iget-object v7, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 202
    .line 203
    iget-boolean v7, v7, Landroidx/media3/exoplayer/s0;->j:Z

    .line 204
    .line 205
    if-eqz v7, :cond_c

    .line 206
    .line 207
    invoke-direct {v0, v6}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->X1()V

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_c
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 215
    .line 216
    iget v7, v7, Landroidx/media3/exoplayer/K0;->e:I

    .line 217
    .line 218
    if-ne v7, v4, :cond_d

    .line 219
    .line 220
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/o0;->S1(Z)Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_d

    .line 225
    .line 226
    invoke-direct {v0, v9}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 227
    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    iput-object v7, v0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 231
    .line 232
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_11

    .line 237
    .line 238
    invoke-direct {v0, v8, v8}, Landroidx/media3/exoplayer/o0;->k2(ZZ)V

    .line 239
    .line 240
    .line 241
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 242
    .line 243
    invoke-virtual {v7}, Landroidx/media3/exoplayer/k;->g()V

    .line 244
    .line 245
    .line 246
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->U1()V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_d
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 251
    .line 252
    iget v7, v7, Landroidx/media3/exoplayer/K0;->e:I

    .line 253
    .line 254
    if-ne v7, v9, :cond_11

    .line 255
    .line 256
    iget v7, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 257
    .line 258
    if-nez v7, :cond_e

    .line 259
    .line 260
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->l0()Z

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    if-eqz v7, :cond_f

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    if-nez v10, :cond_11

    .line 268
    .line 269
    :cond_f
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/o0;->k2(ZZ)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v4}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 277
    .line 278
    .line 279
    iget-boolean v7, v0, Landroidx/media3/exoplayer/o0;->m0:Z

    .line 280
    .line 281
    if-eqz v7, :cond_10

    .line 282
    .line 283
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->H0()V

    .line 284
    .line 285
    .line 286
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 287
    .line 288
    invoke-interface {v7}, LA2/K;->d()V

    .line 289
    .line 290
    .line 291
    :cond_10
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->X1()V

    .line 292
    .line 293
    .line 294
    :cond_11
    :goto_6
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 295
    .line 296
    iget v7, v7, Landroidx/media3/exoplayer/K0;->e:I

    .line 297
    .line 298
    if-ne v7, v4, :cond_16

    .line 299
    .line 300
    move v7, v8

    .line 301
    :goto_7
    iget-object v10, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 302
    .line 303
    array-length v11, v10

    .line 304
    if-ge v7, v11, :cond_13

    .line 305
    .line 306
    aget-object v10, v10, v7

    .line 307
    .line 308
    invoke-virtual {v10, v3}, Landroidx/media3/exoplayer/P0;->x(Landroidx/media3/exoplayer/r0;)Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_12

    .line 313
    .line 314
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/o0;->s0(I)V

    .line 315
    .line 316
    .line 317
    :cond_12
    add-int/lit8 v7, v7, 0x1

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_13
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 321
    .line 322
    iget-boolean v7, v3, Landroidx/media3/exoplayer/K0;->g:Z

    .line 323
    .line 324
    if-nez v7, :cond_16

    .line 325
    .line 326
    iget-wide v10, v3, Landroidx/media3/exoplayer/K0;->r:J

    .line 327
    .line 328
    const-wide/32 v12, 0x7a120

    .line 329
    .line 330
    .line 331
    cmp-long v3, v10, v12

    .line 332
    .line 333
    if-gez v3, :cond_16

    .line 334
    .line 335
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 336
    .line 337
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/o0;->j0(Landroidx/media3/exoplayer/r0;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_16

    .line 346
    .line 347
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_16

    .line 352
    .line 353
    iget-wide v10, v0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 354
    .line 355
    cmp-long v3, v10, v15

    .line 356
    .line 357
    if-nez v3, :cond_14

    .line 358
    .line 359
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 360
    .line 361
    invoke-interface {v3}, Lt2/j;->c()J

    .line 362
    .line 363
    .line 364
    move-result-wide v10

    .line 365
    iput-wide v10, v0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_14
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 369
    .line 370
    invoke-interface {v3}, Lt2/j;->c()J

    .line 371
    .line 372
    .line 373
    move-result-wide v10

    .line 374
    iget-wide v12, v0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 375
    .line 376
    sub-long/2addr v10, v12

    .line 377
    const-wide/16 v12, 0xfa0

    .line 378
    .line 379
    cmp-long v3, v10, v12

    .line 380
    .line 381
    if-gez v3, :cond_15

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v2, "Playback stuck buffering and not loading"

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v1

    .line 392
    :cond_16
    move-wide v10, v15

    .line 393
    iput-wide v10, v0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 394
    .line 395
    :goto_8
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_17

    .line 400
    .line 401
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 402
    .line 403
    iget v3, v3, Landroidx/media3/exoplayer/K0;->e:I

    .line 404
    .line 405
    if-ne v3, v9, :cond_17

    .line 406
    .line 407
    move v3, v5

    .line 408
    goto :goto_9

    .line 409
    :cond_17
    move v3, v8

    .line 410
    :goto_9
    iget-boolean v7, v0, Landroidx/media3/exoplayer/o0;->t0:Z

    .line 411
    .line 412
    if-eqz v7, :cond_18

    .line 413
    .line 414
    iget-boolean v7, v0, Landroidx/media3/exoplayer/o0;->s0:Z

    .line 415
    .line 416
    if-eqz v7, :cond_18

    .line 417
    .line 418
    if-eqz v3, :cond_18

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_18
    move v5, v8

    .line 422
    :goto_a
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 423
    .line 424
    iget-boolean v10, v7, Landroidx/media3/exoplayer/K0;->p:Z

    .line 425
    .line 426
    if-eq v10, v5, :cond_19

    .line 427
    .line 428
    invoke-virtual {v7, v5}, Landroidx/media3/exoplayer/K0;->i(Z)Landroidx/media3/exoplayer/K0;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    iput-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 433
    .line 434
    :cond_19
    iput-boolean v8, v0, Landroidx/media3/exoplayer/o0;->s0:Z

    .line 435
    .line 436
    if-nez v5, :cond_1c

    .line 437
    .line 438
    iget-object v5, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 439
    .line 440
    iget v5, v5, Landroidx/media3/exoplayer/K0;->e:I

    .line 441
    .line 442
    if-ne v5, v6, :cond_1a

    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_1a
    if-nez v3, :cond_1b

    .line 446
    .line 447
    if-eq v5, v4, :cond_1b

    .line 448
    .line 449
    if-ne v5, v9, :cond_1c

    .line 450
    .line 451
    iget v3, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 452
    .line 453
    if-eqz v3, :cond_1c

    .line 454
    .line 455
    :cond_1b
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/o0;->b1(J)V

    .line 456
    .line 457
    .line 458
    :cond_1c
    :goto_b
    invoke-static {}, Lt2/P;->b()V

    .line 459
    .line 460
    .line 461
    :cond_1d
    :goto_c
    return-void
.end method

.method private F0()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LP2/H;->c:[LP2/A;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, LP2/A;->j()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private F1(LA2/Q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->C:LA2/Q;

    .line 2
    .line 3
    return-void
.end method

.method private G(Landroidx/media3/exoplayer/r0;IZJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 6
    .line 7
    aget-object v3, v2, p2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->y()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    move v10, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v10, v4

    .line 30
    :goto_0
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v6, v2, LP2/H;->b:[LA2/N;

    .line 35
    .line 36
    aget-object v6, v6, p2

    .line 37
    .line 38
    iget-object v2, v2, LP2/H;->c:[LP2/A;

    .line 39
    .line 40
    aget-object v2, v2, p2

    .line 41
    .line 42
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 49
    .line 50
    iget v7, v7, Landroidx/media3/exoplayer/K0;->e:I

    .line 51
    .line 52
    const/4 v8, 0x3

    .line 53
    if-ne v7, v8, :cond_2

    .line 54
    .line 55
    move/from16 v17, v5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move/from16 v17, v4

    .line 59
    .line 60
    :goto_1
    if-nez p3, :cond_3

    .line 61
    .line 62
    if-eqz v17, :cond_3

    .line 63
    .line 64
    move v9, v5

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v9, v4

    .line 67
    :goto_2
    iget v4, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 68
    .line 69
    add-int/2addr v4, v5

    .line 70
    iput v4, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 71
    .line 72
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 73
    .line 74
    aget-object v4, v4, p2

    .line 75
    .line 76
    iget-wide v7, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 77
    .line 78
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->m()J

    .line 79
    .line 80
    .line 81
    move-result-wide v13

    .line 82
    iget-object v5, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 83
    .line 84
    iget-object v15, v5, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 85
    .line 86
    iget-object v5, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 87
    .line 88
    move-object v11, v6

    .line 89
    move-object v6, v4

    .line 90
    move-object v4, v11

    .line 91
    move-wide/from16 v11, p4

    .line 92
    .line 93
    move-object/from16 v16, v5

    .line 94
    .line 95
    move-object v5, v2

    .line 96
    invoke-virtual/range {v3 .. v16}, Landroidx/media3/exoplayer/P0;->e(LA2/N;LP2/A;LM2/c0;JZZJJLM2/D$b;Landroidx/media3/exoplayer/k;)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Landroidx/media3/exoplayer/o0$a;

    .line 100
    .line 101
    invoke-direct {v2, v0}, Landroidx/media3/exoplayer/o0$a;-><init>(Landroidx/media3/exoplayer/o0;)V

    .line 102
    .line 103
    .line 104
    const/16 v4, 0xb

    .line 105
    .line 106
    invoke-virtual {v3, v4, v2, v1}, Landroidx/media3/exoplayer/P0;->n(ILjava/lang/Object;Landroidx/media3/exoplayer/r0;)V

    .line 107
    .line 108
    .line 109
    if-eqz v17, :cond_4

    .line 110
    .line 111
    if-eqz v10, :cond_4

    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->W()V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_3
    return-void
.end method

.method private G0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LP2/H;->c:[LP2/A;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, LP2/A;->n(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private H()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [Z

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->n()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/o0;->I([ZJ)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private H0()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LP2/H;->c:[LP2/A;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, LP2/A;->s()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private H1(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/u0;->Y(Lq2/Y;Z)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int/lit8 v0, p1, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->d1(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private I([ZJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v3, v1

    .line 13
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 14
    .line 15
    array-length v4, v4

    .line 16
    if-ge v3, v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, LP2/H;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 25
    .line 26
    aget-object v4, v4, v3

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/media3/exoplayer/P0;->L()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v3, v1

    .line 35
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 36
    .line 37
    array-length v1, v1

    .line 38
    if-ge v3, v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v3}, LP2/H;->c(I)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 47
    .line 48
    aget-object v1, v1, v3

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/P0;->x(Landroidx/media3/exoplayer/r0;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    aget-boolean v4, p1, v3

    .line 57
    .line 58
    move-object v1, p0

    .line 59
    move-wide v5, p2

    .line 60
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/o0;->G(Landroidx/media3/exoplayer/r0;IZJ)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move-wide v5, p2

    .line 65
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    move-wide p2, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-void
.end method

.method private I1(LM2/e0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/J0;->D(LM2/e0;)Lq2/Y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private J1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Landroidx/media3/exoplayer/o0;->C0:J

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x3

    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, v0, Landroidx/media3/exoplayer/K0;->p:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->i(Z)Landroidx/media3/exoplayer/K0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/K0;->h(I)Landroidx/media3/exoplayer/K0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method private K([LP2/A;)LP9/u;
    .locals 7

    .line 1
    new-instance v0, LP9/u$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/u$a;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v5, p1, v3

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    invoke-interface {v5, v2}, LP2/E;->d(I)Lq2/x;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object v5, v5, Lq2/x;->l:Lq2/J;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    new-instance v5, Lq2/J;

    .line 25
    .line 26
    new-array v6, v2, [Lq2/J$a;

    .line 27
    .line 28
    invoke-direct {v5, v6}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v0, v5}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_3
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method private K0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0, v0, v1}, Landroidx/media3/exoplayer/o0;->S0(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/p0;->g(LB2/K1;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 21
    .line 22
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x2

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    :goto_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->e2()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->g:LQ2/d;

    .line 41
    .line 42
    invoke-interface {v2}, LQ2/d;->c()Lw2/F;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/J0;->w(Lw2/F;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lt2/s;->j(I)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private K1(LS2/u;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/P0;->T(LS2/u;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private L()J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 6
    .line 7
    iget-object v2, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 10
    .line 11
    invoke-direct {p0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/o0;->N(Lq2/Y;Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method private M()J
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const-wide/16 v0, 0x3e8

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-wide v0, Landroidx/media3/exoplayer/o0;->I0:J

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_1
    if-ge v4, v3, :cond_1

    .line 18
    .line 19
    aget-object v5, v2, v4

    .line 20
    .line 21
    iget-wide v6, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 22
    .line 23
    iget-wide v8, p0, Landroidx/media3/exoplayer/o0;->x0:J

    .line 24
    .line 25
    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/media3/exoplayer/P0;->j(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    invoke-static {v5, v6}, Lt2/a0;->F1(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/media3/exoplayer/K0;->n()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/4 v2, 0x0

    .line 68
    :goto_2
    if-eqz v2, :cond_3

    .line 69
    .line 70
    iget-wide v3, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 71
    .line 72
    long-to-float v3, v3

    .line 73
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    long-to-float v4, v4

    .line 78
    iget-object v5, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 79
    .line 80
    iget-object v5, v5, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 81
    .line 82
    iget v5, v5, Lq2/O;->a:F

    .line 83
    .line 84
    mul-float/2addr v4, v5

    .line 85
    add-float/2addr v3, v4

    .line 86
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->n()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    long-to-float v2, v4

    .line 91
    cmpl-float v2, v3, v2

    .line 92
    .line 93
    if-ltz v2, :cond_3

    .line 94
    .line 95
    sget-wide v2, Landroidx/media3/exoplayer/o0;->I0:J

    .line 96
    .line 97
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    :cond_3
    return-wide v0
.end method

.method private M0(Lt2/m;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    :try_start_0
    invoke-direct {p0, v2, v1, v2, v1}, Landroidx/media3/exoplayer/o0;->S0(ZZZZ)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->N0()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 11
    .line 12
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 13
    .line 14
    invoke-interface {v1, v3}, Landroidx/media3/exoplayer/p0;->b(LB2/K1;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/g;->h()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->d:LP2/G;

    .line 23
    .line 24
    invoke-virtual {v1}, LP2/G;->j()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/o0;->J1(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lt2/s;->f(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->i:LA2/M;

    .line 36
    .line 37
    invoke-virtual {v0}, LA2/M;->b()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lt2/m;->f()Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Lt2/s;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->i:LA2/M;

    .line 51
    .line 52
    invoke-virtual {v0}, LA2/M;->b()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lt2/m;->f()Z

    .line 56
    .line 57
    .line 58
    throw v1
.end method

.method private M1(Ljava/lang/Object;Lt2/m;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/P0;->U(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 16
    .line 17
    iget p1, p1, Landroidx/media3/exoplayer/K0;->e:I

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq p1, v0, :cond_1

    .line 22
    .line 23
    if-ne p1, v1, :cond_2

    .line 24
    .line 25
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lt2/s;->j(I)Z

    .line 28
    .line 29
    .line 30
    :cond_2
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-virtual {p2}, Lt2/m;->f()Z

    .line 33
    .line 34
    .line 35
    :cond_3
    return-void
.end method

.method private N(Lq2/Y;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lq2/Y$b;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 15
    .line 16
    iget-wide v0, p1, Lq2/Y$d;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lq2/Y$d;->g()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 34
    .line 35
    iget-boolean p2, p1, Lq2/Y$d;->i:Z

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Lq2/Y$d;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 45
    .line 46
    iget-wide v0, v0, Lq2/Y$d;->f:J

    .line 47
    .line 48
    sub-long/2addr p1, v0

    .line 49
    invoke-static {p1, p2}, Lt2/a0;->V0(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 54
    .line 55
    invoke-virtual {v0}, Lq2/Y$b;->o()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_1
    :goto_0
    return-wide v2
.end method

.method private N0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->b:[Landroidx/media3/exoplayer/O0;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/media3/exoplayer/O0;->h()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/P0;->H()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method private O(Landroidx/media3/exoplayer/r0;)J
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->m()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-boolean v2, p1, Landroidx/media3/exoplayer/r0;->f:Z

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_1
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 17
    .line 18
    array-length v4, v3

    .line 19
    if-ge v2, v4, :cond_4

    .line 20
    .line 21
    aget-object v3, v3, v2

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/P0;->x(Landroidx/media3/exoplayer/r0;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 31
    .line 32
    aget-object v3, v3, v2

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/P0;->k(Landroidx/media3/exoplayer/r0;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    const-wide/high16 v5, -0x8000000000000000L

    .line 39
    .line 40
    cmp-long v7, v3, v5

    .line 41
    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    return-wide v5

    .line 45
    :cond_3
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    return-wide v0
.end method

.method private O0(IILM2/e0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/J0;->A(IILM2/e0;)Lq2/Y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private O1(F)V
    .locals 4

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/o0;->H0:F

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/g;->f()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-float/2addr p1, v0

    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    aget-object v3, v0, v2

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/P0;->V(F)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method private P(Lq2/Y;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lq2/Y;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroidx/media3/exoplayer/K0;->l()LM2/D$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lq2/Y;->e(Z)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 29
    .line 30
    iget-object v5, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 31
    .line 32
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 43
    .line 44
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/media3/exoplayer/u0;->Q(Lq2/Y;Ljava/lang/Object;J)LM2/D$b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    iget-object p1, v0, LM2/D$b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 67
    .line 68
    invoke-virtual {v3, p1, v4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 69
    .line 70
    .line 71
    iget p1, v0, LM2/D$b;->c:I

    .line 72
    .line 73
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 74
    .line 75
    iget v4, v0, LM2/D$b;->b:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Lq2/Y$b;->l(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne p1, v3, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 84
    .line 85
    invoke-virtual {p1}, Lq2/Y$b;->h()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    :cond_1
    move-wide v4, v1

    .line 90
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
.end method

.method private P1()Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R1()Z

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
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->n()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-ltz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v0, v0, Landroidx/media3/exoplayer/r0;->i:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :cond_3
    return v1
.end method

.method private Q0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lq2/O;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 18
    .line 19
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v10

    .line 26
    :goto_0
    if-eqz v2, :cond_c

    .line 27
    .line 28
    iget-boolean v6, v2, Landroidx/media3/exoplayer/r0;->f:Z

    .line 29
    .line 30
    if-nez v6, :cond_0

    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    iget-object v6, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 35
    .line 36
    iget-object v7, v6, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 37
    .line 38
    iget-boolean v6, v6, Landroidx/media3/exoplayer/K0;->l:Z

    .line 39
    .line 40
    invoke-virtual {v2, v1, v7, v6}, Landroidx/media3/exoplayer/r0;->z(FLq2/Y;Z)LP2/H;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 45
    .line 46
    invoke-virtual {v7}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-ne v2, v7, :cond_1

    .line 51
    .line 52
    move-object v4, v6

    .line 53
    :cond_1
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, LP2/H;->a(LP2/H;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/4 v11, 0x0

    .line 62
    if-nez v7, :cond_a

    .line 63
    .line 64
    const/4 v12, 0x4

    .line 65
    if-eqz v5, :cond_7

    .line 66
    .line 67
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 74
    .line 75
    invoke-virtual {v1, v13}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    and-int/2addr v1, v10

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    move/from16 v17, v10

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move/from16 v17, v11

    .line 86
    .line 87
    :goto_1
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 88
    .line 89
    array-length v1, v1

    .line 90
    new-array v1, v1, [Z

    .line 91
    .line 92
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v14, v2

    .line 97
    check-cast v14, LP2/H;

    .line 98
    .line 99
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 100
    .line 101
    iget-wide v2, v2, Landroidx/media3/exoplayer/K0;->s:J

    .line 102
    .line 103
    move-object/from16 v18, v1

    .line 104
    .line 105
    move-wide v15, v2

    .line 106
    invoke-virtual/range {v13 .. v18}, Landroidx/media3/exoplayer/r0;->b(LP2/H;JZ[Z)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 111
    .line 112
    iget v4, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 113
    .line 114
    if-eq v4, v12, :cond_3

    .line 115
    .line 116
    iget-wide v4, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 117
    .line 118
    cmp-long v1, v2, v4

    .line 119
    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    move v8, v10

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    move v8, v11

    .line 125
    :goto_2
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 126
    .line 127
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 128
    .line 129
    move-object v6, v4

    .line 130
    iget-wide v4, v1, Landroidx/media3/exoplayer/K0;->c:J

    .line 131
    .line 132
    iget-wide v14, v1, Landroidx/media3/exoplayer/K0;->d:J

    .line 133
    .line 134
    const/4 v9, 0x5

    .line 135
    move-object v1, v6

    .line 136
    move-wide v6, v14

    .line 137
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 142
    .line 143
    if-eqz v8, :cond_4

    .line 144
    .line 145
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 146
    .line 147
    .line 148
    :cond_4
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 152
    .line 153
    array-length v1, v1

    .line 154
    new-array v1, v1, [Z

    .line 155
    .line 156
    move v2, v11

    .line 157
    :goto_3
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 158
    .line 159
    array-length v4, v3

    .line 160
    if-ge v2, v4, :cond_6

    .line 161
    .line 162
    aget-object v3, v3, v2

    .line 163
    .line 164
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->h()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 169
    .line 170
    aget-object v4, v4, v2

    .line 171
    .line 172
    invoke-virtual {v4}, Landroidx/media3/exoplayer/P0;->y()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    aput-boolean v4, v1, v2

    .line 177
    .line 178
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 179
    .line 180
    aget-object v19, v4, v2

    .line 181
    .line 182
    iget-object v4, v13, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 183
    .line 184
    aget-object v20, v4, v2

    .line 185
    .line 186
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 187
    .line 188
    iget-wide v5, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 189
    .line 190
    aget-boolean v24, v18, v2

    .line 191
    .line 192
    move-object/from16 v21, v4

    .line 193
    .line 194
    move-wide/from16 v22, v5

    .line 195
    .line 196
    invoke-virtual/range {v19 .. v24}, Landroidx/media3/exoplayer/P0;->B(LM2/c0;Landroidx/media3/exoplayer/k;JZ)V

    .line 197
    .line 198
    .line 199
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 200
    .line 201
    aget-object v4, v4, v2

    .line 202
    .line 203
    invoke-virtual {v4}, Landroidx/media3/exoplayer/P0;->h()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    sub-int v4, v3, v4

    .line 208
    .line 209
    if-lez v4, :cond_5

    .line 210
    .line 211
    invoke-direct {v0, v2, v11}, Landroidx/media3/exoplayer/o0;->t0(IZ)V

    .line 212
    .line 213
    .line 214
    :cond_5
    iget v4, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 215
    .line 216
    iget-object v5, v0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 217
    .line 218
    aget-object v5, v5, v2

    .line 219
    .line 220
    invoke-virtual {v5}, Landroidx/media3/exoplayer/P0;->h()I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    sub-int/2addr v3, v5

    .line 225
    sub-int/2addr v4, v3

    .line 226
    iput v4, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 227
    .line 228
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_6
    iget-wide v2, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 232
    .line 233
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/exoplayer/o0;->I([ZJ)V

    .line 234
    .line 235
    .line 236
    iput-boolean v10, v13, Landroidx/media3/exoplayer/r0;->i:Z

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_7
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 242
    .line 243
    .line 244
    iget-boolean v1, v2, Landroidx/media3/exoplayer/r0;->f:Z

    .line 245
    .line 246
    if-eqz v1, :cond_9

    .line 247
    .line 248
    iget-object v1, v2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 249
    .line 250
    iget-wide v3, v1, Landroidx/media3/exoplayer/s0;->b:J

    .line 251
    .line 252
    iget-wide v7, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 253
    .line 254
    invoke-virtual {v2, v7, v8}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v7

    .line 258
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    iget-boolean v1, v0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 263
    .line 264
    if-eqz v1, :cond_8

    .line 265
    .line 266
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_8

    .line 271
    .line 272
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 273
    .line 274
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-ne v1, v2, :cond_8

    .line 279
    .line 280
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 281
    .line 282
    .line 283
    :cond_8
    invoke-virtual {v2, v6, v3, v4, v11}, Landroidx/media3/exoplayer/r0;->a(LP2/H;JZ)J

    .line 284
    .line 285
    .line 286
    :cond_9
    :goto_4
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 290
    .line 291
    iget v1, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 292
    .line 293
    if-eq v1, v12, :cond_c

    .line 294
    .line 295
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 296
    .line 297
    .line 298
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->h2()V

    .line 299
    .line 300
    .line 301
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 302
    .line 303
    const/4 v2, 0x2

    .line 304
    invoke-interface {v1, v2}, Lt2/s;->j(I)Z

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_a
    if-ne v2, v3, :cond_b

    .line 309
    .line 310
    move v5, v11

    .line 311
    :cond_b
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_c
    :goto_5
    return-void
.end method

.method private Q1()Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/o0;->j0(Landroidx/media3/exoplayer/r0;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->l()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/o0;->U(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_0
    move-wide v9, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-wide v3, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 48
    .line 49
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iget-object v5, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 54
    .line 55
    iget-wide v5, v5, Landroidx/media3/exoplayer/s0;->b:J

    .line 56
    .line 57
    sub-long/2addr v3, v5

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 60
    .line 61
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 62
    .line 63
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 64
    .line 65
    iget-object v4, v4, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 66
    .line 67
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/o0;->T1(Lq2/Y;LM2/D$b;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 74
    .line 75
    invoke-interface {v3}, LA2/K;->c()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    :goto_2
    move-wide/from16 v16, v3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :goto_3
    new-instance v5, Landroidx/media3/exoplayer/p0$a;

    .line 89
    .line 90
    iget-object v6, v0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 91
    .line 92
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 93
    .line 94
    iget-object v7, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 95
    .line 96
    iget-object v1, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 97
    .line 98
    iget-object v8, v1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 99
    .line 100
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget v13, v1, Lq2/O;->a:F

    .line 107
    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 109
    .line 110
    iget-boolean v14, v1, Landroidx/media3/exoplayer/K0;->l:Z

    .line 111
    .line 112
    iget-boolean v15, v0, Landroidx/media3/exoplayer/o0;->m0:Z

    .line 113
    .line 114
    iget-wide v3, v0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 115
    .line 116
    move-wide/from16 v18, v3

    .line 117
    .line 118
    invoke-direct/range {v5 .. v19}, Landroidx/media3/exoplayer/p0$a;-><init>(LB2/K1;Lq2/Y;LM2/D$b;JJFZZJJ)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 122
    .line 123
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/p0;->i(Landroidx/media3/exoplayer/p0$a;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 128
    .line 129
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-nez v1, :cond_4

    .line 134
    .line 135
    iget-boolean v4, v3, Landroidx/media3/exoplayer/r0;->f:Z

    .line 136
    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    const-wide/32 v6, 0x7a120

    .line 140
    .line 141
    .line 142
    cmp-long v4, v11, v6

    .line 143
    .line 144
    if-gez v4, :cond_4

    .line 145
    .line 146
    iget-wide v6, v0, Landroidx/media3/exoplayer/o0;->m:J

    .line 147
    .line 148
    const-wide/16 v8, 0x0

    .line 149
    .line 150
    cmp-long v4, v6, v8

    .line 151
    .line 152
    if-gtz v4, :cond_3

    .line 153
    .line 154
    iget-boolean v4, v0, Landroidx/media3/exoplayer/o0;->n:Z

    .line 155
    .line 156
    if-eqz v4, :cond_4

    .line 157
    .line 158
    :cond_3
    iget-object v1, v3, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 159
    .line 160
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 161
    .line 162
    iget-wide v3, v3, Landroidx/media3/exoplayer/K0;->s:J

    .line 163
    .line 164
    invoke-interface {v1, v3, v4, v2}, LM2/C;->u(JZ)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 168
    .line 169
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/p0;->i(Landroidx/media3/exoplayer/p0$a;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    :cond_4
    return v1
.end method

.method private R(J)LA2/Q;
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 15
    .line 16
    iget-object v1, v0, LA2/P;->b:Ljava/lang/Double;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-object v0, v0, LA2/P;->c:Ljava/lang/Double;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-double p1, p1

    .line 30
    mul-double/2addr v0, p1

    .line 31
    sget-object v2, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, LR9/b;->f(DLjava/math/RoundingMode;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 38
    .line 39
    iget-object v3, v3, LA2/P;->c:Ljava/lang/Double;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    mul-double/2addr v3, p1

    .line 46
    invoke-static {v3, v4, v2}, LR9/b;->f(DLjava/math/RoundingMode;)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->E:LA2/Q;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-wide v3, v2, LA2/Q;->a:J

    .line 55
    .line 56
    cmp-long v3, v3, v0

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    iget-wide v2, v2, LA2/Q;->b:J

    .line 61
    .line 62
    cmp-long v2, v2, p1

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v2, LA2/Q;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1, p1, p2}, LA2/Q;-><init>(JJ)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->E:LA2/Q;

    .line 72
    .line 73
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->E:LA2/Q;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->C:LA2/Q;

    .line 77
    .line 78
    return-object p1
.end method

.method private R0()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->Q0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->d1(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private R1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private S()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    sget-wide v0, Landroidx/media3/exoplayer/o0;->I0:J

    .line 18
    .line 19
    return-wide v0
.end method

.method private S0(ZZZZ)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-interface {v0, v3}, Lt2/s;->l(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-boolean v3, v1, Landroidx/media3/exoplayer/o0;->G:Z

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    iput-object v4, v1, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 16
    .line 17
    iput-object v4, v1, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v3, v5}, Landroidx/media3/exoplayer/o0;->k2(ZZ)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->h()V

    .line 26
    .line 27
    .line 28
    const-wide v6, 0xe8d4a51000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v6, v1, Landroidx/media3/exoplayer/o0;->w0:J

    .line 34
    .line 35
    :try_start_0
    invoke-direct {v1}, Landroidx/media3/exoplayer/o0;->E()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception v0

    .line 42
    :goto_0
    const-string v6, "Disable failed."

    .line 43
    .line 44
    invoke-static {v2, v6, v0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    if-eqz p1, :cond_0

    .line 48
    .line 49
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 50
    .line 51
    array-length v7, v6

    .line 52
    move v8, v3

    .line 53
    :goto_2
    if-ge v8, v7, :cond_0

    .line 54
    .line 55
    aget-object v0, v6, v8

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/P0;->L()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :catch_2
    move-exception v0

    .line 62
    const-string v9, "Reset failed."

    .line 63
    .line 64
    invoke-static {v2, v9, v0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_0
    iput v3, v1, Landroidx/media3/exoplayer/o0;->u0:I

    .line 71
    .line 72
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 73
    .line 74
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 75
    .line 76
    iget-wide v6, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 77
    .line 78
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 79
    .line 80
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 81
    .line 82
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 89
    .line 90
    iget-object v8, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 91
    .line 92
    invoke-static {v0, v8}, Landroidx/media3/exoplayer/o0;->m0(Landroidx/media3/exoplayer/K0;Lq2/Y$b;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_1
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 100
    .line 101
    iget-wide v8, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_2
    :goto_4
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 105
    .line 106
    iget-wide v8, v0, Landroidx/media3/exoplayer/K0;->c:J

    .line 107
    .line 108
    :goto_5
    if-eqz p2, :cond_3

    .line 109
    .line 110
    iput-object v4, v1, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 111
    .line 112
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 113
    .line 114
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 115
    .line 116
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/o0;->P(Lq2/Y;)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, LM2/D$b;

    .line 123
    .line 124
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/lang/Long;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 133
    .line 134
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 135
    .line 136
    invoke-virtual {v2, v0}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    :goto_6
    move-wide v11, v6

    .line 148
    move-wide v9, v8

    .line 149
    goto :goto_7

    .line 150
    :cond_3
    move v5, v3

    .line 151
    goto :goto_6

    .line 152
    :goto_7
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->g()V

    .line 155
    .line 156
    .line 157
    iput-boolean v3, v1, Landroidx/media3/exoplayer/o0;->o0:Z

    .line 158
    .line 159
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 160
    .line 161
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 162
    .line 163
    if-eqz p3, :cond_4

    .line 164
    .line 165
    instance-of v3, v0, Landroidx/media3/exoplayer/M0;

    .line 166
    .line 167
    if-eqz v3, :cond_4

    .line 168
    .line 169
    check-cast v0, Landroidx/media3/exoplayer/M0;

    .line 170
    .line 171
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 172
    .line 173
    invoke-virtual {v3}, Landroidx/media3/exoplayer/J0;->q()LM2/e0;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/M0;->J(LM2/e0;)Landroidx/media3/exoplayer/M0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget v3, v2, LM2/D$b;->b:I

    .line 182
    .line 183
    const/4 v6, -0x1

    .line 184
    if-eq v3, v6, :cond_4

    .line 185
    .line 186
    iget-object v3, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 187
    .line 188
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 189
    .line 190
    invoke-virtual {v0, v3, v6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 191
    .line 192
    .line 193
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 194
    .line 195
    iget v3, v3, Lq2/Y$b;->c:I

    .line 196
    .line 197
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 198
    .line 199
    invoke-virtual {v0, v3, v6}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v3}, Lq2/Y$d;->g()Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_4

    .line 208
    .line 209
    new-instance v3, LM2/D$b;

    .line 210
    .line 211
    iget-object v6, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 212
    .line 213
    iget-wide v7, v2, LM2/D$b;->d:J

    .line 214
    .line 215
    invoke-direct {v3, v6, v7, v8}, LM2/D$b;-><init>(Ljava/lang/Object;J)V

    .line 216
    .line 217
    .line 218
    move-object v7, v0

    .line 219
    move-object v8, v3

    .line 220
    goto :goto_8

    .line 221
    :cond_4
    move-object v7, v0

    .line 222
    move-object v8, v2

    .line 223
    :goto_8
    new-instance v6, Landroidx/media3/exoplayer/K0;

    .line 224
    .line 225
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 226
    .line 227
    iget v13, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 228
    .line 229
    if-eqz p4, :cond_5

    .line 230
    .line 231
    :goto_9
    move-object v14, v4

    .line 232
    goto :goto_a

    .line 233
    :cond_5
    iget-object v4, v0, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :goto_a
    if-eqz v5, :cond_6

    .line 237
    .line 238
    sget-object v2, LM2/n0;->d:LM2/n0;

    .line 239
    .line 240
    :goto_b
    move-object/from16 v16, v2

    .line 241
    .line 242
    goto :goto_c

    .line 243
    :cond_6
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->h:LM2/n0;

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :goto_c
    if-eqz v5, :cond_7

    .line 247
    .line 248
    iget-object v2, v1, Landroidx/media3/exoplayer/o0;->e:LP2/H;

    .line 249
    .line 250
    :goto_d
    move-object/from16 v17, v2

    .line 251
    .line 252
    goto :goto_e

    .line 253
    :cond_7
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 254
    .line 255
    goto :goto_d

    .line 256
    :goto_e
    if-eqz v5, :cond_8

    .line 257
    .line 258
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    :goto_f
    move-object/from16 v18, v0

    .line 263
    .line 264
    goto :goto_10

    .line 265
    :cond_8
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 266
    .line 267
    goto :goto_f

    .line 268
    :goto_10
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 269
    .line 270
    iget-boolean v2, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 271
    .line 272
    iget v3, v0, Landroidx/media3/exoplayer/K0;->m:I

    .line 273
    .line 274
    iget v4, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 275
    .line 276
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 277
    .line 278
    const-wide/16 v30, 0x0

    .line 279
    .line 280
    const/16 v32, 0x0

    .line 281
    .line 282
    const/4 v15, 0x0

    .line 283
    const-wide/16 v26, 0x0

    .line 284
    .line 285
    move-object/from16 v19, v8

    .line 286
    .line 287
    move-wide/from16 v24, v11

    .line 288
    .line 289
    move-wide/from16 v28, v11

    .line 290
    .line 291
    move-object/from16 v23, v0

    .line 292
    .line 293
    move/from16 v20, v2

    .line 294
    .line 295
    move/from16 v21, v3

    .line 296
    .line 297
    move/from16 v22, v4

    .line 298
    .line 299
    invoke-direct/range {v6 .. v32}, Landroidx/media3/exoplayer/K0;-><init>(Lq2/Y;LM2/D$b;JJILandroidx/media3/exoplayer/s;ZLM2/n0;LP2/H;Ljava/util/List;LM2/D$b;ZIILq2/O;JJJJZ)V

    .line 300
    .line 301
    .line 302
    iput-object v6, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 303
    .line 304
    if-eqz p3, :cond_9

    .line 305
    .line 306
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->M()V

    .line 309
    .line 310
    .line 311
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 312
    .line 313
    invoke-virtual {v0}, Landroidx/media3/exoplayer/J0;->y()V

    .line 314
    .line 315
    .line 316
    :cond_9
    return-void
.end method

.method private S1(Z)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/media3/exoplayer/o0;->l0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 17
    .line 18
    iget-boolean v2, v2, Landroidx/media3/exoplayer/K0;->g:Z

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    iget-object v4, v4, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 33
    .line 34
    iget-object v5, v2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 35
    .line 36
    iget-object v5, v5, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 37
    .line 38
    invoke-direct {v0, v4, v5}, Landroidx/media3/exoplayer/o0;->T1(Lq2/Y;LM2/D$b;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 45
    .line 46
    invoke-interface {v4}, LA2/K;->c()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    :goto_0
    move-wide/from16 v17, v4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-object v4, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Landroidx/media3/exoplayer/r0;->s()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    iget-object v5, v4, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 72
    .line 73
    iget-boolean v5, v5, Landroidx/media3/exoplayer/s0;->j:Z

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    move v5, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v5, v1

    .line 80
    :goto_2
    iget-object v6, v4, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 81
    .line 82
    iget-object v6, v6, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 83
    .line 84
    invoke-virtual {v6}, LM2/D$b;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    iget-boolean v6, v4, Landroidx/media3/exoplayer/r0;->f:Z

    .line 91
    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    move v1, v3

    .line 95
    :cond_5
    if-nez v5, :cond_7

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    invoke-virtual {v4}, Landroidx/media3/exoplayer/r0;->j()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/o0;->U(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v12

    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 109
    .line 110
    new-instance v6, Landroidx/media3/exoplayer/p0$a;

    .line 111
    .line 112
    iget-object v7, v0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 113
    .line 114
    iget-object v3, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 115
    .line 116
    iget-object v8, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 117
    .line 118
    iget-object v3, v2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 119
    .line 120
    iget-object v9, v3, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 121
    .line 122
    iget-wide v3, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 123
    .line 124
    invoke-virtual {v2, v3, v4}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget v14, v2, Lq2/O;->a:F

    .line 135
    .line 136
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 137
    .line 138
    iget-boolean v15, v2, Landroidx/media3/exoplayer/K0;->l:Z

    .line 139
    .line 140
    iget-boolean v2, v0, Landroidx/media3/exoplayer/o0;->m0:Z

    .line 141
    .line 142
    iget-wide v3, v0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 143
    .line 144
    move/from16 v16, v2

    .line 145
    .line 146
    move-wide/from16 v19, v3

    .line 147
    .line 148
    invoke-direct/range {v6 .. v20}, Landroidx/media3/exoplayer/p0$a;-><init>(LB2/K1;Lq2/Y;LM2/D$b;JJFZZJJ)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v6}, Landroidx/media3/exoplayer/p0;->a(Landroidx/media3/exoplayer/p0$a;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    return v1

    .line 156
    :cond_7
    :goto_3
    return v3
.end method

.method private T()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/K0;->q:J

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/o0;->U(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method private T0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/s0;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->Z:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 23
    .line 24
    return-void
.end method

.method private T1(Lq2/Y;LM2/D$b;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, LM2/D$b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Lq2/Y$b;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 31
    .line 32
    invoke-virtual {p1}, Lq2/Y$d;->g()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 39
    .line 40
    iget-boolean p2, p1, Lq2/Y$d;->i:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-wide p1, p1, Lq2/Y$d;->f:J

    .line 45
    .line 46
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long p1, p1, v2

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_1
    :goto_0
    return v1
.end method

.method private U(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    iget-wide v3, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 13
    .line 14
    invoke-virtual {v0, v3, v4}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    sub-long/2addr p1, v3

    .line 19
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
.end method

.method private U0(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v1, 0xe8d4a51000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    add-long/2addr p1, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/r0;->D(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroidx/media3/exoplayer/k;->d(J)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 28
    .line 29
    array-length p2, p1

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_1
    if-ge v1, p2, :cond_1

    .line 32
    .line 33
    aget-object v2, p1, v1

    .line 34
    .line 35
    iget-wide v3, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 36
    .line 37
    invoke-virtual {v2, v0, v3, v4}, Landroidx/media3/exoplayer/P0;->M(Landroidx/media3/exoplayer/r0;J)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->F0()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private U1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-ge v1, v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LP2/H;->c(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 28
    .line 29
    aget-object v2, v2, v1

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/media3/exoplayer/P0;->W()V

    .line 32
    .line 33
    .line 34
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_2
    return-void
.end method

.method private V(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/K0;->m:I

    .line 8
    .line 9
    invoke-direct {p0, v1, p1, v2, v0}, Landroidx/media3/exoplayer/o0;->g2(ZIII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static V0(Lq2/Y;Landroidx/media3/exoplayer/o0$d;Lq2/Y$d;Lq2/Y$b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lq2/Y$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Lq2/Y$d;->o:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, p3, v0}, Lq2/Y;->k(ILq2/Y$b;Z)Lq2/Y$b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Lq2/Y$b;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-wide v0, p3, Lq2/Y$b;->d:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p3, v0, v2

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Landroidx/media3/exoplayer/o0$d;->b(IJLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private W()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/o0;->H0:F

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->O1(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static W0(Landroidx/media3/exoplayer/o0$d;Lq2/Y;Lq2/Y;IZLq2/Y$d;Lq2/Y$b;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x1

    .line 5
    const-wide/high16 v9, -0x8000000000000000L

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/media3/exoplayer/L0;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long p2, v0, v9

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/media3/exoplayer/L0;->e()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    new-instance p2, Landroidx/media3/exoplayer/o0$h;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/media3/exoplayer/L0;->g()Lq2/Y;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/media3/exoplayer/L0;->c()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {p2, v2, v3, v0, v1}, Landroidx/media3/exoplayer/o0$h;-><init>(Lq2/Y;IJ)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    move-object v0, p1

    .line 54
    move-object v1, p2

    .line 55
    move v3, p3

    .line 56
    move v4, p4

    .line 57
    move-object/from16 v5, p5

    .line 58
    .line 59
    move-object/from16 v6, p6

    .line 60
    .line 61
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/o0;->Z0(Lq2/Y;Landroidx/media3/exoplayer/o0$h;ZIZLq2/Y$d;Lq2/Y$b;)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    move-object v2, v6

    .line 66
    if-nez p2, :cond_1

    .line 67
    .line 68
    return v7

    .line 69
    :cond_1
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v3, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0, v0, v3, v4, p2}, Landroidx/media3/exoplayer/o0$d;->b(IJLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 89
    .line 90
    invoke-virtual {p2}, Landroidx/media3/exoplayer/L0;->e()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    cmp-long p2, v3, v9

    .line 95
    .line 96
    if-nez p2, :cond_2

    .line 97
    .line 98
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/o0;->V0(Lq2/Y;Landroidx/media3/exoplayer/o0$d;Lq2/Y$d;Lq2/Y$b;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return v8

    .line 102
    :cond_3
    move-object/from16 v5, p5

    .line 103
    .line 104
    move-object/from16 v2, p6

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v3, -0x1

    .line 111
    if-ne v0, v3, :cond_4

    .line 112
    .line 113
    return v7

    .line 114
    :cond_4
    iget-object v3, p0, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 115
    .line 116
    invoke-virtual {v3}, Landroidx/media3/exoplayer/L0;->e()J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    cmp-long v3, v3, v9

    .line 121
    .line 122
    if-nez v3, :cond_5

    .line 123
    .line 124
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/o0;->V0(Lq2/Y;Landroidx/media3/exoplayer/o0$d;Lq2/Y$d;Lq2/Y$b;)V

    .line 125
    .line 126
    .line 127
    return v8

    .line 128
    :cond_5
    iput v0, p0, Landroidx/media3/exoplayer/o0$d;->b:I

    .line 129
    .line 130
    iget-object v0, p0, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {p2, v0, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 133
    .line 134
    .line 135
    iget-boolean v0, v2, Lq2/Y$b;->f:Z

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    iget v0, v2, Lq2/Y$b;->c:I

    .line 140
    .line 141
    invoke-virtual {p2, v0, v5}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget v0, v0, Lq2/Y$d;->n:I

    .line 146
    .line 147
    iget-object v3, p0, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {p2, v3}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-ne v0, p2, :cond_6

    .line 154
    .line 155
    iget-wide v3, p0, Landroidx/media3/exoplayer/o0$d;->c:J

    .line 156
    .line 157
    invoke-virtual {v2}, Lq2/Y$b;->o()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    add-long/2addr v3, v6

    .line 162
    iget-object p2, p0, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {p1, p2, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iget p2, p2, Lq2/Y$b;->c:I

    .line 169
    .line 170
    move-object v0, p1

    .line 171
    move-object v1, v5

    .line 172
    move-wide v4, v3

    .line 173
    move v3, p2

    .line 174
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    iget-object v0, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-virtual {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/o0$d;->b(IJLjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    return v8
.end method

.method private W1(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/media3/exoplayer/o0;->r0:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-direct {p0, p1, v0, v1, v0}, Landroidx/media3/exoplayer/o0;->S0(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/p0;->d(LB2/K1;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    iget-boolean p2, p2, Landroidx/media3/exoplayer/K0;->l:Z

    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroidx/media3/exoplayer/g;->n(ZI)I

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private X(LM2/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->F(LM2/C;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/u0;->K(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->G(LM2/C;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->o0()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private X0(Lq2/Y;Lq2/Y;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lq2/Y;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lq2/Y;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Landroidx/media3/exoplayer/o0$d;

    .line 32
    .line 33
    iget v5, p0, Landroidx/media3/exoplayer/o0;->p0:I

    .line 34
    .line 35
    iget-boolean v6, p0, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 36
    .line 37
    iget-object v7, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 38
    .line 39
    iget-object v8, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/o0;->W0(Landroidx/media3/exoplayer/o0$d;Lq2/Y;Lq2/Y;IZLq2/Y$d;Lq2/Y$b;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Landroidx/media3/exoplayer/o0$d;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    move-object p1, v3

    .line 71
    move-object p2, v4

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private X1()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->Y()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method private Y(Ljava/io/IOException;I)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/s;->j(Ljava/io/IOException;I)Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 14
    .line 15
    iget-object p2, p2, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/s;->h(LM2/D$b;)Landroidx/media3/exoplayer/s;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string v0, "Playback error"

    .line 24
    .line 25
    invoke-static {p2, v0, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p2, p2}, Landroidx/media3/exoplayer/o0;->W1(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/K0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/K0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 39
    .line 40
    return-void
.end method

.method private static Y0(Lq2/Y;Landroidx/media3/exoplayer/K0;Landroidx/media3/exoplayer/o0$h;Landroidx/media3/exoplayer/u0;IZLq2/Y$d;Lq2/Y$b;)Landroidx/media3/exoplayer/o0$g;
    .locals 32

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/o0$g;

    .line 12
    .line 13
    invoke-static {}, Landroidx/media3/exoplayer/K0;->l()LM2/D$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/o0$g;-><init>(LM2/D$b;JJZZZ)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    iget-object v9, v7, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 32
    .line 33
    iget-object v8, v9, LM2/D$b;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v7, v2}, Landroidx/media3/exoplayer/o0;->m0(Landroidx/media3/exoplayer/K0;Lq2/Y$b;)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    iget-object v0, v7, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 40
    .line 41
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    if-eqz v10, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-wide v0, v7, Landroidx/media3/exoplayer/K0;->s:J

    .line 51
    .line 52
    :goto_0
    move-wide v11, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    :goto_1
    iget-wide v0, v7, Landroidx/media3/exoplayer/K0;->c:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_2
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/4 v13, -0x1

    .line 65
    const/16 v20, 0x1

    .line 66
    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    move-object/from16 v0, p0

    .line 71
    .line 72
    move-object/from16 v1, p2

    .line 73
    .line 74
    move/from16 v3, p4

    .line 75
    .line 76
    move/from16 v4, p5

    .line 77
    .line 78
    move-object/from16 v5, p6

    .line 79
    .line 80
    move-object/from16 v6, p7

    .line 81
    .line 82
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/o0;->Z0(Lq2/Y;Landroidx/media3/exoplayer/o0$h;ZIZLq2/Y$d;Lq2/Y$b;)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move v3, v4

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lq2/Y;->e(Z)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    move v3, v1

    .line 94
    move-wide v1, v11

    .line 95
    move/from16 v4, v19

    .line 96
    .line 97
    move v5, v4

    .line 98
    move/from16 v14, v20

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_3
    iget-wide v3, v1, Landroidx/media3/exoplayer/o0$h;->c:J

    .line 102
    .line 103
    cmp-long v1, v3, v17

    .line 104
    .line 105
    if-nez v1, :cond_4

    .line 106
    .line 107
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget v1, v1, Lq2/Y$b;->c:I

    .line 114
    .line 115
    move v3, v1

    .line 116
    move-wide v1, v11

    .line 117
    move/from16 v4, v19

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 121
    .line 122
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v1

    .line 130
    move v3, v13

    .line 131
    move/from16 v4, v20

    .line 132
    .line 133
    :goto_3
    iget v5, v7, Landroidx/media3/exoplayer/K0;->e:I

    .line 134
    .line 135
    const/4 v14, 0x4

    .line 136
    if-ne v5, v14, :cond_5

    .line 137
    .line 138
    move/from16 v5, v20

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    move/from16 v5, v19

    .line 142
    .line 143
    :goto_4
    move/from16 v14, v19

    .line 144
    .line 145
    :goto_5
    move/from16 v29, v4

    .line 146
    .line 147
    move/from16 v27, v5

    .line 148
    .line 149
    move/from16 v28, v14

    .line 150
    .line 151
    move-wide/from16 v30, v1

    .line 152
    .line 153
    move-object v2, v6

    .line 154
    move v6, v13

    .line 155
    move-wide/from16 v13, v30

    .line 156
    .line 157
    goto/16 :goto_a

    .line 158
    .line 159
    :cond_6
    move-object/from16 v0, p0

    .line 160
    .line 161
    move/from16 v3, p5

    .line 162
    .line 163
    move-object v6, v2

    .line 164
    iget-object v1, v7, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 165
    .line 166
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_7

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Lq2/Y;->e(Z)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    move v3, v1

    .line 177
    :goto_6
    move-object v2, v6

    .line 178
    move v6, v13

    .line 179
    move/from16 v27, v19

    .line 180
    .line 181
    move/from16 v28, v27

    .line 182
    .line 183
    move/from16 v29, v28

    .line 184
    .line 185
    :goto_7
    move-wide v13, v11

    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_7
    invoke-virtual {v0, v8}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-ne v1, v13, :cond_9

    .line 193
    .line 194
    iget-object v5, v7, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 195
    .line 196
    move/from16 v2, p4

    .line 197
    .line 198
    move-object v1, v6

    .line 199
    move-object v4, v8

    .line 200
    move-object v6, v0

    .line 201
    move-object/from16 v0, p6

    .line 202
    .line 203
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/o0;->a1(Lq2/Y$d;Lq2/Y$b;IZLjava/lang/Object;Lq2/Y;Lq2/Y;)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    move-object v0, v6

    .line 208
    move-object v6, v1

    .line 209
    if-ne v2, v13, :cond_8

    .line 210
    .line 211
    invoke-virtual {v0, v3}, Lq2/Y;->e(Z)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    move/from16 v14, v20

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_8
    move/from16 v14, v19

    .line 219
    .line 220
    :goto_8
    move v3, v2

    .line 221
    move-object v8, v4

    .line 222
    move-object v2, v6

    .line 223
    move v6, v13

    .line 224
    move/from16 v28, v14

    .line 225
    .line 226
    move/from16 v27, v19

    .line 227
    .line 228
    move/from16 v29, v27

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_9
    move-object v4, v8

    .line 232
    cmp-long v1, v11, v17

    .line 233
    .line 234
    if-nez v1, :cond_a

    .line 235
    .line 236
    invoke-virtual {v0, v4, v6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    iget v1, v1, Lq2/Y$b;->c:I

    .line 241
    .line 242
    move v3, v1

    .line 243
    move-object v8, v4

    .line 244
    goto :goto_6

    .line 245
    :cond_a
    if-eqz v10, :cond_d

    .line 246
    .line 247
    iget-object v1, v7, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 248
    .line 249
    iget-object v2, v9, LM2/D$b;->a:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v1, v2, v6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 252
    .line 253
    .line 254
    iget-object v1, v7, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 255
    .line 256
    iget v2, v6, Lq2/Y$b;->c:I

    .line 257
    .line 258
    move-object/from16 v5, p6

    .line 259
    .line 260
    invoke-virtual {v1, v2, v5}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget v1, v1, Lq2/Y$d;->n:I

    .line 265
    .line 266
    iget-object v2, v7, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 267
    .line 268
    iget-object v3, v9, LM2/D$b;->a:Ljava/lang/Object;

    .line 269
    .line 270
    invoke-virtual {v2, v3}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-ne v1, v2, :cond_b

    .line 275
    .line 276
    invoke-virtual {v6}, Lq2/Y$b;->o()J

    .line 277
    .line 278
    .line 279
    move-result-wide v1

    .line 280
    add-long/2addr v1, v11

    .line 281
    invoke-virtual {v0, v4, v6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    iget v3, v3, Lq2/Y$b;->c:I

    .line 286
    .line 287
    move-wide/from16 v30, v1

    .line 288
    .line 289
    move-object v1, v5

    .line 290
    move-wide/from16 v4, v30

    .line 291
    .line 292
    move-object v2, v6

    .line 293
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    iget-object v8, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v1, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v1, Ljava/lang/Long;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 304
    .line 305
    .line 306
    move-result-wide v3

    .line 307
    move v6, v13

    .line 308
    move-wide v13, v3

    .line 309
    goto :goto_9

    .line 310
    :cond_b
    move-object v2, v6

    .line 311
    invoke-virtual {v0, v4, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    iget-wide v5, v1, Lq2/Y$b;->d:J

    .line 316
    .line 317
    cmp-long v1, v5, v17

    .line 318
    .line 319
    if-eqz v1, :cond_c

    .line 320
    .line 321
    iget-wide v5, v2, Lq2/Y$b;->d:J

    .line 322
    .line 323
    const-wide/16 v14, 0x1

    .line 324
    .line 325
    sub-long v15, v5, v14

    .line 326
    .line 327
    move v1, v13

    .line 328
    const-wide/16 v13, 0x0

    .line 329
    .line 330
    move v6, v1

    .line 331
    invoke-static/range {v11 .. v16}, Lt2/a0;->s(JJJ)J

    .line 332
    .line 333
    .line 334
    move-result-wide v13

    .line 335
    move-object v8, v4

    .line 336
    goto :goto_9

    .line 337
    :cond_c
    move v6, v13

    .line 338
    move-object v8, v4

    .line 339
    move-wide v13, v11

    .line 340
    :goto_9
    move v3, v6

    .line 341
    move/from16 v27, v19

    .line 342
    .line 343
    move/from16 v28, v27

    .line 344
    .line 345
    move/from16 v29, v20

    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_d
    move-object v2, v6

    .line 349
    move v6, v13

    .line 350
    move-object v8, v4

    .line 351
    move v3, v6

    .line 352
    move-wide v13, v11

    .line 353
    move/from16 v27, v19

    .line 354
    .line 355
    move/from16 v28, v27

    .line 356
    .line 357
    move/from16 v29, v28

    .line 358
    .line 359
    :goto_a
    if-eq v3, v6, :cond_e

    .line 360
    .line 361
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    move-object/from16 v1, p6

    .line 367
    .line 368
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 373
    .line 374
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, Ljava/lang/Long;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 379
    .line 380
    .line 381
    move-result-wide v13

    .line 382
    move-wide v3, v13

    .line 383
    move-wide/from16 v25, v17

    .line 384
    .line 385
    :goto_b
    move-object/from16 v1, p3

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_e
    move-wide v3, v13

    .line 389
    move-wide/from16 v25, v3

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :goto_c
    invoke-virtual {v1, v0, v8, v3, v4}, Landroidx/media3/exoplayer/u0;->Q(Lq2/Y;Ljava/lang/Object;J)LM2/D$b;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iget v5, v1, LM2/D$b;->e:I

    .line 397
    .line 398
    if-eq v5, v6, :cond_10

    .line 399
    .line 400
    iget v13, v9, LM2/D$b;->e:I

    .line 401
    .line 402
    if-eq v13, v6, :cond_f

    .line 403
    .line 404
    if-lt v5, v13, :cond_f

    .line 405
    .line 406
    goto :goto_d

    .line 407
    :cond_f
    move/from16 v5, v19

    .line 408
    .line 409
    goto :goto_e

    .line 410
    :cond_10
    :goto_d
    move/from16 v5, v20

    .line 411
    .line 412
    :goto_e
    iget-object v6, v9, LM2/D$b;->a:Ljava/lang/Object;

    .line 413
    .line 414
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-eqz v6, :cond_11

    .line 419
    .line 420
    invoke-virtual {v9}, LM2/D$b;->b()Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-nez v6, :cond_11

    .line 425
    .line 426
    invoke-virtual {v1}, LM2/D$b;->b()Z

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-nez v6, :cond_11

    .line 431
    .line 432
    if-eqz v5, :cond_11

    .line 433
    .line 434
    move/from16 v19, v20

    .line 435
    .line 436
    :cond_11
    invoke-virtual {v0, v8, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 437
    .line 438
    .line 439
    move-result-object v13

    .line 440
    move v8, v10

    .line 441
    move-wide v10, v11

    .line 442
    move-wide/from16 v14, v25

    .line 443
    .line 444
    move-object v12, v1

    .line 445
    invoke-static/range {v8 .. v15}, Landroidx/media3/exoplayer/o0;->i0(ZLM2/D$b;JLM2/D$b;Lq2/Y$b;J)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v19, :cond_12

    .line 450
    .line 451
    if-eqz v1, :cond_13

    .line 452
    .line 453
    :cond_12
    move-object v12, v9

    .line 454
    :cond_13
    invoke-virtual {v12}, LM2/D$b;->b()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_14

    .line 459
    .line 460
    invoke-virtual {v12, v9}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-eqz v1, :cond_15

    .line 465
    .line 466
    iget-wide v3, v7, Landroidx/media3/exoplayer/K0;->s:J

    .line 467
    .line 468
    :cond_14
    :goto_f
    move-wide/from16 v23, v3

    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_15
    iget-object v1, v12, LM2/D$b;->a:Ljava/lang/Object;

    .line 472
    .line 473
    invoke-virtual {v0, v1, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 474
    .line 475
    .line 476
    iget v0, v12, LM2/D$b;->c:I

    .line 477
    .line 478
    iget v1, v12, LM2/D$b;->b:I

    .line 479
    .line 480
    invoke-virtual {v2, v1}, Lq2/Y$b;->l(I)I

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-ne v0, v1, :cond_16

    .line 485
    .line 486
    invoke-virtual {v2}, Lq2/Y$b;->h()J

    .line 487
    .line 488
    .line 489
    move-result-wide v0

    .line 490
    :goto_10
    move-wide v3, v0

    .line 491
    goto :goto_f

    .line 492
    :cond_16
    const-wide/16 v0, 0x0

    .line 493
    .line 494
    goto :goto_10

    .line 495
    :goto_11
    new-instance v21, Landroidx/media3/exoplayer/o0$g;

    .line 496
    .line 497
    move-object/from16 v22, v12

    .line 498
    .line 499
    invoke-direct/range {v21 .. v29}, Landroidx/media3/exoplayer/o0$g;-><init>(LM2/D$b;JJZZZ)V

    .line 500
    .line 501
    .line 502
    return-object v21
.end method

.method private Y1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Landroidx/media3/exoplayer/o0;->o0:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 14
    .line 15
    invoke-interface {v0}, LM2/C;->q()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 26
    .line 27
    iget-boolean v2, v1, Landroidx/media3/exoplayer/K0;->g:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/K0;->b(Z)Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method private Z(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 10
    .line 11
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget-wide v3, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->j()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    :goto_1
    iput-wide v3, v1, Landroidx/media3/exoplayer/K0;->q:J

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Landroidx/media3/exoplayer/K0;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 68
    .line 69
    iget-object p1, p1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->o()LM2/n0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p0, p1, v1, v0}, Landroidx/media3/exoplayer/o0;->Z1(LM2/D$b;LM2/n0;LP2/H;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private static Z0(Lq2/Y;Landroidx/media3/exoplayer/o0$h;ZIZLq2/Y$d;Lq2/Y$b;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v2, p1, Landroidx/media3/exoplayer/o0$h;->a:Lq2/Y;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq2/Y;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    return-object v8

    .line 11
    :cond_0
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    :cond_1
    :try_start_0
    iget v5, p1, Landroidx/media3/exoplayer/o0$h;->b:I

    .line 19
    .line 20
    iget-wide v6, p1, Landroidx/media3/exoplayer/o0$h;->c:J

    .line 21
    .line 22
    move-object v3, p5

    .line 23
    move-object v4, p6

    .line 24
    invoke-virtual/range {v2 .. v7}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    move-object v3, v2

    .line 29
    invoke-virtual {p0, v3}, Lq2/Y;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    return-object v5

    .line 36
    :cond_2
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v7, -0x1

    .line 43
    if-eq v4, v7, :cond_4

    .line 44
    .line 45
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3, v4, p6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-boolean v4, v4, Lq2/Y$b;->f:Z

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    iget v4, p6, Lq2/Y$b;->c:I

    .line 56
    .line 57
    invoke-virtual {v3, v4, p5}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget v4, v4, Lq2/Y$d;->n:I

    .line 62
    .line 63
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v4, v3, :cond_3

    .line 70
    .line 71
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {p0, v3, p6}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget v3, v3, Lq2/Y$b;->c:I

    .line 78
    .line 79
    iget-wide v4, p1, Landroidx/media3/exoplayer/o0$h;->c:J

    .line 80
    .line 81
    move-object v0, p0

    .line 82
    move-object v1, p5

    .line 83
    move-object v2, p6

    .line 84
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_3
    return-object v5

    .line 90
    :cond_4
    if-eqz p2, :cond_5

    .line 91
    .line 92
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v6, p0

    .line 95
    move v2, p3

    .line 96
    move-object v0, p5

    .line 97
    move-object v1, p6

    .line 98
    move-object v5, v3

    .line 99
    move v3, p4

    .line 100
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/o0;->a1(Lq2/Y$d;Lq2/Y$b;IZLjava/lang/Object;Lq2/Y;Lq2/Y;)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eq v3, v7, :cond_5

    .line 105
    .line 106
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    move-object v0, p0

    .line 112
    move-object v1, p5

    .line 113
    move-object v2, p6

    .line 114
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :catch_0
    :cond_5
    return-object v8
.end method

.method private Z1(LM2/D$b;LM2/n0;LP2/H;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/media3/exoplayer/r0;

    .line 14
    .line 15
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    :goto_0
    move-wide v8, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-wide v2, v0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 38
    .line 39
    iget-wide v4, v4, Landroidx/media3/exoplayer/s0;->b:J

    .line 40
    .line 41
    sub-long/2addr v2, v4

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->j()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/o0;->U(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 52
    .line 53
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 54
    .line 55
    iget-object v1, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 58
    .line 59
    invoke-direct {v0, v2, v1}, Landroidx/media3/exoplayer/o0;->T1(Lq2/Y;LM2/D$b;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 66
    .line 67
    invoke-interface {v1}, LA2/K;->c()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    :goto_2
    move-wide v15, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_3
    iget-object v1, v0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 80
    .line 81
    new-instance v4, Landroidx/media3/exoplayer/p0$a;

    .line 82
    .line 83
    iget-object v5, v0, Landroidx/media3/exoplayer/o0;->w:LB2/K1;

    .line 84
    .line 85
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 86
    .line 87
    iget-object v6, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 88
    .line 89
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget v12, v2, Lq2/O;->a:F

    .line 96
    .line 97
    iget-object v2, v0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 98
    .line 99
    iget-boolean v13, v2, Landroidx/media3/exoplayer/K0;->l:Z

    .line 100
    .line 101
    iget-boolean v14, v0, Landroidx/media3/exoplayer/o0;->m0:Z

    .line 102
    .line 103
    iget-wide v2, v0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 104
    .line 105
    move-object/from16 v7, p1

    .line 106
    .line 107
    move-wide/from16 v17, v2

    .line 108
    .line 109
    invoke-direct/range {v4 .. v18}, Landroidx/media3/exoplayer/p0$a;-><init>(LB2/K1;Lq2/Y;LM2/D$b;JJFZZJJ)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v2, p3

    .line 113
    .line 114
    iget-object v2, v2, LP2/H;->c:[LP2/A;

    .line 115
    .line 116
    move-object/from16 v3, p2

    .line 117
    .line 118
    invoke-interface {v1, v4, v3, v2}, Landroidx/media3/exoplayer/p0;->e(Landroidx/media3/exoplayer/p0$a;LM2/n0;[LP2/A;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method private a0(Landroidx/media3/exoplayer/r0;)V
    .locals 11

    .line 1
    iget-boolean v0, p1, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lq2/O;->a:F

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 16
    .line 17
    iget-boolean v1, v1, Landroidx/media3/exoplayer/K0;->l:Z

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2, v1}, Landroidx/media3/exoplayer/r0;->q(FLq2/Y;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->o()LM2/n0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/o0;->Z1(LM2/D$b;LM2/n0;LP2/H;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne p1, v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 46
    .line 47
    iget-wide v0, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->H()V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p1, Landroidx/media3/exoplayer/r0;->i:Z

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 59
    .line 60
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 61
    .line 62
    iget-object p1, p1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 63
    .line 64
    iget-wide v3, p1, Landroidx/media3/exoplayer/s0;->b:J

    .line 65
    .line 66
    iget-wide v5, v0, Landroidx/media3/exoplayer/K0;->c:J

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x5

    .line 70
    move-wide v7, v3

    .line 71
    move-object v1, p0

    .line 72
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    move-object v1, p0

    .line 80
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method static a1(Lq2/Y$d;Lq2/Y$b;IZLjava/lang/Object;Lq2/Y;Lq2/Y;)I
    .locals 9

    .line 1
    invoke-virtual {p5, p4, p1}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lq2/Y$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p5, v0, p0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {p6}, Lq2/Y;->t()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p6, v2, p0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    return v2

    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p5, p4}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-virtual {p5}, Lq2/Y;->m()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, -0x1

    .line 46
    move v4, p4

    .line 47
    move p4, v2

    .line 48
    :goto_1
    if-ge v1, v0, :cond_3

    .line 49
    .line 50
    if-ne p4, v2, :cond_3

    .line 51
    .line 52
    move-object v6, p0

    .line 53
    move-object v5, p1

    .line 54
    move v7, p2

    .line 55
    move v8, p3

    .line 56
    move-object v3, p5

    .line 57
    invoke-virtual/range {v3 .. v8}, Lq2/Y;->h(ILq2/Y$b;Lq2/Y$d;IZ)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v4, v2, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v3, v4}, Lq2/Y;->q(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p6, p0}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    move-object p5, v3

    .line 75
    move-object p1, v5

    .line 76
    move-object p0, v6

    .line 77
    move p2, v7

    .line 78
    move p3, v8

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v5, p1

    .line 81
    :goto_2
    if-ne p4, v2, :cond_4

    .line 82
    .line 83
    return v2

    .line 84
    :cond_4
    invoke-virtual {p6, p4, v5}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget p0, p0, Lq2/Y$b;->c:I

    .line 89
    .line 90
    return p0
.end method

.method private b0(Lq2/Y;Z)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 4
    .line 5
    iget-object v4, v1, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 6
    .line 7
    iget-object v5, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 8
    .line 9
    iget v6, v1, Landroidx/media3/exoplayer/o0;->p0:I

    .line 10
    .line 11
    iget-boolean v7, v1, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 12
    .line 13
    iget-object v8, v1, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 14
    .line 15
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    invoke-static/range {v2 .. v9}, Landroidx/media3/exoplayer/o0;->Y0(Lq2/Y;Landroidx/media3/exoplayer/K0;Landroidx/media3/exoplayer/o0$h;Landroidx/media3/exoplayer/u0;IZLq2/Y$d;Lq2/Y$b;)Landroidx/media3/exoplayer/o0$g;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    iget-object v11, v10, Landroidx/media3/exoplayer/o0$g;->a:LM2/D$b;

    .line 24
    .line 25
    iget-wide v12, v10, Landroidx/media3/exoplayer/o0$g;->c:J

    .line 26
    .line 27
    iget-boolean v0, v10, Landroidx/media3/exoplayer/o0$g;->d:Z

    .line 28
    .line 29
    iget-wide v14, v10, Landroidx/media3/exoplayer/o0$g;->b:J

    .line 30
    .line 31
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 34
    .line 35
    invoke-virtual {v3, v11}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 44
    .line 45
    iget-wide v6, v3, Landroidx/media3/exoplayer/K0;->s:J

    .line 46
    .line 47
    cmp-long v3, v14, v6

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move/from16 v16, v5

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    move/from16 v16, v4

    .line 56
    .line 57
    :goto_1
    const/16 v17, 0x3

    .line 58
    .line 59
    const/4 v6, -0x1

    .line 60
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v7, 0x2

    .line 66
    const/4 v8, 0x4

    .line 67
    :try_start_0
    iget-boolean v9, v10, Landroidx/media3/exoplayer/o0$g;->e:Z

    .line 68
    .line 69
    if-eqz v9, :cond_3

    .line 70
    .line 71
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 72
    .line 73
    iget v9, v9, Landroidx/media3/exoplayer/K0;->e:I

    .line 74
    .line 75
    if-eq v9, v4, :cond_2

    .line 76
    .line 77
    invoke-direct {v1, v8}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object/from16 v20, v11

    .line 83
    .line 84
    move-object v11, v2

    .line 85
    move-object/from16 v2, v20

    .line 86
    .line 87
    move/from16 v20, v4

    .line 88
    .line 89
    move/from16 v23, v8

    .line 90
    .line 91
    move-wide/from16 v21, v12

    .line 92
    .line 93
    move v12, v5

    .line 94
    :goto_2
    move v13, v6

    .line 95
    goto/16 :goto_10

    .line 96
    .line 97
    :cond_2
    :goto_3
    invoke-direct {v1, v5, v5, v5, v4}, Landroidx/media3/exoplayer/o0;->S0(ZZZZ)V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 101
    .line 102
    array-length v3, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    move v4, v5

    .line 104
    :goto_4
    if-ge v4, v3, :cond_4

    .line 105
    .line 106
    :try_start_1
    aget-object v5, v9, v4

    .line 107
    .line 108
    invoke-virtual {v5, v2}, Landroidx/media3/exoplayer/P0;->S(Lq2/Y;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    .line 111
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    goto :goto_4

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    move-object/from16 v20, v11

    .line 117
    .line 118
    move-object v11, v2

    .line 119
    move-object/from16 v2, v20

    .line 120
    .line 121
    move/from16 v23, v8

    .line 122
    .line 123
    move-wide/from16 v21, v12

    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    const/16 v20, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    if-nez v16, :cond_9

    .line 130
    .line 131
    :try_start_2
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 132
    .line 133
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-wide/16 v3, 0x0

    .line 138
    .line 139
    if-nez v0, :cond_5

    .line 140
    .line 141
    move-wide/from16 v22, v3

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_5
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/o0;->O(Landroidx/media3/exoplayer/r0;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v22

    .line 154
    :goto_5
    invoke-direct {v1}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 155
    .line 156
    .line 157
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    :try_start_3
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-nez v0, :cond_6

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/o0;->O(Landroidx/media3/exoplayer/r0;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 179
    :cond_7
    :goto_6
    :try_start_4
    iget-object v2, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 180
    .line 181
    move-wide/from16 v25, v3

    .line 182
    .line 183
    move v3, v8

    .line 184
    move-wide/from16 v8, v25

    .line 185
    .line 186
    :try_start_5
    iget-wide v4, v1, Landroidx/media3/exoplayer/o0;->w0:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 187
    .line 188
    move/from16 v24, v7

    .line 189
    .line 190
    const/16 v20, 0x1

    .line 191
    .line 192
    move/from16 v25, v3

    .line 193
    .line 194
    move-object/from16 v3, p1

    .line 195
    .line 196
    move-wide/from16 v26, v22

    .line 197
    .line 198
    move/from16 v23, v25

    .line 199
    .line 200
    move-wide/from16 v21, v12

    .line 201
    .line 202
    const/4 v12, 0x0

    .line 203
    move v13, v6

    .line 204
    move-wide/from16 v6, v26

    .line 205
    .line 206
    :try_start_6
    invoke-virtual/range {v2 .. v9}, Landroidx/media3/exoplayer/u0;->W(Lq2/Y;JJJ)I

    .line 207
    .line 208
    .line 209
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 210
    move-object v2, v3

    .line 211
    and-int/lit8 v3, v0, 0x1

    .line 212
    .line 213
    if-eqz v3, :cond_8

    .line 214
    .line 215
    :try_start_7
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/o0;->d1(Z)V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_b

    .line 219
    .line 220
    :catchall_2
    move-exception v0

    .line 221
    :goto_7
    move-object/from16 v25, v11

    .line 222
    .line 223
    move-object v11, v2

    .line 224
    move-object/from16 v2, v25

    .line 225
    .line 226
    goto/16 :goto_10

    .line 227
    .line 228
    :cond_8
    and-int/lit8 v0, v0, 0x2

    .line 229
    .line 230
    if-eqz v0, :cond_c

    .line 231
    .line 232
    invoke-direct {v1}, Landroidx/media3/exoplayer/o0;->C()V

    .line 233
    .line 234
    .line 235
    goto :goto_b

    .line 236
    :catchall_3
    move-exception v0

    .line 237
    move-object v2, v3

    .line 238
    goto :goto_7

    .line 239
    :catchall_4
    move-exception v0

    .line 240
    move-object/from16 v2, p1

    .line 241
    .line 242
    move/from16 v23, v3

    .line 243
    .line 244
    move/from16 v24, v7

    .line 245
    .line 246
    :goto_8
    move-wide/from16 v21, v12

    .line 247
    .line 248
    const/4 v12, 0x0

    .line 249
    const/16 v20, 0x1

    .line 250
    .line 251
    move v13, v6

    .line 252
    goto :goto_7

    .line 253
    :catchall_5
    move-exception v0

    .line 254
    move-object/from16 v2, p1

    .line 255
    .line 256
    :goto_9
    move/from16 v24, v7

    .line 257
    .line 258
    move/from16 v23, v8

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :catchall_6
    move-exception v0

    .line 262
    goto :goto_9

    .line 263
    :cond_9
    move/from16 v24, v7

    .line 264
    .line 265
    move/from16 v23, v8

    .line 266
    .line 267
    move-wide/from16 v21, v12

    .line 268
    .line 269
    const/4 v12, 0x0

    .line 270
    const/16 v20, 0x1

    .line 271
    .line 272
    move v13, v6

    .line 273
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-nez v3, :cond_c

    .line 278
    .line 279
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 280
    .line 281
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    :goto_a
    if-eqz v3, :cond_b

    .line 286
    .line 287
    iget-object v4, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 288
    .line 289
    iget-object v4, v4, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 290
    .line 291
    invoke-virtual {v4, v11}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_a

    .line 296
    .line 297
    iget-object v4, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 298
    .line 299
    iget-object v5, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 300
    .line 301
    invoke-virtual {v4, v2, v5}, Landroidx/media3/exoplayer/u0;->z(Lq2/Y;Landroidx/media3/exoplayer/s0;)Landroidx/media3/exoplayer/s0;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    iput-object v4, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 306
    .line 307
    invoke-virtual {v3}, Landroidx/media3/exoplayer/r0;->E()V

    .line 308
    .line 309
    .line 310
    :cond_a
    invoke-virtual {v3}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    goto :goto_a

    .line 315
    :cond_b
    invoke-direct {v1, v11, v14, v15, v0}, Landroidx/media3/exoplayer/o0;->f1(LM2/D$b;JZ)J

    .line 316
    .line 317
    .line 318
    move-result-wide v14
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 319
    :cond_c
    :goto_b
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 320
    .line 321
    iget-object v4, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 322
    .line 323
    iget-object v5, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 324
    .line 325
    iget-boolean v0, v10, Landroidx/media3/exoplayer/o0$g;->f:Z

    .line 326
    .line 327
    if-eqz v0, :cond_d

    .line 328
    .line 329
    move-wide v6, v14

    .line 330
    goto :goto_c

    .line 331
    :cond_d
    move-wide/from16 v6, v18

    .line 332
    .line 333
    :goto_c
    const/4 v8, 0x0

    .line 334
    move-object v3, v11

    .line 335
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/o0;->i2(Lq2/Y;LM2/D$b;Lq2/Y;LM2/D$b;JZ)V

    .line 336
    .line 337
    .line 338
    move-object v11, v2

    .line 339
    move-object v2, v3

    .line 340
    if-nez v16, :cond_e

    .line 341
    .line 342
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 343
    .line 344
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->c:J

    .line 345
    .line 346
    cmp-long v0, v21, v3

    .line 347
    .line 348
    if-eqz v0, :cond_11

    .line 349
    .line 350
    :cond_e
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 351
    .line 352
    iget-object v3, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 353
    .line 354
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 355
    .line 356
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 357
    .line 358
    if-eqz v16, :cond_f

    .line 359
    .line 360
    if-eqz p2, :cond_f

    .line 361
    .line 362
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-nez v4, :cond_f

    .line 367
    .line 368
    iget-object v4, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 369
    .line 370
    invoke-virtual {v0, v3, v4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iget-boolean v0, v0, Lq2/Y$b;->f:Z

    .line 375
    .line 376
    if-nez v0, :cond_f

    .line 377
    .line 378
    move/from16 v9, v20

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_f
    move v9, v12

    .line 382
    :goto_d
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 383
    .line 384
    iget-wide v7, v0, Landroidx/media3/exoplayer/K0;->d:J

    .line 385
    .line 386
    invoke-virtual {v11, v3}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-ne v0, v13, :cond_10

    .line 391
    .line 392
    move/from16 v10, v23

    .line 393
    .line 394
    :goto_e
    move-wide v3, v14

    .line 395
    move-wide/from16 v5, v21

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_10
    move/from16 v10, v17

    .line 399
    .line 400
    goto :goto_e

    .line 401
    :goto_f
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iput-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 406
    .line 407
    :cond_11
    invoke-direct {v1}, Landroidx/media3/exoplayer/o0;->T0()V

    .line 408
    .line 409
    .line 410
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 411
    .line 412
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 413
    .line 414
    invoke-direct {v1, v11, v0}, Landroidx/media3/exoplayer/o0;->X0(Lq2/Y;Lq2/Y;)V

    .line 415
    .line 416
    .line 417
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 418
    .line 419
    invoke-virtual {v0, v11}, Landroidx/media3/exoplayer/K0;->j(Lq2/Y;)Landroidx/media3/exoplayer/K0;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iput-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 424
    .line 425
    invoke-virtual {v11}, Lq2/Y;->u()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-nez v0, :cond_12

    .line 430
    .line 431
    const/4 v2, 0x0

    .line 432
    iput-object v2, v1, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 433
    .line 434
    :cond_12
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 435
    .line 436
    .line 437
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 438
    .line 439
    move/from16 v2, v24

    .line 440
    .line 441
    invoke-interface {v0, v2}, Lt2/s;->j(I)Z

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :goto_10
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 446
    .line 447
    iget-object v4, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 448
    .line 449
    iget-object v5, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 450
    .line 451
    iget-boolean v3, v10, Landroidx/media3/exoplayer/o0$g;->f:Z

    .line 452
    .line 453
    if-eqz v3, :cond_13

    .line 454
    .line 455
    move-wide v6, v14

    .line 456
    goto :goto_11

    .line 457
    :cond_13
    move-wide/from16 v6, v18

    .line 458
    .line 459
    :goto_11
    const/4 v8, 0x0

    .line 460
    move-object v3, v2

    .line 461
    move-object v2, v11

    .line 462
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/o0;->i2(Lq2/Y;LM2/D$b;Lq2/Y;LM2/D$b;JZ)V

    .line 463
    .line 464
    .line 465
    move-object v2, v3

    .line 466
    if-nez v16, :cond_14

    .line 467
    .line 468
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 469
    .line 470
    iget-wide v3, v3, Landroidx/media3/exoplayer/K0;->c:J

    .line 471
    .line 472
    cmp-long v3, v21, v3

    .line 473
    .line 474
    if-eqz v3, :cond_17

    .line 475
    .line 476
    :cond_14
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 477
    .line 478
    iget-object v4, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 479
    .line 480
    iget-object v4, v4, LM2/D$b;->a:Ljava/lang/Object;

    .line 481
    .line 482
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 483
    .line 484
    if-eqz v16, :cond_15

    .line 485
    .line 486
    if-eqz p2, :cond_15

    .line 487
    .line 488
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    if-nez v5, :cond_15

    .line 493
    .line 494
    iget-object v5, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 495
    .line 496
    invoke-virtual {v3, v4, v5}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    iget-boolean v3, v3, Lq2/Y$b;->f:Z

    .line 501
    .line 502
    if-nez v3, :cond_15

    .line 503
    .line 504
    move/from16 v9, v20

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_15
    move v9, v12

    .line 508
    :goto_12
    iget-object v3, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 509
    .line 510
    iget-wide v7, v3, Landroidx/media3/exoplayer/K0;->d:J

    .line 511
    .line 512
    invoke-virtual {v11, v4}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-ne v3, v13, :cond_16

    .line 517
    .line 518
    move/from16 v10, v23

    .line 519
    .line 520
    :goto_13
    move-wide v3, v14

    .line 521
    move-wide/from16 v5, v21

    .line 522
    .line 523
    goto :goto_14

    .line 524
    :cond_16
    move/from16 v10, v17

    .line 525
    .line 526
    goto :goto_13

    .line 527
    :goto_14
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    iput-object v2, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 532
    .line 533
    :cond_17
    invoke-direct {v1}, Landroidx/media3/exoplayer/o0;->T0()V

    .line 534
    .line 535
    .line 536
    iget-object v2, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 537
    .line 538
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 539
    .line 540
    invoke-direct {v1, v11, v2}, Landroidx/media3/exoplayer/o0;->X0(Lq2/Y;Lq2/Y;)V

    .line 541
    .line 542
    .line 543
    iget-object v2, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 544
    .line 545
    invoke-virtual {v2, v11}, Landroidx/media3/exoplayer/K0;->j(Lq2/Y;)Landroidx/media3/exoplayer/K0;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    iput-object v2, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 550
    .line 551
    invoke-virtual {v11}, Lq2/Y;->u()Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-nez v2, :cond_18

    .line 556
    .line 557
    const/4 v2, 0x0

    .line 558
    iput-object v2, v1, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 559
    .line 560
    :cond_18
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 561
    .line 562
    .line 563
    iget-object v2, v1, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 564
    .line 565
    const/4 v3, 0x2

    .line 566
    invoke-interface {v2, v3}, Lt2/s;->j(I)Z

    .line 567
    .line 568
    .line 569
    throw v0
.end method

.method private b1(J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->M()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->S()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    add-long/2addr p1, v0

    .line 20
    invoke-interface {v2, v3, p1, p2}, Lt2/s;->k(IJ)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private b2(IILjava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/J0;->E(IILjava/util/List;)Lq2/Y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private c0(LM2/C;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->F(LM2/C;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroidx/media3/exoplayer/r0;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->a0(Landroidx/media3/exoplayer/r0;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->v(LM2/C;)Landroidx/media3/exoplayer/r0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-boolean v1, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 34
    .line 35
    xor-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, Lq2/O;->a:F

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 49
    .line 50
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 51
    .line 52
    iget-boolean v2, v2, Landroidx/media3/exoplayer/K0;->l:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1, v3, v2}, Landroidx/media3/exoplayer/r0;->q(FLq2/Y;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->G(LM2/C;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->o0()V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void
.end method

.method private c2()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/J0;->t()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->v0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->z0()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->A0()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->B0()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->x0()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->y0(Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method private d0(Lq2/O;FZZ)V
    .locals 3

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Landroidx/media3/exoplayer/K0;->g(Lq2/O;)Landroidx/media3/exoplayer/K0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lq2/O;->a:F

    .line 20
    .line 21
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/o0;->m2(F)V

    .line 22
    .line 23
    .line 24
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 25
    .line 26
    array-length p4, p3

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-ge v0, p4, :cond_2

    .line 29
    .line 30
    aget-object v1, p3, v0

    .line 31
    .line 32
    iget v2, p1, Lq2/O;->a:F

    .line 33
    .line 34
    invoke-virtual {v1, p2, v2}, Landroidx/media3/exoplayer/P0;->Q(FF)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-void
.end method

.method private d1(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 12
    .line 13
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/o0;->g1(LM2/D$b;JZZ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 23
    .line 24
    iget-wide v5, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v5

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    iget-wide v5, v0, Landroidx/media3/exoplayer/K0;->c:J

    .line 33
    .line 34
    iget-wide v7, v0, Landroidx/media3/exoplayer/K0;->d:J

    .line 35
    .line 36
    const/4 v10, 0x5

    .line 37
    move v9, p1

    .line 38
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method private static d2(II)I
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_1
    return p1
.end method

.method private e0(Lq2/O;Z)V
    .locals 2

    .line 1
    iget v0, p1, Lq2/O;->a:F

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/o0;->d0(Lq2/O;FZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private e1(Landroidx/media3/exoplayer/o0$h;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 6
    .line 7
    move/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, v1, Landroidx/media3/exoplayer/o0;->G:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object v3, v1, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 22
    .line 23
    iget v5, v1, Landroidx/media3/exoplayer/o0;->p0:I

    .line 24
    .line 25
    iget-boolean v6, v1, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 26
    .line 27
    iget-object v7, v1, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 28
    .line 29
    iget-object v8, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/o0;->Z0(Lq2/Y;Landroidx/media3/exoplayer/o0$h;ZIZLq2/Y$d;Lq2/Y$b;)Landroid/util/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v8, 0x1

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 46
    .line 47
    iget-object v9, v9, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 48
    .line 49
    invoke-direct {v1, v9}, Landroidx/media3/exoplayer/o0;->P(Lq2/Y;)Landroid/util/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v10, LM2/D$b;

    .line 56
    .line 57
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 66
    .line 67
    iget-object v9, v9, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 68
    .line 69
    invoke-virtual {v9}, Lq2/Y;->u()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    xor-int/2addr v9, v8

    .line 74
    move-wide v5, v6

    .line 75
    :goto_0
    const-wide/16 v15, 0x0

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_1
    iget-object v9, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v10, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v11

    .line 88
    iget-wide v13, v3, Landroidx/media3/exoplayer/o0$h;->c:J

    .line 89
    .line 90
    cmp-long v10, v13, v6

    .line 91
    .line 92
    if-nez v10, :cond_2

    .line 93
    .line 94
    move-wide v13, v6

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move-wide v13, v11

    .line 97
    :goto_1
    iget-object v10, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 98
    .line 99
    iget-object v15, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 100
    .line 101
    iget-object v15, v15, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 102
    .line 103
    invoke-virtual {v10, v15, v9, v11, v12}, Landroidx/media3/exoplayer/u0;->Q(Lq2/Y;Ljava/lang/Object;J)LM2/D$b;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-virtual {v10}, LM2/D$b;->b()Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_4

    .line 112
    .line 113
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 114
    .line 115
    iget-object v6, v6, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 116
    .line 117
    iget-object v7, v10, LM2/D$b;->a:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v9, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 120
    .line 121
    invoke-virtual {v6, v7, v9}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 122
    .line 123
    .line 124
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 125
    .line 126
    iget v7, v10, LM2/D$b;->b:I

    .line 127
    .line 128
    invoke-virtual {v6, v7}, Lq2/Y$b;->l(I)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    iget v7, v10, LM2/D$b;->c:I

    .line 133
    .line 134
    if-ne v6, v7, :cond_3

    .line 135
    .line 136
    iget-object v6, v1, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 137
    .line 138
    invoke-virtual {v6}, Lq2/Y$b;->h()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    move-wide v11, v6

    .line 143
    goto :goto_2

    .line 144
    :cond_3
    const-wide/16 v11, 0x0

    .line 145
    .line 146
    :goto_2
    move v9, v8

    .line 147
    move-wide v5, v13

    .line 148
    goto :goto_0

    .line 149
    :cond_4
    const-wide/16 v15, 0x0

    .line 150
    .line 151
    iget-wide v4, v3, Landroidx/media3/exoplayer/o0$h;->c:J

    .line 152
    .line 153
    cmp-long v4, v4, v6

    .line 154
    .line 155
    if-nez v4, :cond_5

    .line 156
    .line 157
    move v9, v8

    .line 158
    goto :goto_3

    .line 159
    :cond_5
    move v9, v2

    .line 160
    :goto_3
    move-wide v5, v13

    .line 161
    :goto_4
    :try_start_0
    iget-object v4, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 162
    .line 163
    iget-object v4, v4, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 164
    .line 165
    invoke-virtual {v4}, Lq2/Y;->u()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_6

    .line 170
    .line 171
    iput-object v3, v1, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    :goto_5
    move-object v2, v10

    .line 176
    move-wide v3, v11

    .line 177
    goto/16 :goto_e

    .line 178
    .line 179
    :cond_6
    const/4 v3, 0x4

    .line 180
    if-nez v0, :cond_8

    .line 181
    .line 182
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 183
    .line 184
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 185
    .line 186
    if-eq v0, v8, :cond_7

    .line 187
    .line 188
    invoke-direct {v1, v3}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 189
    .line 190
    .line 191
    :cond_7
    invoke-direct {v1, v2, v8, v2, v8}, Landroidx/media3/exoplayer/o0;->S0(ZZZZ)V

    .line 192
    .line 193
    .line 194
    :goto_6
    move-object v2, v10

    .line 195
    move-wide v3, v11

    .line 196
    goto/16 :goto_c

    .line 197
    .line 198
    :cond_8
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 199
    .line 200
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 201
    .line 202
    invoke-virtual {v10, v0}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_c

    .line 207
    .line 208
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_9

    .line 215
    .line 216
    iget-boolean v4, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 217
    .line 218
    if-eqz v4, :cond_9

    .line 219
    .line 220
    cmp-long v4, v11, v15

    .line 221
    .line 222
    if-eqz v4, :cond_9

    .line 223
    .line 224
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 225
    .line 226
    iget-object v4, v1, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 227
    .line 228
    iget-wide v13, v4, Lq2/Y$d;->m:J

    .line 229
    .line 230
    invoke-direct {v1, v13, v14}, Landroidx/media3/exoplayer/o0;->R(J)LA2/Q;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-interface {v0, v11, v12, v4}, LM2/C;->d(JLA2/Q;)J

    .line 235
    .line 236
    .line 237
    move-result-wide v13

    .line 238
    goto :goto_7

    .line 239
    :cond_9
    move-wide v13, v11

    .line 240
    :goto_7
    invoke-static {v13, v14}, Lt2/a0;->F1(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v15

    .line 244
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    .line 246
    move/from16 p2, v9

    .line 247
    .line 248
    :try_start_1
    iget-wide v8, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 249
    .line 250
    invoke-static {v8, v9}, Lt2/a0;->F1(J)J

    .line 251
    .line 252
    .line 253
    move-result-wide v7

    .line 254
    cmp-long v0, v15, v7

    .line 255
    .line 256
    if-nez v0, :cond_a

    .line 257
    .line 258
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 259
    .line 260
    iget v7, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 261
    .line 262
    const/4 v8, 0x2

    .line 263
    if-eq v7, v8, :cond_b

    .line 264
    .line 265
    const/4 v8, 0x3

    .line 266
    if-ne v7, v8, :cond_a

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_a
    move/from16 v9, p2

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_b
    :goto_8
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->s:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    .line 274
    move-object v2, v10

    .line 275
    const/4 v10, 0x2

    .line 276
    move-wide v7, v3

    .line 277
    move/from16 v9, p2

    .line 278
    .line 279
    :goto_9
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iput-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 284
    .line 285
    return-void

    .line 286
    :catchall_1
    move-exception v0

    .line 287
    move/from16 v9, p2

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_c
    move-wide v13, v11

    .line 291
    :goto_a
    :try_start_2
    iget-boolean v0, v1, Landroidx/media3/exoplayer/o0;->F:Z

    .line 292
    .line 293
    iput-boolean v0, v1, Landroidx/media3/exoplayer/o0;->G:Z

    .line 294
    .line 295
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 296
    .line 297
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 298
    .line 299
    if-ne v0, v3, :cond_d

    .line 300
    .line 301
    const/4 v0, 0x1

    .line 302
    goto :goto_b

    .line 303
    :cond_d
    move v0, v2

    .line 304
    :goto_b
    invoke-direct {v1, v10, v13, v14, v0}, Landroidx/media3/exoplayer/o0;->f1(LM2/D$b;JZ)J

    .line 305
    .line 306
    .line 307
    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    cmp-long v0, v11, v13

    .line 309
    .line 310
    if-eqz v0, :cond_e

    .line 311
    .line 312
    const/4 v2, 0x1

    .line 313
    :cond_e
    or-int/2addr v9, v2

    .line 314
    :try_start_3
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 315
    .line 316
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 317
    .line 318
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 319
    .line 320
    const/4 v8, 0x1

    .line 321
    move-object v4, v2

    .line 322
    move-wide v6, v5

    .line 323
    move-object v3, v10

    .line 324
    move-object v5, v0

    .line 325
    :try_start_4
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/o0;->i2(Lq2/Y;LM2/D$b;Lq2/Y;LM2/D$b;JZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 326
    .line 327
    .line 328
    move-object v2, v3

    .line 329
    move-wide v5, v6

    .line 330
    move-wide v3, v13

    .line 331
    :goto_c
    const/4 v10, 0x2

    .line 332
    move-wide v7, v3

    .line 333
    move-object/from16 v1, p0

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :catchall_2
    move-exception v0

    .line 337
    move-object v2, v3

    .line 338
    move-wide v5, v6

    .line 339
    :goto_d
    move-wide v3, v13

    .line 340
    goto :goto_e

    .line 341
    :catchall_3
    move-exception v0

    .line 342
    move-object v2, v10

    .line 343
    goto :goto_d

    .line 344
    :goto_e
    const/4 v10, 0x2

    .line 345
    move-wide v7, v3

    .line 346
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iput-object v2, v1, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 351
    .line 352
    throw v0
.end method

.method private e2()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/K0;->m:I

    .line 8
    .line 9
    invoke-direct {p0, v1, v2, v0}, Landroidx/media3/exoplayer/o0;->f2(ZII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;
    .locals 13

    .line 1
    move-wide/from16 v4, p4

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->z0:Z

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 8
    .line 9
    iget-wide v0, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 10
    .line 11
    cmp-long v0, p2, v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->z0:Z

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T0()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 35
    .line 36
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->h:LM2/n0;

    .line 37
    .line 38
    iget-object v2, v0, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroidx/media3/exoplayer/J0;->t()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    sget-object v1, LM2/n0;->d:LM2/n0;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->o()LM2/n0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_2
    if-nez v0, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->e:LP2/H;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_3
    iget-object v3, v2, LP2/H;->c:[LP2/A;

    .line 75
    .line 76
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/o0;->K([LP2/A;)LP9/u;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-object v6, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 83
    .line 84
    iget-wide v7, v6, Landroidx/media3/exoplayer/s0;->c:J

    .line 85
    .line 86
    cmp-long v7, v7, v4

    .line 87
    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    invoke-virtual {v6, v4, v5}, Landroidx/media3/exoplayer/s0;->a(J)Landroidx/media3/exoplayer/s0;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iput-object v6, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 95
    .line 96
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->w0()V

    .line 97
    .line 98
    .line 99
    move-object v10, v1

    .line 100
    move-object v11, v2

    .line 101
    move-object v12, v3

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 104
    .line 105
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    sget-object v1, LM2/n0;->d:LM2/n0;

    .line 114
    .line 115
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->e:LP2/H;

    .line 116
    .line 117
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_6
    move-object v12, v0

    .line 122
    move-object v10, v1

    .line 123
    move-object v11, v2

    .line 124
    :goto_4
    if-eqz p8, :cond_7

    .line 125
    .line 126
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 127
    .line 128
    move/from16 v1, p9

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->d(I)V

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 134
    .line 135
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T()J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    move-object v1, p1

    .line 140
    move-wide v2, p2

    .line 141
    move-wide/from16 v6, p6

    .line 142
    .line 143
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/K0;->d(LM2/D$b;JJJJLM2/n0;LP2/H;Ljava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

.method private f1(LM2/D$b;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :goto_0
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-wide v3, p2

    .line 19
    move v6, p4

    .line 20
    move v5, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/o0;->g1(LM2/D$b;JZZ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method private f2(ZII)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 4
    .line 5
    iget v1, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/g;->n(ZI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/o0;->g2(ZIII)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private g0()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v1, v4, :cond_2

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Landroidx/media3/exoplayer/P0;->o(Landroidx/media3/exoplayer/r0;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 v0, 0x1

    .line 32
    return v0
.end method

.method private g1(LM2/D$b;JZZ)J
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->X1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/o0;->k2(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 13
    .line 14
    iget p5, p5, Landroidx/media3/exoplayer/K0;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/o0;->J1(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 23
    .line 24
    invoke-virtual {p5}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    move-object v3, p5

    .line 29
    :goto_0
    if-eqz v3, :cond_3

    .line 30
    .line 31
    iget-object v4, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 32
    .line 33
    iget-object v4, v4, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 34
    .line 35
    invoke-virtual {p1, v4}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v3}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 48
    .line 49
    if-ne p5, v3, :cond_4

    .line 50
    .line 51
    if-eqz v3, :cond_6

    .line 52
    .line 53
    invoke-virtual {v3, p2, p3}, Landroidx/media3/exoplayer/r0;->D(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p4

    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    cmp-long p1, p4, v4

    .line 60
    .line 61
    if-gez p1, :cond_6

    .line 62
    .line 63
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->E()V

    .line 64
    .line 65
    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eq p1, v3, :cond_5

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->b()Landroidx/media3/exoplayer/r0;

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 85
    .line 86
    .line 87
    const-wide p4, 0xe8d4a51000L

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p4, p5}, Landroidx/media3/exoplayer/r0;->B(J)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->H()V

    .line 96
    .line 97
    .line 98
    iput-boolean v1, v3, Landroidx/media3/exoplayer/r0;->i:Z

    .line 99
    .line 100
    :cond_6
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 101
    .line 102
    .line 103
    if-eqz v3, :cond_9

    .line 104
    .line 105
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 108
    .line 109
    .line 110
    iget-boolean p1, v3, Landroidx/media3/exoplayer/r0;->f:Z

    .line 111
    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    iget-object p1, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 115
    .line 116
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/s0;->b(J)Landroidx/media3/exoplayer/s0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, v3, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    iget-boolean p1, v3, Landroidx/media3/exoplayer/r0;->g:Z

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    iget-object p1, v3, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 128
    .line 129
    invoke-interface {p1, p2, p3}, LM2/C;->i(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide p2

    .line 133
    iget-object p1, v3, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 134
    .line 135
    iget-wide p4, p0, Landroidx/media3/exoplayer/o0;->m:J

    .line 136
    .line 137
    sub-long p4, p2, p4

    .line 138
    .line 139
    iget-boolean v1, p0, Landroidx/media3/exoplayer/o0;->n:Z

    .line 140
    .line 141
    invoke-interface {p1, p4, p5, v1}, LM2/C;->u(JZ)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_3
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->g()V

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 157
    .line 158
    .line 159
    :goto_4
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 163
    .line 164
    invoke-interface {p1, v2}, Lt2/s;->j(I)Z

    .line 165
    .line 166
    .line 167
    return-wide p2
.end method

.method private g2(ZIII)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    if-eq p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p1, v0

    .line 10
    :goto_0
    invoke-static {p2, p4}, Landroidx/media3/exoplayer/o0;->d2(II)I

    .line 11
    .line 12
    .line 13
    move-result p4

    .line 14
    invoke-static {p2, p3}, Landroidx/media3/exoplayer/o0;->j2(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    iget-boolean v1, p3, Landroidx/media3/exoplayer/K0;->l:Z

    .line 21
    .line 22
    if-ne v1, p1, :cond_1

    .line 23
    .line 24
    iget v1, p3, Landroidx/media3/exoplayer/K0;->n:I

    .line 25
    .line 26
    if-ne v1, p2, :cond_1

    .line 27
    .line 28
    iget v1, p3, Landroidx/media3/exoplayer/K0;->m:I

    .line 29
    .line 30
    if-ne v1, p4, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p3, p1, p4, p2}, Landroidx/media3/exoplayer/K0;->e(ZII)Landroidx/media3/exoplayer/K0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 38
    .line 39
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/o0;->k2(ZZ)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->G0(Z)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->X1()V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->h2()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 58
    .line 59
    iget-boolean p2, p1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->i(Z)Landroidx/media3/exoplayer/K0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 68
    .line 69
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 70
    .line 71
    iget-wide p2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 72
    .line 73
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/u0;->K(J)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 78
    .line 79
    iget p1, p1, Landroidx/media3/exoplayer/K0;->e:I

    .line 80
    .line 81
    const/4 p2, 0x3

    .line 82
    const/4 p3, 0x2

    .line 83
    if-ne p1, p2, :cond_4

    .line 84
    .line 85
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/media3/exoplayer/k;->g()V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->U1()V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 94
    .line 95
    invoke-interface {p1, p3}, Lt2/s;->j(I)Z

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    if-ne p1, p3, :cond_5

    .line 100
    .line 101
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 102
    .line 103
    invoke-interface {p1, p3}, Lt2/s;->j(I)Z

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_1
    return-void
.end method

.method private h0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->F:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 10
    .line 11
    iget-boolean v0, v0, LA2/P;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method private h1(Landroidx/media3/exoplayer/L0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->i1(Landroidx/media3/exoplayer/L0;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 21
    .line 22
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Landroidx/media3/exoplayer/o0$d;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/o0$d;-><init>(Landroidx/media3/exoplayer/L0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance v2, Landroidx/media3/exoplayer/o0$d;

    .line 40
    .line 41
    invoke-direct {v2, p1}, Landroidx/media3/exoplayer/o0$d;-><init>(Landroidx/media3/exoplayer/L0;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 45
    .line 46
    iget-object v3, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 47
    .line 48
    iget v5, p0, Landroidx/media3/exoplayer/o0;->p0:I

    .line 49
    .line 50
    iget-boolean v6, p0, Landroidx/media3/exoplayer/o0;->q0:Z

    .line 51
    .line 52
    iget-object v7, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 53
    .line 54
    iget-object v8, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 55
    .line 56
    move-object v4, v3

    .line 57
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/o0;->W0(Landroidx/media3/exoplayer/o0$d;Lq2/Y;Lq2/Y;IZLq2/Y$d;Lq2/Y$b;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private h2()V
    .locals 13

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, Landroidx/media3/exoplayer/r0;->f:Z

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 21
    .line 22
    invoke-interface {v2}, LM2/C;->k()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v5, v3

    .line 28
    :goto_0
    cmp-long v2, v5, v3

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->s()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-direct {p0, v5, v6}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 54
    .line 55
    iget-wide v1, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 56
    .line 57
    cmp-long v1, v5, v1

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 64
    .line 65
    iget-wide v3, v1, Landroidx/media3/exoplayer/K0;->c:J

    .line 66
    .line 67
    const/4 v8, 0x1

    .line 68
    const/4 v9, 0x5

    .line 69
    move-object v1, v2

    .line 70
    move-wide v11, v5

    .line 71
    move-wide v4, v3

    .line 72
    move-wide v2, v11

    .line 73
    move-wide v6, v2

    .line 74
    move-object v0, p0

    .line 75
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const/4 v4, 0x1

    .line 91
    if-eq v1, v3, :cond_4

    .line 92
    .line 93
    move v3, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v3, v10

    .line 96
    :goto_1
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/k;->i(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    iput-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 107
    .line 108
    iget-wide v5, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 109
    .line 110
    invoke-direct {p0, v5, v6, v2, v3}, Landroidx/media3/exoplayer/o0;->u0(JJ)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->u()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 122
    .line 123
    iget-boolean v1, v1, Landroidx/media3/exoplayer/o0$e;->d:Z

    .line 124
    .line 125
    xor-int/lit8 v8, v1, 0x1

    .line 126
    .line 127
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 128
    .line 129
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 130
    .line 131
    iget-wide v5, v1, Landroidx/media3/exoplayer/K0;->c:J

    .line 132
    .line 133
    const/4 v9, 0x6

    .line 134
    move-object v1, v4

    .line 135
    move-wide v4, v5

    .line 136
    move-wide v6, v2

    .line 137
    move-object v0, p0

    .line 138
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iput-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 146
    .line 147
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/K0;->o(J)V

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 151
    .line 152
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/media3/exoplayer/r0;->j()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    iput-wide v3, v2, Landroidx/media3/exoplayer/K0;->q:J

    .line 163
    .line 164
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 165
    .line 166
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T()J

    .line 167
    .line 168
    .line 169
    move-result-wide v2

    .line 170
    iput-wide v2, v1, Landroidx/media3/exoplayer/K0;->r:J

    .line 171
    .line 172
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 173
    .line 174
    iget-boolean v2, v1, Landroidx/media3/exoplayer/K0;->l:Z

    .line 175
    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    iget v2, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 179
    .line 180
    const/4 v3, 0x3

    .line 181
    if-ne v2, v3, :cond_7

    .line 182
    .line 183
    iget-object v2, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 184
    .line 185
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 186
    .line 187
    invoke-direct {p0, v2, v1}, Landroidx/media3/exoplayer/o0;->T1(Lq2/Y;LM2/D$b;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 194
    .line 195
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 196
    .line 197
    iget v1, v1, Lq2/O;->a:F

    .line 198
    .line 199
    const/high16 v2, 0x3f800000    # 1.0f

    .line 200
    .line 201
    cmpl-float v1, v1, v2

    .line 202
    .line 203
    if-nez v1, :cond_7

    .line 204
    .line 205
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 206
    .line 207
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->L()J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 212
    .line 213
    iget-wide v4, v4, Landroidx/media3/exoplayer/K0;->r:J

    .line 214
    .line 215
    invoke-interface {v1, v2, v3, v4, v5}, LA2/K;->b(JJ)F

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget v2, v2, Lq2/O;->a:F

    .line 226
    .line 227
    cmpl-float v2, v2, v1

    .line 228
    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 232
    .line 233
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 234
    .line 235
    invoke-virtual {v2, v1}, Lq2/O;->d(F)Lq2/O;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/o0;->o1(Lq2/O;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 243
    .line 244
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 245
    .line 246
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    iget v2, v2, Lq2/O;->a:F

    .line 253
    .line 254
    invoke-direct {p0, v1, v2, v10, v10}, Landroidx/media3/exoplayer/o0;->d0(Lq2/O;FZZ)V

    .line 255
    .line 256
    .line 257
    :cond_7
    :goto_3
    return-void
.end method

.method private static i0(ZLM2/D$b;JLM2/D$b;Lq2/Y$b;J)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_3

    .line 3
    .line 4
    cmp-long p0, p2, p6

    .line 5
    .line 6
    if-nez p0, :cond_3

    .line 7
    .line 8
    iget-object p0, p1, LM2/D$b;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p2, p4, LM2/D$b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, LM2/D$b;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p2, 0x1

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iget p0, p1, LM2/D$b;->b:I

    .line 27
    .line 28
    invoke-virtual {p5, p0}, Lq2/Y$b;->s(I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    iget p0, p1, LM2/D$b;->b:I

    .line 35
    .line 36
    iget p3, p1, LM2/D$b;->c:I

    .line 37
    .line 38
    invoke-virtual {p5, p0, p3}, Lq2/Y$b;->i(II)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p3, 0x4

    .line 43
    if-eq p0, p3, :cond_1

    .line 44
    .line 45
    iget p0, p1, LM2/D$b;->b:I

    .line 46
    .line 47
    iget p1, p1, LM2/D$b;->c:I

    .line 48
    .line 49
    invoke-virtual {p5, p0, p1}, Lq2/Y$b;->i(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 p1, 0x2

    .line 54
    if-eq p0, p1, :cond_1

    .line 55
    .line 56
    return p2

    .line 57
    :cond_1
    return v0

    .line 58
    :cond_2
    invoke-virtual {p4}, LM2/D$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    iget p0, p4, LM2/D$b;->b:I

    .line 65
    .line 66
    invoke-virtual {p5, p0}, Lq2/Y$b;->s(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    return p2

    .line 73
    :cond_3
    :goto_0
    return v0
.end method

.method private i1(Landroidx/media3/exoplayer/L0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->b()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->B(Landroidx/media3/exoplayer/L0;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 13
    .line 14
    iget p1, p1, Landroidx/media3/exoplayer/K0;->e:I

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lt2/s;->j(I)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 31
    .line 32
    const/16 v1, 0xf

    .line 33
    .line 34
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private i2(Lq2/Y;LM2/D$b;Lq2/Y;LM2/D$b;JZ)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/o0;->T1(Lq2/Y;LM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, LM2/D$b;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lq2/O;->d:Lq2/O;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2, p1}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_4

    .line 31
    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->o1(Lq2/O;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 36
    .line 37
    iget-object p2, p2, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 38
    .line 39
    iget p1, p1, Lq2/O;->a:F

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-direct {p0, p2, p1, p3, p3}, Landroidx/media3/exoplayer/o0;->d0(Lq2/O;FZZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object v0, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, Lq2/Y$b;->c:I

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 64
    .line 65
    iget-object v1, v1, Lq2/Y$d;->j:Lq2/C$g;

    .line 66
    .line 67
    invoke-static {v1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lq2/C$g;

    .line 72
    .line 73
    invoke-interface {v0, v1}, LA2/K;->a(Lq2/C$g;)V

    .line 74
    .line 75
    .line 76
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmp-long v2, p5, v0

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 86
    .line 87
    iget-object p2, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {p0, p1, p2, p5, p6}, Landroidx/media3/exoplayer/o0;->N(Lq2/Y;Ljava/lang/Object;J)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    invoke-interface {p3, p1, p2}, LA2/K;->e(J)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 98
    .line 99
    iget-object p1, p1, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p3}, Lq2/Y;->u()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_3

    .line 106
    .line 107
    iget-object p2, p4, LM2/D$b;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object p4, p0, Landroidx/media3/exoplayer/o0;->l:Lq2/Y$b;

    .line 110
    .line 111
    invoke-virtual {p3, p2, p4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget p2, p2, Lq2/Y$b;->c:I

    .line 116
    .line 117
    iget-object p4, p0, Landroidx/media3/exoplayer/o0;->k:Lq2/Y$d;

    .line 118
    .line 119
    invoke-virtual {p3, p2, p4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iget-object p2, p2, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 p2, 0x0

    .line 127
    :goto_1
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_5

    .line 132
    .line 133
    if-eqz p7, :cond_4

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    return-void

    .line 137
    :cond_5
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->u:LA2/K;

    .line 138
    .line 139
    invoke-interface {p1, v0, v1}, LA2/K;->e(J)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method private j0(Landroidx/media3/exoplayer/r0;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/media3/exoplayer/r0;->l()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/high16 v2, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private j1(Landroidx/media3/exoplayer/L0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/L0;->b()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v0, "TAG"

    .line 16
    .line 17
    const-string v1, "Trying to send message on a dead thread."

    .line 18
    .line 19
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v1, v0, v2}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Landroidx/media3/exoplayer/l0;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1}, Landroidx/media3/exoplayer/l0;-><init>(Landroidx/media3/exoplayer/o0;Landroidx/media3/exoplayer/L0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Lt2/s;->i(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private static j2(II)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-ne p1, v0, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    return p1
.end method

.method public static synthetic k(Landroidx/media3/exoplayer/o0;Landroidx/media3/exoplayer/s0;J)Landroidx/media3/exoplayer/r0;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/o0;->A(Landroidx/media3/exoplayer/s0;J)Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private k0(ILM2/D$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 27
    .line 28
    aget-object p1, p2, p1

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/P0;->v(Landroidx/media3/exoplayer/r0;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method private k1(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Landroidx/media3/exoplayer/P0;->N(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private k2(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->m0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 8
    .line 9
    invoke-interface {p1}, Lt2/j;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic l(Landroidx/media3/exoplayer/o0;IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->y:LB2/a;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-interface {v0, p1, p0, p2}, LB2/a;->h0(IIZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private l0()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 8
    .line 9
    iget-wide v1, v1, Landroidx/media3/exoplayer/s0;->e:J

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 25
    .line 26
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 27
    .line 28
    cmp-long v0, v3, v1

    .line 29
    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R1()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private l2()Z
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    move v7, v1

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget-object v5, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 16
    .line 17
    array-length v6, v5

    .line 18
    if-ge v4, v6, :cond_2

    .line 19
    .line 20
    aget-object v5, v5, v4

    .line 21
    .line 22
    invoke-virtual {v5}, Landroidx/media3/exoplayer/P0;->h()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iget-object v6, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 27
    .line 28
    aget-object v6, v6, v4

    .line 29
    .line 30
    iget-object v8, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 31
    .line 32
    invoke-virtual {v6, v2, v0, v8}, Landroidx/media3/exoplayer/P0;->J(Landroidx/media3/exoplayer/r0;LP2/H;Landroidx/media3/exoplayer/k;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    and-int/lit8 v8, v6, 0x2

    .line 37
    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    iget-boolean v8, p0, Landroidx/media3/exoplayer/o0;->t0:Z

    .line 41
    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/o0;->r1(Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget v8, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 48
    .line 49
    iget-object v9, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 50
    .line 51
    aget-object v9, v9, v4

    .line 52
    .line 53
    invoke-virtual {v9}, Landroidx/media3/exoplayer/P0;->h()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    sub-int/2addr v5, v9

    .line 58
    sub-int/2addr v8, v5

    .line 59
    iput v8, p0, Landroidx/media3/exoplayer/o0;->u0:I

    .line 60
    .line 61
    and-int/lit8 v5, v6, 0x1

    .line 62
    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    move v5, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v5, v3

    .line 68
    :goto_1
    and-int/2addr v7, v5

    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-eqz v7, :cond_4

    .line 73
    .line 74
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 75
    .line 76
    array-length v1, v1

    .line 77
    if-ge v3, v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v3}, LP2/H;->c(I)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 86
    .line 87
    aget-object v1, v1, v3

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/P0;->x(Landroidx/media3/exoplayer/r0;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->n()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    move-object v1, p0

    .line 101
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/o0;->G(Landroidx/media3/exoplayer/r0;IZJ)V

    .line 102
    .line 103
    .line 104
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    return v7
.end method

.method private static m0(Landroidx/media3/exoplayer/K0;Lq2/Y$b;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {p0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, LM2/D$b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-boolean p0, p0, Lq2/Y$b;->f:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method private m1(Lq2/c;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->d:LP2/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP2/G;->l(Lq2/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->B:Landroidx/media3/exoplayer/g;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/g;->k(Lq2/c;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->e2()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private m2(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LP2/H;->c:[LP2/A;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, LP2/A;->h(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private n0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->Q1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->o0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/media3/exoplayer/r0;

    .line 20
    .line 21
    new-instance v1, Landroidx/media3/exoplayer/q0$b;

    .line 22
    .line 23
    invoke-direct {v1}, Landroidx/media3/exoplayer/q0$b;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0$b;->f(J)Landroidx/media3/exoplayer/q0$b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget v2, v2, Lq2/O;->a:F

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/q0$b;->g(F)Landroidx/media3/exoplayer/q0$b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 49
    .line 50
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0$b;->e(J)Landroidx/media3/exoplayer/q0$b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0$b;->d()Landroidx/media3/exoplayer/q0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/r0;->e(Landroidx/media3/exoplayer/q0;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->Y1()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private n1(ZLt2/m;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->r0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->r0:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/media3/exoplayer/P0;->L()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Lt2/m;->f()Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public static synthetic o(Landroidx/media3/exoplayer/o0;LS2/u;JJLq2/x;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface/range {p1 .. p7}, LS2/u;->h(JJLq2/x;Landroid/media/MediaFormat;)V

    .line 5
    .line 6
    .line 7
    move-wide p1, p2

    .line 8
    move-wide p3, p4

    .line 9
    move-object p5, p6

    .line 10
    move-object p6, p7

    .line 11
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/o0;->h(JJLq2/x;Landroid/media/MediaFormat;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private o0()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->I()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->w()Landroidx/media3/exoplayer/r0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-boolean v1, v0, Landroidx/media3/exoplayer/r0;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-boolean v1, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 19
    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 23
    .line 24
    invoke-interface {v1}, LM2/C;->q()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_4

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->f:Landroidx/media3/exoplayer/p0;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 33
    .line 34
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 35
    .line 36
    iget-object v3, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 39
    .line 40
    iget-boolean v4, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 45
    .line 46
    invoke-interface {v4}, LM2/C;->f()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    :goto_0
    invoke-interface {v1, v2, v3, v4, v5}, Landroidx/media3/exoplayer/p0;->c(Lq2/Y;LM2/D$b;J)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-boolean v1, v0, Landroidx/media3/exoplayer/r0;->e:Z

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    iget-object v1, v0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 65
    .line 66
    iget-wide v1, v1, Landroidx/media3/exoplayer/s0;->b:J

    .line 67
    .line 68
    invoke-virtual {v0, p0, v1, v2}, Landroidx/media3/exoplayer/r0;->v(LM2/C$a;J)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance v1, Landroidx/media3/exoplayer/q0$b;

    .line 73
    .line 74
    invoke-direct {v1}, Landroidx/media3/exoplayer/q0$b;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 78
    .line 79
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0$b;->f(J)Landroidx/media3/exoplayer/q0$b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget v2, v2, Lq2/O;->a:F

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/q0$b;->g(F)Landroidx/media3/exoplayer/q0$b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->n0:J

    .line 100
    .line 101
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0$b;->e(J)Landroidx/media3/exoplayer/q0$b;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0$b;->d()Landroidx/media3/exoplayer/q0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/r0;->e(Landroidx/media3/exoplayer/q0;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_1
    return-void
.end method

.method private o1(Lq2/O;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lt2/s;->l(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/k;->e(Lq2/O;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic p(Landroidx/media3/exoplayer/o0;Landroidx/media3/exoplayer/L0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->B(Landroidx/media3/exoplayer/L0;)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p0

    .line 9
    const-string p1, "ExoPlayerImplInternal"

    .line 10
    .line 11
    const-string v0, "Unexpected error delivering message on external thread."

    .line 12
    .line 13
    invoke-static {p1, v0, p0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method private p0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/P0;->D()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private p1(Landroidx/media3/exoplayer/o0$b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->a(Landroidx/media3/exoplayer/o0$b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroidx/media3/exoplayer/o0$h;

    .line 15
    .line 16
    new-instance v1, Landroidx/media3/exoplayer/M0;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->b(Landroidx/media3/exoplayer/o0$b;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->c(Landroidx/media3/exoplayer/o0$b;)LM2/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/M0;-><init>(Ljava/util/Collection;LM2/e0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->a(Landroidx/media3/exoplayer/o0$b;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->d(Landroidx/media3/exoplayer/o0$b;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/o0$h;-><init>(Lq2/Y;IJ)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->v0:Landroidx/media3/exoplayer/o0$h;

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->b(Landroidx/media3/exoplayer/o0$b;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->c(Landroidx/media3/exoplayer/o0$b;)LM2/e0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/J0;->C(Ljava/util/List;LM2/e0;)Lq2/Y;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method static synthetic q(Landroidx/media3/exoplayer/o0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->s0:Z

    .line 2
    .line 3
    return p1
.end method

.method private q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->c(Landroidx/media3/exoplayer/K0;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/exoplayer/o0$e;->a(Landroidx/media3/exoplayer/o0$e;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->r:Landroidx/media3/exoplayer/o0$f;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/o0$f;->a(Landroidx/media3/exoplayer/o0$e;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroidx/media3/exoplayer/o0$e;

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/o0$e;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method static synthetic r(Landroidx/media3/exoplayer/o0;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private r0()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v7, 0x0

    .line 16
    move v3, v7

    .line 17
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 18
    .line 19
    array-length v1, v1

    .line 20
    if-ge v3, v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, v3}, LP2/H;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 29
    .line 30
    aget-object v1, v1, v3

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/media3/exoplayer/P0;->s()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 39
    .line 40
    aget-object v1, v1, v3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 49
    .line 50
    aget-object v1, v1, v3

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/media3/exoplayer/P0;->X()V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->n()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    move-object v1, p0

    .line 61
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/o0;->G(Landroidx/media3/exoplayer/r0;IZJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object v1, p0

    .line 66
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v1, p0

    .line 70
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, v2, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 77
    .line 78
    invoke-interface {v0}, LM2/C;->k()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iput-wide v3, v1, Landroidx/media3/exoplayer/o0;->F0:J

    .line 83
    .line 84
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->s()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    iget-object v0, v1, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v7}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_2
    return-void
.end method

.method private r1(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->t0:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->t0:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 11
    .line 12
    iget-boolean p1, p1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-interface {p1, v0}, Lt2/s;->j(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic s(Landroidx/media3/exoplayer/o0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/o0;->t0:Z

    .line 2
    .line 3
    return p0
.end method

.method private s0(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroidx/media3/exoplayer/r0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/P0;->G(Landroidx/media3/exoplayer/r0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v1

    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception v1

    .line 24
    :goto_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/P0;->m()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x3

    .line 29
    if-eq v0, v2, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    if-ne v0, v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    throw v1

    .line 36
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "Disabling track due to error: "

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, LP2/H;->c:[LP2/A;

    .line 57
    .line 58
    aget-object v3, v3, p1

    .line 59
    .line 60
    invoke-interface {v3}, LP2/A;->q()Lq2/x;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lq2/x;->l(Lq2/x;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "ExoPlayerImplInternal"

    .line 76
    .line 77
    invoke-static {v3, v2, v1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, LP2/H;

    .line 81
    .line 82
    iget-object v2, v0, LP2/H;->b:[LA2/N;

    .line 83
    .line 84
    invoke-virtual {v2}, [LA2/N;->clone()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, [LA2/N;

    .line 89
    .line 90
    iget-object v3, v0, LP2/H;->c:[LP2/A;

    .line 91
    .line 92
    invoke-virtual {v3}, [LP2/A;->clone()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, [LP2/A;

    .line 97
    .line 98
    iget-object v4, v0, LP2/H;->d:Lq2/h0;

    .line 99
    .line 100
    iget-object v0, v0, LP2/H;->e:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-direct {v1, v2, v3, v4, v0}, LP2/H;-><init>([LA2/N;[LP2/A;Lq2/h0;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v1, LP2/H;->b:[LA2/N;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    aput-object v2, v0, p1

    .line 109
    .line 110
    iget-object v0, v1, LP2/H;->c:[LP2/A;

    .line 111
    .line 112
    aput-object v2, v0, p1

    .line 113
    .line 114
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->D(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 118
    .line 119
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 124
    .line 125
    iget-wide v2, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {p1, v1, v2, v3, v0}, Landroidx/media3/exoplayer/r0;->a(LP2/H;JZ)J

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private s1(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/o0;->Z:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T0()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->d1(Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method static synthetic t(Landroidx/media3/exoplayer/o0;)Lt2/s;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    return-object p0
.end method

.method private t0(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->c:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->z:Lt2/s;

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/k0;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, Landroidx/media3/exoplayer/k0;-><init>(Landroidx/media3/exoplayer/o0;IZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lt2/s;->i(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private u(Landroidx/media3/exoplayer/o0$b;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->t:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/exoplayer/J0;->r()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_0
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->b(Landroidx/media3/exoplayer/o0$b;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Landroidx/media3/exoplayer/o0$b;->c(Landroidx/media3/exoplayer/o0$b;)LM2/e0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p2, v1, p1}, Landroidx/media3/exoplayer/J0;->f(ILjava/util/List;LM2/e0;)Lq2/Y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/o0;->b0(Lq2/Y;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private u0(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 12
    .line 13
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->z0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    sub-long/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->z0:Z

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 36
    .line 37
    iget-object v0, v0, LM2/D$b;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Landroidx/media3/exoplayer/o0;->y0:I

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 59
    .line 60
    add-int/lit8 v4, v1, -0x1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Landroidx/media3/exoplayer/o0$d;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v3, v2

    .line 70
    :goto_0
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget v4, v3, Landroidx/media3/exoplayer/o0$d;->b:I

    .line 73
    .line 74
    if-gt v4, v0, :cond_3

    .line 75
    .line 76
    if-ne v4, v0, :cond_5

    .line 77
    .line 78
    iget-wide v3, v3, Landroidx/media3/exoplayer/o0$d;->c:J

    .line 79
    .line 80
    cmp-long v3, v3, p1

    .line 81
    .line 82
    if-lez v3, :cond_5

    .line 83
    .line 84
    :cond_3
    add-int/lit8 v3, v1, -0x1

    .line 85
    .line 86
    if-lez v3, :cond_4

    .line 87
    .line 88
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 89
    .line 90
    add-int/lit8 v1, v1, -0x2

    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Landroidx/media3/exoplayer/o0$d;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object v1, v2

    .line 100
    :goto_1
    move v7, v3

    .line 101
    move-object v3, v1

    .line 102
    move v1, v7

    .line 103
    goto :goto_0

    .line 104
    :cond_5
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-ge v1, v3, :cond_6

    .line 111
    .line 112
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Landroidx/media3/exoplayer/o0$d;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move-object v3, v2

    .line 122
    :goto_2
    if-eqz v3, :cond_8

    .line 123
    .line 124
    iget-object v4, v3, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    iget v4, v3, Landroidx/media3/exoplayer/o0$d;->b:I

    .line 129
    .line 130
    if-lt v4, v0, :cond_7

    .line 131
    .line 132
    if-ne v4, v0, :cond_8

    .line 133
    .line 134
    iget-wide v4, v3, Landroidx/media3/exoplayer/o0$d;->c:J

    .line 135
    .line 136
    cmp-long v4, v4, p1

    .line 137
    .line 138
    if-gtz v4, :cond_8

    .line 139
    .line 140
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ge v1, v3, :cond_6

    .line 149
    .line 150
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Landroidx/media3/exoplayer/o0$d;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_8
    :goto_3
    if-eqz v3, :cond_e

    .line 160
    .line 161
    iget-object v4, v3, Landroidx/media3/exoplayer/o0$d;->d:Ljava/lang/Object;

    .line 162
    .line 163
    if-eqz v4, :cond_e

    .line 164
    .line 165
    iget v4, v3, Landroidx/media3/exoplayer/o0$d;->b:I

    .line 166
    .line 167
    if-ne v4, v0, :cond_e

    .line 168
    .line 169
    iget-wide v4, v3, Landroidx/media3/exoplayer/o0$d;->c:J

    .line 170
    .line 171
    cmp-long v6, v4, p1

    .line 172
    .line 173
    if-lez v6, :cond_e

    .line 174
    .line 175
    cmp-long v4, v4, p3

    .line 176
    .line 177
    if-gtz v4, :cond_e

    .line 178
    .line 179
    :try_start_0
    iget-object v4, v3, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 180
    .line 181
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/o0;->i1(Landroidx/media3/exoplayer/L0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    iget-object v4, v3, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 185
    .line 186
    invoke-virtual {v4}, Landroidx/media3/exoplayer/L0;->a()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_a

    .line 191
    .line 192
    iget-object v3, v3, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 193
    .line 194
    invoke-virtual {v3}, Landroidx/media3/exoplayer/L0;->i()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_9

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    :goto_4
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :goto_5
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-ge v1, v3, :cond_b

    .line 216
    .line 217
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Landroidx/media3/exoplayer/o0$d;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_b
    move-object v3, v2

    .line 227
    goto :goto_3

    .line 228
    :catchall_0
    move-exception p1

    .line 229
    iget-object p2, v3, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 230
    .line 231
    invoke-virtual {p2}, Landroidx/media3/exoplayer/L0;->a()Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-nez p2, :cond_c

    .line 236
    .line 237
    iget-object p2, v3, Landroidx/media3/exoplayer/o0$d;->a:Landroidx/media3/exoplayer/L0;

    .line 238
    .line 239
    invoke-virtual {p2}, Landroidx/media3/exoplayer/L0;->i()Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_d

    .line 244
    .line 245
    :cond_c
    iget-object p2, p0, Landroidx/media3/exoplayer/o0;->p:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_d
    throw p1

    .line 251
    :cond_e
    iput v1, p0, Landroidx/media3/exoplayer/o0;->y0:I

    .line 252
    .line 253
    :cond_f
    :goto_6
    return-void
.end method

.method private u1(ZIZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->X:Landroidx/media3/exoplayer/o0$e;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p4}, Landroidx/media3/exoplayer/o0;->f2(ZII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private v0()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/u0;->K(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->T()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 18
    .line 19
    iget-wide v2, p0, Landroidx/media3/exoplayer/o0;->w0:J

    .line 20
    .line 21
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v4}, Landroidx/media3/exoplayer/u0;->t(JLandroidx/media3/exoplayer/K0;)Landroidx/media3/exoplayer/s0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/u0;->h(Landroidx/media3/exoplayer/s0;)Landroidx/media3/exoplayer/r0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-boolean v3, v2, Landroidx/media3/exoplayer/r0;->e:Z

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 40
    .line 41
    invoke-virtual {v2, p0, v3, v4}, Landroidx/media3/exoplayer/r0;->v(LM2/C$a;J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-boolean v3, v2, Landroidx/media3/exoplayer/r0;->f:Z

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 50
    .line 51
    const/16 v4, 0x8

    .line 52
    .line 53
    iget-object v5, v2, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 54
    .line 55
    invoke-interface {v3, v4, v5}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Lt2/s$a;->a()V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 63
    .line 64
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-ne v3, v2, :cond_2

    .line 69
    .line 70
    iget-wide v2, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 71
    .line 72
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/o0;->U0(J)V

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    :cond_3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->o0:Z

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->n()Landroidx/media3/exoplayer/r0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->j0(Landroidx/media3/exoplayer/r0;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->o0:Z

    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->Y1()V

    .line 96
    .line 97
    .line 98
    return v1

    .line 99
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 100
    .line 101
    .line 102
    return v1
.end method

.method private w()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LP2/H;->c(I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/media3/exoplayer/P0;->f()V

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method private w0()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->p()LP2/H;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    move v2, v1

    .line 30
    move v3, v2

    .line 31
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 32
    .line 33
    array-length v4, v4

    .line 34
    const/4 v5, 0x1

    .line 35
    if-ge v2, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v2}, LP2/H;->c(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 44
    .line 45
    aget-object v4, v4, v2

    .line 46
    .line 47
    invoke-virtual {v4}, Landroidx/media3/exoplayer/P0;->m()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eq v4, v5, :cond_1

    .line 52
    .line 53
    move v0, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v4, v0, LP2/H;->b:[LA2/N;

    .line 56
    .line 57
    aget-object v4, v4, v2

    .line 58
    .line 59
    iget v4, v4, LA2/N;->a:I

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    move v3, v5

    .line 64
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move v0, v5

    .line 68
    :goto_1
    if-eqz v3, :cond_4

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    move v1, v5

    .line 73
    :cond_4
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/o0;->r1(Z)V

    .line 74
    .line 75
    .line 76
    :cond_5
    :goto_2
    return-void
.end method

.method private w1(Lq2/O;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->o1(Lq2/O;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->o:Landroidx/media3/exoplayer/k;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/media3/exoplayer/k;->c()Lq2/O;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/o0;->e0(Lq2/O;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private x()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-boolean v4, p0, Landroidx/media3/exoplayer/o0;->F:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->D:LA2/P;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_1
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/P0;->R(LA2/P;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method private x0()V
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->P1()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_4

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->q0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-boolean v0, p0, Landroidx/media3/exoplayer/o0;->G0:Z

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->b()Landroidx/media3/exoplayer/r0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/media3/exoplayer/r0;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 31
    .line 32
    iget-object v2, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v3, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 37
    .line 38
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x1

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 48
    .line 49
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 50
    .line 51
    iget v4, v2, LM2/D$b;->b:I

    .line 52
    .line 53
    const/4 v5, -0x1

    .line 54
    if-ne v4, v5, :cond_1

    .line 55
    .line 56
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 57
    .line 58
    iget-object v4, v4, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 59
    .line 60
    iget v6, v4, LM2/D$b;->b:I

    .line 61
    .line 62
    if-ne v6, v5, :cond_1

    .line 63
    .line 64
    iget v2, v2, LM2/D$b;->e:I

    .line 65
    .line 66
    iget v4, v4, LM2/D$b;->e:I

    .line 67
    .line 68
    if-eq v2, v4, :cond_1

    .line 69
    .line 70
    move v2, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v2, v0

    .line 73
    :goto_1
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 74
    .line 75
    iget-object v6, v4, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 76
    .line 77
    iget-wide v7, v4, Landroidx/media3/exoplayer/s0;->b:J

    .line 78
    .line 79
    iget-wide v9, v4, Landroidx/media3/exoplayer/s0;->c:J

    .line 80
    .line 81
    xor-int/lit8 v13, v2, 0x1

    .line 82
    .line 83
    const/4 v14, 0x0

    .line 84
    move-wide v11, v7

    .line 85
    move-object v5, p0

    .line 86
    invoke-direct/range {v5 .. v14}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iput-object v2, v5, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 91
    .line 92
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->T0()V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->h2()V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    iget-object v2, v5, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v1, v2, :cond_2

    .line 111
    .line 112
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->p0()V

    .line 113
    .line 114
    .line 115
    :cond_2
    iget-object v1, v5, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 116
    .line 117
    iget v1, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 118
    .line 119
    const/4 v2, 0x3

    .line 120
    if-ne v1, v2, :cond_3

    .line 121
    .line 122
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->U1()V

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->w()V

    .line 126
    .line 127
    .line 128
    move v1, v3

    .line 129
    goto :goto_0

    .line 130
    :cond_4
    move-object v5, p0

    .line 131
    return-void
.end method

.method private x1(Landroidx/media3/exoplayer/ExoPlayer$c;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->D0:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/u0;->V(Lq2/Y;Landroidx/media3/exoplayer/ExoPlayer$c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private y()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->a:[Landroidx/media3/exoplayer/P0;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    move v3, v1

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Landroidx/media3/exoplayer/P0;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
.end method

.method private y0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->D0:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/ExoPlayer$c;->a:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->E0:Lq2/Y;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lq2/Y;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/media3/exoplayer/o0;->E0:Lq2/Y;

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/u0;->B(Lq2/Y;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->o0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private z()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private z0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->l0:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->A:Z

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->G0:Z

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->y()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-boolean v0, v0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->c()Landroidx/media3/exoplayer/r0;

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->r0()V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_0
    return-void
.end method

.method private z1(I)V
    .locals 2

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/o0;->p0:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/u0;->X(Lq2/Y;I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int/lit8 v0, p1, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->d1(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/o0;->Z(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public A1(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x24

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public C1(LA2/P;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x26

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public E0(IIILM2/e0;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/o0$c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/o0$c;-><init>(IIILM2/e0;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 7
    .line 8
    const/16 p2, 0x13

    .line 9
    .line 10
    invoke-interface {p1, p2, v0}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public E1(LA2/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public G1(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lt2/s;->h(III)Lt2/s$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public I0(LM2/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public J(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/o0;->B0:J

    .line 2
    .line 3
    return-void
.end method

.method public J0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lt2/s;->b(I)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public L0()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->Y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-boolean v1, p0, Landroidx/media3/exoplayer/o0;->Y:Z

    .line 20
    .line 21
    new-instance v0, Lt2/m;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lt2/m;-><init>(Lt2/j;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-interface {v1, v2, v0}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Lt2/s$a;->a()V

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Landroidx/media3/exoplayer/o0;->v:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lt2/m;->c(J)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_1
    :goto_0
    return v1
.end method

.method public L1(Ljava/lang/Object;J)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->Y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lt2/m;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->q:Lt2/j;

    .line 22
    .line 23
    invoke-direct {v0, v2}, Lt2/m;-><init>(Lt2/j;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 27
    .line 28
    new-instance v3, Landroid/util/Pair;

    .line 29
    .line 30
    invoke-direct {v3, p1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/16 p1, 0x1e

    .line 34
    .line 35
    invoke-interface {v2, p1, v3}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 40
    .line 41
    .line 42
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long p1, p2, v2

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, p2, p3}, Lt2/m;->c(J)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_1
    :goto_0
    return v1
.end method

.method public N1(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public P0(IILM2/e0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2, p3}, Lt2/s;->d(IIILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public Q()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public V1()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-interface {v0, v1}, Lt2/s;->b(I)Lt2/s$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lt2/s$a;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public a(Landroidx/media3/exoplayer/N0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lt2/s;->j(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a2(IILjava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2, p3}, Lt2/s;->d(IIILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(LM2/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lt2/s;->j(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c1(Lq2/Y;IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/o0$h;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Landroidx/media3/exoplayer/o0$h;-><init>(Lq2/Y;IJ)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-interface {v0, p1, v1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-interface {v0, v1}, Lt2/s;->l(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lt2/s;->j(I)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f(F)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v0, 0x22

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lt2/s;->j(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lt2/s;->h(III)Lt2/s$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public h(JJLq2/x;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/o0;->G:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 6
    .line 7
    const/16 p2, 0x25

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lt2/s;->b(I)Lt2/s$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v11, "Playback error"

    .line 4
    .line 5
    const-string v12, "ExoPlayerImplInternal"

    .line 6
    .line 7
    const/16 v2, 0x3e8

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v13, 0x0

    .line 11
    const/4 v14, 0x1

    .line 12
    :try_start_0
    iget v4, v0, Landroid/os/Message;->what:I

    .line 13
    .line 14
    packed-switch v4, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    return v13

    .line 18
    :pswitch_1
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA2/P;

    .line 21
    .line 22
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->D1(LA2/P;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_f

    .line 26
    .line 27
    :catch_0
    move-exception v0

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :catch_1
    move-exception v0

    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :catch_2
    move-exception v0

    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :catch_3
    move-exception v0

    .line 37
    goto/16 :goto_8

    .line 38
    .line 39
    :catch_4
    move-exception v0

    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :catch_5
    move-exception v0

    .line 43
    goto/16 :goto_b

    .line 44
    .line 45
    :catch_6
    move-exception v0

    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :pswitch_2
    iput-boolean v13, p0, Landroidx/media3/exoplayer/o0;->G:Z

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 51
    .line 52
    if-eqz v0, :cond_14

    .line 53
    .line 54
    invoke-direct {p0, v0, v13}, Landroidx/media3/exoplayer/o0;->e1(Landroidx/media3/exoplayer/o0$h;Z)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->H:Landroidx/media3/exoplayer/o0$h;

    .line 59
    .line 60
    goto/16 :goto_f

    .line 61
    .line 62
    :pswitch_3
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->B1(Z)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_f

    .line 74
    .line 75
    :pswitch_4
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, LS2/u;

    .line 78
    .line 79
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->K1(LS2/u;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_f

    .line 83
    .line 84
    :pswitch_5
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->W()V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_f

    .line 88
    .line 89
    :pswitch_6
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 90
    .line 91
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->V(I)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_f

    .line 95
    .line 96
    :pswitch_7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Float;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->O1(F)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_f

    .line 108
    .line 109
    :pswitch_8
    iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Lq2/c;

    .line 112
    .line 113
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 114
    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    move v0, v14

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    move v0, v13

    .line 120
    :goto_0
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/o0;->m1(Lq2/c;Z)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_f

    .line 124
    .line 125
    :pswitch_9
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Landroid/util/Pair;

    .line 128
    .line 129
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lt2/m;

    .line 134
    .line 135
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/o0;->M1(Ljava/lang/Object;Lt2/m;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_f

    .line 139
    .line 140
    :pswitch_a
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->K0()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_f

    .line 144
    .line 145
    :pswitch_b
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 148
    .line 149
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->x1(Landroidx/media3/exoplayer/ExoPlayer$c;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_f

    .line 153
    .line 154
    :pswitch_c
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 155
    .line 156
    iget v5, v0, Landroid/os/Message;->arg2:I

    .line 157
    .line 158
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/util/List;

    .line 161
    .line 162
    invoke-direct {p0, v4, v5, v0}, Landroidx/media3/exoplayer/o0;->b2(IILjava/util/List;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_f

    .line 166
    .line 167
    :pswitch_d
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->R0()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_f

    .line 171
    .line 172
    :pswitch_e
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->z()V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_f

    .line 176
    .line 177
    :pswitch_f
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 178
    .line 179
    if-eqz v0, :cond_1

    .line 180
    .line 181
    move v0, v14

    .line 182
    goto :goto_1

    .line 183
    :cond_1
    move v0, v13

    .line 184
    :goto_1
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->s1(Z)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_f

    .line 188
    .line 189
    :pswitch_10
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->C0()V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_f

    .line 193
    .line 194
    :pswitch_11
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, LM2/e0;

    .line 197
    .line 198
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->I1(LM2/e0;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_f

    .line 202
    .line 203
    :pswitch_12
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 204
    .line 205
    iget v5, v0, Landroid/os/Message;->arg2:I

    .line 206
    .line 207
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, LM2/e0;

    .line 210
    .line 211
    invoke-direct {p0, v4, v5, v0}, Landroidx/media3/exoplayer/o0;->O0(IILM2/e0;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_f

    .line 215
    .line 216
    :pswitch_13
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Landroidx/media3/exoplayer/o0$c;

    .line 219
    .line 220
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->D0(Landroidx/media3/exoplayer/o0$c;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_f

    .line 224
    .line 225
    :pswitch_14
    iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v4, Landroidx/media3/exoplayer/o0$b;

    .line 228
    .line 229
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 230
    .line 231
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/o0;->u(Landroidx/media3/exoplayer/o0$b;I)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_f

    .line 235
    .line 236
    :pswitch_15
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Landroidx/media3/exoplayer/o0$b;

    .line 239
    .line 240
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->p1(Landroidx/media3/exoplayer/o0$b;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_f

    .line 244
    .line 245
    :pswitch_16
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Lq2/O;

    .line 248
    .line 249
    invoke-direct {p0, v0, v13}, Landroidx/media3/exoplayer/o0;->e0(Lq2/O;Z)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_f

    .line 253
    .line 254
    :pswitch_17
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Landroidx/media3/exoplayer/L0;

    .line 257
    .line 258
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->j1(Landroidx/media3/exoplayer/L0;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :pswitch_18
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Landroidx/media3/exoplayer/L0;

    .line 266
    .line 267
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->h1(Landroidx/media3/exoplayer/L0;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_f

    .line 271
    .line 272
    :pswitch_19
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 273
    .line 274
    if-eqz v4, :cond_2

    .line 275
    .line 276
    move v4, v14

    .line 277
    goto :goto_2

    .line 278
    :cond_2
    move v4, v13

    .line 279
    :goto_2
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lt2/m;

    .line 282
    .line 283
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/o0;->n1(ZLt2/m;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_f

    .line 287
    .line 288
    :pswitch_1a
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 289
    .line 290
    if-eqz v0, :cond_3

    .line 291
    .line 292
    move v0, v14

    .line 293
    goto :goto_3

    .line 294
    :cond_3
    move v0, v13

    .line 295
    :goto_3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->H1(Z)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_f

    .line 299
    .line 300
    :pswitch_1b
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 301
    .line 302
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->z1(I)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_f

    .line 306
    .line 307
    :pswitch_1c
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->Q0()V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_f

    .line 311
    .line 312
    :pswitch_1d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, LM2/C;

    .line 315
    .line 316
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->X(LM2/C;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_f

    .line 320
    .line 321
    :pswitch_1e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, LM2/C;

    .line 324
    .line 325
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->c0(LM2/C;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_f

    .line 329
    .line 330
    :pswitch_1f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Lt2/m;

    .line 333
    .line 334
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->M0(Lt2/m;)V

    .line 335
    .line 336
    .line 337
    return v14

    .line 338
    :pswitch_20
    invoke-direct {p0, v13, v14}, Landroidx/media3/exoplayer/o0;->W1(ZZ)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_f

    .line 342
    .line 343
    :pswitch_21
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, LA2/Q;

    .line 346
    .line 347
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->F1(LA2/Q;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_f

    .line 351
    .line 352
    :pswitch_22
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Lq2/O;

    .line 355
    .line 356
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/o0;->w1(Lq2/O;)V

    .line 357
    .line 358
    .line 359
    goto/16 :goto_f

    .line 360
    .line 361
    :pswitch_23
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Landroidx/media3/exoplayer/o0$h;

    .line 364
    .line 365
    invoke-direct {p0, v0, v14}, Landroidx/media3/exoplayer/o0;->e1(Landroidx/media3/exoplayer/o0$h;Z)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_f

    .line 369
    .line 370
    :pswitch_24
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->F()V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_f

    .line 374
    .line 375
    :pswitch_25
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 376
    .line 377
    if-eqz v4, :cond_4

    .line 378
    .line 379
    move v4, v14

    .line 380
    goto :goto_4

    .line 381
    :cond_4
    move v4, v13

    .line 382
    :goto_4
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 383
    .line 384
    shr-int/lit8 v5, v0, 0x4

    .line 385
    .line 386
    and-int/lit8 v0, v0, 0xf

    .line 387
    .line 388
    invoke-direct {p0, v4, v5, v14, v0}, Landroidx/media3/exoplayer/o0;->u1(ZIZI)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_0} :catch_6
    .catch LF2/m$a; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lq2/L; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lw2/l; {:try_start_0 .. :try_end_0} :catch_3
    .catch LM2/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 389
    .line 390
    .line 391
    goto/16 :goto_f

    .line 392
    .line 393
    :goto_5
    instance-of v3, v0, Ljava/lang/IllegalStateException;

    .line 394
    .line 395
    if-nez v3, :cond_5

    .line 396
    .line 397
    instance-of v3, v0, Ljava/lang/IllegalArgumentException;

    .line 398
    .line 399
    if-eqz v3, :cond_6

    .line 400
    .line 401
    :cond_5
    const/16 v2, 0x3ec

    .line 402
    .line 403
    :cond_6
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/s;->k(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v12, v11, v0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    invoke-direct {p0, v14, v13}, Landroidx/media3/exoplayer/o0;->W1(ZZ)V

    .line 411
    .line 412
    .line 413
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/K0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/K0;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 420
    .line 421
    goto/16 :goto_f

    .line 422
    .line 423
    :goto_6
    const/16 v2, 0x7d0

    .line 424
    .line 425
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/o0;->Y(Ljava/io/IOException;I)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_f

    .line 429
    .line 430
    :goto_7
    const/16 v2, 0x3ea

    .line 431
    .line 432
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/o0;->Y(Ljava/io/IOException;I)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_f

    .line 436
    .line 437
    :goto_8
    iget v2, v0, Lw2/l;->a:I

    .line 438
    .line 439
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/o0;->Y(Ljava/io/IOException;I)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_f

    .line 443
    .line 444
    :goto_9
    iget v4, v0, Lq2/L;->b:I

    .line 445
    .line 446
    if-ne v4, v14, :cond_8

    .line 447
    .line 448
    iget-boolean v2, v0, Lq2/L;->a:Z

    .line 449
    .line 450
    if-eqz v2, :cond_7

    .line 451
    .line 452
    const/16 v2, 0xbb9

    .line 453
    .line 454
    goto :goto_a

    .line 455
    :cond_7
    const/16 v2, 0xbbb

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :cond_8
    if-ne v4, v3, :cond_a

    .line 459
    .line 460
    iget-boolean v2, v0, Lq2/L;->a:Z

    .line 461
    .line 462
    if-eqz v2, :cond_9

    .line 463
    .line 464
    const/16 v2, 0xbba

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_9
    const/16 v2, 0xbbc

    .line 468
    .line 469
    :cond_a
    :goto_a
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/o0;->Y(Ljava/io/IOException;I)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_f

    .line 473
    .line 474
    :goto_b
    iget v2, v0, LF2/m$a;->a:I

    .line 475
    .line 476
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/o0;->Y(Ljava/io/IOException;I)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_f

    .line 480
    .line 481
    :goto_c
    iget v2, v0, Landroidx/media3/exoplayer/s;->j:I

    .line 482
    .line 483
    if-ne v2, v14, :cond_b

    .line 484
    .line 485
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 486
    .line 487
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-eqz v2, :cond_b

    .line 492
    .line 493
    iget-object v4, v0, Landroidx/media3/exoplayer/s;->o:LM2/D$b;

    .line 494
    .line 495
    if-nez v4, :cond_b

    .line 496
    .line 497
    iget-object v2, v2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 498
    .line 499
    iget-object v2, v2, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 500
    .line 501
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/s;->h(LM2/D$b;)Landroidx/media3/exoplayer/s;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    :cond_b
    iget v2, v0, Landroidx/media3/exoplayer/s;->j:I

    .line 506
    .line 507
    if-ne v2, v14, :cond_d

    .line 508
    .line 509
    iget-object v2, v0, Landroidx/media3/exoplayer/s;->o:LM2/D$b;

    .line 510
    .line 511
    if-eqz v2, :cond_d

    .line 512
    .line 513
    iget v4, v0, Landroidx/media3/exoplayer/s;->l:I

    .line 514
    .line 515
    invoke-direct {p0, v4, v2}, Landroidx/media3/exoplayer/o0;->k0(ILM2/D$b;)Z

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-eqz v2, :cond_d

    .line 520
    .line 521
    iput-boolean v14, p0, Landroidx/media3/exoplayer/o0;->G0:Z

    .line 522
    .line 523
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->C()V

    .line 524
    .line 525
    .line 526
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 527
    .line 528
    invoke-virtual {v0}, Landroidx/media3/exoplayer/u0;->x()Landroidx/media3/exoplayer/r0;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 533
    .line 534
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    iget-object v4, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 539
    .line 540
    invoke-virtual {v4}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    if-eq v4, v0, :cond_c

    .line 545
    .line 546
    :goto_d
    if-eqz v2, :cond_c

    .line 547
    .line 548
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    if-eq v4, v0, :cond_c

    .line 553
    .line 554
    invoke-virtual {v2}, Landroidx/media3/exoplayer/r0;->k()Landroidx/media3/exoplayer/r0;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    goto :goto_d

    .line 559
    :cond_c
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 560
    .line 561
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/u0;->N(Landroidx/media3/exoplayer/r0;)I

    .line 562
    .line 563
    .line 564
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 565
    .line 566
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 567
    .line 568
    if-eq v0, v3, :cond_14

    .line 569
    .line 570
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->n0()V

    .line 571
    .line 572
    .line 573
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 574
    .line 575
    const/4 v2, 0x2

    .line 576
    invoke-interface {v0, v2}, Lt2/s;->j(I)Z

    .line 577
    .line 578
    .line 579
    goto/16 :goto_f

    .line 580
    .line 581
    :cond_d
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 582
    .line 583
    if-eqz v2, :cond_e

    .line 584
    .line 585
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 586
    .line 587
    .line 588
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 589
    .line 590
    :cond_e
    iget v2, v0, Landroidx/media3/exoplayer/s;->j:I

    .line 591
    .line 592
    if-ne v2, v14, :cond_10

    .line 593
    .line 594
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 595
    .line 596
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 601
    .line 602
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    if-eq v2, v3, :cond_10

    .line 607
    .line 608
    :goto_e
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 609
    .line 610
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    iget-object v3, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 615
    .line 616
    invoke-virtual {v3}, Landroidx/media3/exoplayer/u0;->y()Landroidx/media3/exoplayer/r0;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    if-eq v2, v3, :cond_f

    .line 621
    .line 622
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->b()Landroidx/media3/exoplayer/r0;

    .line 625
    .line 626
    .line 627
    goto :goto_e

    .line 628
    :cond_f
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->s:Landroidx/media3/exoplayer/u0;

    .line 629
    .line 630
    invoke-virtual {v2}, Landroidx/media3/exoplayer/u0;->u()Landroidx/media3/exoplayer/r0;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    check-cast v2, Landroidx/media3/exoplayer/r0;

    .line 639
    .line 640
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->q0()V

    .line 641
    .line 642
    .line 643
    iget-object v2, v2, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 644
    .line 645
    iget-object v3, v2, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 646
    .line 647
    move-object v5, v3

    .line 648
    iget-wide v3, v2, Landroidx/media3/exoplayer/s0;->b:J

    .line 649
    .line 650
    iget-wide v6, v2, Landroidx/media3/exoplayer/s0;->c:J

    .line 651
    .line 652
    const/4 v9, 0x1

    .line 653
    const/4 v10, 0x0

    .line 654
    move-object v2, v5

    .line 655
    move-wide v5, v6

    .line 656
    move-wide v7, v3

    .line 657
    move-object v1, p0

    .line 658
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/o0;->f0(LM2/D$b;JJJZI)Landroidx/media3/exoplayer/K0;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    iput-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 663
    .line 664
    :cond_10
    iget-boolean v2, v0, Landroidx/media3/exoplayer/s;->p:Z

    .line 665
    .line 666
    if-eqz v2, :cond_13

    .line 667
    .line 668
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 669
    .line 670
    if-eqz v2, :cond_11

    .line 671
    .line 672
    iget v2, v0, Lq2/N;->a:I

    .line 673
    .line 674
    const/16 v3, 0x138c

    .line 675
    .line 676
    if-eq v2, v3, :cond_11

    .line 677
    .line 678
    const/16 v3, 0x138b

    .line 679
    .line 680
    if-ne v2, v3, :cond_13

    .line 681
    .line 682
    :cond_11
    const-string v2, "Recoverable renderer error"

    .line 683
    .line 684
    invoke-static {v12, v2, v0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 688
    .line 689
    if-nez v2, :cond_12

    .line 690
    .line 691
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->A0:Landroidx/media3/exoplayer/s;

    .line 692
    .line 693
    :cond_12
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 694
    .line 695
    const/16 v3, 0x19

    .line 696
    .line 697
    invoke-interface {v2, v3, v0}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-interface {v2, v0}, Lt2/s;->a(Lt2/s$a;)Z

    .line 702
    .line 703
    .line 704
    goto :goto_f

    .line 705
    :cond_13
    invoke-static {v12, v11, v0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 706
    .line 707
    .line 708
    invoke-direct {p0, v14, v13}, Landroidx/media3/exoplayer/o0;->W1(ZZ)V

    .line 709
    .line 710
    .line 711
    iget-object v2, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 712
    .line 713
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/K0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/K0;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    iput-object v0, p0, Landroidx/media3/exoplayer/o0;->I:Landroidx/media3/exoplayer/K0;

    .line 718
    .line 719
    :cond_14
    :goto_f
    invoke-direct {p0}, Landroidx/media3/exoplayer/o0;->q0()V

    .line 720
    .line 721
    .line 722
    return v14

    .line 723
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public i(Landroidx/media3/exoplayer/L0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/o0;->Y:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->j:Landroid/os/Looper;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

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
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 19
    .line 20
    const/16 v1, 0xe

    .line 21
    .line 22
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    const-string v0, "ExoPlayerImplInternal"

    .line 31
    .line 32
    const-string v1, "Ignoring messages sent after release."

    .line 33
    .line 34
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/L0;->j(Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public bridge synthetic j(LM2/d0;)V
    .locals 0

    .line 1
    check-cast p1, LM2/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/o0;->I0(LM2/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l1(Lq2/c;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p2, v2, p1}, Lt2/s;->d(IIILjava/lang/Object;)Lt2/s$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public n(Lq2/O;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public q1(Ljava/util/List;IJLM2/e0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/o0$b;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p1

    .line 7
    move v4, p2

    .line 8
    move-wide v5, p3

    .line 9
    move-object v3, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/o0$b;-><init>(Ljava/util/List;LM2/e0;IJLandroidx/media3/exoplayer/o0$a;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x11

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public t1(ZII)V
    .locals 1

    .line 1
    shl-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    or-int/2addr p2, p3

    .line 4
    iget-object p3, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p1, p2}, Lt2/s;->h(III)Lt2/s$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public v(ILjava/util/List;LM2/e0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/o0$b;

    .line 4
    .line 5
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v4, -0x1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/o0$b;-><init>(Ljava/util/List;LM2/e0;IJLandroidx/media3/exoplayer/o0$a;)V

    .line 15
    .line 16
    .line 17
    const/16 p2, 0x12

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-interface {v0, p2, p1, p3, v1}, Lt2/s;->d(IIILjava/lang/Object;)Lt2/s$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public v1(Lq2/O;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-interface {v0, v1, p1}, Lt2/s;->e(ILjava/lang/Object;)Lt2/s$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public y1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o0;->h:Lt2/s;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lt2/s;->h(III)Lt2/s$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lt2/s$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
