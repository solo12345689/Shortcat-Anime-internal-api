.class public final Lpc/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpc/K$a;,
        Lpc/K$b;
    }
.end annotation


# static fields
.field public static final a:Lpc/K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpc/K;

    .line 2
    .line 3
    invoke-direct {v0}, Lpc/K;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpc/K;->a:Lpc/K;

    .line 7
    .line 8
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

.method public static synthetic b(Lpc/K;Ljava/lang/Object;Lpc/K$a;ZILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lpc/K$b;->a:Lpc/K$b;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lpc/K;->a(Ljava/lang/Object;Lpc/K$a;Z)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic d(Lpc/K;Ljava/lang/Object;Lpc/K$a;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lpc/K$b;->a:Lpc/K$b;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lpc/K;->c(Ljava/lang/Object;Lpc/K$a;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lpc/K$a;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "containerProvider"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_13

    .line 7
    .line 8
    instance-of v0, p1, LTd/L;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    instance-of v0, p1, Landroid/os/Bundle;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lpc/J;->k(Landroid/os/Bundle;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    instance-of v0, p1, [Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p1, p2}, Lpc/J;->i([Ljava/lang/Object;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    instance-of v0, p1, [I

    .line 37
    .line 38
    if-nez v0, :cond_12

    .line 39
    .line 40
    instance-of v0, p1, [F

    .line 41
    .line 42
    if-nez v0, :cond_12

    .line 43
    .line 44
    instance-of v0, p1, [D

    .line 45
    .line 46
    if-nez v0, :cond_12

    .line 47
    .line 48
    instance-of v0, p1, [Z

    .line 49
    .line 50
    if-nez v0, :cond_12

    .line 51
    .line 52
    instance-of v0, p1, [J

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_3
    instance-of v0, p1, [B

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    sget-object p2, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;->put(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_4
    instance-of v0, p1, Ljava/util/Map;

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    if-eqz p3, :cond_5

    .line 73
    .line 74
    check-cast p1, Ljava/util/Map;

    .line 75
    .line 76
    invoke-static {p1}, Lpc/J;->u(Ljava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_5
    check-cast p1, Ljava/util/Map;

    .line 82
    .line 83
    invoke-static {p1, p2}, Lpc/J;->l(Ljava/util/Map;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_6
    instance-of v0, p1, Ljava/lang/Enum;

    .line 89
    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    check-cast p1, Ljava/lang/Enum;

    .line 93
    .line 94
    invoke-static {p1}, Lpc/J;->n(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :cond_7
    instance-of v0, p1, Ljc/b;

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    check-cast p1, Ljc/b;

    .line 104
    .line 105
    invoke-static {p1, p2}, Lpc/J;->m(Ljc/b;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :cond_8
    instance-of v0, p1, Ljava/net/URI;

    .line 111
    .line 112
    if-eqz v0, :cond_9

    .line 113
    .line 114
    check-cast p1, Ljava/net/URI;

    .line 115
    .line 116
    invoke-static {p1}, Lpc/J;->q(Ljava/net/URI;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :cond_9
    instance-of v0, p1, Ljava/net/URL;

    .line 122
    .line 123
    if-eqz v0, :cond_a

    .line 124
    .line 125
    check-cast p1, Ljava/net/URL;

    .line 126
    .line 127
    invoke-static {p1}, Lpc/J;->r(Ljava/net/URL;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_a
    instance-of v0, p1, Landroid/net/Uri;

    .line 133
    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    check-cast p1, Landroid/net/Uri;

    .line 137
    .line 138
    invoke-static {p1}, Lpc/J;->o(Landroid/net/Uri;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_b
    instance-of v0, p1, Ljava/io/File;

    .line 144
    .line 145
    if-eqz v0, :cond_c

    .line 146
    .line 147
    check-cast p1, Ljava/io/File;

    .line 148
    .line 149
    invoke-static {p1}, Lpc/J;->p(Ljava/io/File;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :cond_c
    instance-of v0, p1, Lkotlin/Pair;

    .line 155
    .line 156
    if-eqz v0, :cond_d

    .line 157
    .line 158
    check-cast p1, Lkotlin/Pair;

    .line 159
    .line 160
    invoke-static {p1, p2}, Lpc/J;->d(Lkotlin/Pair;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_d
    instance-of v0, p1, Ljava/lang/Long;

    .line 166
    .line 167
    if-eqz v0, :cond_e

    .line 168
    .line 169
    check-cast p1, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide p1

    .line 175
    long-to-double p1, p1

    .line 176
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :cond_e
    instance-of v0, p1, LEf/a;

    .line 182
    .line 183
    if-eqz v0, :cond_f

    .line 184
    .line 185
    check-cast p1, LEf/a;

    .line 186
    .line 187
    invoke-virtual {p1}, LEf/a;->S()J

    .line 188
    .line 189
    .line 190
    move-result-wide p1

    .line 191
    sget-object p3, LEf/d;->e:LEf/d;

    .line 192
    .line 193
    invoke-static {p1, p2, p3}, LEf/a;->N(JLEf/d;)D

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    return-object p1

    .line 202
    :cond_f
    instance-of v0, p1, Loc/i;

    .line 203
    .line 204
    if-eqz v0, :cond_10

    .line 205
    .line 206
    check-cast p1, Loc/i;

    .line 207
    .line 208
    invoke-interface {p1}, Loc/i;->b()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    :cond_10
    instance-of v0, p1, Ljava/util/Collection;

    .line 214
    .line 215
    if-eqz v0, :cond_12

    .line 216
    .line 217
    if-eqz p3, :cond_11

    .line 218
    .line 219
    check-cast p1, Ljava/util/Collection;

    .line 220
    .line 221
    invoke-static {p1}, Lpc/J;->s(Ljava/util/Collection;)Ljava/util/Collection;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1

    .line 226
    :cond_11
    check-cast p1, Ljava/util/Collection;

    .line 227
    .line 228
    invoke-static {p1, p2}, Lpc/J;->c(Ljava/util/Collection;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :cond_12
    return-object p1

    .line 233
    :cond_13
    :goto_0
    const/4 p1, 0x0

    .line 234
    return-object p1
.end method

.method public final c(Ljava/lang/Object;Lpc/K$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "containerProvider"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_15

    .line 7
    .line 8
    instance-of v0, p1, LTd/L;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    instance-of v0, p1, Landroid/os/Bundle;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lpc/J;->k(Landroid/os/Bundle;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    instance-of v0, p1, [Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p1, p2}, Lpc/J;->i([Ljava/lang/Object;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    instance-of v0, p1, [I

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p1, [I

    .line 41
    .line 42
    invoke-static {p1, p2}, Lpc/J;->g([ILpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_3
    instance-of v0, p1, [J

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast p1, [J

    .line 52
    .line 53
    invoke-static {p1, p2}, Lpc/J;->h([JLpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_4
    instance-of v0, p1, [F

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    check-cast p1, [F

    .line 63
    .line 64
    invoke-static {p1, p2}, Lpc/J;->f([FLpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_5
    instance-of v0, p1, [D

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    check-cast p1, [D

    .line 74
    .line 75
    invoke-static {p1, p2}, Lpc/J;->e([DLpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_6
    instance-of v0, p1, [Z

    .line 81
    .line 82
    if-eqz v0, :cond_7

    .line 83
    .line 84
    check-cast p1, [Z

    .line 85
    .line 86
    invoke-static {p1, p2}, Lpc/J;->j([ZLpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_7
    instance-of v0, p1, [B

    .line 92
    .line 93
    if-eqz v0, :cond_8

    .line 94
    .line 95
    sget-object p2, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 96
    .line 97
    invoke-virtual {p2, p1}, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;->put(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_8
    instance-of v0, p1, Ljava/util/Map;

    .line 103
    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    check-cast p1, Ljava/util/Map;

    .line 107
    .line 108
    invoke-static {p1, p2}, Lpc/J;->l(Ljava/util/Map;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :cond_9
    instance-of v0, p1, Ljava/lang/Enum;

    .line 114
    .line 115
    if-eqz v0, :cond_a

    .line 116
    .line 117
    check-cast p1, Ljava/lang/Enum;

    .line 118
    .line 119
    invoke-static {p1}, Lpc/J;->n(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_a
    instance-of v0, p1, Ljc/b;

    .line 125
    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    check-cast p1, Ljc/b;

    .line 129
    .line 130
    invoke-static {p1, p2}, Lpc/J;->m(Ljc/b;Lpc/K$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_b
    instance-of v0, p1, Ljava/net/URI;

    .line 136
    .line 137
    if-eqz v0, :cond_c

    .line 138
    .line 139
    check-cast p1, Ljava/net/URI;

    .line 140
    .line 141
    invoke-static {p1}, Lpc/J;->q(Ljava/net/URI;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :cond_c
    instance-of v0, p1, Ljava/net/URL;

    .line 147
    .line 148
    if-eqz v0, :cond_d

    .line 149
    .line 150
    check-cast p1, Ljava/net/URL;

    .line 151
    .line 152
    invoke-static {p1}, Lpc/J;->r(Ljava/net/URL;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1

    .line 157
    :cond_d
    instance-of v0, p1, Landroid/net/Uri;

    .line 158
    .line 159
    if-eqz v0, :cond_e

    .line 160
    .line 161
    check-cast p1, Landroid/net/Uri;

    .line 162
    .line 163
    invoke-static {p1}, Lpc/J;->o(Landroid/net/Uri;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_e
    instance-of v0, p1, Ljava/io/File;

    .line 169
    .line 170
    if-eqz v0, :cond_f

    .line 171
    .line 172
    check-cast p1, Ljava/io/File;

    .line 173
    .line 174
    invoke-static {p1}, Lpc/J;->p(Ljava/io/File;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_f
    instance-of v0, p1, Lkotlin/Pair;

    .line 180
    .line 181
    if-eqz v0, :cond_10

    .line 182
    .line 183
    check-cast p1, Lkotlin/Pair;

    .line 184
    .line 185
    invoke-static {p1, p2}, Lpc/J;->d(Lkotlin/Pair;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    return-object p1

    .line 190
    :cond_10
    instance-of v0, p1, Ljava/lang/Long;

    .line 191
    .line 192
    if-eqz v0, :cond_11

    .line 193
    .line 194
    check-cast p1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 197
    .line 198
    .line 199
    move-result-wide p1

    .line 200
    long-to-double p1, p1

    .line 201
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    return-object p1

    .line 206
    :cond_11
    instance-of v0, p1, LEf/a;

    .line 207
    .line 208
    if-eqz v0, :cond_12

    .line 209
    .line 210
    check-cast p1, LEf/a;

    .line 211
    .line 212
    invoke-virtual {p1}, LEf/a;->S()J

    .line 213
    .line 214
    .line 215
    move-result-wide p1

    .line 216
    sget-object v0, LEf/d;->e:LEf/d;

    .line 217
    .line 218
    invoke-static {p1, p2, v0}, LEf/a;->N(JLEf/d;)D

    .line 219
    .line 220
    .line 221
    move-result-wide p1

    .line 222
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    return-object p1

    .line 227
    :cond_12
    instance-of v0, p1, Loc/i;

    .line 228
    .line 229
    if-eqz v0, :cond_13

    .line 230
    .line 231
    check-cast p1, Loc/i;

    .line 232
    .line 233
    invoke-interface {p1}, Loc/i;->b()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    return-object p1

    .line 238
    :cond_13
    instance-of v0, p1, Ljava/util/Collection;

    .line 239
    .line 240
    if-eqz v0, :cond_14

    .line 241
    .line 242
    check-cast p1, Ljava/util/Collection;

    .line 243
    .line 244
    invoke-static {p1, p2}, Lpc/J;->c(Ljava/util/Collection;Lpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    :cond_14
    return-object p1

    .line 249
    :cond_15
    :goto_0
    const/4 p1, 0x0

    .line 250
    return-object p1
.end method
