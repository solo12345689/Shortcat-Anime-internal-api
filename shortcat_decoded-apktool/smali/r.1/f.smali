.class public Lr/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/f$d;,
        Lr/f$a;,
        Lr/f$b;,
        Lr/f$c;
    }
.end annotation


# instance fields
.field private a:Landroidx/fragment/app/K;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/v;Ljava/util/concurrent/Executor;Lr/f$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1}, Lr/f;->e(Landroidx/fragment/app/v;)Lr/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, v0, p1, p2, p3}, Lr/f;->f(Landroidx/fragment/app/K;Lr/g;Ljava/util/concurrent/Executor;Lr/f$a;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "AuthenticationCallback must not be null."

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "Executor must not be null."

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string p2, "FragmentActivity must not be null."

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method private b(Lr/f$d;Lr/f$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/f;->a:Landroidx/fragment/app/K;

    .line 2
    .line 3
    const-string v1, "BiometricPromptCompat"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Unable to start authentication. Client fragment manager was null."

    .line 8
    .line 9
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/K;->X0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string p1, "Unable to start authentication. Called after onSaveInstanceState()."

    .line 20
    .line 21
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Lr/f;->a:Landroidx/fragment/app/K;

    .line 26
    .line 27
    invoke-static {v0}, Lr/f;->d(Landroidx/fragment/app/K;)Lr/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1, p2}, Lr/d;->w(Lr/f$d;Lr/f$c;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static c(Landroidx/fragment/app/K;)Lr/d;
    .locals 1

    .line 1
    const-string v0, "androidx.biometric.BiometricFragment"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/K;->q0(Ljava/lang/String;)Landroidx/fragment/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr/d;

    .line 8
    .line 9
    return-object p0
.end method

.method private static d(Landroidx/fragment/app/K;)Lr/d;
    .locals 3

    .line 1
    invoke-static {p0}, Lr/f;->c(Landroidx/fragment/app/K;)Lr/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lr/d;->M()Lr/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/K;->s()Landroidx/fragment/app/U;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "androidx.biometric.BiometricFragment"

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/U;->e(Landroidx/fragment/app/q;Ljava/lang/String;)Landroidx/fragment/app/U;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroidx/fragment/app/U;->i()I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/K;->l0()Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v0
.end method

.method private static e(Landroidx/fragment/app/v;)Lr/g;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroidx/lifecycle/W;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/lifecycle/W;-><init>(Landroidx/lifecycle/Y;)V

    .line 6
    .line 7
    .line 8
    const-class p0, Lr/g;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/W;->a(Ljava/lang/Class;)Landroidx/lifecycle/U;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lr/g;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private f(Landroidx/fragment/app/K;Lr/g;Ljava/util/concurrent/Executor;Lr/f$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/f;->a:Landroidx/fragment/app/K;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p3}, Lr/g;->K(Ljava/util/concurrent/Executor;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2, p4}, Lr/g;->J(Lr/f$a;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lr/f$d;Lr/f$c;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    invoke-static {p1, p2}, Lr/b;->b(Lr/f$d;Lr/f$c;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lr/b;->f(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v2, 0x1e

    .line 18
    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Lr/b;->c(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string p2, "Crypto-based authentication is not supported for device credential prior to API 30."

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lr/f;->b(Lr/f$d;Lr/f$c;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string p2, "Crypto-based authentication is not supported for Class 2 (Weak) biometrics."

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string p2, "CryptoObject cannot be null."

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string p2, "PromptInfo cannot be null."

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
