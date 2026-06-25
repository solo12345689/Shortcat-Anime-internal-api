.class public final Lqf/i0;
.super Lqf/C0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lqf/S;


# direct methods
.method public constructor <init>(Lve/i;)V
    .locals 1

    .line 1
    const-string v0, "kotlinBuiltIns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/C0;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lve/i;->J()Lqf/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "getNullableAnyType(...)"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lqf/i0;->a:Lqf/S;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public b()Lqf/N0;
    .locals 1

    .line 1
    sget-object v0, Lqf/N0;->g:Lqf/N0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/i0;->a:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(Lrf/g;)Lqf/B0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
