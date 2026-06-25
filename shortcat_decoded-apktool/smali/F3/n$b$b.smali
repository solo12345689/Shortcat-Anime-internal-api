.class LF3/n$b$b;
.super Landroid/media/session/MediaSession$Callback;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/n$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:LF3/n$b;


# direct methods
.method constructor <init>(LF3/n$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/session/MediaSession$Callback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private a(LF3/n$c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LF3/n$c;->q(LF3/q$b;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private b()LF3/n$d;
    .locals 3

    .line 1
    iget-object v0, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 2
    .line 3
    iget-object v0, v0, LF3/n$b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 7
    .line 8
    iget-object v1, v1, LF3/n$b;->d:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LF3/n$d;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 20
    .line 21
    invoke-virtual {v1}, LF3/n$d;->n()LF3/n$b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
.end method

.method private c(LF3/n$c;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1}, LF3/n$c;->j()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v0, "android.media.session.MediaController"

    .line 19
    .line 20
    :cond_1
    new-instance v1, LF3/q$b;

    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-direct {v1, v0, v2, v2}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1}, LF3/n$c;->q(LF3/q$b;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 5

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    const-string v1, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    if-eqz p3, :cond_8

    .line 24
    .line 25
    new-instance p1, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LF3/n$d;->d()LF3/n$j;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, LF3/n$j;->c()LF3/c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "android.support.v4.media.session.EXTRA_BINDER"

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_0
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 48
    .line 49
    .line 50
    const-string v1, "android.support.v4.media.session.SESSION_TOKEN2"

    .line 51
    .line 52
    invoke-virtual {p2}, LF3/n$j;->d()LY3/b;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p1, v1, p2}, LY3/a;->c(Landroid/os/Bundle;Ljava/lang/String;LY3/b;)V

    .line 57
    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p3, p2, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_2
    const-string v1, "android.support.v4.media.session.command.ADD_QUEUE_ITEM"

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    const-string v3, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    if-eqz p2, :cond_8

    .line 76
    .line 77
    :try_start_1
    iget-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 78
    .line 79
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget-object p3, LF3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    invoke-static {p2, p3}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, LF3/l;

    .line 90
    .line 91
    invoke-virtual {p1, p2}, LF3/n$b;->b(LF3/l;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_3
    const-string v1, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    const-string v4, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    if-eqz p2, :cond_8

    .line 107
    .line 108
    :try_start_2
    iget-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 109
    .line 110
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    sget-object v1, LF3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 115
    .line 116
    invoke-static {p3, v1}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p3, LF3/l;

    .line 121
    .line 122
    invoke-virtual {p2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-virtual {p1, p3, p2}, LF3/n$b;->c(LF3/l;I)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    const-string v1, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    if-eqz p2, :cond_8

    .line 139
    .line 140
    iget-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 141
    .line 142
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    sget-object p3, LF3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 147
    .line 148
    invoke-static {p2, p3}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, LF3/l;

    .line 153
    .line 154
    invoke-virtual {p1, p2}, LF3/n$b;->q(LF3/l;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    const-string v1, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    iget-object p1, v0, LF3/n$d;->i:Ljava/util/List;

    .line 167
    .line 168
    if-eqz p1, :cond_8

    .line 169
    .line 170
    if-eqz p2, :cond_8

    .line 171
    .line 172
    const/4 p3, -0x1

    .line 173
    invoke-virtual {p2, v4, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-ltz p2, :cond_6

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    if-ge p2, p3, :cond_6

    .line 184
    .line 185
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    move-object v2, p1

    .line 190
    check-cast v2, LF3/n$h;

    .line 191
    .line 192
    :cond_6
    if-eqz v2, :cond_8

    .line 193
    .line 194
    iget-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 195
    .line 196
    invoke-virtual {v2}, LF3/n$h;->c()LF3/l;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p1, p2}, LF3/n$b;->q(LF3/l;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 205
    .line 206
    invoke-virtual {v1, p1, p2, p3}, LF3/n$b;->d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    :try_end_2
    .catch Landroid/os/BadParcelableException; {:try_start_2 .. :try_end_2} :catch_0

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :catch_0
    const-string p1, "MediaSessionCompat"

    .line 211
    .line 212
    const-string p2, "Could not unparcel the extra data."

    .line 213
    .line 214
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    :cond_8
    :goto_1
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    const-string v1, "android.support.v4.media.session.action.PLAY_FROM_URI"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    const-string v2, "android.support.v4.media.session.action.ARGUMENT_URI"

    .line 21
    .line 22
    const-string v3, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-eqz p2, :cond_b

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/net/Uri;

    .line 33
    .line 34
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 42
    .line 43
    invoke-virtual {v1, p1, p2}, LF3/n$b;->l(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_1
    const-string v1, "android.support.v4.media.session.action.PREPARE"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 57
    .line 58
    invoke-virtual {p1}, LF3/n$b;->m()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_2
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    if-eqz p2, :cond_b

    .line 72
    .line 73
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 87
    .line 88
    invoke-virtual {v1, p1, p2}, LF3/n$b;->n(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_3
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    if-eqz p2, :cond_b

    .line 102
    .line 103
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_QUERY"

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 117
    .line 118
    invoke-virtual {v1, p1, p2}, LF3/n$b;->o(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_4
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_URI"

    .line 124
    .line 125
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    if-eqz p2, :cond_b

    .line 132
    .line 133
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Landroid/net/Uri;

    .line 138
    .line 139
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 147
    .line 148
    invoke-virtual {v1, p1, p2}, LF3/n$b;->p(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_5
    const-string v1, "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"

    .line 154
    .line 155
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_6

    .line 160
    .line 161
    if-eqz p2, :cond_b

    .line 162
    .line 163
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"

    .line 164
    .line 165
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    iget-object p2, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 170
    .line 171
    invoke-virtual {p2, p1}, LF3/n$b;->t(Z)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_6
    const-string v1, "android.support.v4.media.session.action.SET_REPEAT_MODE"

    .line 177
    .line 178
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    if-eqz p2, :cond_b

    .line 185
    .line 186
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"

    .line 187
    .line 188
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iget-object p2, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 193
    .line 194
    invoke-virtual {p2, p1}, LF3/n$b;->x(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_7
    const-string v1, "android.support.v4.media.session.action.SET_SHUFFLE_MODE"

    .line 199
    .line 200
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_8

    .line 205
    .line 206
    if-eqz p2, :cond_b

    .line 207
    .line 208
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"

    .line 209
    .line 210
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iget-object p2, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 215
    .line 216
    invoke-virtual {p2, p1}, LF3/n$b;->y(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_8
    const-string v1, "android.support.v4.media.session.action.SET_RATING"

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_9

    .line 227
    .line 228
    if-eqz p2, :cond_b

    .line 229
    .line 230
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_RATING"

    .line 231
    .line 232
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    sget-object v1, LF3/w;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 237
    .line 238
    invoke-static {p1, v1}, LF3/d;->a(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, LF3/w;

    .line 243
    .line 244
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 252
    .line 253
    invoke-virtual {v1, p1, p2}, LF3/n$b;->w(LF3/w;Landroid/os/Bundle;)V

    .line 254
    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_9
    const-string v1, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"

    .line 258
    .line 259
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_a

    .line 264
    .line 265
    if-eqz p2, :cond_b

    .line 266
    .line 267
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"

    .line 268
    .line 269
    const/high16 v1, 0x3f800000    # 1.0f

    .line 270
    .line 271
    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    iget-object p2, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 276
    .line 277
    invoke-virtual {p2, p1}, LF3/n$b;->u(F)V

    .line 278
    .line 279
    .line 280
    goto :goto_0

    .line 281
    :cond_a
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 282
    .line 283
    invoke-virtual {v1, p1, p2}, LF3/n$b;->e(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    .line 284
    .line 285
    .line 286
    goto :goto_0

    .line 287
    :catch_0
    const-string p1, "MediaSessionCompat"

    .line 288
    .line 289
    const-string p2, "Could not unparcel the data."

    .line 290
    .line 291
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    :cond_b
    :goto_0
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public onFastForward()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->f()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onMediaButtonEvent(Landroid/content/Intent;)Z
    .locals 3

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, LF3/n$b;->g(Landroid/content/Intent;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 19
    .line 20
    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    invoke-super {p0, p1}, Landroid/media/session/MediaSession$Callback;->onMediaButtonEvent(Landroid/content/Intent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1

    .line 31
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 32
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->h()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onPlay()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->i()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->j(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->k(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->l(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onPrepare()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->m()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->n(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->o(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, LF3/n$b;->p(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onRewind()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->r()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSeekTo(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, LF3/n$b;->s(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSetPlaybackSpeed(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, LF3/n$b;->u(F)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSetRating(Landroid/media/Rating;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-static {p1}, LF3/w;->a(Ljava/lang/Object;)LF3/w;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, LF3/n$b;->v(LF3/w;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onSkipToNext()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->z()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSkipToPrevious()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->A()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onSkipToQueueItem(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, LF3/n$b;->B(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-direct {p0}, LF3/n$b$b;->b()LF3/n$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, v0}, LF3/n$b$b;->c(LF3/n$c;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/n$b$b;->a:LF3/n$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/n$b;->C()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, LF3/n$b$b;->a(LF3/n$c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
