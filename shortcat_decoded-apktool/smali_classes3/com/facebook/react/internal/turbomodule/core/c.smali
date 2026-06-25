.class public final synthetic Lcom/facebook/react/internal/turbomodule/core/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;


# instance fields
.field public final synthetic a:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/internal/turbomodule/core/c;->a:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/c;->a:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->b(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
