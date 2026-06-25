.class final Lio/sentry/transport/e$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/transport/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Lio/sentry/q2;

.field private final b:Lio/sentry/H;

.field private final c:Lio/sentry/cache/g;

.field private final d:Lio/sentry/transport/B;

.field final synthetic e:Lio/sentry/transport/e;


# direct methods
.method constructor <init>(Lio/sentry/transport/e;Lio/sentry/q2;Lio/sentry/H;Lio/sentry/cache/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/sentry/transport/B;->a()Lio/sentry/transport/B;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lio/sentry/transport/e$c;->d:Lio/sentry/transport/B;

    .line 11
    .line 12
    const-string p1, "Envelope is required."

    .line 13
    .line 14
    invoke-static {p2, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lio/sentry/q2;

    .line 19
    .line 20
    iput-object p1, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 21
    .line 22
    iput-object p3, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 23
    .line 24
    const-string p1, "EnvelopeCache is required."

    .line 25
    .line 26
    invoke-static {p4, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lio/sentry/cache/g;

    .line 31
    .line 32
    iput-object p1, p0, Lio/sentry/transport/e$c;->c:Lio/sentry/cache/g;

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic a(Lio/sentry/transport/e$c;Lio/sentry/transport/B;Lio/sentry/hints/q;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 2
    .line 3
    invoke-static {p0}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/transport/B;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "Marking envelope submission result: %s"

    .line 26
    .line 27
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/transport/B;->d()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-interface {p2, p0}, Lio/sentry/hints/q;->c(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic b(Lio/sentry/transport/e$c;Lio/sentry/hints/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/q2;->b()Lio/sentry/r2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/r2;->a()Lio/sentry/protocol/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Lio/sentry/hints/f;->c(Lio/sentry/protocol/x;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lio/sentry/hints/f;->e()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 22
    .line 23
    invoke-static {p0}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 32
    .line 33
    const-string v0, "Disk flush envelope fired"

    .line 34
    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object p0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 42
    .line 43
    invoke-static {p0}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object p1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 52
    .line 53
    const-string v0, "Not firing envelope flush as there\'s an ongoing transaction"

    .line 54
    .line 55
    new-array v1, v1, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static synthetic c(Lio/sentry/hints/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Lio/sentry/hints/l;->d(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic d(Lio/sentry/transport/e$c;ZLio/sentry/q2;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 4
    .line 5
    invoke-static {p1}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p4, p3, p1}, Lio/sentry/util/t;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 17
    .line 18
    invoke-static {p0}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, Lio/sentry/clientreport/f;->NETWORK_ERROR:Lio/sentry/clientreport/f;

    .line 27
    .line 28
    invoke-interface {p0, p1, p2}, Lio/sentry/clientreport/h;->b(Lio/sentry/clientreport/f;Lio/sentry/q2;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic e(Lio/sentry/hints/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Lio/sentry/hints/l;->d(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic f(Lio/sentry/transport/e$c;ZLjava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 4
    .line 5
    invoke-static {p1}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p3, p2, p1}, Lio/sentry/util/t;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 17
    .line 18
    invoke-static {p1}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object p2, Lio/sentry/clientreport/f;->NETWORK_ERROR:Lio/sentry/clientreport/f;

    .line 27
    .line 28
    iget-object p0, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 29
    .line 30
    invoke-interface {p1, p2, p0}, Lio/sentry/clientreport/h;->b(Lio/sentry/clientreport/f;Lio/sentry/q2;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method static synthetic g(Lio/sentry/transport/e$c;)Lio/sentry/H;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(Lio/sentry/transport/e$c;)Lio/sentry/q2;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 2
    .line 3
    return-object p0
.end method

.method private i()Lio/sentry/transport/B;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/transport/e$c;->d:Lio/sentry/transport/B;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 4
    .line 5
    invoke-virtual {v1}, Lio/sentry/q2;->b()Lio/sentry/r2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lio/sentry/r2;->d(Ljava/util/Date;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lio/sentry/transport/e$c;->c:Lio/sentry/cache/g;

    .line 14
    .line 15
    iget-object v2, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 16
    .line 17
    iget-object v3, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 18
    .line 19
    invoke-interface {v1, v2, v3}, Lio/sentry/cache/g;->q1(Lio/sentry/q2;Lio/sentry/H;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 24
    .line 25
    new-instance v3, Lio/sentry/transport/g;

    .line 26
    .line 27
    invoke-direct {v3, p0}, Lio/sentry/transport/g;-><init>(Lio/sentry/transport/e$c;)V

    .line 28
    .line 29
    .line 30
    const-class v4, Lio/sentry/hints/f;

    .line 31
    .line 32
    invoke-static {v2, v4, v3}, Lio/sentry/util/l;->h(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 36
    .line 37
    invoke-static {v2}, Lio/sentry/transport/e;->l(Lio/sentry/transport/e;)Lio/sentry/transport/q;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2}, Lio/sentry/transport/q;->A()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const-class v3, Lio/sentry/hints/l;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 50
    .line 51
    invoke-static {v0}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 60
    .line 61
    invoke-interface {v0, v2}, Lio/sentry/clientreport/h;->e(Lio/sentry/q2;)Lio/sentry/q2;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :try_start_0
    iget-object v2, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 66
    .line 67
    invoke-static {v2}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Lio/sentry/z3;->getDateProvider()Lio/sentry/p2;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v2}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0}, Lio/sentry/q2;->b()Lio/sentry/r2;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v2}, Lio/sentry/o2;->m()J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    invoke-static {v5, v6}, Lio/sentry/l;->k(J)Ljava/util/Date;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v4, v2}, Lio/sentry/r2;->d(Ljava/util/Date;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 95
    .line 96
    invoke-static {v2}, Lio/sentry/transport/e;->m(Lio/sentry/transport/e;)Lio/sentry/transport/n;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2, v0}, Lio/sentry/transport/n;->h(Lio/sentry/q2;)Lio/sentry/transport/B;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Lio/sentry/transport/B;->d()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_0

    .line 109
    .line 110
    iget-object v4, p0, Lio/sentry/transport/e$c;->c:Lio/sentry/cache/g;

    .line 111
    .line 112
    iget-object v5, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 113
    .line 114
    invoke-interface {v4, v5}, Lio/sentry/cache/g;->O(Lio/sentry/q2;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :catch_0
    move-exception v2

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v5, "The transport failed to send the envelope with response code "

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Lio/sentry/transport/B;->c()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iget-object v5, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 142
    .line 143
    invoke-static {v5}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    sget-object v6, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    new-array v7, v7, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-interface {v5, v6, v4, v7}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Lio/sentry/transport/B;->c()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    const/16 v6, 0x190

    .line 164
    .line 165
    if-lt v5, v6, :cond_1

    .line 166
    .line 167
    iget-object v5, p0, Lio/sentry/transport/e$c;->c:Lio/sentry/cache/g;

    .line 168
    .line 169
    iget-object v6, p0, Lio/sentry/transport/e$c;->a:Lio/sentry/q2;

    .line 170
    .line 171
    invoke-interface {v5, v6}, Lio/sentry/cache/g;->O(Lio/sentry/q2;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lio/sentry/transport/B;->c()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/16 v5, 0x1ad

    .line 179
    .line 180
    if-eq v2, v5, :cond_1

    .line 181
    .line 182
    iget-object v2, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 183
    .line 184
    invoke-static {v2}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2}, Lio/sentry/z3;->getClientReportRecorder()Lio/sentry/clientreport/h;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    sget-object v5, Lio/sentry/clientreport/f;->NETWORK_ERROR:Lio/sentry/clientreport/f;

    .line 193
    .line 194
    invoke-interface {v2, v5, v0}, Lio/sentry/clientreport/h;->b(Lio/sentry/clientreport/f;Lio/sentry/q2;)V

    .line 195
    .line 196
    .line 197
    :cond_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :goto_0
    iget-object v4, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 204
    .line 205
    new-instance v5, Lio/sentry/transport/h;

    .line 206
    .line 207
    invoke-direct {v5}, Lio/sentry/transport/h;-><init>()V

    .line 208
    .line 209
    .line 210
    new-instance v6, Lio/sentry/transport/i;

    .line 211
    .line 212
    invoke-direct {v6, p0, v1, v0}, Lio/sentry/transport/i;-><init>(Lio/sentry/transport/e$c;ZLio/sentry/q2;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v4, v3, v5, v6}, Lio/sentry/util/l;->i(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;Lio/sentry/util/l$b;)V

    .line 216
    .line 217
    .line 218
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 219
    .line 220
    const-string v1, "Sending the event failed."

    .line 221
    .line 222
    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw v0

    .line 226
    :cond_2
    iget-object v2, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 227
    .line 228
    new-instance v4, Lio/sentry/transport/j;

    .line 229
    .line 230
    invoke-direct {v4}, Lio/sentry/transport/j;-><init>()V

    .line 231
    .line 232
    .line 233
    new-instance v5, Lio/sentry/transport/k;

    .line 234
    .line 235
    invoke-direct {v5, p0, v1}, Lio/sentry/transport/k;-><init>(Lio/sentry/transport/e$c;Z)V

    .line 236
    .line 237
    .line 238
    invoke-static {v2, v3, v4, v5}, Lio/sentry/util/l;->i(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;Lio/sentry/util/l$b;)V

    .line 239
    .line 240
    .line 241
    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    const-class v0, Lio/sentry/hints/q;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 4
    .line 5
    invoke-static {v1, p0}, Lio/sentry/transport/e;->j(Lio/sentry/transport/e;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/transport/e$c;->d:Lio/sentry/transport/B;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    invoke-direct {p0}, Lio/sentry/transport/e$c;->i()Lio/sentry/transport/B;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v4, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 17
    .line 18
    invoke-static {v4}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    sget-object v5, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 27
    .line 28
    const-string v6, "Envelope flushed"

    .line 29
    .line 30
    new-array v7, v3, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {v4, v5, v6, v7}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 36
    .line 37
    new-instance v4, Lio/sentry/transport/f;

    .line 38
    .line 39
    invoke-direct {v4, p0, v1}, Lio/sentry/transport/f;-><init>(Lio/sentry/transport/e$c;Lio/sentry/transport/B;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v0, v4}, Lio/sentry/util/l;->h(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 46
    .line 47
    invoke-static {v0, v2}, Lio/sentry/transport/e;->j(Lio/sentry/transport/e;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v4

    .line 52
    :try_start_1
    iget-object v5, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 53
    .line 54
    invoke-static {v5}, Lio/sentry/transport/e;->k(Lio/sentry/transport/e;)Lio/sentry/z3;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 63
    .line 64
    const-string v7, "Envelope submission failed"

    .line 65
    .line 66
    new-array v3, v3, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {v5, v6, v4, v7, v3}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :catchall_1
    move-exception v3

    .line 73
    iget-object v4, p0, Lio/sentry/transport/e$c;->b:Lio/sentry/H;

    .line 74
    .line 75
    new-instance v5, Lio/sentry/transport/f;

    .line 76
    .line 77
    invoke-direct {v5, p0, v1}, Lio/sentry/transport/f;-><init>(Lio/sentry/transport/e$c;Lio/sentry/transport/B;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v0, v5}, Lio/sentry/util/l;->h(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lio/sentry/transport/e$c;->e:Lio/sentry/transport/e;

    .line 84
    .line 85
    invoke-static {v0, v2}, Lio/sentry/transport/e;->j(Lio/sentry/transport/e;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 86
    .line 87
    .line 88
    throw v3
.end method
