.class LBe/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/a;-><init>(Lpf/n;LXe/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LBe/a;


# direct methods
.method constructor <init>(LBe/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBe/a$a;->a:LBe/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lqf/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LBe/a$a;->a:LBe/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/a;->X()Ljf/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, LBe/a$a$a;

    .line 8
    .line 9
    invoke-direct {v2, p0}, LBe/a$a$a;-><init>(LBe/a$a;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lqf/J0;->v(Lye/h;Ljf/k;Lkotlin/jvm/functions/Function1;)Lqf/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/a$a;->a()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
