.class public final Lqd/d$a;
.super LM3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/d;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lqd/d;


# direct methods
.method constructor <init>(LM3/q;Lqd/d;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd/d$a;->d:Lqd/d;

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
    const-string v0, "INSERT OR ABORT INTO `json_data` (`key`,`value`,`last_updated`,`scope_key`,`id`) VALUES (?,?,?,?,nullif(?, 0))"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lrd/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lqd/d$a;->l(LS3/k;Lrd/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected l(LS3/k;Lrd/b;)V
    .locals 4

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
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p2}, Lrd/b;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v0, v1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-virtual {p2}, Lrd/b;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p1, v0, v1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lqd/d$a;->d:Lqd/d;

    .line 28
    .line 29
    invoke-static {v0}, Lqd/d;->j(Lqd/d;)Lpd/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p2}, Lrd/b;->c()Ljava/util/Date;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x3

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 53
    .line 54
    .line 55
    :goto_0
    const/4 v0, 0x4

    .line 56
    invoke-virtual {p2}, Lrd/b;->d()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {p1, v0, v1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    invoke-virtual {p2}, Lrd/b;->a()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    invoke-interface {p1, v0, v1, v2}, LS3/i;->m1(IJ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
