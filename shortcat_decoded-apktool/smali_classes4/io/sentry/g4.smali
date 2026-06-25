.class public final Lio/sentry/g4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/z3;


# direct methods
.method public constructor <init>(Lio/sentry/z3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "options are required"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lio/sentry/z3;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 13
    .line 14
    return-void
.end method

.method private b(Ljava/lang/Double;Ljava/lang/Double;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    cmpg-double p1, v0, p1

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method


# virtual methods
.method public a(Lio/sentry/D1;)Lio/sentry/h4;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lio/sentry/D1;->a()Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lio/sentry/D1;->b()Lio/sentry/i4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/T3;->l()Lio/sentry/h4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lio/sentry/util/A;->a(Lio/sentry/h4;)Lio/sentry/h4;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 21
    .line 22
    invoke-virtual {v0}, Lio/sentry/z3;->getProfilesSampler()Lio/sentry/z3$l;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/z3;->getProfilesSampleRate()Ljava/lang/Double;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v5, v3}, Lio/sentry/g4;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget-object v0, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 47
    .line 48
    invoke-virtual {v0}, Lio/sentry/z3;->getTracesSampler()Lio/sentry/z3$o;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lio/sentry/D1;->b()Lio/sentry/i4;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lio/sentry/i4;->z()Lio/sentry/h4;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, Lio/sentry/util/A;->a(Lio/sentry/h4;)Lio/sentry/h4;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_2
    iget-object p1, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 67
    .line 68
    invoke-virtual {p1}, Lio/sentry/z3;->getTracesSampleRate()Ljava/lang/Double;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v0, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 73
    .line 74
    invoke-virtual {v0}, Lio/sentry/z3;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Lio/sentry/backpressure/b;->a()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    int-to-double v0, v0

    .line 83
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 84
    .line 85
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    if-nez p1, :cond_3

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    :goto_1
    move-object v2, p1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    div-double/2addr v6, v0

    .line 99
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    goto :goto_1

    .line 104
    :goto_2
    if-eqz v2, :cond_4

    .line 105
    .line 106
    new-instance v0, Lio/sentry/h4;

    .line 107
    .line 108
    invoke-direct {p0, v2, v3}, Lio/sentry/g4;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct/range {v0 .. v5}, Lio/sentry/h4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_4
    new-instance v0, Lio/sentry/h4;

    .line 121
    .line 122
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    move-object v4, v1

    .line 127
    invoke-direct/range {v0 .. v5}, Lio/sentry/h4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method

.method public c(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/g4;->a:Lio/sentry/z3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/z3;->getProfileSessionSampleRate()Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, v0, p1}, Lio/sentry/g4;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method
