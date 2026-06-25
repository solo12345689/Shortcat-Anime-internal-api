.class LBe/h$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/h;-><init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lqf/N0;ZILye/h0;Lye/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LXe/f;

.field final synthetic b:LBe/h;


# direct methods
.method constructor <init>(LBe/h;LXe/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBe/h$b;->b:LBe/h;

    .line 2
    .line 3
    iput-object p2, p0, LBe/h$b;->a:LXe/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lqf/d0;
    .locals 5

    .line 1
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LBe/h$b;->b:LBe/h;

    .line 8
    .line 9
    invoke-virtual {v1}, LBe/h;->l()Lqf/v0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    new-instance v3, Ljf/i;

    .line 16
    .line 17
    new-instance v4, LBe/h$b$a;

    .line 18
    .line 19
    invoke-direct {v4, p0}, LBe/h$b$a;-><init>(LBe/h$b;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljf/i;-><init>(Lie/a;)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v0, v1, v2, v4, v3}, Lqf/V;->m(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;)Lqf/d0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/h$b;->a()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
