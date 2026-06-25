.class LF3/g$k;
.super LF3/g$j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation


# instance fields
.field final synthetic g:LF3/g;


# direct methods
.method constructor <init>(LF3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$k;->g:LF3/g;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LF3/g$j;-><init>(LF3/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()LF3/q$b;
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$k;->g:LF3/g;

    .line 2
    .line 3
    iget-object v1, v0, LF3/g;->f:LF3/g$f;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, LF3/g;->c:LF3/g$f;

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    new-instance v0, LF3/q$b;

    .line 12
    .line 13
    iget-object v1, p0, LF3/g$h;->b:Landroid/service/media/MediaBrowserService;

    .line 14
    .line 15
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/service/media/MediaBrowserService;

    .line 20
    .line 21
    invoke-static {v1}, LF3/h;->a(Landroid/service/media/MediaBrowserService;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, LF3/q$b;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    iget-object v0, v1, LF3/g$f;->d:LF3/q$b;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method
