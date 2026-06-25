.class final Lmd/d$j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->G(Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGf/n;

.field final synthetic b:Landroidx/media3/exoplayer/ExoPlayer;

.field final synthetic c:Lmd/d$l;


# direct methods
.method constructor <init>(LGf/n;Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/d$j;->a:LGf/n;

    .line 2
    .line 3
    iput-object p2, p0, Lmd/d$j;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    iput-object p3, p0, Lmd/d$j;->c:Lmd/d$l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/d$j;->a:LGf/n;

    .line 2
    .line 3
    invoke-interface {v0}, LGf/n;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lmd/d$j;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 10
    .line 11
    iget-object v1, p0, Lmd/d$j;->c:Lmd/d$l;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lq2/P;->H(Lq2/P$d;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lmd/d$j;->a:LGf/n;

    .line 17
    .line 18
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 19
    .line 20
    new-instance v1, Lmd/a;

    .line 21
    .line 22
    const-string v2, "Player ready timeout"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method
