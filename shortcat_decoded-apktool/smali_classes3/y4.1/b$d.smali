.class public final Ly4/b$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final a:Ly4/b$c;

.field private b:Z

.field final synthetic c:Ly4/b;


# direct methods
.method public constructor <init>(Ly4/b;Ly4/b$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly4/b$d;->c:Ly4/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ly4/b$b;
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/b$d;->c:Ly4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ly4/b$d;->close()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 8
    .line 9
    invoke-virtual {v1}, Ly4/b$c;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ly4/b;->O(Ljava/lang/String;)Ly4/b$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
.end method

.method public final b(I)Ltg/P;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly4/b$d;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ly4/b$c;->a()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ltg/P;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "snapshot is closed"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ly4/b$d;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ly4/b$d;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Ly4/b$d;->c:Ly4/b;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 12
    .line 13
    invoke-virtual {v1}, Ly4/b$c;->f()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ly4/b$c;->k(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 23
    .line 24
    invoke-virtual {v1}, Ly4/b$c;->f()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 31
    .line 32
    invoke-virtual {v1}, Ly4/b$c;->h()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Ly4/b$d;->a:Ly4/b$c;

    .line 39
    .line 40
    invoke-static {v0, v1}, Ly4/b;->m(Ly4/b;Ly4/b$c;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit v0

    .line 51
    throw v1

    .line 52
    :cond_1
    return-void
.end method
