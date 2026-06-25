.class Lcom/adjust/nativemodule/Adjust$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/adjust/sdk/AdjustLinkResolution$AdjustLinkResolutionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adjust/nativemodule/Adjust;->resolveLinkWithUrl(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/bridge/Callback;

.field final synthetic b:Lcom/adjust/nativemodule/Adjust;


# direct methods
.method constructor <init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/adjust/nativemodule/Adjust$f;->b:Lcom/adjust/nativemodule/Adjust;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/adjust/nativemodule/Adjust$f;->a:Lcom/facebook/react/bridge/Callback;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public resolvedLinkCallback(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/adjust/nativemodule/Adjust$f;->a:Lcom/facebook/react/bridge/Callback;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iget-object v0, p0, Lcom/adjust/nativemodule/Adjust$f;->a:Lcom/facebook/react/bridge/Callback;

    .line 14
    .line 15
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
