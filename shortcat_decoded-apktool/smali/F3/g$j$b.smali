.class LF3/g$j$b;
.super LF3/g$i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:LF3/g$j;


# direct methods
.method constructor <init>(LF3/g$j;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$j$b;->c:LF3/g$j;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, LF3/g$i$b;-><init>(LF3/g$i;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p3}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LF3/g$j$b;->c:LF3/g$j;

    .line 5
    .line 6
    iget-object v1, v0, LF3/g$j;->f:LF3/g;

    .line 7
    .line 8
    iget-object v2, v1, LF3/g;->c:LF3/g$f;

    .line 9
    .line 10
    iput-object v2, v1, LF3/g;->f:LF3/g$f;

    .line 11
    .line 12
    new-instance v1, LF3/g$m;

    .line 13
    .line 14
    invoke-direct {v1, p2}, LF3/g$m;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1, p3}, LF3/g$j;->i(Ljava/lang/String;LF3/g$m;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LF3/g$j$b;->c:LF3/g$j;

    .line 21
    .line 22
    iget-object p1, p1, LF3/g$j;->f:LF3/g;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    iput-object p2, p1, LF3/g;->f:LF3/g$f;

    .line 26
    .line 27
    return-void
.end method
