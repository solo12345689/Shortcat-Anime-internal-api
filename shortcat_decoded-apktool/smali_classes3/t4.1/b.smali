.class public final synthetic Lt4/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

.field public final synthetic b:Lcom/google/common/util/concurrent/r;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;Lcom/google/common/util/concurrent/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt4/b;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    .line 5
    .line 6
    iput-object p2, p0, Lt4/b;->b:Lcom/google/common/util/concurrent/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/b;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    .line 2
    .line 3
    iget-object v1, p0, Lt4/b;->b:Lcom/google/common/util/concurrent/r;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->c(Lapp/notifee/core/model/NotificationAndroidStyleModel;Lcom/google/common/util/concurrent/r;)Landroidx/core/app/m$h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
