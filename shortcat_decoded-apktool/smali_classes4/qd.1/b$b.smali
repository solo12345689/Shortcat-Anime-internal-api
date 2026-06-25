.class public final Lqd/b$b;
.super LM3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/b;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lqd/b;


# direct methods
.method constructor <init>(LM3/q;Lqd/b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd/b$b;->d:Lqd/b;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LM3/i;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `updates_assets` (`update_id`,`asset_id`) VALUES (?,?)"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lrd/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lqd/b$b;->l(LS3/k;Lrd/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected l(LS3/k;Lrd/c;)V
    .locals 3

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "entity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b$b;->d:Lqd/b;

    .line 12
    .line 13
    invoke-static {v0}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lrd/c;->b()Ljava/util/UUID;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-interface {p1, v1, v0}, LS3/i;->p1(I[B)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-virtual {p2}, Lrd/c;->a()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-interface {p1, v0, v1, v2}, LS3/i;->m1(IJ)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
