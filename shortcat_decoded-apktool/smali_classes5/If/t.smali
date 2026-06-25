.class final LIf/t;
.super LIf/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LIf/u;


# direct methods
.method public constructor <init>(LZd/i;LIf/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0, v0}, LIf/h;-><init>(LZd/i;LIf/g;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method protected R0(Ljava/lang/Throwable;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LIf/h;->U0()LIf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LIf/w;->i(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LGf/a;->getContext()LZd/i;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2, p1}, LGf/M;->a(LZd/i;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public bridge synthetic S0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LIf/t;->V0(LTd/L;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected V0(LTd/L;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LIf/h;->U0()LIf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p1, v0, v1, v0}, LIf/w$a;->a(LIf/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-super {p0}, LGf/a;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
