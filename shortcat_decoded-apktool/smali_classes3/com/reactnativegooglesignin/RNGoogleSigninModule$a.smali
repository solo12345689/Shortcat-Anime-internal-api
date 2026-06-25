.class Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;
.super Landroid/os/AsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method

.method private a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->access$100(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-static {p1, p3}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v0, "Cannot attempt recovery auth because app is not in foreground. "

    .line 21
    .line 22
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance v1, Lcom/reactnativegooglesignin/b;

    .line 41
    .line 42
    invoke-direct {v1, p3}, Lcom/reactnativegooglesignin/b;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V

    .line 46
    .line 47
    .line 48
    check-cast p2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a()Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const p2, 0xd02e

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    instance-of v0, p2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const-string v0, "SHOULD_RECOVER"

    .line 8
    .line 9
    invoke-interface {p4, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p4, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    if-eqz p4, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 3

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "email"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->access$000(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v1, Landroid/accounts/Account;

    .line 18
    .line 19
    const-string v2, "com.google"

    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "scopes"

    .line 25
    .line 26
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->e(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1, v1, v0}, LG8/b;->b(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "accessToken"

    .line 39
    .line 40
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method protected varargs b([Lcom/facebook/react/bridge/WritableMap;)Ljava/lang/Void;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p1, v0

    .line 3
    .line 4
    iget-object v1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_0
    :try_start_0
    invoke-direct {p0, v1, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/WritableMap;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v0}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception v3

    .line 28
    array-length v4, p1

    .line 29
    const/4 v5, 0x2

    .line 30
    if-lt v4, v5, :cond_1

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object p1, p1, v4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p1, v2

    .line 37
    :goto_0
    invoke-direct {p0, v1, v3, v0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return-object v2
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->b([Lcom/facebook/react/bridge/WritableMap;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
