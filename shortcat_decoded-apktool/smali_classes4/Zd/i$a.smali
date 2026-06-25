.class public abstract LZd/i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZd/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(LZd/i;LZd/i$b;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZd/i$a;->c(LZd/i;LZd/i$b;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static b(LZd/i;LZd/i;)LZd/i;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LZd/j;->a:LZd/j;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, LZd/h;

    .line 12
    .line 13
    invoke-direct {v0}, LZd/h;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0, v0}, LZd/i;->y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, LZd/i;

    .line 21
    .line 22
    return-object p0
.end method

.method private static c(LZd/i;LZd/i$b;)LZd/i;
    .locals 3

    .line 1
    const-string v0, "acc"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "element"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, LZd/i$b;->getKey()LZd/i$c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p0, v0}, LZd/i;->a1(LZd/i$c;)LZd/i;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, LZd/j;->a:LZd/j;

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object v1, LZd/f;->S:LZd/f$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LZd/f;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    new-instance v0, LZd/d;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, LZd/d;-><init>(LZd/i;LZd/i$b;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    invoke-interface {p0, v1}, LZd/i;->a1(LZd/i$c;)LZd/i;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-ne p0, v0, :cond_2

    .line 45
    .line 46
    new-instance p0, LZd/d;

    .line 47
    .line 48
    invoke-direct {p0, p1, v2}, LZd/d;-><init>(LZd/i;LZd/i$b;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    new-instance v0, LZd/d;

    .line 53
    .line 54
    new-instance v1, LZd/d;

    .line 55
    .line 56
    invoke-direct {v1, p0, p1}, LZd/d;-><init>(LZd/i;LZd/i$b;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, LZd/d;-><init>(LZd/i;LZd/i$b;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method
