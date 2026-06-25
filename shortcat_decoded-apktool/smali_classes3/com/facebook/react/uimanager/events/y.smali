.class public final Lcom/facebook/react/uimanager/events/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/y$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/uimanager/events/y;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/events/y;->a:Lcom/facebook/react/uimanager/events/y;

    .line 7
    .line 8
    const-string v0, "target"

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/uimanager/events/y;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a(Lcom/facebook/react/uimanager/events/v;)[Lcom/facebook/react/bridge/WritableMap;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/v;->d()Landroid/view/MotionEvent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v1, v1, [Lcom/facebook/react/bridge/WritableMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/v;->f()F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    sub-float/2addr v2, v3

    .line 20
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/v;->g()F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sub-float/2addr v3, v4

    .line 29
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x0

    .line 34
    :goto_0
    if-ge v5, v4, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    sget-object v7, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 41
    .line 42
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-virtual {v7, v8}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    float-to-double v8, v8

    .line 51
    const-string v10, "pageX"

    .line 52
    .line 53
    invoke-interface {v6, v10, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-virtual {v7, v8}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    float-to-double v8, v8

    .line 65
    const-string v10, "pageY"

    .line 66
    .line 67
    invoke-interface {v6, v10, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    sub-float/2addr v8, v2

    .line 75
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    sub-float/2addr v9, v3

    .line 80
    invoke-virtual {v7, v8}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    float-to-double v10, v8

    .line 85
    const-string v8, "locationX"

    .line 86
    .line 87
    invoke-interface {v6, v8, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v9}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    float-to-double v7, v7

    .line 95
    const-string v9, "locationY"

    .line 96
    .line 97
    invoke-interface {v6, v9, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 98
    .line 99
    .line 100
    const-string v7, "targetSurface"

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-interface {v6, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    sget-object v7, Lcom/facebook/react/uimanager/events/y;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    invoke-interface {v6, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    .line 119
    .line 120
    .line 121
    move-result-wide v7

    .line 122
    long-to-double v7, v7

    .line 123
    const-string v9, "timestamp"

    .line 124
    .line 125
    invoke-interface {v6, v9, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    int-to-double v7, v7

    .line 133
    const-string v9, "identifier"

    .line 134
    .line 135
    invoke-interface {v6, v9, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 136
    .line 137
    .line 138
    aput-object v6, v1, v5

    .line 139
    .line 140
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    return-object v1
.end method

.method private final b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p2

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_2

    .line 8
    .line 9
    aget-object v3, p2, v2

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {v3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    return-object v0
.end method

.method public static final c(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/v;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "eventEmitter"

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "event"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->getEventName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "TouchesHelper.sentTouchEventModern("

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ")"

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    invoke-static {v10, v11, v1}, LU7/a;->c(JLjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->e()Lcom/facebook/react/uimanager/events/x;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->d()Landroid/view/MotionEvent;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lcom/facebook/react/uimanager/events/y;->a:Lcom/facebook/react/uimanager/events/y;

    .line 55
    .line 56
    invoke-direct {v4, v0}, Lcom/facebook/react/uimanager/events/y;->a(Lcom/facebook/react/uimanager/events/v;)[Lcom/facebook/react/bridge/WritableMap;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sget-object v5, Lcom/facebook/react/uimanager/events/y$a;->a:[I

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    aget v1, v5, v1

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v12, 0x0

    .line 70
    const/4 v13, 0x1

    .line 71
    if-eq v1, v13, :cond_5

    .line 72
    .line 73
    const/4 v6, 0x2

    .line 74
    if-eq v1, v6, :cond_4

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    if-eq v1, v3, :cond_1

    .line 78
    .line 79
    const/4 v3, 0x4

    .line 80
    if-ne v1, v3, :cond_0

    .line 81
    .line 82
    new-array v1, v5, [Lcom/facebook/react/bridge/WritableMap;

    .line 83
    .line 84
    move-object v14, v1

    .line 85
    move-object v1, v4

    .line 86
    goto :goto_4

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_0
    new-instance v0, LTd/r;

    .line 91
    .line 92
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_1
    array-length v1, v4

    .line 97
    new-array v1, v1, [Lcom/facebook/react/bridge/WritableMap;

    .line 98
    .line 99
    :goto_0
    array-length v3, v4

    .line 100
    if-ge v5, v3, :cond_3

    .line 101
    .line 102
    aget-object v3, v4, v5

    .line 103
    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    invoke-interface {v3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object v3, v12

    .line 112
    :goto_1
    aput-object v3, v1, v5

    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :goto_2
    move-object v14, v4

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    aget-object v3, v4, v1

    .line 124
    .line 125
    aput-object v12, v4, v1

    .line 126
    .line 127
    new-array v1, v13, [Lcom/facebook/react/bridge/WritableMap;

    .line 128
    .line 129
    aput-object v3, v1, v5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    aget-object v1, v4, v1

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    invoke-interface {v1}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    move-object v1, v12

    .line 146
    :goto_3
    new-array v3, v13, [Lcom/facebook/react/bridge/WritableMap;

    .line 147
    .line 148
    aput-object v1, v3, v5

    .line 149
    .line 150
    move-object v1, v3

    .line 151
    goto :goto_2

    .line 152
    :goto_4
    invoke-static {v1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lcom/facebook/react/bridge/WritableMap;

    .line 167
    .line 168
    if-eqz v3, :cond_7

    .line 169
    .line 170
    invoke-interface {v3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget-object v4, Lcom/facebook/react/uimanager/events/y;->a:Lcom/facebook/react/uimanager/events/y;

    .line 175
    .line 176
    invoke-direct {v4, v13, v1}, Lcom/facebook/react/uimanager/events/y;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-direct {v4, v13, v14}, Lcom/facebook/react/uimanager/events/y;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    const-string v6, "changedTouches"

    .line 185
    .line 186
    invoke-interface {v3, v6, v5}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 187
    .line 188
    .line 189
    const-string v5, "touches"

    .line 190
    .line 191
    invoke-interface {v3, v5, v4}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 192
    .line 193
    .line 194
    move-object v8, v3

    .line 195
    goto :goto_6

    .line 196
    :cond_7
    move-object v8, v12

    .line 197
    :goto_6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->getEventName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->canCoalesce()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/v;->getEventCategory()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    const/4 v7, 0x0

    .line 218
    invoke-interface/range {v2 .. v9}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    .line 220
    .line 221
    move-object/from16 v2, p0

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_8
    invoke-static {v10, v11}, LU7/a;->i(J)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :goto_7
    invoke-static {v10, v11}, LU7/a;->i(J)V

    .line 229
    .line 230
    .line 231
    throw v0
.end method

.method public static final d(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/v;)V
    .locals 5

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "touchEvent"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/v;->e()Lcom/facebook/react/uimanager/events/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/facebook/react/uimanager/events/y;->a:Lcom/facebook/react/uimanager/events/y;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lcom/facebook/react/uimanager/events/y;->a(Lcom/facebook/react/uimanager/events/v;)[Lcom/facebook/react/bridge/WritableMap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, v3, v2}, Lcom/facebook/react/uimanager/events/y;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/v;->d()Landroid/view/MotionEvent;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v4, Lcom/facebook/react/uimanager/events/x;->e:Lcom/facebook/react/uimanager/events/x;

    .line 35
    .line 36
    if-eq v0, v4, :cond_3

    .line 37
    .line 38
    sget-object v4, Lcom/facebook/react/uimanager/events/x;->f:Lcom/facebook/react/uimanager/events/x;

    .line 39
    .line 40
    if-ne v0, v4, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    sget-object v3, Lcom/facebook/react/uimanager/events/x;->c:Lcom/facebook/react/uimanager/events/x;

    .line 44
    .line 45
    if-eq v0, v3, :cond_2

    .line 46
    .line 47
    sget-object v3, Lcom/facebook/react/uimanager/events/x;->d:Lcom/facebook/react/uimanager/events/x;

    .line 48
    .line 49
    if-ne v0, v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 53
    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "Unknown touch type: "

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    :goto_2
    if-ge v3, p1, :cond_4

    .line 88
    .line 89
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    :goto_3
    sget-object p1, Lcom/facebook/react/uimanager/events/x;->b:Lcom/facebook/react/uimanager/events/x$a;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/events/x$a;->a(Lcom/facebook/react/uimanager/events/x;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p0, p1, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method
