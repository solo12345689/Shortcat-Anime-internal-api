.class public abstract Lh7/j;
.super Lh7/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh7/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lh7/j;->a:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public enableBridgelessArchitecture()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh7/j;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public enableFabricRenderer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh7/j;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public useNativeViewConfigsInBridgelessMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh7/j;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Lh7/e;->useNativeViewConfigsInBridgelessMode()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public useTurboModuleInterop()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh7/j;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Lh7/e;->useTurboModuleInterop()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public useTurboModules()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh7/j;->a:Z

    .line 2
    .line 3
    return v0
.end method
