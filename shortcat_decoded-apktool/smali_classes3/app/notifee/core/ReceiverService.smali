.class public Lapp/notifee/core/ReceiverService;
.super Landroid/app/Service;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lapp/notifee/core/ReceiverService;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 4

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    const-class v2, Lapp/notifee/core/ReceiverService;

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :goto_0
    array-length v2, p1

    .line 15
    if-ge p0, v2, :cond_1

    .line 16
    .line 17
    aget-object v2, p1, p0

    .line 18
    .line 19
    array-length v3, p2

    .line 20
    add-int/lit8 v3, v3, -0x1

    .line 21
    .line 22
    if-gt p0, v3, :cond_0

    .line 23
    .line 24
    aget-object v3, p2, p0

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    sget-object p0, Lapp/notifee/core/ReceiverService;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const/high16 p1, 0xa000000

    .line 44
    .line 45
    invoke-static {v0, p0, v1, p1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method


# virtual methods
.method public final b(Lcg/i;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcg/k;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "ReceiverService"

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p1, "Failed to get launch activity"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, v2, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    if-eq p4, p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, p4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const-string p2, "mainComponent"

    .line 33
    .line 34
    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p4, p1, Lcg/i;->a:Lapp/notifee/core/model/NotificationModel;

    .line 42
    .line 43
    invoke-virtual {p4}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    const/high16 v2, 0xa000000

    .line 52
    .line 53
    invoke-static {p2, p4, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :try_start_0
    invoke-virtual {p2}, Landroid/app/PendingIntent;->send()V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lcg/g;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    if-eqz p3, :cond_3

    .line 64
    .line 65
    new-instance p2, Lcg/l;

    .line 66
    .line 67
    invoke-direct {p2, p3}, Lcg/l;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Lcg/g;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p2

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-void

    .line 77
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string p4, "Failed to send PendingIntent from launchPendingIntentActivity for notification "

    .line 83
    .line 84
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object p1, p1, Lcg/i;->a:Lapp/notifee/core/model/NotificationModel;

    .line 88
    .line 89
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v0, p1, p2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 p3, 0x2

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, -0x1

    .line 16
    sparse-switch v0, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string v0, "app.notifee.core.ReceiverService.PRESS_INTENT"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v3, p3

    .line 30
    goto :goto_0

    .line 31
    :sswitch_1
    const-string v0, "app.notifee.core.ReceiverService.DELETE_INTENT"

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v3, v1

    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    const-string v0, "app.notifee.core.ReceiverService.ACTION_PRESS_INTENT"

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move v3, v2

    .line 52
    :goto_0
    const-string p2, "notification"

    .line 53
    .line 54
    const-string v0, "pressAction"

    .line 55
    .line 56
    packed-switch v3, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :pswitch_0
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-nez p2, :cond_4

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_4
    new-instance v2, Lapp/notifee/core/model/NotificationModel;

    .line 70
    .line 71
    invoke-direct {v2, p2}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance p2, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-static {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p2, v0, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    const/4 p1, 0x0

    .line 98
    :goto_1
    new-instance v0, Lapp/notifee/core/event/NotificationEvent;

    .line 99
    .line 100
    invoke-direct {v0, v1, v2, p2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_6
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-nez v0, :cond_7

    .line 119
    .line 120
    if-eqz v1, :cond_d

    .line 121
    .line 122
    :cond_7
    new-instance v3, Lcg/i;

    .line 123
    .line 124
    invoke-direct {v3, v2, p2}, Lcg/i;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-virtual {p0, v3, v0, v1, p1}, Lapp/notifee/core/ReceiverService;->b(Lcg/i;Ljava/lang/String;Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :pswitch_1
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-nez p1, :cond_8

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :cond_8
    new-instance p2, Lapp/notifee/core/model/NotificationModel;

    .line 145
    .line 146
    invoke-direct {p2, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    .line 150
    .line 151
    invoke-direct {p1, v2, p2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :pswitch_2
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz p2, :cond_d

    .line 168
    .line 169
    if-nez v1, :cond_9

    .line 170
    .line 171
    goto/16 :goto_2

    .line 172
    .line 173
    :cond_9
    new-instance v2, Lapp/notifee/core/model/NotificationModel;

    .line 174
    .line 175
    invoke-direct {v2, p2}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-static {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    new-instance v3, Landroid/os/Bundle;

    .line 187
    .line 188
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Landroidx/core/app/w;->o(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-eqz p1, :cond_a

    .line 203
    .line 204
    const-string v0, "app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    if-eqz p1, :cond_a

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v0, "input"

    .line 217
    .line 218
    invoke-virtual {v3, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_a
    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    .line 222
    .line 223
    invoke-direct {p1, p3, v2, v3}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 224
    .line 225
    .line 226
    invoke-static {p1}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidModel;->getAutoCancel()Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_b

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationAndroidModel;->getTag()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-virtual {v2}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {p1, p2, v0}, Landroidx/core/app/q;->c(Ljava/lang/String;I)V

    .line 264
    .line 265
    .line 266
    :cond_b
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    if-nez p1, :cond_c

    .line 275
    .line 276
    if-eqz p2, :cond_d

    .line 277
    .line 278
    :cond_c
    new-instance v0, Lcg/i;

    .line 279
    .line 280
    invoke-direct {v0, v2, v3}, Lcg/i;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-virtual {p0, v0, p1, p2, v1}, Lapp/notifee/core/ReceiverService;->b(Lcg/i;Ljava/lang/String;Ljava/lang/String;I)V

    .line 288
    .line 289
    .line 290
    sget-object p1, Lcg/f;->a:Landroid/content/Context;

    .line 291
    .line 292
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 297
    .line 298
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 299
    .line 300
    const/16 p2, 0x1f

    .line 301
    .line 302
    if-ge p1, p2, :cond_d

    .line 303
    .line 304
    sget-object p1, Lcg/f;->a:Landroid/content/Context;

    .line 305
    .line 306
    new-instance p2, Landroid/content/Intent;

    .line 307
    .line 308
    const-string v0, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    .line 309
    .line 310
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 314
    .line 315
    .line 316
    :cond_d
    :goto_2
    return p3

    .line 317
    :sswitch_data_0
    .sparse-switch
        -0x7a2bfceb -> :sswitch_2
        -0x79412bdc -> :sswitch_1
        -0x74e48cbc -> :sswitch_0
    .end sparse-switch

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
