.class Landroidx/transition/w$b;
.super Landroidx/transition/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/w;->e0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/transition/w;


# direct methods
.method constructor <init>(Landroidx/transition/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/transition/w$b;->a:Landroidx/transition/w;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public k(Landroidx/transition/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/w$b;->a:Landroidx/transition/w;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/transition/w;->o0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/transition/w$b;->a:Landroidx/transition/w;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/transition/w;->Q()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/transition/w$b;->a:Landroidx/transition/w;

    .line 17
    .line 18
    sget-object v0, Landroidx/transition/k$j;->c:Landroidx/transition/k$j;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Landroidx/transition/k;->b0(Landroidx/transition/k$j;Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/transition/w$b;->a:Landroidx/transition/w;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p1, Landroidx/transition/k;->B:Z

    .line 28
    .line 29
    sget-object v0, Landroidx/transition/k$j;->b:Landroidx/transition/k$j;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Landroidx/transition/k;->b0(Landroidx/transition/k$j;Z)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
