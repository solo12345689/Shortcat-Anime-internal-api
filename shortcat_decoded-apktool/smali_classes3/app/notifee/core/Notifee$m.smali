.class public Lapp/notifee/core/Notifee$m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lapp/notifee/core/Notifee;->displayNotification(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
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
    iput-object p2, p0, Lapp/notifee/core/Notifee$m;->a:Lapp/notifee/core/interfaces/MethodCallResult;

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
    new-instance v0, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "API"

    .line 7
    .line 8
    const-string v1, "displayNotification"

    .line 9
    .line 10
    invoke-static {p1, v1, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lapp/notifee/core/Notifee$m;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v0, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object v0, p0, Lapp/notifee/core/Notifee$m;->a:Lapp/notifee/core/interfaces/MethodCallResult;

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
