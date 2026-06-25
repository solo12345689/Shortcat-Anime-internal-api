.class public abstract LVf/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/lang/String;LRf/b;)LTf/e;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "primitiveSerializer"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LVf/F;

    .line 12
    .line 13
    new-instance v1, LVf/G$a;

    .line 14
    .line 15
    invoke-direct {v1, p1}, LVf/G$a;-><init>(LRf/b;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, LVf/F;-><init>(Ljava/lang/String;LVf/E;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
