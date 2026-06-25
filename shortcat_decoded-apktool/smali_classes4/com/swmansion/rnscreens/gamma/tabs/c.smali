.class public final Lcom/swmansion/rnscreens/gamma/tabs/c;
.super LWa/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/c$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/swmansion/rnscreens/gamma/tabs/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/c;->e:Lcom/swmansion/rnscreens/gamma/tabs/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;I)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LWa/a;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "onWillDisappear"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/d;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LZa/d;

    .line 15
    .line 16
    invoke-virtual {p0}, LWa/a;->f()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, LWa/a;->g()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v2, v3}, LZa/d;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "onDidDisappear"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/d;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LZa/b;

    .line 15
    .line 16
    invoke-virtual {p0}, LWa/a;->f()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, LWa/a;->g()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v2, v3}, LZa/b;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "onDidAppear"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/d;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LZa/a;

    .line 15
    .line 16
    invoke-virtual {p0}, LWa/a;->f()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, LWa/a;->g()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v2, v3}, LZa/a;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "onWillAppear"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/d;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LZa/c;

    .line 15
    .line 16
    invoke-virtual {p0}, LWa/a;->f()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, LWa/a;->g()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v2, v3}, LZa/c;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
