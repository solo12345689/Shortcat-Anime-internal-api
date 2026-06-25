.class public Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;
.super Lio/invertase/firebase/common/ReactNativeFirebaseModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/ActivityEventListener;


# static fields
.field private static final TAG:Ljava/lang/String; = "Messaging"


# instance fields
.field initialNotification:Lcom/facebook/react/bridge/ReadableMap;

.field private initialNotificationMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "Messaging"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotification:Lcom/facebook/react/bridge/ReadableMap;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotificationMap:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->E()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->q()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic e(Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->lambda$hasPermission$10()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic g(Lcom/google/firebase/messaging/FirebaseMessaging;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->p()Ln9/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ln9/l;->a(Ln9/i;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public static synthetic h(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic i(Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->G(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static synthetic j(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic k(Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->H(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static synthetic l(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private synthetic lambda$hasPermission$10()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/core/app/q;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static synthetic m(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lio/invertase/firebase/messaging/u;->e(Lcom/facebook/react/bridge/ReadableMap;)Lcom/google/firebase/messaging/W;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->F(Lcom/google/firebase/messaging/W;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static synthetic n(Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->I(Z)Ln9/i;

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static synthetic o(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ln9/i;->k()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic p()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->E()Z

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method private popRemoteMessageMapFromMessagingStore(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 1
    invoke-static {}, Lio/invertase/firebase/messaging/w;->a()Lio/invertase/firebase/messaging/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/invertase/firebase/messaging/w;->b()Lio/invertase/firebase/messaging/v;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lio/invertase/firebase/messaging/v;->b(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, p1}, Lio/invertase/firebase/messaging/v;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public static synthetic q(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->C()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Ln9/i;->j()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithExceptionMap(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic r(Lcom/google/firebase/messaging/FirebaseMessaging;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->w()Ln9/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ln9/l;->a(Ln9/i;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public deleteToken(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, LX9/e;->o(Ljava/lang/String;)LX9/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class p2, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LX9/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lio/invertase/firebase/messaging/g;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lio/invertase/firebase/messaging/g;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v0}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Lio/invertase/firebase/messaging/h;

    .line 27
    .line 28
    invoke-direct {p2, p3}, Lio/invertase/firebase/messaging/h;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public getConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->C()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "isAutoInitEnabled"

    .line 19
    .line 20
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->q()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "isDeliveryMetricsExportToBigQueryEnabled"

    .line 36
    .line 37
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->E()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "isNotificationDelegationEnabled"

    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public getInitialNotification(Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotification:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotification:Lcom/facebook/react/bridge/ReadableMap;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "google.message_id"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v2, "message_id"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_1
    if-eqz v2, :cond_4

    .line 53
    .line 54
    iget-object v0, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotificationMap:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    sget-object v0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/google/firebase/messaging/W;

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    invoke-direct {p0, v2}, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->popRemoteMessageMapFromMessagingStore(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-static {v0}, Lio/invertase/firebase/messaging/u;->i(Lcom/google/firebase/messaging/W;)Lcom/facebook/react/bridge/WritableMap;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_0
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotificationMap:Ljava/util/HashMap;

    .line 87
    .line 88
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    const-string v0, "Messaging"

    .line 95
    .line 96
    const-string v2, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle."

    .line 97
    .line 98
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public getToken(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, LX9/e;->o(Ljava/lang/String;)LX9/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class p2, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LX9/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lio/invertase/firebase/messaging/n;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lio/invertase/firebase/messaging/n;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v0}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Lio/invertase/firebase/messaging/o;

    .line 27
    .line 28
    invoke-direct {p2, p3}, Lio/invertase/firebase/messaging/o;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public hasPermission(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/l;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lio/invertase/firebase/messaging/l;-><init>(Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lio/invertase/firebase/messaging/m;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/m;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public isNotificationDelegationEnabled(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/b;

    .line 6
    .line 7
    invoke-direct {v1}, Lio/invertase/firebase/messaging/b;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lio/invertase/firebase/messaging/k;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/k;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "google.message_id"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "message_id"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object p1, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/google/firebase/messaging/W;

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    invoke-direct {p0, v0}, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->popRemoteMessageMapFromMessagingStore(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {p1}, Lio/invertase/firebase/messaging/u;->i(Lcom/google/firebase/messaging/W;)Lcom/facebook/react/bridge/WritableMap;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 55
    .line 56
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->merge(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->initialNotification:Lcom/facebook/react/bridge/ReadableMap;

    .line 63
    .line 64
    sget-object v1, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-static {}, LPd/g;->i()LPd/g;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {p1, v1}, Lio/invertase/firebase/messaging/u;->f(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Boolean;)LPd/b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0, p1}, LPd/g;->o(LQd/a;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void
.end method

.method public sendMessage(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/p;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/p;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lio/invertase/firebase/messaging/q;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/q;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setAutoInitEnabled(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/i;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/i;-><init>(Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lio/invertase/firebase/messaging/j;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/j;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setDeliveryMetricsExportToBigQuery(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/s;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/s;-><init>(Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lio/invertase/firebase/messaging/c;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/c;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setNotificationDelegationEnabled(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/invertase/firebase/messaging/d;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lio/invertase/firebase/messaging/d;-><init>(Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ln9/l;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ln9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lio/invertase/firebase/messaging/e;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/e;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public subscribeToTopic(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->N(Ljava/lang/String;)Ln9/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lio/invertase/firebase/messaging/f;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/f;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public unsubscribeFromTopic(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->Q(Ljava/lang/String;)Ln9/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lio/invertase/firebase/messaging/r;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lio/invertase/firebase/messaging/r;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 15
    .line 16
    .line 17
    return-void
.end method
