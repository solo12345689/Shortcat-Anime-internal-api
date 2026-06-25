.class public final Lh7/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lh7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh7/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lh7/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh7/i;->a:Lh7/i;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Z
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/b;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled"

    .line 10
    .line 11
    invoke-static {v0, v1}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    invoke-static {}, Lh7/b;->i()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public static final b()Z
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/b;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled"

    .line 10
    .line 11
    invoke-static {v0, v1}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    invoke-static {}, Lh7/b;->m()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public static final c()Z
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/b;->K()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    const-string v1, "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled"

    .line 12
    .line 13
    invoke-static {v0, v1}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_0
    invoke-static {}, Lh7/b;->K()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public static final d()Z
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/b;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    const-string v1, "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled"

    .line 12
    .line 13
    invoke-static {v0, v1}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_0
    invoke-static {}, Lh7/b;->Q()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public static final e()Z
    .locals 2

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lh7/b;->R()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled"

    .line 10
    .line 11
    invoke-static {v0, v1}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    invoke-static {}, Lh7/b;->R()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method
