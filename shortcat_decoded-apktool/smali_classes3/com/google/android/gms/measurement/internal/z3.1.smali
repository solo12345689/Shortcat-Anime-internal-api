.class public final Lcom/google/android/gms/measurement/internal/z3;
.super Lj9/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/q6;

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/q6;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj9/c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/z3;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method private final M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/q6;->k(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final N3(Lcom/google/android/gms/measurement/internal/B6;Z)V
    .locals 1

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p2}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->N0()Lcom/google/android/gms/measurement/internal/z6;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lcom/google/android/gms/measurement/internal/z6;->o(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final O3(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    if-eqz p2, :cond_3

    .line 8
    .line 9
    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->b:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    const-string p2, "com.google.android.gms"

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v0, 0x1

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->d()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v1, v2}, Lcom/google/android/gms/common/util/q;->a(Landroid/content/Context;I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->d()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p2}, Lcom/google/android/gms/common/e;->a(Landroid/content/Context;)Lcom/google/android/gms/common/e;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p2, v1}, Lcom/google/android/gms/common/e;->c(I)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p2

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->b:Ljava/lang/Boolean;

    .line 68
    .line 69
    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->b:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_5

    .line 76
    .line 77
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->c:Ljava/lang/String;

    .line 78
    .line 79
    if-nez p2, :cond_4

    .line 80
    .line 81
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->d()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {p2, v0, p1}, Lcom/google/android/gms/common/d;->k(Landroid/content/Context;ILjava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/z3;->c:Ljava/lang/String;

    .line 98
    .line 99
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_6

    .line 106
    .line 107
    :cond_5
    return-void

    .line 108
    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    .line 109
    .line 110
    const-string v0, "Unknown calling package name \'%s\'."

    .line 111
    .line 112
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v1, "Measurement Service called with invalid calling package. appId"

    .line 139
    .line 140
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    throw p2

    .line 144
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string p2, "Measurement Service called without app package"

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, Ljava/lang/SecurityException;

    .line 160
    .line 161
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method


# virtual methods
.method public final A0(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->s:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/measurement/internal/s3;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/s3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->e(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final C1(Lcom/google/android/gms/measurement/internal/B6;Lj9/J;Lj9/j;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/google/android/gms/measurement/internal/u3;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/u3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Lj9/J;Lj9/j;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->t(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final C3(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->s:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/measurement/internal/k3;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/k3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->e(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final E1(Lcom/google/android/gms/measurement/internal/B6;Z)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lcom/google/android/gms/measurement/internal/Y2;

    .line 17
    .line 18
    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/measurement/internal/Y2;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lcom/google/android/gms/measurement/internal/x6;

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/x6;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/z6;->N(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto :goto_2

    .line 69
    :catch_1
    move-exception p2

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :goto_1
    new-instance v3, Lcom/google/android/gms/measurement/internal/v6;

    .line 72
    .line 73
    invoke-direct {v3, v2}, Lcom/google/android/gms/measurement/internal/v6;-><init>(Lcom/google/android/gms/measurement/internal/x6;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object v1

    .line 81
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v1, "Failed to get user properties. appId"

    .line 98
    .line 99
    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    return-object p1
.end method

.method public final E2(Lcom/google/android/gms/measurement/internal/B6;Lcom/google/android/gms/measurement/internal/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/measurement/internal/w3;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/w3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;Lcom/google/android/gms/measurement/internal/g;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final G0(Lcom/google/android/gms/measurement/internal/G;Ljava/lang/String;)[B
    .locals 9

    .line 1
    invoke-static {p2}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->v()Lcom/google/android/gms/measurement/internal/o2;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->M0()Lcom/google/android/gms/measurement/internal/j2;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/j2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v4, "Log and bundle. event"

    .line 32
    .line 33
    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->e()Lcom/google/android/gms/common/util/d;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Lcom/google/android/gms/common/util/d;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    const-wide/32 v4, 0xf4240

    .line 45
    .line 46
    .line 47
    div-long/2addr v1, v4

    .line 48
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    new-instance v7, Lcom/google/android/gms/measurement/internal/o3;

    .line 53
    .line 54
    invoke-direct {v7, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/o3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/G;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/T2;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    :try_start_0
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, [B

    .line 66
    .line 67
    if-nez v6, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v7, "Log and bundle returned null. appId"

    .line 78
    .line 79
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    new-array v6, v6, [B

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    .line 91
    goto :goto_1

    .line 92
    :catch_1
    move-exception v0

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->e()Lcom/google/android/gms/common/util/d;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-interface {v7}, Lcom/google/android/gms/common/util/d;->b()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    div-long/2addr v7, v4

    .line 103
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q2;->v()Lcom/google/android/gms/measurement/internal/o2;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "Log and bundle processed. event, size, time_ms"

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->M0()Lcom/google/android/gms/measurement/internal/j2;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/j2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    array-length v3, v6

    .line 122
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sub-long/2addr v7, v1

    .line 127
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v4, v5, v0, v3, v1}, Lcom/google/android/gms/measurement/internal/o2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    return-object v6

    .line 135
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->M0()Lcom/google/android/gms/measurement/internal/j2;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/j2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    const-string v1, "Failed to log and bundle. appId, event, error"

    .line 160
    .line 161
    invoke-virtual {v2, v1, p2, p1, v0}, Lcom/google/android/gms/measurement/internal/o2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    const/4 p1, 0x0

    .line 165
    return-object p1
.end method

.method final synthetic G3(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/q6;->Q0(Lcom/google/android/gms/measurement/internal/B6;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method final synthetic H3(Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;Lj9/g;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/q6;->q0(Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :try_start_0
    invoke-interface {p3, p1}, Lj9/g;->o1(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string p3, "Failed to return trigger URIs for app"

    .line 26
    .line 27
    invoke-virtual {p2, p3, p4, p1}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final I0(Lcom/google/android/gms/measurement/internal/i;)V
    .locals 2

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/i;->c:Lcom/google/android/gms/measurement/internal/v6;

    .line 5
    .line 6
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/i;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/i;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/measurement/internal/i;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/i;-><init>(Lcom/google/android/gms/measurement/internal/i;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lcom/google/android/gms/measurement/internal/d3;

    .line 26
    .line 27
    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/measurement/internal/d3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/i;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method final synthetic I3(Ljava/lang/String;Lj9/J;Lj9/j;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->O0()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->F0()Lcom/google/android/gms/measurement/internal/u;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Lcom/google/android/gms/measurement/internal/d2;->B:Lcom/google/android/gms/measurement/internal/c2;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, p1, p2, v2}, Lcom/google/android/gms/measurement/internal/u;->o(Ljava/lang/String;Lj9/J;I)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/google/android/gms/measurement/internal/t6;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->e()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0, p1, v4}, Lcom/google/android/gms/measurement/internal/q6;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->e()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v6, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    .line 89
    .line 90
    invoke-virtual {v4, v6, p1, v5, v2}, Lcom/google/android/gms/measurement/internal/o2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->i()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-gtz v4, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    sget-object v5, Lcom/google/android/gms/measurement/internal/d2;->z:Lcom/google/android/gms/measurement/internal/c2;

    .line 102
    .line 103
    invoke-virtual {v5, v3}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-le v4, v5, :cond_2

    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_2
    sget-object v5, Lcom/google/android/gms/measurement/internal/d2;->x:Lcom/google/android/gms/measurement/internal/c2;

    .line 118
    .line 119
    invoke-virtual {v5, v3}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Ljava/lang/Long;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v5

    .line 129
    add-int/lit8 v4, v4, -0x1

    .line 130
    .line 131
    const-wide/16 v7, 0x1

    .line 132
    .line 133
    shl-long/2addr v7, v4

    .line 134
    mul-long/2addr v5, v7

    .line 135
    sget-object v4, Lcom/google/android/gms/measurement/internal/d2;->y:Lcom/google/android/gms/measurement/internal/c2;

    .line 136
    .line 137
    invoke-virtual {v4, v3}, Lcom/google/android/gms/measurement/internal/c2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/lang/Long;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 144
    .line 145
    .line 146
    move-result-wide v7

    .line 147
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->e()Lcom/google/android/gms/common/util/d;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-interface {v6}, Lcom/google/android/gms/common/util/d;->a()J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->h()J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    add-long/2addr v8, v4

    .line 164
    cmp-long v4, v6, v8

    .line 165
    .line 166
    if-ltz v4, :cond_5

    .line 167
    .line 168
    :goto_1
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->b()Lcom/google/android/gms/measurement/internal/X5;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c3;->J()Lcom/google/android/gms/internal/measurement/Z2;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/X5;->b:[B

    .line 177
    .line 178
    invoke-static {v4, v5}, Lcom/google/android/gms/measurement/internal/u6;->W(Lcom/google/android/gms/internal/measurement/D5;[B)Lcom/google/android/gms/internal/measurement/D5;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, Lcom/google/android/gms/internal/measurement/Z2;

    .line 183
    .line 184
    const/4 v5, 0x0

    .line 185
    :goto_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Z2;->u()I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-ge v5, v6, :cond_3

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/Z2;->v(I)Lcom/google/android/gms/internal/measurement/e3;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->p()Lcom/google/android/gms/internal/measurement/b5;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    check-cast v6, Lcom/google/android/gms/internal/measurement/d3;

    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->e()Lcom/google/android/gms/common/util/d;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-interface {v7}, Lcom/google/android/gms/common/util/d;->a()J

    .line 206
    .line 207
    .line 208
    move-result-wide v7

    .line 209
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/d3;->f1(J)Lcom/google/android/gms/internal/measurement/d3;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/Z2;->x(ILcom/google/android/gms/internal/measurement/d3;)Lcom/google/android/gms/internal/measurement/Z2;

    .line 213
    .line 214
    .line 215
    add-int/lit8 v5, v5, 0x1

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/b5;->q()Lcom/google/android/gms/internal/measurement/d5;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    check-cast v5, Lcom/google/android/gms/internal/measurement/c3;

    .line 223
    .line 224
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/u4;->b()[B

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    iput-object v5, v2, Lcom/google/android/gms/measurement/internal/X5;->b:[B

    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/q2;->z()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    const/4 v6, 0x2

    .line 239
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_4

    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->K0()Lcom/google/android/gms/measurement/internal/u6;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/b5;->q()Lcom/google/android/gms/internal/measurement/d5;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Lcom/google/android/gms/internal/measurement/c3;

    .line 254
    .line 255
    invoke-virtual {v5, v4}, Lcom/google/android/gms/measurement/internal/u6;->K(Lcom/google/android/gms/internal/measurement/c3;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    iput-object v4, v2, Lcom/google/android/gms/measurement/internal/X5;->g:Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/m5; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :catch_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->r()Lcom/google/android/gms/measurement/internal/o2;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const-string v4, "Failed to parse queued batch. appId"

    .line 275
    .line 276
    invoke-virtual {v2, v4, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_5
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->c()J

    .line 290
    .line 291
    .line 292
    move-result-wide v5

    .line 293
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/t6;->h()J

    .line 298
    .line 299
    .line 300
    move-result-wide v6

    .line 301
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    const-string v6, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    .line 306
    .line 307
    invoke-virtual {v4, v6, p1, v5, v2}, Lcom/google/android/gms/measurement/internal/o2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_6
    new-instance p2, Lcom/google/android/gms/measurement/internal/Z5;

    .line 313
    .line 314
    invoke-direct {p2, v1}, Lcom/google/android/gms/measurement/internal/Z5;-><init>(Ljava/util/List;)V

    .line 315
    .line 316
    .line 317
    :try_start_1
    invoke-interface {p3, p2}, Lj9/j;->Z2(Lcom/google/android/gms/measurement/internal/Z5;)V

    .line 318
    .line 319
    .line 320
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 321
    .line 322
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 327
    .line 328
    .line 329
    move-result-object p3

    .line 330
    const-string v0, "[sgtm] Sending queued upload batches to client. appId, count"

    .line 331
    .line 332
    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/Z5;->a:Ljava/util/List;

    .line 333
    .line 334
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    invoke-virtual {p3, v0, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :catch_1
    move-exception p2

    .line 347
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 348
    .line 349
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 350
    .line 351
    .line 352
    move-result-object p3

    .line 353
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 354
    .line 355
    .line 356
    move-result-object p3

    .line 357
    const-string v0, "[sgtm] Failed to return upload batches for app"

    .line 358
    .line 359
    invoke-virtual {p3, v0, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    return-void
.end method

.method final synthetic J3(Lcom/google/android/gms/measurement/internal/B6;Lcom/google/android/gms/measurement/internal/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/q6;->r0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/google/android/gms/measurement/internal/f3;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/f3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Ljava/util/List;

    .line 25
    .line 26
    new-instance p3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/google/android/gms/measurement/internal/x6;

    .line 50
    .line 51
    if-nez p4, :cond_1

    .line 52
    .line 53
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/x6;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/z6;->N(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p2

    .line 63
    goto :goto_2

    .line 64
    :catch_1
    move-exception p2

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    :goto_1
    new-instance v1, Lcom/google/android/gms/measurement/internal/v6;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/v6;-><init>(Lcom/google/android/gms/measurement/internal/x6;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-object p3

    .line 76
    :goto_2
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 77
    .line 78
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string p4, "Failed to get user properties as. appId"

    .line 91
    .line 92
    invoke-virtual {p3, p4, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 96
    .line 97
    return-object p1
.end method

.method final synthetic K3(Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->B0()Lcom/google/android/gms/measurement/internal/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/google/android/gms/measurement/internal/d2;->W0:Lcom/google/android/gms/measurement/internal/c2;

    .line 8
    .line 9
    const/4 v11, 0x0

    .line 10
    invoke-virtual {v1, v11, v2}, Lcom/google/android/gms/measurement/internal/m;->H(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/c2;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->F0()Lcom/google/android/gms/measurement/internal/u;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/b6;->j()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/u;->u0()Landroid/database/sqlite/SQLiteDatabase;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v2, "delete from default_event_params where app_id=?"

    .line 39
    .line 40
    filled-new-array {p2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "Error clearing default event params"

    .line 60
    .line 61
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->F0()Lcom/google/android/gms/measurement/internal/u;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/A3;->h()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/b6;->j()V

    .line 73
    .line 74
    .line 75
    iget-object v2, v12, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 76
    .line 77
    new-instance v1, Lcom/google/android/gms/measurement/internal/B;

    .line 78
    .line 79
    const-wide/16 v6, 0x0

    .line 80
    .line 81
    const-wide/16 v8, 0x0

    .line 82
    .line 83
    const-string v3, ""

    .line 84
    .line 85
    const-string v5, "dep"

    .line 86
    .line 87
    move-object v10, p1

    .line 88
    move-object v4, p2

    .line 89
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/measurement/internal/B;-><init>(Lcom/google/android/gms/measurement/internal/X2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v12, Lcom/google/android/gms/measurement/internal/W5;->b:Lcom/google/android/gms/measurement/internal/q6;

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->K0()Lcom/google/android/gms/measurement/internal/u6;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/u6;->J(Lcom/google/android/gms/measurement/internal/B;)Lcom/google/android/gms/internal/measurement/S2;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/u4;->b()[B

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, v12, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    array-length v3, v0

    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v5, "Saving default event parameters, appId, data size"

    .line 122
    .line 123
    invoke-virtual {v2, v5, p2, v3}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, Landroid/content/ContentValues;

    .line 127
    .line 128
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v3, "app_id"

    .line 132
    .line 133
    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v3, "parameters"

    .line 137
    .line 138
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 139
    .line 140
    .line 141
    :try_start_1
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/u;->u0()Landroid/database/sqlite/SQLiteDatabase;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v3, "default_event_params"

    .line 146
    .line 147
    const/4 v5, 0x5

    .line 148
    invoke-virtual {v0, v3, v11, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    const-wide/16 v5, -0x1

    .line 153
    .line 154
    cmp-long v0, v2, v5

    .line 155
    .line 156
    if-nez v0, :cond_1

    .line 157
    .line 158
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const-string v1, "Failed to insert default event parameters (got -1). appId"

    .line 167
    .line 168
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :catch_1
    move-exception v0

    .line 177
    iget-object v1, v12, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const-string v3, "Error storing default event parameters. appId"

    .line 192
    .line 193
    invoke-virtual {v1, v3, v2, v0}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->F0()Lcom/google/android/gms/measurement/internal/u;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    move-object/from16 v2, p3

    .line 203
    .line 204
    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/B6;->D:J

    .line 205
    .line 206
    invoke-virtual {v1, p2, v2, v3}, Lcom/google/android/gms/measurement/internal/u;->H(Ljava/lang/String;J)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_2

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->F0()Lcom/google/android/gms/measurement/internal/u;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, p2, v1, v11, p1}, Lcom/google/android/gms/measurement/internal/u;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 221
    .line 222
    .line 223
    :cond_2
    return-void
.end method

.method final synthetic L3()Lcom/google/android/gms/measurement/internal/q6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(Lcom/google/android/gms/measurement/internal/i;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/i;->c:Lcom/google/android/gms/measurement/internal/v6;

    .line 5
    .line 6
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/measurement/internal/i;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/i;-><init>(Lcom/google/android/gms/measurement/internal/i;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p2, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/i;->a:Ljava/lang/String;

    .line 21
    .line 22
    new-instance p1, Lcom/google/android/gms/measurement/internal/c3;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2}, Lcom/google/android/gms/measurement/internal/c3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/i;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final O2(Lcom/google/android/gms/measurement/internal/B6;)Lj9/a;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/android/gms/measurement/internal/l3;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/l3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v2, 0x2710

    .line 28
    .line 29
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lj9/a;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    return-object v0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_2
    move-exception v0

    .line 41
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v2, "Failed to get consent. appId"

    .line 58
    .line 59
    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lj9/a;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {p1, v0}, Lj9/a;-><init>(Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    return-object p1
.end method

.method public final P0(Lcom/google/android/gms/measurement/internal/v6;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/measurement/internal/p3;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/v6;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final P2(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/measurement/internal/x3;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/measurement/internal/x3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method final P3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->D0()Lcom/google/android/gms/measurement/internal/P2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/P2;->j:Lt/z;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lt/z;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/google/android/gms/internal/measurement/e0;

    .line 24
    .line 25
    :goto_0
    if-eqz v1, :cond_5

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->K0()Lcom/google/android/gms/measurement/internal/u6;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/G;->b:Lcom/google/android/gms/measurement/internal/E;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/E;->l()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/u6;->Z(Landroid/os/Bundle;Z)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2}, Lj9/w;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    move-object v2, v3

    .line 51
    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/measurement/b;

    .line 52
    .line 53
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/G;->d:J

    .line 54
    .line 55
    invoke-direct {v3, v2, v4, v5, v0}, Lcom/google/android/gms/internal/measurement/b;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/e0;->b(Lcom/google/android/gms/internal/measurement/b;)Z

    .line 59
    .line 60
    .line 61
    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/D0; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/e0;->c()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v3, "EES edited event"

    .line 85
    .line 86
    invoke-virtual {v2, v3, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->K0()Lcom/google/android/gms/measurement/internal/u6;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/e0;->e()Lcom/google/android/gms/internal/measurement/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c;->c()Lcom/google/android/gms/internal/measurement/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/u6;->m(Lcom/google/android/gms/internal/measurement/b;)Lcom/google/android/gms/measurement/internal/G;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/z3;->M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/z3;->M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/e0;->d()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/e0;->e()Lcom/google/android/gms/internal/measurement/c;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c;->f()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b;->b()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    const-string v4, "EES logging created event"

    .line 157
    .line 158
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->K0()Lcom/google/android/gms/measurement/internal/u6;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/u6;->m(Lcom/google/android/gms/internal/measurement/b;)Lcom/google/android/gms/measurement/internal/G;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/measurement/internal/z3;->M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    return-void

    .line 174
    :catch_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/B6;->b:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 187
    .line 188
    const-string v3, "EES error. appId, eventName"

    .line 189
    .line 190
    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 204
    .line 205
    const-string v2, "EES was not applied to event"

    .line 206
    .line 207
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/z3;->M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->w()Lcom/google/android/gms/measurement/internal/o2;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 225
    .line 226
    const-string v2, "EES not loaded for"

    .line 227
    .line 228
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/z3;->M3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method final Q3(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)Lcom/google/android/gms/measurement/internal/G;
    .locals 6

    .line 1
    const-string p2, "_cmp"

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/G;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/G;->b:Lcom/google/android/gms/measurement/internal/E;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/E;->i()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p2, "_cis"

    .line 23
    .line 24
    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/E;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "referrer broadcast"

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "referrer API"

    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->u()Lcom/google/android/gms/measurement/internal/o2;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/G;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Event has been filtered "

    .line 59
    .line 60
    invoke-virtual {p2, v1, v0}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/google/android/gms/measurement/internal/G;

    .line 64
    .line 65
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/G;->c:Ljava/lang/String;

    .line 66
    .line 67
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/G;->d:J

    .line 68
    .line 69
    const-string v1, "_cmpx"

    .line 70
    .line 71
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/G;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/E;Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final R1(Lcom/google/android/gms/measurement/internal/G;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    new-instance p3, Lcom/google/android/gms/measurement/internal/n3;

    .line 12
    .line 13
    invoke-direct {p3, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/n3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/G;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p3}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method final R3(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/T2;->p()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/T2;->t(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final W2(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/measurement/internal/Z2;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/Z2;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final a2(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/measurement/internal/b3;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v5, p1

    .line 5
    move-object v4, p3

    .line 6
    move-object v2, p4

    .line 7
    move-object v3, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/b3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b2(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/measurement/internal/j3;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/j3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method final e(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/T2;->p()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/T2;->v(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final e3(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/measurement/internal/a3;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/a3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method final synthetic h(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->E()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/q6;->P0(Lcom/google/android/gms/measurement/internal/B6;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j3(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/B6;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p4, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p4, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lcom/google/android/gms/measurement/internal/e3;

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, p1, p2}, Lcom/google/android/gms/measurement/internal/e3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/google/android/gms/measurement/internal/x6;

    .line 55
    .line 56
    if-nez p3, :cond_1

    .line 57
    .line 58
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/x6;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/z6;->N(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception p1

    .line 68
    goto :goto_2

    .line 69
    :catch_1
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :goto_1
    new-instance v1, Lcom/google/android/gms/measurement/internal/v6;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/v6;-><init>(Lcom/google/android/gms/measurement/internal/x6;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object p2

    .line 81
    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p3, p4, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    const-string p4, "Failed to query user properties. appId"

    .line 98
    .line 99
    invoke-virtual {p2, p4, p3, p1}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 103
    .line 104
    return-object p1
.end method

.method public final l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->O3(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/google/android/gms/measurement/internal/h3;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/h3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception p1

    .line 30
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string p3, "Failed to get conditional user properties as"

    .line 41
    .line 42
    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 46
    .line 47
    return-object p1
.end method

.method public final p3(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/B6;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p3, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p3}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/android/gms/measurement/internal/g3;

    .line 17
    .line 18
    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/measurement/internal/g3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception p1

    .line 35
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "Failed to get conditional user properties"

    .line 46
    .line 47
    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 51
    .line 52
    return-object p1
.end method

.method public final t2(Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;Lj9/g;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v6, v0

    .line 12
    check-cast v6, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lcom/google/android/gms/measurement/internal/t3;

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v4, p2

    .line 25
    move-object v5, p3

    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/t3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;Lj9/g;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->t(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final u0(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LR8/p;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->s:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/measurement/internal/y3;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/y3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->e(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final w0(Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;)Ljava/util/List;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->B0()Lcom/google/android/gms/measurement/internal/m;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    sget-object v3, Lcom/google/android/gms/measurement/internal/d2;->Z0:Lcom/google/android/gms/measurement/internal/c2;

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/m;->H(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/c2;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-string v2, "Failed to get trigger URIs. appId"

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lcom/google/android/gms/measurement/internal/q3;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/q3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 41
    .line 42
    const-wide/16 v3, 0x2710

    .line 43
    .line 44
    invoke-interface {p2, v3, v4, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    return-object p2

    .line 51
    :catch_0
    move-exception p2

    .line 52
    goto :goto_0

    .line 53
    :catch_1
    move-exception p2

    .line 54
    goto :goto_0

    .line 55
    :catch_2
    move-exception p2

    .line 56
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, v2, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->b()Lcom/google/android/gms/measurement/internal/T2;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Lcom/google/android/gms/measurement/internal/r3;

    .line 85
    .line 86
    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/r3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/T2;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :try_start_1
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3

    .line 98
    .line 99
    return-object p2

    .line 100
    :catch_3
    move-exception p2

    .line 101
    goto :goto_1

    .line 102
    :catch_4
    move-exception p2

    .line 103
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q6;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/B6;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/q2;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, v2, p1, p2}, Lcom/google/android/gms/measurement/internal/o2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 123
    .line 124
    return-object p1
.end method

.method public final w1(Lcom/google/android/gms/measurement/internal/B6;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/q6;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/q6;->p0(Lcom/google/android/gms/measurement/internal/B6;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final x0(Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/measurement/internal/m3;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/m3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/G;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final y0(Lcom/google/android/gms/measurement/internal/B6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/z3;->N3(Lcom/google/android/gms/measurement/internal/B6;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/measurement/internal/i3;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/i3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/z3;->R3(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
