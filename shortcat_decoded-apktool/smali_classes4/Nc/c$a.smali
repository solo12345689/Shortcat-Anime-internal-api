.class LNc/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNc/c;->i(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LUb/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

.field final synthetic b:LUb/u;

.field final synthetic c:LNc/c;


# direct methods
.method constructor <init>(LNc/c;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LUb/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LNc/c$a;->c:LNc/c;

    .line 2
    .line 3
    iput-object p2, p0, LNc/c$a;->a:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 4
    .line 5
    iput-object p3, p0, LNc/c$a;->b:LUb/u;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 2
    .line 3
    iget-object v1, p0, LNc/c$a;->c:LNc/c;

    .line 4
    .line 5
    invoke-static {v1}, LNc/c;->b(LNc/c;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LNc/c$a;->c:LNc/c;

    .line 10
    .line 11
    invoke-static {v2}, LNc/c;->d(LNc/c;)LPc/a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, LNc/c$a;->a:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 16
    .line 17
    new-instance v4, LNc/c$a$a;

    .line 18
    .line 19
    iget-object v5, p0, LNc/c$a;->c:LNc/c;

    .line 20
    .line 21
    invoke-static {v5}, LNc/c;->c(LNc/c;)Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct {v4, p0, v5}, LNc/c$a$a;-><init>(LNc/c$a;Landroid/os/Handler;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2, v3, v4}, Lexpo/modules/notifications/service/NotificationsService$a;->q(Landroid/content/Context;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Landroid/os/ResultReceiver;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LNc/c$a;->c:LNc/c;

    .line 32
    .line 33
    invoke-static {v0}, LNc/c;->e(LNc/c;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
