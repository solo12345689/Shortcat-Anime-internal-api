.class public abstract LF/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LY/C0;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(LY/C0;)LY/C0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic c(LY/C0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LY/C0;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object p0, LTd/L;->a:LTd/L;

    .line 6
    .line 7
    invoke-static {}, LY/U1;->j()LY/T1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    invoke-static {p0}, LF/J;->b(LY/C0;)LY/C0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final d(LY/C0;)V
    .locals 1

    .line 1
    sget-object v0, LTd/L;->a:LTd/L;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
