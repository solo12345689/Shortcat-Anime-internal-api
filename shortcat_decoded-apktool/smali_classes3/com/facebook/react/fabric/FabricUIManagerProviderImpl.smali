.class public final Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerProvider;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;",
        "Lcom/facebook/react/bridge/UIManagerProvider;",
        "Lcom/facebook/react/fabric/ComponentFactory;",
        "componentFactory",
        "Lcom/facebook/react/uimanager/y0;",
        "viewManagerRegistry",
        "<init>",
        "(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/uimanager/y0;)V",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "context",
        "Lcom/facebook/react/bridge/UIManager;",
        "createUIManager",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;",
        "Lcom/facebook/react/fabric/ComponentFactory;",
        "Lcom/facebook/react/uimanager/y0;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final componentFactory:Lcom/facebook/react/fabric/ComponentFactory;

.field private final viewManagerRegistry:Lcom/facebook/react/uimanager/y0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/uimanager/y0;)V
    .locals 1

    .line 1
    const-string v0, "componentFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewManagerRegistry"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->componentFactory:Lcom/facebook/react/fabric/ComponentFactory;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->viewManagerRegistry:Lcom/facebook/react/uimanager/y0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 9

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "FabricUIManagerProviderImpl.create"

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v7, Lcom/facebook/react/fabric/events/EventBeatManager;

    .line 14
    .line 15
    invoke-direct {v7}, Lcom/facebook/react/fabric/events/EventBeatManager;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v0, "FabricUIManagerProviderImpl.createUIManager"

    .line 19
    .line 20
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v6, Lcom/facebook/react/fabric/FabricUIManager;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->viewManagerRegistry:Lcom/facebook/react/uimanager/y0;

    .line 26
    .line 27
    invoke-direct {v6, p1, v0, v7}, Lcom/facebook/react/fabric/FabricUIManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/y0;Lcom/facebook/react/uimanager/events/a;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 31
    .line 32
    .line 33
    const-string v0, "FabricUIManagerProviderImpl.registerBinding"

    .line 34
    .line 35
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lcom/facebook/react/fabric/FabricUIManagerBinding;

    .line 39
    .line 40
    invoke-direct {v3}, Lcom/facebook/react/fabric/FabricUIManagerBinding;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v0, 0x0

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v4, v0

    .line 56
    :goto_0
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_1
    move-object v5, v0

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget-object v8, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->componentFactory:Lcom/facebook/react/fabric/ComponentFactory;

    .line 68
    .line 69
    invoke-virtual/range {v3 .. v8}, Lcom/facebook/react/fabric/FabricUIManagerBinding;->register(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 76
    .line 77
    .line 78
    return-object v6

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method
