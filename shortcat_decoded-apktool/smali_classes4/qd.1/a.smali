.class public abstract Lqd/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lrd/d;Lrd/a;Z)Z
    .locals 3

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "asset"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lrd/a;->j()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p2}, Lqd/a;->g(Ljava/lang/String;)Lrd/a;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-virtual {p2}, Lrd/a;->i()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    new-instance p2, Lrd/c;

    .line 28
    .line 29
    invoke-virtual {p1}, Lrd/d;->d()Ljava/util/UUID;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {p2, v2, v0, v1}, Lrd/c;-><init>(Ljava/util/UUID;J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lqd/a;->f(Lrd/c;)V

    .line 37
    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lrd/d;->d()Ljava/util/UUID;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, v0, v1, p1}, Lqd/a;->m(JLjava/util/UUID;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 p1, 0x1

    .line 49
    return p1
.end method

.method protected abstract b()V
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqd/a;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lqd/a;->o()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lqd/a;->p()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lqd/a;->n()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lqd/a;->j()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lqd/a;->b()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method protected abstract d(Lrd/a;)J
.end method

.method public e(Ljava/util/List;Lrd/d;)V
    .locals 5

    .line 1
    const-string v0, "assets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "update"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lrd/a;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lqd/a;->d(Lrd/a;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    new-instance v3, Lrd/c;

    .line 32
    .line 33
    invoke-virtual {p2}, Lrd/d;->d()Ljava/util/UUID;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v3, v4, v1, v2}, Lrd/c;-><init>(Ljava/util/UUID;J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lqd/a;->f(Lrd/c;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lrd/a;->t()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2}, Lrd/d;->d()Ljava/util/UUID;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v1, v2, v0}, Lqd/a;->m(JLjava/util/UUID;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method protected abstract f(Lrd/c;)V
.end method

.method public final g(Ljava/lang/String;)Lrd/a;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lqd/a;->h(Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lrd/a;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lrd/a;->m()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v1, LDd/a;->a:LDd/a;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, LDd/a;->g(Ljava/lang/String;)LDd/a$a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LDd/a$a;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, LDd/a$a;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, LDd/a$a;->c()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v1}, Lrd/a;->v(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lrd/a;->H(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lrd/a;->G(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-object p1
.end method

.method protected abstract h(Ljava/lang/String;)Ljava/util/List;
.end method

.method public abstract i(Ljava/util/UUID;)Ljava/util/List;
.end method

.method protected abstract j()Ljava/util/List;
.end method

.method protected abstract k()V
.end method

.method public final l(Lrd/a;Lrd/a;)V
    .locals 4

    .line 1
    const-string v0, "existingEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lrd/a;->s()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lrd/a;->s()Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p2}, Lrd/a;->s()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lrd/a;->s()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p2}, Lrd/a;->s()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Lrd/a;->K(Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_0
    invoke-virtual {p2}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    :cond_2
    invoke-virtual {p2}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lrd/a;->x(Lorg/json/JSONObject;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move v1, v0

    .line 79
    :goto_1
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lqd/a;->q(Lrd/a;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p2}, Lrd/a;->t()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1, v0}, Lrd/a;->C(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lrd/a;->b()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Lrd/a;->v(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    invoke-virtual {p2}, Lrd/a;->n()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lrd/a;->G(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {p2}, Lrd/a;->o()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lrd/a;->H(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    invoke-virtual {p2}, Lrd/a;->p()Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p1, v0}, Lrd/a;->I(Ljava/lang/Float;)V

    .line 133
    .line 134
    .line 135
    :cond_8
    invoke-virtual {p2}, Lrd/a;->q()[Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-eqz p2, :cond_9

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Lrd/a;->J([Ljava/lang/Float;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    return-void
.end method

.method protected abstract m(JLjava/util/UUID;)V
.end method

.method protected abstract n()V
.end method

.method protected abstract o()V
.end method

.method protected abstract p()V
.end method

.method public abstract q(Lrd/a;)V
.end method
