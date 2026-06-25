.class public final synthetic Lcom/facebook/react/views/modal/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field public final synthetic b:Lcom/facebook/react/uimanager/b0;

.field public final synthetic c:Lcom/facebook/react/views/modal/d;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/modal/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/modal/b;->a:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/modal/b;->b:Lcom/facebook/react/uimanager/b0;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/views/modal/b;->c:Lcom/facebook/react/views/modal/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/b;->a:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/modal/b;->b:Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/views/modal/b;->c:Lcom/facebook/react/views/modal/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/views/modal/ReactModalHostManager;->a(Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/modal/d;Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
