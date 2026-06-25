.class final Lwf/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lye/m0;

.field private final b:Lqf/S;

.field private final c:Lqf/S;


# direct methods
.method public constructor <init>(Lye/m0;Lqf/S;Lqf/S;)V
    .locals 1

    .line 1
    const-string v0, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "inProjection"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "outProjection"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lwf/d;->a:Lye/m0;

    .line 20
    .line 21
    iput-object p2, p0, Lwf/d;->b:Lqf/S;

    .line 22
    .line 23
    iput-object p3, p0, Lwf/d;->c:Lqf/S;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lwf/d;->b:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lwf/d;->c:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lye/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Lwf/d;->a:Lye/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 3

    .line 1
    sget-object v0, Lrf/e;->a:Lrf/e;

    .line 2
    .line 3
    iget-object v1, p0, Lwf/d;->b:Lqf/S;

    .line 4
    .line 5
    iget-object v2, p0, Lwf/d;->c:Lqf/S;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Lrf/e;->a(Lqf/S;Lqf/S;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
