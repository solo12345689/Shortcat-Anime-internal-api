.class public final synthetic Lr4/j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/d;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidModel;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/j0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/j0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    .line 2
    .line 3
    check-cast p1, Landroidx/core/app/m$e;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lr4/E0;->j(Lapp/notifee/core/model/NotificationAndroidModel;Landroidx/core/app/m$e;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
