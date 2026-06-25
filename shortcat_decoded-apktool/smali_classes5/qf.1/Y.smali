.class public final Lqf/Y;
.super Lqf/O0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Lpf/n;

.field private final c:Lie/a;

.field private final d:Lpf/i;


# direct methods
.method public constructor <init>(Lpf/n;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "computation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lqf/O0;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lqf/Y;->b:Lpf/n;

    .line 15
    .line 16
    iput-object p2, p0, Lqf/Y;->c:Lie/a;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lqf/Y;->d:Lpf/i;

    .line 23
    .line 24
    return-void
.end method

.method static synthetic T0(Lrf/g;Lqf/Y;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/Y;->V0(Lrf/g;Lqf/Y;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final V0(Lrf/g;Lqf/Y;)Lqf/S;
    .locals 0

    .line 1
    iget-object p1, p1, Lqf/Y;->c:Lie/a;

    .line 2
    .line 3
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Luf/i;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lrf/g;->h(Luf/i;)Lqf/S;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public bridge synthetic P0(Lrf/g;)Lqf/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/Y;->U0(Lrf/g;)Lqf/Y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected R0()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/Y;->d:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqf/S;

    .line 8
    .line 9
    return-object v0
.end method

.method public S0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/Y;->d:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lpf/i;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public U0(Lrf/g;)Lqf/Y;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/Y;

    .line 7
    .line 8
    iget-object v1, p0, Lqf/Y;->b:Lpf/n;

    .line 9
    .line 10
    new-instance v2, Lqf/X;

    .line 11
    .line 12
    invoke-direct {v2, p1, p0}, Lqf/X;-><init>(Lrf/g;Lqf/Y;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lqf/Y;-><init>(Lpf/n;Lie/a;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
