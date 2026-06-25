.class public Ltg/s;
.super Ltg/a0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private f:Ltg/a0;


# direct methods
.method public constructor <init>(Ltg/a0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ltg/a0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ltg/s;->f:Ltg/a0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Ltg/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->a()Ltg/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Ltg/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->b()Ltg/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d(J)Ltg/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ltg/a0;->d(J)Ltg/a0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Ltg/a0;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Ltg/a0;->g(JLjava/util/concurrent/TimeUnit;)Ltg/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/a0;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final i()Ltg/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/s;->f:Ltg/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Ltg/a0;)Ltg/s;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ltg/s;->f:Ltg/a0;

    .line 7
    .line 8
    return-object p0
.end method
