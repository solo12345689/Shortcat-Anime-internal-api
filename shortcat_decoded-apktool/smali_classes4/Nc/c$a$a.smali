.class LNc/c$a$a;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNc/c$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LNc/c$a;


# direct methods
.method constructor <init>(LNc/c$a;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, LNc/c$a$a;->a:LNc/c$a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected onReceiveResult(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, LNc/c$a$a;->a:LNc/c$a;

    .line 7
    .line 8
    iget-object p1, p1, LNc/c$a;->b:LUb/u;

    .line 9
    .line 10
    invoke-interface {p1}, LUb/u;->b()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p1, "exception"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Exception;

    .line 21
    .line 22
    iget-object p2, p0, LNc/c$a$a;->a:LNc/c$a;

    .line 23
    .line 24
    iget-object p2, p2, LNc/c$a;->b:LUb/u;

    .line 25
    .line 26
    const-string v0, "ERR_NOTIFICATION_PRESENTATION_FAILED"

    .line 27
    .line 28
    const-string v1, "Notification presentation failed."

    .line 29
    .line 30
    invoke-interface {p2, v0, v1, p1}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
