.class final LM2/i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/d0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LM2/d0;

.field private final b:LP9/u;


# direct methods
.method public constructor <init>(LM2/d0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/i$a;->a:LM2/d0;

    .line 5
    .line 6
    invoke-static {p2}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LM2/i$a;->b:LP9/u;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/i$a;->a:LM2/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LM2/d0;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/i$a;->b:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/i$a;->a:LM2/d0;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/d0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/i$a;->a:LM2/d0;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/d0;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public g(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/i$a;->a:LM2/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LM2/d0;->g(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/i$a;->a:LM2/d0;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/d0;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
