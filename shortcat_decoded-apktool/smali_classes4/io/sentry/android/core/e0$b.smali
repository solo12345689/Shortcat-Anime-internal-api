.class final Lio/sentry/android/core/e0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/core/e0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/android/core/e0;


# direct methods
.method private constructor <init>(Lio/sentry/android/core/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/core/e0$b;->a:Lio/sentry/android/core/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/android/core/e0;Lio/sentry/android/core/e0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lio/sentry/android/core/e0$b;-><init>(Lio/sentry/android/core/e0;)V

    return-void
.end method

.method private d(Ljava/util/List;)Lio/sentry/protocol/D;
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lio/sentry/protocol/D;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/protocol/D;->m()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v2, "main"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method private e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lio/sentry/hints/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lio/sentry/hints/a;

    .line 6
    .line 7
    invoke-interface {p1}, Lio/sentry/hints/a;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "anr_background"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private f(Lio/sentry/V2;Lio/sentry/hints/c;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lio/sentry/V2;->p0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lio/sentry/protocol/l;

    .line 9
    .line 10
    invoke-direct {v0}, Lio/sentry/protocol/l;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Lio/sentry/hints/c;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    const-string p2, "HistoricalAppExitInfo"

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lio/sentry/protocol/l;->r(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string p2, "AppExitInfo"

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Lio/sentry/protocol/l;->r(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    const-string p2, "ANR"

    .line 31
    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    new-instance p3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "Background "

    .line 40
    .line 41
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :cond_2
    new-instance p3, Lio/sentry/android/core/ApplicationNotResponding;

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {p3, p2, v1}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lio/sentry/V2;->u0()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p0, p2}, Lio/sentry/android/core/e0$b;->d(Ljava/util/List;)Lio/sentry/protocol/D;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-nez p2, :cond_3

    .line 69
    .line 70
    new-instance p2, Lio/sentry/protocol/D;

    .line 71
    .line 72
    invoke-direct {p2}, Lio/sentry/protocol/D;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lio/sentry/protocol/C;

    .line 76
    .line 77
    invoke-direct {v1}, Lio/sentry/protocol/C;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, Lio/sentry/protocol/D;->y(Lio/sentry/protocol/C;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v1, p0, Lio/sentry/android/core/e0$b;->a:Lio/sentry/android/core/e0;

    .line 84
    .line 85
    invoke-static {v1}, Lio/sentry/android/core/e0;->e(Lio/sentry/android/core/e0;)Lio/sentry/W2;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1, p2, v0, p3}, Lio/sentry/W2;->f(Lio/sentry/protocol/D;Lio/sentry/protocol/l;Ljava/lang/Throwable;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Lio/sentry/V2;->A0(Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private g(Lio/sentry/j2;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lio/sentry/protocol/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lio/sentry/protocol/a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, v0}, Lio/sentry/protocol/c;->o(Lio/sentry/protocol/a;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lio/sentry/protocol/a;->l()Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lio/sentry/protocol/a;->r(Ljava/lang/Boolean;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method private h(Lio/sentry/V2;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lio/sentry/V2;->q0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string p2, "background-anr"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p2, "foreground-anr"

    .line 13
    .line 14
    :goto_0
    const-string v0, "{{ default }}"

    .line 15
    .line 16
    filled-new-array {v0, p2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lio/sentry/V2;->B0(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/V2;Lio/sentry/hints/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0, p3}, Lio/sentry/android/core/e0$b;->e(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    iget-object v0, p0, Lio/sentry/android/core/e0$b;->a:Lio/sentry/android/core/e0;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lio/sentry/android/core/e0;->d(Lio/sentry/android/core/e0;Lio/sentry/j2;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/android/core/e0$b;->f(Lio/sentry/V2;Lio/sentry/hints/c;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lio/sentry/hints/a;

    .line 2
    .line 3
    return p1
.end method

.method public c(Lio/sentry/V2;Lio/sentry/hints/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lio/sentry/android/core/e0$b;->e(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    xor-int/lit8 p3, p2, 0x1

    .line 6
    .line 7
    invoke-direct {p0, p1, p3}, Lio/sentry/android/core/e0$b;->g(Lio/sentry/j2;Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lio/sentry/android/core/e0$b;->h(Lio/sentry/V2;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
