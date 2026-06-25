.class LF2/u$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF2/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Lq2/x;)I
    .locals 0

    .line 1
    iget-object p1, p1, Lq2/x;->s:Lq2/q;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public d(LF2/t$a;Lq2/x;)LF2/m;
    .locals 2

    .line 1
    iget-object p1, p2, Lq2/x;->s:Lq2/q;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    new-instance p1, LF2/z;

    .line 8
    .line 9
    new-instance p2, LF2/m$a;

    .line 10
    .line 11
    new-instance v0, LF2/O;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, LF2/O;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x1771

    .line 18
    .line 19
    invoke-direct {p2, v0, v1}, LF2/m$a;-><init>(Ljava/lang/Throwable;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p2}, LF2/z;-><init>(LF2/m$a;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public e(Landroid/os/Looper;LB2/K1;)V
    .locals 0

    .line 1
    return-void
.end method
