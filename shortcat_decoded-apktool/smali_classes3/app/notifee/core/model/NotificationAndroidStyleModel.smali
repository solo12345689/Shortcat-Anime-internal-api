.class public Lapp/notifee/core/model/NotificationAndroidStyleModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final TAG:Ljava/lang/String; = "NotificationAndroidStyle"


# instance fields
.field private mNotificationAndroidStyleBundle:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Lapp/notifee/core/model/NotificationAndroidStyleModel;)Landroidx/core/app/m$h;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/core/app/m$b;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/core/app/m$b;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v2, "picture"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-wide/16 v3, 0xa

    .line 18
    .line 19
    const-string v5, "NotificationAndroidStyle"

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-static {v1}, Lcg/s;->b(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38
    .line 39
    invoke-interface {v2, v3, v4, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catch_0
    move-exception v2

    .line 47
    goto :goto_0

    .line 48
    :catch_1
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v8, "An error occurred whilst trying to retrieve a big picture style image: "

    .line 56
    .line 57
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v8, "Timeout occurred whilst trying to retrieve a big picture style image: "

    .line 77
    .line 78
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    move-object v2, v6

    .line 92
    :goto_3
    if-eqz v2, :cond_0

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Landroidx/core/app/m$b;->i(Landroid/graphics/Bitmap;)Landroidx/core/app/m$b;

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 98
    .line 99
    const-string v2, "largeIcon"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-nez v1, :cond_2

    .line 114
    .line 115
    invoke-virtual {v0, v6}, Landroidx/core/app/m$b;->h(Landroid/graphics/Bitmap;)Landroidx/core/app/m$b;

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_1
    move-object v1, v6

    .line 120
    :cond_2
    :goto_4
    if-eqz v1, :cond_3

    .line 121
    .line 122
    :try_start_1
    invoke-static {v1}, Lcg/s;->b(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 127
    .line 128
    invoke-interface {v2, v3, v4, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 133
    .line 134
    move-object v6, v2

    .line 135
    goto :goto_7

    .line 136
    :catch_2
    move-exception v2

    .line 137
    goto :goto_5

    .line 138
    :catch_3
    move-exception v2

    .line 139
    goto :goto_6

    .line 140
    :goto_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v4, "An error occurred whilst trying to retrieve a big picture style large icon: "

    .line 146
    .line 147
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 158
    .line 159
    .line 160
    goto :goto_7

    .line 161
    :goto_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v4, "Timeout occurred whilst trying to retrieve a big picture style large icon: "

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 179
    .line 180
    .line 181
    :goto_7
    if-eqz v6, :cond_3

    .line 182
    .line 183
    invoke-virtual {v0, v6}, Landroidx/core/app/m$b;->h(Landroid/graphics/Bitmap;)Landroidx/core/app/m$b;

    .line 184
    .line 185
    .line 186
    :cond_3
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 187
    .line 188
    const-string v2, "title"

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    const/4 v3, 0x0

    .line 195
    if-eqz v1, :cond_4

    .line 196
    .line 197
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Landroidx/core/app/m$b;->j(Ljava/lang/CharSequence;)Landroidx/core/app/m$b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :cond_4
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 212
    .line 213
    const-string v2, "summary"

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_5

    .line 220
    .line 221
    iget-object p0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 222
    .line 223
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {v0, p0}, Landroidx/core/app/m$b;->k(Ljava/lang/CharSequence;)Landroidx/core/app/m$b;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :cond_5
    return-object v0
.end method

.method public static synthetic b(Landroid/os/Bundle;)Landroidx/core/app/u;
    .locals 7

    .line 1
    const-string v0, "NotificationAndroidStyle"

    .line 2
    .line 3
    new-instance v1, Landroidx/core/app/u$b;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/core/app/u$b;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "name"

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Landroidx/core/app/u$b;->f(Ljava/lang/CharSequence;)Landroidx/core/app/u$b;

    .line 15
    .line 16
    .line 17
    const-string v2, "id"

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Landroidx/core/app/u$b;->e(Ljava/lang/String;)Landroidx/core/app/u$b;

    .line 30
    .line 31
    .line 32
    :cond_0
    const-string v2, "bot"

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, v2}, Landroidx/core/app/u$b;->b(Z)Landroidx/core/app/u$b;

    .line 45
    .line 46
    .line 47
    :cond_1
    const-string v2, "important"

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v1, v2}, Landroidx/core/app/u$b;->d(Z)Landroidx/core/app/u$b;

    .line 60
    .line 61
    .line 62
    :cond_2
    const-string v2, "icon"

    .line 63
    .line 64
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :try_start_0
    invoke-static {v2}, Lcg/s;->b(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 82
    .line 83
    const-wide/16 v5, 0xa

    .line 84
    .line 85
    invoke-interface {v3, v5, v6, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catch_0
    move-exception v3

    .line 93
    goto :goto_0

    .line 94
    :catch_1
    move-exception v3

    .line 95
    goto :goto_1

    .line 96
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v5, "An error occurred whilst trying to retrieve a person icon: "

    .line 102
    .line 103
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v0, v2, v3}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v5, "Timeout occurred whilst trying to retrieve a person icon: "

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v0, v2, v3}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    const/4 v3, 0x0

    .line 138
    :goto_3
    if-eqz v3, :cond_3

    .line 139
    .line 140
    invoke-static {v3}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, v0}, Landroidx/core/app/u$b;->c(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/u$b;

    .line 145
    .line 146
    .line 147
    :cond_3
    const-string v0, "uri"

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {v1, p0}, Landroidx/core/app/u$b;->g(Ljava/lang/String;)Landroidx/core/app/u$b;

    .line 160
    .line 161
    .line 162
    :cond_4
    invoke-virtual {v1}, Landroidx/core/app/u$b;->a()Landroidx/core/app/u;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method

.method public static c(Lapp/notifee/core/model/NotificationAndroidStyleModel;Lcom/google/common/util/concurrent/r;)Landroidx/core/app/m$h;
    .locals 11

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "person"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getPerson(Lcom/google/common/util/concurrent/r;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v3, 0x14

    .line 19
    .line 20
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroidx/core/app/u;

    .line 25
    .line 26
    new-instance v2, Landroidx/core/app/m$g;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Landroidx/core/app/m$g;-><init>(Landroidx/core/app/u;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v5, "title"

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v6, 0x0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v6}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2, v0}, Landroidx/core/app/m$g;->k(Ljava/lang/CharSequence;)Landroidx/core/app/m$g;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    :cond_0
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 57
    .line 58
    const-string v5, "group"

    .line 59
    .line 60
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {v2, v0}, Landroidx/core/app/m$g;->l(Z)Landroidx/core/app/m$g;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :cond_1
    iget-object p0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 77
    .line 78
    const-string v0, "messages"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    move v0, v6

    .line 85
    :goto_0
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-ge v0, v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Landroid/os/Bundle;

    .line 99
    .line 100
    const-string v7, "timestamp"

    .line 101
    .line 102
    invoke-virtual {v5, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-static {v7}, Lcg/q;->d(Ljava/lang/Object;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v7

    .line 110
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_2

    .line 115
    .line 116
    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v9}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getPerson(Lcom/google/common/util/concurrent/r;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 128
    .line 129
    invoke-interface {v9, v3, v4, v10}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Landroidx/core/app/u;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    const/4 v9, 0x0

    .line 137
    :goto_1
    const-string v10, "text"

    .line 138
    .line 139
    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v5, v6}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v2, v5, v7, v8, v9}, Landroidx/core/app/m$g;->i(Ljava/lang/CharSequence;JLandroidx/core/app/u;)Landroidx/core/app/m$g;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    add-int/lit8 v0, v0, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_3
    return-object v2
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidStyleModel;
    .locals 1

    .line 1
    new-instance v0, Lapp/notifee/core/model/NotificationAndroidStyleModel;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private getBigPictureStyleTask(Lcom/google/common/util/concurrent/r;)Lcom/google/common/util/concurrent/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/r;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    new-instance v0, Lt4/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt4/a;-><init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private getBigTextStyle()Landroidx/core/app/m$c;
    .locals 4

    .line 1
    new-instance v0, Landroidx/core/app/m$c;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/core/app/m$c;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v2, "text"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroidx/core/app/m$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/m$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v2, "title"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Landroidx/core/app/m$c;->i(Ljava/lang/CharSequence;)Landroidx/core/app/m$c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_1
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 56
    .line 57
    const-string v2, "summary"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Landroidx/core/app/m$c;->j(Ljava/lang/CharSequence;)Landroidx/core/app/m$c;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_2
    return-object v0
.end method

.method private getInboxStyle()Landroidx/core/app/m$f;
    .locals 5

    .line 1
    new-instance v0, Landroidx/core/app/m$f;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/core/app/m$f;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v2, "title"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroidx/core/app/m$f;->i(Ljava/lang/CharSequence;)Landroidx/core/app/m$f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v2, "summary"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Landroidx/core/app/m$f;->j(Ljava/lang/CharSequence;)Landroidx/core/app/m$f;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_1
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 56
    .line 57
    const-string v2, "lines"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move v2, v3

    .line 64
    :goto_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ge v2, v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v4, v3}, LJ1/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v0, v4}, Landroidx/core/app/m$f;->h(Ljava/lang/CharSequence;)Landroidx/core/app/m$f;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-object v0
.end method

.method private getMessagingStyleTask(Lcom/google/common/util/concurrent/r;)Lcom/google/common/util/concurrent/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/r;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    new-instance v0, Lt4/b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lt4/b;-><init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;Lcom/google/common/util/concurrent/r;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private static getPerson(Lcom/google/common/util/concurrent/r;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/r;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    new-instance v0, Lt4/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lt4/c;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public getStyleTask(Lcom/google/common/util/concurrent/r;)Lcom/google/common/util/concurrent/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/r;",
            ")",
            "Lcom/google/common/util/concurrent/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-direct {p0, p1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getMessagingStyleTask(Lcom/google/common/util/concurrent/r;)Lcom/google/common/util/concurrent/p;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    invoke-direct {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getInboxStyle()Landroidx/core/app/m$f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_2
    invoke-direct {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getBigTextStyle()Landroidx/core/app/m$c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_3
    invoke-direct {p0, p1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getBigPictureStyleTask(Lcom/google/common/util/concurrent/r;)Lcom/google/common/util/concurrent/p;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Bundle;

    .line 8
    .line 9
    return-object v0
.end method
