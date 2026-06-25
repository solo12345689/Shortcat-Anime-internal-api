.class LBe/h$a;
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
.field final synthetic a:Lpf/n;

.field final synthetic b:Lye/k0;

.field final synthetic c:LBe/h;


# direct methods
.method constructor <init>(LBe/h;Lpf/n;Lye/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBe/h$a;->c:LBe/h;

    .line 2
    .line 3
    iput-object p2, p0, LBe/h$a;->a:Lpf/n;

    .line 4
    .line 5
    iput-object p3, p0, LBe/h$a;->b:Lye/k0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lqf/v0;
    .locals 4

    .line 1
    new-instance v0, LBe/h$c;

    .line 2
    .line 3
    iget-object v1, p0, LBe/h$a;->c:LBe/h;

    .line 4
    .line 5
    iget-object v2, p0, LBe/h$a;->a:Lpf/n;

    .line 6
    .line 7
    iget-object v3, p0, LBe/h$a;->b:Lye/k0;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LBe/h$c;-><init>(LBe/h;Lpf/n;Lye/k0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/h$a;->a()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
