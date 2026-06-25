.class LF3/g$c;
.super LF3/g$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g;->q(Ljava/lang/String;Landroid/os/Bundle;LF3/g$f;Ld/b;)V
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
    iput-object p1, p0, LF3/g$c;->g:LF3/g;

    .line 2
    .line 3
    iput-object p3, p0, LF3/g$c;->f:Ld/b;

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
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/g$c;->h(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method h(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LF3/g$l;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 18
    .line 19
    invoke-static {p1, v1}, LF3/d;->b(Ljava/util/List;Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    new-array v2, v1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Landroid/os/Parcelable;

    .line 31
    .line 32
    const-string v2, "search_results"

    .line 33
    .line 34
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, LF3/g$c;->f:Ld/b;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v0}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    :goto_0
    iget-object p1, p0, LF3/g$c;->f:Ld/b;

    .line 44
    .line 45
    const/4 v0, -0x1

    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {p1, v0, v1}, Ld/b;->b(ILandroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
