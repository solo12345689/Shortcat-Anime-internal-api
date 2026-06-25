.class public abstract Lcg/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static varargs a(ILandroid/os/Bundle;I[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 7

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    invoke-static {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_2
    move-object v5, v3

    .line 53
    :goto_0
    if-nez v4, :cond_3

    .line 54
    .line 55
    move v6, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v6, v1

    .line 58
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    const-string v6, "default"

    .line 65
    .line 66
    if-eq v5, v6, :cond_4

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-eq v6, v5, :cond_4

    .line 77
    .line 78
    move v6, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move v6, v1

    .line 81
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    :cond_5
    if-eqz v5, :cond_6

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_6

    .line 92
    .line 93
    invoke-static {v5}, Lcg/k;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    new-instance v5, Landroid/content/Intent;

    .line 98
    .line 99
    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x10200000

    .line 106
    .line 107
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    move-object v4, v5

    .line 111
    :cond_6
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    const/4 v6, -0x1

    .line 116
    if-eq v5, v6, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-eqz v5, :cond_8

    .line 130
    .line 131
    const-string v5, "mainComponent"

    .line 132
    .line 133
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    .line 139
    .line 140
    new-instance v5, Lcg/l;

    .line 141
    .line 142
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {v5, p1}, Lcg/l;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Lcg/g;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    .line 151
    .line 152
    :cond_8
    move-object v3, v4

    .line 153
    goto :goto_4

    .line 154
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v5, "Failed to create LaunchActivityIntent for notification "

    .line 160
    .line 161
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    const-string v5, "NotificationPendingIntent"

    .line 172
    .line 173
    invoke-static {v5, v4, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 174
    .line 175
    .line 176
    :cond_9
    :goto_4
    new-instance p1, Landroid/content/Intent;

    .line 177
    .line 178
    const-class v4, Lapp/notifee/core/NotificationReceiverActivity;

    .line 179
    .line 180
    invoke-direct {p1, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v3, p2, p0, p3, p4}, Lcg/o;->b(Landroid/content/Intent;II[Ljava/lang/String;[Landroid/os/Bundle;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1, p2, p0, p3, p4}, Lcg/o;->b(Landroid/content/Intent;II[Ljava/lang/String;[Landroid/os/Bundle;)V

    .line 187
    .line 188
    .line 189
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0}, Ljava/util/UUID;->hashCode()I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz v3, :cond_a

    .line 198
    .line 199
    const/4 p2, 0x2

    .line 200
    new-array p2, p2, [Landroid/content/Intent;

    .line 201
    .line 202
    aput-object v3, p2, v1

    .line 203
    .line 204
    const/high16 p3, 0x24000000

    .line 205
    .line 206
    invoke-virtual {p1, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 207
    .line 208
    .line 209
    aput-object p1, p2, v2

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_a
    new-array p2, v2, [Landroid/content/Intent;

    .line 213
    .line 214
    const/high16 p3, 0x18080000

    .line 215
    .line 216
    invoke-virtual {p1, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 217
    .line 218
    .line 219
    aput-object p1, p2, v1

    .line 220
    .line 221
    :goto_5
    const/high16 p1, 0xa000000

    .line 222
    .line 223
    invoke-static {v0, p0, p2, p1}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0
.end method

.method public static varargs b(Landroid/content/Intent;II[Ljava/lang/String;[Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const-string v0, "notifee_event_type"

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 7
    .line 8
    .line 9
    const-string p1, "notification_id"

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :goto_0
    array-length p2, p3

    .line 16
    if-ge p1, p2, :cond_2

    .line 17
    .line 18
    aget-object p2, p3, p1

    .line 19
    .line 20
    array-length v0, p4

    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    if-gt p1, v0, :cond_1

    .line 24
    .line 25
    aget-object v0, p4, p1

    .line 26
    .line 27
    invoke-virtual {p0, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_2
    return-void
.end method
