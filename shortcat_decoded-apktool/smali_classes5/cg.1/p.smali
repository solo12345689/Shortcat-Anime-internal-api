.class public abstract Lcg/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lcg/f;->a(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    const-string v1, "notifee_event_type"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_2
    const/4 v3, 0x1

    .line 34
    const-string v4, "pressAction"

    .line 35
    .line 36
    if-eq v1, v3, :cond_7

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    if-eq v1, v3, :cond_3

    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v0, :cond_b

    .line 52
    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_4
    new-instance v5, Lapp/notifee/core/model/NotificationModel;

    .line 58
    .line 59
    invoke-direct {v5, v0}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v1, v4, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Landroid/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    const-string v4, "app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY"

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v4, "input"

    .line 97
    .line 98
    invoke-virtual {v1, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-virtual {v5}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationAndroidModel;->getAutoCancel()Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-static {p0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, "notification_id"

    .line 120
    .line 121
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-virtual {p0, p1}, Landroidx/core/app/q;->b(I)V

    .line 126
    .line 127
    .line 128
    :cond_6
    new-instance p0, Lcg/i;

    .line 129
    .line 130
    invoke-direct {p0, v5, v1}, Lcg/i;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, Lcg/g;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance p0, Lapp/notifee/core/event/NotificationEvent;

    .line 137
    .line 138
    invoke-direct {p0, v3, v5, v1}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p0}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-nez p0, :cond_8

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    .line 153
    .line 154
    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance p1, Landroid/os/Bundle;

    .line 162
    .line 163
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 164
    .line 165
    .line 166
    if-eqz p0, :cond_9

    .line 167
    .line 168
    invoke-static {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p1, v4, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_9
    const/4 p0, 0x0

    .line 181
    :goto_0
    new-instance v1, Lapp/notifee/core/event/NotificationEvent;

    .line 182
    .line 183
    invoke-direct {v1, v3, v0, p1}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1}, Lcg/g;->a(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    if-nez p0, :cond_a

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_a
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    new-instance v1, Lcg/i;

    .line 197
    .line 198
    invoke-direct {v1, v0, p1}, Lcg/i;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, Lcg/g;->b(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    if-eqz p0, :cond_b

    .line 205
    .line 206
    new-instance p1, Lcg/l;

    .line 207
    .line 208
    invoke-direct {p1, p0}, Lcg/l;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1}, Lcg/g;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_b
    :goto_1
    return-void
.end method
