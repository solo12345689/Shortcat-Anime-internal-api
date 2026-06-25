.class public Lapp/notifee/core/Notifee$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lapp/notifee/core/Notifee;->cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lapp/notifee/core/interfaces/MethodCallResult;


# direct methods
.method public constructor <init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lapp/notifee/core/Notifee$g;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lapp/notifee/core/Notifee$g;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/Exception;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-interface {v0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object v0, p0, Lapp/notifee/core/Notifee$g;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
