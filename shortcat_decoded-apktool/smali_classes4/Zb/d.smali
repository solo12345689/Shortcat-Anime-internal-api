.class public final LZb/d;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LZb/d;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "expo-modules-core_release"
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


# virtual methods
.method public n()Lgc/e;
    .locals 13

    .line 1
    const-class v0, Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "NativeModulesProxy"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, LZb/d$a;

    .line 67
    .line 68
    invoke-direct {v3, p0}, LZb/d$a;-><init>(LZb/d;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Lhc/f;->c(Lie/a;)V

    .line 72
    .line 73
    .line 74
    const-string v3, "callMethod"

    .line 75
    .line 76
    new-instance v4, Ldc/f;

    .line 77
    .line 78
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    sget-object v6, Lpc/d;->a:Lpc/d;

    .line 83
    .line 84
    new-instance v7, Lkotlin/Pair;

    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, Lpc/b;

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    if-nez v7, :cond_0

    .line 107
    .line 108
    sget-object v7, LZb/d$b;->a:LZb/d$b;

    .line 109
    .line 110
    new-instance v10, Lpc/b;

    .line 111
    .line 112
    new-instance v11, Lpc/M;

    .line 113
    .line 114
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-direct {v11, v12, v8, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v10, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 122
    .line 123
    .line 124
    move-object v7, v10

    .line 125
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto :goto_1

    .line 128
    :cond_0
    :goto_0
    new-instance v10, Lkotlin/Pair;

    .line 129
    .line 130
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-direct {v10, v11, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    check-cast v10, Lpc/b;

    .line 146
    .line 147
    if-nez v10, :cond_1

    .line 148
    .line 149
    sget-object v10, LZb/d$c;->a:LZb/d$c;

    .line 150
    .line 151
    new-instance v11, Lpc/b;

    .line 152
    .line 153
    new-instance v12, Lpc/M;

    .line 154
    .line 155
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-direct {v12, v1, v8, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v11, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 163
    .line 164
    .line 165
    move-object v10, v11

    .line 166
    :cond_1
    new-instance v1, Lkotlin/Pair;

    .line 167
    .line 168
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-direct {v1, v11, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lpc/b;

    .line 184
    .line 185
    if-nez v1, :cond_2

    .line 186
    .line 187
    sget-object v1, LZb/d$d;->a:LZb/d$d;

    .line 188
    .line 189
    new-instance v6, Lpc/b;

    .line 190
    .line 191
    new-instance v9, Lpc/M;

    .line 192
    .line 193
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-direct {v9, v0, v8, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v6, v9, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 201
    .line 202
    .line 203
    move-object v1, v6

    .line 204
    :cond_2
    filled-new-array {v7, v10, v1}, [Lpc/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, LZb/d$e;

    .line 209
    .line 210
    invoke-direct {v1, p0}, LZb/d$e;-><init>(LZb/d;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v4, v3, v0, v1}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 224
    .line 225
    .line 226
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    invoke-static {}, LX3/a;->f()V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 232
    .line 233
    .line 234
    throw v0
.end method
