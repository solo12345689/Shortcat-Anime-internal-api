.class public Lx6/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx6/k;


# static fields
.field private static a:Lx6/p; = null

.field private static b:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static declared-synchronized f()Lx6/p;
    .locals 2

    .line 1
    const-class v0, Lx6/p;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx6/p;->a:Lx6/p;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lx6/p;

    .line 9
    .line 10
    invoke-direct {v1}, Lx6/p;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lx6/p;->a:Lx6/p;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lx6/p;->a:Lx6/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method


# virtual methods
.method public a(LK6/b;Ljava/lang/Object;)Ls5/d;
    .locals 7

    .line 1
    new-instance v0, Lx6/b;

    .line 2
    .line 3
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Lx6/p;->e(Landroid/net/Uri;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, LK6/b;->r()Ly6/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, LK6/b;->t()Ly6/h;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p1}, LK6/b;->h()Ly6/d;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct/range {v0 .. v6}, Lx6/b;-><init>(Ljava/lang/String;Ly6/g;Ly6/h;Ly6/d;Ls5/d;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-boolean p1, Lx6/p;->b:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {v0, p1}, Lx6/b;->d(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    invoke-virtual {v0, p2}, Lx6/b;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public b(LK6/b;Ljava/lang/Object;)Ls5/d;
    .locals 10

    .line 1
    invoke-virtual {p1}, LK6/b;->l()LK6/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, LK6/d;->b()Ls5/d;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v9, v0

    .line 21
    move-object v8, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v8, v1

    .line 24
    move-object v9, v8

    .line 25
    :goto_0
    new-instance v3, Lx6/b;

    .line 26
    .line 27
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lx6/p;->e(Landroid/net/Uri;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {p1}, LK6/b;->r()Ly6/g;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1}, LK6/b;->t()Ly6/h;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {p1}, LK6/b;->h()Ly6/d;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-direct/range {v3 .. v9}, Lx6/b;-><init>(Ljava/lang/String;Ly6/g;Ly6/h;Ly6/d;Ls5/d;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-boolean p1, Lx6/p;->b:Z

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Lx6/b;->d(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :cond_1
    invoke-virtual {v3, p2}, Lx6/b;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v3
.end method

.method public c(LK6/b;Landroid/net/Uri;Ljava/lang/Object;)Ls5/d;
    .locals 0

    .line 1
    new-instance p1, Ls5/i;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lx6/p;->e(Landroid/net/Uri;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ls5/i;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public d(LK6/b;Ljava/lang/Object;)Ls5/d;
    .locals 1

    .line 1
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0, p2}, Lx6/p;->c(LK6/b;Landroid/net/Uri;Ljava/lang/Object;)Ls5/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method protected e(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 0

    .line 1
    return-object p1
.end method
