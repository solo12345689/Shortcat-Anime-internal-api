.class public abstract Luf/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luf/s$a;
    }
.end annotation


# direct methods
.method public static final a(Lqf/N0;)Luf/v;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Luf/s$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    sget-object p0, Luf/v;->c:Luf/v;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, LTd/r;

    .line 27
    .line 28
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    sget-object p0, Luf/v;->b:Luf/v;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Luf/v;->d:Luf/v;

    .line 36
    .line 37
    return-object p0
.end method
