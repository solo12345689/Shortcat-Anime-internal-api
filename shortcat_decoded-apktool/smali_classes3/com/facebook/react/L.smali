.class public abstract Lcom/facebook/react/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;->a:Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/facebook/soloader/SoLoader;->l(Landroid/content/Context;Lcom/facebook/soloader/l;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;->load()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->setEdgeToEdgeFeatureFlagOn()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method
