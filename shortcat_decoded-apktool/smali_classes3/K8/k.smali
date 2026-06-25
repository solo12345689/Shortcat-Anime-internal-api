.class final LK8/k;
.super LK8/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method constructor <init>(LP8/f;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 0

    .line 1
    iput-object p2, p0, LK8/k;->c:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p3, p0, LK8/k;->d:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LK8/p;-><init>(LP8/f;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)LP8/k;
    .locals 2

    .line 1
    new-instance v0, LJ8/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, LJ8/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method protected final bridge synthetic d(LP8/a$b;)V
    .locals 3

    .line 1
    check-cast p1, LK8/i;

    .line 2
    .line 3
    invoke-virtual {p1}, LR8/c;->C()Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LK8/w;

    .line 8
    .line 9
    iget-object v0, p0, LK8/k;->c:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v1, LK8/j;

    .line 12
    .line 13
    iget-object v2, p0, LK8/k;->d:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 14
    .line 15
    invoke-direct {v1, p0, v0, v2}, LK8/j;-><init>(LK8/k;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, LK8/w;->I3(LK8/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
