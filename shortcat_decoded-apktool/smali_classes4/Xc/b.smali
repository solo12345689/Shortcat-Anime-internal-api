.class public final synthetic LXc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Landroid/content/BroadcastReceiver$PendingResult;

.field public final synthetic c:Lexpo/modules/notifications/service/NotificationsService;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXc/b;->a:Landroid/content/Intent;

    .line 5
    .line 6
    iput-object p2, p0, LXc/b;->b:Landroid/content/BroadcastReceiver$PendingResult;

    .line 7
    .line 8
    iput-object p3, p0, LXc/b;->c:Lexpo/modules/notifications/service/NotificationsService;

    .line 9
    .line 10
    iput-object p4, p0, LXc/b;->d:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LXc/b;->a:Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v1, p0, LXc/b;->b:Landroid/content/BroadcastReceiver$PendingResult;

    .line 4
    .line 5
    iget-object v2, p0, LXc/b;->c:Lexpo/modules/notifications/service/NotificationsService;

    .line 6
    .line 7
    iget-object v3, p0, LXc/b;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lexpo/modules/notifications/service/NotificationsService;->a(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
