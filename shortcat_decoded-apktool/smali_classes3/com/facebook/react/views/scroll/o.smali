.class public final Lcom/facebook/react/views/scroll/o;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/o$a;
    }
.end annotation


# static fields
.field public static final k:Lcom/facebook/react/views/scroll/o$a;

.field private static final l:Ljava/lang/String;

.field private static final m:LK1/e;


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Lcom/facebook/react/views/scroll/p;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/scroll/o;->k:Lcom/facebook/react/views/scroll/o$a;

    .line 8
    .line 9
    const-class v0, Lcom/facebook/react/views/scroll/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/facebook/react/views/scroll/o;->l:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, LK1/e;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, LK1/e;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/views/scroll/o;->m:LK1/e;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/o;-><init>()V

    return-void
.end method

.method public static final synthetic b()LK1/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/o;->m:LK1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c(Lcom/facebook/react/views/scroll/o;IILcom/facebook/react/views/scroll/p;FFFFIIII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/facebook/react/views/scroll/o;->d(IILcom/facebook/react/views/scroll/p;FFFFIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d(IILcom/facebook/react/views/scroll/p;FFFFIIII)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-super {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/events/d;->init(IIJ)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/views/scroll/o;->i:Lcom/facebook/react/views/scroll/p;

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/views/scroll/o;->a:F

    .line 11
    .line 12
    iput p5, p0, Lcom/facebook/react/views/scroll/o;->b:F

    .line 13
    .line 14
    iput p6, p0, Lcom/facebook/react/views/scroll/o;->c:F

    .line 15
    .line 16
    iput p7, p0, Lcom/facebook/react/views/scroll/o;->d:F

    .line 17
    .line 18
    iput p8, p0, Lcom/facebook/react/views/scroll/o;->e:I

    .line 19
    .line 20
    iput p9, p0, Lcom/facebook/react/views/scroll/o;->f:I

    .line 21
    .line 22
    iput p10, p0, Lcom/facebook/react/views/scroll/o;->g:I

    .line 23
    .line 24
    iput p11, p0, Lcom/facebook/react/views/scroll/o;->h:I

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/o;->j:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/o;->i:Lcom/facebook/react/views/scroll/p;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->d:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 12

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "top"

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 15
    .line 16
    .line 17
    const-string v2, "bottom"

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 20
    .line 21
    .line 22
    const-string v2, "left"

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 25
    .line 26
    .line 27
    const-string v2, "right"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 37
    .line 38
    invoke-direct {v2, v1}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 39
    .line 40
    .line 41
    iget v3, p0, Lcom/facebook/react/views/scroll/o;->a:F

    .line 42
    .line 43
    invoke-static {v3}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    float-to-double v3, v3

    .line 48
    const-string v5, "x"

    .line 49
    .line 50
    invoke-virtual {v2, v5, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 51
    .line 52
    .line 53
    iget v3, p0, Lcom/facebook/react/views/scroll/o;->b:F

    .line 54
    .line 55
    invoke-static {v3}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    float-to-double v3, v3

    .line 60
    const-string v6, "y"

    .line 61
    .line 62
    invoke-virtual {v2, v6, v3, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 70
    .line 71
    invoke-direct {v3, v2}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 72
    .line 73
    .line 74
    iget v4, p0, Lcom/facebook/react/views/scroll/o;->e:I

    .line 75
    .line 76
    int-to-float v4, v4

    .line 77
    invoke-static {v4}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    float-to-double v7, v4

    .line 82
    const-string v4, "width"

    .line 83
    .line 84
    invoke-virtual {v3, v4, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 85
    .line 86
    .line 87
    iget v7, p0, Lcom/facebook/react/views/scroll/o;->f:I

    .line 88
    .line 89
    int-to-float v7, v7

    .line 90
    invoke-static {v7}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    float-to-double v7, v7

    .line 95
    const-string v9, "height"

    .line 96
    .line 97
    invoke-virtual {v3, v9, v7, v8}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    new-instance v7, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 105
    .line 106
    invoke-direct {v7, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 107
    .line 108
    .line 109
    iget v8, p0, Lcom/facebook/react/views/scroll/o;->g:I

    .line 110
    .line 111
    int-to-float v8, v8

    .line 112
    invoke-static {v8}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    float-to-double v10, v8

    .line 117
    invoke-virtual {v7, v4, v10, v11}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 118
    .line 119
    .line 120
    iget v4, p0, Lcom/facebook/react/views/scroll/o;->h:I

    .line 121
    .line 122
    int-to-float v4, v4

    .line 123
    invoke-static {v4}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    float-to-double v10, v4

    .line 128
    invoke-virtual {v7, v9, v10, v11}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    new-instance v7, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 136
    .line 137
    invoke-direct {v7, v4}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 138
    .line 139
    .line 140
    iget v8, p0, Lcom/facebook/react/views/scroll/o;->c:F

    .line 141
    .line 142
    invoke-static {v8}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    float-to-double v8, v8

    .line 147
    invoke-virtual {v7, v5, v8, v9}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 148
    .line 149
    .line 150
    iget v5, p0, Lcom/facebook/react/views/scroll/o;->d:F

    .line 151
    .line 152
    invoke-static {v5}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    float-to-double v8, v5

    .line 157
    invoke-virtual {v7, v6, v8, v9}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 158
    .line 159
    .line 160
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    const-string v6, "contentInset"

    .line 165
    .line 166
    invoke-interface {v5, v6, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "contentOffset"

    .line 170
    .line 171
    invoke-interface {v5, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 172
    .line 173
    .line 174
    const-string v0, "contentSize"

    .line 175
    .line 176
    invoke-interface {v5, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 177
    .line 178
    .line 179
    const-string v0, "layoutMeasurement"

    .line 180
    .line 181
    invoke-interface {v5, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 182
    .line 183
    .line 184
    const-string v0, "velocity"

    .line 185
    .line 186
    invoke-interface {v5, v0, v4}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 187
    .line 188
    .line 189
    const-string v0, "target"

    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-interface {v5, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    iget-wide v0, p0, Lcom/facebook/react/views/scroll/o;->j:J

    .line 199
    .line 200
    long-to-double v0, v0

    .line 201
    const-string v2, "timestamp"

    .line 202
    .line 203
    invoke-interface {v5, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lh7/b;->H()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    xor-int/lit8 v0, v0, 0x1

    .line 211
    .line 212
    const-string v1, "responderIgnoreScroll"

    .line 213
    .line 214
    invoke-interface {v5, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 215
    .line 216
    .line 217
    return-object v5
.end method

.method public getEventName()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/p;->a:Lcom/facebook/react/views/scroll/p$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/o;->i:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    invoke-static {v1}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "assertNotNull(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Lcom/facebook/react/views/scroll/p;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/scroll/p$a;->a(Lcom/facebook/react/views/scroll/p;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public onDispose()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/facebook/react/views/scroll/o;->m:LK1/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LK1/e;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    sget-object v1, Lcom/facebook/react/views/scroll/o;->l:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "TAG"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
