.class final Lrf/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lqf/S;

.field private final b:Lrf/u;


# direct methods
.method public constructor <init>(Lqf/S;Lrf/u;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lrf/u;->a:Lqf/S;

    .line 10
    .line 11
    iput-object p2, p0, Lrf/u;->b:Lrf/u;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lrf/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lrf/u;->b:Lrf/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lrf/u;->a:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method
