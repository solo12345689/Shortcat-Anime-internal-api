.class Lcom/adjust/nativemodule/Adjust$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/adjust/sdk/OnAdidReadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adjust/nativemodule/Adjust;->getAdidWithTimeout(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
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
    iput-object p1, p0, Lcom/adjust/nativemodule/Adjust$k;->b:Lcom/adjust/nativemodule/Adjust;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/adjust/nativemodule/Adjust$k;->a:Lcom/facebook/react/bridge/Callback;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAdidRead(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/adjust/nativemodule/Adjust$k;->a:Lcom/facebook/react/bridge/Callback;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
