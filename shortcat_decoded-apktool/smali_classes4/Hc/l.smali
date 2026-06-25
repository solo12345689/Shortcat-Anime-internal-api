.class public LHc/l;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LHc/m;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "LHc/l;",
        "Lgc/c;",
        "LHc/m;",
        "<init>",
        "()V",
        "Lqb/b;",
        "channelOptions",
        "",
        "H",
        "(Lqb/b;)Ljava/lang/CharSequence;",
        "",
        "G",
        "(Lqb/b;)I",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LIc/f;",
        "d",
        "Lkotlin/Lazy;",
        "j",
        "()LIc/f;",
        "channelManager",
        "LJc/e;",
        "e",
        "()LJc/e;",
        "channelSerializer",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final d:Lkotlin/Lazy;

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHc/j;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LHc/j;-><init>(LHc/l;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LHc/l;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, LHc/k;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LHc/k;-><init>(LHc/l;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LHc/l;->e:Lkotlin/Lazy;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic A(LHc/l;)LJc/e;
    .locals 0

    .line 1
    invoke-direct {p0}, LHc/l;->e()LJc/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B(LHc/l;Lqb/b;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LHc/l;->G(Lqb/b;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic C(LHc/l;Lqb/b;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LHc/l;->H(Lqb/b;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final D(LHc/l;)LIc/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, LHc/l;->F(LUb/s;)LHc/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, LHc/n;->j()LIc/f;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static final E(LHc/l;)LJc/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, LHc/l;->F(LUb/s;)LHc/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, LHc/n;->e()LJc/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final G(Lqb/b;)I
    .locals 2

    .line 1
    sget-object v0, LMc/c;->g:LMc/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LMc/c;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "importance"

    .line 8
    .line 9
    invoke-interface {p1, v1, v0}, Lqb/b;->getInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, LMc/c;->b(I)LMc/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, LMc/c;->k()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method private final H(Lqb/b;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getString(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method private final e()LJc/e;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/l;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LJc/e;

    .line 8
    .line 9
    return-object v0
.end method

.method private final j()LIc/f;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/l;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LIc/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic x(LHc/l;)LIc/f;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/l;->D(LHc/l;)LIc/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(LHc/l;)LJc/e;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/l;->E(LHc/l;)LJc/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(LHc/l;)LIc/f;
    .locals 0

    .line 1
    invoke-direct {p0}, LHc/l;->j()LIc/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public F(LUb/s;)LHc/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHc/m$a;->a(LHc/m;LUb/s;)LHc/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public n()Lgc/e;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lqb/b;

    .line 4
    .line 5
    const-class v2, LUb/u;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, ".ModuleDefinition"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "["

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v5, "ExpoModulesCore"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "] "

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, LX3/a;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v3, Lgc/d;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "ExpoNotificationChannelManager"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lgc/a;->s(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "getNotificationChannelsAsync"

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    new-array v6, v5, [Lpc/b;

    .line 72
    .line 73
    new-instance v7, LHc/l$b;

    .line 74
    .line 75
    invoke-direct {v7, v1}, LHc/l$b;-><init>(LHc/l;)V

    .line 76
    .line 77
    .line 78
    const-class v8, Ljava/util/List;

    .line 79
    .line 80
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    const-class v14, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v10, :cond_0

    .line 95
    .line 96
    :try_start_1
    new-instance v8, Ldc/l;

    .line 97
    .line 98
    invoke-direct {v8, v4, v6, v7}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_0
    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_1

    .line 110
    .line 111
    new-instance v8, Ldc/h;

    .line 112
    .line 113
    invoke-direct {v8, v4, v6, v7}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_2

    .line 122
    .line 123
    new-instance v8, Ldc/i;

    .line 124
    .line 125
    invoke-direct {v8, v4, v6, v7}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_3

    .line 134
    .line 135
    new-instance v8, Ldc/j;

    .line 136
    .line 137
    invoke-direct {v8, v4, v6, v7}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_3
    invoke-static {v8, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    new-instance v8, Ldc/n;

    .line 148
    .line 149
    invoke-direct {v8, v4, v6, v7}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    new-instance v8, Ldc/s;

    .line 154
    .line 155
    invoke-direct {v8, v4, v6, v7}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 156
    .line 157
    .line 158
    :goto_0
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-interface {v6, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    const-string v4, "getNotificationChannelAsync"

    .line 166
    .line 167
    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_5

    .line 172
    .line 173
    new-instance v6, Ldc/f;

    .line 174
    .line 175
    new-array v7, v5, [Lpc/b;

    .line 176
    .line 177
    new-instance v8, LHc/l$c;

    .line 178
    .line 179
    invoke-direct {v8, v1}, LHc/l$c;-><init>(LHc/l;)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v6, v4, v7, v8}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_5
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    sget-object v7, Lpc/d;->a:Lpc/d;

    .line 191
    .line 192
    new-instance v8, Lkotlin/Pair;

    .line 193
    .line 194
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-direct {v8, v10, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    check-cast v7, Lpc/b;

    .line 212
    .line 213
    if-nez v7, :cond_6

    .line 214
    .line 215
    sget-object v7, LHc/l$d;->a:LHc/l$d;

    .line 216
    .line 217
    new-instance v8, Lpc/b;

    .line 218
    .line 219
    new-instance v10, Lpc/M;

    .line 220
    .line 221
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    invoke-direct {v10, v15, v5, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v8, v10, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 229
    .line 230
    .line 231
    move-object v7, v8

    .line 232
    :cond_6
    filled-new-array {v7}, [Lpc/b;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    new-instance v7, LHc/l$e;

    .line 237
    .line 238
    invoke-direct {v7, v1}, LHc/l$e;-><init>(LHc/l;)V

    .line 239
    .line 240
    .line 241
    new-instance v8, Ldc/s;

    .line 242
    .line 243
    invoke-direct {v8, v4, v6, v7}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    move-object v6, v8

    .line 247
    :goto_1
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-interface {v7, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    const-string v4, "setNotificationChannelAsync"

    .line 255
    .line 256
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    sget-object v7, Lpc/d;->a:Lpc/d;

    .line 261
    .line 262
    new-instance v8, Lkotlin/Pair;

    .line 263
    .line 264
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-direct {v8, v10, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    check-cast v8, Lpc/b;

    .line 282
    .line 283
    if-nez v8, :cond_7

    .line 284
    .line 285
    sget-object v8, LHc/l$f;->a:LHc/l$f;

    .line 286
    .line 287
    new-instance v10, Lpc/b;

    .line 288
    .line 289
    new-instance v5, Lpc/M;

    .line 290
    .line 291
    move-object/from16 v16, v0

    .line 292
    .line 293
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    move-object/from16 v17, v3

    .line 298
    .line 299
    const/4 v3, 0x0

    .line 300
    invoke-direct {v5, v0, v3, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v10, v5, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 304
    .line 305
    .line 306
    move-object v8, v10

    .line 307
    goto :goto_2

    .line 308
    :cond_7
    move-object/from16 v16, v0

    .line 309
    .line 310
    move-object/from16 v17, v3

    .line 311
    .line 312
    :goto_2
    new-instance v0, Lkotlin/Pair;

    .line 313
    .line 314
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-direct {v0, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, Lpc/b;

    .line 330
    .line 331
    if-nez v0, :cond_8

    .line 332
    .line 333
    sget-object v0, LHc/l$g;->a:LHc/l$g;

    .line 334
    .line 335
    new-instance v3, Lpc/b;

    .line 336
    .line 337
    new-instance v5, Lpc/M;

    .line 338
    .line 339
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    move-object/from16 v16, v7

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    invoke-direct {v5, v10, v7, v0}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 347
    .line 348
    .line 349
    invoke-direct {v3, v5, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 350
    .line 351
    .line 352
    move-object v0, v3

    .line 353
    goto :goto_3

    .line 354
    :cond_8
    move-object/from16 v16, v7

    .line 355
    .line 356
    :goto_3
    filled-new-array {v8, v0}, [Lpc/b;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    new-instance v3, LHc/l$h;

    .line 361
    .line 362
    invoke-direct {v3, v1}, LHc/l$h;-><init>(LHc/l;)V

    .line 363
    .line 364
    .line 365
    new-instance v5, Ldc/s;

    .line 366
    .line 367
    invoke-direct {v5, v4, v0, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v17 .. v17}, Lhc/f;->k()Ljava/util/Map;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    const-string v0, "deleteNotificationChannelAsync"

    .line 378
    .line 379
    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_9

    .line 384
    .line 385
    new-instance v2, Ldc/f;

    .line 386
    .line 387
    const/4 v3, 0x0

    .line 388
    new-array v3, v3, [Lpc/b;

    .line 389
    .line 390
    new-instance v4, LHc/l$i;

    .line 391
    .line 392
    invoke-direct {v4, v1}, LHc/l$i;-><init>(LHc/l;)V

    .line 393
    .line 394
    .line 395
    invoke-direct {v2, v0, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_5

    .line 399
    .line 400
    :cond_9
    invoke-virtual/range {v17 .. v17}, Lhc/f;->m()Lpc/X;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    new-instance v3, Lkotlin/Pair;

    .line 405
    .line 406
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    check-cast v3, Lpc/b;

    .line 422
    .line 423
    if-nez v3, :cond_a

    .line 424
    .line 425
    sget-object v3, LHc/l$j;->a:LHc/l$j;

    .line 426
    .line 427
    new-instance v4, Lpc/b;

    .line 428
    .line 429
    new-instance v5, Lpc/M;

    .line 430
    .line 431
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    const/4 v7, 0x0

    .line 436
    invoke-direct {v5, v6, v7, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 437
    .line 438
    .line 439
    invoke-direct {v4, v5, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 440
    .line 441
    .line 442
    move-object v3, v4

    .line 443
    :cond_a
    filled-new-array {v3}, [Lpc/b;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    new-instance v3, LHc/l$a;

    .line 448
    .line 449
    invoke-direct {v3, v1}, LHc/l$a;-><init>(LHc/l;)V

    .line 450
    .line 451
    .line 452
    const-class v4, LTd/L;

    .line 453
    .line 454
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    if-eqz v5, :cond_b

    .line 459
    .line 460
    new-instance v4, Ldc/l;

    .line 461
    .line 462
    invoke-direct {v4, v0, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 463
    .line 464
    .line 465
    :goto_4
    move-object v2, v4

    .line 466
    goto :goto_5

    .line 467
    :cond_b
    invoke-static {v4, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_c

    .line 472
    .line 473
    new-instance v4, Ldc/h;

    .line 474
    .line 475
    invoke-direct {v4, v0, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 476
    .line 477
    .line 478
    goto :goto_4

    .line 479
    :cond_c
    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-eqz v5, :cond_d

    .line 484
    .line 485
    new-instance v4, Ldc/i;

    .line 486
    .line 487
    invoke-direct {v4, v0, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 488
    .line 489
    .line 490
    goto :goto_4

    .line 491
    :cond_d
    invoke-static {v4, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-eqz v5, :cond_e

    .line 496
    .line 497
    new-instance v4, Ldc/j;

    .line 498
    .line 499
    invoke-direct {v4, v0, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 500
    .line 501
    .line 502
    goto :goto_4

    .line 503
    :cond_e
    invoke-static {v4, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_f

    .line 508
    .line 509
    new-instance v4, Ldc/n;

    .line 510
    .line 511
    invoke-direct {v4, v0, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 512
    .line 513
    .line 514
    goto :goto_4

    .line 515
    :cond_f
    new-instance v4, Ldc/s;

    .line 516
    .line 517
    invoke-direct {v4, v0, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 518
    .line 519
    .line 520
    goto :goto_4

    .line 521
    :goto_5
    invoke-virtual/range {v17 .. v17}, Lhc/f;->k()Ljava/util/Map;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v17 .. v17}, Lgc/a;->u()Lgc/e;

    .line 529
    .line 530
    .line 531
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 532
    invoke-static {}, LX3/a;->f()V

    .line 533
    .line 534
    .line 535
    return-object v0

    .line 536
    :goto_6
    invoke-static {}, LX3/a;->f()V

    .line 537
    .line 538
    .line 539
    throw v0
.end method
