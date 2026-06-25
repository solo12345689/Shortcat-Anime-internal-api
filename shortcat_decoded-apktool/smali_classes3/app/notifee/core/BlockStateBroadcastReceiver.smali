.class public Lapp/notifee/core/BlockStateBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroidx/concurrent/futures/c$a;IZLandroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lr4/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr4/c;-><init>(Landroidx/concurrent/futures/c$a;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lapp/notifee/core/event/BlockStateEvent;

    .line 7
    .line 8
    invoke-direct {p0, p1, p3, p2, v0}, Lapp/notifee/core/event/BlockStateEvent;-><init>(ILandroid/os/Bundle;ZLapp/notifee/core/interfaces/MethodCallResult;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Landroidx/concurrent/futures/c$a;Lcg/q$a;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string p1, "BlockState"

    .line 4
    .line 5
    const-string p3, "Failed getting channel or channel group bundle, received error: "

    .line 6
    .line 7
    invoke-static {p1, p3, p2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {p1, p3}, Lcg/q$a;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic c(Landroidx/concurrent/futures/c$a;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 1

    .line 1
    const-string p2, "BlockState"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string v0, "background work failed with error: "

    .line 6
    .line 7
    invoke-static {p2, v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "background work completed successfully"

    .line 19
    .line 20
    invoke-static {p2, p1}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static d(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V
    .locals 5

    .line 1
    const-string v0, "starting background work"

    .line 2
    .line 3
    const-string v1, "BlockState"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "blocked"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0, v0, v2}, Landroidx/work/b;->i(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v2, "type"

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-virtual {p0, v2, v3}, Landroidx/work/b;->k(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    new-instance v4, Lr4/a;

    .line 23
    .line 24
    invoke-direct {v4, p1, v2, v0}, Lr4/a;-><init>(Landroidx/concurrent/futures/c$a;IZ)V

    .line 25
    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-interface {v4, p0}, Lcg/q$a;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Lr4/b;

    .line 35
    .line 36
    invoke-direct {v0, p1, v4}, Lr4/b;-><init>(Landroidx/concurrent/futures/c$a;Lcg/q$a;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "channelOrGroupId"

    .line 40
    .line 41
    invoke-virtual {p0, v3}, Landroidx/work/b;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v3, 0x5

    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1, p0, v0}, Lapp/notifee/core/Notifee;->getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const/4 v3, 0x6

    .line 57
    if-ne v2, v3, :cond_2

    .line 58
    .line 59
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, p0, v0}, Lapp/notifee/core/Notifee;->getChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    const-string p0, "unknown block state work type"

    .line 68
    .line 69
    invoke-static {v1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lcg/f;->a(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    new-instance p1, Landroidx/work/b$a;

    .line 27
    .line 28
    invoke-direct {p1}, Landroidx/work/b$a;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "workType"

    .line 32
    .line 33
    const-string v2, "app.notifee.core.BlockStateBroadcastReceiver.WORKER"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, -0x1

    .line 44
    sparse-switch v1, :sswitch_data_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :sswitch_0
    const-string v1, "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 v3, 0x2

    .line 58
    goto :goto_1

    .line 59
    :sswitch_1
    const-string v1, "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const/4 v3, 0x1

    .line 69
    goto :goto_1

    .line 70
    :sswitch_2
    const-string v1, "android.app.action.APP_BLOCK_STATE_CHANGED"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    move v3, v2

    .line 80
    :goto_1
    const-string v1, "."

    .line 81
    .line 82
    const-string v4, "channelOrGroupId"

    .line 83
    .line 84
    const-string v5, "type"

    .line 85
    .line 86
    const-string v6, "BlockState"

    .line 87
    .line 88
    packed-switch v3, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    const-string p1, "unknown intent action received, ignoring."

    .line 92
    .line 93
    invoke-static {v6, p1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_0
    const/4 v3, 0x5

    .line 98
    invoke-virtual {p1, v5, v3}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    .line 99
    .line 100
    .line 101
    const-string v3, "android.app.extra.NOTIFICATION_CHANNEL_ID"

    .line 102
    .line 103
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {p1, v4, v3}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 108
    .line 109
    .line 110
    new-instance v4, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    goto :goto_2

    .line 129
    :pswitch_1
    const/4 v3, 0x6

    .line 130
    invoke-virtual {p1, v5, v3}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    .line 131
    .line 132
    .line 133
    const-string v3, "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID"

    .line 134
    .line 135
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {p1, v4, v3}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 140
    .line 141
    .line 142
    new-instance v4, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_2

    .line 161
    :pswitch_2
    const/4 v1, 0x4

    .line 162
    invoke-virtual {p1, v5, v1}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    .line 163
    .line 164
    .line 165
    :goto_2
    const-string v1, "android.app.extra.BLOCKED_STATE"

    .line 166
    .line 167
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    const-string v1, "blocked"

    .line 172
    .line 173
    invoke-virtual {p1, v1, p2}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    .line 174
    .line 175
    .line 176
    new-instance p2, Li4/k$a;

    .line 177
    .line 178
    const-class v1, Lapp/notifee/core/Worker;

    .line 179
    .line 180
    invoke-direct {p2, v1}, Li4/k$a;-><init>(Ljava/lang/Class;)V

    .line 181
    .line 182
    .line 183
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 184
    .line 185
    const-wide/16 v2, 0x1

    .line 186
    .line 187
    invoke-virtual {p2, v2, v3, v1}, Li4/u$a;->j(JLjava/util/concurrent/TimeUnit;)Li4/u$a;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    check-cast p2, Li4/k$a;

    .line 192
    .line 193
    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p2, p1}, Li4/u$a;->k(Landroidx/work/b;)Li4/u$a;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Li4/k$a;

    .line 202
    .line 203
    :try_start_0
    sget-object p2, Lcg/f;->a:Landroid/content/Context;

    .line 204
    .line 205
    invoke-static {p2}, Li4/t;->h(Landroid/content/Context;)Li4/t;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    sget-object v1, Li4/d;->a:Li4/d;

    .line 210
    .line 211
    invoke-virtual {p1}, Li4/u$a;->b()Li4/u;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Li4/k;

    .line 216
    .line 217
    invoke-virtual {p2, v0, v1, p1}, Li4/t;->f(Ljava/lang/String;Li4/d;Li4/k;)Li4/l;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catch_0
    move-exception p1

    .line 222
    const-string p2, "Error while calling WorkManager.getInstance"

    .line 223
    .line 224
    invoke-static {v6, p2, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 225
    .line 226
    .line 227
    sget-object p1, Lcg/f;->a:Landroid/content/Context;

    .line 228
    .line 229
    if-nez p1, :cond_6

    .line 230
    .line 231
    const-string p1, "Application Context is null"

    .line 232
    .line 233
    invoke-static {v6, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_6
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string p2, "scheduled new background work with id "

    .line 242
    .line 243
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {v6, p1}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :sswitch_data_0
    .sparse-switch
        0x1af192ca -> :sswitch_2
        0x3012ffd0 -> :sswitch_1
        0x45daf6b0 -> :sswitch_0
    .end sparse-switch

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
