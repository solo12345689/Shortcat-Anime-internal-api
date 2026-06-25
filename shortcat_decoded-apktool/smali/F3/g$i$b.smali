.class LF3/g$i$b;
.super LF3/g$h$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:LF3/g$i;


# direct methods
.method constructor <init>(LF3/g$i;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$i$b;->b:LF3/g$i;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, LF3/g$h$c;-><init>(LF3/g$h;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$i$b;->b:LF3/g$i;

    .line 2
    .line 3
    new-instance v1, LF3/g$m;

    .line 4
    .line 5
    invoke-direct {v1, p2}, LF3/g$m;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, LF3/g$i;->h(Ljava/lang/String;LF3/g$m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
