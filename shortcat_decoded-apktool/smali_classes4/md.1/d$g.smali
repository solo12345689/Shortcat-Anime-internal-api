.class final Lmd/d$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->F(Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGf/n;

.field final synthetic b:Landroidx/media3/exoplayer/ExoPlayer;

.field final synthetic c:Lmd/d$i;


# direct methods
.method constructor <init>(LGf/n;Landroidx/media3/exoplayer/ExoPlayer;Lmd/d$i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/d$g;->a:LGf/n;

    .line 2
    .line 3
    iput-object p2, p0, Lmd/d$g;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    iput-object p3, p0, Lmd/d$g;->c:Lmd/d$i;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/d$g;->a:LGf/n;

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
    iget-object v0, p0, Lmd/d$g;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 10
    .line 11
    iget-object v1, p0, Lmd/d$g;->c:Lmd/d$i;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lq2/P;->H(Lq2/P$d;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lmd/d$g;->a:LGf/n;

    .line 17
    .line 18
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 19
    .line 20
    sget-object v1, LTd/L;->a:LTd/L;

    .line 21
    .line 22
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
