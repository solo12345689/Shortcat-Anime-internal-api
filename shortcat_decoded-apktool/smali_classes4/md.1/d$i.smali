.class public final Lmd/d$i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->F(Landroidx/media3/exoplayer/ExoPlayer;JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/ExoPlayer;

.field final synthetic b:LGf/n;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/ExoPlayer;LGf/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/d$i;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lmd/d$i;->b:LGf/n;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public T()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/d$i;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lq2/P;->H(Lq2/P$d;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmd/d$i;->b:LGf/n;

    .line 7
    .line 8
    invoke-interface {v0}, LGf/n;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lmd/d$i;->b:LGf/n;

    .line 15
    .line 16
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 17
    .line 18
    sget-object v1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
