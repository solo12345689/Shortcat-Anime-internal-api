.class public final LF2/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF2/w;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lq2/C$f;

.field private c:LF2/u;

.field private d:Lw2/g$a;

.field private e:Ljava/lang/String;

.field private f:LQ2/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LF2/l;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method private b(Lq2/C$f;)LF2/u;
    .locals 4

    .line 1
    iget-object v0, p0, LF2/l;->d:Lw2/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lw2/q$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lw2/q$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF2/l;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lw2/q$b;->c(Ljava/lang/String;)Lw2/q$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    new-instance v1, LF2/K;

    .line 18
    .line 19
    iget-object v2, p1, Lq2/C$f;->c:Landroid/net/Uri;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_1
    iget-boolean v3, p1, Lq2/C$f;->h:Z

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, LF2/K;-><init>(Ljava/lang/String;ZLw2/g$a;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, Lq2/C$f;->e:LP9/v;

    .line 35
    .line 36
    invoke-virtual {v0}, LP9/v;->h()LP9/w;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LP9/w;->l()LP9/X;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, LF2/K;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    new-instance v0, LF2/h$b;

    .line 73
    .line 74
    invoke-direct {v0}, LF2/h$b;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, p1, Lq2/C$f;->a:Ljava/util/UUID;

    .line 78
    .line 79
    sget-object v3, LF2/J;->d:LF2/A$c;

    .line 80
    .line 81
    invoke-virtual {v0, v2, v3}, LF2/h$b;->f(Ljava/util/UUID;LF2/A$c;)LF2/h$b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v2, p1, Lq2/C$f;->f:Z

    .line 86
    .line 87
    invoke-virtual {v0, v2}, LF2/h$b;->c(Z)LF2/h$b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v2, p1, Lq2/C$f;->g:Z

    .line 92
    .line 93
    invoke-virtual {v0, v2}, LF2/h$b;->d(Z)LF2/h$b;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v2, p1, Lq2/C$f;->j:LP9/u;

    .line 98
    .line 99
    invoke-static {v2}, LS9/f;->o(Ljava/util/Collection;)[I

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, LF2/h$b;->e([I)LF2/h$b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v2, p0, LF2/l;->f:LQ2/k;

    .line 108
    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0, v2}, LF2/h$b;->b(LQ2/k;)LF2/h$b;

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {v0, v1}, LF2/h$b;->a(LF2/M;)LF2/h;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-virtual {p1}, Lq2/C$f;->d()[B

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v0, v1, p1}, LF2/h;->G(I[B)V

    .line 124
    .line 125
    .line 126
    return-object v0
.end method


# virtual methods
.method public a(Lq2/C;)LF2/u;
    .locals 2

    .line 1
    iget-object v0, p1, Lq2/C;->b:Lq2/C$h;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    .line 7
    .line 8
    iget-object p1, p1, Lq2/C$h;->c:Lq2/C$f;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, LF2/u;->a:LF2/u;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v0, p0, LF2/l;->a:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, p0, LF2/l;->b:Lq2/C$f;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iput-object p1, p0, LF2/l;->b:Lq2/C$f;

    .line 27
    .line 28
    invoke-direct {p0, p1}, LF2/l;->b(Lq2/C$f;)LF2/u;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, LF2/l;->c:LF2/u;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    iget-object p1, p0, LF2/l;->c:LF2/u;

    .line 38
    .line 39
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LF2/u;

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-object p1

    .line 47
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p1
.end method
