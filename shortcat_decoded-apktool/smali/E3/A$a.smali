.class public final LE3/A$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LE3/Y6;

.field private c:Landroid/os/Bundle;

.field private d:LE3/A$c;

.field private e:Landroid/os/Looper;

.field private f:Lt2/h;

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(Landroid/content/Context;LE3/Y6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/Context;

    .line 9
    .line 10
    iput-object p1, p0, LE3/A$a;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LE3/Y6;

    .line 17
    .line 18
    iput-object p1, p0, LE3/A$a;->b:LE3/Y6;

    .line 19
    .line 20
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 21
    .line 22
    iput-object p1, p0, LE3/A$a;->c:Landroid/os/Bundle;

    .line 23
    .line 24
    new-instance p1, LE3/A$a$a;

    .line 25
    .line 26
    invoke-direct {p1, p0}, LE3/A$a$a;-><init>(LE3/A$a;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LE3/A$a;->d:LE3/A$c;

    .line 30
    .line 31
    invoke-static {}, Lt2/a0;->Z()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LE3/A$a;->e:Landroid/os/Looper;

    .line 36
    .line 37
    const-wide/16 p1, 0x64

    .line 38
    .line 39
    iput-wide p1, p0, LE3/A$a;->h:J

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic a(LE3/D;LE3/A;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE3/D;->N(LE3/A;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/p;
    .locals 11

    .line 1
    new-instance v6, LE3/D;

    .line 2
    .line 3
    iget-object v0, p0, LE3/A$a;->e:Landroid/os/Looper;

    .line 4
    .line 5
    invoke-direct {v6, v0}, LE3/D;-><init>(Landroid/os/Looper;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LE3/A$a;->b:LE3/Y6;

    .line 9
    .line 10
    invoke-virtual {v0}, LE3/Y6;->j()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LE3/A$a;->f:Lt2/h;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, LE3/a;

    .line 21
    .line 22
    new-instance v1, Lw2/k;

    .line 23
    .line 24
    iget-object v2, p0, LE3/A$a;->a:Landroid/content/Context;

    .line 25
    .line 26
    invoke-direct {v1, v2}, Lw2/k;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LE3/a;-><init>(Lt2/h;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LE3/A$a;->f:Lt2/h;

    .line 33
    .line 34
    :cond_0
    new-instance v0, LE3/A;

    .line 35
    .line 36
    iget-object v1, p0, LE3/A$a;->a:Landroid/content/Context;

    .line 37
    .line 38
    iget-object v2, p0, LE3/A$a;->b:LE3/Y6;

    .line 39
    .line 40
    iget-object v3, p0, LE3/A$a;->c:Landroid/os/Bundle;

    .line 41
    .line 42
    iget-object v4, p0, LE3/A$a;->d:LE3/A$c;

    .line 43
    .line 44
    iget-object v5, p0, LE3/A$a;->e:Landroid/os/Looper;

    .line 45
    .line 46
    iget-object v7, p0, LE3/A$a;->f:Lt2/h;

    .line 47
    .line 48
    iget v8, p0, LE3/A$a;->g:I

    .line 49
    .line 50
    iget-wide v9, p0, LE3/A$a;->h:J

    .line 51
    .line 52
    invoke-direct/range {v0 .. v10}, LE3/A;-><init>(Landroid/content/Context;LE3/Y6;Landroid/os/Bundle;LE3/A$c;Landroid/os/Looper;LE3/A$b;Lt2/h;IJ)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Landroid/os/Handler;

    .line 56
    .line 57
    iget-object v2, p0, LE3/A$a;->e:Landroid/os/Looper;

    .line 58
    .line 59
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, LE3/z;

    .line 63
    .line 64
    invoke-direct {v2, v6, v0}, LE3/z;-><init>(LE3/D;LE3/A;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    return-object v6
.end method

.method public c(Landroid/os/Looper;)LE3/A$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/os/Looper;

    .line 6
    .line 7
    iput-object p1, p0, LE3/A$a;->e:Landroid/os/Looper;

    .line 8
    .line 9
    return-object p0
.end method

.method public d(Landroid/os/Bundle;)LE3/A$a;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LE3/A$a;->c:Landroid/os/Bundle;

    .line 13
    .line 14
    return-object p0
.end method

.method public e(LE3/A$c;)LE3/A$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/A$c;

    .line 6
    .line 7
    iput-object p1, p0, LE3/A$a;->d:LE3/A$c;

    .line 8
    .line 9
    return-object p0
.end method
