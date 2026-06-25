.class public interface abstract LE0/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Li1/d;


# direct methods
.method public static synthetic D1(LE0/b;LE0/s;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p1, LE0/s;->b:LE0/s;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, LE0/b;->p0(LE0/s;LZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: awaitPointerEvent"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public abstract F0()LE0/q;
.end method

.method public abstract K(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
.end method

.method public abstract a()J
.end method

.method public abstract d1(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
.end method

.method public abstract getViewConfiguration()Landroidx/compose/ui/platform/A1;
.end method

.method public abstract n0()J
.end method

.method public abstract p0(LE0/s;LZd/e;)Ljava/lang/Object;
.end method
