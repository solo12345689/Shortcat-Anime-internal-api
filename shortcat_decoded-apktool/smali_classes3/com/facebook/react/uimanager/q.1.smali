.class public final Lcom/facebook/react/uimanager/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private b:I

.field private final c:[F

.field private d:Z

.field private e:J

.field private final f:Lcom/facebook/react/uimanager/events/w;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "viewGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    iput p1, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    new-array p1, p1, [F

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 18
    .line 19
    const-wide/high16 v0, -0x8000000000000000L

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/facebook/react/uimanager/q;->e:J

    .line 22
    .line 23
    new-instance p1, Lcom/facebook/react/uimanager/events/w;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/facebook/react/uimanager/events/w;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 29
    .line 30
    return-void
.end method

.method private final a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const-string p1, "ReactNative"

    .line 7
    .line 8
    const-string p2, "Can\'t cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?"

    .line 9
    .line 10
    invoke-static {p1, p2}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    xor-int/2addr v0, v1

    .line 18
    const-string v2, "Expected to not have already sent a cancel for this gesture"

    .line 19
    .line 20
    invoke-static {v0, v2}, LQ6/a;->b(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 28
    .line 29
    sget-object v2, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget v4, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 38
    .line 39
    sget-object v5, Lcom/facebook/react/uimanager/events/x;->f:Lcom/facebook/react/uimanager/events/x;

    .line 40
    .line 41
    iget-wide v7, p0, Lcom/facebook/react/uimanager/q;->e:J

    .line 42
    .line 43
    iget-object v0, p0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    aget v9, v0, v6

    .line 47
    .line 48
    aget v10, v0, v1

    .line 49
    .line 50
    iget-object v11, p0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 51
    .line 52
    move-object v6, p1

    .line 53
    invoke-virtual/range {v2 .. v11}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p2, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final b(Landroid/view/MotionEvent;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, p1, v1, v2, v3}, Lcom/facebook/react/uimanager/c0;->c(FFLandroid/view/ViewGroup;[F[I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method private final e(IILcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Lcom/facebook/react/bridge/UIManager;->markActiveTouchForTag(II)V

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    return-void
.end method

.method private final i(IILcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Lcom/facebook/react/bridge/UIManager;->sweepActiveTouchForTag(II)V

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventDispatcher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/q;->d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "ev"

    .line 8
    .line 9
    move-object/from16 v8, p1

    .line 10
    .line 11
    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "eventDispatcher"

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getAction()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    and-int/lit16 v3, v3, 0xff

    .line 24
    .line 25
    const-string v4, "ReactNative"

    .line 26
    .line 27
    const/4 v14, -0x1

    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget v3, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 33
    .line 34
    if-eq v3, v14, :cond_0

    .line 35
    .line 36
    const-string v3, "Got DOWN touch before receiving UP or CANCEL from last gesture"

    .line 37
    .line 38
    invoke-static {v4, v3}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iput-boolean v6, v0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 42
    .line 43
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getEventTime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    iput-wide v3, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 48
    .line 49
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/q;->b(Landroid/view/MotionEvent;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iput v3, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 54
    .line 55
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 56
    .line 57
    invoke-static {v3}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iget v4, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 62
    .line 63
    invoke-direct {v0, v3, v4, v2}, Lcom/facebook/react/uimanager/q;->e(IILcom/facebook/react/bridge/ReactContext;)V

    .line 64
    .line 65
    .line 66
    sget-object v4, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 67
    .line 68
    iget-object v2, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-static {v2}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    move v7, v6

    .line 75
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 76
    .line 77
    move v9, v7

    .line 78
    sget-object v7, Lcom/facebook/react/uimanager/events/x;->c:Lcom/facebook/react/uimanager/events/x;

    .line 79
    .line 80
    move v11, v9

    .line 81
    iget-wide v9, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 82
    .line 83
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 84
    .line 85
    aget v11, v3, v11

    .line 86
    .line 87
    aget v12, v3, v5

    .line 88
    .line 89
    iget-object v13, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 90
    .line 91
    move v5, v2

    .line 92
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    move v11, v6

    .line 101
    iget-boolean v6, v0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 102
    .line 103
    if-eqz v6, :cond_2

    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 107
    .line 108
    if-ne v6, v14, :cond_3

    .line 109
    .line 110
    const-string v1, "Unexpected state: received touch event but didn\'t get starting ACTION_DOWN for this gesture before"

    .line 111
    .line 112
    invoke-static {v4, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_3
    const-wide/high16 v7, -0x8000000000000000L

    .line 117
    .line 118
    if-ne v3, v5, :cond_4

    .line 119
    .line 120
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/q;->b(Landroid/view/MotionEvent;)I

    .line 121
    .line 122
    .line 123
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-static {v3}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    sget-object v4, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 130
    .line 131
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 132
    .line 133
    move-wide v8, v7

    .line 134
    sget-object v7, Lcom/facebook/react/uimanager/events/x;->d:Lcom/facebook/react/uimanager/events/x;

    .line 135
    .line 136
    move-wide v12, v8

    .line 137
    iget-wide v9, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 138
    .line 139
    iget-object v8, v0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 140
    .line 141
    aget v11, v8, v11

    .line 142
    .line 143
    aget v5, v8, v5

    .line 144
    .line 145
    move-wide v15, v12

    .line 146
    iget-object v13, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 147
    .line 148
    move-object/from16 v8, p1

    .line 149
    .line 150
    move v12, v5

    .line 151
    move v5, v3

    .line 152
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v1, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 157
    .line 158
    .line 159
    iget v1, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 160
    .line 161
    invoke-direct {v0, v5, v1, v2}, Lcom/facebook/react/uimanager/q;->i(IILcom/facebook/react/bridge/ReactContext;)V

    .line 162
    .line 163
    .line 164
    iput v14, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 165
    .line 166
    const-wide/high16 v12, -0x8000000000000000L

    .line 167
    .line 168
    iput-wide v12, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    move-wide v12, v7

    .line 172
    const/4 v7, 0x2

    .line 173
    if-ne v3, v7, :cond_5

    .line 174
    .line 175
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/q;->b(Landroid/view/MotionEvent;)I

    .line 176
    .line 177
    .line 178
    sget-object v4, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 179
    .line 180
    iget-object v2, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 181
    .line 182
    invoke-static {v2}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 187
    .line 188
    sget-object v7, Lcom/facebook/react/uimanager/events/x;->e:Lcom/facebook/react/uimanager/events/x;

    .line 189
    .line 190
    iget-wide v9, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 191
    .line 192
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 193
    .line 194
    aget v11, v3, v11

    .line 195
    .line 196
    aget v12, v3, v5

    .line 197
    .line 198
    iget-object v13, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 199
    .line 200
    move-object/from16 v8, p1

    .line 201
    .line 202
    move v5, v2

    .line 203
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_5
    const/4 v7, 0x5

    .line 212
    if-ne v3, v7, :cond_6

    .line 213
    .line 214
    sget-object v4, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 215
    .line 216
    iget-object v2, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 217
    .line 218
    invoke-static {v2}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 223
    .line 224
    sget-object v7, Lcom/facebook/react/uimanager/events/x;->c:Lcom/facebook/react/uimanager/events/x;

    .line 225
    .line 226
    iget-wide v9, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 227
    .line 228
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 229
    .line 230
    aget v11, v3, v11

    .line 231
    .line 232
    aget v12, v3, v5

    .line 233
    .line 234
    iget-object v13, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 235
    .line 236
    move-object/from16 v8, p1

    .line 237
    .line 238
    move v5, v2

    .line 239
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_6
    const/4 v7, 0x6

    .line 248
    if-ne v3, v7, :cond_7

    .line 249
    .line 250
    sget-object v4, Lcom/facebook/react/uimanager/events/v;->f:Lcom/facebook/react/uimanager/events/v$a;

    .line 251
    .line 252
    iget-object v2, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 253
    .line 254
    invoke-static {v2}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    iget v6, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 259
    .line 260
    sget-object v7, Lcom/facebook/react/uimanager/events/x;->d:Lcom/facebook/react/uimanager/events/x;

    .line 261
    .line 262
    iget-wide v9, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 263
    .line 264
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->c:[F

    .line 265
    .line 266
    aget v11, v3, v11

    .line 267
    .line 268
    aget v12, v3, v5

    .line 269
    .line 270
    iget-object v13, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 271
    .line 272
    move-object/from16 v8, p1

    .line 273
    .line 274
    move v5, v2

    .line 275
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/v$a;->a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_7
    const/4 v5, 0x3

    .line 284
    if-ne v3, v5, :cond_9

    .line 285
    .line 286
    iget-object v3, v0, Lcom/facebook/react/uimanager/q;->f:Lcom/facebook/react/uimanager/events/w;

    .line 287
    .line 288
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 289
    .line 290
    .line 291
    move-result-wide v5

    .line 292
    invoke-virtual {v3, v5, v6}, Lcom/facebook/react/uimanager/events/w;->c(J)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_8

    .line 297
    .line 298
    invoke-direct/range {p0 .. p2}, Lcom/facebook/react/uimanager/q;->a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 299
    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_8
    const-string v1, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN"

    .line 303
    .line 304
    invoke-static {v4, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :goto_0
    iget-object v1, v0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 308
    .line 309
    invoke-static {v1}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    iget v3, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 314
    .line 315
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/uimanager/q;->i(IILcom/facebook/react/bridge/ReactContext;)V

    .line 316
    .line 317
    .line 318
    iput v14, v0, Lcom/facebook/react/uimanager/q;->b:I

    .line 319
    .line 320
    iput-wide v12, v0, Lcom/facebook/react/uimanager/q;->e:J

    .line 321
    .line 322
    return-void

    .line 323
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v2, "Warning : touch event was ignored. Action="

    .line 329
    .line 330
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v2, " Target="

    .line 337
    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-static {v4, v1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    return-void
.end method

.method public final f(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "androidEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "eventDispatcher"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 13
    .line 14
    return-void
.end method

.method public final g(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "androidEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventDispatcher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/q;->h(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "androidEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventDispatcher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/q;->a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/q;->d:Z

    .line 21
    .line 22
    iget p1, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    if-eq p1, p2, :cond_1

    .line 26
    .line 27
    invoke-static {}, Lh7/b;->J()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/facebook/react/uimanager/q;->a:Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget v0, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 40
    .line 41
    invoke-direct {p0, p1, v0, p3}, Lcom/facebook/react/uimanager/q;->i(IILcom/facebook/react/bridge/ReactContext;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput p2, p0, Lcom/facebook/react/uimanager/q;->b:I

    .line 45
    .line 46
    return-void
.end method
