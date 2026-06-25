.class public final Lhd/e;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lhd/e;",
        "Lgc/c;",
        "<init>",
        "()V",
        "LUb/u;",
        "promise",
        "LTd/L;",
        "D",
        "(LUb/u;)V",
        "",
        "C",
        "()Z",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Landroid/content/Context;",
        "B",
        "()Landroid/content/Context;",
        "context",
        "expo-store-review_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic A(Lhd/e;LUb/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhd/e;->D(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final B()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final C()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lhd/e;->B()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "com.android.vending"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :catch_0
    return v0
.end method

.method private final D(LUb/u;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lhd/e;->B()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LL9/d;->a(Landroid/content/Context;)LL9/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "create(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, LL9/c;->b()Ln9/i;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "requestReviewFlow(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lhd/c;

    .line 24
    .line 25
    invoke-direct {v2, p1, v0, p0}, Lhd/c;-><init>(LUb/u;LL9/c;Lhd/e;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static final E(LUb/u;LL9/c;Lhd/e;Ln9/i;)V
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ln9/i;->o()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p3}, Ln9/i;->k()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    check-cast p3, LL9/b;

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Lgc/c;->i()LUb/d;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, LUb/d;->F()Landroid/app/Activity;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {p1, p2, p3}, LL9/c;->a(Landroid/app/Activity;LL9/b;)Ln9/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "launchReviewFlow(...)"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p2, Lhd/d;

    .line 38
    .line 39
    invoke-direct {p2, p0}, Lhd/d;-><init>(LUb/u;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    :cond_1
    :goto_0
    new-instance p1, Lhd/a;

    .line 51
    .line 52
    invoke-direct {p1}, Lhd/a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, LTd/L;->a:LTd/L;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    new-instance p1, Lhd/b;

    .line 62
    .line 63
    invoke-direct {p1}, Lhd/b;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, p1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, LTd/L;->a:LTd/L;

    .line 70
    .line 71
    return-void
.end method

.method private static final F(LUb/u;Ln9/i;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/i;->o()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-interface {p0, p1}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Lhd/a;

    .line 18
    .line 19
    invoke-direct {p1}, Lhd/a;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic x(LUb/u;LL9/c;Lhd/e;Ln9/i;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lhd/e;->E(LUb/u;LL9/c;Lhd/e;Ln9/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(LUb/u;Ln9/i;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhd/e;->F(LUb/u;Ln9/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic z(Lhd/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lhd/e;->C()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 14

    .line 1
    const-class v0, LUb/u;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ".ModuleDefinition"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "["

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, "ExpoModulesCore"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, "] "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, LX3/a;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    new-instance v1, Lgc/d;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "ExpoStoreReview"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lgc/a;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "isAvailableAsync"

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    new-array v4, v3, [Lpc/b;

    .line 68
    .line 69
    new-instance v5, Lhd/e$a;

    .line 70
    .line 71
    invoke-direct {v5, p0}, Lhd/e$a;-><init>(Lhd/e;)V

    .line 72
    .line 73
    .line 74
    const-class v6, Ljava/lang/Boolean;

    .line 75
    .line 76
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    const-class v9, Ljava/lang/String;

    .line 83
    .line 84
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    if-eqz v8, :cond_0

    .line 91
    .line 92
    :try_start_1
    new-instance v6, Ldc/l;

    .line 93
    .line 94
    invoke-direct {v6, v2, v4, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :cond_0
    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_1

    .line 106
    .line 107
    new-instance v6, Ldc/h;

    .line 108
    .line 109
    invoke-direct {v6, v2, v4, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-eqz v8, :cond_2

    .line 118
    .line 119
    new-instance v6, Ldc/i;

    .line 120
    .line 121
    invoke-direct {v6, v2, v4, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_3

    .line 130
    .line 131
    new-instance v6, Ldc/j;

    .line 132
    .line 133
    invoke-direct {v6, v2, v4, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_4

    .line 142
    .line 143
    new-instance v6, Ldc/n;

    .line 144
    .line 145
    invoke-direct {v6, v2, v4, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    new-instance v6, Ldc/s;

    .line 150
    .line 151
    invoke-direct {v6, v2, v4, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 152
    .line 153
    .line 154
    :goto_0
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-interface {v4, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    const-string v2, "requestReview"

    .line 162
    .line 163
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    new-instance v0, Ldc/f;

    .line 170
    .line 171
    new-array v3, v3, [Lpc/b;

    .line 172
    .line 173
    new-instance v4, Lhd/e$b;

    .line 174
    .line 175
    invoke-direct {v4, p0}, Lhd/e$b;-><init>(Lhd/e;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v2, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_2

    .line 182
    .line 183
    :cond_5
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 188
    .line 189
    new-instance v6, Lkotlin/Pair;

    .line 190
    .line 191
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-direct {v6, v8, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Lpc/b;

    .line 209
    .line 210
    if-nez v5, :cond_6

    .line 211
    .line 212
    sget-object v5, Lhd/e$c;->a:Lhd/e$c;

    .line 213
    .line 214
    new-instance v6, Lpc/b;

    .line 215
    .line 216
    new-instance v8, Lpc/M;

    .line 217
    .line 218
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {v8, v0, v3, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v6, v8, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 226
    .line 227
    .line 228
    move-object v5, v6

    .line 229
    :cond_6
    filled-new-array {v5}, [Lpc/b;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v3, Lhd/e$d;

    .line 234
    .line 235
    invoke-direct {v3, p0}, Lhd/e$d;-><init>(Lhd/e;)V

    .line 236
    .line 237
    .line 238
    const-class v4, LTd/L;

    .line 239
    .line 240
    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_7

    .line 245
    .line 246
    new-instance v4, Ldc/l;

    .line 247
    .line 248
    invoke-direct {v4, v2, v0, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 249
    .line 250
    .line 251
    :goto_1
    move-object v0, v4

    .line 252
    goto :goto_2

    .line 253
    :cond_7
    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_8

    .line 258
    .line 259
    new-instance v4, Ldc/h;

    .line 260
    .line 261
    invoke-direct {v4, v2, v0, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 262
    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_8
    invoke-static {v4, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-eqz v5, :cond_9

    .line 270
    .line 271
    new-instance v4, Ldc/i;

    .line 272
    .line 273
    invoke-direct {v4, v2, v0, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 274
    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_9
    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-eqz v5, :cond_a

    .line 282
    .line 283
    new-instance v4, Ldc/j;

    .line 284
    .line 285
    invoke-direct {v4, v2, v0, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 286
    .line 287
    .line 288
    goto :goto_1

    .line 289
    :cond_a
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_b

    .line 294
    .line 295
    new-instance v4, Ldc/n;

    .line 296
    .line 297
    invoke-direct {v4, v2, v0, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    goto :goto_1

    .line 301
    :cond_b
    new-instance v4, Ldc/s;

    .line 302
    .line 303
    invoke-direct {v4, v2, v0, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :goto_2
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Lgc/a;->u()Lgc/e;

    .line 315
    .line 316
    .line 317
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 318
    invoke-static {}, LX3/a;->f()V

    .line 319
    .line 320
    .line 321
    return-object v0

    .line 322
    :goto_3
    invoke-static {}, LX3/a;->f()V

    .line 323
    .line 324
    .line 325
    throw v0
.end method
