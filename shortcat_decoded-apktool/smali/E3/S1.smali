.class LE3/S1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/A$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/S1$d;,
        LE3/S1$f;,
        LE3/S1$e;,
        LE3/S1$b;,
        LE3/S1$c;
    }
.end annotation


# instance fields
.field private A:Landroid/view/Surface;

.field private B:Landroid/view/SurfaceHolder;

.field private C:Landroid/view/TextureView;

.field private D:Lt2/K;

.field private E:LE3/r;

.field private F:Landroid/media/session/MediaController;

.field private G:J

.field private H:J

.field private I:LE3/M6;

.field private J:Landroid/os/Bundle;

.field private final a:LE3/A;

.field protected final b:LE3/S6;

.field protected final c:LE3/X2;

.field private final d:Landroid/content/Context;

.field private final e:LE3/Y6;

.field private final f:Landroid/os/Bundle;

.field private final g:Landroid/os/IBinder$DeathRecipient;

.field private final h:LE3/S1$f;

.field private final i:Lt2/v;

.field private final j:LE3/S1$b;

.field private final k:Lt/b;

.field private final l:Landroid/os/Handler;

.field private m:LE3/Y6;

.field private n:LE3/S1$e;

.field private o:Z

.field private p:LE3/M6;

.field private q:Landroid/app/PendingIntent;

.field private r:LP9/u;

.field private s:LP9/u;

.field private t:LP9/u;

.field private u:LP9/u;

.field private v:LP9/v;

.field private w:LE3/U6;

.field private x:Lq2/P$b;

.field private y:Lq2/P$b;

