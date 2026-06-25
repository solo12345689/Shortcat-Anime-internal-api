.class LF3/g$b;
.super LF3/g$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g;->p(Ljava/lang/String;LF3/g$f;Ld/b;)V
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
    iput-object p1, p0, LF3/g$b;->g:LF3/g;

    .line 2
    .line 3
    iput-object p3, p0, LF3/g$b;->f:Ld/b;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LF3/g$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LF3/e$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/g$b;->h(LF3/e$h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method h(LF3/e$h;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF3/g$l;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LF3/g$b;->f:Ld/b;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v0, v1}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 23
    .line 24
    invoke-static {p1, v1}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "media_item"

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, LF3/g$b;->f:Ld/b;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1, v1, v0}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
