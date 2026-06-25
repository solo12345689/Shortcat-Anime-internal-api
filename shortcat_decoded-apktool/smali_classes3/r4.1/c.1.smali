.class public final synthetic Lr4/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lapp/notifee/core/interfaces/MethodCallResult;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/c;->a:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/c;->a:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Void;

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Lapp/notifee/core/BlockStateBroadcastReceiver;->c(Landroidx/concurrent/futures/c$a;Ljava/lang/Exception;Ljava/lang/Void;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
