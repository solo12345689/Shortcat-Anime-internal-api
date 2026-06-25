.class LS2/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS2/L$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS2/k;->p2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LS2/k;


# direct methods
.method constructor <init>(LS2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$a;->b:LS2/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/k$a;->b:LS2/k;

    .line 2
    .line 3
    invoke-static {v0}, LS2/k;->h2(LS2/k;)Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/k$a;->b:LS2/k;

    .line 10
    .line 11
    invoke-static {v0}, LS2/k;->i2(LS2/k;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public b(Lq2/l0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, LS2/k$a;->b:LS2/k;

    .line 2
    .line 3
    invoke-static {v0}, LS2/k;->h2(LS2/k;)Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/k$a;->b:LS2/k;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, LS2/k;->m3(II)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/k$a;->b:LS2/k;

    .line 2
    .line 3
    invoke-static {v0}, LS2/k;->g2(LS2/k;)Landroidx/media3/exoplayer/N0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0$a;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
