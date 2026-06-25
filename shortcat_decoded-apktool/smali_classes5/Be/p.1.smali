.class public final LBe/p;
.super LBe/H;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lye/H;LXe/c;)V
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LBe/H;-><init>(Lye/H;LXe/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public H0()Ljf/k$b;
    .locals 1

    .line 1
    sget-object v0, Ljf/k$b;->b:Ljf/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic o()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/p;->H0()Ljf/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
