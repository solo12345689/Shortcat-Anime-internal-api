.class public final LR8/k0;
.super LR8/W;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic g:LR8/c;


# direct methods
.method public constructor <init>(LR8/c;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/k0;->g:LR8/c;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, LR8/W;-><init>(LR8/c;ILandroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method protected final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, LR8/k0;->g:LR8/c;

    .line 2
    .line 3
    iget-object v0, v0, LR8/c;->p:LR8/c$c;

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/common/ConnectionResult;->f:Lcom/google/android/gms/common/ConnectionResult;

    .line 6
    .line 7
    invoke-interface {v0, v1}, LR8/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0
.end method

.method protected final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, LR8/k0;->g:LR8/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LR8/c;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LR8/c;->Y()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 p1, 0x10

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LR8/c;->X(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v1, v0, LR8/c;->p:LR8/c$c;

    .line 22
    .line 23
    invoke-interface {v1, p1}, LR8/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, LR8/c;->K(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
