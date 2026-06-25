.class public final Lqd/f$b;
.super LM3/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/f;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lqd/f;


# direct methods
.method constructor <init>(LM3/q;Lqd/f;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd/f$b;->d:Lqd/f;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LM3/h;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "DELETE FROM `updates` WHERE `id` = ?"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lrd/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lqd/f$b;->l(LS3/k;Lrd/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected l(LS3/k;Lrd/d;)V
    .locals 1

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
    iget-object v0, p0, Lqd/f$b;->d:Lqd/f;

    .line 12
    .line 13
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lrd/d;->d()Ljava/util/UUID;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {v0, p2}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-interface {p1, v0, p2}, LS3/i;->p1(I[B)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
