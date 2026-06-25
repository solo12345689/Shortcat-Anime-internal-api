.class public final synthetic LPd/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/RejectedExecutionHandler;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/common/a;


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/common/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LPd/n;->a:Lio/invertase/firebase/common/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPd/n;->a:Lio/invertase/firebase/common/a;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lio/invertase/firebase/common/a;->a(Lio/invertase/firebase/common/a;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
