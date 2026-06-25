.class Lio/invertase/notifee/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/invertase/notifee/b;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;

.field final synthetic b:Lio/invertase/notifee/b;


# direct methods
.method constructor <init>(Lio/invertase/notifee/b;Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/invertase/notifee/b$c;->b:Lio/invertase/notifee/b;

    .line 2
    .line 3
    iput-object p2, p0, Lio/invertase/notifee/b$c;->a:Lcom/facebook/react/H;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/b$c;->b:Lio/invertase/notifee/b;

    .line 2
    .line 3
    invoke-static {v0}, Lio/invertase/notifee/b;->b(Lio/invertase/notifee/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/invertase/notifee/b$c;->b:Lio/invertase/notifee/b;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lio/invertase/notifee/b;->d(Lio/invertase/notifee/b;Lcom/facebook/react/bridge/ReactContext;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/invertase/notifee/b$c;->a:Lcom/facebook/react/H;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lcom/facebook/react/H;->l0(Lcom/facebook/react/z;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
