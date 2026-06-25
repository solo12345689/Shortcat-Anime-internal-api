.class final LE3/W4$e;
.super LE3/s$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/W4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(LE3/W4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/s$a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/W4$e;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LE3/W4$e;->b:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LE3/W4$e;->c:Ljava/util/Set;

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic e(LE3/W4$e;LE3/q;LF3/q$b;LE3/h;Z)V
    .locals 8

    .line 1
    iget-object v0, p0, LE3/W4$e;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, LE3/W4$e;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LE3/W4;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_1
    new-instance v0, LE3/h3$g;

    .line 21
    .line 22
    iget v2, p3, LE3/h;->a:I

    .line 23
    .line 24
    iget v3, p3, LE3/h;->b:I

    .line 25
    .line 26
    new-instance v5, LE3/I6$a;

    .line 27
    .line 28
    invoke-direct {v5, p1, v3}, LE3/I6$a;-><init>(LE3/q;I)V

    .line 29
    .line 30
    .line 31
    iget-object v6, p3, LE3/h;->e:Landroid/os/Bundle;

    .line 32
    .line 33
    iget v7, p3, LE3/h;->f:I

    .line 34
    .line 35
    move-object v1, p2

    .line 36
    move v4, p4

    .line 37
    invoke-direct/range {v0 .. v7}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, LE3/W4;->p(LE3/h3$g;)LE3/h3;

    .line 41
    .line 42
    .line 43
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :try_start_2
    invoke-virtual {p0, p2}, LE3/W4;->f(LE3/h3;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1, v0}, LE3/h3;->o(LE3/q;LE3/h3$g;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    :try_start_3
    const-string p2, "MSessionService"

    .line 63
    .line 64
    const-string p3, "Failed to add a session to session service"

    .line 65
    .line 66
    invoke-static {p2, p3, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_0
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 74
    .line 75
    .line 76
    throw p0
.end method


# virtual methods
.method public G3()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4$e;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE3/W4$e;->b:Landroid/os/Handler;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LE3/W4$e;->c:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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
    check-cast v1, LE3/q;

    .line 29
    .line 30
    invoke-static {v1}, LE3/a7;->a(LE3/q;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, LE3/W4$e;->c:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public s3(LE3/q;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    :cond_0
    move-object v2, p1

    .line 6
    goto :goto_1

    .line 7
    :cond_1
    :try_start_0
    invoke-static {p2}, LE3/h;->a(Landroid/os/Bundle;)LE3/h;

    .line 8
    .line 9
    .line 10
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-object p2, p0, LE3/W4$e;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, LE3/W4;

    .line 18
    .line 19
    if-nez p2, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    iget v0, v4, LE3/h;->d:I

    .line 41
    .line 42
    :goto_0
    new-instance v3, LF3/q$b;

    .line 43
    .line 44
    iget-object v2, v4, LE3/h;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v3, v2, v0, v1}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {p2}, LF3/q;->a(Landroid/content/Context;)LF3/q;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, v3}, LF3/q;->b(LF3/q$b;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    iget-object p2, p0, LE3/W4$e;->c:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :try_start_1
    iget-object p2, p0, LE3/W4$e;->b:Landroid/os/Handler;

    .line 67
    .line 68
    new-instance v0, LE3/Y4;

    .line 69
    .line 70
    move-object v1, p0

    .line 71
    move-object v2, p1

    .line 72
    invoke-direct/range {v0 .. v5}, LE3/Y4;-><init>(LE3/W4$e;LE3/q;LF3/q$b;LE3/h;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    invoke-static {v6, v7}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    invoke-static {v6, v7}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :catch_0
    move-exception v0

    .line 89
    move-object v2, p1

    .line 90
    move-object p1, v0

    .line 91
    const-string p2, "MSessionService"

    .line 92
    .line 93
    const-string v0, "Ignoring malformed Bundle for ConnectionRequest"

    .line 94
    .line 95
    invoke-static {p2, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, LE3/a7;->a(LE3/q;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :goto_1
    invoke-static {v2}, LE3/a7;->a(LE3/q;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method
