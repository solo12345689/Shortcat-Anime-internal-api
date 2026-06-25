.class public final LKd/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/m;->g()Lq2/P$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKd/m;


# direct methods
.method constructor <init>(LKd/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LKd/m$a;->a:LKd/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public J(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LKd/m$a;->a:LKd/m;

    .line 2
    .line 3
    invoke-static {v0}, LKd/m;->e(LKd/m;)Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    if-eq p1, v1, :cond_3

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq p1, v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    if-eq p1, v2, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    if-eq p1, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Lq2/P;->q0()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    sget-object p1, LId/m;->a:LId/m;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, LId/m;->s(Lexpo/modules/video/player/VideoPlayer;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void

    .line 45
    :cond_3
    sget-object p1, LId/m;->a:LId/m;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LId/m;->s(Lexpo/modules/video/player/VideoPlayer;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public y0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LKd/m$a;->a:LKd/m;

    .line 2
    .line 3
    invoke-static {v0}, LKd/m;->e(LKd/m;)Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget-object p1, LId/m;->a:LId/m;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LId/m;->s(Lexpo/modules/video/player/VideoPlayer;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    sget-object p1, LId/m;->a:LId/m;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LId/m;->r(Lexpo/modules/video/player/VideoPlayer;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
