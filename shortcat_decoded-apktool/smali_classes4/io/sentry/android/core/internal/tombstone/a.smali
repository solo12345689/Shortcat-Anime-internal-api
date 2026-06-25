.class public Lio/sentry/android/core/internal/tombstone/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/a;->b:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lio/sentry/android/core/internal/tombstone/a;->a:Ljava/io/InputStream;

    .line 12
    .line 13
    const-string p1, "SIGILL"

    .line 14
    .line 15
    const-string v1, "IllegalInstruction"

    .line 16
    .line 17
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string p1, "SIGTRAP"

    .line 21
    .line 22
    const-string v1, "Trap"

    .line 23
    .line 24
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p1, "SIGABRT"

    .line 28
    .line 29
    const-string v1, "Abort"

    .line 30
    .line 31
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const-string p1, "SIGBUS"

    .line 35
    .line 36
    const-string v1, "BusError"

    .line 37
    .line 38
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const-string p1, "SIGFPE"

    .line 42
    .line 43
    const-string v1, "FloatingPointException"

    .line 44
    .line 45
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string p1, "SIGSEGV"

    .line 49
    .line 50
    const-string v1, "Segfault"

    .line 51
    .line 52
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private a(Lio/sentry/android/core/internal/tombstone/m;)Lio/sentry/protocol/m;
    .locals 11

    .line 1
    new-instance v0, Lio/sentry/protocol/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/protocol/m;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->K()Lio/sentry/android/core/internal/tombstone/k;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, " "

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->H()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v2, v3}, LH2/h;->a(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v10

    .line 20
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->N()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->G()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ": "

    .line 47
    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_0
    move-object v4, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const-string v2, ""

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->J()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->K()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->H()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->G()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->J()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    filled-new-array/range {v4 .. v10}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v1, "%sFatal signal %s (%d), %s (%d), pid = %d (%s)"

    .line 97
    .line 98
    invoke-static {v3, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v0, p1}, Lio/sentry/protocol/m;->f(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 107
    .line 108
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->J()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    filled-new-array {p1, v10}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v2, "Fatal exit pid = %d (%s)"

    .line 121
    .line 122
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v0, p1}, Lio/sentry/protocol/m;->f(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v0
.end method

.method private b(Lio/sentry/android/core/internal/tombstone/m;)Lio/sentry/protocol/d;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->I()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lio/sentry/protocol/d;

    .line 21
    .line 22
    invoke-direct {p1}, Lio/sentry/protocol/d;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/protocol/d;->e(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method

.method private g(Lio/sentry/android/core/internal/tombstone/m;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/protocol/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/protocol/s;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->N()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->K()Lio/sentry/android/core/internal/tombstone/k;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->J()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Lio/sentry/protocol/s;->p(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lio/sentry/android/core/internal/tombstone/a;->b:Ljava/util/Map;

    .line 24
    .line 25
    invoke-virtual {v1}, Lio/sentry/android/core/internal/tombstone/k;->J()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lio/sentry/protocol/s;->r(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lio/sentry/android/core/internal/tombstone/a;->h(Lio/sentry/android/core/internal/tombstone/k;)Lio/sentry/protocol/l;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Lio/sentry/protocol/s;->l(Lio/sentry/protocol/l;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->M()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-long v1, p1

    .line 50
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Lio/sentry/protocol/s;->o(Ljava/lang/Long;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Ljava/util/ArrayList;

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-object p1
.end method

.method private static h(Lio/sentry/android/core/internal/tombstone/k;)Lio/sentry/protocol/l;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/protocol/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/protocol/l;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "signalhandler"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/sentry/protocol/l;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/sentry/protocol/l;->n(Ljava/lang/Boolean;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lio/sentry/protocol/l;->q(Ljava/lang/Boolean;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/k;->K()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "number"

    .line 35
    .line 36
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const-string v2, "name"

    .line 40
    .line 41
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/k;->J()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/k;->G()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "code"

    .line 57
    .line 58
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    const-string v2, "code_name"

    .line 62
    .line 63
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/k;->H()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lio/sentry/protocol/l;->o(Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private static j(Lio/sentry/android/core/internal/tombstone/l;)Lio/sentry/protocol/C;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/l;->G()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    new-instance v1, Lio/sentry/protocol/C;

    .line 22
    .line 23
    invoke-direct {v1}, Lio/sentry/protocol/C;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lio/sentry/protocol/C;->f(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lio/sentry/protocol/C$b;->NONE:Lio/sentry/protocol/C$b;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lio/sentry/protocol/C;->g(Lio/sentry/protocol/C$b;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lio/sentry/android/core/internal/tombstone/l;->K()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Lio/sentry/protocol/C;->h(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    throw v3

    .line 65
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Lio/sentry/protocol/B;

    .line 73
    .line 74
    invoke-direct {p0}, Lio/sentry/protocol/B;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v3
.end method

.method private k(Lio/sentry/android/core/internal/tombstone/m;Lio/sentry/protocol/s;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->L()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lio/sentry/android/core/internal/tombstone/l;

    .line 35
    .line 36
    new-instance v4, Lio/sentry/protocol/D;

    .line 37
    .line 38
    invoke-direct {v4}, Lio/sentry/protocol/D;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-long v5, v2

    .line 52
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v4, v2}, Lio/sentry/protocol/D;->u(Ljava/lang/Long;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/l;->J()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v4, v2}, Lio/sentry/protocol/D;->w(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Lio/sentry/android/core/internal/tombstone/a;->j(Lio/sentry/android/core/internal/tombstone/l;)Lio/sentry/protocol/C;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v4, v2}, Lio/sentry/protocol/D;->y(Lio/sentry/protocol/C;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lio/sentry/android/core/internal/tombstone/m;->M()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/l;->I()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v5, v3, :cond_0

    .line 82
    .line 83
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v4, v3}, Lio/sentry/protocol/D;->q(Ljava/lang/Boolean;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v2}, Lio/sentry/protocol/s;->n(Lio/sentry/protocol/C;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/a;->a:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l()Lio/sentry/V2;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/a;->a:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/android/core/internal/tombstone/m;->P(Ljava/io/InputStream;)Lio/sentry/android/core/internal/tombstone/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/sentry/V2;

    .line 8
    .line 9
    invoke-direct {v1}, Lio/sentry/V2;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lio/sentry/i3;->FATAL:Lio/sentry/i3;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lio/sentry/V2;->C0(Lio/sentry/i3;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "native"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lio/sentry/j2;->Y(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/tombstone/a;->a(Lio/sentry/android/core/internal/tombstone/m;)Lio/sentry/protocol/m;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lio/sentry/V2;->D0(Lio/sentry/protocol/m;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/tombstone/a;->b(Lio/sentry/android/core/internal/tombstone/m;)Lio/sentry/protocol/d;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Lio/sentry/j2;->T(Lio/sentry/protocol/d;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/tombstone/a;->g(Lio/sentry/android/core/internal/tombstone/m;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lio/sentry/V2;->A0(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lio/sentry/V2;->p0()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    check-cast v2, Ljava/util/List;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lio/sentry/protocol/s;

    .line 58
    .line 59
    invoke-direct {p0, v0, v2}, Lio/sentry/android/core/internal/tombstone/a;->k(Lio/sentry/android/core/internal/tombstone/m;Lio/sentry/protocol/s;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v1, v0}, Lio/sentry/V2;->F0(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method
