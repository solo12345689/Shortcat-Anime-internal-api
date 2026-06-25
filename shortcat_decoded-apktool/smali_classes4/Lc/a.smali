.class public LLc/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOc/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "LLc/a;",
        "Lgc/c;",
        "LOc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LPc/a;",
        "notification",
        "LTd/L;",
        "f",
        "(LPc/a;)V",
        "LPc/h;",
        "response",
        "",
        "g",
        "(LPc/h;)Z",
        "Landroid/os/Bundle;",
        "extras",
        "c",
        "(Landroid/os/Bundle;)V",
        "d",
        "Landroid/os/Bundle;",
        "lastNotificationResponseBundle",
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
.field private d:Landroid/os/Bundle;


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

.method public static final synthetic x(LLc/a;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, LLc/a;->d:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(LLc/a;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LLc/a;->d:Landroid/os/Bundle;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public c(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LDc/c;->f(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "toResponseBundleFromExtras(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "NotificationsEmitter.onNotificationResponseIntentReceived"

    .line 16
    .line 17
    invoke-static {v0, p1}, LKc/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LLc/a;->d:Landroid/os/Bundle;

    .line 21
    .line 22
    const-string v0, "onDidReceiveNotificationResponse"

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    const-string v0, "onNotificationsDeleted"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(LPc/a;)V
    .locals 1

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LDc/c;->b(LPc/a;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "NotificationsEmitter.onNotificationReceived"

    .line 14
    .line 15
    invoke-static {v0, p1}, LKc/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "onDidReceiveNotification"

    .line 19
    .line 20
    invoke-virtual {p0, v0, p1}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public g(LPc/h;)Z
    .locals 1

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LDc/c;->d(LPc/h;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "NotificationsEmitter.onNotificationResponseReceived"

    .line 14
    .line 15
    invoke-static {v0, p1}, LKc/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LLc/a;->d:Landroid/os/Bundle;

    .line 19
    .line 20
    const-string v0, "onDidReceiveNotificationResponse"

    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1
.end method

.method public n()Lgc/e;
    .locals 10

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-class v1, Landroid/os/Bundle;

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
    const-string v3, "ExpoNotificationsEmitter"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "onDidReceiveNotification"

    .line 67
    .line 68
    const-string v4, "onNotificationsDeleted"

    .line 69
    .line 70
    const-string v5, "onDidReceiveNotificationResponse"

    .line 71
    .line 72
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Lhc/f;->d([Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lgc/a;->w()Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, Lbc/e;->a:Lbc/e;

    .line 84
    .line 85
    new-instance v5, Lbc/a;

    .line 86
    .line 87
    new-instance v6, LLc/a$c;

    .line 88
    .line 89
    invoke-direct {v6, p0}, LLc/a$c;-><init>(LLc/a;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v5, v4, v6}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lgc/a;->w()Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    sget-object v4, Lbc/e;->b:Lbc/e;

    .line 103
    .line 104
    new-instance v5, Lbc/a;

    .line 105
    .line 106
    new-instance v6, LLc/a$d;

    .line 107
    .line 108
    invoke-direct {v6, p0}, LLc/a$d;-><init>(LLc/a;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v5, v4, v6}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v3, "getLastNotificationResponse"

    .line 118
    .line 119
    new-instance v4, Ldc/r;

    .line 120
    .line 121
    const/4 v5, 0x0

    .line 122
    new-array v6, v5, [Lpc/b;

    .line 123
    .line 124
    sget-object v7, Lpc/V;->a:Lpc/V;

    .line 125
    .line 126
    invoke-virtual {v7}, Lpc/V;->a()Ljava/util/Map;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, Lpc/U;

    .line 139
    .line 140
    if-nez v8, :cond_0

    .line 141
    .line 142
    new-instance v8, Lpc/U;

    .line 143
    .line 144
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-direct {v8, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Lpc/V;->a()Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v9, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    goto :goto_1

    .line 165
    :cond_0
    :goto_0
    new-instance v1, LLc/a$a;

    .line 166
    .line 167
    invoke-direct {v1, p0}, LLc/a$a;-><init>(LLc/a;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v4, v3, v6, v8, v1}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-string v1, "clearLastNotificationResponse"

    .line 181
    .line 182
    new-instance v3, Ldc/r;

    .line 183
    .line 184
    new-array v4, v5, [Lpc/b;

    .line 185
    .line 186
    invoke-virtual {v7}, Lpc/V;->a()Ljava/util/Map;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, Lpc/U;

    .line 199
    .line 200
    if-nez v5, :cond_1

    .line 201
    .line 202
    new-instance v5, Lpc/U;

    .line 203
    .line 204
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7}, Lpc/V;->a()Ljava/util/Map;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    :cond_1
    new-instance v0, LLc/a$b;

    .line 223
    .line 224
    invoke-direct {v0, p0}, LLc/a$b;-><init>(LLc/a;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v3, v1, v4, v5, v0}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 238
    .line 239
    .line 240
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    invoke-static {}, LX3/a;->f()V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 246
    .line 247
    .line 248
    throw v0
.end method
