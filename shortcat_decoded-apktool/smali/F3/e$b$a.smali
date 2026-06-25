.class LF3/e$b$a;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LF3/e$b;


# direct methods
.method constructor <init>(LF3/e$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 2
    .line 3
    iget-object v0, v0, LF3/e$b;->b:LF3/e$b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, LF3/e$b$b;->onConnected()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 11
    .line 12
    invoke-virtual {v0}, LF3/e$b;->a()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onConnectionFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 2
    .line 3
    iget-object v0, v0, LF3/e$b;->b:LF3/e$b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, LF3/e$b$b;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 11
    .line 12
    invoke-virtual {v0}, LF3/e$b;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onConnectionSuspended()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 2
    .line 3
    iget-object v0, v0, LF3/e$b;->b:LF3/e$b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, LF3/e$b$b;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LF3/e$b$a;->a:LF3/e$b;

    .line 11
    .line 12
    invoke-virtual {v0}, LF3/e$b;->c()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
