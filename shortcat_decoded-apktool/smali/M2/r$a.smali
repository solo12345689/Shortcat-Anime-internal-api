.class final LM2/r$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LU2/u;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private d:Lw2/g$a;

.field private e:Z

.field private f:Lr3/r$a;

.field private g:I

.field private h:LF2/w;

.field private i:LQ2/k;


# direct methods
.method public constructor <init>(LU2/u;Lr3/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/r$a;->a:LU2/u;

    .line 5
    .line 6
    iput-object p2, p0, LM2/r$a;->f:Lr3/r$a;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LM2/r$a;->b:Ljava/util/Map;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, LM2/r$a;->e:Z

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM2/r;->i(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Class;)LM2/D$a;
    .locals 0

    .line 1
    invoke-static {p0}, LM2/r;->h(Ljava/lang/Class;)LM2/D$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LM2/r$a;Lw2/g$a;)LM2/D$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, LM2/X$b;

    .line 5
    .line 6
    iget-object p0, p0, LM2/r$a;->a:LU2/u;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, LM2/X$b;-><init>(Lw2/g$a;LU2/u;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic d(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM2/r;->i(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM2/r;->i(Ljava/lang/Class;Lw2/g$a;)LM2/D$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private g(I)LO9/t;
    .locals 3

    .line 1
    iget-object v0, p0, LM2/r$a;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LO9/t;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LM2/r$a;->d:Lw2/g$a;

    .line 17
    .line 18
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lw2/g$a;

    .line 23
    .line 24
    const-class v1, LM2/D$a;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eq p1, v2, :cond_4

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    if-eq p1, v2, :cond_3

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    if-eq p1, v2, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    if-ne p1, v1, :cond_1

    .line 39
    .line 40
    new-instance v1, LM2/q;

    .line 41
    .line 42
    invoke-direct {v1, p0, v0}, LM2/q;-><init>(LM2/r$a;Lw2/g$a;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "Unrecognized contentType: "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-string v0, "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, LM2/p;

    .line 80
    .line 81
    invoke-direct {v1, v0}, LM2/p;-><init>(Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    sget v2, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->r:I

    .line 86
    .line 87
    const-class v2, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, LM2/o;

    .line 94
    .line 95
    invoke-direct {v2, v1, v0}, LM2/o;-><init>(Ljava/lang/Class;Lw2/g$a;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    move-object v1, v2

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const-string v2, "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"

    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, LM2/n;

    .line 111
    .line 112
    invoke-direct {v2, v1, v0}, LM2/n;-><init>(Ljava/lang/Class;Lw2/g$a;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    sget v2, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->k:I

    .line 117
    .line 118
    const-class v2, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 119
    .line 120
    invoke-virtual {v2, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, LM2/m;

    .line 125
    .line 126
    invoke-direct {v2, v1, v0}, LM2/m;-><init>(Ljava/lang/Class;Lw2/g$a;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :goto_1
    iget-object v0, p0, LM2/r$a;->b:Ljava/util/Map;

    .line 131
    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    return-object v1
.end method


# virtual methods
.method public f(I)LM2/D$a;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LM2/D$a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, LM2/r$a;->g(I)LO9/t;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, LO9/t;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LM2/D$a;

    .line 25
    .line 26
    iget-object v1, p0, LM2/r$a;->h:LF2/w;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v1}, LM2/D$a;->f(LF2/w;)LM2/D$a;

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, LM2/r$a;->i:LQ2/k;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, v1}, LM2/D$a;->d(LQ2/k;)LM2/D$a;

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v1, p0, LM2/r$a;->f:Lr3/r$a;

    .line 41
    .line 42
    invoke-interface {v0, v1}, LM2/D$a;->a(Lr3/r$a;)LM2/D$a;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, LM2/r$a;->e:Z

    .line 46
    .line 47
    invoke-interface {v0, v1}, LM2/D$a;->c(Z)LM2/D$a;

    .line 48
    .line 49
    .line 50
    iget v1, p0, LM2/r$a;->g:I

    .line 51
    .line 52
    invoke-interface {v0, v1}, LM2/D$a;->b(I)LM2/D$a;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v0
.end method

.method public h(I)V
    .locals 1

    .line 1
    iput p1, p0, LM2/r$a;->g:I

    .line 2
    .line 3
    iget-object v0, p0, LM2/r$a;->a:LU2/u;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LU2/u;->b(I)LU2/u;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(Lw2/g$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/r$a;->d:Lw2/g$a;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LM2/r$a;->d:Lw2/g$a;

    .line 6
    .line 7
    iget-object p1, p0, LM2/r$a;->b:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public j(LF2/w;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/r$a;->h:LF2/w;

    .line 2
    .line 3
    iget-object v0, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LM2/D$a;

    .line 24
    .line 25
    invoke-interface {v1, p1}, LM2/D$a;->f(LF2/w;)LM2/D$a;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/r$a;->a:LU2/u;

    .line 2
    .line 3
    instance-of v1, v0, LU2/m;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LU2/m;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LU2/m;->n(I)LU2/m;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public l(LQ2/k;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/r$a;->i:LQ2/k;

    .line 2
    .line 3
    iget-object v0, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LM2/D$a;

    .line 24
    .line 25
    invoke-interface {v1, p1}, LM2/D$a;->d(LQ2/k;)LM2/D$a;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public m(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, LM2/r$a;->e:Z

    .line 2
    .line 3
    iget-object v0, p0, LM2/r$a;->a:LU2/u;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LU2/u;->c(Z)LU2/u;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LM2/D$a;

    .line 29
    .line 30
    invoke-interface {v1, p1}, LM2/D$a;->c(Z)LM2/D$a;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public n(Lr3/r$a;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/r$a;->f:Lr3/r$a;

    .line 2
    .line 3
    iget-object v0, p0, LM2/r$a;->a:LU2/u;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LU2/u;->a(Lr3/r$a;)LU2/u;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LM2/r$a;->c:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LM2/D$a;

    .line 29
    .line 30
    invoke-interface {v1, p1}, LM2/D$a;->a(Lr3/r$a;)LM2/D$a;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method
