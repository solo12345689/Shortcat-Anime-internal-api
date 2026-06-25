.class LF3/g$d;
.super LF3/g$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g;->n(Ljava/lang/String;Landroid/os/Bundle;LF3/g$f;Ld/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Ld/b;

.field final synthetic g:LF3/g;


# direct methods
.method constructor <init>(LF3/g;Ljava/lang/Object;Ld/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$d;->g:LF3/g;

    .line 2
    .line 3
    iput-object p3, p0, LF3/g$d;->f:Ld/b;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LF3/g$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method c(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$d;->f:Ld/b;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, v1, p1}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/g$d;->h(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method h(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$d;->f:Ld/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