.field private z:Lq2/P$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;LE3/A;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LE3/M6;->F:LE3/M6;

    .line 5
    .line 6
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 7
    .line 8
    sget-object v0, Lt2/K;->c:Lt2/K;

    .line 9
    .line 10
    iput-object v0, p0, LE3/S1;->D:Lt2/K;

    .line 11
    .line 12
    sget-object v0, LE3/U6;->b:LE3/U6;

    .line 13
    .line 14
    iput-object v0, p0, LE3/S1;->w:LE3/U6;

    .line 15
    .line 16
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LE3/S1;->r:LP9/u;

    .line 21
    .line 22
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LE3/S1;->s:LP9/u;

    .line 27
    .line 28
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LE3/S1;->t:LP9/u;

    .line 33
    .line 34
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, LE3/S1;->u:LP9/u;

    .line 39
    .line 40
    invoke-static {}, LP9/v;->k()LP9/v;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LE3/S1;->v:LP9/v;

    .line 45
    .line 46
    sget-object v0, Lq2/P$b;->b:Lq2/P$b;

    .line 47
    .line 48
    iput-object v0, p0, LE3/S1;->x:Lq2/P$b;

    .line 49
    .line 50
    iput-object v0, p0, LE3/S1;->y:Lq2/P$b;

    .line 51
    .line 52
    invoke-static {v0, v0}, LE3/S1;->n3(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 57
    .line 58
    new-instance v0, Lt2/v;

    .line 59
    .line 60
    sget-object v1, Lt2/j;->a:Lt2/j;

    .line 61
    .line 62
    new-instance v2, LE3/b0;

    .line 63
    .line 64
    invoke-direct {v2, p0}, LE3/b0;-><init>(LE3/S1;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, p5, v1, v2}, Lt2/v;-><init>(Landroid/os/Looper;Lt2/j;Lt2/v$b;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 71
    .line 72
    new-instance v0, Landroid/os/Handler;

    .line 73
    .line 74
    invoke-direct {v0, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, LE3/S1;->l:Landroid/os/Handler;

    .line 78
    .line 79
    iput-object p2, p0, LE3/S1;->a:LE3/A;

    .line 80
    .line 81
    const-string p2, "context must not be null"

    .line 82
    .line 83
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string p2, "token must not be null"

    .line 87
    .line 88
    invoke-static {p3, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, LE3/S1;->d:Landroid/content/Context;

    .line 92
    .line 93
    new-instance p1, LE3/S6;

    .line 94
    .line 95
    invoke-direct {p1}, LE3/S6;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, LE3/S1;->b:LE3/S6;

    .line 99
    .line 100
    new-instance p1, LE3/X2;

    .line 101
    .line 102
    invoke-direct {p1, p0}, LE3/X2;-><init>(LE3/S1;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, LE3/S1;->c:LE3/X2;

    .line 106
    .line 107
    new-instance p1, Lt/b;

    .line 108
    .line 109
    invoke-direct {p1}, Lt/b;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, LE3/S1;->k:Lt/b;

    .line 113
    .line 114
    iput-object p3, p0, LE3/S1;->e:LE3/Y6;

    .line 115
    .line 116
    iput-object p4, p0, LE3/S1;->f:Landroid/os/Bundle;

    .line 117
    .line 118
    new-instance p1, LE3/c0;

    .line 119
    .line 120
    invoke-direct {p1, p0}, LE3/c0;-><init>(LE3/S1;)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, LE3/S1;->g:Landroid/os/IBinder$DeathRecipient;

    .line 124
    .line 125
    new-instance p1, LE3/S1$f;

    .line 126
    .line 127
    const/4 p2, 0x0

    .line 128
    invoke-direct {p1, p0, p2}, LE3/S1$f;-><init>(LE3/S1;LE3/S1$a;)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, LE3/S1;->h:LE3/S1$f;

    .line 132
    .line 133
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 134
    .line 135
    iput-object p1, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 136
    .line 137
    invoke-virtual {p3}, LE3/Y6;->h()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_0

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_0
    new-instance p2, LE3/S1$e;

    .line 145
    .line 146
    invoke-direct {p2, p0, p4}, LE3/S1$e;-><init>(LE3/S1;Landroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    :goto_0
    iput-object p2, p0, LE3/S1;->n:LE3/S1$e;

    .line 150
    .line 151
    new-instance p1, LE3/S1$b;

    .line 152
    .line 153
    invoke-direct {p1, p0, p5}, LE3/S1$b;-><init>(LE3/S1;Landroid/os/Looper;)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, LE3/S1;->j:LE3/S1$b;

    .line 157
    .line 158
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    iput-wide p1, p0, LE3/S1;->G:J

    .line 164
    .line 165
    iput-wide p1, p0, LE3/S1;->H:J

    .line 166
    .line 167
    return-void
.end method

.method public static synthetic A1(LE3/S1;Ljava/util/List;LE3/r;I)V
    .locals 2

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    new-instance v0, Lq2/j;

    .line 4
    .line 5
    new-instance v1, LE3/T;

    .line 6
    .line 7
    invoke-direct {v1}, LE3/T;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, p0, p3, v0}, LE3/r;->W(LE3/q;ILandroid/os/IBinder;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic A2(LE3/S1;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, p0, p2, v0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static A3(Lq2/Y;III)I
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    :goto_0
    if-ge p2, p3, :cond_1

    .line 6
    .line 7
    new-instance v0, Lq2/Y$d;

    .line 8
    .line 9
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 13
    .line 14
    .line 15
    iget v1, v0, Lq2/Y$d;->o:I

    .line 16
    .line 17
    iget v0, v0, Lq2/Y$d;->n:I

    .line 18
    .line 19
    sub-int/2addr v1, v0

    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    sub-int/2addr p1, v1

    .line 23
    add-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return p1
.end method

.method public static synthetic B1(Lq2/d0;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->Z(Lq2/d0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B2(LE3/S1;Lcom/google/common/util/concurrent/p;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "MCImplBase"

    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/X6;

    .line 11
    .line 12
    const-string v1, "SessionResult must not be null"

    .line 13
    .line 14
    invoke-static {p1, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LE3/X6;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception p1

    .line 24
    goto :goto_0

    .line 25
    :catch_2
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :goto_0
    const-string v1, "Session operation failed"

    .line 28
    .line 29
    invoke-static {v0, v1, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, LE3/X6;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    invoke-direct {p1, v0}, LE3/X6;-><init>(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :goto_1
    const-string v1, "Session operation cancelled"

    .line 40
    .line 41
    invoke-static {v0, v1, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, LE3/X6;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p1, v0}, LE3/X6;-><init>(I)V

    .line 48
    .line 49
    .line 50
    :goto_2
    invoke-direct {p0, p2, p1}, LE3/S1;->o4(ILE3/X6;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic C1(Lq2/N;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->t0(Lq2/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C2(LE3/S1;Lq2/C;ZLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/C;->g()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->Y(LE3/q;ILandroid/os/Bundle;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private C3(Lq2/Y;IJ)LE3/S1$c;
    .locals 6

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
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v1, Lq2/Y$d;

    .line 10
    .line 11
    invoke-direct {v1}, Lq2/Y$d;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lq2/Y$b;

    .line 15
    .line 16
    invoke-direct {v2}, Lq2/Y$b;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    if-eq p2, v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lq2/Y;->t()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lt p2, v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move v3, p2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    :goto_1
    invoke-virtual {p0}, LE3/S1;->Q0()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p1, p2}, Lq2/Y;->e(Z)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1, p2, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-virtual {p3}, Lq2/Y$d;->c()J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    goto :goto_0

    .line 48
    :goto_2
    invoke-static {p3, p4}, Lt2/a0;->V0(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    move-object v0, p1

    .line 53
    invoke-static/range {v0 .. v5}, LE3/S1;->D3(Lq2/Y;Lq2/Y$d;Lq2/Y$b;IJ)LE3/S1$c;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public static synthetic D1(Lq2/O;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->n(Lq2/O;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D2(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static D3(Lq2/Y;Lq2/Y$d;Lq2/Y$b;IJ)LE3/S1$c;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lq2/Y;->t()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {p3, v0, v1}, Lt2/a;->c(III)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3, p1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long p3, p4, v0

    .line 18
    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lq2/Y$d;->d()J

    .line 22
    .line 23
    .line 24
    move-result-wide p4

    .line 25
    cmp-long p3, p4, v0

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_0
    iget p3, p1, Lq2/Y$d;->n:I

    .line 32
    .line 33
    invoke-virtual {p0, p3, p2}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget v0, p1, Lq2/Y$d;->o:I

    .line 37
    .line 38
    if-ge p3, v0, :cond_1

    .line 39
    .line 40
    iget-wide v0, p2, Lq2/Y$b;->e:J

    .line 41
    .line 42
    cmp-long v0, v0, p4

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    add-int/lit8 v0, p3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v0, p2}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-wide v1, v1, Lq2/Y$b;->e:J

    .line 53
    .line 54
    cmp-long v1, v1, p4

    .line 55
    .line 56
    if-gtz v1, :cond_1

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0, p3, p2}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 61
    .line 62
    .line 63
    iget-wide p0, p2, Lq2/Y$b;->e:J

    .line 64
    .line 65
    sub-long/2addr p4, p0

    .line 66
    new-instance p0, LE3/S1$c;

    .line 67
    .line 68
    invoke-direct {p0, p3, p4, p5}, LE3/S1$c;-><init>(IJ)V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public static synthetic E1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, LE3/M6;->n:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->d0(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic E2(LE3/S1;LE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, LE3/S1;->t:LP9/u;

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static E3(Lq2/Y;II)Lq2/Y$b;
    .locals 1

    .line 1
    new-instance v0, Lq2/Y$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 7
    .line 8
    .line 9
    iput p2, v0, Lq2/Y$b;->c:I

    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic F1(LE3/S1;Lq2/c;ZLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/c;->d()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->f3(LE3/q;ILandroid/os/Bundle;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic F2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, LE3/M6;->x:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->C(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic G1(LE3/S1;Ljava/util/List;IILE3/r;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object p0, p4

    .line 6
    move p4, p3

    .line 7
    move p3, p2

    .line 8
    move p2, p5

    .line 9
    new-instance p5, Lq2/j;

    .line 10
    .line 11
    new-instance v1, LE3/T;

    .line 12
    .line 13
    invoke-direct {v1}, LE3/T;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p5, p1}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, LE3/S1;->m:LE3/Y6;

    .line 24
    .line 25
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, LE3/Y6;

    .line 30
    .line 31
    invoke-virtual {p1}, LE3/Y6;->d()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v1, 0x2

    .line 36
    if-lt p1, v1, :cond_0

    .line 37
    .line 38
    iget-object p1, v0, LE3/S1;->c:LE3/X2;

    .line 39
    .line 40
    invoke-interface/range {p0 .. p5}, LE3/r;->C2(LE3/q;IIILandroid/os/IBinder;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    iget-object p1, v0, LE3/S1;->c:LE3/X2;

    .line 45
    .line 46
    invoke-interface {p0, p1, p2, p4, p5}, LE3/r;->c3(LE3/q;IILandroid/os/IBinder;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, v0, LE3/S1;->c:LE3/X2;

    .line 50
    .line 51
    invoke-interface {p0, p1, p2, p3, p4}, LE3/r;->G2(LE3/q;III)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static synthetic G2(LE3/S1;FLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->h1(LE3/q;IF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic H1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->z:Lq2/I;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->V(Lq2/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic H2(LE3/S1;Lq2/C;JLE3/r;I)V
    .locals 3

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/C;->g()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v0, p1

    .line 8
    move-object p1, p0

    .line 9
    move-object p0, p4

    .line 10
    move-wide v1, p2

    .line 11
    move-object p3, v0

    .line 12
    move p2, p5

    .line 13
    move-wide p4, v1

    .line 14
    invoke-interface/range {p0 .. p5}, LE3/r;->b3(LE3/q;ILandroid/os/Bundle;J)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic I1(LE3/S1;ZZILE3/A$c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 6
    .line 7
    invoke-interface {p4, v0, v1}, LE3/A$c;->O(LE3/A;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "MediaController.Listener#onSetCustomLayout() must not return null"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/google/common/util/concurrent/p;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 26
    .line 27
    invoke-interface {p4, p1, v1}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p2, p0, LE3/S1;->t:LP9/u;

    .line 37
    .line 38
    invoke-interface {p4, p1, p2}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-direct {p0, p3, v0}, LE3/S1;->p4(ILcom/google/common/util/concurrent/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic I2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->S1(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private I3(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/P$b;->c(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Controller isn\'t allowed to call command= "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "MCImplBase"

    .line 27
    .line 28
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x1

    .line 34
    return p1
.end method

.method public static synthetic J1(LE3/S1;Lq2/I;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/I;->e()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, p0, p3, p1}, LE3/r;->e0(LE3/q;ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic J2(LE3/S1;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->z:Lq2/P$b;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->I(Lq2/P$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic K1(LE3/S1;FLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->d1(LE3/q;IF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic K2(LE3/M6;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, LE3/M6;->t:Z

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {p2, p0, p1}, Lq2/P$d;->s0(ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static K3(LE3/M6;ILjava/util/List;JJ)LE3/M6;
    .locals 10

    .line 1
    iget-object v2, p0, LE3/M6;->j:Lq2/Y;

    .line 2
    .line 3
    new-instance v3, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v4, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move v6, v5

    .line 15
    :goto_0
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-ge v6, v7, :cond_0

    .line 20
    .line 21
    new-instance v7, Lq2/Y$d;

    .line 22
    .line 23
    invoke-direct {v7}, Lq2/Y$d;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v6, v7}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v6, v5

    .line 37
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-ge v6, v7, :cond_1

    .line 42
    .line 43
    add-int v7, v6, p1

    .line 44
    .line 45
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    check-cast v9, Lq2/C;

    .line 50
    .line 51
    invoke-static {v9}, LE3/S1;->q3(Lq2/C;)Lq2/Y$d;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-interface {v3, v7, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-static {v2, v3, v4}, LE3/S1;->e4(Lq2/Y;Ljava/util/List;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v4}, LE3/S1;->o3(Ljava/util/List;Ljava/util/List;)Lq2/Y;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, p0, LE3/M6;->j:Lq2/Y;

    .line 69
    .line 70
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    move v3, v5

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    iget-object v3, p0, LE3/M6;->c:LE3/W6;

    .line 79
    .line 80
    iget-object v3, v3, LE3/W6;->a:Lq2/P$e;

    .line 81
    .line 82
    iget v3, v3, Lq2/P$e;->c:I

    .line 83
    .line 84
    if-lt v3, p1, :cond_3

    .line 85
    .line 86
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    add-int/2addr v3, v4

    .line 91
    :cond_3
    move v5, v3

    .line 92
    iget-object v3, p0, LE3/M6;->c:LE3/W6;

    .line 93
    .line 94
    iget-object v3, v3, LE3/W6;->a:Lq2/P$e;

    .line 95
    .line 96
    iget v3, v3, Lq2/P$e;->f:I

    .line 97
    .line 98
    if-lt v3, p1, :cond_4

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    add-int/2addr v3, v1

    .line 105
    :cond_4
    :goto_2
    const/4 v8, 0x5

    .line 106
    move-object v0, p0

    .line 107
    move-wide v6, p5

    .line 108
    move-object v1, v2

    .line 109
    move v2, v5

    .line 110
    move-wide v4, p3

    .line 111
    invoke-static/range {v0 .. v8}, LE3/S1;->N3(LE3/M6;Lq2/Y;IIJJI)LE3/M6;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public static synthetic L1(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->Q0(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic L2(LE3/S1;I)V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/S1;->k:Lt/b;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lt/b;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LE3/S1;->m:LE3/Y6;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LE3/Y6;->d()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x5

    .line 19
    if-ge p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, LE3/S1;->k:Lt/b;

    .line 22
    .line 23
    invoke-virtual {p1}, Lt/b;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, LE3/S1;->l:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v0, LE3/K1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, LE3/K1;-><init>(LE3/S1;)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v1, 0x1f4

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method private static L3(LE3/M6;IIZJJ)LE3/M6;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v5, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    iget-object v4, v0, LE3/M6;->j:Lq2/Y;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    move v7, v3

    .line 21
    :goto_0
    invoke-virtual {v4}, Lq2/Y;->t()I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-ge v7, v8, :cond_2

    .line 26
    .line 27
    if-lt v7, v5, :cond_0

    .line 28
    .line 29
    if-lt v7, v6, :cond_1

    .line 30
    .line 31
    :cond_0
    new-instance v8, Lq2/Y$d;

    .line 32
    .line 33
    invoke-direct {v8}, Lq2/Y$d;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v7, v8}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {v4, v1, v2}, LE3/S1;->e4(Lq2/Y;Ljava/util/List;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, LE3/S1;->o3(Ljava/util/List;Ljava/util/List;)Lq2/Y;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    move v1, v3

    .line 54
    invoke-static {v0}, LE3/S1;->y3(LE3/M6;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iget-object v2, v0, LE3/M6;->c:LE3/W6;

    .line 59
    .line 60
    iget-object v2, v2, LE3/W6;->a:Lq2/P$e;

    .line 61
    .line 62
    iget v2, v2, Lq2/P$e;->f:I

    .line 63
    .line 64
    new-instance v8, Lq2/Y$d;

    .line 65
    .line 66
    invoke-direct {v8}, Lq2/Y$d;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v9, 0x1

    .line 70
    if-lt v3, v5, :cond_3

    .line 71
    .line 72
    if-ge v3, v6, :cond_3

    .line 73
    .line 74
    move v10, v9

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v10, v1

    .line 77
    :goto_1
    invoke-virtual {v7}, Lq2/Y;->u()Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    const/4 v12, -0x1

    .line 82
    if-eqz v11, :cond_4

    .line 83
    .line 84
    move v11, v3

    .line 85
    move-object v15, v4

    .line 86
    move v13, v5

    .line 87
    move v14, v6

    .line 88
    move v2, v12

    .line 89
    :goto_2
    move v3, v1

    .line 90
    goto :goto_6

    .line 91
    :cond_4
    if-eqz v10, :cond_7

    .line 92
    .line 93
    iget v1, v0, LE3/M6;->h:I

    .line 94
    .line 95
    iget-boolean v2, v0, LE3/M6;->i:Z

    .line 96
    .line 97
    invoke-static/range {v1 .. v6}, LE3/S1;->l4(IZILq2/Y;II)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    move v11, v3

    .line 102
    move-object v15, v4

    .line 103
    move v13, v5

    .line 104
    move v14, v6

    .line 105
    if-ne v1, v12, :cond_6

    .line 106
    .line 107
    iget-boolean v1, v0, LE3/M6;->i:Z

    .line 108
    .line 109
    invoke-virtual {v7, v1}, Lq2/Y;->e(Z)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    :cond_5
    :goto_3
    move v3, v1

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    if-lt v1, v14, :cond_5

    .line 116
    .line 117
    sub-int v2, v14, v13

    .line 118
    .line 119
    sub-int/2addr v1, v2

    .line 120
    goto :goto_3

    .line 121
    :goto_4
    invoke-virtual {v7, v3, v8}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget v1, v1, Lq2/Y$d;->n:I

    .line 126
    .line 127
    :goto_5
    move v2, v3

    .line 128
    goto :goto_2

    .line 129
    :cond_7
    move v11, v3

    .line 130
    move-object v15, v4

    .line 131
    move v13, v5

    .line 132
    move v14, v6

    .line 133
    if-lt v11, v14, :cond_8

    .line 134
    .line 135
    sub-int v1, v14, v13

    .line 136
    .line 137
    sub-int v3, v11, v1

    .line 138
    .line 139
    invoke-static {v15, v2, v13, v14}, LE3/S1;->A3(Lq2/Y;III)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    move v3, v2

    .line 145
    move v2, v11

    .line 146
    :goto_6
    const/4 v1, 0x4

    .line 147
    if-eqz v10, :cond_b

    .line 148
    .line 149
    if-ne v2, v12, :cond_9

    .line 150
    .line 151
    sget-object v2, LE3/W6;->k:Lq2/P$e;

    .line 152
    .line 153
    sget-object v3, LE3/W6;->l:LE3/W6;

    .line 154
    .line 155
    invoke-static {v0, v7, v2, v3, v1}, LE3/S1;->O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move v10, v1

    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :cond_9
    if-eqz p3, :cond_a

    .line 163
    .line 164
    const/4 v8, 0x4

    .line 165
    move-wide/from16 v4, p4

    .line 166
    .line 167
    move v10, v1

    .line 168
    move-object v1, v7

    .line 169
    move-wide/from16 v6, p6

    .line 170
    .line 171
    invoke-static/range {v0 .. v8}, LE3/S1;->N3(LE3/M6;Lq2/Y;IIJJI)LE3/M6;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto :goto_7

    .line 176
    :cond_a
    move v10, v1

    .line 177
    move-object v1, v7

    .line 178
    new-instance v4, Lq2/Y$d;

    .line 179
    .line 180
    invoke-direct {v4}, Lq2/Y$d;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v2, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v4}, Lq2/Y$d;->c()J

    .line 188
    .line 189
    .line 190
    move-result-wide v22

    .line 191
    invoke-virtual {v4}, Lq2/Y$d;->e()J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    new-instance v16, Lq2/P$e;

    .line 196
    .line 197
    iget-object v4, v4, Lq2/Y$d;->c:Lq2/C;

    .line 198
    .line 199
    const/16 v26, -0x1

    .line 200
    .line 201
    const/16 v27, -0x1

    .line 202
    .line 203
    const/16 v17, 0x0

    .line 204
    .line 205
    const/16 v20, 0x0

    .line 206
    .line 207
    move-wide/from16 v24, v22

    .line 208
    .line 209
    move/from16 v18, v2

    .line 210
    .line 211
    move/from16 v21, v3

    .line 212
    .line 213
    move-object/from16 v19, v4

    .line 214
    .line 215
    invoke-direct/range {v16 .. v27}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 216
    .line 217
    .line 218
    move-wide/from16 v2, v22

    .line 219
    .line 220
    new-instance v4, LE3/W6;

    .line 221
    .line 222
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 223
    .line 224
    .line 225
    move-result-wide v19

    .line 226
    invoke-static {v2, v3, v5, v6}, LE3/L6;->c(JJ)I

    .line 227
    .line 228
    .line 229
    move-result v25

    .line 230
    const-wide/16 v26, 0x0

    .line 231
    .line 232
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    move-wide/from16 v30, v5

    .line 240
    .line 241
    move-wide/from16 v32, v2

    .line 242
    .line 243
    move-wide/from16 v23, v2

    .line 244
    .line 245
    move-wide/from16 v21, v5

    .line 246
    .line 247
    move-object/from16 v17, v16

    .line 248
    .line 249
    move-object/from16 v16, v4

    .line 250
    .line 251
    invoke-direct/range {v16 .. v33}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v3, v16

    .line 255
    .line 256
    move-object/from16 v2, v17

    .line 257
    .line 258
    invoke-static {v0, v1, v2, v3, v10}, LE3/S1;->O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    goto :goto_7

    .line 263
    :cond_b
    move v10, v1

    .line 264
    move-object v1, v7

    .line 265
    const/4 v8, 0x4

    .line 266
    move-wide/from16 v4, p4

    .line 267
    .line 268
    move-wide/from16 v6, p6

    .line 269
    .line 270
    invoke-static/range {v0 .. v8}, LE3/S1;->N3(LE3/M6;Lq2/Y;IIJJI)LE3/M6;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :goto_7
    iget v1, v0, LE3/M6;->y:I

    .line 275
    .line 276
    if-eq v1, v9, :cond_c

    .line 277
    .line 278
    if-eq v1, v10, :cond_c

    .line 279
    .line 280
    if-ge v13, v14, :cond_c

    .line 281
    .line 282
    invoke-virtual {v15}, Lq2/Y;->t()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-ne v14, v1, :cond_c

    .line 287
    .line 288
    if-lt v11, v13, :cond_c

    .line 289
    .line 290
    const/4 v1, 0x0

    .line 291
    invoke-virtual {v0, v10, v1}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    :cond_c
    return-object v0
.end method

.method public static synthetic M1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->g:Lq2/O;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->n(Lq2/O;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic M2(LE3/S1;ZILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->U(LE3/q;IZI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private M3(LE3/M6;Lq2/Y;LE3/S1$c;)LE3/M6;
    .locals 53

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-object v2, v2, LE3/W6;->a:Lq2/P$e;

    .line 8
    .line 9
    iget v8, v2, Lq2/P$e;->f:I

    .line 10
    .line 11
    invoke-static/range {p3 .. p3}, LE3/S1$c;->a(LE3/S1$c;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    new-instance v3, Lq2/Y$b;

    .line 16
    .line 17
    invoke-direct {v3}, Lq2/Y$b;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v8, v3}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 21
    .line 22
    .line 23
    new-instance v15, Lq2/Y$b;

    .line 24
    .line 25
    invoke-direct {v15}, Lq2/Y$b;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v15}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    if-eq v8, v2, :cond_0

    .line 34
    .line 35
    move/from16 v21, v5

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move/from16 v21, v4

    .line 39
    .line 40
    :goto_0
    invoke-static/range {p3 .. p3}, LE3/S1$c;->b(LE3/S1$c;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v22

    .line 44
    invoke-virtual/range {p0 .. p0}, LE3/S1;->getCurrentPosition()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    invoke-static {v6, v7}, Lt2/a0;->V0(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    invoke-virtual {v3}, Lq2/Y$b;->o()J

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    sub-long v24, v6, v9

    .line 57
    .line 58
    if-nez v21, :cond_1

    .line 59
    .line 60
    cmp-long v6, v22, v24

    .line 61
    .line 62
    if-nez v6, :cond_1

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    iget-object v6, v0, LE3/M6;->c:LE3/W6;

    .line 66
    .line 67
    iget-object v6, v6, LE3/W6;->a:Lq2/P$e;

    .line 68
    .line 69
    iget v6, v6, Lq2/P$e;->i:I

    .line 70
    .line 71
    const/4 v7, -0x1

    .line 72
    if-ne v6, v7, :cond_2

    .line 73
    .line 74
    move v4, v5

    .line 75
    :cond_2
    invoke-static {v4}, Lt2/a;->g(Z)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lq2/P$e;

    .line 79
    .line 80
    move v6, v5

    .line 81
    iget v5, v3, Lq2/Y$b;->c:I

    .line 82
    .line 83
    iget-object v7, v0, LE3/M6;->c:LE3/W6;

    .line 84
    .line 85
    iget-object v7, v7, LE3/W6;->a:Lq2/P$e;

    .line 86
    .line 87
    iget-object v7, v7, Lq2/P$e;->d:Lq2/C;

    .line 88
    .line 89
    iget-wide v9, v3, Lq2/Y$b;->e:J

    .line 90
    .line 91
    add-long v9, v9, v24

    .line 92
    .line 93
    invoke-static {v9, v10}, Lt2/a0;->F1(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    iget-wide v11, v3, Lq2/Y$b;->e:J

    .line 98
    .line 99
    add-long v11, v11, v24

    .line 100
    .line 101
    invoke-static {v11, v12}, Lt2/a0;->F1(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    const/4 v13, -0x1

    .line 106
    const/4 v14, -0x1

    .line 107
    move-object v3, v4

    .line 108
    const/4 v4, 0x0

    .line 109
    move/from16 v16, v6

    .line 110
    .line 111
    move-object v6, v7

    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-direct/range {v3 .. v14}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v2, v15}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 117
    .line 118
    .line 119
    new-instance v4, Lq2/Y$d;

    .line 120
    .line 121
    invoke-direct {v4}, Lq2/Y$d;-><init>()V

    .line 122
    .line 123
    .line 124
    iget v5, v15, Lq2/Y$b;->c:I

    .line 125
    .line 126
    invoke-virtual {v1, v5, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 127
    .line 128
    .line 129
    iget-wide v5, v15, Lq2/Y$b;->e:J

    .line 130
    .line 131
    add-long v5, v5, v22

    .line 132
    .line 133
    invoke-static {v5, v6}, Lt2/a0;->F1(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v33

    .line 137
    new-instance v27, Lq2/P$e;

    .line 138
    .line 139
    iget v11, v15, Lq2/Y$b;->c:I

    .line 140
    .line 141
    iget-object v12, v4, Lq2/Y$d;->c:Lq2/C;

    .line 142
    .line 143
    const/16 v19, -0x1

    .line 144
    .line 145
    const/16 v20, -0x1

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v13, 0x0

    .line 149
    move-wide/from16 v17, v33

    .line 150
    .line 151
    move v14, v2

    .line 152
    move-object v1, v15

    .line 153
    move-object/from16 v9, v27

    .line 154
    .line 155
    move-wide/from16 v15, v33

    .line 156
    .line 157
    invoke-direct/range {v9 .. v20}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 158
    .line 159
    .line 160
    move-wide v5, v15

    .line 161
    const/4 v2, 0x1

    .line 162
    invoke-virtual {v0, v3, v9, v2}, LE3/M6;->o(Lq2/P$e;Lq2/P$e;I)LE3/M6;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-nez v21, :cond_4

    .line 167
    .line 168
    cmp-long v2, v22, v24

    .line 169
    .line 170
    if-gez v2, :cond_3

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_3
    iget-object v2, v0, LE3/M6;->c:LE3/W6;

    .line 174
    .line 175
    iget-wide v2, v2, LE3/W6;->g:J

    .line 176
    .line 177
    invoke-static {v2, v3}, Lt2/a0;->V0(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    sub-long v5, v22, v24

    .line 182
    .line 183
    sub-long/2addr v2, v5

    .line 184
    const-wide/16 v5, 0x0

    .line 185
    .line 186
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v2

    .line 190
    iget-wide v5, v1, Lq2/Y$b;->e:J

    .line 191
    .line 192
    add-long v5, v5, v22

    .line 193
    .line 194
    add-long/2addr v5, v2

    .line 195
    invoke-static {v5, v6}, Lt2/a0;->F1(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v5

    .line 199
    new-instance v35, LE3/W6;

    .line 200
    .line 201
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 202
    .line 203
    .line 204
    move-result-wide v38

    .line 205
    invoke-virtual {v4}, Lq2/Y$d;->e()J

    .line 206
    .line 207
    .line 208
    move-result-wide v40

    .line 209
    invoke-virtual {v4}, Lq2/Y$d;->e()J

    .line 210
    .line 211
    .line 212
    move-result-wide v7

    .line 213
    invoke-static {v5, v6, v7, v8}, LE3/L6;->c(JJ)I

    .line 214
    .line 215
    .line 216
    move-result v44

    .line 217
    invoke-static {v2, v3}, Lt2/a0;->F1(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v45

    .line 221
    const-wide v47, -0x7fffffffffffffffL    # -4.9E-324

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    const-wide v49, -0x7fffffffffffffffL    # -4.9E-324

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    const/16 v37, 0x0

    .line 232
    .line 233
    move-wide/from16 v51, v5

    .line 234
    .line 235
    move-wide/from16 v42, v5

    .line 236
    .line 237
    move-object/from16 v36, v9

    .line 238
    .line 239
    invoke-direct/range {v35 .. v52}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v1, v35

    .line 243
    .line 244
    invoke-virtual {v0, v1}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    return-object v0

    .line 249
    :cond_4
    :goto_1
    new-instance v26, LE3/W6;

    .line 250
    .line 251
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 252
    .line 253
    .line 254
    move-result-wide v29

    .line 255
    invoke-virtual {v4}, Lq2/Y$d;->e()J

    .line 256
    .line 257
    .line 258
    move-result-wide v31

    .line 259
    invoke-virtual {v4}, Lq2/Y$d;->e()J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    invoke-static {v5, v6, v1, v2}, LE3/L6;->c(JJ)I

    .line 264
    .line 265
    .line 266
    move-result v35

    .line 267
    const-wide v38, -0x7fffffffffffffffL    # -4.9E-324

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    const-wide v40, -0x7fffffffffffffffL    # -4.9E-324

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    const/16 v28, 0x0

    .line 278
    .line 279
    const-wide/16 v36, 0x0

    .line 280
    .line 281
    move-wide/from16 v42, v5

    .line 282
    .line 283
    move-wide/from16 v33, v5

    .line 284
    .line 285
    move-object/from16 v27, v9

    .line 286
    .line 287
    invoke-direct/range {v26 .. v43}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 288
    .line 289
    .line 290
    move-object/from16 v1, v26

    .line 291
    .line 292
    invoke-virtual {v0, v1}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0
.end method

.method public static synthetic N1(LE3/S1;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, p0, p2, v0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic N2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, LE3/M6;->v:Z

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->y0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static N3(LE3/M6;Lq2/Y;IIJJI)LE3/M6;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lq2/P$e;

    .line 6
    .line 7
    new-instance v3, Lq2/Y$d;

    .line 8
    .line 9
    invoke-direct {v3}, Lq2/Y$d;-><init>()V

    .line 10
    .line 11
    .line 12
    move/from16 v4, p2

    .line 13
    .line 14
    invoke-virtual {v1, v4, v3}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v5, v3, Lq2/Y$d;->c:Lq2/C;

    .line 19
    .line 20
    iget-object v3, v0, LE3/M6;->c:LE3/W6;

    .line 21
    .line 22
    iget-object v3, v3, LE3/W6;->a:Lq2/P$e;

    .line 23
    .line 24
    iget v12, v3, Lq2/P$e;->i:I

    .line 25
    .line 26
    iget v13, v3, Lq2/P$e;->j:I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    move/from16 v7, p3

    .line 31
    .line 32
    move-wide/from16 v8, p4

    .line 33
    .line 34
    move-wide/from16 v10, p6

    .line 35
    .line 36
    invoke-direct/range {v2 .. v13}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 37
    .line 38
    .line 39
    new-instance v3, LE3/W6;

    .line 40
    .line 41
    iget-object v4, v0, LE3/M6;->c:LE3/W6;

    .line 42
    .line 43
    iget-boolean v4, v4, LE3/W6;->b:Z

    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    iget-object v7, v0, LE3/M6;->c:LE3/W6;

    .line 50
    .line 51
    iget-wide v8, v7, LE3/W6;->d:J

    .line 52
    .line 53
    move-wide v11, v8

    .line 54
    iget-wide v9, v7, LE3/W6;->e:J

    .line 55
    .line 56
    move-wide v12, v11

    .line 57
    iget v11, v7, LE3/W6;->f:I

    .line 58
    .line 59
    move-wide v14, v12

    .line 60
    iget-wide v12, v7, LE3/W6;->g:J

    .line 61
    .line 62
    move-wide/from16 v16, v14

    .line 63
    .line 64
    iget-wide v14, v7, LE3/W6;->h:J

    .line 65
    .line 66
    move-object/from16 p2, v2

    .line 67
    .line 68
    move-object/from16 p3, v3

    .line 69
    .line 70
    iget-wide v2, v7, LE3/W6;->i:J

    .line 71
    .line 72
    iget-wide v7, v7, LE3/W6;->j:J

    .line 73
    .line 74
    move-wide/from16 v18, v7

    .line 75
    .line 76
    move-wide/from16 v7, v16

    .line 77
    .line 78
    move-wide/from16 v16, v2

    .line 79
    .line 80
    move-object/from16 v3, p2

    .line 81
    .line 82
    move-object/from16 v2, p3

    .line 83
    .line 84
    invoke-direct/range {v2 .. v19}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 85
    .line 86
    .line 87
    move-object v4, v2

    .line 88
    move/from16 v2, p8

    .line 89
    .line 90
    invoke-static {v0, v1, v3, v4, v2}, LE3/S1;->O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method

.method public static synthetic O1(LE3/S1;Ljava/util/List;IJLE3/r;I)V
    .locals 4

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    move-object p1, p0

    .line 5
    move-object p0, p5

    .line 6
    move-wide v2, p3

    .line 7
    move p4, p2

    .line 8
    move p2, p6

    .line 9
    move-wide p5, v2

    .line 10
    new-instance p3, Lq2/j;

    .line 11
    .line 12
    new-instance v1, LE3/T;

    .line 13
    .line 14
    invoke-direct {v1}, LE3/T;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p3, v0}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-interface/range {p0 .. p6}, LE3/r;->h3(LE3/q;ILandroid/os/IBinder;IJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic O2(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->R2(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;
    .locals 1

    .line 1
    new-instance v0, LE3/M6$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/M6$b;-><init>(LE3/M6;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LE3/M6$b;->B(Lq2/Y;)LE3/M6$b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, LE3/M6;->c:LE3/W6;

    .line 11
    .line 12
    iget-object p0, p0, LE3/W6;->a:Lq2/P$e;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, LE3/M6$b;->o(Lq2/P$e;)LE3/M6$b;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, p2}, LE3/M6$b;->n(Lq2/P$e;)LE3/M6$b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p3}, LE3/M6$b;->z(LE3/W6;)LE3/M6$b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p4}, LE3/M6$b;->h(I)LE3/M6$b;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, LE3/M6$b;->a()LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static synthetic P1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->E:Lq2/d0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->Z(Lq2/d0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic P2(Lq2/c;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->e0(Lq2/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private P3(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->D:Lt2/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/K;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE3/S1;->D:Lt2/K;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/K;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    new-instance v0, Lt2/K;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2}, Lt2/K;-><init>(II)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LE3/S1;->D:Lt2/K;

    .line 25
    .line 26
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 27
    .line 28
    new-instance v1, LE3/w1;

    .line 29
    .line 30
    invoke-direct {v1, p1, p2}, LE3/w1;-><init>(II)V

    .line 31
    .line 32
    .line 33
    const/16 p1, 0x18

    .line 34
    .line 35
    invoke-virtual {v0, p1, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic Q1(Lq2/O;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->n(Lq2/O;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Q2(LE3/S1;Lq2/d0;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/d0;->K()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, p0, p3, p1}, LE3/r;->i0(LE3/q;ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private Q3(III)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 6
    .line 7
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    move/from16 v4, p2

    .line 14
    .line 15
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    sub-int v5, v4, v1

    .line 20
    .line 21
    sub-int v6, v3, v5

    .line 22
    .line 23
    move/from16 v7, p3

    .line 24
    .line 25
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ge v1, v3, :cond_5

    .line 30
    .line 31
    if-eq v1, v4, :cond_5

    .line 32
    .line 33
    if-ne v1, v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    move v10, v9

    .line 49
    :goto_0
    if-ge v10, v3, :cond_1

    .line 50
    .line 51
    new-instance v11, Lq2/Y$d;

    .line 52
    .line 53
    invoke-direct {v11}, Lq2/Y$d;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v10, v11}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v10, v10, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {v7, v1, v4, v6}, Lt2/a0;->U0(Ljava/util/List;III)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v7, v8}, LE3/S1;->e4(Lq2/Y;Ljava/util/List;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v7, v8}, LE3/S1;->o3(Ljava/util/List;Ljava/util/List;)Lq2/Y;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-virtual {v12}, Lq2/Y;->u()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, LE3/S1;->K0()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-lt v3, v1, :cond_2

    .line 87
    .line 88
    if-ge v3, v4, :cond_2

    .line 89
    .line 90
    sub-int v1, v3, v1

    .line 91
    .line 92
    add-int/2addr v1, v6

    .line 93
    :goto_1
    move v13, v1

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    if-gt v4, v3, :cond_3

    .line 96
    .line 97
    if-le v6, v3, :cond_3

    .line 98
    .line 99
    sub-int v1, v3, v5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    if-le v4, v3, :cond_4

    .line 103
    .line 104
    if-gt v6, v3, :cond_4

    .line 105
    .line 106
    add-int v1, v3, v5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move v13, v3

    .line 110
    :goto_2
    new-instance v1, Lq2/Y$d;

    .line 111
    .line 112
    invoke-direct {v1}, Lq2/Y$d;-><init>()V

    .line 113
    .line 114
    .line 115
    iget-object v4, v0, LE3/S1;->p:LE3/M6;

    .line 116
    .line 117
    iget-object v4, v4, LE3/M6;->c:LE3/W6;

    .line 118
    .line 119
    iget-object v4, v4, LE3/W6;->a:Lq2/P$e;

    .line 120
    .line 121
    iget v4, v4, Lq2/P$e;->f:I

    .line 122
    .line 123
    invoke-virtual {v2, v3, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget v2, v2, Lq2/Y$d;->n:I

    .line 128
    .line 129
    sub-int/2addr v4, v2

    .line 130
    invoke-virtual {v12, v13, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget v1, v1, Lq2/Y$d;->n:I

    .line 135
    .line 136
    add-int v14, v1, v4

    .line 137
    .line 138
    iget-object v11, v0, LE3/S1;->p:LE3/M6;

    .line 139
    .line 140
    invoke-virtual {v0}, LE3/S1;->getCurrentPosition()J

    .line 141
    .line 142
    .line 143
    move-result-wide v15

    .line 144
    invoke-virtual {v0}, LE3/S1;->G0()J

    .line 145
    .line 146
    .line 147
    move-result-wide v17

    .line 148
    const/16 v19, 0x5

    .line 149
    .line 150
    invoke-static/range {v11 .. v19}, LE3/S1;->N3(LE3/M6;Lq2/Y;IIJJI)LE3/M6;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v3, 0x0

    .line 161
    invoke-direct/range {v0 .. v5}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    :goto_3
    return-void
.end method

.method public static synthetic R1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, LE3/M6;->i:Z

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->M(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic R2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->r2(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic S1(LE3/S1;IIILE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    move v0, p1

    .line 4
    move-object p1, p0

    .line 5
    move-object p0, p4

    .line 6
    move p4, p2

    .line 7
    move p2, p5

    .line 8
    move p5, p3

    .line 9
    move p3, v0

    .line 10
    invoke-interface/range {p0 .. p5}, LE3/r;->B2(LE3/q;IIII)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic S2(FLq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->d0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private S3(LE3/M6;LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    if-eqz p3, :cond_0

    .line 1
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    new-instance v1, LE3/w0;

    invoke-direct {v1, p2, p3}, LE3/w0;-><init>(LE3/M6;Ljava/lang/Integer;)V

    const/4 p3, 0x0

    invoke-virtual {v0, p3, v1}, Lt2/v;->h(ILt2/v$a;)V

    :cond_0
    if-eqz p5, :cond_1

    .line 2
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance v0, LE3/I0;

    invoke-direct {v0, p2, p5}, LE3/I0;-><init>(LE3/M6;Ljava/lang/Integer;)V

    const/16 p5, 0xb

    invoke-virtual {p3, p5, v0}, Lt2/v;->h(ILt2/v$a;)V

    .line 3
    :cond_1
    invoke-virtual {p2}, LE3/M6;->C()Lq2/C;

    move-result-object p3

    if-eqz p6, :cond_2

    .line 4
    iget-object p5, p0, LE3/S1;->i:Lt2/v;

    new-instance v0, LE3/R0;

    invoke-direct {v0, p3, p6}, LE3/R0;-><init>(Lq2/C;Ljava/lang/Integer;)V

    const/4 p3, 0x1

    invoke-virtual {p5, p3, v0}, Lt2/v;->h(ILt2/v$a;)V

    .line 5
    :cond_2
    iget-object p3, p1, LE3/M6;->a:Lq2/N;

    .line 6
    iget-object p5, p2, LE3/M6;->a:Lq2/N;

    if-eq p3, p5, :cond_4

    if-eqz p3, :cond_3

    .line 7
    invoke-virtual {p3, p5}, Lq2/N;->c(Lq2/N;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p6, LE3/S0;

    invoke-direct {p6, p5}, LE3/S0;-><init>(Lq2/N;)V

    const/16 v0, 0xa

    invoke-virtual {p3, v0, p6}, Lt2/v;->h(ILt2/v$a;)V

    if-eqz p5, :cond_4

    .line 9
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p6, LE3/T0;

    invoke-direct {p6, p5}, LE3/T0;-><init>(Lq2/N;)V

    invoke-virtual {p3, v0, p6}, Lt2/v;->h(ILt2/v$a;)V

    .line 10
    :cond_4
    :goto_0
    iget-object p3, p1, LE3/M6;->D:Lq2/h0;

    iget-object p5, p2, LE3/M6;->D:Lq2/h0;

    invoke-virtual {p3, p5}, Lq2/h0;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    .line 11
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p5, LE3/U0;

    invoke-direct {p5, p2}, LE3/U0;-><init>(LE3/M6;)V

    const/4 p6, 0x2

    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 12
    :cond_5
    iget-object p3, p1, LE3/M6;->z:Lq2/I;

    iget-object p5, p2, LE3/M6;->z:Lq2/I;

    invoke-virtual {p3, p5}, Lq2/I;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    .line 13
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p5, LE3/V0;

    invoke-direct {p5, p2}, LE3/V0;-><init>(LE3/M6;)V

    const/16 p6, 0xe

    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 14
    :cond_6
    iget-boolean p3, p1, LE3/M6;->w:Z

    iget-boolean p5, p2, LE3/M6;->w:Z

    if-eq p3, p5, :cond_7

    .line 15
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p5, LE3/W0;

    invoke-direct {p5, p2}, LE3/W0;-><init>(LE3/M6;)V

    const/4 p6, 0x3

    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 16
    :cond_7
    iget p3, p1, LE3/M6;->y:I

    iget p5, p2, LE3/M6;->y:I

    if-eq p3, p5, :cond_8

    .line 17
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p5, LE3/X0;

    invoke-direct {p5, p2}, LE3/X0;-><init>(LE3/M6;)V

    const/4 p6, 0x4

    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    :cond_8
    if-eqz p4, :cond_9

    .line 18
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p5, LE3/Y0;

    invoke-direct {p5, p2, p4}, LE3/Y0;-><init>(LE3/M6;Ljava/lang/Integer;)V

    const/4 p4, 0x5

    invoke-virtual {p3, p4, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 19
    :cond_9
    iget p3, p1, LE3/M6;->x:I

    iget p4, p2, LE3/M6;->x:I

    if-eq p3, p4, :cond_a

    .line 20
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/x0;

    invoke-direct {p4, p2}, LE3/x0;-><init>(LE3/M6;)V

    const/4 p5, 0x6

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 21
    :cond_a
    iget-boolean p3, p1, LE3/M6;->v:Z

    iget-boolean p4, p2, LE3/M6;->v:Z

    if-eq p3, p4, :cond_b

    .line 22
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/y0;

    invoke-direct {p4, p2}, LE3/y0;-><init>(LE3/M6;)V

    const/4 p5, 0x7

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 23
    :cond_b
    iget-object p3, p1, LE3/M6;->g:Lq2/O;

    iget-object p4, p2, LE3/M6;->g:Lq2/O;

    invoke-virtual {p3, p4}, Lq2/O;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_c

    .line 24
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/z0;

    invoke-direct {p4, p2}, LE3/z0;-><init>(LE3/M6;)V

    const/16 p5, 0xc

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 25
    :cond_c
    iget p3, p1, LE3/M6;->h:I

    iget p4, p2, LE3/M6;->h:I

    if-eq p3, p4, :cond_d

    .line 26
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/A0;

    invoke-direct {p4, p2}, LE3/A0;-><init>(LE3/M6;)V

    const/16 p5, 0x8

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 27
    :cond_d
    iget-boolean p3, p1, LE3/M6;->i:Z

    iget-boolean p4, p2, LE3/M6;->i:Z

    if-eq p3, p4, :cond_e

    .line 28
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/B0;

    invoke-direct {p4, p2}, LE3/B0;-><init>(LE3/M6;)V

    const/16 p5, 0x9

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 29
    :cond_e
    iget-object p3, p1, LE3/M6;->m:Lq2/I;

    iget-object p4, p2, LE3/M6;->m:Lq2/I;

    invoke-virtual {p3, p4}, Lq2/I;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_f

    .line 30
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/C0;

    invoke-direct {p4, p2}, LE3/C0;-><init>(LE3/M6;)V

    const/16 p5, 0xf

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 31
    :cond_f
    iget p3, p1, LE3/M6;->n:F

    iget p4, p2, LE3/M6;->n:F

    cmpl-float p3, p3, p4

    if-eqz p3, :cond_10

    .line 32
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/E0;

    invoke-direct {p4, p2}, LE3/E0;-><init>(LE3/M6;)V

    const/16 p5, 0x16

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 33
    :cond_10
    iget-object p3, p1, LE3/M6;->o:Lq2/c;

    iget-object p4, p2, LE3/M6;->o:Lq2/c;

    invoke-virtual {p3, p4}, Lq2/c;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_11

    .line 34
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/F0;

    invoke-direct {p4, p2}, LE3/F0;-><init>(LE3/M6;)V

    const/16 p5, 0x14

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 35
    :cond_11
    iget-object p3, p1, LE3/M6;->p:Ls2/e;

    iget-object p3, p3, Ls2/e;->a:LP9/u;

    iget-object p4, p2, LE3/M6;->p:Ls2/e;

    iget-object p4, p4, Ls2/e;->a:LP9/u;

    invoke-virtual {p3, p4}, LP9/u;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_12

    .line 36
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/G0;

    invoke-direct {p4, p2}, LE3/G0;-><init>(LE3/M6;)V

    const/16 p5, 0x1b

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 37
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/H0;

    invoke-direct {p4, p2}, LE3/H0;-><init>(LE3/M6;)V

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 38
    :cond_12
    iget-object p3, p1, LE3/M6;->q:Lq2/p;

    iget-object p4, p2, LE3/M6;->q:Lq2/p;

    invoke-virtual {p3, p4}, Lq2/p;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_13

    .line 39
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/J0;

    invoke-direct {p4, p2}, LE3/J0;-><init>(LE3/M6;)V

    const/16 p5, 0x1d

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 40
    :cond_13
    iget p3, p1, LE3/M6;->r:I

    iget p4, p2, LE3/M6;->r:I

    if-ne p3, p4, :cond_14

    iget-boolean p3, p1, LE3/M6;->s:Z

    iget-boolean p4, p2, LE3/M6;->s:Z

    if-eq p3, p4, :cond_15

    .line 41
    :cond_14
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/K0;

    invoke-direct {p4, p2}, LE3/K0;-><init>(LE3/M6;)V

    const/16 p5, 0x1e

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 42
    :cond_15
    iget-object p3, p1, LE3/M6;->l:Lq2/l0;

    iget-object p4, p2, LE3/M6;->l:Lq2/l0;

    invoke-virtual {p3, p4}, Lq2/l0;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_16

    .line 43
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/L0;

    invoke-direct {p4, p2}, LE3/L0;-><init>(LE3/M6;)V

    const/16 p5, 0x19

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 44
    :cond_16
    iget-wide p3, p1, LE3/M6;->A:J

    iget-wide p5, p2, LE3/M6;->A:J

    cmp-long p3, p3, p5

    if-eqz p3, :cond_17

    .line 45
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/M0;

    invoke-direct {p4, p2}, LE3/M0;-><init>(LE3/M6;)V

    const/16 p5, 0x10

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 46
    :cond_17
    iget-wide p3, p1, LE3/M6;->B:J

    iget-wide p5, p2, LE3/M6;->B:J

    cmp-long p3, p3, p5

    if-eqz p3, :cond_18

    .line 47
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/N0;

    invoke-direct {p4, p2}, LE3/N0;-><init>(LE3/M6;)V

    const/16 p5, 0x11

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 48
    :cond_18
    iget-wide p3, p1, LE3/M6;->C:J

    iget-wide p5, p2, LE3/M6;->C:J

    cmp-long p3, p3, p5

    if-eqz p3, :cond_19

    .line 49
    iget-object p3, p0, LE3/S1;->i:Lt2/v;

    new-instance p4, LE3/P0;

    invoke-direct {p4, p2}, LE3/P0;-><init>(LE3/M6;)V

    const/16 p5, 0x12

    invoke-virtual {p3, p5, p4}, Lt2/v;->h(ILt2/v$a;)V

    .line 50
    :cond_19
    iget-object p1, p1, LE3/M6;->E:Lq2/d0;

    iget-object p3, p2, LE3/M6;->E:Lq2/d0;

    invoke-virtual {p1, p3}, Lq2/d0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    .line 51
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    new-instance p3, LE3/Q0;

    invoke-direct {p3, p2}, LE3/Q0;-><init>(LE3/M6;)V

    const/16 p2, 0x13

    invoke-virtual {p1, p2, p3}, Lt2/v;->h(ILt2/v$a;)V

    .line 52
    :cond_1a
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    invoke-virtual {p1}, Lt2/v;->f()V

    return-void
.end method

.method public static synthetic T1(LE3/S1;ZLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->c0(LE3/q;IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic T2(LE3/S1;Lq2/O;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/O;->c()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, p0, p3, p1}, LE3/r;->r3(LE3/q;ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic U1(LE3/S1;LE3/T6;Landroid/os/Bundle;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-virtual {p1}, LE3/T6;->b()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->Z1(LE3/q;ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic U2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->E0(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic V1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->q:Lq2/p;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->n0(Lq2/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic V2(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic W1(LE3/S1;LE3/T6;Landroid/os/Bundle;ILE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p4, v0, p1, p2}, LE3/A$c;->q0(LE3/A;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "ControllerCallback#onCustomCommand() must not return null"

    .line 10
    .line 11
    invoke-static {p1, p2}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 16
    .line 17
    invoke-direct {p0, p3, p1}, LE3/S1;->p4(ILcom/google/common/util/concurrent/p;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic W2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->O1(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic X1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->p:Ls2/e;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->t(Ls2/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic X2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->F3(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic Y1(LE3/M6;Lq2/P$d;)V
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/M6;->B:J

    .line 2
    .line 3
    invoke-interface {p1, v0, v1}, Lq2/P$d;->l0(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic Y2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, LE3/M6;->y:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->J(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic Z1(LE3/S1;IILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->K0(LE3/q;III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic Z2(LE3/S1;)LE3/r;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->E:LE3/r;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic a2(LE3/S1;Ljava/util/List;ZLE3/r;I)V
    .locals 2

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    new-instance v0, Lq2/j;

    .line 4
    .line 5
    new-instance v1, LE3/T;

    .line 6
    .line 7
    invoke-direct {v1}, LE3/T;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3, p0, p4, v0, p2}, LE3/r;->Q2(LE3/q;ILandroid/os/IBinder;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method static synthetic a3(LE3/S1;)LE3/Y6;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->e:LE3/Y6;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LE3/S1;ILq2/C;LE3/r;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->m:LE3/Y6;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE3/Y6;

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/Y6;->d()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 17
    .line 18
    invoke-virtual {p2}, Lq2/C;->g()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->T2(LE3/q;IILandroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, LE3/S1;->c:LE3/X2;

    .line 27
    .line 28
    add-int/lit8 v1, p1, 0x1

    .line 29
    .line 30
    invoke-virtual {p2}, Lq2/C;->g()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p3, v0, p4, v1, p2}, LE3/r;->N2(LE3/q;IILandroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 38
    .line 39
    invoke-interface {p3, p0, p4, p1}, LE3/r;->I(LE3/q;II)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic b1(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->t0(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b2(LE3/S1;ZLq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget p0, p0, LE3/M6;->r:I

    .line 4
    .line 5
    invoke-interface {p2, p0, p1}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method static synthetic b3(LE3/S1;)LE3/A;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->a:LE3/A;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c1(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->p:Ls2/e;

    .line 2
    .line 3
    iget-object p0, p0, Ls2/e;->a:LP9/u;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->p(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method static synthetic c3(LE3/S1;)Landroid/view/SurfaceHolder;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(ZLq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->M(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d1(LE3/M6;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/M6;->d:Lq2/P$e;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->e:Lq2/P$e;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-interface {p2, v0, p0, p1}, Lq2/P$d;->m0(Lq2/P$e;Lq2/P$e;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic d2(LE3/S1;ILjava/util/List;LE3/r;I)V
    .locals 2

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    new-instance v0, Lq2/j;

    .line 4
    .line 5
    new-instance v1, LE3/T;

    .line 6
    .line 7
    invoke-direct {v1}, LE3/T;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-direct {v0, p2}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3, p0, p4, p1, v0}, LE3/r;->c3(LE3/q;IILandroid/os/IBinder;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method static synthetic d3(LE3/S1;)Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e1(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic e2(LE3/S1;ZLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->V1(LE3/q;IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic e3(LE3/S1;Landroid/view/Surface;)Landroid/view/Surface;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 2
    .line 3
    return-object p1
.end method

.method private static e4(Lq2/Y;Ljava/util/List;Ljava/util/List;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_3

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lq2/Y$d;

    .line 13
    .line 14
    iget v2, v1, Lq2/Y$d;->n:I

    .line 15
    .line 16
    iget v3, v1, Lq2/Y$d;->o:I

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-eq v2, v4, :cond_1

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iput v4, v1, Lq2/Y$d;->n:I

    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int v5, v3, v2

    .line 35
    .line 36
    add-int/2addr v4, v5

    .line 37
    iput v4, v1, Lq2/Y$d;->o:I

    .line 38
    .line 39
    :goto_1
    if-gt v2, v3, :cond_2

    .line 40
    .line 41
    invoke-static {p0, v2, v0}, LE3/S1;->E3(Lq2/Y;II)Lq2/Y$b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iput v2, v1, Lq2/Y$d;->n:I

    .line 56
    .line 57
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iput v2, v1, Lq2/Y$d;->o:I

    .line 62
    .line 63
    invoke-static {v0}, LE3/S1;->p3(I)Lq2/Y$b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return-void
.end method

.method public static synthetic f(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->m1(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic f1(IILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lq2/P$d;->W(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->o:Lq2/c;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->e0(Lq2/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic f3(LE3/S1;LE3/S1$d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/S1;->t3(LE3/S1$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private f4(II)V
    .locals 12

    .line 1
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v1, v1, LE3/M6;->j:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {v1}, Lq2/Y;->t()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge p1, v1, :cond_5

    .line 14
    .line 15
    if-eq p1, v3, :cond_5

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v9, 0x1

    .line 25
    const/4 v10, 0x0

    .line 26
    if-lt v1, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v1, v3, :cond_1

    .line 33
    .line 34
    move v11, v9

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v11, v10

    .line 37
    :goto_0
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 38
    .line 39
    invoke-virtual {p0}, LE3/S1;->getCurrentPosition()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    invoke-virtual {p0}, LE3/S1;->G0()J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    const/4 v4, 0x0

    .line 48
    move v2, p1

    .line 49
    invoke-static/range {v1 .. v8}, LE3/S1;->L3(LE3/M6;IIZJJ)LE3/M6;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v4, p0, LE3/S1;->p:LE3/M6;

    .line 54
    .line 55
    iget-object v4, v4, LE3/M6;->c:LE3/W6;

    .line 56
    .line 57
    iget-object v4, v4, LE3/W6;->a:Lq2/P$e;

    .line 58
    .line 59
    iget v4, v4, Lq2/P$e;->c:I

    .line 60
    .line 61
    if-lt v4, p1, :cond_2

    .line 62
    .line 63
    if-ge v4, v3, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v9, v10

    .line 67
    :goto_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v11, :cond_3

    .line 73
    .line 74
    const/4 v4, 0x4

    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move-object v4, v3

    .line 81
    :goto_2
    if-eqz v9, :cond_4

    .line 82
    .line 83
    const/4 v3, 0x3

    .line 84
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :cond_4
    move-object v5, v3

    .line 89
    const/4 v3, 0x0

    .line 90
    move-object v0, p0

    .line 91
    invoke-direct/range {v0 .. v5}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_3
    return-void
.end method

.method public static synthetic g(LE3/S1;Landroid/view/Surface;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic g1(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->q1(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic g2(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->I(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic g3(LE3/S1;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LE3/S1;->P3(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private g4(IILjava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 6
    .line 7
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v3, v0, LE3/S1;->p:LE3/M6;

    .line 17
    .line 18
    iget-object v3, v3, LE3/M6;->j:Lq2/Y;

    .line 19
    .line 20
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v2, -0x1

    .line 33
    move-object/from16 v1, p3

    .line 34
    .line 35
    invoke-direct/range {v0 .. v5}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 36
    .line 37
    .line 38
    move-object v8, v0

    .line 39
    return-void

    .line 40
    :cond_1
    move-object v8, v0

    .line 41
    move/from16 v0, p2

    .line 42
    .line 43
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v9, v8, LE3/S1;->p:LE3/M6;

    .line 48
    .line 49
    invoke-virtual {v8}, LE3/S1;->getCurrentPosition()J

    .line 50
    .line 51
    .line 52
    move-result-wide v12

    .line 53
    invoke-virtual {v8}, LE3/S1;->G0()J

    .line 54
    .line 55
    .line 56
    move-result-wide v14

    .line 57
    move-object/from16 v11, p3

    .line 58
    .line 59
    move v10, v2

    .line 60
    invoke-static/range {v9 .. v15}, LE3/S1;->K3(LE3/M6;ILjava/util/List;JJ)LE3/M6;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v8}, LE3/S1;->getCurrentPosition()J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-virtual {v8}, LE3/S1;->G0()J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-static/range {v0 .. v7}, LE3/S1;->L3(LE3/M6;IIZJJ)LE3/M6;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v3, v8, LE3/S1;->p:LE3/M6;

    .line 78
    .line 79
    iget-object v3, v3, LE3/M6;->c:LE3/W6;

    .line 80
    .line 81
    iget-object v3, v3, LE3/W6;->a:Lq2/P$e;

    .line 82
    .line 83
    iget v3, v3, Lq2/P$e;->c:I

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    if-lt v3, v1, :cond_2

    .line 87
    .line 88
    if-ge v3, v2, :cond_2

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    move v1, v4

    .line 93
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    const/4 v4, 0x4

    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v4, v3

    .line 107
    :goto_1
    if-eqz v1, :cond_4

    .line 108
    .line 109
    const/4 v1, 0x3

    .line 110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :cond_4
    move-object v5, v3

    .line 115
    const/4 v3, 0x0

    .line 116
    move-object v1, v0

    .line 117
    move-object v0, v8

    .line 118
    invoke-direct/range {v0 .. v5}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static synthetic h(LE3/S1;ZLq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget p0, p0, LE3/M6;->r:I

    .line 4
    .line 5
    invoke-interface {p2, p0, p1}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic h1(Lq2/C;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-interface {p2, p0, p1}, Lq2/P$d;->E(Lq2/C;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic h2(LE3/S1;LE3/r;I)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, p0, p2, v0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method static synthetic h3(LE3/S1;)Landroid/view/TextureView;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 2
    .line 3
    return-object p0
.end method

.method private h4()Z
    .locals 7

    .line 1
    const-string v0, "bind to "

    .line 2
    .line 3
    const-string v1, "MCImplBase"

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1d

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    const/16 v2, 0x1001

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v4

    .line 16
    :goto_0
    new-instance v3, Landroid/content/Intent;

    .line 17
    .line 18
    const-string v5, "androidx.media3.session.MediaSessionService"

    .line 19
    .line 20
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v5, p0, LE3/S1;->e:LE3/Y6;

    .line 24
    .line 25
    invoke-virtual {v5}, LE3/Y6;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, p0, LE3/S1;->e:LE3/Y6;

    .line 30
    .line 31
    invoke-virtual {v6}, LE3/Y6;->g()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object v5, p0, LE3/S1;->d:Landroid/content/Context;

    .line 39
    .line 40
    iget-object v6, p0, LE3/S1;->n:LE3/S1$e;

    .line 41
    .line 42
    invoke-virtual {v5, v3, v6, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    return v4

    .line 49
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, LE3/S1;->e:LE3/Y6;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, " failed"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v1, v2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception v2

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, " not allowed"

    .line 90
    .line 91
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v1, v0, v2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    const/4 v0, 0x0

    .line 102
    return v0
.end method

.method public static synthetic i(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic i1(LE3/S1;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->z:Lq2/P$b;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->I(Lq2/P$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic i2(LE3/S1;IJLE3/r;I)V
    .locals 3

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    move v0, p1

    .line 4
    move-object p1, p0

    .line 5
    move-object p0, p4

    .line 6
    move-wide v1, p2

    .line 7
    move p3, v0

    .line 8
    move p2, p5

    .line 9
    move-wide p4, v1

    .line 10
    invoke-interface/range {p0 .. p5}, LE3/r;->X2(LE3/q;IIJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private i3(ILjava/util/List;)V
    .locals 13

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

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
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 9
    .line 10
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 11
    .line 12
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v3, -0x1

    .line 25
    move-object v1, p0

    .line 26
    move-object v2, p2

    .line 27
    invoke-direct/range {v1 .. v6}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    move-object v1, p0

    .line 32
    move-object v2, p2

    .line 33
    iget-object p2, v1, LE3/S1;->p:LE3/M6;

    .line 34
    .line 35
    iget-object p2, p2, LE3/M6;->j:Lq2/Y;

    .line 36
    .line 37
    invoke-virtual {p2}, Lq2/Y;->t()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    move-object v4, v2

    .line 46
    iget-object v2, v1, LE3/S1;->p:LE3/M6;

    .line 47
    .line 48
    invoke-virtual {p0}, LE3/S1;->getCurrentPosition()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    invoke-virtual {p0}, LE3/S1;->G0()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-static/range {v2 .. v8}, LE3/S1;->K3(LE3/M6;ILjava/util/List;JJ)LE3/M6;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget-object p1, v1, LE3/S1;->p:LE3/M6;

    .line 61
    .line 62
    iget-object p1, p1, LE3/M6;->j:Lq2/Y;

    .line 63
    .line 64
    invoke-virtual {p1}, Lq2/Y;->u()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    const/4 p1, 0x3

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_0
    move-object v12, p1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 p1, 0x0

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    const/4 p1, 0x0

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    move-object v7, v1

    .line 87
    invoke-direct/range {v7 .. v12}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private i4(Landroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/Y6;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/IBinder;

    .line 12
    .line 13
    invoke-static {v0}, LE3/r$a;->c(Landroid/os/IBinder;)LE3/r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, LE3/S1;->b:LE3/S6;

    .line 18
    .line 19
    invoke-virtual {v1}, LE3/S6;->c()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-instance v2, LE3/h;

    .line 24
    .line 25
    iget-object v3, p0, LE3/S1;->d:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, p0, LE3/S1;->a:LE3/A;

    .line 36
    .line 37
    invoke-virtual {v5}, LE3/A;->e1()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-direct {v2, v3, v4, p1, v5}, LE3/h;-><init>(Ljava/lang/String;ILandroid/os/Bundle;I)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object p1, p0, LE3/S1;->c:LE3/X2;

    .line 45
    .line 46
    invoke-virtual {v2}, LE3/h;->b()Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v0, p1, v1, v2}, LE3/r;->O0(LE3/q;ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :catch_0
    move-exception p1

    .line 56
    const-string v0, "MCImplBase"

    .line 57
    .line 58
    const-string v1, "Failed to call connection request."

    .line 59
    .line 60
    invoke-static {v0, v1, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return p1
.end method

.method public static synthetic j(LE3/S1;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->I:LE3/M6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LE3/M6$c;->c:LE3/M6$c;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, LE3/S1;->Z3(LE3/M6;LE3/M6$c;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic j1(LE3/S1;LE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, LE3/S1;->u:LP9/u;

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic j2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->d2(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private j3()V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, LE3/S1;->h:LE3/S1$f;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iput-object v1, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 27
    .line 28
    :cond_2
    return-void
.end method

.method private static j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, LE3/b;->d(Ljava/util/List;LE3/U6;Lq2/P$b;)LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p3, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x6

    .line 23
    const/4 v1, 0x7

    .line 24
    filled-new-array {p1, v1}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p4, p1}, Lq2/P$b;->d([I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    move p1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, p3

    .line 37
    :goto_0
    const-string v1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 38
    .line 39
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    const/16 p2, 0x8

    .line 46
    .line 47
    const/16 v1, 0x9

    .line 48
    .line 49
    filled-new-array {p2, v1}, [I

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p4, p2}, Lq2/P$b;->d([I)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_2

    .line 58
    .line 59
    move p3, v0

    .line 60
    :cond_2
    invoke-static {p0, p1, p3}, LE3/b;->f(Ljava/util/List;ZZ)LP9/u;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static synthetic k(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->g3(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic k1(LE3/S1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v1, LE3/h0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, LE3/h0;-><init>(LE3/A;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic k2(LE3/S1;IILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->G2(LE3/q;III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, LE3/b;->i(Ljava/util/List;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-static {p0, p2, p3}, LE3/b;->d(Ljava/util/List;LE3/U6;Lq2/P$b;)LP9/u;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic l(LE3/S1;ZLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->q3(LE3/q;IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic l1(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->I1(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic l2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->J2(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static l4(IZILq2/Y;II)I
    .locals 3

    .line 1
    invoke-virtual {p3}, Lq2/Y;->t()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    const/4 v2, -0x1

    .line 7
    if-ge v1, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p3, p2, p0, p1}, Lq2/Y;->i(IIZ)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-ne p2, v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    if-lt p2, p4, :cond_2

    .line 17
    .line 18
    if-lt p2, p5, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    :goto_1
    return p2

    .line 25
    :cond_3
    :goto_2
    return v2
.end method

.method public static synthetic m(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->D:Lq2/h0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->g0(Lq2/h0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic m1(LE3/S1;Landroid/os/Bundle;ZZLE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p4, v0, p1}, LE3/A$c;->a0(LE3/A;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p2, p0, LE3/S1;->u:LP9/u;

    .line 15
    .line 16
    invoke-interface {p4, p1, p2}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    if-eqz p3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p0, p0, LE3/S1;->t:LP9/u;

    .line 26
    .line 27
    invoke-interface {p4, p1, p0}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static synthetic m2(LE3/S1;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static m3(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    :cond_0
    return p0
.end method

.method private m4(IJ)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    move-wide/from16 v13, p2

    .line 6
    .line 7
    iget-object v1, v0, LE3/S1;->p:LE3/M6;

    .line 8
    .line 9
    iget-object v1, v1, LE3/M6;->j:Lq2/Y;

    .line 10
    .line 11
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lq2/Y;->t()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, LE3/S1;->D()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    :cond_2
    invoke-virtual {v0}, LE3/S1;->p()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v2, v4, :cond_3

    .line 36
    .line 37
    move v2, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 v2, 0x2

    .line 40
    :goto_0
    iget-object v5, v0, LE3/S1;->p:LE3/M6;

    .line 41
    .line 42
    iget-object v6, v5, LE3/M6;->a:Lq2/N;

    .line 43
    .line 44
    invoke-virtual {v5, v2, v6}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v0, v1, v3, v13, v14}, LE3/S1;->C3(Lq2/Y;IJ)LE3/S1$c;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-nez v5, :cond_8

    .line 53
    .line 54
    new-instance v1, Lq2/P$e;

    .line 55
    .line 56
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    cmp-long v16, v13, v5

    .line 62
    .line 63
    const-wide/16 v17, 0x0

    .line 64
    .line 65
    if-nez v16, :cond_4

    .line 66
    .line 67
    move-wide/from16 v7, v17

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move-wide v7, v13

    .line 71
    :goto_1
    if-nez v16, :cond_5

    .line 72
    .line 73
    move-wide/from16 v9, v17

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    move-wide v9, v13

    .line 77
    :goto_2
    const/4 v11, -0x1

    .line 78
    const/4 v12, -0x1

    .line 79
    const/4 v2, 0x0

    .line 80
    move v5, v4

    .line 81
    const/4 v4, 0x0

    .line 82
    move v6, v5

    .line 83
    const/4 v5, 0x0

    .line 84
    move/from16 v19, v6

    .line 85
    .line 86
    move/from16 v6, p1

    .line 87
    .line 88
    move/from16 v15, v19

    .line 89
    .line 90
    const/16 v34, 0x2

    .line 91
    .line 92
    invoke-direct/range {v1 .. v12}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 96
    .line 97
    iget-object v3, v2, LE3/M6;->j:Lq2/Y;

    .line 98
    .line 99
    move/from16 v4, v16

    .line 100
    .line 101
    new-instance v16, LE3/W6;

    .line 102
    .line 103
    iget-object v5, v0, LE3/S1;->p:LE3/M6;

    .line 104
    .line 105
    iget-object v5, v5, LE3/M6;->c:LE3/W6;

    .line 106
    .line 107
    iget-boolean v5, v5, LE3/W6;->b:Z

    .line 108
    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v19

    .line 113
    iget-object v6, v0, LE3/S1;->p:LE3/M6;

    .line 114
    .line 115
    iget-object v6, v6, LE3/M6;->c:LE3/W6;

    .line 116
    .line 117
    iget-wide v7, v6, LE3/W6;->d:J

    .line 118
    .line 119
    if-nez v4, :cond_6

    .line 120
    .line 121
    move-wide/from16 v23, v17

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    move-wide/from16 v23, v13

    .line 125
    .line 126
    :goto_3
    iget-wide v9, v6, LE3/W6;->h:J

    .line 127
    .line 128
    iget-wide v11, v6, LE3/W6;->i:J

    .line 129
    .line 130
    if-nez v4, :cond_7

    .line 131
    .line 132
    move-wide/from16 v32, v17

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    move-wide/from16 v32, v13

    .line 136
    .line 137
    :goto_4
    const/16 v25, 0x0

    .line 138
    .line 139
    const-wide/16 v26, 0x0

    .line 140
    .line 141
    move-object/from16 v17, v1

    .line 142
    .line 143
    move/from16 v18, v5

    .line 144
    .line 145
    move-wide/from16 v21, v7

    .line 146
    .line 147
    move-wide/from16 v28, v9

    .line 148
    .line 149
    move-wide/from16 v30, v11

    .line 150
    .line 151
    invoke-direct/range {v16 .. v33}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v4, v16

    .line 155
    .line 156
    invoke-static {v2, v3, v1, v4, v15}, LE3/S1;->O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    move v15, v4

    .line 162
    const/16 v34, 0x2

    .line 163
    .line 164
    invoke-direct {v0, v2, v1, v5}, LE3/S1;->M3(LE3/M6;Lq2/Y;LE3/S1$c;)LE3/M6;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :goto_5
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 169
    .line 170
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 171
    .line 172
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_9

    .line 177
    .line 178
    iget-object v2, v1, LE3/M6;->c:LE3/W6;

    .line 179
    .line 180
    iget-object v2, v2, LE3/W6;->a:Lq2/P$e;

    .line 181
    .line 182
    iget v2, v2, Lq2/P$e;->c:I

    .line 183
    .line 184
    iget-object v3, v0, LE3/S1;->p:LE3/M6;

    .line 185
    .line 186
    iget-object v3, v3, LE3/M6;->c:LE3/W6;

    .line 187
    .line 188
    iget-object v3, v3, LE3/W6;->a:Lq2/P$e;

    .line 189
    .line 190
    iget v3, v3, Lq2/P$e;->c:I

    .line 191
    .line 192
    if-eq v2, v3, :cond_9

    .line 193
    .line 194
    move v4, v15

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    const/4 v4, 0x0

    .line 197
    :goto_6
    if-nez v4, :cond_b

    .line 198
    .line 199
    iget-object v2, v1, LE3/M6;->c:LE3/W6;

    .line 200
    .line 201
    iget-object v2, v2, LE3/W6;->a:Lq2/P$e;

    .line 202
    .line 203
    iget-wide v2, v2, Lq2/P$e;->g:J

    .line 204
    .line 205
    iget-object v5, v0, LE3/S1;->p:LE3/M6;

    .line 206
    .line 207
    iget-object v5, v5, LE3/M6;->c:LE3/W6;

    .line 208
    .line 209
    iget-object v5, v5, LE3/W6;->a:Lq2/P$e;

    .line 210
    .line 211
    iget-wide v5, v5, Lq2/P$e;->g:J

    .line 212
    .line 213
    cmp-long v2, v2, v5

    .line 214
    .line 215
    if-eqz v2, :cond_a

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_a
    return-void

    .line 219
    :cond_b
    :goto_7
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-eqz v4, :cond_c

    .line 224
    .line 225
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    :goto_8
    move-object v4, v2

    .line 230
    move-object v5, v3

    .line 231
    goto :goto_9

    .line 232
    :cond_c
    const/4 v3, 0x0

    .line 233
    goto :goto_8

    .line 234
    :goto_9
    const/4 v2, 0x0

    .line 235
    const/4 v3, 0x0

    .line 236
    invoke-direct/range {v0 .. v5}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public static synthetic n(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, LE3/M6;->w:Z

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->b0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic n1(LE3/S1;IILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->N(LE3/q;III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic n2(LE3/S1;Lq2/P$d;Lq2/t;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lq2/P$c;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lq2/P$c;-><init>(Lq2/t;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0, v0}, Lq2/P$d;->X(Lq2/P;Lq2/P$c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static n3(Lq2/P$b;Lq2/P$b;)Lq2/P$b;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LE3/L6;->f(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 p1, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq2/P$b;->c(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lq2/P$b;->b()Lq2/P$b$a;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, p1}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private n4(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE3/S1;->getCurrentPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    invoke-virtual {p0}, LE3/S1;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v2, p1, v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    :cond_0
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-direct {p0, v0, p1, p2}, LE3/S1;->m4(IJ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic o(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->X0(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic o1(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->B3(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic o2(LE3/S1;LE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, LE3/S1;->t:LP9/u;

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static o3(Ljava/util/List;Ljava/util/List;)Lq2/Y;
    .locals 3

    .line 1
    new-instance v0, Lq2/Y$c;

    .line 2
    .line 3
    new-instance v1, LP9/u$a;

    .line 4
    .line 5
    invoke-direct {v1}, LP9/u$a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, LP9/u$a;->k()LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, LP9/u$a;

    .line 17
    .line 18
    invoke-direct {v2}, LP9/u$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p1}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LP9/u$a;->k()LP9/u;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, LE3/L6;->d(I)[I

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, v1, p1, p0}, Lq2/Y$c;-><init>(LP9/u;LP9/u;[I)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private o4(ILE3/X6;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->E:LE3/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v1, p0, LE3/S1;->c:LE3/X2;

    .line 7
    .line 8
    invoke-virtual {p2}, LE3/X6;->b()Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {v0, v1, p1, p2}, LE3/r;->Z0(LE3/q;ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    const-string p1, "MCImplBase"

    .line 17
    .line 18
    const-string p2, "Error in sending"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic p1(Lq2/P$d;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Lq2/P$d;->J(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic p2(LE3/S1;Landroid/view/Surface;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static p3(I)Lq2/Y$b;
    .locals 10

    .line 1
    new-instance v0, Lq2/Y$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v8, Lq2/b;->g:Lq2/b;

    .line 7
    .line 8
    const/4 v9, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    move v3, p0

    .line 19
    invoke-virtual/range {v0 .. v9}, Lq2/Y$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJLq2/b;Z)Lq2/Y$b;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method private p4(ILcom/google/common/util/concurrent/p;)V
    .locals 1

    .line 1
    new-instance v0, LE3/U;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, LE3/U;-><init>(LE3/S1;Lcom/google/common/util/concurrent/p;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p2, v0, p1}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic q1(LE3/M6;Lq2/P$d;)V
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/M6;->C:J

    .line 2
    .line 3
    invoke-interface {p1, v0, v1}, Lq2/P$d;->r0(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic q2(Lq2/I;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->c0(Lq2/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static q3(Lq2/C;)Lq2/Y$d;
    .locals 22

    .line 1
    new-instance v1, Lq2/Y$d;

    .line 2
    .line 3
    invoke-direct {v1}, Lq2/Y$d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/16 v19, -0x1

    .line 12
    .line 13
    const-wide/16 v20, 0x0

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    const-wide/16 v7, 0x0

    .line 19
    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    const/4 v11, 0x1

    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x0

    .line 25
    const-wide/16 v14, 0x0

    .line 26
    .line 27
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/16 v18, -0x1

    .line 33
    .line 34
    move-object/from16 v3, p0

    .line 35
    .line 36
    invoke-virtual/range {v1 .. v21}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public static synthetic r(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->l:Lq2/l0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->b(Lq2/l0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic r1(LE3/S1;LE3/V6;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p2, p0, p1}, LE3/A$c;->U(LE3/A;LE3/V6;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic r2(LE3/S1;ZZILE3/A$c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 6
    .line 7
    invoke-interface {p4, v0, v1}, LE3/A$c;->O(LE3/A;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "MediaController.Listener#onSetCustomLayout() must not return null"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/google/common/util/concurrent/p;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 26
    .line 27
    invoke-interface {p4, p1, v1}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p2, p0, LE3/S1;->t:LP9/u;

    .line 37
    .line 38
    invoke-interface {p4, p1, p2}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-direct {p0, p3, v0}, LE3/S1;->p4(ILcom/google/common/util/concurrent/p;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private r3(LE3/r;LE3/S1$d;Z)Lcom/google/common/util/concurrent/p;
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, LE3/S1;->b:LE3/S6;

    .line 4
    .line 5
    new-instance v1, LE3/X6;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, LE3/X6;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, LE3/S6;->a(Ljava/lang/Object;)LE3/S6$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LE3/S6$a;->L()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget-object p3, p0, LE3/S1;->k:Lt/b;

    .line 22
    .line 23
    invoke-virtual {p3}, Lt/b;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    iget-object p3, p0, LE3/S1;->p:LE3/M6;

    .line 30
    .line 31
    iput-object p3, p0, LE3/S1;->I:LE3/M6;

    .line 32
    .line 33
    :cond_0
    iget-object p3, p0, LE3/S1;->k:Lt/b;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p3, v2}, Lt/b;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :try_start_0
    invoke-interface {p2, p1, v1}, LE3/S1$d;->a(LE3/r;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :catch_0
    move-exception p1

    .line 47
    const-string p2, "MCImplBase"

    .line 48
    .line 49
    const-string p3, "Cannot connect to the service or the session is gone"

    .line 50
    .line 51
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LE3/S1;->k:Lt/b;

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p1, p2}, Lt/b;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, LE3/S1;->b:LE3/S6;

    .line 64
    .line 65
    new-instance p2, LE3/X6;

    .line 66
    .line 67
    const/16 p3, -0x64

    .line 68
    .line 69
    invoke-direct {p2, p3}, LE3/X6;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1, p2}, LE3/S6;->e(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_2
    new-instance p1, LE3/X6;

    .line 77
    .line 78
    const/4 p2, -0x4

    .line 79
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1
.end method

.method private r4(Ljava/util/List;IJZ)V
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move v6, v5

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-ge v6, v7, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    check-cast v7, Lq2/C;

    .line 30
    .line 31
    invoke-static {v7, v6}, LE3/t;->a0(Lq2/C;I)Lq2/Y$d;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {v6}, LE3/t;->F(I)Lq2/Y$b;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v6, v6, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v3, v4}, LE3/S1;->o3(Ljava/util/List;Ljava/util/List;)Lq2/Y;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3}, Lq2/Y;->t()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ge v2, v4, :cond_2

    .line 63
    .line 64
    :cond_1
    move-wide/from16 v6, p3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance v1, Lq2/A;

    .line 68
    .line 69
    move-wide/from16 v6, p3

    .line 70
    .line 71
    invoke-direct {v1, v3, v2, v6, v7}, Lq2/A;-><init>(Lq2/Y;IJ)V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :goto_1
    const/4 v4, -0x1

    .line 76
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    if-eqz p5, :cond_3

    .line 83
    .line 84
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 85
    .line 86
    iget-boolean v2, v2, LE3/M6;->i:Z

    .line 87
    .line 88
    invoke-virtual {v3, v2}, Lq2/Y;->e(Z)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    move v13, v2

    .line 93
    move v2, v5

    .line 94
    move-wide v6, v8

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    if-ne v2, v4, :cond_5

    .line 97
    .line 98
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 99
    .line 100
    iget-object v2, v2, LE3/M6;->c:LE3/W6;

    .line 101
    .line 102
    iget-object v2, v2, LE3/W6;->a:Lq2/P$e;

    .line 103
    .line 104
    iget v6, v2, Lq2/P$e;->c:I

    .line 105
    .line 106
    iget-wide v11, v2, Lq2/P$e;->g:J

    .line 107
    .line 108
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    invoke-virtual {v3}, Lq2/Y;->t()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-lt v6, v2, :cond_4

    .line 119
    .line 120
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 121
    .line 122
    iget-boolean v2, v2, LE3/M6;->i:Z

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Lq2/Y;->e(Z)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    move v13, v2

    .line 129
    move-wide v6, v8

    .line 130
    move v2, v10

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move v2, v5

    .line 133
    move v13, v6

    .line 134
    move-wide v6, v11

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    move v13, v2

    .line 137
    move v2, v5

    .line 138
    :goto_2
    invoke-direct {v0, v3, v13, v6, v7}, LE3/S1;->C3(Lq2/Y;IJ)LE3/S1$c;

    .line 139
    .line 140
    .line 141
    move-result-object v23

    .line 142
    if-nez v23, :cond_a

    .line 143
    .line 144
    new-instance v11, Lq2/P$e;

    .line 145
    .line 146
    cmp-long v1, v6, v8

    .line 147
    .line 148
    const-wide/16 v8, 0x0

    .line 149
    .line 150
    if-nez v1, :cond_6

    .line 151
    .line 152
    move-wide/from16 v17, v8

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move-wide/from16 v17, v6

    .line 156
    .line 157
    :goto_3
    if-nez v1, :cond_7

    .line 158
    .line 159
    move-wide/from16 v19, v8

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    move-wide/from16 v19, v6

    .line 163
    .line 164
    :goto_4
    const/16 v21, -0x1

    .line 165
    .line 166
    const/16 v22, -0x1

    .line 167
    .line 168
    const/4 v12, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    move/from16 v16, v13

    .line 172
    .line 173
    invoke-direct/range {v11 .. v22}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 174
    .line 175
    .line 176
    new-instance v24, LE3/W6;

    .line 177
    .line 178
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 179
    .line 180
    .line 181
    move-result-wide v27

    .line 182
    if-nez v1, :cond_8

    .line 183
    .line 184
    move-wide/from16 v31, v8

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    move-wide/from16 v31, v6

    .line 188
    .line 189
    :goto_5
    if-nez v1, :cond_9

    .line 190
    .line 191
    move-wide/from16 v40, v8

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    move-wide/from16 v40, v6

    .line 195
    .line 196
    :goto_6
    const/16 v26, 0x0

    .line 197
    .line 198
    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    const/16 v33, 0x0

    .line 204
    .line 205
    const-wide/16 v34, 0x0

    .line 206
    .line 207
    const-wide v36, -0x7fffffffffffffffL    # -4.9E-324

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    const-wide v38, -0x7fffffffffffffffL    # -4.9E-324

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    move-object/from16 v25, v11

    .line 218
    .line 219
    invoke-direct/range {v24 .. v41}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 220
    .line 221
    .line 222
    move-object/from16 v1, v24

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_a
    new-instance v26, Lq2/P$e;

    .line 226
    .line 227
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object v14, v1

    .line 232
    check-cast v14, Lq2/C;

    .line 233
    .line 234
    invoke-static/range {v23 .. v23}, LE3/S1$c;->a(LE3/S1$c;)I

    .line 235
    .line 236
    .line 237
    move-result v16

    .line 238
    invoke-static/range {v23 .. v23}, LE3/S1$c;->b(LE3/S1$c;)J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    invoke-static {v6, v7}, Lt2/a0;->F1(J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v17

    .line 246
    invoke-static/range {v23 .. v23}, LE3/S1$c;->b(LE3/S1$c;)J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    invoke-static {v6, v7}, Lt2/a0;->F1(J)J

    .line 251
    .line 252
    .line 253
    move-result-wide v19

    .line 254
    const/16 v21, -0x1

    .line 255
    .line 256
    const/16 v22, -0x1

    .line 257
    .line 258
    const/4 v12, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    move-object/from16 v11, v26

    .line 261
    .line 262
    invoke-direct/range {v11 .. v22}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 263
    .line 264
    .line 265
    new-instance v25, LE3/W6;

    .line 266
    .line 267
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 268
    .line 269
    .line 270
    move-result-wide v28

    .line 271
    invoke-static/range {v23 .. v23}, LE3/S1$c;->b(LE3/S1$c;)J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    invoke-static {v6, v7}, Lt2/a0;->F1(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v32

    .line 279
    invoke-static/range {v23 .. v23}, LE3/S1$c;->b(LE3/S1$c;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    invoke-static {v6, v7}, Lt2/a0;->F1(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v41

    .line 287
    const/16 v27, 0x0

    .line 288
    .line 289
    const-wide v30, -0x7fffffffffffffffL    # -4.9E-324

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    const/16 v34, 0x0

    .line 295
    .line 296
    const-wide/16 v35, 0x0

    .line 297
    .line 298
    const-wide v37, -0x7fffffffffffffffL    # -4.9E-324

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    const-wide v39, -0x7fffffffffffffffL    # -4.9E-324

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    invoke-direct/range {v25 .. v42}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v1, v25

    .line 312
    .line 313
    :goto_7
    iget-object v6, v0, LE3/S1;->p:LE3/M6;

    .line 314
    .line 315
    const/4 v7, 0x4

    .line 316
    invoke-static {v6, v3, v11, v1, v7}, LE3/S1;->O3(LE3/M6;Lq2/Y;Lq2/P$e;LE3/W6;I)LE3/M6;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    iget v6, v1, LE3/M6;->y:I

    .line 321
    .line 322
    if-eq v13, v4, :cond_d

    .line 323
    .line 324
    if-eq v6, v10, :cond_d

    .line 325
    .line 326
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-nez v3, :cond_c

    .line 331
    .line 332
    if-eqz v2, :cond_b

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_b
    const/4 v6, 0x2

    .line 336
    goto :goto_9

    .line 337
    :cond_c
    :goto_8
    move v6, v7

    .line 338
    :cond_d
    :goto_9
    iget-object v2, v0, LE3/S1;->p:LE3/M6;

    .line 339
    .line 340
    iget-object v2, v2, LE3/M6;->a:Lq2/N;

    .line 341
    .line 342
    invoke-virtual {v1, v6, v2}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iget-object v3, v0, LE3/S1;->p:LE3/M6;

    .line 351
    .line 352
    iget-object v3, v3, LE3/M6;->j:Lq2/Y;

    .line 353
    .line 354
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    const/4 v4, 0x0

    .line 359
    if-nez v3, :cond_e

    .line 360
    .line 361
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    goto :goto_a

    .line 366
    :cond_e
    move-object v3, v4

    .line 367
    :goto_a
    iget-object v5, v0, LE3/S1;->p:LE3/M6;

    .line 368
    .line 369
    iget-object v5, v5, LE3/M6;->j:Lq2/Y;

    .line 370
    .line 371
    invoke-virtual {v5}, Lq2/Y;->u()Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-eqz v5, :cond_10

    .line 376
    .line 377
    iget-object v5, v1, LE3/M6;->j:Lq2/Y;

    .line 378
    .line 379
    invoke-virtual {v5}, Lq2/Y;->u()Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-nez v5, :cond_f

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_f
    :goto_b
    move-object v5, v4

    .line 387
    move-object v4, v3

    .line 388
    goto :goto_d

    .line 389
    :cond_10
    :goto_c
    const/4 v4, 0x3

    .line 390
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    goto :goto_b

    .line 395
    :goto_d
    const/4 v3, 0x0

    .line 396
    invoke-direct/range {v0 .. v5}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 397
    .line 398
    .line 399
    return-void
.end method

.method public static synthetic s1(ILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->F(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s2(LE3/S1;LE3/r;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    iget-object p0, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 4
    .line 5
    invoke-interface {p1, v0, p2, p0}, LE3/r;->Z(LE3/q;ILandroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private s3(LE3/S1$d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->j:LE3/S1$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/S1$b;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE3/S1;->E:LE3/r;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {p0, v0, p1, v1}, LE3/S1;->r3(LE3/r;LE3/S1$d;Z)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private s4(ZI)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/S1;->g0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :cond_0
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 10
    .line 11
    iget-boolean v2, v1, LE3/M6;->t:Z

    .line 12
    .line 13
    if-ne v2, p1, :cond_1

    .line 14
    .line 15
    iget v2, v1, LE3/M6;->x:I

    .line 16
    .line 17
    if-ne v2, v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-wide v2, p0, LE3/S1;->G:J

    .line 21
    .line 22
    iget-wide v4, p0, LE3/S1;->H:J

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v6}, LE3/A;->f1()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    invoke-static/range {v1 .. v7}, LE3/L6;->e(LE3/M6;JJJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iput-wide v1, p0, LE3/S1;->G:J

    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    iput-wide v1, p0, LE3/S1;->H:J

    .line 43
    .line 44
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 45
    .line 46
    invoke-virtual {v1, p1, p2, v0}, LE3/M6;->j(ZII)LE3/M6;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    move-object v2, p0

    .line 58
    invoke-direct/range {v2 .. v7}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static synthetic t1(LE3/M6;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->j:Lq2/Y;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {p2, p0, p1}, Lq2/P$d;->S(Lq2/Y;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic t2(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, LE3/M6;->h:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->F(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private t3(LE3/S1$d;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/S1;->j:LE3/S1$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/S1$b;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE3/S1;->E:LE3/r;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {p0, v0, p1, v1}, LE3/S1;->r3(LE3/r;LE3/S1$d;Z)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-wide/16 v0, 0xbb8

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1, v0, v1}, LE3/t;->f0(Ljava/util/concurrent/Future;J)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception v0

    .line 20
    instance-of v1, p1, LE3/S6$a;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast p1, LE3/S6$a;

    .line 25
    .line 26
    invoke-virtual {p1}, LE3/S6$a;->L()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object v1, p0, LE3/S1;->k:Lt/b;

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Lt/b;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, LE3/S1;->b:LE3/S6;

    .line 40
    .line 41
    new-instance v2, LE3/X6;

    .line 42
    .line 43
    const/4 v3, -0x1

    .line 44
    invoke-direct {v2, v3}, LE3/X6;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1, v2}, LE3/S6;->e(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    const-string p1, "MCImplBase"

    .line 51
    .line 52
    const-string v1, "Synchronous command takes too long on the session side."

    .line 53
    .line 54
    invoke-static {p1, v1, v0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_1
    move-exception p1

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public static synthetic u1(LE3/S1;Landroid/app/PendingIntent;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p2, p0, p1}, LE3/A$c;->j0(LE3/A;Landroid/app/PendingIntent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic u2(LE3/S1;LE3/U6;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p2, p0, p1}, LE3/A$c;->i0(LE3/A;LE3/U6;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private u3(LE3/T6;LE3/S1$d;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2}, LE3/S1;->v3(ILE3/T6;LE3/S1$d;)Lcom/google/common/util/concurrent/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method private u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iput-object p1, p0, LE3/S1;->p:LE3/M6;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-direct/range {v0 .. v6}, LE3/S1;->S3(LE3/M6;LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic v1(LE3/M6;Lq2/P$d;)V
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/M6;->A:J

    .line 2
    .line 3
    invoke-interface {p1, v0, v1}, Lq2/P$d;->R(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic v2(LE3/S1;LE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, LE3/r;->n2(LE3/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private v3(ILE3/T6;LE3/S1$d;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, LE3/S1;->H3(LE3/T6;)LE3/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, LE3/S1;->G3(I)LE3/r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const/4 p2, 0x0

    .line 13
    invoke-direct {p0, p1, p3, p2}, LE3/S1;->r3(LE3/r;LE3/S1$d;Z)Lcom/google/common/util/concurrent/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method private v4(LE3/W6;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/S1;->k:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/b;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 10
    .line 11
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 12
    .line 13
    iget-wide v1, v0, LE3/W6;->c:J

    .line 14
    .line 15
    iget-wide v3, p1, LE3/W6;->c:J

    .line 16
    .line 17
    cmp-long v1, v1, v3

    .line 18
    .line 19
    if-gez v1, :cond_1

    .line 20
    .line 21
    invoke-static {p1, v0}, LE3/L6;->b(LE3/W6;LE3/W6;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, LE3/S1;->p:LE3/M6;

    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic w1(LE3/M6;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/M6;->m:Lq2/I;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->c0(Lq2/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic w2(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->i1(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic x1(Lq2/N;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->H(Lq2/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x2(LE3/S1;JLE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p3, p0, p4, p1, p2}, LE3/r;->v1(LE3/q;IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic y1(LE3/S1;LE3/A$c;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, LE3/S1;->u:LP9/u;

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic y2(LE3/S1;ILE3/r;I)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 2
    .line 3
    invoke-interface {p2, p0, p3, p1}, LE3/r;->V(LE3/q;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static y3(LE3/M6;)I
    .locals 1

    .line 1
    iget-object p0, p0, LE3/M6;->c:LE3/W6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/W6;->a:Lq2/P$e;

    .line 4
    .line 5
    iget p0, p0, Lq2/P$e;->c:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    return p0
.end method

.method public static synthetic z1(LE3/S1;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->n:LE3/S1$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LE3/S1;->d:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, LE3/S1;->n:LE3/S1$e;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, LE3/S1;->c:LE3/X2;

    .line 14
    .line 15
    invoke-virtual {p0}, LE3/X2;->V3()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic z2(LE3/M6;Lq2/P$d;)V
    .locals 1

    .line 1
    iget v0, p0, LE3/M6;->r:I

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Lq2/P$d;->P(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->E:LE3/r;

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

.method public A0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->F3()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public B(Landroid/view/Surface;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    invoke-direct {p0}, LE3/S1;->j3()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 14
    .line 15
    new-instance v0, LE3/q0;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, LE3/q0;-><init>(LE3/S1;Landroid/view/Surface;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, LE3/S1;->t3(LE3/S1$d;)V

    .line 21
    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, -0x1

    .line 28
    :goto_0
    invoke-direct {p0, p1, p1}, LE3/S1;->P3(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public B0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/W6;->a:Lq2/P$e;

    .line 6
    .line 7
    iget v0, v0, Lq2/P$e;->j:I

    .line 8
    .line 9
    return v0
.end method

.method public B3()I
    .locals 4

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 14
    .line 15
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, LE3/S1;->p:LE3/M6;

    .line 22
    .line 23
    iget v2, v2, LE3/M6;->h:I

    .line 24
    .line 25
    invoke-static {v2}, LE3/S1;->m3(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, p0, LE3/S1;->p:LE3/M6;

    .line 30
    .line 31
    iget-boolean v3, v3, LE3/M6;->i:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Lq2/Y;->i(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method public C(Lq2/I;)V
    .locals 2

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/u0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/u0;-><init>(LE3/S1;Lq2/I;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-object v0, v0, LE3/M6;->m:Lq2/I;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lq2/I;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LE3/M6;->n(Lq2/I;)LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 35
    .line 36
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 37
    .line 38
    new-instance v1, LE3/v0;

    .line 39
    .line 40
    invoke-direct {v1, p1}, LE3/v0;-><init>(Lq2/I;)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0xf

    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 49
    .line 50
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public C0(ILq2/C;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, LE3/W;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2}, LE3/W;-><init>(LE3/S1;ILq2/C;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, p1, 0x1

    .line 27
    .line 28
    invoke-static {p2}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-direct {p0, p1, v0, p2}, LE3/S1;->g4(IILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-boolean v0, v0, LE3/W6;->b:Z

    .line 6
    .line 7
    return v0
.end method

.method public D0(Ljava/util/List;IJ)V
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v1, LE3/M1;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    move v4, p2

    .line 15
    move-wide v5, p3

    .line 16
    invoke-direct/range {v1 .. v6}, LE3/M1;-><init>(LE3/S1;Ljava/util/List;IJ)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-direct/range {v2 .. v7}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public E()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->g:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public E0(I)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, LE3/H1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, LE3/H1;-><init>(LE3/S1;I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, v0, v1}, LE3/S1;->m4(IJ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public F(ZI)V
    .locals 1

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/f1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, LE3/f1;-><init>(LE3/S1;ZI)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-boolean v0, p2, LE3/M6;->s:Z

    .line 21
    .line 22
    if-eq v0, p1, :cond_1

    .line 23
    .line 24
    iget v0, p2, LE3/M6;->r:I

    .line 25
    .line 26
    invoke-virtual {p2, v0, p1}, LE3/M6;->d(IZ)LE3/M6;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 31
    .line 32
    iget-object p2, p0, LE3/S1;->i:Lt2/v;

    .line 33
    .line 34
    new-instance v0, LE3/g1;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, LE3/g1;-><init>(LE3/S1;Z)V

    .line 37
    .line 38
    .line 39
    const/16 p1, 0x1e

    .line 40
    .line 41
    invoke-virtual {p2, p1, v0}, Lt2/v;->h(ILt2/v$a;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 45
    .line 46
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public F0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-wide v0, v0, LE3/M6;->B:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public F3()I
    .locals 4

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 14
    .line 15
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, LE3/S1;->p:LE3/M6;

    .line 22
    .line 23
    iget v2, v2, LE3/M6;->h:I

    .line 24
    .line 25
    invoke-static {v2}, LE3/S1;->m3(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, p0, LE3/S1;->p:LE3/M6;

    .line 30
    .line 31
    iget-boolean v3, v3, LE3/M6;->i:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Lq2/Y;->p(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method public G()V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/i1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/i1;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, LE3/S1;->f4(II)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public G0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-boolean v1, v0, LE3/W6;->b:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LE3/S1;->getCurrentPosition()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, v0, LE3/W6;->a:Lq2/P$e;

    .line 15
    .line 16
    iget-wide v0, v0, Lq2/P$e;->h:J

    .line 17
    .line 18
    return-wide v0
.end method

.method G3(I)LE3/r;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LE3/S1;->w:LE3/U6;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LE3/U6;->b(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "Controller isn\'t allowed to call command, commandCode="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "MCImplBase"

    .line 35
    .line 36
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    return-object p1

    .line 41
    :cond_1
    iget-object p1, p0, LE3/S1;->E:LE3/r;

    .line 42
    .line 43
    return-object p1
.end method

.method public H(Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/v;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public H0(ILjava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, LE3/V;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2}, LE3/V;-><init>(LE3/S1;ILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, LE3/S1;->i3(ILjava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method H3(LE3/T6;)LE3/r;
    .locals 2

    .line 1
    iget v0, p1, LE3/T6;->a:I

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
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE3/S1;->w:LE3/U6;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LE3/U6;->c(LE3/T6;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "Controller isn\'t allowed to call custom session command:"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, LE3/T6;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "MCImplBase"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object p1, p0, LE3/S1;->E:LE3/r;

    .line 46
    .line 47
    return-object p1
.end method

.method public I()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget v0, v0, LE3/W6;->f:I

    .line 6
    .line 7
    return v0
.end method

.method public I0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->e:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public J()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, LE3/p0;

    .line 10
    .line 11
    invoke-direct {v0, p0}, LE3/p0;-><init>(LE3/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->F3()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, -0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->F3()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0, v1, v2}, LE3/S1;->m4(IJ)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public J0()Lq2/I;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->m:Lq2/I;

    .line 4
    .line 5
    return-object v0
.end method

.method J3()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/S1;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public K()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, LE3/P;

    .line 10
    .line 11
    invoke-direct {v0, p0}, LE3/P;-><init>(LE3/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, v1, v2}, LE3/S1;->m4(IJ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public K0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    invoke-static {v0}, LE3/S1;->y3(LE3/M6;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public L(Ljava/util/List;Z)V
    .locals 7

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/P1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, LE3/P1;-><init>(LE3/S1;Ljava/util/List;Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    move-object v1, p0

    .line 25
    move-object v2, p1

    .line 26
    move v6, p2

    .line 27
    invoke-direct/range {v1 .. v6}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public L0(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-virtual {p0, p1}, LE3/S1;->l3(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public M()V
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/C1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/C1;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget v0, v0, LE3/M6;->r:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v1, v1, Lq2/p;->b:I

    .line 29
    .line 30
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 33
    .line 34
    iget-boolean v2, v1, LE3/M6;->s:Z

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, LE3/M6;->d(IZ)LE3/M6;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 41
    .line 42
    iget-object v1, p0, LE3/S1;->i:Lt2/v;

    .line 43
    .line 44
    new-instance v2, LE3/D1;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0}, LE3/D1;-><init>(LE3/S1;I)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0x1e

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lt2/v;->h(ILt2/v$a;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 55
    .line 56
    invoke-virtual {v0}, Lt2/v;->f()V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

.method public M0(II)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-ltz p2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LE3/y1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1, p2}, LE3/y1;-><init>(LE3/S1;II)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x1

    .line 29
    .line 30
    invoke-direct {p0, p1, v0, p2}, LE3/S1;->Q3(III)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public N(I)V
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/n1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/n1;-><init>(LE3/S1;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget p1, p1, LE3/M6;->r:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, Lq2/p;->c:I

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    if-gt p1, v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    :goto_1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 37
    .line 38
    iget-boolean v1, v0, LE3/M6;->s:Z

    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, LE3/M6;->d(IZ)LE3/M6;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 45
    .line 46
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 47
    .line 48
    new-instance v1, LE3/o1;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1}, LE3/o1;-><init>(LE3/S1;I)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x1e

    .line 54
    .line 55
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 59
    .line 60
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public N0(III)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-gt p1, p2, :cond_1

    .line 13
    .line 14
    if-ltz p3, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v0, LE3/h1;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2, p3}, LE3/h1;-><init>(LE3/S1;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p2, p3}, LE3/S1;->Q3(III)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public O(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-virtual {p0, p1}, LE3/S1;->t4(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public O0(Ljava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/X;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/X;-><init>(LE3/S1;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->h0()Lq2/Y;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lq2/Y;->t()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-direct {p0, v0, p1}, LE3/S1;->i3(ILjava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public P(Lq2/d0;)V
    .locals 2

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/l0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/l0;-><init>(LE3/S1;Lq2/d0;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-object v1, v0, LE3/M6;->E:Lq2/d0;

    .line 21
    .line 22
    if-eq p1, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LE3/M6;->x(Lq2/d0;)LE3/M6;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 31
    .line 32
    new-instance v1, LE3/m0;

    .line 33
    .line 34
    invoke-direct {v1, p1}, LE3/m0;-><init>(Lq2/d0;)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x13

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 43
    .line 44
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public P0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean v0, v0, LE3/M6;->s:Z

    .line 4
    .line 5
    return v0
.end method

.method public Q(IILjava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-gt p1, p2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LE3/S;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3, p1, p2}, LE3/S;-><init>(LE3/S1;Ljava/util/List;II)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p2, p3}, LE3/S1;->g4(IILjava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public Q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean v0, v0, LE3/M6;->i:Z

    .line 4
    .line 5
    return v0
.end method

.method public R(I)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, LE3/J1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, LE3/J1;-><init>(LE3/S1;I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, p1, 0x1

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, LE3/S1;->f4(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public R0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->j:J

    .line 6
    .line 7
    return-wide v0
.end method

.method R3(LE3/W6;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, LE3/S1;->v4(LE3/W6;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/Y6;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LE3/S1;->n:LE3/S1$e;

    .line 11
    .line 12
    iget-object v0, p0, LE3/S1;->f:Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {p0, v0}, LE3/S1;->i4(Landroid/os/Bundle;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, LE3/S1$e;

    .line 20
    .line 21
    iget-object v1, p0, LE3/S1;->f:Landroid/os/Bundle;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, LE3/S1$e;-><init>(LE3/S1;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LE3/S1;->n:LE3/S1$e;

    .line 27
    .line 28
    invoke-direct {p0}, LE3/S1;->h4()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    new-instance v2, LE3/h0;

    .line 46
    .line 47
    invoke-direct {v2, v1}, LE3/h0;-><init>(LE3/A;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public S0(I)V
    .locals 3

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/A1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/A1;-><init>(LE3/S1;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 23
    .line 24
    iget v2, v1, LE3/M6;->r:I

    .line 25
    .line 26
    if-eq v2, p1, :cond_2

    .line 27
    .line 28
    iget v2, v0, Lq2/p;->b:I

    .line 29
    .line 30
    if-gt v2, p1, :cond_2

    .line 31
    .line 32
    iget v0, v0, Lq2/p;->c:I

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    if-gt p1, v0, :cond_2

    .line 37
    .line 38
    :cond_1
    iget-boolean v0, v1, LE3/M6;->s:Z

    .line 39
    .line 40
    invoke-virtual {v1, p1, v0}, LE3/M6;->d(IZ)LE3/M6;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 45
    .line 46
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 47
    .line 48
    new-instance v1, LE3/B1;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1}, LE3/B1;-><init>(LE3/S1;I)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x1e

    .line 54
    .line 55
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 59
    .line 60
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    return-void
.end method

.method public T(II)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-lt p2, p1, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LE3/I1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1, p2}, LE3/I1;-><init>(LE3/S1;II)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p2}, LE3/S1;->f4(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public T0()V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/k1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/k1;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->F0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-direct {p0, v0, v1}, LE3/S1;->n4(J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method T3(Lq2/P$b;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LE3/S1;->y:Lq2/P$b;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iput-object p1, p0, LE3/S1;->y:Lq2/P$b;

    .line 19
    .line 20
    iget-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 21
    .line 22
    iget-object v1, p0, LE3/S1;->x:Lq2/P$b;

    .line 23
    .line 24
    invoke-static {v1, p1}, LE3/S1;->n3(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LE3/S1;->z:Lq2/P$b;

    .line 29
    .line 30
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, LE3/S1;->t:LP9/u;

    .line 37
    .line 38
    iget-object v0, p0, LE3/S1;->u:LP9/u;

    .line 39
    .line 40
    iget-object v1, p0, LE3/S1;->s:LP9/u;

    .line 41
    .line 42
    iget-object v2, p0, LE3/S1;->r:LP9/u;

    .line 43
    .line 44
    iget-object v3, p0, LE3/S1;->w:LE3/U6;

    .line 45
    .line 46
    iget-object v4, p0, LE3/S1;->z:Lq2/P$b;

    .line 47
    .line 48
    iget-object v5, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-static {v1, v2, v3, v4, v5}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, LE3/S1;->t:LP9/u;

    .line 55
    .line 56
    iget-object v2, p0, LE3/S1;->r:LP9/u;

    .line 57
    .line 58
    iget-object v3, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 59
    .line 60
    iget-object v4, p0, LE3/S1;->w:LE3/U6;

    .line 61
    .line 62
    iget-object v5, p0, LE3/S1;->z:Lq2/P$b;

    .line 63
    .line 64
    invoke-static {v1, v2, v3, v4, v5}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p0, LE3/S1;->u:LP9/u;

    .line 69
    .line 70
    iget-object v1, p0, LE3/S1;->t:LP9/u;

    .line 71
    .line 72
    invoke-virtual {v1, p1}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    xor-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    xor-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    iget-object v1, p0, LE3/S1;->i:Lt2/v;

    .line 87
    .line 88
    new-instance v2, LE3/M;

    .line 89
    .line 90
    invoke-direct {v2, p0}, LE3/M;-><init>(LE3/S1;)V

    .line 91
    .line 92
    .line 93
    const/16 v3, 0xd

    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, Lt2/v;->k(ILt2/v$a;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    const/4 p1, 0x0

    .line 100
    move v0, p1

    .line 101
    :goto_0
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v1, LE3/N;

    .line 108
    .line 109
    invoke-direct {v1, p0}, LE3/N;-><init>(LE3/S1;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, LE3/A;->i1(Lt2/n;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    if-eqz p1, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, LE3/O;

    .line 122
    .line 123
    invoke-direct {v0, p0}, LE3/O;-><init>(LE3/S1;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, LE3/A;->i1(Lt2/n;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    return-void
.end method

.method public U()V
    .locals 7

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, LE3/a0;

    .line 10
    .line 11
    invoke-direct {v0, p0}, LE3/a0;-><init>(LE3/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->h0()Lq2/Y;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0}, LE3/S1;->D()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, LE3/S1;->A0()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    new-instance v3, Lq2/Y$d;

    .line 43
    .line 44
    invoke-direct {v3}, Lq2/Y$d;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2, v3}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-boolean v2, v0, Lq2/Y$d;->i:Z

    .line 52
    .line 53
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Lq2/Y$d;->g()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, LE3/S1;->F3()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-direct {p0, v0, v3, v4}, LE3/S1;->m4(IJ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, LE3/S1;->getCurrentPosition()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-virtual {p0}, LE3/S1;->s0()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    cmp-long v0, v0, v5

    .line 87
    .line 88
    if-gtz v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, LE3/S1;->F3()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-direct {p0, v0, v3, v4}, LE3/S1;->m4(IJ)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const-wide/16 v1, 0x0

    .line 103
    .line 104
    invoke-direct {p0, v0, v1, v2}, LE3/S1;->m4(IJ)V

    .line 105
    .line 106
    .line 107
    :cond_4
    :goto_0
    return-void
.end method

.method public U0()V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/d0;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/d0;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->X0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    neg-long v0, v0

    .line 23
    invoke-direct {p0, v0, v1}, LE3/S1;->n4(J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method U3(LE3/U6;Lq2/P$b;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LE3/S1;->x:Lq2/P$b;

    .line 10
    .line 11
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, LE3/S1;->w:LE3/U6;

    .line 16
    .line 17
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_1
    iput-object p1, p0, LE3/S1;->w:LE3/U6;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iput-object p2, p0, LE3/S1;->x:Lq2/P$b;

    .line 33
    .line 34
    iget-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 35
    .line 36
    iget-object v3, p0, LE3/S1;->y:Lq2/P$b;

    .line 37
    .line 38
    invoke-static {p2, v3}, LE3/S1;->n3(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, LE3/S1;->z:Lq2/P$b;

    .line 43
    .line 44
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    xor-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move p2, v2

    .line 52
    :goto_0
    if-eqz v1, :cond_4

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v0, v2

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_1
    iget-object v0, p0, LE3/S1;->t:LP9/u;

    .line 60
    .line 61
    iget-object v2, p0, LE3/S1;->u:LP9/u;

    .line 62
    .line 63
    iget-object v3, p0, LE3/S1;->s:LP9/u;

    .line 64
    .line 65
    iget-object v4, p0, LE3/S1;->r:LP9/u;

    .line 66
    .line 67
    iget-object v5, p0, LE3/S1;->z:Lq2/P$b;

    .line 68
    .line 69
    iget-object v6, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-static {v3, v4, p1, v5, v6}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iput-object v3, p0, LE3/S1;->t:LP9/u;

    .line 76
    .line 77
    iget-object v4, p0, LE3/S1;->r:LP9/u;

    .line 78
    .line 79
    iget-object v5, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 80
    .line 81
    iget-object v6, p0, LE3/S1;->z:Lq2/P$b;

    .line 82
    .line 83
    invoke-static {v3, v4, v5, p1, v6}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, p0, LE3/S1;->u:LP9/u;

    .line 88
    .line 89
    iget-object v3, p0, LE3/S1;->t:LP9/u;

    .line 90
    .line 91
    invoke-virtual {v3, v0}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    xor-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    iget-object v3, p0, LE3/S1;->u:LP9/u;

    .line 98
    .line 99
    invoke-virtual {v3, v2}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    xor-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    :goto_2
    if-eqz p2, :cond_5

    .line 106
    .line 107
    iget-object p2, p0, LE3/S1;->i:Lt2/v;

    .line 108
    .line 109
    new-instance v3, LE3/I;

    .line 110
    .line 111
    invoke-direct {v3, p0}, LE3/I;-><init>(LE3/S1;)V

    .line 112
    .line 113
    .line 114
    const/16 v4, 0xd

    .line 115
    .line 116
    invoke-virtual {p2, v4, v3}, Lt2/v;->k(ILt2/v$a;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    if-nez v1, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    new-instance v1, LE3/J;

    .line 126
    .line 127
    invoke-direct {v1, p0, p1}, LE3/J;-><init>(LE3/S1;LE3/U6;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v1}, LE3/A;->i1(Lt2/n;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    if-eqz v2, :cond_7

    .line 134
    .line 135
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    new-instance p2, LE3/K;

    .line 140
    .line 141
    invoke-direct {p2, p0}, LE3/K;-><init>(LE3/S1;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p2}, LE3/A;->i1(Lt2/n;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    if-eqz v0, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance p2, LE3/L;

    .line 154
    .line 155
    invoke-direct {p2, p0}, LE3/L;-><init>(LE3/S1;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, LE3/A;->i1(Lt2/n;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_3
    return-void
.end method

.method public V(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "MCImplBase"

    .line 11
    .line 12
    const-string v0, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    new-instance v1, LE3/x1;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, LE3/x1;-><init>(LE3/S1;Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, LE3/S1;->s4(ZI)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public V0()Lq2/I;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->z:Lq2/I;

    .line 4
    .line 5
    return-object v0
.end method

.method V3(LE3/m;)V
    .locals 11

    .line 1
    iget-object v0, p0, LE3/S1;->E:LE3/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "MCImplBase"

    .line 6
    .line 7
    const-string v0, "Cannot be notified about the connection result many times. Probably a bug or malicious app."

    .line 8
    .line 9
    invoke-static {p1, v0}, Lt2/w;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, LE3/A;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p1, LE3/m;->c:LE3/r;

    .line 21
    .line 22
    iput-object v0, p0, LE3/S1;->E:LE3/r;

    .line 23
    .line 24
    iget-object v0, p1, LE3/m;->d:Landroid/app/PendingIntent;

    .line 25
    .line 26
    iput-object v0, p0, LE3/S1;->q:Landroid/app/PendingIntent;

    .line 27
    .line 28
    iget-object v0, p1, LE3/m;->e:LE3/U6;

    .line 29
    .line 30
    iput-object v0, p0, LE3/S1;->w:LE3/U6;

    .line 31
    .line 32
    iget-object v0, p1, LE3/m;->f:Lq2/P$b;

    .line 33
    .line 34
    iput-object v0, p0, LE3/S1;->x:Lq2/P$b;

    .line 35
    .line 36
    iget-object v1, p1, LE3/m;->g:Lq2/P$b;

    .line 37
    .line 38
    iput-object v1, p0, LE3/S1;->y:Lq2/P$b;

    .line 39
    .line 40
    invoke-static {v0, v1}, LE3/S1;->n3(Lq2/P$b;Lq2/P$b;)Lq2/P$b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 45
    .line 46
    iget-object v1, p1, LE3/m;->k:LP9/u;

    .line 47
    .line 48
    iput-object v1, p0, LE3/S1;->r:LP9/u;

    .line 49
    .line 50
    iget-object v2, p1, LE3/m;->l:LP9/u;

    .line 51
    .line 52
    iput-object v2, p0, LE3/S1;->s:LP9/u;

    .line 53
    .line 54
    iget-object v3, p0, LE3/S1;->w:LE3/U6;

    .line 55
    .line 56
    iget-object v4, p1, LE3/m;->i:Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-static {v2, v1, v3, v0, v4}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, LE3/S1;->t:LP9/u;

    .line 63
    .line 64
    iget-object v1, p0, LE3/S1;->r:LP9/u;

    .line 65
    .line 66
    iget-object v2, p1, LE3/m;->i:Landroid/os/Bundle;

    .line 67
    .line 68
    iget-object v3, p0, LE3/S1;->w:LE3/U6;

    .line 69
    .line 70
    iget-object v4, p0, LE3/S1;->z:Lq2/P$b;

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3, v4}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, LE3/S1;->u:LP9/u;

    .line 77
    .line 78
    new-instance v0, LP9/v$a;

    .line 79
    .line 80
    invoke-direct {v0}, LP9/v$a;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    move v2, v1

    .line 85
    :goto_0
    iget-object v3, p1, LE3/m;->n:LP9/u;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-ge v2, v3, :cond_2

    .line 92
    .line 93
    iget-object v3, p1, LE3/m;->n:LP9/u;

    .line 94
    .line 95
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, LE3/b;

    .line 100
    .line 101
    iget-object v4, v3, LE3/b;->a:LE3/T6;

    .line 102
    .line 103
    if-eqz v4, :cond_1

    .line 104
    .line 105
    iget v5, v4, LE3/T6;->a:I

    .line 106
    .line 107
    if-nez v5, :cond_1

    .line 108
    .line 109
    iget-object v4, v4, LE3/T6;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v4, v3}, LP9/v$a;->f(Ljava/lang/Object;Ljava/lang/Object;)LP9/v$a;

    .line 112
    .line 113
    .line 114
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {v0}, LP9/v$a;->c()LP9/v;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, LE3/S1;->v:LP9/v;

    .line 122
    .line 123
    iget-object v0, p1, LE3/m;->j:LE3/M6;

    .line 124
    .line 125
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 126
    .line 127
    iget-object v0, p1, LE3/m;->m:Landroid/media/session/MediaSession$Token;

    .line 128
    .line 129
    if-nez v0, :cond_3

    .line 130
    .line 131
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 132
    .line 133
    invoke-virtual {v0}, LE3/Y6;->f()Landroid/media/session/MediaSession$Token;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_3
    move-object v10, v0

    .line 138
    if-eqz v10, :cond_4

    .line 139
    .line 140
    new-instance v0, Landroid/media/session/MediaController;

    .line 141
    .line 142
    iget-object v2, p0, LE3/S1;->d:Landroid/content/Context;

    .line 143
    .line 144
    invoke-direct {v0, v2, v10}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, LE3/S1;->F:Landroid/media/session/MediaController;

    .line 148
    .line 149
    :cond_4
    :try_start_0
    iget-object v0, p1, LE3/m;->c:LE3/r;

    .line 150
    .line 151
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v2, p0, LE3/S1;->g:Landroid/os/IBinder$DeathRecipient;

    .line 156
    .line 157
    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    new-instance v2, LE3/Y6;

    .line 161
    .line 162
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 163
    .line 164
    invoke-virtual {v0}, LE3/Y6;->i()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    iget v5, p1, LE3/m;->a:I

    .line 169
    .line 170
    iget v6, p1, LE3/m;->b:I

    .line 171
    .line 172
    iget-object v0, p0, LE3/S1;->e:LE3/Y6;

    .line 173
    .line 174
    invoke-virtual {v0}, LE3/Y6;->e()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    iget-object v8, p1, LE3/m;->c:LE3/r;

    .line 179
    .line 180
    iget-object v9, p1, LE3/m;->h:Landroid/os/Bundle;

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    invoke-direct/range {v2 .. v10}, LE3/Y6;-><init>(IIIILjava/lang/String;LE3/r;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 184
    .line 185
    .line 186
    iput-object v2, p0, LE3/S1;->m:LE3/Y6;

    .line 187
    .line 188
    iget-object p1, p1, LE3/m;->i:Landroid/os/Bundle;

    .line 189
    .line 190
    iput-object p1, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 191
    .line 192
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1}, LE3/A;->h1()V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :catch_0
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, LE3/A;->a()V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public W()V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/z1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/z1;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->B3()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LE3/S1;->B3()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, v1, v2}, LE3/S1;->m4(IJ)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method

.method public W0(Lq2/c;Z)V
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/E1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, LE3/E1;-><init>(LE3/S1;Lq2/c;Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-object p2, p2, LE3/M6;->o:Lq2/c;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lq2/c;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, LE3/M6;->a(Lq2/c;)LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 35
    .line 36
    iget-object p2, p0, LE3/S1;->i:Lt2/v;

    .line 37
    .line 38
    new-instance v0, LE3/F1;

    .line 39
    .line 40
    invoke-direct {v0, p1}, LE3/F1;-><init>(Lq2/c;)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0x14

    .line 44
    .line 45
    invoke-virtual {p2, p1, v0}, Lt2/v;->h(ILt2/v$a;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 49
    .line 50
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method W3(ILE3/T6;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LE3/F;

    .line 13
    .line 14
    invoke-direct {v1, p0, p2, p3, p1}, LE3/F;-><init>(LE3/S1;LE3/T6;Landroid/os/Bundle;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LE3/A;->i1(Lt2/n;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public X(I)V
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/r0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/r0;-><init>(LE3/S1;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget p1, p1, LE3/M6;->r:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, Lq2/p;->b:I

    .line 29
    .line 30
    if-lt p1, v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 33
    .line 34
    iget-boolean v1, v0, LE3/M6;->s:Z

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, LE3/M6;->d(IZ)LE3/M6;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 41
    .line 42
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 43
    .line 44
    new-instance v1, LE3/t0;

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, LE3/t0;-><init>(LE3/S1;I)V

    .line 47
    .line 48
    .line 49
    const/16 p1, 0x1e

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 55
    .line 56
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

.method public X0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-wide v0, v0, LE3/M6;->A:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public X3(ILE3/V6;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, LE3/H;

    .line 13
    .line 14
    invoke-direct {v0, p0, p2}, LE3/H;-><init>(LE3/S1;LE3/V6;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, LE3/A;->i1(Lt2/n;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public Y()Lq2/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->D:Lq2/h0;

    .line 4
    .line 5
    return-object v0
.end method

.method public Y0()LE3/U6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->w:LE3/U6;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y3(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LE3/S1;->t:LP9/u;

    .line 9
    .line 10
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 11
    .line 12
    iput-object p1, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 13
    .line 14
    iget-object v2, p0, LE3/S1;->s:LP9/u;

    .line 15
    .line 16
    iget-object v3, p0, LE3/S1;->r:LP9/u;

    .line 17
    .line 18
    iget-object v4, p0, LE3/S1;->w:LE3/U6;

    .line 19
    .line 20
    iget-object v5, p0, LE3/S1;->z:Lq2/P$b;

    .line 21
    .line 22
    invoke-static {v2, v3, v4, v5, p1}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p0, LE3/S1;->t:LP9/u;

    .line 27
    .line 28
    iget-object v3, p0, LE3/S1;->r:LP9/u;

    .line 29
    .line 30
    iget-object v4, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 31
    .line 32
    iget-object v5, p0, LE3/S1;->w:LE3/U6;

    .line 33
    .line 34
    iget-object v6, p0, LE3/S1;->z:Lq2/P$b;

    .line 35
    .line 36
    invoke-static {v2, v3, v4, v5, v6}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p0, LE3/S1;->u:LP9/u;

    .line 41
    .line 42
    iget-object v2, p0, LE3/S1;->t:LP9/u;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    xor-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    iget-object v2, p0, LE3/S1;->u:LP9/u;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    xor-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, LE3/N1;

    .line 63
    .line 64
    invoke-direct {v3, p0, p1, v1, v0}, LE3/N1;-><init>(LE3/S1;Landroid/os/Bundle;ZZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v3}, LE3/A;->i1(Lt2/n;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public Z()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/S1;->B3()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public Z0(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    new-instance v0, LE3/R1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LE3/R1;-><init>(LE3/S1;LE3/T6;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, LE3/S1;->u3(LE3/T6;LE3/S1$d;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method Z3(LE3/M6;LE3/M6$c;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, LE3/S1;->I:LE3/M6;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, LE3/S1;->z:Lq2/P$b;

    .line 14
    .line 15
    invoke-static {v0, p1, p2, v2}, LE3/L6;->g(LE3/M6;LE3/M6;LE3/M6$c;Lq2/P$b;)LE3/M6;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, LE3/S1;->I:LE3/M6;

    .line 20
    .line 21
    iget-object p1, p0, LE3/S1;->k:Lt/b;

    .line 22
    .line 23
    invoke-virtual {p1}, Lt/b;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, LE3/S1;->I:LE3/M6;

    .line 30
    .line 31
    sget-object p2, LE3/M6$c;->c:LE3/M6$c;

    .line 32
    .line 33
    iput-object v1, p0, LE3/S1;->I:LE3/M6;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    return-void

    .line 37
    :cond_2
    :goto_1
    iget-object v3, p0, LE3/S1;->p:LE3/M6;

    .line 38
    .line 39
    iget-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 40
    .line 41
    invoke-static {v3, p1, p2, v0}, LE3/L6;->g(LE3/M6;LE3/M6;LE3/M6$c;Lq2/P$b;)LE3/M6;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iput-object v4, p0, LE3/S1;->p:LE3/M6;

    .line 46
    .line 47
    iget-object p2, v3, LE3/M6;->d:Lq2/P$e;

    .line 48
    .line 49
    iget-object v0, p1, LE3/M6;->d:Lq2/P$e;

    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lq2/P$e;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    iget-object p2, v3, LE3/M6;->e:Lq2/P$e;

    .line 58
    .line 59
    iget-object p1, p1, LE3/M6;->e:Lq2/P$e;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lq2/P$e;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-object v7, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_2
    iget p1, v4, LE3/M6;->f:I

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v7, p1

    .line 77
    :goto_3
    invoke-virtual {v3}, LE3/M6;->C()Lq2/C;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v4}, LE3/M6;->C()Lq2/C;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    iget p1, v4, LE3/M6;->b:I

    .line 92
    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    move-object v8, p1

    .line 98
    goto :goto_4

    .line 99
    :cond_5
    move-object v8, v1

    .line 100
    :goto_4
    iget-object p1, v3, LE3/M6;->j:Lq2/Y;

    .line 101
    .line 102
    iget-object p2, v4, LE3/M6;->j:Lq2/Y;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lq2/Y;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    iget p1, v4, LE3/M6;->k:I

    .line 111
    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move-object v5, p1

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    move-object v5, v1

    .line 119
    :goto_5
    iget p1, v3, LE3/M6;->u:I

    .line 120
    .line 121
    iget p2, v4, LE3/M6;->u:I

    .line 122
    .line 123
    if-ne p1, p2, :cond_8

    .line 124
    .line 125
    iget-boolean p1, v3, LE3/M6;->t:Z

    .line 126
    .line 127
    iget-boolean v0, v4, LE3/M6;->t:Z

    .line 128
    .line 129
    if-eq p1, v0, :cond_7

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_7
    :goto_6
    move-object v2, p0

    .line 133
    move-object v6, v1

    .line 134
    goto :goto_8

    .line 135
    :cond_8
    :goto_7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    goto :goto_6

    .line 140
    :goto_8
    invoke-direct/range {v2 .. v8}, LE3/S1;->S3(LE3/M6;LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/S1;->E:LE3/r;

    .line 2
    .line 3
    iget-boolean v1, p0, LE3/S1;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, LE3/S1;->o:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, LE3/S1;->m:LE3/Y6;

    .line 13
    .line 14
    iget-object v2, p0, LE3/S1;->l:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, LE3/S1;->j:LE3/S1$b;

    .line 20
    .line 21
    invoke-virtual {v2}, LE3/S1$b;->d()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, LE3/S1;->E:LE3/r;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, LE3/S1;->b:LE3/S6;

    .line 29
    .line 30
    invoke-virtual {v1}, LE3/S6;->c()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :try_start_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, p0, LE3/S1;->g:Landroid/os/IBinder$DeathRecipient;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-interface {v2, v3, v4}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LE3/S1;->c:LE3/X2;

    .line 45
    .line 46
    invoke-interface {v0, v2, v1}, LE3/r;->V2(LE3/q;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :catch_0
    :cond_1
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 50
    .line 51
    invoke-virtual {v0}, Lt2/v;->i()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LE3/S1;->b:LE3/S6;

    .line 55
    .line 56
    new-instance v1, LE3/e1;

    .line 57
    .line 58
    invoke-direct {v1, p0}, LE3/e1;-><init>(LE3/S1;)V

    .line 59
    .line 60
    .line 61
    const-wide/16 v2, 0x7530

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3, v1}, LE3/S6;->b(JLjava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public a0(Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/v;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a1()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->f:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public a4()V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 2
    .line 3
    new-instance v1, LA2/H;

    .line 4
    .line 5
    invoke-direct {v1}, LA2/H;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b0()Ls2/e;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->p:Ls2/e;

    .line 4
    .line 5
    return-object v0
.end method

.method b4(ILjava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LE3/S1;->t:LP9/u;

    .line 9
    .line 10
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 11
    .line 12
    invoke-static {p2}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, p0, LE3/S1;->r:LP9/u;

    .line 17
    .line 18
    iget-object v2, p0, LE3/S1;->s:LP9/u;

    .line 19
    .line 20
    iget-object v3, p0, LE3/S1;->w:LE3/U6;

    .line 21
    .line 22
    iget-object v4, p0, LE3/S1;->z:Lq2/P$b;

    .line 23
    .line 24
    iget-object v5, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-static {v2, p2, v3, v4, v5}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, p0, LE3/S1;->t:LP9/u;

    .line 31
    .line 32
    iget-object v3, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 33
    .line 34
    iget-object v4, p0, LE3/S1;->w:LE3/U6;

    .line 35
    .line 36
    iget-object v5, p0, LE3/S1;->z:Lq2/P$b;

    .line 37
    .line 38
    invoke-static {v2, p2, v3, v4, v5}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, LE3/S1;->u:LP9/u;

    .line 43
    .line 44
    iget-object p2, p0, LE3/S1;->t:LP9/u;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    xor-int/lit8 p2, p2, 0x1

    .line 51
    .line 52
    iget-object v0, p0, LE3/S1;->u:LP9/u;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    xor-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, LE3/G;

    .line 65
    .line 66
    invoke-direct {v2, p0, v0, p2, p1}, LE3/G;-><init>(LE3/S1;ZZI)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, LE3/A;->i1(Lt2/n;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->g:Lq2/O;

    .line 4
    .line 5
    return-object v0
.end method

.method public c0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/W6;->a:Lq2/P$e;

    .line 6
    .line 7
    iget v0, v0, Lq2/P$e;->i:I

    .line 8
    .line 9
    return v0
.end method

.method c4(ILjava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LE3/S1;->t:LP9/u;

    .line 9
    .line 10
    iget-object v1, p0, LE3/S1;->u:LP9/u;

    .line 11
    .line 12
    invoke-static {p2}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, p0, LE3/S1;->s:LP9/u;

    .line 17
    .line 18
    iget-object v2, p0, LE3/S1;->r:LP9/u;

    .line 19
    .line 20
    iget-object v3, p0, LE3/S1;->w:LE3/U6;

    .line 21
    .line 22
    iget-object v4, p0, LE3/S1;->z:Lq2/P$b;

    .line 23
    .line 24
    iget-object v5, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-static {p2, v2, v3, v4, v5}, LE3/S1;->k4(Ljava/util/List;Ljava/util/List;LE3/U6;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, LE3/S1;->t:LP9/u;

    .line 31
    .line 32
    iget-object v2, p0, LE3/S1;->r:LP9/u;

    .line 33
    .line 34
    iget-object v3, p0, LE3/S1;->J:Landroid/os/Bundle;

    .line 35
    .line 36
    iget-object v4, p0, LE3/S1;->w:LE3/U6;

    .line 37
    .line 38
    iget-object v5, p0, LE3/S1;->z:Lq2/P$b;

    .line 39
    .line 40
    invoke-static {p2, v2, v3, v4, v5}, LE3/S1;->j4(Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;LE3/U6;Lq2/P$b;)LP9/u;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, LE3/S1;->u:LP9/u;

    .line 45
    .line 46
    iget-object p2, p0, LE3/S1;->t:LP9/u;

    .line 47
    .line 48
    invoke-virtual {p2, v0}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    xor-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    iget-object v0, p0, LE3/S1;->u:LP9/u;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    xor-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, LE3/O1;

    .line 67
    .line 68
    invoke-direct {v2, p0, v0, p2, p1}, LE3/O1;-><init>(LE3/S1;ZZI)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, LE3/A;->i1(Lt2/n;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public d0(Lq2/C;Z)V
    .locals 7

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/Q;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, LE3/Q;-><init>(LE3/S1;Lq2/C;Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, -0x1

    .line 23
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    move-object v1, p0

    .line 29
    move v6, p2

    .line 30
    invoke-direct/range {v1 .. v6}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public d4(ILandroid/app/PendingIntent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/S1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, LE3/S1;->q:Landroid/app/PendingIntent;

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object p2, p0, LE3/S1;->q:Landroid/app/PendingIntent;

    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, LE3/Q1;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, LE3/Q1;-><init>(LE3/S1;Landroid/app/PendingIntent;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, LE3/A;->i1(Lt2/n;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lq2/O;)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/s0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/s0;-><init>(LE3/S1;Lq2/O;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-object v0, v0, LE3/M6;->g:Lq2/O;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LE3/M6;->k(Lq2/O;)LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 35
    .line 36
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 37
    .line 38
    new-instance v1, LE3/D0;

    .line 39
    .line 40
    invoke-direct {v1, p1}, LE3/D0;-><init>(Lq2/O;)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0xc

    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 49
    .line 50
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public e0(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/r1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/r1;-><init>(LE3/S1;Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-boolean v1, v0, LE3/M6;->s:Z

    .line 21
    .line 22
    if-eq v1, p1, :cond_1

    .line 23
    .line 24
    iget v1, v0, LE3/M6;->r:I

    .line 25
    .line 26
    invoke-virtual {v0, v1, p1}, LE3/M6;->d(IZ)LE3/M6;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 31
    .line 32
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 33
    .line 34
    new-instance v1, LE3/s1;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1}, LE3/s1;-><init>(LE3/S1;Z)V

    .line 37
    .line 38
    .line 39
    const/16 p1, 0x1e

    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 45
    .line 46
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public f0(Lq2/C;J)V
    .locals 7

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    new-instance v0, LE3/L1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2, p3}, LE3/L1;-><init>(LE3/S1;Lq2/C;J)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, -0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-wide v4, p2

    .line 26
    invoke-direct/range {v1 .. v6}, LE3/S1;->r4(Ljava/util/List;IJZ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public g0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget v0, v0, LE3/M6;->x:I

    .line 4
    .line 5
    return v0
.end method

.method public getCurrentPosition()J
    .locals 7

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-wide v1, p0, LE3/S1;->G:J

    .line 4
    .line 5
    iget-wide v3, p0, LE3/S1;->H:J

    .line 6
    .line 7
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {v5}, LE3/A;->f1()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    invoke-static/range {v0 .. v6}, LE3/L6;->e(LE3/M6;JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, LE3/S1;->G:J

    .line 20
    .line 21
    return-wide v0
.end method

.method public getDeviceInfo()Lq2/p;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->q:Lq2/p;

    .line 4
    .line 5
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->d:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public h0()Lq2/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 4
    .line 5
    return-object v0
.end method

.method public i0()V
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/j1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/j1;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget v0, v0, LE3/M6;->r:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v1, v1, Lq2/p;->c:I

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-gt v0, v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    :goto_1
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 37
    .line 38
    iget-boolean v2, v1, LE3/M6;->s:Z

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LE3/M6;->d(IZ)LE3/M6;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 45
    .line 46
    iget-object v1, p0, LE3/S1;->i:Lt2/v;

    .line 47
    .line 48
    new-instance v2, LE3/l1;

    .line 49
    .line 50
    invoke-direct {v2, p0, v0}, LE3/l1;-><init>(LE3/S1;I)V

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x1e

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lt2/v;->h(ILt2/v$a;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 59
    .line 60
    invoke-virtual {v0}, Lt2/v;->f()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean v0, v0, LE3/M6;->v:Z

    .line 4
    .line 5
    return v0
.end method

.method public j0()Lq2/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->E:Lq2/d0;

    .line 4
    .line 5
    return-object v0
.end method

.method public k0()V
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/E;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LE3/E;-><init>(LE3/S1;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->h0()Lq2/Y;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, LE3/S1;->D()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, LE3/S1;->Z()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, LE3/S1;->B3()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-direct {p0, v0, v2, v3}, LE3/S1;->m4(IJ)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    new-instance v4, Lq2/Y$d;

    .line 59
    .line 60
    invoke-direct {v4}, Lq2/Y$d;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-boolean v1, v0, Lq2/Y$d;->i:Z

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lq2/Y$d;->g()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-direct {p0, v0, v2, v3}, LE3/S1;->m4(IJ)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_0
    return-void
.end method

.method public k3()V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    invoke-direct {p0}, LE3/S1;->j3()V

    .line 11
    .line 12
    .line 13
    new-instance v0, LE3/Z0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, LE3/Z0;-><init>(LE3/S1;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, LE3/S1;->t3(LE3/S1$d;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, v0, v0}, LE3/S1;->P3(II)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public l0(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LE3/S1;->k3()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 17
    .line 18
    if-ne v0, p1, :cond_2

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_2
    invoke-direct {p0}, LE3/S1;->j3()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 25
    .line 26
    iget-object v0, p0, LE3/S1;->h:LE3/S1$f;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    new-instance p1, LE3/n0;

    .line 38
    .line 39
    invoke-direct {p1, p0}, LE3/n0;-><init>(LE3/S1;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, LE3/S1;->t3(LE3/S1$d;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-direct {p0, p1, p1}, LE3/S1;->P3(II)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    new-instance v1, Landroid/view/Surface;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 56
    .line 57
    new-instance v0, LE3/o0;

    .line 58
    .line 59
    invoke-direct {v0, p0}, LE3/o0;-><init>(LE3/S1;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v0}, LE3/S1;->t3(LE3/S1$d;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-direct {p0, v0, p1}, LE3/S1;->P3(II)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public l3(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 13
    .line 14
    if-eq v0, p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, LE3/S1;->k3()V

    .line 18
    .line 19
    .line 20
    :cond_2
    :goto_0
    return-void
.end method

.method public m0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget v0, v0, LE3/M6;->r:I

    .line 4
    .line 5
    return v0
.end method

.method public n0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->h:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public o0(IJ)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

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
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, LE3/f0;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2, p3}, LE3/f0;-><init>(LE3/S1;IJ)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2, p3}, LE3/S1;->m4(IJ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget v0, v0, LE3/M6;->y:I

    .line 4
    .line 5
    return v0
.end method

.method public p0()Lq2/P$b;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->z:Lq2/P$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public pause()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, LE3/e0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LE3/e0;-><init>(LE3/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p0, v1, v0}, LE3/S1;->s4(ZI)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean v0, v0, LE3/M6;->w:Z

    .line 4
    .line 5
    return v0
.end method

.method public q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-boolean v0, v0, LE3/M6;->t:Z

    .line 4
    .line 5
    return v0
.end method

.method q4(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->b:LE3/S6;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE3/S6;->e(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LE3/S1;->z3()LE3/A;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, LE3/m1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/m1;-><init>(LE3/S1;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public r0(Z)V
    .locals 2

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/Y;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/Y;-><init>(LE3/S1;Z)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-boolean v1, v0, LE3/M6;->i:Z

    .line 21
    .line 22
    if-eq v1, p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LE3/M6;->t(Z)LE3/M6;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 31
    .line 32
    new-instance v1, LE3/Z;

    .line 33
    .line 34
    invoke-direct {v1, p1}, LE3/Z;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x9

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 43
    .line 44
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public s()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, LE3/i0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LE3/i0;-><init>(LE3/S1;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LE3/S1;->p:LE3/M6;

    .line 18
    .line 19
    iget v2, v1, LE3/M6;->y:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_2

    .line 23
    .line 24
    iget-object v2, v1, LE3/M6;->j:Lq2/Y;

    .line 25
    .line 26
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    :cond_1
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v0, v2}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    move-object v3, p0

    .line 43
    invoke-direct/range {v3 .. v8}, LE3/S1;->u4(LE3/M6;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method

.method public s0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-wide v0, v0, LE3/M6;->C:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public stop()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LE3/S1;->I3(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    new-instance v1, LE3/p1;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LE3/p1;-><init>(LE3/S1;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, LE3/S1;->p:LE3/M6;

    .line 21
    .line 22
    new-instance v2, LE3/W6;

    .line 23
    .line 24
    iget-object v3, v0, LE3/S1;->p:LE3/M6;

    .line 25
    .line 26
    iget-object v3, v3, LE3/M6;->c:LE3/W6;

    .line 27
    .line 28
    iget-object v4, v3, LE3/W6;->a:Lq2/P$e;

    .line 29
    .line 30
    iget-boolean v3, v3, LE3/W6;->b:Z

    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    iget-object v7, v0, LE3/S1;->p:LE3/M6;

    .line 37
    .line 38
    iget-object v7, v7, LE3/M6;->c:LE3/W6;

    .line 39
    .line 40
    iget-wide v8, v7, LE3/W6;->d:J

    .line 41
    .line 42
    iget-object v7, v7, LE3/W6;->a:Lq2/P$e;

    .line 43
    .line 44
    iget-wide v10, v7, Lq2/P$e;->g:J

    .line 45
    .line 46
    move-wide v12, v10

    .line 47
    invoke-static {v12, v13, v8, v9}, LE3/L6;->c(JJ)I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    iget-object v7, v0, LE3/S1;->p:LE3/M6;

    .line 52
    .line 53
    iget-object v7, v7, LE3/M6;->c:LE3/W6;

    .line 54
    .line 55
    iget-wide v14, v7, LE3/W6;->h:J

    .line 56
    .line 57
    move-object v10, v2

    .line 58
    move/from16 v16, v3

    .line 59
    .line 60
    iget-wide v2, v7, LE3/W6;->i:J

    .line 61
    .line 62
    iget-object v7, v7, LE3/W6;->a:Lq2/P$e;

    .line 63
    .line 64
    move-wide/from16 v17, v2

    .line 65
    .line 66
    iget-wide v2, v7, Lq2/P$e;->g:J

    .line 67
    .line 68
    move-wide/from16 v20, v2

    .line 69
    .line 70
    move-object v3, v4

    .line 71
    move/from16 v4, v16

    .line 72
    .line 73
    move-wide/from16 v16, v17

    .line 74
    .line 75
    move-wide/from16 v18, v20

    .line 76
    .line 77
    move-wide v7, v8

    .line 78
    move-object v2, v10

    .line 79
    move-wide v9, v12

    .line 80
    const-wide/16 v12, 0x0

    .line 81
    .line 82
    invoke-direct/range {v2 .. v19}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v0, LE3/S1;->p:LE3/M6;

    .line 90
    .line 91
    iget v2, v1, LE3/M6;->y:I

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    if-eq v2, v3, :cond_1

    .line 95
    .line 96
    iget-object v2, v1, LE3/M6;->a:Lq2/N;

    .line 97
    .line 98
    invoke-virtual {v1, v3, v2}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, v0, LE3/S1;->p:LE3/M6;

    .line 103
    .line 104
    iget-object v1, v0, LE3/S1;->i:Lt2/v;

    .line 105
    .line 106
    new-instance v2, LE3/q1;

    .line 107
    .line 108
    invoke-direct {v2}, LE3/q1;-><init>()V

    .line 109
    .line 110
    .line 111
    const/4 v3, 0x4

    .line 112
    invoke-virtual {v1, v3, v2}, Lt2/v;->h(ILt2/v$a;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, LE3/S1;->i:Lt2/v;

    .line 116
    .line 117
    invoke-virtual {v1}, Lt2/v;->f()V

    .line 118
    .line 119
    .line 120
    :cond_1
    :goto_0
    return-void
.end method

.method public t(F)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/c1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/c1;-><init>(LE3/S1;F)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget-object v0, v0, LE3/M6;->g:Lq2/O;

    .line 21
    .line 22
    iget v1, v0, Lq2/O;->a:F

    .line 23
    .line 24
    cmpl-float v1, v1, p1

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lq2/O;->d(F)Lq2/O;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, LE3/M6;->k(Lq2/O;)LE3/M6;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 39
    .line 40
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 41
    .line 42
    new-instance v1, LE3/d1;

    .line 43
    .line 44
    invoke-direct {v1, p1}, LE3/d1;-><init>(Lq2/O;)V

    .line 45
    .line 46
    .line 47
    const/16 p1, 0xc

    .line 48
    .line 49
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 53
    .line 54
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    return-void
.end method

.method public t0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/W6;->i:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public t4(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LE3/S1;->k3()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 17
    .line 18
    if-ne v0, p1, :cond_2

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_2
    invoke-direct {p0}, LE3/S1;->j3()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LE3/S1;->B:Landroid/view/SurfaceHolder;

    .line 25
    .line 26
    iget-object v0, p0, LE3/S1;->h:LE3/S1$f;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iput-object v0, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 44
    .line 45
    new-instance v1, LE3/v1;

    .line 46
    .line 47
    invoke-direct {v1, p0, v0}, LE3/v1;-><init>(LE3/S1;Landroid/view/Surface;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1}, LE3/S1;->t3(LE3/S1$d;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-direct {p0, v0, p1}, LE3/S1;->P3(II)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const/4 p1, 0x0

    .line 70
    iput-object p1, p0, LE3/S1;->A:Landroid/view/Surface;

    .line 71
    .line 72
    new-instance p1, LE3/G1;

    .line 73
    .line 74
    invoke-direct {p1, p0}, LE3/G1;-><init>(LE3/S1;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, p1}, LE3/S1;->t3(LE3/S1$d;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1, p1}, LE3/S1;->P3(II)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public u()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v0, "MCImplBase"

    .line 9
    .line 10
    const-string v1, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1f

    .line 19
    .line 20
    if-lt v1, v2, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, LE3/S1;->F:Landroid/media/session/MediaController;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v1, v2, v3}, Landroid/media/session/MediaController$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v1, LE3/g0;

    .line 37
    .line 38
    invoke-direct {v1, p0}, LE3/g0;-><init>(LE3/S1;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1}, LE3/S1;->s3(LE3/S1$d;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v0, v0}, LE3/S1;->s4(ZI)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public u0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/W6;->a:Lq2/P$e;

    .line 6
    .line 7
    iget v0, v0, Lq2/P$e;->f:I

    .line 8
    .line 9
    return v0
.end method

.method public v(I)V
    .locals 2

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/j0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/j0;-><init>(LE3/S1;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget v1, v0, LE3/M6;->h:I

    .line 21
    .line 22
    if-eq v1, p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LE3/M6;->p(I)LE3/M6;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 29
    .line 30
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 31
    .line 32
    new-instance v1, LE3/k0;

    .line 33
    .line 34
    invoke-direct {v1, p1}, LE3/k0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x8

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 43
    .line 44
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public v0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, LE3/S1;->C:Landroid/view/TextureView;

    .line 13
    .line 14
    if-eq v0, p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, LE3/S1;->k3()V

    .line 18
    .line 19
    .line 20
    :cond_2
    :goto_0
    return-void
.end method

.method public w(F)V
    .locals 2

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/t1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, LE3/t1;-><init>(LE3/S1;F)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 19
    .line 20
    iget v1, v0, LE3/M6;->n:F

    .line 21
    .line 22
    cmpl-float v1, v1, p1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LE3/M6;->z(F)LE3/M6;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 31
    .line 32
    iget-object v0, p0, LE3/S1;->i:Lt2/v;

    .line 33
    .line 34
    new-instance v1, LE3/u1;

    .line 35
    .line 36
    invoke-direct {v1, p1}, LE3/u1;-><init>(F)V

    .line 37
    .line 38
    .line 39
    const/16 p1, 0x16

    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 45
    .line 46
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public w0()Lq2/l0;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->l:Lq2/l0;

    .line 4
    .line 5
    return-object v0
.end method

.method public w3()LE3/Y6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->m:LE3/Y6;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget v0, v0, LE3/M6;->h:I

    .line 4
    .line 5
    return v0
.end method

.method public x0()F
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget v0, v0, LE3/M6;->n:F

    .line 4
    .line 5
    return v0
.end method

.method public x3()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->d:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()Lq2/N;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->a:Lq2/N;

    .line 4
    .line 5
    return-object v0
.end method

.method public y0()Lq2/c;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 2
    .line 3
    iget-object v0, v0, LE3/M6;->o:Lq2/c;

    .line 4
    .line 5
    return-object v0
.end method

.method public z(J)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, LE3/O0;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, LE3/O0;-><init>(LE3/S1;J)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LE3/S1;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p0, v0, p1, p2}, LE3/S1;->m4(IJ)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public z0(II)V
    .locals 2

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/S1;->I3(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/a1;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, LE3/a1;-><init>(LE3/S1;II)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, LE3/S1;->s3(LE3/S1$d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE3/S1;->getDeviceInfo()Lq2/p;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object v0, p0, LE3/S1;->p:LE3/M6;

    .line 23
    .line 24
    iget v1, v0, LE3/M6;->r:I

    .line 25
    .line 26
    if-eq v1, p1, :cond_2

    .line 27
    .line 28
    iget v1, p2, Lq2/p;->b:I

    .line 29
    .line 30
    if-gt v1, p1, :cond_2

    .line 31
    .line 32
    iget p2, p2, Lq2/p;->c:I

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    if-gt p1, p2, :cond_2

    .line 37
    .line 38
    :cond_1
    iget-boolean p2, v0, LE3/M6;->s:Z

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, LE3/M6;->d(IZ)LE3/M6;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, LE3/S1;->p:LE3/M6;

    .line 45
    .line 46
    iget-object p2, p0, LE3/S1;->i:Lt2/v;

    .line 47
    .line 48
    new-instance v0, LE3/b1;

    .line 49
    .line 50
    invoke-direct {v0, p0, p1}, LE3/b1;-><init>(LE3/S1;I)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x1e

    .line 54
    .line 55
    invoke-virtual {p2, p1, v0}, Lt2/v;->h(ILt2/v$a;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LE3/S1;->i:Lt2/v;

    .line 59
    .line 60
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    return-void
.end method

.method z3()LE3/A;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S1;->a:LE3/A;

    .line 2
    .line 3
    return-object v0
.end method
