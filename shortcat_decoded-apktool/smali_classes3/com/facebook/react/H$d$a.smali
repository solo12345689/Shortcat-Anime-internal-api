.class Lcom/facebook/react/H$d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc7/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H$d;->onSetPausedInDebuggerMessage(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;

.field final synthetic b:Lcom/facebook/react/H$d;


# direct methods
.method constructor <init>(Lcom/facebook/react/H$d;Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/H$d$a;->b:Lcom/facebook/react/H$d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/H$d$a;->a:Lcom/facebook/react/H;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onResume()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/H$d$a;->a:Lcom/facebook/react/H;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/H;->k(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/H$d$a;->a:Lcom/facebook/react/H;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/H;->k(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->sendDebuggerResumeCommand()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
