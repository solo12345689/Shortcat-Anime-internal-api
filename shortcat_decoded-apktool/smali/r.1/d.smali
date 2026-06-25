.class public Lr/d;
.super Landroidx/fragment/app/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/d$l;,
        Lr/d$m;,
        Lr/d$n;,
        Lr/d$o;,
        Lr/d$s;,
        Lr/d$r;,
        Lr/d$q;,
        Lr/d$p;
    }
.end annotation


# instance fields
.field a:Landroid/os/Handler;

.field b:Lr/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr/d;->a:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method

.method private static A(LC1/a;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LC1/a;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0xc

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, LC1/a;->e()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const/16 p0, 0xb

    .line 17
    .line 18
    return p0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private B()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Landroidx/lifecycle/W;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroidx/lifecycle/W;-><init>(Landroidx/lifecycle/Y;)V

    .line 15
    .line 16
    .line 17
    const-class v1, Lr/g;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/W;->a(Ljava/lang/Class;)Landroidx/lifecycle/U;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lr/g;

    .line 24
    .line 25
    iput-object v0, p0, Lr/d;->b:Lr/g;

    .line 26
    .line 27
    invoke-virtual {v0}, Lr/g;->e()Landroidx/lifecycle/y;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lr/d$c;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lr/d$c;-><init>(Lr/d;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 40
    .line 41
    invoke-virtual {v0}, Lr/g;->c()Landroidx/lifecycle/A;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lr/d$d;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lr/d$d;-><init>(Lr/d;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 54
    .line 55
    invoke-virtual {v0}, Lr/g;->d()Landroidx/lifecycle/y;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Lr/d$e;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lr/d$e;-><init>(Lr/d;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 68
    .line 69
    invoke-virtual {v0}, Lr/g;->t()Landroidx/lifecycle/y;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lr/d$f;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lr/d$f;-><init>(Lr/d;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 82
    .line 83
    invoke-virtual {v0}, Lr/g;->B()Landroidx/lifecycle/y;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Lr/d$g;

    .line 88
    .line 89
    invoke-direct {v1, p0}, Lr/d$g;-><init>(Lr/d;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 96
    .line 97
    invoke-virtual {v0}, Lr/g;->y()Landroidx/lifecycle/y;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v1, Lr/d$h;

    .line 102
    .line 103
    invoke-direct {v1, p0}, Lr/d$h;-><init>(Lr/d;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/y;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method private D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lr/g;->X(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/q;->isAdded()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getParentFragmentManager()Landroidx/fragment/app/K;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "androidx.biometric.FingerprintDialogFragment"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/fragment/app/K;->q0(Ljava/lang/String;)Landroidx/fragment/app/q;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lr/l;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/q;->isAdded()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/o;->A()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/K;->s()Landroidx/fragment/app/U;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v1}, Landroidx/fragment/app/U;->n(Landroidx/fragment/app/q;)Landroidx/fragment/app/U;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroidx/fragment/app/U;->i()I

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method private E()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lr/j;->f(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    const/16 v0, 0x7d0

    .line 18
    .line 19
    return v0
.end method

.method private F(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    new-instance p1, Lr/f$b;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {p1, v0, v1}, Lr/f$b;-><init>(Lr/f$c;I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lr/d;->W(Lr/f$b;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget p1, Lr/u;->l:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private G()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method private H()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 8
    .line 9
    invoke-virtual {v1}, Lr/g;->j()Lr/f$c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lr/j;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private I()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lr/n;->a(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private K()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lr/d;->H()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lr/d;->I()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method

.method private L()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "BiometricFragment"

    .line 8
    .line 9
    const-string v1, "Failed to check device credential. Client FragmentActivity not found."

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {v0}, Lr/m;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    sget v0, Lr/u;->k:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0xc

    .line 28
    .line 29
    invoke-virtual {p0, v1, v0}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 34
    .line 35
    invoke-virtual {v1}, Lr/g;->s()Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 40
    .line 41
    invoke-virtual {v2}, Lr/g;->r()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 46
    .line 47
    invoke-virtual {v3}, Lr/g;->k()Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object v2, v3

    .line 55
    :goto_0
    invoke-static {v0, v1, v2}, Lr/d$l;->a(Landroid/app/KeyguardManager;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    sget v0, Lr/u;->j:I

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/16 v1, 0xe

    .line 68
    .line 69
    invoke-virtual {p0, v1, v0}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-virtual {v1, v2}, Lr/g;->L(Z)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, Lr/d;->K()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-direct {p0}, Lr/d;->D()V

    .line 86
    .line 87
    .line 88
    :cond_4
    const/high16 v1, 0x8080000

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/q;->startActivityForResult(Landroid/content/Intent;I)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method static M()Lr/d;
    .locals 1

    .line 1
    new-instance v0, Lr/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lr/d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private U(ILjava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "BiometricFragment"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p1, "Error not sent to client. User is confirming their device credential."

    .line 12
    .line 13
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lr/g;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string p1, "Error not sent to client. Client is not awaiting a result."

    .line 26
    .line 27
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lr/g;->H(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 38
    .line 39
    invoke-virtual {v0}, Lr/g;->i()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lr/d$a;

    .line 44
    .line 45
    invoke-direct {v1, p0, p1, p2}, Lr/d$a;-><init>(Lr/d;ILjava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "BiometricFragment"

    .line 10
    .line 11
    const-string v1, "Failure not sent to client. Client is not awaiting a result."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Lr/g;->i()Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lr/d$b;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lr/d$b;-><init>(Lr/d;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private W(Lr/f$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr/d;->X(Lr/f$b;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lr/d;->C()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private X(Lr/f$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "BiometricFragment"

    .line 10
    .line 11
    const-string v0, "Success not sent to client. Client is not awaiting a result."

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lr/g;->H(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 24
    .line 25
    invoke-virtual {v0}, Lr/g;->i()Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lr/d$k;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, Lr/d$k;-><init>(Lr/d;Lr/f$b;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private Y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lr/d$m;->d(Landroid/content/Context;)Landroid/hardware/biometrics/BiometricPrompt$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 14
    .line 15
    invoke-virtual {v1}, Lr/g;->s()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 20
    .line 21
    invoke-virtual {v2}, Lr/g;->r()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 26
    .line 27
    invoke-virtual {v3}, Lr/g;->k()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {v0, v1}, Lr/d$m;->h(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-static {v0, v2}, Lr/d$m;->g(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-static {v0, v3}, Lr/d$m;->e(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 47
    .line 48
    invoke-virtual {v1}, Lr/g;->q()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 59
    .line 60
    invoke-virtual {v2}, Lr/g;->i()Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 65
    .line 66
    invoke-virtual {v3}, Lr/g;->p()Landroid/content/DialogInterface$OnClickListener;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v0, v1, v2, v3}, Lr/d$m;->f(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    const/16 v2, 0x1d

    .line 76
    .line 77
    if-lt v1, v2, :cond_4

    .line 78
    .line 79
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 80
    .line 81
    invoke-virtual {v3}, Lr/g;->v()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v0, v3}, Lr/d$n;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 86
    .line 87
    .line 88
    :cond_4
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 89
    .line 90
    invoke-virtual {v3}, Lr/g;->a()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/16 v4, 0x1e

    .line 95
    .line 96
    if-lt v1, v4, :cond_5

    .line 97
    .line 98
    invoke-static {v0, v3}, Lr/d$o;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    if-lt v1, v2, :cond_6

    .line 103
    .line 104
    invoke-static {v3}, Lr/b;->c(I)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {v0, v1}, Lr/d$n;->b(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_0
    invoke-static {v0}, Lr/d$m;->c(Landroid/hardware/biometrics/BiometricPrompt$Builder;)Landroid/hardware/biometrics/BiometricPrompt;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p0, v0, v1}, Lr/d;->x(Landroid/hardware/biometrics/BiometricPrompt;Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method private Z()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LC1/a;->c(Landroid/content/Context;)LC1/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lr/d;->A(LC1/a;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v2}, Lr/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v2, v0}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/q;->isAdded()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v2, v3}, Lr/g;->P(Z)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v2}, Lr/j;->f(Landroid/content/Context;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    iget-object v2, p0, Lr/d;->a:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v3, Lr/d$i;

    .line 50
    .line 51
    invoke-direct {v3, p0}, Lr/d$i;-><init>(Lr/d;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v4, 0x1f4

    .line 55
    .line 56
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lr/l;->Q()Lr/l;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getParentFragmentManager()Landroidx/fragment/app/K;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "androidx.biometric.FingerprintDialogFragment"

    .line 68
    .line 69
    invoke-virtual {v2, v3, v4}, Landroidx/fragment/app/o;->M(Landroidx/fragment/app/K;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual {v2, v3}, Lr/g;->I(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1, v0}, Lr/d;->y(LC1/a;Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method private a0(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget p1, Lr/u;->b:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {v0, v1}, Lr/g;->S(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lr/g;->Q(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lr/g;->X(Z)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lr/d;->D()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Lr/g;->w()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/q;->isAdded()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getParentFragmentManager()Landroidx/fragment/app/K;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/K;->s()Landroidx/fragment/app/U;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p0}, Landroidx/fragment/app/U;->n(Landroidx/fragment/app/q;)Landroidx/fragment/app/U;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/U;->i()I

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lr/j;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-virtual {v0, v1}, Lr/g;->N(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lr/d;->a:Landroid/os/Handler;

    .line 60
    .line 61
    new-instance v1, Lr/d$r;

    .line 62
    .line 63
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 64
    .line 65
    invoke-direct {v1, v2}, Lr/d$r;-><init>(Lr/g;)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v2, 0x258

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method J()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr/g;->a()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lr/b;->c(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method N(ILjava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lr/k;->b(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 p1, 0x8

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v2, 0x1d

    .line 17
    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, Lr/k;->c(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v0}, Lr/m;->b(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 35
    .line 36
    invoke-virtual {v0}, Lr/g;->a()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Lr/b;->c(I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-direct {p0}, Lr/d;->L()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-direct {p0}, Lr/d;->K()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_7

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2, p1}, Lr/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    :goto_1
    const/4 v0, 0x5

    .line 68
    if-ne p1, v0, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 71
    .line 72
    invoke-virtual {v0}, Lr/g;->f()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    :cond_3
    invoke-direct {p0, p1, p2}, Lr/d;->U(ILjava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p0}, Lr/d;->C()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 89
    .line 90
    invoke-virtual {v0}, Lr/g;->z()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0, p1, p2}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    invoke-direct {p0, p2}, Lr/d;->a0(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lr/d;->a:Landroid/os/Handler;

    .line 104
    .line 105
    new-instance v1, Lr/d$j;

    .line 106
    .line 107
    invoke-direct {v1, p0, p1, p2}, Lr/d$j;-><init>(Lr/d;ILjava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Lr/d;->E()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    int-to-long p1, p1

    .line 115
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 116
    .line 117
    .line 118
    :goto_2
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 119
    .line 120
    const/4 p2, 0x1

    .line 121
    invoke-virtual {p1, p2}, Lr/g;->P(Z)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_7
    if-eqz p2, :cond_8

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    sget v0, Lr/u;->b:I

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v0, " "

    .line 143
    .line 144
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    :goto_3
    invoke-virtual {p0, p1, p2}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method O()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/d;->K()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lr/u;->i:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lr/d;->a0(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lr/d;->V()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method P(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/d;->K()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lr/d;->a0(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method Q(Lr/f$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr/d;->W(Lr/f$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method R()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->q()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget v0, Lr/u;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    const/16 v1, 0xd

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-virtual {p0, v0}, Lr/d;->z(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method S()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr/d;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method T(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lr/d;->U(ILjava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lr/d;->C()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method b0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->C()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "BiometricFragment"

    .line 16
    .line 17
    const-string v1, "Not showing biometric prompt. Context is null."

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Lr/g;->X(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lr/g;->H(Z)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lr/d;->K()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0}, Lr/d;->Z()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-direct {p0}, Lr/d;->Y()V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/q;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x1

    .line 5
    if-ne p1, p3, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p3}, Lr/g;->L(Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lr/d;->F(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lr/d;->B()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onStart()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Lr/g;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Lr/b;->c(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lr/g;->T(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lr/d;->a:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v1, Lr/d$s;

    .line 31
    .line 32
    iget-object v2, p0, Lr/d;->b:Lr/g;

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lr/d$s;-><init>(Lr/g;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v2, 0xfa

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Lr/g;->w()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lr/d;->G()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, Lr/d;->z(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method w(Lr/f$d;Lr/f$c;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "BiometricFragment"

    .line 8
    .line 9
    const-string p2, "Not launching prompt. Client activity was null."

    .line 10
    .line 11
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lr/g;->W(Lr/f$d;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lr/b;->b(Lr/f$d;Lr/f$c;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v2, 0x1e

    .line 27
    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    const/16 v1, 0xf

    .line 31
    .line 32
    if-ne p1, v1, :cond_1

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 37
    .line 38
    invoke-static {}, Lr/i;->a()Lr/f$c;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p2}, Lr/g;->M(Lr/f$c;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lr/g;->M(Lr/f$c;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0}, Lr/d;->J()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 58
    .line 59
    sget p2, Lr/u;->a:I

    .line 60
    .line 61
    invoke-virtual {p0, p2}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1, p2}, Lr/g;->V(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    invoke-virtual {p1, p2}, Lr/g;->V(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {p0}, Lr/d;->J()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-static {v0}, Lr/e;->g(Landroid/content/Context;)Lr/e;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const/16 p2, 0xff

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Lr/e;->a(I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 94
    .line 95
    const/4 p2, 0x1

    .line 96
    invoke-virtual {p1, p2}, Lr/g;->H(Z)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lr/d;->L()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 104
    .line 105
    invoke-virtual {p1}, Lr/g;->x()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    iget-object p1, p0, Lr/d;->a:Landroid/os/Handler;

    .line 112
    .line 113
    new-instance p2, Lr/d$q;

    .line 114
    .line 115
    invoke-direct {p2, p0}, Lr/d$q;-><init>(Lr/d;)V

    .line 116
    .line 117
    .line 118
    const-wide/16 v0, 0x258

    .line 119
    .line 120
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    invoke-virtual {p0}, Lr/d;->b0()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method x(Landroid/hardware/biometrics/BiometricPrompt;Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->j()Lr/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lr/i;->d(Lr/f$c;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lr/d;->b:Lr/g;

    .line 12
    .line 13
    invoke-virtual {v1}, Lr/g;->g()Lr/h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lr/h;->b()Landroid/os/CancellationSignal;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lr/d$p;

    .line 22
    .line 23
    invoke-direct {v2}, Lr/d$p;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lr/d;->b:Lr/g;

    .line 27
    .line 28
    invoke-virtual {v3}, Lr/g;->b()Lr/a;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lr/a;->a()Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1, v1, v2, v3}, Lr/d$m;->b(Landroid/hardware/biometrics/BiometricPrompt;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p1, v0, v1, v2, v3}, Lr/d$m;->a(Landroid/hardware/biometrics/BiometricPrompt;Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_0
    const-string v0, "BiometricFragment"

    .line 49
    .line 50
    const-string v1, "Got NPE while authenticating with biometric prompt."

    .line 51
    .line 52
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    sget p1, Lr/u;->b:I

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const-string p1, ""

    .line 65
    .line 66
    :goto_1
    const/4 p2, 0x1

    .line 67
    invoke-virtual {p0, p2, p1}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method y(LC1/a;Landroid/content/Context;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/g;->j()Lr/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lr/i;->e(Lr/f$c;)LC1/a$e;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lr/g;->g()Lr/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lr/h;->c()LG1/d;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 22
    .line 23
    invoke-virtual {v0}, Lr/g;->b()Lr/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lr/a;->b()LC1/a$c;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v1, p1

    .line 34
    :try_start_0
    invoke-virtual/range {v1 .. v6}, LC1/a;->a(LC1/a$e;ILG1/d;LC1/a$c;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    const-string v0, "BiometricFragment"

    .line 41
    .line 42
    const-string v1, "Got NPE while authenticating with fingerprint."

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-static {p2, p1}, Lr/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p0, p1, p2}, Lr/d;->T(ILjava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method z(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 5
    .line 6
    invoke-virtual {v0}, Lr/g;->A()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lr/d;->K()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lr/d;->b:Lr/g;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lr/g;->I(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/16 v0, 0xa

    .line 32
    .line 33
    invoke-static {p1, v0}, Lr/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, v0, p1}, Lr/d;->U(ILjava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Lr/d;->b:Lr/g;

    .line 41
    .line 42
    invoke-virtual {p1}, Lr/g;->g()Lr/h;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lr/h;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
