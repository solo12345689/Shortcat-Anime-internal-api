.class public final LK0/K;
.super LK0/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LK0/a;-><init>(LK0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method protected d(LK0/e0;J)J
    .locals 6

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p1

    .line 5
    move-wide v1, p2

    .line 6
    invoke-static/range {v0 .. v5}, LK0/e0;->B3(LK0/e0;JZILjava/lang/Object;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
.end method

.method protected e(LK0/e0;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-virtual {p1}, LK0/e0;->M1()LI0/C;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LI0/C;->z()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method protected i(LK0/e0;LI0/a;)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, LK0/T;->N(LI0/a;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
