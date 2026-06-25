.class LF3/g$i;
.super LF3/g$h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/g$i$b;
    }
.end annotation


# instance fields
.field final synthetic e:LF3/g;


# direct methods
.method constructor <init>(LF3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$i;->e:LF3/g;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LF3/g$h;-><init>(LF3/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    new-instance v0, LF3/g$i$b;

    .line 2
    .line 3
    iget-object v1, p0, LF3/g$i;->e:LF3/g;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, LF3/g$i$b;-><init>(LF3/g$i;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LF3/g$h;->b:Landroid/service/media/MediaBrowserService;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public h(Ljava/lang/String;LF3/g$m;)V
    .locals 2

    .line 1
    new-instance v0, LF3/g$i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LF3/g$i$a;-><init>(LF3/g$i;Ljava/lang/Object;LF3/g$m;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LF3/g$i;->e:LF3/g;

    .line 7
    .line 8
    iget-object v1, p2, LF3/g;->c:LF3/g$f;

    .line 9
    .line 10
    iput-object v1, p2, LF3/g;->f:LF3/g$f;

    .line 11
    .line 12
    invoke-virtual {p2, p1, v0}, LF3/g;->j(Ljava/lang/String;LF3/g$l;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LF3/g$i;->e:LF3/g;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iput-object p2, p1, LF3/g;->f:LF3/g$f;

    .line 19
    .line 20
    return-void
.end method
