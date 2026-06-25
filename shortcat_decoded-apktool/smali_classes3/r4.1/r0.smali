.class public final synthetic Lr4/r0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidModel;

.field public final synthetic b:Landroidx/core/app/m$e;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidModel;Landroidx/core/app/m$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/r0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    .line 5
    .line 6
    iput-object p2, p0, Lr4/r0;->b:Landroidx/core/app/m$e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/r0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/r0;->b:Landroidx/core/app/m$e;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr4/E0;->w(Lapp/notifee/core/model/NotificationAndroidModel;Landroidx/core/app/m$e;)Landroidx/core/app/m$e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
