.class public final synthetic Lcom/google/android/gms/internal/auth/T1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ8/n;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/auth/b;

.field public final synthetic b:Landroid/accounts/Account;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/b;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/T1;->a:Lcom/google/android/gms/internal/auth/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/auth/T1;->b:Landroid/accounts/Account;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/auth/T1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/auth/T1;->d:Landroid/os/Bundle;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/T1;->a:Lcom/google/android/gms/internal/auth/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/T1;->b:Landroid/accounts/Account;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/T1;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/internal/auth/T1;->d:Landroid/os/Bundle;

    .line 8
    .line 9
    check-cast p1, Lcom/google/android/gms/internal/auth/P1;

    .line 10
    .line 11
    check-cast p2, Ln9/j;

    .line 12
    .line 13
    invoke-virtual {p1}, LR8/c;->C()Landroid/os/IInterface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/google/android/gms/internal/auth/S1;

    .line 18
    .line 19
    new-instance v4, Lcom/google/android/gms/internal/auth/W1;

    .line 20
    .line 21
    invoke-direct {v4, v0, p2}, Lcom/google/android/gms/internal/auth/W1;-><init>(Lcom/google/android/gms/internal/auth/b;Ln9/j;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v4, v1, v2, v3}, Lcom/google/android/gms/internal/auth/S1;->K3(Lcom/google/android/gms/internal/auth/R1;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
