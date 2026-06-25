.class final Lqf/f0;
.super Lqf/B;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final c:Lqf/r0;


# direct methods
.method public constructor <init>(Lqf/d0;Lqf/r0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lqf/B;-><init>(Lqf/d0;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lqf/f0;->c:Lqf/r0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public M0()Lqf/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/f0;->c:Lqf/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic Y0(Lqf/d0;)Lqf/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/f0;->Z0(Lqf/d0;)Lqf/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public Z0(Lqf/d0;)Lqf/f0;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/f0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/f0;->M0()Lqf/r0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, Lqf/f0;-><init>(Lqf/d0;Lqf/r0;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
