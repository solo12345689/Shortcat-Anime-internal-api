.class public final LQa/u$a;
.super LQa/d$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQa/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LQa/d$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, LQa/u;

    .line 5
    .line 6
    iput-object v0, p0, LQa/u$a;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "PinchGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, LQa/u$a;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)LQa/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQa/u$a;->g(Landroid/content/Context;)LQa/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(LQa/d;)LRa/b;
    .locals 0

    .line 1
    check-cast p1, LQa/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQa/u$a;->h(LQa/u;)LRa/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/u$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/u$a;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method protected g(Landroid/content/Context;)LQa/u;
    .locals 0

    .line 1
    new-instance p1, LQa/u;

    .line 2
    .line 3
    invoke-direct {p1}, LQa/u;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public h(LQa/u;)LRa/h;
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LRa/h;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LRa/h;-><init>(LQa/u;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
