.class public Lt6/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/c$b;
    }
.end annotation


# instance fields
.field private final a:Ls5/d;

.field private final b:Lx6/n;

.field private final c:Lx6/n$b;

.field private final d:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ls5/d;Lx6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt6/c;->a:Ls5/d;

    .line 5
    .line 6
    iput-object p2, p0, Lt6/c;->b:Lx6/n;

    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lt6/c;->d:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    new-instance p1, Lt6/c$a;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lt6/c$a;-><init>(Lt6/c;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lt6/c;->c:Lx6/n$b;

    .line 21
    .line 22
    return-void
.end method

.method private e(I)Lt6/c$b;
    .locals 2

    .line 1
    new-instance v0, Lt6/c$b;

    .line 2
    .line 3
    iget-object v1, p0, Lt6/c;->a:Ls5/d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lt6/c$b;-><init>(Ls5/d;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private declared-synchronized g()Ls5/d;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lt6/c;->d:Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ls5/d;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    return-object v1

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method


# virtual methods
.method public a(ILC5/a;)LC5/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lt6/c;->b:Lx6/n;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt6/c;->e(I)Lt6/c$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, Lt6/c;->c:Lx6/n$b;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, v1}, Lx6/n;->d(Ljava/lang/Object;LC5/a;Lx6/n$b;)LC5/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public b(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/c;->b:Lx6/n;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt6/c;->e(I)Lt6/c$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lx6/x;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public c(I)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/c;->b:Lx6/n;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt6/c;->e(I)Lt6/c$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lx6/x;->get(Ljava/lang/Object;)LC5/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d()LC5/a;
    .locals 2

    .line 1
    :cond_0
    invoke-direct {p0}, Lt6/c;->g()Ls5/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_1
    iget-object v1, p0, Lt6/c;->b:Lx6/n;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lx6/n;->e(Ljava/lang/Object;)LC5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0
.end method

.method public declared-synchronized f(Ls5/d;Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, Lt6/c;->d:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object p2, p0, Lt6/c;->d:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method
