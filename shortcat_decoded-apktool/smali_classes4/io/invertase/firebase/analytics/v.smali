.class public Lio/invertase/firebase/analytics/v;
.super Lio/invertase/firebase/common/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/common/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->q(Landroid/os/Bundle;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->r(Landroid/os/Bundle;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lio/invertase/firebase/analytics/v;Ljava/lang/Boolean;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->p(Ljava/lang/Boolean;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lio/invertase/firebase/analytics/v;J)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->s(J)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lio/invertase/firebase/analytics/v;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->t(Ljava/lang/String;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->u(Landroid/os/Bundle;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lio/invertase/firebase/analytics/v;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/invertase/firebase/analytics/v;->o()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->n(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private synthetic n(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->c(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private synthetic o()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->d()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method private synthetic p(Ljava/lang/Boolean;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->e(Z)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method private synthetic q(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 5

    .line 1
    const-string v0, "analytics_storage"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "ad_storage"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "ad_user_data"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "ad_personalization"

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    new-instance v3, Ljava/util/EnumMap;

    .line 26
    .line 27
    const-class v4, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 40
    .line 41
    :goto_0
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 52
    .line 53
    :goto_1
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->c:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 64
    .line 65
    :goto_2
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->d:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    .line 76
    .line 77
    :goto_3
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics;->f(Ljava/util/Map;)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1
.end method

.method private synthetic r(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->g(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private synthetic s(J)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->h(J)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private synthetic t(Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->i(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private synthetic u(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method private synthetic v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method


# virtual methods
.method A(Landroid/os/Bundle;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/t;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/t;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method B(J)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/u;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/u;-><init>(Lio/invertase/firebase/analytics/v;J)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method C(Ljava/lang/String;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/q;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method D(Landroid/os/Bundle;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/m;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/m;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method E(Ljava/lang/String;Ljava/lang/String;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/s;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/s;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method l()Ln9/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->a()Ln9/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method m()Ln9/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->b()Ln9/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method w(Ljava/lang/String;Landroid/os/Bundle;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/r;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/r;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method x()Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/invertase/firebase/analytics/n;-><init>(Lio/invertase/firebase/analytics/v;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method y(Ljava/lang/Boolean;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/p;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method z(Landroid/os/Bundle;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/o;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ln9/l;->c(Ljava/util/concurrent/Callable;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
