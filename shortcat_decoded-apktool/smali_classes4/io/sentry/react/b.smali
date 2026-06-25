.class public abstract Lio/sentry/react/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lio/sentry/ILogger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/core/z;

    .line 2
    .line 3
    const-string v1, "RNSentry.MapConverter"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/react/b;->a:Lio/sentry/ILogger;

    .line 9
    .line 10
    return-void
.end method

.method private static a(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/bridge/WritableArray;->pushNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushBoolean(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v0, p1, Ljava/lang/Double;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Double;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    instance-of v0, p1, Ljava/lang/Float;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p1, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Float;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    instance-of v0, p1, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    instance-of v0, p1, Ljava/lang/Short;

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Short;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    instance-of v0, p1, Ljava/lang/Byte;

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    check-cast p1, Ljava/lang/Byte;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    instance-of v0, p1, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Long;->doubleValue()D

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    check-cast p1, Ljava/math/BigInteger;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/math/BigInteger;->doubleValue()D

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_8
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    check-cast p1, Ljava/math/BigDecimal;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_9
    instance-of v0, p1, Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    check-cast p1, Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_a
    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 148
    .line 149
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_b
    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableArray;

    .line 154
    .line 155
    if-eqz v0, :cond_c

    .line 156
    .line 157
    check-cast p1, Lcom/facebook/react/bridge/ReadableArray;

    .line 158
    .line 159
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_c
    sget-object p0, Lio/sentry/react/b;->a:Lio/sentry/ILogger;

    .line 164
    .line 165
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 166
    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v2, "Could not convert object: "

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    const/4 v1, 0x0

    .line 185
    new-array v1, v1, [Ljava/lang/Object;

    .line 186
    .line 187
    invoke-interface {p0, v0, p1, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method private static b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putNull(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Double;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-interface {p0, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    instance-of v0, p2, Ljava/lang/Float;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Float;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-interface {p0, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    instance-of v0, p2, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    instance-of v0, p2, Ljava/lang/Short;

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Short;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Short;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    instance-of v0, p2, Ljava/lang/Byte;

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    check-cast p2, Ljava/lang/Byte;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Byte;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    instance-of v0, p2, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Long;->doubleValue()D

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-interface {p0, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    instance-of v0, p2, Ljava/math/BigInteger;

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    check-cast p2, Ljava/math/BigInteger;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/math/BigInteger;->doubleValue()D

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-interface {p0, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_8
    instance-of v0, p2, Ljava/math/BigDecimal;

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    check-cast p2, Ljava/math/BigDecimal;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-interface {p0, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_9
    instance-of v0, p2, Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    check-cast p2, Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_a
    instance-of v0, p2, Lcom/facebook/react/bridge/ReadableArray;

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    check-cast p2, Lcom/facebook/react/bridge/ReadableArray;

    .line 148
    .line 149
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_b
    instance-of v0, p2, Lcom/facebook/react/bridge/ReadableMap;

    .line 154
    .line 155
    if-eqz v0, :cond_c

    .line 156
    .line 157
    check-cast p2, Lcom/facebook/react/bridge/ReadableMap;

    .line 158
    .line 159
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_c
    sget-object p0, Lio/sentry/react/b;->a:Lio/sentry/ILogger;

    .line 164
    .line 165
    sget-object p1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 166
    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v1, "Could not convert object"

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    const/4 v0, 0x0

    .line 185
    new-array v0, v0, [Ljava/lang/Object;

    .line 186
    .line 187
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lio/sentry/react/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Lio/sentry/react/b;->a(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0

    .line 34
    :cond_1
    instance-of v0, p0, Ljava/util/Map;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast p0, Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/util/Map$Entry;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    instance-of v3, v2, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    check-cast v2, Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1}, Lio/sentry/react/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, v2, v1}, Lio/sentry/react/b;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    sget-object v1, Lio/sentry/react/b;->a:Lio/sentry/ILogger;

    .line 87
    .line 88
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 89
    .line 90
    const-string v4, "Only String keys are supported in Map."

    .line 91
    .line 92
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v1, v3, v4, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    return-object v0

    .line 101
    :cond_4
    instance-of v0, p0, Ljava/lang/Byte;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    check-cast p0, Ljava/lang/Byte;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_5
    instance-of v0, p0, Ljava/lang/Short;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    check-cast p0, Ljava/lang/Short;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :cond_6
    instance-of v0, p0, Ljava/lang/Float;

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    check-cast p0, Ljava/lang/Float;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    float-to-double v0, p0

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :cond_7
    instance-of v0, p0, Ljava/lang/Long;

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    check-cast p0, Ljava/lang/Long;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide v0

    .line 157
    long-to-double v0, v0

    .line 158
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :cond_8
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    check-cast p0, Ljava/math/BigInteger;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/math/BigInteger;->doubleValue()D

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :cond_9
    instance-of v0, p0, Ljava/math/BigDecimal;

    .line 179
    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    check-cast p0, Ljava/math/BigDecimal;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 185
    .line 186
    .line 187
    move-result-wide v0

    .line 188
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :cond_a
    instance-of v0, p0, Ljava/lang/Integer;

    .line 194
    .line 195
    if-nez v0, :cond_c

    .line 196
    .line 197
    instance-of v0, p0, Ljava/lang/Double;

    .line 198
    .line 199
    if-nez v0, :cond_c

    .line 200
    .line 201
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 202
    .line 203
    if-nez v0, :cond_c

    .line 204
    .line 205
    if-eqz p0, :cond_c

    .line 206
    .line 207
    instance-of v0, p0, Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v0, :cond_b

    .line 210
    .line 211
    return-object p0

    .line 212
    :cond_b
    sget-object v0, Lio/sentry/react/b;->a:Lio/sentry/ILogger;

    .line 213
    .line 214
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 215
    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v3, "Supplied serialized value could not be converted."

    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    const/4 v2, 0x0

    .line 234
    new-array v2, v2, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-interface {v0, v1, p0, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    const/4 p0, 0x0

    .line 240
    :cond_c
    return-object p0
.end method
