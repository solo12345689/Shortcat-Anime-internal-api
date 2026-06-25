.class public final Lcom/swmansion/rnscreens/gamma/stack/screen/c;
.super LWa/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWa/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/stack/screen/c$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/swmansion/rnscreens/gamma/stack/screen/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/gamma/stack/screen/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/stack/screen/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/gamma/stack/screen/c;->e:Lcom/swmansion/rnscreens/gamma/stack/screen/c$a;

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
.method public a()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LYa/f;

    .line 6
    .line 7
    invoke-virtual {p0}, LWa/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, LWa/a;->g()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v1, v2, v3}, LYa/f;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LYa/b;

    .line 6
    .line 7
    invoke-virtual {p0}, LWa/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, LWa/a;->g()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v1, v2, v3}, LYa/b;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LYa/a;

    .line 6
    .line 7
    invoke-virtual {p0}, LWa/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, LWa/a;->g()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v1, v2, v3}, LYa/a;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public d()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LYa/e;

    .line 6
    .line 7
    invoke-virtual {p0}, LWa/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, LWa/a;->g()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v1, v2, v3}, LYa/e;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final h(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LWa/a;->e()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LYa/c;

    .line 6
    .line 7
    invoke-virtual {p0}, LWa/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, LWa/a;->g()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v1, v2, v3, p1}, LYa/c;-><init>(IIZ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
