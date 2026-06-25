.class public final LS2/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/k0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS2/q$b;,
        LS2/q$c;,
        LS2/q$d;,
        LS2/q$g;,
        LS2/q$e;,
        LS2/q$f;
    }
.end annotation


# static fields
.field private static final A:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lq2/k0$a;

.field private final c:Landroid/util/SparseArray;

.field private final d:Z

.field private final e:LS2/L;

.field private final f:LS2/L$b;

.field private final g:Lt2/j;

.field private final h:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private i:Lt2/N;

.field private j:Lq2/x;

.field private k:Lq2/i0;

.field private l:LP9/u;

.field private m:Lt2/s;

.field private n:LS2/u;

.field private o:Z

.field private p:Z

.field private q:J

.field private r:I

.field private s:Landroid/util/Pair;

.field private t:I

.field private u:I

.field private v:J

.field private w:J

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LS2/o;

    .line 2
    .line 3
    invoke-direct {v0}, LS2/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS2/q;->A:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(LS2/q$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LS2/q$b;->a(LS2/q$b;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LS2/q;->a:Landroid/content/Context;

    .line 4
    new-instance v0, Lt2/N;

    invoke-direct {v0}, Lt2/N;-><init>()V

    iput-object v0, p0, LS2/q;->i:Lt2/N;

    .line 5
    invoke-static {p1}, LS2/q$b;->b(LS2/q$b;)Lq2/k0$a;

    move-result-object v0

    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq2/k0$a;

    iput-object v0, p0, LS2/q;->b:Lq2/k0$a;

    .line 6
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LS2/q;->c:Landroid/util/SparseArray;

    .line 7
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, LS2/q;->l:LP9/u;

    .line 8
    sget-object v0, Lq2/i0;->a:Lq2/i0;

    iput-object v0, p0, LS2/q;->k:Lq2/i0;

    .line 9
    invoke-static {p1}, LS2/q$b;->c(LS2/q$b;)Z

    move-result v0

    iput-boolean v0, p0, LS2/q;->d:Z

    .line 10
    invoke-static {p1}, LS2/q$b;->d(LS2/q$b;)Lt2/j;

    move-result-object v0

    iput-object v0, p0, LS2/q;->g:Lt2/j;

    .line 11
    new-instance v1, LS2/e;

    invoke-static {p1}, LS2/q$b;->e(LS2/q$b;)LS2/v;

    move-result-object p1

    invoke-direct {v1, p1, v0}, LS2/e;-><init>(LS2/v;Lt2/j;)V

    iput-object v1, p0, LS2/q;->e:LS2/L;

    .line 12
    new-instance p1, LS2/q$a;

    invoke-direct {p1, p0}, LS2/q$a;-><init>(LS2/q;)V

    iput-object p1, p0, LS2/q;->f:LS2/L$b;

    .line 13
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, LS2/q;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    new-instance p1, Lq2/x$b;

    invoke-direct {p1}, Lq2/x$b;-><init>()V

    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    move-result-object p1

    iput-object p1, p0, LS2/q;->j:Lq2/x;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    iput-wide v0, p0, LS2/q;->q:J

    .line 16
    iput-wide v0, p0, LS2/q;->v:J

    .line 17
    iput-wide v0, p0, LS2/q;->w:J

    const/4 p1, -0x1

    .line 18
    iput p1, p0, LS2/q;->y:I

    const/4 p1, 0x0

    .line 19
    iput p1, p0, LS2/q;->u:I

    return-void
.end method

.method synthetic constructor <init>(LS2/q$b;LS2/q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;-><init>(LS2/q$b;)V

    return-void
.end method

.method private B(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, LS2/q;->F()Z

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
    iget v0, p0, LS2/q;->t:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    add-int/2addr v0, v1

    .line 12
    iput v0, p0, LS2/q;->t:I

    .line 13
    .line 14
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 15
    .line 16
    invoke-interface {v0, p1}, LS2/L;->w(Z)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object p1, p0, LS2/q;->i:Lt2/N;

    .line 20
    .line 21
    invoke-virtual {p1}, Lt2/N;->l()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-le p1, v1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, LS2/q;->i:Lt2/N;

    .line 28
    .line 29
    invoke-virtual {p1}, Lt2/N;->i()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p1, p0, LS2/q;->i:Lt2/N;

    .line 34
    .line 35
    invoke-virtual {p1}, Lt2/N;->l()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, v1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, LS2/q;->i:Lt2/N;

    .line 42
    .line 43
    invoke-virtual {p1}, Lt2/N;->i()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LS2/q$g;

    .line 48
    .line 49
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, LS2/q$g;

    .line 54
    .line 55
    iget-wide v0, p1, LS2/q$g;->a:J

    .line 56
    .line 57
    iput-wide v0, p0, LS2/q;->q:J

    .line 58
    .line 59
    iget p1, p1, LS2/q$g;->b:I

    .line 60
    .line 61
    iput p1, p0, LS2/q;->r:I

    .line 62
    .line 63
    invoke-direct {p0}, LS2/q;->J()V

    .line 64
    .line 65
    .line 66
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    iput-wide v0, p0, LS2/q;->v:J

    .line 72
    .line 73
    iput-wide v0, p0, LS2/q;->w:J

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, LS2/q;->x:Z

    .line 77
    .line 78
    iget-object p1, p0, LS2/q;->m:Lt2/s;

    .line 79
    .line 80
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lt2/s;

    .line 85
    .line 86
    new-instance v0, LS2/n;

    .line 87
    .line 88
    invoke-direct {v0, p0}, LS2/n;-><init>(LS2/q;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, Lt2/s;->i(Ljava/lang/Runnable;)Z

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method private C(Lq2/l;)Lq2/l;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lq2/l;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, LS2/q;->p:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :cond_1
    :goto_0
    sget-object p1, Lq2/l;->h:Lq2/l;

    .line 16
    .line 17
    return-object p1
.end method

.method private E()Z
    .locals 1

    .line 1
    iget v0, p0, LS2/q;->t:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LS2/q;->x:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 10
    .line 11
    invoke-interface {v0}, LS2/L;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private F()Z
    .locals 2

    .line 1
    iget v0, p0, LS2/q;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private G(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, LS2/q;->t:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-interface {v0, p1}, LS2/L;->l(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private H(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS2/L;->z(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private I(Landroid/view/Surface;II)V
    .locals 0

    .line 1
    return-void
.end method

.method private J()V
    .locals 7

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    iget-object v2, p0, LS2/q;->j:Lq2/x;

    .line 4
    .line 5
    iget-wide v3, p0, LS2/q;->q:J

    .line 6
    .line 7
    iget v5, p0, LS2/q;->r:I

    .line 8
    .line 9
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-interface/range {v0 .. v6}, LS2/L;->x(ILq2/x;JILjava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private K(Lq2/x;I)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_5

    .line 4
    .line 5
    iget p2, p0, LS2/q;->u:I

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p1, Lq2/x;->E:Lq2/l;

    .line 14
    .line 15
    invoke-direct {p0, p2}, LS2/q;->C(Lq2/l;)Lq2/l;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :try_start_0
    iget-boolean v0, p0, LS2/q;->o:Z

    .line 20
    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    iget v0, p2, Lq2/l;->c:I

    .line 24
    .line 25
    const/4 v2, 0x7

    .line 26
    if-ne v0, v2, :cond_3

    .line 27
    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x22

    .line 31
    .line 32
    if-ge v0, v2, :cond_3

    .line 33
    .line 34
    invoke-static {}, Lt2/r;->j()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p2}, Lq2/l;->a()Lq2/l$b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 v0, 0x6

    .line 46
    invoke-virtual {p2, v0}, Lq2/l$b;->e(I)Lq2/l$b;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lq2/l$b;->a()Lq2/l;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :cond_2
    :goto_0
    move-object v4, p2

    .line 55
    goto :goto_2

    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object p2, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    :goto_1
    iget v0, p2, Lq2/l;->c:I

    .line 60
    .line 61
    invoke-static {v0}, Lt2/r;->k(I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v2, 0x1d

    .line 70
    .line 71
    if-lt v0, v2, :cond_2

    .line 72
    .line 73
    const-string v0, "PlaybackVidGraphWrapper"

    .line 74
    .line 75
    const-string v2, "Color transfer %d is not supported. Falling back to OpenGl tone mapping."

    .line 76
    .line 77
    iget p2, p2, Lq2/l;->c:I

    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {v2, p2}, Lt2/a0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {v0, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object p2, Lq2/l;->h:Lq2/l;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    sget-object p2, Lq2/l;->h:Lq2/l;
    :try_end_0
    .catch Lt2/r$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_2
    iget-object p1, p0, LS2/q;->g:Lt2/j;

    .line 101
    .line 102
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Landroid/os/Looper;

    .line 111
    .line 112
    invoke-interface {p1, p2, v1}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, LS2/q;->m:Lt2/s;

    .line 117
    .line 118
    iget-object v2, p0, LS2/q;->b:Lq2/k0$a;

    .line 119
    .line 120
    iget-object v3, p0, LS2/q;->a:Landroid/content/Context;

    .line 121
    .line 122
    sget-object v5, Lq2/o;->a:Lq2/o;

    .line 123
    .line 124
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    new-instance v7, LS2/p;

    .line 128
    .line 129
    invoke-direct {v7, p1}, LS2/p;-><init>(Lt2/s;)V

    .line 130
    .line 131
    .line 132
    const-wide/16 v8, 0x0

    .line 133
    .line 134
    const/4 v10, 0x0

    .line 135
    move-object v6, p0

    .line 136
    invoke-interface/range {v2 .. v10}, Lq2/k0$a;->a(Landroid/content/Context;Lq2/l;Lq2/o;Lq2/k0$b;Ljava/util/concurrent/Executor;JZ)Lq2/k0;

    .line 137
    .line 138
    .line 139
    throw v1

    .line 140
    :goto_3
    new-instance v0, LS2/L$c;

    .line 141
    .line 142
    invoke-direct {v0, p2, p1}, LS2/L$c;-><init>(Ljava/lang/Throwable;Lq2/x;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_5
    invoke-direct {p0}, LS2/q;->F()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_6

    .line 151
    .line 152
    return v0

    .line 153
    :cond_6
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    throw v1
.end method

.method private M(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LS2/L;->g(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private N(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS2/L;->u(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private P(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS2/L;->t(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private R(LS2/u;)V
    .locals 1

    .line 1
    iput-object p1, p0, LS2/q;->n:LS2/u;

    .line 2
    .line 3
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LS2/L;->y(LS2/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private S()Z
    .locals 2

    .line 1
    iget v0, p0, LS2/q;->y:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget v1, p0, LS2/q;->z:I

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method private T()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0}, LS2/L;->i()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LS2/q;->x:Z

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic b(LS2/q;)V
    .locals 1

    .line 1
    iget v0, p0, LS2/q;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, LS2/q;->t:I

    .line 6
    .line 7
    return-void
.end method

.method static synthetic c(LS2/q;Lq2/x;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LS2/q;->K(Lq2/x;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic d(LS2/q;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LS2/q;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic e(LS2/q;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->B(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic f(LS2/q;Z)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->G(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic g(LS2/q;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LS2/q;->w:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic h(LS2/q;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, LS2/q;->w:J

    .line 2
    .line 3
    return-wide p1
.end method

.method static synthetic i(LS2/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS2/q;->T()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic j(LS2/q;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LS2/q;->E()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic k(LS2/q;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LS2/q;->x:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic l(LS2/q;)Lt2/N;
    .locals 0

    .line 1
    iget-object p0, p0, LS2/q;->i:Lt2/N;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic m(LS2/q;Lt2/N;)Lt2/N;
    .locals 0

    .line 1
    iput-object p1, p0, LS2/q;->i:Lt2/N;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic n(LS2/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS2/q;->z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic o(LS2/q;LS2/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->R(LS2/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic p(LS2/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->P(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic q(LS2/q;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->N(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic r(LS2/q;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LS2/q;->S()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic s(LS2/q;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LS2/q;->M(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic t(LS2/q;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->H(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic u(LS2/q;Lq2/l;)Lq2/l;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS2/q;->C(Lq2/l;)Lq2/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic v(LS2/q;)Lq2/k0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static synthetic w()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, LS2/q;->A:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic x(LS2/q;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LS2/q;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method private z()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0}, LS2/L;->n()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    sget-object v0, Lt2/K;->c:Lt2/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/K;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lt2/K;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {p0, v2, v1, v0}, LS2/q;->I(Landroid/view/Surface;II)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, LS2/q;->s:Landroid/util/Pair;

    .line 16
    .line 17
    return-void
.end method

.method public D(I)LS2/L;
    .locals 2

    .line 1
    iget-object v0, p0, LS2/q;->c:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lt2/a0;->t(Landroid/util/SparseArray;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/q;->c:Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, LS2/L;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, LS2/q$c;

    .line 19
    .line 20
    iget-object v1, p0, LS2/q;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1, p1}, LS2/q$c;-><init>(LS2/q;Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0}, LS2/q;->y(LS2/q$d;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, LS2/q;->c:Landroid/util/SparseArray;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public L()V
    .locals 3

    .line 1
    iget v0, p0, LS2/q;->u:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, LS2/q;->m:Lt2/s;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lt2/s;->f(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iput-object v2, p0, LS2/q;->s:Landroid/util/Pair;

    .line 16
    .line 17
    iput v1, p0, LS2/q;->u:I

    .line 18
    .line 19
    return-void
.end method

.method public O(Landroid/view/Surface;Lt2/K;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->s:Landroid/util/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LS2/q;->s:Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lt2/K;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lt2/K;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LS2/q;->s:Landroid/util/Pair;

    .line 33
    .line 34
    invoke-virtual {p2}, Lt2/K;->b()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p2}, Lt2/K;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-direct {p0, p1, v0, p2}, LS2/q;->I(Landroid/view/Surface;II)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public Q(I)V
    .locals 0

    .line 1
    iput p1, p0, LS2/q;->y:I

    .line 2
    .line 3
    return-void
.end method

.method public U()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0}, LS2/L;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public V()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->e:LS2/L;

    .line 2
    .line 3
    invoke-interface {v0}, LS2/L;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y(LS2/q$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/q;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
