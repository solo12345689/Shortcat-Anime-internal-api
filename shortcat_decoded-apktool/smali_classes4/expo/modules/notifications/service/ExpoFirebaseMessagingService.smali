.class public Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "<init>",
        "()V",
        "Lcom/google/firebase/messaging/W;",
        "remoteMessage",
        "LTd/L;",
        "p",
        "(Lcom/google/firebase/messaging/W;)V",
        "",
        "token",
        "r",
        "(Ljava/lang/String;)V",
        "o",
        "LZc/b;",
        "h",
        "Lkotlin/Lazy;",
        "w",
        "()LZc/b;",
        "firebaseMessagingDelegate",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final h:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LXc/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LXc/a;-><init>(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->h:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic u(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)LYc/g;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->v(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)LYc/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final v(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)LYc/g;
    .locals 1

    .line 1
    new-instance v0, LYc/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LYc/g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public o()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->w()LZc/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LZc/b;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(Lcom/google/firebase/messaging/W;)V
    .locals 1

    .line 1
    const-string v0, "remoteMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->w()LZc/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, LZc/b;->c(Lcom/google/firebase/messaging/W;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->w()LZc/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, LZc/b;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected w()LZc/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->h:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZc/b;

    .line 8
    .line 9
    return-object v0
.end method
