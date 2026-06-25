.class public abstract Lg8/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lg8/b;


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

.method public static b(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Lg8/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x7

    .line 6
    if-eq p0, v0, :cond_3

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p0, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, -0x2

    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    new-instance p0, Lg8/a;

    .line 18
    .line 19
    invoke-direct {p0}, Lg8/a;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p0, Lg8/h$a;

    .line 24
    .line 25
    invoke-direct {p0}, Lg8/h$a;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    new-instance p0, Lg8/d;

    .line 30
    .line 31
    invoke-direct {p0}, Lg8/d;-><init>()V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    new-instance p0, Lg8/l;

    .line 36
    .line 37
    invoke-direct {p0}, Lg8/l;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    new-instance p0, Lg8/i;

    .line 42
    .line 43
    invoke-direct {p0}, Lg8/i;-><init>()V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method
