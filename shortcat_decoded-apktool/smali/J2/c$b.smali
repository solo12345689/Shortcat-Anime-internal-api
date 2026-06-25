.class public final LJ2/c$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJ2/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:LO9/t;

.field private final c:LO9/t;

.field private d:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    new-instance v0, LJ2/d;

    invoke-direct {v0, p1}, LJ2/d;-><init>(I)V

    new-instance v1, LJ2/e;

    invoke-direct {v1, p1}, LJ2/e;-><init>(I)V

    invoke-direct {p0, v0, v1}, LJ2/c$b;-><init>(LO9/t;LO9/t;)V

    return-void
.end method

.method public constructor <init>(LO9/t;LO9/t;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LJ2/c$b;->b:LO9/t;

    .line 4
    iput-object p2, p0, LJ2/c$b;->c:LO9/t;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, LJ2/c$b;->d:Z

    return-void
.end method

.method public static synthetic c(I)Landroid/os/HandlerThread;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-static {p0}, LJ2/c;->t(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic d(I)Landroid/os/HandlerThread;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-static {p0}, LJ2/c;->u(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static g(Lq2/x;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/16 v1, 0x23

    .line 10
    .line 11
    if-ge v0, v1, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, Lq2/x;->o:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0}, Lq2/K;->t(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v2

    .line 23
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method


# virtual methods
.method public bridge synthetic b(LJ2/q$a;)LJ2/q;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ2/c$b;->e(LJ2/q$a;)LJ2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(LJ2/q$a;)LJ2/c;
    .locals 9

    .line 1
    iget-object v0, p1, LJ2/q$a;->a:LJ2/t;

    .line 2
    .line 3
    iget-object v0, v0, LJ2/t;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v3, "createCodec:"

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lt2/P;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 27
    .line 28
    .line 29
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 30
    :try_start_1
    iget-boolean v0, p0, LJ2/c$b;->d:Z

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p1, LJ2/q$a;->c:Lq2/x;

    .line 35
    .line 36
    invoke-static {v0}, LJ2/c$b;->g(Lq2/x;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v0, LJ2/Q;

    .line 43
    .line 44
    invoke-direct {v0, v4}, LJ2/Q;-><init>(Landroid/media/MediaCodec;)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    :goto_0
    move-object v6, v0

    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_0
    new-instance v0, LJ2/f;

    .line 54
    .line 55
    iget-object v2, p0, LJ2/c$b;->c:LO9/t;

    .line 56
    .line 57
    invoke-interface {v2}, LO9/t;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Landroid/os/HandlerThread;

    .line 62
    .line 63
    invoke-direct {v0, v4, v2}, LJ2/f;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    goto :goto_0

    .line 68
    :goto_1
    new-instance v3, LJ2/c;

    .line 69
    .line 70
    iget-object v0, p0, LJ2/c$b;->b:LO9/t;

    .line 71
    .line 72
    invoke-interface {v0}, LO9/t;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v5, v0

    .line 77
    check-cast v5, Landroid/os/HandlerThread;

    .line 78
    .line 79
    iget-object v7, p1, LJ2/q$a;->f:LJ2/o;

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-direct/range {v3 .. v8}, LJ2/c;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;LJ2/r;LJ2/o;LJ2/c$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    :try_start_2
    invoke-static {}, Lt2/P;->b()V

    .line 86
    .line 87
    .line 88
    iget-object v0, p1, LJ2/q$a;->d:Landroid/view/Surface;

    .line 89
    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    iget-object v1, p1, LJ2/q$a;->a:LJ2/t;

    .line 93
    .line 94
    iget-boolean v1, v1, LJ2/t;->k:Z

    .line 95
    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    .line 100
    const/16 v5, 0x23

    .line 101
    .line 102
    if-lt v1, v5, :cond_1

    .line 103
    .line 104
    or-int/lit8 v2, v2, 0x8

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catch_1
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    move-object v1, v3

    .line 110
    goto :goto_3

    .line 111
    :cond_1
    :goto_2
    iget-object v1, p1, LJ2/q$a;->b:Landroid/media/MediaFormat;

    .line 112
    .line 113
    iget-object p1, p1, LJ2/q$a;->e:Landroid/media/MediaCrypto;

    .line 114
    .line 115
    invoke-static {v3, v1, v0, p1, v2}, LJ2/c;->s(LJ2/c;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 116
    .line 117
    .line 118
    return-object v3

    .line 119
    :catch_2
    move-exception v0

    .line 120
    move-object p1, v0

    .line 121
    move-object v4, v1

    .line 122
    :goto_3
    if-nez v1, :cond_2

    .line 123
    .line 124
    if-eqz v4, :cond_3

    .line 125
    .line 126
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_2
    invoke-virtual {v1}, LJ2/c;->a()V

    .line 131
    .line 132
    .line 133
    :cond_3
    :goto_4
    throw p1
.end method

.method public f(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ2/c$b;->d:Z

    .line 2
    .line 3
    return-void
.end method
