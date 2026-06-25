.class public LF3/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/n$g;,
        LF3/n$c;,
        LF3/n$f;,
        LF3/n$e;,
        LF3/n$d;,
        LF3/n$b;,
        LF3/n$j;,
        LF3/n$h;,
        LF3/n$i;
    }
.end annotation


# instance fields
.field private final a:LF3/n$c;

.field private final b:LF3/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LF3/i;->a(Landroid/content/Context;)Landroid/content/ComponentName;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    const-string v0, "MediaSessionCompat"

    .line 19
    .line 20
    const-string v1, "Couldn\'t find a unique registered media button receiver in the given context."

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    :cond_0
    if-eqz p3, :cond_2

    .line 26
    .line 27
    if-nez p4, :cond_2

    .line 28
    .line 29
    new-instance p4, Landroid/content/Intent;

    .line 30
    .line 31
    const-string v0, "android.intent.action.MEDIA_BUTTON"

    .line 32
    .line 33
    invoke-direct {p4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p4, p3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v0, 0x1f

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    if-lt p3, v0, :cond_1

    .line 45
    .line 46
    const/high16 p3, 0x2000000

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move p3, v1

    .line 50
    :goto_0
    invoke-static {p1, v1, p4, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    :cond_2
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/16 v0, 0x1d

    .line 57
    .line 58
    if-lt p3, v0, :cond_3

    .line 59
    .line 60
    new-instance p3, LF3/n$g;

    .line 61
    .line 62
    invoke-direct {p3, p1, p2, p5}, LF3/n$g;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    iput-object p3, p0, LF3/n;->a:LF3/n$c;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const/16 v0, 0x1c

    .line 69
    .line 70
    if-lt p3, v0, :cond_4

    .line 71
    .line 72
    new-instance p3, LF3/n$f;

    .line 73
    .line 74
    invoke-direct {p3, p1, p2, p5}, LF3/n$f;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    iput-object p3, p0, LF3/n;->a:LF3/n$c;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    new-instance p3, LF3/n$e;

    .line 81
    .line 82
    invoke-direct {p3, p1, p2, p5}, LF3/n$e;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    iput-object p3, p0, LF3/n;->a:LF3/n$c;

    .line 86
    .line 87
    :goto_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    new-instance p3, Landroid/os/Handler;

    .line 92
    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    :goto_2
    invoke-direct {p3, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    new-instance p2, LF3/n$a;

    .line 104
    .line 105
    invoke-direct {p2, p0}, LF3/n$a;-><init>(LF3/n;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p2, p3}, LF3/n;->k(LF3/n$b;Landroid/os/Handler;)V

    .line 109
    .line 110
    .line 111
    iget-object p2, p0, LF3/n;->a:LF3/n$c;

    .line 112
    .line 113
    invoke-interface {p2, p4}, LF3/n$c;->o(Landroid/app/PendingIntent;)V

    .line 114
    .line 115
    .line 116
    new-instance p2, LF3/j;

    .line 117
    .line 118
    invoke-direct {p2, p1, p0}, LF3/j;-><init>(Landroid/content/Context;LF3/n;)V

    .line 119
    .line 120
    .line 121
    iput-object p2, p0, LF3/n;->b:LF3/j;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    const-string p2, "tag must not be null or empty"

    .line 127
    .line 128
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method

.method public static a(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, LF3/n;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/ClassLoader;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method static f(LF3/v;LF3/m;)LF3/v;
    .locals 14

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, LF3/v;->m()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, LF3/v;->o()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LF3/v;->o()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x4

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LF3/v;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x5

    .line 33
    if-ne v0, v1, :cond_5

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, LF3/v;->j()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long v6, v0, v4

    .line 42
    .line 43
    if-lez v6, :cond_5

    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    invoke-virtual {p0}, LF3/v;->k()F

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    sub-long v0, v12, v0

    .line 54
    .line 55
    long-to-float v0, v0

    .line 56
    mul-float/2addr v6, v0

    .line 57
    float-to-long v0, v6

    .line 58
    invoke-virtual {p0}, LF3/v;->m()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    add-long/2addr v0, v6

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    const-string v6, "android.media.metadata.DURATION"

    .line 66
    .line 67
    invoke-virtual {p1, v6}, LF3/m;->a(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1, v6}, LF3/m;->e(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    :cond_2
    cmp-long p1, v2, v4

    .line 78
    .line 79
    if-ltz p1, :cond_3

    .line 80
    .line 81
    cmp-long p1, v0, v2

    .line 82
    .line 83
    if-lez p1, :cond_3

    .line 84
    .line 85
    move-wide v9, v2

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    cmp-long p1, v0, v4

    .line 88
    .line 89
    if-gez p1, :cond_4

    .line 90
    .line 91
    move-wide v9, v4

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    move-wide v9, v0

    .line 94
    :goto_0
    new-instance v7, LF3/v$c;

    .line 95
    .line 96
    invoke-direct {v7, p0}, LF3/v$c;-><init>(LF3/v;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, LF3/v;->o()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual {p0}, LF3/v;->k()F

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    invoke-virtual/range {v7 .. v13}, LF3/v$c;->h(IJFJ)LF3/v$c;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, LF3/v$c;->b()LF3/v;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_5
    :goto_1
    return-object p0
.end method

.method public static y(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p0}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :catch_0
    const-string p0, "MediaSessionCompat"

    .line 13
    .line 14
    const-string v1, "Could not unparcel the data."

    .line 15
    .line 16
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public b()LF3/j;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->b:LF3/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LF3/q$b;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/n$c;->w()LF3/q$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/n$c;->t()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()LF3/n$j;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/n$c;->d()LF3/n$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/n$c;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/n$c;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, LF3/n$c;->e(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string p2, "event cannot be null or empty"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public j(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->s(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(LF3/n$b;Landroid/os/Handler;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF3/n$c;->i(LF3/n$b;Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->setExtras(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->c(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n(Landroid/app/PendingIntent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->o(Landroid/app/PendingIntent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(LF3/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->u(LF3/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(LF3/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->l(LF3/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->m(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r(LF3/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->r(LF3/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(Ljava/util/List;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LF3/n$h;

    .line 23
    .line 24
    invoke-virtual {v2}, LF3/n$h;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v4, "Found duplicate queue id: "

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, LF3/n$h;->d()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v5, "id of each queue item should be unique"

    .line 62
    .line 63
    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v5, "MediaSessionCompat"

    .line 67
    .line 68
    invoke-static {v5, v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual {v2}, LF3/n$h;->d()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 84
    .line 85
    invoke-interface {v0, p1}, LF3/n$c;->h(Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public t(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->f(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->g(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->v(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(Landroid/app/PendingIntent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->k(Landroid/app/PendingIntent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n;->a:LF3/n$c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/n$c;->D(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
