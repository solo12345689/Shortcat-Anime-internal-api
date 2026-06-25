.class public final synthetic Lcom/facebook/react/modules/dialog/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/modules/dialog/DialogModule$c;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lcom/facebook/react/bridge/Callback;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/dialog/DialogModule$c;Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/dialog/b;->a:Lcom/facebook/react/modules/dialog/DialogModule$c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/dialog/b;->b:Landroid/os/Bundle;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/modules/dialog/b;->c:Lcom/facebook/react/bridge/Callback;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/b;->a:Lcom/facebook/react/modules/dialog/DialogModule$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/modules/dialog/b;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/modules/dialog/b;->c:Lcom/facebook/react/bridge/Callback;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/react/modules/dialog/DialogModule;->a(Lcom/facebook/react/modules/dialog/DialogModule$c;Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
