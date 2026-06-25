.class Landroidx/transition/w$c;
.super Landroidx/transition/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Landroidx/transition/w;


# direct methods
.method constructor <init>(Landroidx/transition/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/transition/w$c;->a:Landroidx/transition/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e(Landroidx/transition/k;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/transition/w$c;->a:Landroidx/transition/w;

    .line 2
    .line 3
    iget-boolean v0, p1, Landroidx/transition/w;->r0:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/transition/k;->r0()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/transition/w$c;->a:Landroidx/transition/w;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Landroidx/transition/w;->r0:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public i(Landroidx/transition/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/w$c;->a:Landroidx/transition/w;

    .line 2
    .line 3
    iget v1, v0, Landroidx/transition/w;->q0:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, v0, Landroidx/transition/w;->q0:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, v0, Landroidx/transition/w;->r0:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/transition/k;->u()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/k;->f0(Landroidx/transition/k$i;)Landroidx/transition/k;

    .line 18
    .line 19
    .line 20
    return-void
.end method
