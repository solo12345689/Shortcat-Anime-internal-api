.class public final Lio/sentry/react/t;
.super Lio/sentry/android/replay/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/replay/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    const/4 v3, 0x3

    .line 28
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    if-ltz v2, :cond_9

    .line 33
    .line 34
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    instance-of v4, v3, Ljava/util/Map;

    .line 39
    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    check-cast v3, Ljava/util/Map;

    .line 44
    .line 45
    const-string v4, "name"

    .line 46
    .line 47
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "label"

    .line 52
    .line 53
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    instance-of v6, v4, Ljava/lang/String;

    .line 58
    .line 59
    instance-of v7, v5, Ljava/lang/String;

    .line 60
    .line 61
    if-nez v6, :cond_3

    .line 62
    .line 63
    if-nez v7, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    if-eqz v7, :cond_4

    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :goto_1
    const-string v4, "element"

    .line 76
    .line 77
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const-string v5, "file"

    .line 82
    .line 83
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    instance-of v5, v4, Ljava/lang/String;

    .line 88
    .line 89
    instance-of v6, v3, Ljava/lang/String;

    .line 90
    .line 91
    const/16 v7, 0x29

    .line 92
    .line 93
    const/16 v8, 0x28

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    if-eqz v6, :cond_5

    .line 98
    .line 99
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v4, ", "

    .line 106
    .line 107
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    if-eqz v5, :cond_6

    .line 118
    .line 119
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    if-eqz v6, :cond_7

    .line 130
    .line 131
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :cond_7
    :goto_2
    if-lez v2, :cond_8

    .line 141
    .line 142
    const-string v3, " > "

    .line 143
    .line 144
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_8
    add-int/lit8 v2, v2, -0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method

.method private j(Lio/sentry/rrweb/a;Lio/sentry/e;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lio/sentry/e;->u()Lio/sentry/i3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lio/sentry/rrweb/a;->w(Lio/sentry/i3;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lio/sentry/rrweb/a;->u(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p1, v0, v1}, Lio/sentry/rrweb/b;->f(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    long-to-double v0, v0

    .line 35
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    div-double/2addr v0, v2

    .line 41
    invoke-virtual {p1, v0, v1}, Lio/sentry/rrweb/a;->r(D)V

    .line 42
    .line 43
    .line 44
    const-string p2, "default"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lio/sentry/rrweb/a;->s(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const-string v0, "sentry.event"

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_7

    .line 20
    .line 21
    const-string v0, "sentry.transaction"

    .line 22
    .line 23
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "http"

    .line 35
    .line 36
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2
    const-string v0, "touch"

    .line 48
    .line 49
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lio/sentry/react/t;->h(Lio/sentry/e;)Lio/sentry/rrweb/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "navigation"

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lio/sentry/react/t;->f(Lio/sentry/e;)Lio/sentry/rrweb/b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_4
    const-string v0, "xhr"

    .line 82
    .line 83
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lio/sentry/react/t;->g(Lio/sentry/e;)Lio/sentry/rrweb/b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_5
    invoke-super {p0, p1}, Lio/sentry/android/replay/a;->a(Lio/sentry/e;)Lio/sentry/rrweb/b;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    instance-of v0, p1, Lio/sentry/rrweb/a;

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    move-object v0, p1

    .line 107
    check-cast v0, Lio/sentry/rrweb/a;

    .line 108
    .line 109
    invoke-virtual {v0}, Lio/sentry/rrweb/a;->n()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_6
    return-object p1

    .line 121
    :cond_7
    :goto_0
    return-object v1
.end method

.method public f(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/rrweb/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/rrweb/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lio/sentry/rrweb/a;->t(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lio/sentry/react/t;->j(Lio/sentry/rrweb/a;Lio/sentry/e;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public g(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 9

    .line 1
    const-string v0, "start_timestamp"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Ljava/lang/Number;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Double;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    const-string v1, "end_timestamp"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v3, v3, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Double;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v1, v2

    .line 38
    :goto_1
    const-string v3, "url"

    .line 39
    .line 40
    invoke-virtual {p1, v3}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    instance-of v4, v4, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v2

    .line 56
    :goto_2
    if-eqz v0, :cond_8

    .line 57
    .line 58
    if-eqz v1, :cond_8

    .line 59
    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v4, "method"

    .line 70
    .line 71
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    instance-of v5, v5, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_4
    const-string v4, "status_code"

    .line 87
    .line 88
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    instance-of v5, v5, Ljava/lang/Double;

    .line 93
    .line 94
    if-eqz v5, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/Double;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    const-wide/16 v7, 0x0

    .line 107
    .line 108
    cmpl-double v5, v5, v7

    .line 109
    .line 110
    if-lez v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Double;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-string v5, "statusCode"

    .line 121
    .line 122
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_5
    const-string v4, "request_body_size"

    .line 126
    .line 127
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    instance-of v5, v5, Ljava/lang/Double;

    .line 132
    .line 133
    if-eqz v5, :cond_6

    .line 134
    .line 135
    const-string v5, "requestBodySize"

    .line 136
    .line 137
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_6
    const-string v4, "response_body_size"

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    instance-of v5, v5, Ljava/lang/Double;

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    const-string v5, "responseBodySize"

    .line 155
    .line 156
    invoke-virtual {p1, v4}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {v2, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_7
    new-instance p1, Lio/sentry/rrweb/i;

    .line 164
    .line 165
    invoke-direct {p1}, Lio/sentry/rrweb/i;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v4, "resource.http"

    .line 169
    .line 170
    invoke-virtual {p1, v4}, Lio/sentry/rrweb/i;->s(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    div-double/2addr v4, v6

    .line 183
    invoke-virtual {p1, v4, v5}, Lio/sentry/rrweb/i;->u(D)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    div-double/2addr v0, v6

    .line 191
    invoke-virtual {p1, v0, v1}, Lio/sentry/rrweb/i;->r(D)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v3}, Lio/sentry/rrweb/i;->q(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v2}, Lio/sentry/rrweb/i;->o(Ljava/util/Map;)V

    .line 198
    .line 199
    .line 200
    return-object p1

    .line 201
    :cond_8
    :goto_3
    return-object v2
.end method

.method public h(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/rrweb/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/rrweb/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ui.tap"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/sentry/rrweb/a;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "path"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lio/sentry/e;->s(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lio/sentry/react/t;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lio/sentry/rrweb/a;->x(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, p1}, Lio/sentry/react/t;->j(Lio/sentry/rrweb/a;Lio/sentry/e;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
