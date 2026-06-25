.class LE3/B2$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/B2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field public final a:LE3/M6;

.field public final b:LE3/U6;

.field public final c:Lq2/P$b;

.field public final d:LP9/u;

.field public final e:Landroid/os/Bundle;

.field public final f:LE3/V6;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LE3/M6;->F:LE3/M6;

    sget-object v1, LE3/O6;->g:LE3/O6;

    invoke-virtual {v0, v1}, LE3/M6;->u(Lq2/Y;)LE3/M6;

    move-result-object v0

    iput-object v0, p0, LE3/B2$d;->a:LE3/M6;

    .line 3
    sget-object v0, LE3/U6;->b:LE3/U6;

    iput-object v0, p0, LE3/B2$d;->b:LE3/U6;

    .line 4
    sget-object v0, Lq2/P$b;->b:Lq2/P$b;

    iput-object v0, p0, LE3/B2$d;->c:Lq2/P$b;

    .line 5
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, LE3/B2$d;->d:LP9/u;

    .line 6
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, LE3/B2$d;->e:Landroid/os/Bundle;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, LE3/B2$d;->f:LE3/V6;

    return-void
.end method

.method public constructor <init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LE3/B2$d;->a:LE3/M6;

    .line 10
    iput-object p2, p0, LE3/B2$d;->b:LE3/U6;

    .line 11
    iput-object p3, p0, LE3/B2$d;->c:Lq2/P$b;

    .line 12
    iput-object p4, p0, LE3/B2$d;->d:LP9/u;

    if-nez p5, :cond_0

    .line 13
    sget-object p5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_0
    iput-object p5, p0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 14
    iput-object p6, p0, LE3/B2$d;->f:LE3/V6;

    return-void
.end method
