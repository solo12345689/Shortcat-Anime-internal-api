.class public LYc/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYc/g$a;
    }
.end annotation


# static fields
.field public static final b:LYc/g$a;

.field private static c:Ljava/lang/String;

.field private static final d:Ljava/util/HashSet;

.field private static e:Ljava/util/Set;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LYc/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LYc/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LYc/g;->b:LYc/g$a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LYc/g;->d:Ljava/util/HashSet;

    .line 15
    .line 16
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, LYc/g;->e:Ljava/util/Set;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LYc/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic d()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, LYc/g;->e:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LYc/g;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f()Ljava/util/HashSet;
    .locals 1

    .line 1
    sget-object v0, LYc/g;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LYc/g;->d:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "iterator(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "next(...)"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Lbd/a;

    .line 33
    .line 34
    invoke-interface {v1, p1}, Lbd/a;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sput-object p1, LYc/g;->c:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 2
    .line 3
    iget-object v1, p0, LYc/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/service/NotificationsService$a;->o(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Lcom/google/firebase/messaging/W;)V
    .locals 8

    .line 1
    const-string v0, "remoteMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LKc/a;->a:LKc/a;

    .line 7
    .line 8
    const-string v1, "FirebaseMessagingDelegate.onMessageReceived: message"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, LKc/a;->c(Ljava/lang/String;Lcom/google/firebase/messaging/W;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, LYc/g;->g(Lcom/google/firebase/messaging/W;)LPc/a;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v1, "FirebaseMessagingDelegate.onMessageReceived: notification"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v4}, LKc/a;->b(Ljava/lang/String;LPc/a;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 23
    .line 24
    iget-object v3, p0, LYc/g;->a:Landroid/content/Context;

    .line 25
    .line 26
    const/4 v6, 0x4

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Lexpo/modules/notifications/service/NotificationsService$a;->t(Lexpo/modules/notifications/service/NotificationsService$a;Landroid/content/Context;LPc/a;Landroid/os/ResultReceiver;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, LYc/g;->b:LYc/g$a;

    .line 33
    .line 34
    iget-object v1, p0, LYc/g;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "getApplicationContext(...)"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, LDc/d;->b(Lcom/google/firebase/messaging/W;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v2, "toBundle(...)"

    .line 50
    .line 51
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, p1}, LYc/g$a;->g(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method protected final g(Lcom/google/firebase/messaging/W;)LPc/a;
    .locals 5

    .line 1
    const-string v0, "remoteMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LYc/g;->i(Lcom/google/firebase/messaging/W;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LPc/i;

    .line 11
    .line 12
    invoke-direct {v1, p1}, LPc/i;-><init>(Lcom/google/firebase/messaging/W;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, LQc/a;

    .line 16
    .line 17
    invoke-direct {v2, p1}, LQc/a;-><init>(Lcom/google/firebase/messaging/W;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, v2}, LYc/g;->h(Ljava/lang/String;LOc/a;LQc/a;)LPc/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, LPc/a;

    .line 25
    .line 26
    new-instance v2, Ljava/util/Date;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->x()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, LPc/a;-><init>(LPc/g;Ljava/util/Date;)V

    .line 36
    .line 37
    .line 38
    return-object v1
.end method

.method protected h(Ljava/lang/String;LOc/a;LQc/a;)LPc/g;
    .locals 1

    .line 1
    const-string v0, "identifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notificationTrigger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LPc/g;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2, p3}, LPc/g;-><init>(Ljava/lang/String;LOc/a;LOc/d;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method protected final i(Lcom/google/firebase/messaging/W;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "remoteMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->d()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "tag"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->f()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "toString(...)"

    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p1

    .line 40
    :cond_1
    return-object v0
.end method
