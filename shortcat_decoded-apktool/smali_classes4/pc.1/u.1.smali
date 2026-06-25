.class public abstract Lpc/u;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/types/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/facebook/react/bridge/Dynamic;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/bridge/Dynamic;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lpc/u;->f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lpc/u;->e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public abstract e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
.end method

.method public abstract f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;
.end method
