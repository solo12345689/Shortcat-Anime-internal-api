.class public Lapp/notifee/core/event/BlockStateEvent;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final TYPE_APP_BLOCKED:I = 0x4

.field public static final TYPE_CHANNEL_BLOCKED:I = 0x5

.field public static final TYPE_CHANNEL_GROUP_BLOCKED:I = 0x6


# instance fields
.field public a:I

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public d:Lapp/notifee/core/interfaces/MethodCallResult;

.field public e:Z


# direct methods
.method public constructor <init>(ILandroid/os/Bundle;ZLapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lapp/notifee/core/event/BlockStateEvent;->e:Z

    .line 6
    .line 7
    iput p1, p0, Lapp/notifee/core/event/BlockStateEvent;->a:I

    .line 8
    .line 9
    iput-object p4, p0, Lapp/notifee/core/event/BlockStateEvent;->d:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 10
    .line 11
    iput-boolean p3, p0, Lapp/notifee/core/event/BlockStateEvent;->b:Z

    .line 12
    .line 13
    iput-object p2, p0, Lapp/notifee/core/event/BlockStateEvent;->c:Landroid/os/Bundle;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getChannelOrGroupBundle()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/event/BlockStateEvent;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lapp/notifee/core/event/BlockStateEvent;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public isBlocked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lapp/notifee/core/event/BlockStateEvent;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public setCompletionResult()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lapp/notifee/core/event/BlockStateEvent;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lapp/notifee/core/event/BlockStateEvent;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, Lapp/notifee/core/event/BlockStateEvent;->d:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
