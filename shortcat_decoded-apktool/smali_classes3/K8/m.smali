.class final LK8/m;
.super LK8/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method protected final bridge synthetic a(Lcom/google/android/gms/common/api/Status;)LP8/k;
    .locals 0

    .line 1
    return-object p1
.end method

.method protected final bridge synthetic d(LP8/a$b;)V
    .locals 2

    .line 1
    check-cast p1, LK8/i;

    .line 2
    .line 3
    invoke-virtual {p1}, LR8/c;->C()Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LK8/w;

    .line 8
    .line 9
    new-instance v1, LK8/l;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LK8/l;-><init>(LK8/m;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LK8/i;->l0()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, v1, p1}, LK8/w;->J3(LK8/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
