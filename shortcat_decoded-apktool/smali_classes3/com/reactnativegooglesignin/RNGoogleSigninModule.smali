.class public Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.super Lcom/reactnativegooglesignin/NativeGoogleSigninSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;,
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;,
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;
    }
.end annotation


# static fields
.field public static final PLAY_SERVICES_NOT_AVAILABLE:Ljava/lang/String; = "PLAY_SERVICES_NOT_AVAILABLE"

.field public static final RC_SIGN_IN:I = 0x2329

.field public static final REQUEST_CODE_ADD_SCOPES:I = 0xd02f

.field public static final REQUEST_CODE_RECOVER_AUTH:I = 0xd02e

.field private static final SHOULD_RECOVER:Ljava/lang/String; = "SHOULD_RECOVER"


# instance fields
.field private _apiClient:Lcom/google/android/gms/auth/api/signin/b;

.field private pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

.field private final signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/NativeGoogleSigninSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/reactnativegooglesignin/c;

    .line 5
    .line 6
    const-string v1, "RNGoogleSignin"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 12
    .line 13
    new-instance v0, Lcom/reactnativegooglesignin/c;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 19
    .line 20
    new-instance v0, Lcom/reactnativegooglesignin/c;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 26
    .line 27
    new-instance v0, Lcom/reactnativegooglesignin/c;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 33
    .line 34
    new-instance v0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p0, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/k;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static synthetic a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signIn$2(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic access$000(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic access$100(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Landroid/app/Activity;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic access$200(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signOut$3(Lcom/facebook/react/bridge/Promise;Ln9/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ln9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signInSilently$0(Ln9/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$revokeAccess$4(Lcom/facebook/react/bridge/Promise;Ln9/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signInSilently$1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic f(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

    .line 2
    .line 3
    return-void
.end method

.method private handleSignInTaskResult(Ln9/i;Lcom/reactnativegooglesignin/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln9/i;",
            "Lcom/reactnativegooglesignin/c;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, LP8/b;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ln9/i;->l(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "GoogleSignInAccount instance was null"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch LP8/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :goto_0
    invoke-virtual {p1}, LP8/b;->b()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "DEVELOPER_ERROR: Follow troubleshooting instructions at https://react-native-google-signin.github.io/docs/troubleshooting"

    .line 40
    .line 41
    invoke-virtual {p2, p1, v0}, Lcom/reactnativegooglesignin/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void
.end method

.method private handleSignOutOrRevokeAccessTask(Ln9/i;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln9/i;",
            "Lcom/facebook/react/bridge/Promise;",
            ")V"
        }
    .end annotation

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
    const/4 p1, 0x0

    .line 8
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->b(Ln9/i;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, LJ8/c;->a(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method static bridge synthetic i(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ln9/i;Lcom/reactnativegooglesignin/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Ln9/i;Lcom/reactnativegooglesignin/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic j(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rerunFailedAuthTokenTask()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$revokeAccess$4(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignOutOrRevokeAccessTask(Ln9/i;Lcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$signIn$2(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->y()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2329

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private synthetic lambda$signInSilently$0(Ln9/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Ln9/i;Lcom/reactnativegooglesignin/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$signInSilently$1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->B()Ln9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ln9/i;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Ln9/i;Lcom/reactnativegooglesignin/c;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v1, Lcom/reactnativegooglesignin/f;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/f;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private synthetic lambda$signOut$3(Lcom/facebook/react/bridge/Promise;Ln9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignOutOrRevokeAccessTask(Ln9/i;Lcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 1
    const-string v0, "NULL_PRESENTER"

    .line 2
    .line 3
    const-string v1, "Current activity is null. Cannot present sign-in UI."

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 1
    const-string v0, "RNGoogleSignin"

    .line 2
    .line 3
    const-string v1, "apiClient is null - call configure() first"

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private rerunFailedAuthTokenTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/reactnativegooglesignin/b;->a()Lcom/facebook/react/bridge/WritableMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [Lcom/facebook/react/bridge/WritableMap;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-object v0, v2, v3

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    aput-object v0, v2, v3

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 29
    .line 30
    const-string v1, "rerunFailedAuthTokenTask: recovery failed"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private startTokenRetrievalTaskWithRecovery(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "SHOULD_RECOVER"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    new-array v3, v3, [Lcom/facebook/react/bridge/WritableMap;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object p1, v3, v4

    .line 25
    .line 26
    aput-object v0, v3, v2

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public addScopes(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v2, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 28
    .line 29
    const-string v3, "addScopes"

    .line 30
    .line 31
    invoke-virtual {v2, p2, v3}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p2, "scopes"

    .line 35
    .line 36
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->a(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/google/android/gms/common/api/Scope;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const p2, 0xd02f

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p2, v1, p1}, Lcom/google/android/gms/auth/api/signin/a;->d(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public clearCachedAccessToken(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    const-string v1, "clearCachedAccessToken"

    .line 4
    .line 5
    invoke-virtual {v0, p2, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;

    .line 9
    .line 10
    invoke-direct {p2, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 11
    .line 12
    .line 13
    filled-new-array {p1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public configure(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 10
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "scopes"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    const-string v1, "webClientId"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v5, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v5, v3

    .line 34
    :goto_1
    const-string v1, "offlineAccess"

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    move v1, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v1, v6

    .line 53
    move v6, v4

    .line 54
    :goto_2
    const-string v2, "forceCodeForRefreshToken"

    .line 55
    .line 56
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_3

    .line 61
    .line 62
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    move v7, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v7, v4

    .line 71
    :goto_3
    const-string v1, "accountName"

    .line 72
    .line 73
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v8, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_4
    move-object v8, v3

    .line 86
    :goto_4
    const-string v1, "hostedDomain"

    .line 87
    .line 88
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    move-object v9, p1

    .line 99
    goto :goto_5

    .line 100
    :cond_5
    move-object v9, v3

    .line 101
    :goto_5
    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->a(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/google/android/gms/common/api/Scope;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static/range {v4 .. v9}, Lcom/reactnativegooglesignin/o;->c([Lcom/google/android/gms/common/api/Scope;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0, p1}, Lcom/google/android/gms/auth/api/signin/a;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/b;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 118
    .line 119
    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public getCurrentUser()Lcom/facebook/react/bridge/WritableMap;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public getTokenClearingPromiseWrapper()Lcom/reactnativegooglesignin/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTokens(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getTokens"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "getTokens requires a user to be signed in"

    .line 14
    .line 15
    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v2, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 20
    .line 21
    invoke-virtual {v2, p1, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->startTokenRetrievalTaskWithRecovery(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method protected getTypedExportedConstants()Ljava/util/Map;
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
    const/4 v1, 0x2

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "BUTTON_SIZE_ICON"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "BUTTON_SIZE_STANDARD"

    .line 22
    .line 23
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "BUTTON_SIZE_WIDE"

    .line 32
    .line 33
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x30d5

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "SIGN_IN_CANCELLED"

    .line 43
    .line 44
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "SIGN_IN_REQUIRED"

    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v1, "SCOPES_ALREADY_GRANTED"

    .line 58
    .line 59
    const-string v2, "NEVER_HAPPENS_ON_ANDROID"

    .line 60
    .line 61
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v1, "ONE_TAP_START_FAILED"

    .line 65
    .line 66
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const-string v1, "NO_SAVED_CREDENTIAL_FOUND"

    .line 70
    .line 71
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    const-string v1, "IN_PROGRESS"

    .line 75
    .line 76
    const-string v2, "ASYNC_OP_IN_PROGRESS"

    .line 77
    .line 78
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string v1, "PLAY_SERVICES_NOT_AVAILABLE"

    .line 82
    .line 83
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public hasPreviousSignIn()Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public playServicesAvailable(ZLcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "RNGoogleSignin"

    .line 8
    .line 9
    const-string v0, "could not determine playServicesAvailable, activity is null"

    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/a;->n()Lcom/google/android/gms/common/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/a;->g(Landroid/content/Context;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/a;->j(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/16 p1, 0x964

    .line 37
    .line 38
    invoke-virtual {v1, v0, v2, p1}, Lcom/google/android/gms/common/a;->k(Landroid/app/Activity;II)Landroid/app/Dialog;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 43
    .line 44
    .line 45
    :cond_1
    const-string p1, "PLAY_SERVICES_NOT_AVAILABLE"

    .line 46
    .line 47
    const-string v0, "Play services not available"

    .line 48
    .line 49
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public revokeAccess(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->z()Ln9/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/reactnativegooglesignin/i;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/reactnativegooglesignin/i;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public signIn(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 20
    .line 21
    const-string v1, "signIn"

    .line 22
    .line 23
    invoke-virtual {v0, p2, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lcom/reactnativegooglesignin/h;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1}, Lcom/reactnativegooglesignin/h;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public signInSilently(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 10
    .line 11
    const-string v1, "signInSilently"

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lcom/reactnativegooglesignin/j;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lcom/reactnativegooglesignin/j;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public signOut(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->A()Ln9/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/reactnativegooglesignin/g;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/reactnativegooglesignin/g;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 19
    .line 20
    .line 21
    return-void
.end method
