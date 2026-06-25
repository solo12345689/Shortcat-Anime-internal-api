.class public LVh/c$a;
.super Lai/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lai/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lai/h;Lai/g;)Lai/f;
    .locals 3

    .line 1
    invoke-interface {p1}, Lai/h;->d()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p1, p2}, LVh/c;->j(Lai/h;I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Lai/h;->getColumn()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-interface {p1}, Lai/h;->b()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    invoke-interface {p1}, Lai/h;->a()LZh/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x1

    .line 31
    add-int/2addr p2, v2

    .line 32
    invoke-static {p1, p2}, LXh/f;->j(Ljava/lang/CharSequence;I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x2

    .line 39
    .line 40
    :cond_0
    new-instance p1, LVh/c;

    .line 41
    .line 42
    invoke-direct {p1}, LVh/c;-><init>()V

    .line 43
    .line 44
    .line 45
    new-array p2, v2, [Lai/d;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    aput-object p1, p2, v0

    .line 49
    .line 50
    invoke-static {p2}, Lai/f;->d([Lai/d;)Lai/f;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, v1}, Lai/f;->a(I)Lai/f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_1
    invoke-static {}, Lai/f;->c()Lai/f;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method
