.class public final LQ2/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/m$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ2/o$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lw2/o;

.field public final c:I

.field private final d:Lw2/D;

.field private final e:LQ2/o$a;

.field private volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw2/g;Landroid/net/Uri;ILQ2/o$a;)V
    .locals 1

    .line 1
    new-instance v0, Lw2/o$b;

    invoke-direct {v0}, Lw2/o$b;-><init>()V

    .line 2
    invoke-virtual {v0, p2}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lw2/o$b;->b(I)Lw2/o$b;

    move-result-object p2

    invoke-virtual {p2}, Lw2/o$b;->a()Lw2/o;

    move-result-object p2

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, LQ2/o;-><init>(Lw2/g;Lw2/o;ILQ2/o$a;)V

    return-void
.end method

.method public constructor <init>(Lw2/g;Lw2/o;ILQ2/o$a;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lw2/D;

    invoke-direct {v0, p1}, Lw2/D;-><init>(Lw2/g;)V

    iput-object v0, p0, LQ2/o;->d:Lw2/D;

    .line 6
    iput-object p2, p0, LQ2/o;->b:Lw2/o;

    .line 7
    iput p3, p0, LQ2/o;->c:I

    .line 8
    iput-object p4, p0, LQ2/o;->e:LQ2/o$a;

    .line 9
    invoke-static {}, LM2/y;->a()J

    move-result-wide p1

    iput-wide p1, p0, LQ2/o;->a:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LQ2/o;->d:Lw2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw2/D;->s()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw2/m;

    .line 7
    .line 8
    iget-object v1, p0, LQ2/o;->d:Lw2/D;

    .line 9
    .line 10
    iget-object v2, p0, LQ2/o;->b:Lw2/o;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lw2/m;-><init>(Lw2/g;Lw2/o;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Lw2/m;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LQ2/o;->d:Lw2/D;

    .line 19
    .line 20
    invoke-virtual {v1}, Lw2/D;->c()Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v2, p0, LQ2/o;->e:LQ2/o$a;

    .line 31
    .line 32
    invoke-interface {v2, v1, v0}, LQ2/o$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, LQ2/o;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/o;->d:Lw2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw2/D;->p()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/o;->d:Lw2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw2/D;->r()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/o;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/o;->d:Lw2/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw2/D;->q()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
