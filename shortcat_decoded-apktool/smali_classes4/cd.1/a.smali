.class public final Lcd/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcd/a;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
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
    .locals 12

    .line 1
    const-class v0, Ljava/lang/String;

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
    const-string v2, "ExpoTopicSubscriptionModule"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lgc/a;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "subscribeToTopicAsync"

    .line 65
    .line 66
    new-instance v3, Ldc/f;

    .line 67
    .line 68
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 73
    .line 74
    new-instance v6, Lkotlin/Pair;

    .line 75
    .line 76
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lpc/b;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    if-nez v6, :cond_0

    .line 97
    .line 98
    sget-object v6, Lcd/a$c;->a:Lcd/a$c;

    .line 99
    .line 100
    new-instance v9, Lpc/b;

    .line 101
    .line 102
    new-instance v10, Lpc/M;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-direct {v10, v11, v7, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v9, v10, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 112
    .line 113
    .line 114
    move-object v6, v9

    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_1

    .line 118
    :cond_0
    :goto_0
    filled-new-array {v6}, [Lpc/b;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    new-instance v6, Lcd/a$d;

    .line 123
    .line 124
    invoke-direct {v6}, Lcd/a$d;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-direct {v3, v2, v4, v6}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string v2, "unsubscribeFromTopicAsync"

    .line 138
    .line 139
    new-instance v3, Ldc/f;

    .line 140
    .line 141
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    new-instance v6, Lkotlin/Pair;

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Lpc/b;

    .line 163
    .line 164
    if-nez v5, :cond_1

    .line 165
    .line 166
    sget-object v5, Lcd/a$e;->a:Lcd/a$e;

    .line 167
    .line 168
    new-instance v6, Lpc/b;

    .line 169
    .line 170
    new-instance v8, Lpc/M;

    .line 171
    .line 172
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-direct {v8, v0, v7, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {v6, v8, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 180
    .line 181
    .line 182
    move-object v5, v6

    .line 183
    :cond_1
    filled-new-array {v5}, [Lpc/b;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v4, Lcd/a$f;

    .line 188
    .line 189
    invoke-direct {v4}, Lcd/a$f;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-direct {v3, v2, v0, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lgc/a;->u()Lgc/e;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    invoke-static {}, LX3/a;->f()V

    .line 207
    .line 208
    .line 209
    return-object v0

    .line 210
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 211
    .line 212
    .line 213
    throw v0
.end method
