.class LE3/I3$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE3/I3;->p0(LE3/h3$g;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE3/h3$g;

.field final synthetic b:Z

.field final synthetic c:Lq2/P$b;

.field final synthetic d:LE3/I3;


# direct methods
.method constructor <init>(LE3/I3;LE3/h3$g;ZLq2/P$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/I3$a;->d:LE3/I3;

    .line 2
    .line 3
    iput-object p2, p0, LE3/I3$a;->a:LE3/h3$g;

    .line 4
    .line 5
    iput-boolean p3, p0, LE3/I3$a;->b:Z

    .line 6
    .line 7
    iput-object p4, p0, LE3/I3$a;->c:Lq2/P$b;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic b(LE3/I3$a;LE3/h3$i;ZLE3/h3$g;Lq2/P$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I3$a;->d:LE3/I3;

    .line 2
    .line 3
    invoke-static {v0}, LE3/I3;->y(LE3/I3;)LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, LE3/L6;->i(Lq2/P;LE3/h3$i;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LE3/I3$a;->d:LE3/I3;

    .line 11
    .line 12
    invoke-static {p1}, LE3/I3;->y(LE3/I3;)LE3/N6;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lt2/a0;->B0(Lq2/P;)Z

    .line 17
    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, LE3/I3$a;->d:LE3/I3;

    .line 22
    .line 23
    invoke-virtual {p0, p3, p4}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "MediaSessionImpl"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService."

    .line 8
    .line 9
    invoke-static {v1, v0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "Failure calling MediaSession.Callback.onPlaybackResumption(): "

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v1, v0, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p1, p0, LE3/I3$a;->d:LE3/I3;

    .line 38
    .line 39
    invoke-static {p1}, LE3/I3;->y(LE3/I3;)LE3/N6;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lt2/a0;->B0(Lq2/P;)Z

    .line 44
    .line 45
    .line 46
    iget-boolean p1, p0, LE3/I3$a;->b:Z

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, LE3/I3$a;->d:LE3/I3;

    .line 51
    .line 52
    iget-object v0, p0, LE3/I3$a;->a:LE3/h3$g;

    .line 53
    .line 54
    iget-object v1, p0, LE3/I3$a;->c:Lq2/P$b;

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public c(LE3/h3$i;)V
    .locals 7

    .line 1
    iget-object v0, p0, LE3/I3$a;->d:LE3/I3;

    .line 2
    .line 3
    iget-object v5, p0, LE3/I3$a;->a:LE3/h3$g;

    .line 4
    .line 5
    iget-boolean v4, p0, LE3/I3$a;->b:Z

    .line 6
    .line 7
    iget-object v6, p0, LE3/I3$a;->c:Lq2/P$b;

    .line 8
    .line 9
    new-instance v1, LE3/H3;

    .line 10
    .line 11
    move-object v2, p0

    .line 12
    move-object v3, p1

    .line 13
    invoke-direct/range {v1 .. v6}, LE3/H3;-><init>(LE3/I3$a;LE3/h3$i;ZLE3/h3$g;Lq2/P$b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v5, v1}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LE3/h3$i;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE3/I3$a;->c(LE3/h3$i;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
