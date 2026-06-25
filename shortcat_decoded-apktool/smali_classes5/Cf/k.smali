.class public abstract LCf/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
.end method

.method public final e(LCf/i;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LCf/k;->f(Ljava/util/Iterator;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 17
    .line 18
    return-object p1
.end method

.method public abstract f(Ljava/util/Iterator;LZd/e;)Ljava/lang/Object;
.end method
