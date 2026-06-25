.class public final synthetic Lr4/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lapp/notifee/core/interfaces/MethodCallResult;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;

.field public final synthetic b:Lcg/q$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;Lcg/q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/b;->a:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    iput-object p2, p0, Lr4/b;->b:Lcg/q$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/b;->a:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/b;->b:Lcg/q$a;

    .line 4
    .line 5
    check-cast p2, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Lapp/notifee/core/BlockStateBroadcastReceiver;->b(Landroidx/concurrent/futures/c$a;Lcg/q$a;Ljava/lang/Exception;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
