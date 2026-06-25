.class final LK8/j;
.super LK8/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

.field final synthetic c:LK8/k;


# direct methods
.method constructor <init>(LK8/k;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 0

    .line 1
    iput-object p2, p0, LK8/j;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p3, p0, LK8/j;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, LK8/j;->c:LK8/k;

    .line 9
    .line 10
    invoke-direct {p0}, LK8/e;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final h0(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LK8/j;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LK8/j;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 6
    .line 7
    invoke-static {v0}, LK8/r;->a(Landroid/content/Context;)LK8/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, v1, p1}, LK8/r;->c(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LK8/j;->c:LK8/k;

    .line 15
    .line 16
    new-instance v1, LJ8/b;

    .line 17
    .line 18
    invoke-direct {v1, p1, p2}, LJ8/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(LP8/k;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
