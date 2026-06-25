.class public Lexpo/modules/adapters/react/ModuleRegistryReadyNotifier;
.super Lcom/facebook/react/bridge/BaseJavaModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private mModuleRegistry:Lpb/b;


# direct methods
.method public constructor <init>(Lpb/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseJavaModule;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/adapters/react/ModuleRegistryReadyNotifier;->mModuleRegistry:Lpb/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ModuleRegistryReadyNotifier"

    .line 2
    .line 3
    return-object v0
.end method

.method public initialize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/ModuleRegistryReadyNotifier;->mModuleRegistry:Lpb/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpb/b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
