.class public Lcg/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/i;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lapp/notifee/core/interfaces/MethodCallResult;


# direct methods
.method public constructor <init>(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcg/m;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcg/m;->b:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcg/m;->b:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/Exception;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcg/m;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcg/v;

    .line 18
    .line 19
    new-instance v1, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Lcg/v;->b:[B

    .line 25
    .line 26
    invoke-static {v2}, Lcg/q;->b([B)Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "notification"

    .line 31
    .line 32
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lcg/v;->c:[B

    .line 36
    .line 37
    invoke-static {v0}, Lcg/q;->b([B)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "trigger"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcg/m;->a:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p1, p0, Lcg/m;->b:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 53
    .line 54
    iget-object v0, p0, Lcg/m;->a:Ljava/util/List;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-interface {p1, v1, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
