.class public final LKf/h;
.super LKf/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(LJf/e;LZd/i;ILIf/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LKf/g;-><init>(LJf/e;LZd/i;ILIf/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LJf/e;LZd/i;ILIf/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, LZd/j;->a:LZd/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LIf/a;->a:LIf/a;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LKf/h;-><init>(LJf/e;LZd/i;ILIf/a;)V

    return-void
.end method


# virtual methods
.method protected i(LZd/i;ILIf/a;)LKf/e;
    .locals 2

    .line 1
    new-instance v0, LKf/h;

    .line 2
    .line 3
    iget-object v1, p0, LKf/g;->d:LJf/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, LKf/h;-><init>(LJf/e;LZd/i;ILIf/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public j()LJf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LKf/g;->d:LJf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method protected q(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LKf/g;->d:LJf/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method
