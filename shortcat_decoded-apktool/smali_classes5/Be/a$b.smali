.class LBe/a$b;
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
    iput-object p1, p0, LBe/a$b;->a:LBe/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljf/k;
    .locals 2

    .line 1
    new-instance v0, Ljf/g;

    .line 2
    .line 3
    iget-object v1, p0, LBe/a$b;->a:LBe/a;

    .line 4
    .line 5
    invoke-virtual {v1}, LBe/a;->X()Ljf/k;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljf/g;-><init>(Ljf/k;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/a$b;->a()Ljf/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
