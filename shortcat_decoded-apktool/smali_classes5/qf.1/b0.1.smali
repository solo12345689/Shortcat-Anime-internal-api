.class final Lqf/b0;
.super Lqf/B;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lqf/d0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lqf/B;-><init>(Lqf/d0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public O0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic Y0(Lqf/d0;)Lqf/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/b0;->Z0(Lqf/d0;)Lqf/b0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public Z0(Lqf/d0;)Lqf/b0;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/b0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lqf/b0;-><init>(Lqf/d0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
