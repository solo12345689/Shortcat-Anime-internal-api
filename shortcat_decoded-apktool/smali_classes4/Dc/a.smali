.class public LDc/a;
.super LPc/e$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private b:LDc/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LPc/e$b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LDc/e;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LDc/e;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LDc/a;->b:LDc/e;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected A(Lqb/b;)Z
    .locals 2

    .line 1
    const-string v0, "vibrate"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {p1, v0, v1}, Lqb/b;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    xor-int/2addr p1, v1

    .line 9
    return p1
.end method

.method protected p(Lqb/b;)Z
    .locals 2

    .line 1
    const-string v0, "autoDismiss"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {p1, v0, v1}, Lqb/b;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method protected q(Lqb/b;)Ljava/lang/Number;
    .locals 2

    .line 1
    const-string v0, "badge"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lqb/b;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return-object p1
.end method

.method protected r(Lqb/b;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "data"

    .line 3
    .line 4
    invoke-interface {p1, v1}, Lqb/b;->getMap(Ljava/lang/String;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :catch_0
    :cond_0
    return-object v0
.end method

.method protected s(Lqb/b;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "categoryIdentifier"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1}, Lqb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method protected t(Lqb/b;)Ljava/lang/Number;
    .locals 3

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-interface {p1, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object p1

    .line 23
    :cond_0
    return-object v1

    .line 24
    :catch_0
    const-string p1, "expo-notifications"

    .line 25
    .line 26
    const-string v0, "Could not have parsed color passed in notification."

    .line 27
    .line 28
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method protected u(Lqb/b;)LMc/d;
    .locals 1

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LMc/d;->b(Ljava/lang/String;)LMc/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method protected v(Lqb/b;)Landroid/net/Uri;
    .locals 1

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LDc/a;->b:LDc/e;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LDc/e;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method protected w(Lqb/b;)Z
    .locals 2

    .line 1
    const-string v0, "sticky"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1}, Lqb/b;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method protected x(Lqb/b;)[J
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "vibrate"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->a(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [J

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v2, v2, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    aput-wide v2, v0, v1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v0, LHc/f;

    .line 48
    .line 49
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, v1, p1}, LHc/f;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v0
    :try_end_0
    .catch LHc/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :cond_1
    return-object v0

    .line 58
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v1, "Failed to set custom vibration pattern from the notification: "

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v0, "expo-notifications"

    .line 80
    .line 81
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :cond_2
    const/4 p1, 0x0

    .line 85
    return-object p1
.end method

.method public y(Lqb/b;)LPc/e$b;
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, LPc/e$b;->l(Ljava/lang/String;)LPc/e$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "subtitle"

    .line 12
    .line 13
    invoke-interface {p1, v1}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, LPc/e$b;->j(Ljava/lang/String;)LPc/e$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "body"

    .line 22
    .line 23
    invoke-interface {p1, v1}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, LPc/e$b;->k(Ljava/lang/String;)LPc/e$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, p1}, LDc/a;->r(Lqb/b;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, LPc/e$b;->d(Lorg/json/JSONObject;)LPc/e$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, p1}, LDc/a;->u(Lqb/b;)LMc/d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, LPc/e$b;->g(LMc/d;)LPc/e$b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, p1}, LDc/a;->q(Lqb/b;)Ljava/lang/Number;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, LPc/e$b;->c(Ljava/lang/Number;)LPc/e$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1}, LDc/a;->t(Lqb/b;)Ljava/lang/Number;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, LPc/e$b;->f(Ljava/lang/Number;)LPc/e$b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, p1}, LDc/a;->p(Lqb/b;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, LPc/e$b;->b(Z)LPc/e$b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, p1}, LDc/a;->s(Lqb/b;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, LPc/e$b;->e(Ljava/lang/String;)LPc/e$b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, p1}, LDc/a;->w(Lqb/b;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0, v1}, LPc/e$b;->i(Z)LPc/e$b;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, LDc/a;->z(Lqb/b;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-virtual {p0}, LPc/e$b;->n()LPc/e$b;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, LDc/a;->v(Lqb/b;)Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, LPc/e$b;->h(Landroid/net/Uri;)LPc/e$b;

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {p0, p1}, LDc/a;->A(Lqb/b;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {p0}, LPc/e$b;->o()LPc/e$b;

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_1
    invoke-virtual {p0, p1}, LDc/a;->x(Lqb/b;)[J

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p0, p1}, LPc/e$b;->m([J)LPc/e$b;

    .line 118
    .line 119
    .line 120
    return-object p0
.end method

.method protected z(Lqb/b;)Z
    .locals 2

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lqb/b;->getBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, LDc/a;->v(Lqb/b;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return p1
.end method
