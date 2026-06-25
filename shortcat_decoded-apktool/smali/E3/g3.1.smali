.class final LE3/g3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/g3$c;,
        LE3/g3$b;
    }
.end annotation


# instance fields
.field private final a:LE3/W4;

.field private final b:LE3/a3;

.field private final c:Landroidx/core/app/q;

.field private final d:Landroid/os/Handler;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Landroid/content/Intent;

.field private final g:Ljava/util/Map;

.field private h:LE3/b3;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:J

.field m:I


# direct methods
.method public constructor <init>(LE3/W4;LE3/b3;LE3/a3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/g3;->a:LE3/W4;

    .line 5
    .line 6
    iput-object p2, p0, LE3/g3;->h:LE3/b3;

    .line 7
    .line 8
    iput-object p3, p0, LE3/g3;->b:LE3/a3;

    .line 9
    .line 10
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, LE3/g3;->c:Landroidx/core/app/q;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2, p0}, Lt2/a0;->B(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, LE3/g3;->d:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance p2, LE3/c3;

    .line 27
    .line 28
    invoke-direct {p2, p0}, LE3/c3;-><init>(LE3/g3;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, LE3/g3;->e:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    new-instance p2, Landroid/content/Intent;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, LE3/g3;->f:Landroid/content/Intent;

    .line 43
    .line 44
    new-instance p1, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LE3/g3;->g:Ljava/util/Map;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, LE3/g3;->i:Z

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    iput-boolean p1, p0, LE3/g3;->k:Z

    .line 56
    .line 57
    const-wide/32 p1, 0x927c0

    .line 58
    .line 59
    .line 60
    iput-wide p1, p0, LE3/g3;->l:J

    .line 61
    .line 62
    const/4 p1, 0x3

    .line 63
    iput p1, p0, LE3/g3;->m:I

    .line 64
    .line 65
    return-void
.end method

.method public static synthetic a(LE3/g3;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/g3;->d:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(LE3/g3;LE3/h3;Ljava/lang/String;Landroid/os/Bundle;LE3/A;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/g3;->h:LE3/b3;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LE3/b3;->a(LE3/h3;Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LE3/g3;->e:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    new-instance v0, LE3/f3;

    .line 12
    .line 13
    invoke-direct {v0, p0, p4, p2, p3}, LE3/f3;-><init>(LE3/g3;LE3/A;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static synthetic c(LE3/g3;LE3/A;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LE3/g3;->m(LE3/A;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE3/g3;Lcom/google/common/util/concurrent/p;LE3/g3$c;LE3/h3;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LE3/A;

    .line 13
    .line 14
    invoke-direct {p0, p3}, LE3/g3;->o(LE3/h3;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p2, v0}, LE3/g3$c;->u0(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, LE3/A;->a0(Lq2/P$d;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    iget-object p0, p0, LE3/g3;->a:LE3/W4;

    .line 26
    .line 27
    invoke-virtual {p0, p3}, LE3/W4;->s(LE3/h3;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method static synthetic e(LE3/g3;LE3/h3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/g3;->k(LE3/h3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private g(LE3/h3;)LE3/A;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/g3;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE3/g3$b;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, LE3/g3$b;->a:Lcom/google/common/util/concurrent/p;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

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
    :try_start_0
    iget-object p1, p1, LE3/g3$b;->a:Lcom/google/common/util/concurrent/p;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LE3/A;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method private h(Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, LE3/g3;->a:LE3/W4;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/W4;->m()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v2, v3, :cond_3

    .line 14
    .line 15
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LE3/h3;

    .line 20
    .line 21
    invoke-direct {p0, v3}, LE3/g3;->g(LE3/h3;)LE3/A;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-virtual {v3}, LE3/A;->q0()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, LE3/A;->p()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/4 v5, 0x3

    .line 40
    if-eq v4, v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3}, LE3/A;->p()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x2

    .line 47
    if-ne v3, v4, :cond_2

    .line 48
    .line 49
    :cond_1
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    return v1
.end method

.method private k(LE3/h3;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/g3;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE3/g3$b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p1, LE3/g3$b;->b:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private m(LE3/A;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LE3/A;->c1()LE3/U6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LE3/U6;->a:LP9/w;

    .line 6
    .line 7
    invoke-virtual {v0}, LP9/w;->l()LP9/X;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LE3/T6;

    .line 22
    .line 23
    iget v2, v1, LE3/T6;->a:I

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v2, v1, LE3/T6;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, LE3/A;->c1()LE3/U6;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, v1}, LE3/U6;->c(LE3/T6;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance v0, LE3/T6;

    .line 50
    .line 51
    invoke-direct {v0, p2, p3}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-virtual {p1, v0, p3}, LE3/A;->l1(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p3, LE3/g3$a;

    .line 61
    .line 62
    invoke-direct {p3, p0, p2}, LE3/g3$a;-><init>(LE3/g3;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p1, p3, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method private o(LE3/h3;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LE3/g3;->g(LE3/h3;)LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {v0}, LE3/A;->h0()Lq2/Y;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v2, p0, LE3/g3;->g:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LE3/g3$b;

    .line 26
    .line 27
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, LE3/g3$b;

    .line 32
    .line 33
    invoke-virtual {v0}, LE3/A;->p()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v2, 0x1

    .line 38
    if-eq v0, v2, :cond_1

    .line 39
    .line 40
    iput-boolean v1, p1, LE3/g3$b;->b:Z

    .line 41
    .line 42
    iput-boolean v2, p1, LE3/g3$b;->c:Z

    .line 43
    .line 44
    return v2

    .line 45
    :cond_1
    iget v0, p0, LE3/g3;->m:I

    .line 46
    .line 47
    if-eq v0, v2, :cond_5

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    if-eq v0, v3, :cond_4

    .line 51
    .line 52
    const/4 v3, 0x3

    .line 53
    if-ne v0, v3, :cond_3

    .line 54
    .line 55
    iget-boolean v0, p1, LE3/g3$b;->b:Z

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-boolean p1, p1, LE3/g3$b;->c:Z

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    return v2

    .line 64
    :cond_2
    return v1

    .line 65
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    return v1

    .line 72
    :cond_5
    iget-boolean p1, p1, LE3/g3$b;->b:Z

    .line 73
    .line 74
    xor-int/2addr p1, v2

    .line 75
    return p1

    .line 76
    :cond_6
    :goto_0
    return v1
.end method


# virtual methods
.method public f(LE3/h3;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/g3;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

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
    new-instance v0, LE3/g3$c;

    .line 11
    .line 12
    iget-object v1, p0, LE3/g3;->a:LE3/W4;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, p1}, LE3/g3$c;-><init>(LE3/g3;LE3/W4;LE3/h3;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "androidx.media3.session.MediaNotificationManager"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    new-instance v2, LE3/A$a;

    .line 29
    .line 30
    iget-object v3, p0, LE3/g3;->a:LE3/W4;

    .line 31
    .line 32
    invoke-virtual {p1}, LE3/h3;->m()LE3/Y6;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-direct {v2, v3, v4}, LE3/A$a;-><init>(Landroid/content/Context;LE3/Y6;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, LE3/A$a;->d(Landroid/os/Bundle;)LE3/A$a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, LE3/A$a;->e(LE3/A$c;)LE3/A$a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, LE3/A$a;->c(Landroid/os/Looper;)LE3/A$a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LE3/A$a;->b()Lcom/google/common/util/concurrent/p;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, LE3/g3;->g:Ljava/util/Map;

    .line 60
    .line 61
    new-instance v3, LE3/g3$b;

    .line 62
    .line 63
    invoke-direct {v3, v1}, LE3/g3$b;-><init>(Lcom/google/common/util/concurrent/p;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    new-instance v2, LE3/e3;

    .line 70
    .line 71
    invoke-direct {v2, p0, v1, v0, p1}, LE3/e3;-><init>(LE3/g3;Lcom/google/common/util/concurrent/p;LE3/g3$c;LE3/h3;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, LE3/g3;->e:Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    invoke-interface {v1, v2, p1}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, LE3/g3;->a:LE3/W4;

    .line 8
    .line 9
    invoke-virtual {p1}, LE3/W4;->m()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move v2, v0

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, LE3/g3;->a:LE3/W4;

    .line 21
    .line 22
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, LE3/h3;

    .line 27
    .line 28
    invoke-virtual {v3, v4, v0}, LE3/W4;->r(LE3/h3;Z)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/g3;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public j(LE3/h3;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, LE3/g3;->g(LE3/h3;)LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    if-nez v5, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v6, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p1}, LE3/h3;->j()Lq2/P;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lq2/P;->m()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LE3/d3;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move-object v4, p3

    .line 27
    invoke-direct/range {v0 .. v5}, LE3/d3;-><init>(LE3/g3;LE3/h3;Ljava/lang/String;Landroid/os/Bundle;LE3/A;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v6, v0}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public l(LE3/h3;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/g3;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE3/g3$b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, LE3/g3$b;->a:Lcom/google/common/util/concurrent/p;

    .line 12
    .line 13
    invoke-static {p1}, LE3/A;->j1(Ljava/util/concurrent/Future;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method n(Z)Z
    .locals 7

    .line 1
    invoke-direct {p0, p1}, LE3/g3;->h(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean v0, p0, LE3/g3;->k:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v3, p0, LE3/g3;->l:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v0, v3, v5

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    iget-boolean v3, p0, LE3/g3;->j:Z

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, LE3/g3;->d:Landroid/os/Handler;

    .line 31
    .line 32
    iget-wide v3, p0, LE3/g3;->l:J

    .line 33
    .line 34
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, LE3/g3;->d:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    iput-boolean p1, p0, LE3/g3;->j:Z

    .line 46
    .line 47
    iget-object v0, p0, LE3/g3;->d:Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    return v1

    .line 59
    :cond_4
    :goto_2
    return v2
.end method
