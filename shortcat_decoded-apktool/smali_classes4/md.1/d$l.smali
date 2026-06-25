.class public final Lmd/d$l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/d;->G(Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)Ljava/lang/Object;
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
    iput-object p1, p0, Lmd/d$l;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lmd/d$l;->b:LGf/n;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public J(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lmd/d$l;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Lq2/P;->H(Lq2/P$d;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lmd/d$l;->b:LGf/n;

    .line 14
    .line 15
    invoke-interface {p1}, LGf/n;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lmd/d$l;->b:LGf/n;

    .line 22
    .line 23
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 24
    .line 25
    sget-object v0, LTd/L;->a:LTd/L;

    .line 26
    .line 27
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object p1, p0, Lmd/d$l;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 36
    .line 37
    invoke-interface {p1, p0}, Lq2/P;->H(Lq2/P$d;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lmd/d$l;->b:LGf/n;

    .line 41
    .line 42
    invoke-interface {p1}, LGf/n;->b()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lmd/d$l;->b:LGf/n;

    .line 49
    .line 50
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 51
    .line 52
    new-instance v0, Lmd/a;

    .line 53
    .line 54
    const-string v1, "Player went to IDLE state"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_0
    return-void
.end method
