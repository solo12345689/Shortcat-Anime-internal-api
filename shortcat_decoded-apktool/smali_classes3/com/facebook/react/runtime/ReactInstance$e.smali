.class public final Lcom/facebook/react/runtime/ReactInstance$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/JSBundleLoaderDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactInstance;->y(Lcom/facebook/react/bridge/JSBundleLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/runtime/ReactInstance;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public loadScriptFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    const-string p3, "assetManager"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "assetURL"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/facebook/react/runtime/ReactInstance;->h(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/c;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/c;->d(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->k(Lcom/facebook/react/runtime/ReactInstance;Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public loadScriptFromFile(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    const-string p3, "fileName"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "sourceURL"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/facebook/react/runtime/ReactInstance;->h(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/c;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/c;->d(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->l(Lcom/facebook/react/runtime/ReactInstance;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public loadSplitBundleFromFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceURL"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {v0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->l(Lcom/facebook/react/runtime/ReactInstance;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setSourceURLs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "deviceURL"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "remoteURL"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactInstance$e;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p2}, Lcom/facebook/react/runtime/ReactInstance;->h(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/c;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2, p1}, Lcom/facebook/react/runtime/c;->d(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
