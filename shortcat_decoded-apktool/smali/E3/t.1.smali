.class abstract LE3/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/t$b;
    }
.end annotation


# static fields
.field public static final a:LP9/w;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    .line 1
    const-string v25, "android.media.metadata.DOWNLOAD_STATUS"

    .line 2
    .line 3
    const-string v26, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 4
    .line 5
    const-string v1, "android.media.metadata.COMPOSER"

    .line 6
    .line 7
    const-string v2, "android.media.metadata.COMPILATION"

    .line 8
    .line 9
    const-string v3, "android.media.metadata.DATE"

    .line 10
    .line 11
    const-string v4, "android.media.metadata.YEAR"

    .line 12
    .line 13
    const-string v5, "android.media.metadata.GENRE"

    .line 14
    .line 15
    const-string v6, "android.media.metadata.TRACK_NUMBER"

    .line 16
    .line 17
    const-string v7, "android.media.metadata.NUM_TRACKS"

    .line 18
    .line 19
    const-string v8, "android.media.metadata.DISC_NUMBER"

    .line 20
    .line 21
    const-string v9, "android.media.metadata.ALBUM_ARTIST"

    .line 22
    .line 23
    const-string v10, "android.media.metadata.ART"

    .line 24
    .line 25
    const-string v11, "android.media.metadata.ART_URI"

    .line 26
    .line 27
    const-string v12, "android.media.metadata.ALBUM_ART"

    .line 28
    .line 29
    const-string v13, "android.media.metadata.ALBUM_ART_URI"

    .line 30
    .line 31
    const-string v14, "android.media.metadata.USER_RATING"

    .line 32
    .line 33
    const-string v15, "android.media.metadata.RATING"

    .line 34
    .line 35
    const-string v16, "android.media.metadata.DISPLAY_TITLE"

    .line 36
    .line 37
    const-string v17, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 38
    .line 39
    const-string v18, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 40
    .line 41
    const-string v19, "android.media.metadata.DISPLAY_ICON"

    .line 42
    .line 43
    const-string v20, "android.media.metadata.DISPLAY_ICON_URI"

    .line 44
    .line 45
    const-string v21, "android.media.metadata.MEDIA_ID"

    .line 46
    .line 47
    const-string v22, "android.media.metadata.MEDIA_URI"

    .line 48
    .line 49
    const-string v23, "android.media.metadata.BT_FOLDER_TYPE"

    .line 50
    .line 51
    const-string v24, "android.media.metadata.ADVERTISEMENT"

    .line 52
    .line 53
    filled-new-array/range {v1 .. v26}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v33

    .line 57
    const-string v27, "android.media.metadata.TITLE"

    .line 58
    .line 59
    const-string v28, "android.media.metadata.ARTIST"

    .line 60
    .line 61
    const-string v29, "android.media.metadata.DURATION"

    .line 62
    .line 63
    const-string v30, "android.media.metadata.ALBUM"

    .line 64
    .line 65
    const-string v31, "android.media.metadata.AUTHOR"

    .line 66
    .line 67
    const-string v32, "android.media.metadata.WRITER"

    .line 68
    .line 69
    invoke-static/range {v27 .. v33}, LP9/w;->G(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)LP9/w;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, LE3/t;->a:LP9/w;

    .line 74
    .line 75
    return-void
.end method

.method public static A(LF3/l;I)Lq2/I;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, LE3/t;->B(LF3/l;IZZ)Lq2/I;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static B(LF3/l;IZZ)Lq2/I;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/I;->K:Lq2/I;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/I$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/I$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LF3/l;->i()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lq2/I$b;->o0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, LF3/l;->b()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lq2/I$b;->W(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, LF3/l;->e()Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Lq2/I$b;->S(Landroid/net/Uri;)Lq2/I$b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p1}, LF3/w;->m(I)LF3/w;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, LE3/t;->R(LF3/w;)Lq2/S;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Lq2/I$b;->u0(Lq2/S;)Lq2/I$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LF3/l;->d()Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    :try_start_0
    invoke-static {p1}, LE3/t;->f(Landroid/graphics/Bitmap;)[B

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p1

    .line 59
    const-string v2, "LegacyConversions"

    .line 60
    .line 61
    const-string v3, "Failed to convert iconBitmap to artworkData"

    .line 62
    .line 63
    invoke-static {v2, v3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v1

    .line 67
    :goto_0
    const/4 v2, 0x3

    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, p1, v2}, Lq2/I$b;->R([BLjava/lang/Integer;)Lq2/I$b;

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, LF3/l;->c()Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 83
    .line 84
    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    if-eqz v1, :cond_3

    .line 88
    .line 89
    const-string p1, "android.media.extra.BT_FOLDER_TYPE"

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    invoke-static {v2, v3}, LE3/t;->l(J)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Lq2/I$b;->b0(Ljava/lang/Integer;)Lq2/I$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, p1}, Lq2/I$b;->d0(Ljava/lang/Boolean;)Lq2/I$b;

    .line 120
    .line 121
    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    const-string p1, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_4

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    long-to-int p2, v2

    .line 137
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {v0, p2}, Lq2/I$b;->f0(Ljava/lang/Integer;)Lq2/I$b;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    if-eqz v1, :cond_5

    .line 148
    .line 149
    const-string p1, "androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-eqz p2, :cond_5

    .line 156
    .line 157
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Ljava/util/Collection;

    .line 166
    .line 167
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v0, p1}, Lq2/I$b;->p0(Ljava/util/List;)Lq2/I$b;

    .line 172
    .line 173
    .line 174
    :cond_5
    if-eqz v1, :cond_6

    .line 175
    .line 176
    const-string p1, "androidx.media3.mediadescriptioncompat.title"

    .line 177
    .line 178
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    if-eqz p2, :cond_6

    .line 183
    .line 184
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v0, p2}, Lq2/I$b;->q0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, LF3/l;->j()Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {v0, p0}, Lq2/I$b;->Y(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_6
    invoke-virtual {p0}, LF3/l;->j()Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {v0, p0}, Lq2/I$b;->q0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 207
    .line 208
    .line 209
    :goto_2
    if-eqz v1, :cond_7

    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-nez p0, :cond_7

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Lq2/I$b;->a0(Landroid/os/Bundle;)Lq2/I$b;

    .line 218
    .line 219
    .line 220
    :cond_7
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {v0, p0}, Lq2/I$b;->e0(Ljava/lang/Boolean;)Lq2/I$b;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Lq2/I$b;->J()Lq2/I;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0
.end method

.method public static C(LF3/m;I)Lq2/I;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/I;->K:Lq2/I;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/I$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/I$b;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "android.media.metadata.DISPLAY_TITLE"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x3

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const-string v3, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 21
    .line 22
    invoke-virtual {p0, v3}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 27
    .line 28
    invoke-virtual {p0, v4}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-array v1, v2, [Ljava/lang/CharSequence;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    move v4, v3

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v4, v2, :cond_3

    .line 39
    .line 40
    sget-object v6, LF3/m;->d:[Ljava/lang/String;

    .line 41
    .line 42
    array-length v7, v6

    .line 43
    if-ge v5, v7, :cond_3

    .line 44
    .line 45
    add-int/lit8 v7, v5, 0x1

    .line 46
    .line 47
    aget-object v5, v6, v5

    .line 48
    .line 49
    invoke-virtual {p0, v5}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_2

    .line 58
    .line 59
    add-int/lit8 v6, v4, 0x1

    .line 60
    .line 61
    aput-object v5, v1, v4

    .line 62
    .line 63
    move v4, v6

    .line 64
    :cond_2
    move v5, v7

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    aget-object v3, v1, v3

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    aget-object v4, v1, v4

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    aget-object v1, v1, v5

    .line 73
    .line 74
    move-object v8, v4

    .line 75
    move-object v4, v1

    .line 76
    move-object v1, v3

    .line 77
    move-object v3, v8

    .line 78
    :goto_1
    const-string v5, "android.media.metadata.TITLE"

    .line 79
    .line 80
    invoke-virtual {p0, v5}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v5, v1

    .line 88
    :goto_2
    invoke-virtual {v0, v5}, Lq2/I$b;->q0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5, v1}, Lq2/I$b;->Y(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1, v3}, Lq2/I$b;->o0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1, v4}, Lq2/I$b;->W(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v3, "android.media.metadata.ARTIST"

    .line 105
    .line 106
    invoke-virtual {p0, v3}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v1, v3}, Lq2/I$b;->Q(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v3, "android.media.metadata.ALBUM"

    .line 115
    .line 116
    invoke-virtual {p0, v3}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1, v3}, Lq2/I$b;->P(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v3, "android.media.metadata.ALBUM_ARTIST"

    .line 125
    .line 126
    invoke-virtual {p0, v3}, LF3/m;->i(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v3}, Lq2/I$b;->O(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v3, "android.media.metadata.RATING"

    .line 135
    .line 136
    invoke-virtual {p0, v3}, LF3/m;->g(Ljava/lang/String;)LF3/w;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-static {v3}, LE3/t;->R(LF3/w;)Lq2/S;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v1, v3}, Lq2/I$b;->g0(Lq2/S;)Lq2/I$b;

    .line 145
    .line 146
    .line 147
    const-string v1, "android.media.metadata.DURATION"

    .line 148
    .line 149
    invoke-virtual {p0, v1}, LF3/m;->a(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    invoke-virtual {p0, v1}, LF3/m;->e(Ljava/lang/String;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    const-wide/16 v5, 0x0

    .line 160
    .line 161
    cmp-long v1, v3, v5

    .line 162
    .line 163
    if-ltz v1, :cond_5

    .line 164
    .line 165
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Lq2/I$b;->Z(Ljava/lang/Long;)Lq2/I$b;

    .line 170
    .line 171
    .line 172
    :cond_5
    const-string v1, "android.media.metadata.USER_RATING"

    .line 173
    .line 174
    invoke-virtual {p0, v1}, LF3/m;->g(Ljava/lang/String;)LF3/w;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, LE3/t;->R(LF3/w;)Lq2/S;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-eqz v1, :cond_6

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lq2/I$b;->u0(Lq2/S;)Lq2/I$b;

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    invoke-static {p1}, LF3/w;->m(I)LF3/w;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {p1}, LE3/t;->R(LF3/w;)Lq2/S;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {v0, p1}, Lq2/I$b;->u0(Lq2/S;)Lq2/I$b;

    .line 197
    .line 198
    .line 199
    :goto_3
    const-string p1, "android.media.metadata.YEAR"

    .line 200
    .line 201
    invoke-virtual {p0, p1}, LF3/m;->a(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_7

    .line 206
    .line 207
    invoke-virtual {p0, p1}, LF3/m;->e(Ljava/lang/String;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v3

    .line 211
    long-to-int p1, v3

    .line 212
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v0, p1}, Lq2/I$b;->j0(Ljava/lang/Integer;)Lq2/I$b;

    .line 217
    .line 218
    .line 219
    :cond_7
    const-string p1, "android.media.metadata.ALBUM_ART_URI"

    .line 220
    .line 221
    const-string v1, "android.media.metadata.ART_URI"

    .line 222
    .line 223
    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    .line 224
    .line 225
    filled-new-array {v3, p1, v1}, [Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p0, p1}, LE3/t;->e0(LF3/m;[Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    if-eqz p1, :cond_8

    .line 234
    .line 235
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v0, p1}, Lq2/I$b;->S(Landroid/net/Uri;)Lq2/I$b;

    .line 240
    .line 241
    .line 242
    :cond_8
    const-string p1, "android.media.metadata.ALBUM_ART"

    .line 243
    .line 244
    const-string v1, "android.media.metadata.ART"

    .line 245
    .line 246
    const-string v3, "android.media.metadata.DISPLAY_ICON"

    .line 247
    .line 248
    filled-new-array {v3, p1, v1}, [Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-static {p0, p1}, LE3/t;->d0(LF3/m;[Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-eqz p1, :cond_9

    .line 257
    .line 258
    :try_start_0
    invoke-static {p1}, LE3/t;->f(Landroid/graphics/Bitmap;)[B

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v0, p1, v1}, Lq2/I$b;->R([BLjava/lang/Integer;)Lq2/I$b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :catch_0
    move-exception p1

    .line 271
    const-string v1, "LegacyConversions"

    .line 272
    .line 273
    const-string v2, "Failed to convert artworkBitmap to artworkData"

    .line 274
    .line 275
    invoke-static {v1, v2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    :cond_9
    :goto_4
    const-string p1, "android.media.metadata.BT_FOLDER_TYPE"

    .line 279
    .line 280
    invoke-virtual {p0, p1}, LF3/m;->a(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v0, v2}, Lq2/I$b;->d0(Ljava/lang/Boolean;)Lq2/I$b;

    .line 289
    .line 290
    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    invoke-virtual {p0, p1}, LF3/m;->e(Ljava/lang/String;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v1

    .line 297
    invoke-static {v1, v2}, LE3/t;->l(J)I

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {v0, p1}, Lq2/I$b;->b0(Ljava/lang/Integer;)Lq2/I$b;

    .line 306
    .line 307
    .line 308
    :cond_a
    const-string p1, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 309
    .line 310
    invoke-virtual {p0, p1}, LF3/m;->a(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_b

    .line 315
    .line 316
    invoke-virtual {p0, p1}, LF3/m;->e(Ljava/lang/String;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v1

    .line 320
    long-to-int p1, v1

    .line 321
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {v0, p1}, Lq2/I$b;->f0(Ljava/lang/Integer;)Lq2/I$b;

    .line 326
    .line 327
    .line 328
    :cond_b
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {v0, p1}, Lq2/I$b;->e0(Ljava/lang/Boolean;)Lq2/I$b;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, LF3/m;->d()Landroid/os/Bundle;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    sget-object p1, LE3/t;->a:LP9/w;

    .line 338
    .line 339
    invoke-virtual {p1}, LP9/w;->l()LP9/X;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_c

    .line 348
    .line 349
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_c
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-nez p1, :cond_d

    .line 364
    .line 365
    invoke-virtual {v0, p0}, Lq2/I$b;->a0(Landroid/os/Bundle;)Lq2/I$b;

    .line 366
    .line 367
    .line 368
    :cond_d
    invoke-virtual {v0}, Lq2/I$b;->J()Lq2/I;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    return-object p0
.end method

.method public static D(Ljava/lang/CharSequence;)Lq2/I;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/I;->K:Lq2/I;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/I$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/I$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lq2/I$b;->q0(Ljava/lang/CharSequence;)Lq2/I$b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lq2/I$b;->J()Lq2/I;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static E(Lq2/I;Ljava/lang/String;Landroid/net/Uri;JLandroid/graphics/Bitmap;)LF3/m;
    .locals 3

    .line 1
    new-instance v0, LF3/m$b;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/m$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.media.metadata.MEDIA_ID"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, LF3/m$b;->e(Ljava/lang/String;Ljava/lang/String;)LF3/m$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lq2/I;->a:Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v1, "android.media.metadata.TITLE"

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lq2/I;->e:Ljava/lang/CharSequence;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v1, "android.media.metadata.DISPLAY_TITLE"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lq2/I;->f:Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const-string v1, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lq2/I;->g:Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const-string v1, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v0, p0, Lq2/I;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const-string v1, "android.media.metadata.ARTIST"

    .line 53
    .line 54
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 55
    .line 56
    .line 57
    :cond_4
    iget-object v0, p0, Lq2/I;->c:Ljava/lang/CharSequence;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    const-string v1, "android.media.metadata.ALBUM"

    .line 62
    .line 63
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 64
    .line 65
    .line 66
    :cond_5
    iget-object v0, p0, Lq2/I;->d:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v0, :cond_6

    .line 69
    .line 70
    const-string v1, "android.media.metadata.ALBUM_ARTIST"

    .line 71
    .line 72
    invoke-virtual {p1, v1, v0}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 73
    .line 74
    .line 75
    :cond_6
    iget-object v0, p0, Lq2/I;->t:Ljava/lang/Integer;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    int-to-long v0, v0

    .line 84
    const-string v2, "android.media.metadata.YEAR"

    .line 85
    .line 86
    invoke-virtual {p1, v2, v0, v1}, LF3/m$b;->c(Ljava/lang/String;J)LF3/m$b;

    .line 87
    .line 88
    .line 89
    :cond_7
    if-eqz p2, :cond_8

    .line 90
    .line 91
    const-string v0, "android.media.metadata.MEDIA_URI"

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, v0, p2}, LF3/m$b;->e(Ljava/lang/String;Ljava/lang/String;)LF3/m$b;

    .line 98
    .line 99
    .line 100
    :cond_8
    iget-object p2, p0, Lq2/I;->m:Landroid/net/Uri;

    .line 101
    .line 102
    if-eqz p2, :cond_9

    .line 103
    .line 104
    const-string v0, "android.media.metadata.DISPLAY_ICON_URI"

    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p1, v0, p2}, LF3/m$b;->e(Ljava/lang/String;Ljava/lang/String;)LF3/m$b;

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lq2/I;->m:Landroid/net/Uri;

    .line 114
    .line 115
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    const-string v0, "android.media.metadata.ALBUM_ART_URI"

    .line 120
    .line 121
    invoke-virtual {p1, v0, p2}, LF3/m$b;->e(Ljava/lang/String;Ljava/lang/String;)LF3/m$b;

    .line 122
    .line 123
    .line 124
    iget-object p2, p0, Lq2/I;->m:Landroid/net/Uri;

    .line 125
    .line 126
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    const-string v0, "android.media.metadata.ART_URI"

    .line 131
    .line 132
    invoke-virtual {p1, v0, p2}, LF3/m$b;->e(Ljava/lang/String;Ljava/lang/String;)LF3/m$b;

    .line 133
    .line 134
    .line 135
    :cond_9
    if-eqz p5, :cond_a

    .line 136
    .line 137
    const-string p2, "android.media.metadata.DISPLAY_ICON"

    .line 138
    .line 139
    invoke-virtual {p1, p2, p5}, LF3/m$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)LF3/m$b;

    .line 140
    .line 141
    .line 142
    const-string p2, "android.media.metadata.ALBUM_ART"

    .line 143
    .line 144
    invoke-virtual {p1, p2, p5}, LF3/m$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)LF3/m$b;

    .line 145
    .line 146
    .line 147
    :cond_a
    iget-object p2, p0, Lq2/I;->p:Ljava/lang/Integer;

    .line 148
    .line 149
    if-eqz p2, :cond_b

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    const/4 p5, -0x1

    .line 156
    if-eq p2, p5, :cond_b

    .line 157
    .line 158
    iget-object p2, p0, Lq2/I;->p:Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-static {p2}, LE3/t;->k(I)J

    .line 165
    .line 166
    .line 167
    move-result-wide v0

    .line 168
    const-string p2, "android.media.metadata.BT_FOLDER_TYPE"

    .line 169
    .line 170
    invoke-virtual {p1, p2, v0, v1}, LF3/m$b;->c(Ljava/lang/String;J)LF3/m$b;

    .line 171
    .line 172
    .line 173
    :cond_b
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    cmp-long p2, p3, v0

    .line 179
    .line 180
    if-nez p2, :cond_c

    .line 181
    .line 182
    iget-object p2, p0, Lq2/I;->h:Ljava/lang/Long;

    .line 183
    .line 184
    if-eqz p2, :cond_c

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 187
    .line 188
    .line 189
    move-result-wide p3

    .line 190
    :cond_c
    cmp-long p2, p3, v0

    .line 191
    .line 192
    if-eqz p2, :cond_d

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_d
    const-wide/16 p3, -0x1

    .line 196
    .line 197
    :goto_0
    const-string p2, "android.media.metadata.DURATION"

    .line 198
    .line 199
    invoke-virtual {p1, p2, p3, p4}, LF3/m$b;->c(Ljava/lang/String;J)LF3/m$b;

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lq2/I;->i:Lq2/S;

    .line 203
    .line 204
    invoke-static {p2}, LE3/t;->S(Lq2/S;)LF3/w;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-eqz p2, :cond_e

    .line 209
    .line 210
    const-string p3, "android.media.metadata.USER_RATING"

    .line 211
    .line 212
    invoke-virtual {p1, p3, p2}, LF3/m$b;->d(Ljava/lang/String;LF3/w;)LF3/m$b;

    .line 213
    .line 214
    .line 215
    :cond_e
    iget-object p2, p0, Lq2/I;->j:Lq2/S;

    .line 216
    .line 217
    invoke-static {p2}, LE3/t;->S(Lq2/S;)LF3/w;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    if-eqz p2, :cond_f

    .line 222
    .line 223
    const-string p3, "android.media.metadata.RATING"

    .line 224
    .line 225
    invoke-virtual {p1, p3, p2}, LF3/m$b;->d(Ljava/lang/String;LF3/w;)LF3/m$b;

    .line 226
    .line 227
    .line 228
    :cond_f
    iget-object p2, p0, Lq2/I;->H:Ljava/lang/Integer;

    .line 229
    .line 230
    if-eqz p2, :cond_10

    .line 231
    .line 232
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    int-to-long p2, p2

    .line 237
    const-string p4, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 238
    .line 239
    invoke-virtual {p1, p4, p2, p3}, LF3/m$b;->c(Ljava/lang/String;J)LF3/m$b;

    .line 240
    .line 241
    .line 242
    :cond_10
    iget-object p2, p0, Lq2/I;->I:Landroid/os/Bundle;

    .line 243
    .line 244
    if-eqz p2, :cond_15

    .line 245
    .line 246
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    :cond_11
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result p3

    .line 258
    if-eqz p3, :cond_15

    .line 259
    .line 260
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p3

    .line 264
    check-cast p3, Ljava/lang/String;

    .line 265
    .line 266
    iget-object p4, p0, Lq2/I;->I:Landroid/os/Bundle;

    .line 267
    .line 268
    invoke-virtual {p4, p3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p4

    .line 272
    if-eqz p4, :cond_14

    .line 273
    .line 274
    instance-of p5, p4, Ljava/lang/CharSequence;

    .line 275
    .line 276
    if-eqz p5, :cond_12

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_12
    instance-of p5, p4, Ljava/lang/Byte;

    .line 280
    .line 281
    if-nez p5, :cond_13

    .line 282
    .line 283
    instance-of p5, p4, Ljava/lang/Short;

    .line 284
    .line 285
    if-nez p5, :cond_13

    .line 286
    .line 287
    instance-of p5, p4, Ljava/lang/Integer;

    .line 288
    .line 289
    if-nez p5, :cond_13

    .line 290
    .line 291
    instance-of p5, p4, Ljava/lang/Long;

    .line 292
    .line 293
    if-eqz p5, :cond_11

    .line 294
    .line 295
    :cond_13
    check-cast p4, Ljava/lang/Number;

    .line 296
    .line 297
    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    .line 298
    .line 299
    .line 300
    move-result-wide p4

    .line 301
    invoke-virtual {p1, p3, p4, p5}, LF3/m$b;->c(Ljava/lang/String;J)LF3/m$b;

    .line 302
    .line 303
    .line 304
    goto :goto_1

    .line 305
    :cond_14
    :goto_2
    check-cast p4, Ljava/lang/CharSequence;

    .line 306
    .line 307
    invoke-virtual {p1, p3, p4}, LF3/m$b;->f(Ljava/lang/String;Ljava/lang/CharSequence;)LF3/m$b;

    .line 308
    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_15
    invoke-virtual {p1}, LF3/m$b;->a()LF3/m;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0
.end method

.method public static F(I)Lq2/Y$b;
    .locals 10

    .line 1
    new-instance v0, Lq2/Y$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v8, Lq2/b;->g:Lq2/b;

    .line 7
    .line 8
    const/4 v9, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    move v3, p0

    .line 19
    invoke-virtual/range {v0 .. v9}, Lq2/Y$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJLq2/b;Z)Lq2/Y$b;

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static G(LF3/v;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/v;->o()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    return v0

    .line 13
    :pswitch_1
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static H(LF3/v;Landroid/content/Context;)Lq2/N;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, LF3/v;->o()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x7

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p0}, LF3/v;->h()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, LF3/v;->g()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, LE3/t;->X(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1, p1}, LE3/t;->i0(ILandroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_1
    invoke-virtual {p0}, LF3/v;->i()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v2, Lq2/N;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v1, v0

    .line 44
    :goto_0
    invoke-virtual {p0}, LF3/v;->g()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, LE3/t;->I(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 56
    .line 57
    :goto_1
    invoke-direct {v2, v1, v0, p0, p1}, Lq2/N;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILandroid/os/Bundle;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_4
    :goto_2
    return-object v0
.end method

.method private static I(I)I
    .locals 1

    .line 1
    invoke-static {p0}, LE3/t;->X(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x5

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/16 p0, 0x3e8

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const/16 p0, 0x7d0

    .line 16
    .line 17
    return p0
.end method

.method public static J(LF3/v;)Lq2/O;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/O;->d:Lq2/O;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/O;

    .line 7
    .line 8
    invoke-virtual {p0}, LF3/v;->k()F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-direct {v0, p0}, Lq2/O;-><init>(F)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static K(LF3/v;LF3/m;J)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p0, p1, p2, p3}, LE3/t;->n(LF3/v;LF3/m;J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0}, LF3/v;->o()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 p3, 0x4

    .line 14
    const/4 v1, 0x3

    .line 15
    packed-switch p2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p1, LE3/t$b;

    .line 19
    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string p3, "Invalid state of PlaybackStateCompat: "

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LF3/v;->o()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p0, p2}, LE3/t$b;-><init>(Ljava/lang/String;LE3/t$a;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_0
    const/4 p0, 0x2

    .line 47
    return p0

    .line 48
    :pswitch_1
    return v1

    .line 49
    :pswitch_2
    if-eqz p1, :cond_1

    .line 50
    .line 51
    return p3

    .line 52
    :cond_1
    return v1

    .line 53
    :pswitch_3
    if-eqz p1, :cond_2

    .line 54
    .line 55
    return p3

    .line 56
    :cond_2
    :pswitch_4
    return v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static L(I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p0, v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Unrecognized RepeatMode: "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v1, "LegacyConversions"

    .line 33
    .line 34
    invoke-static {v1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :cond_0
    return v1

    .line 39
    :cond_1
    return v0
.end method

.method public static M(Z)I
    .locals 0

    .line 1
    return p0
.end method

.method public static N(Lq2/P;Z)I
    .locals 3

    .line 1
    invoke-interface {p0}, Lq2/P;->y()Lq2/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x7

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-interface {p0}, Lq2/P;->p()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_6

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq p0, v1, :cond_4

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    if-eq p0, v2, :cond_2

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    return v0

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "Unrecognized State: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    if-eqz p1, :cond_3

    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    return v2

    .line 53
    :cond_4
    if-eqz p1, :cond_5

    .line 54
    .line 55
    return v1

    .line 56
    :cond_5
    const/4 p0, 0x6

    .line 57
    return p0

    .line 58
    :cond_6
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static O(LF3/v;IJZ)Lq2/P$b;
    .locals 12

    .line 1
    new-instance v0, Lq2/P$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/P$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    move-wide v3, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, LF3/v;->b()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    :goto_0
    invoke-static {p0}, LE3/t;->G(LF3/v;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const-wide/16 v5, 0x4

    .line 21
    .line 22
    invoke-static {v3, v4, v5, v6}, LE3/t;->k0(JJ)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz v7, :cond_1

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    :cond_1
    const-wide/16 v9, 0x2

    .line 32
    .line 33
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    if-nez p0, :cond_3

    .line 40
    .line 41
    :cond_2
    const-wide/16 v9, 0x200

    .line 42
    .line 43
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v8}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 50
    .line 51
    .line 52
    :cond_4
    const-wide/16 v9, 0x4000

    .line 53
    .line 54
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 v7, 0x2

    .line 59
    if-eqz p0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, v7}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 62
    .line 63
    .line 64
    :cond_5
    const-wide/32 v9, 0x8000

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    const-wide/16 v9, 0x400

    .line 74
    .line 75
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_8

    .line 80
    .line 81
    :cond_6
    const-wide/32 v9, 0x10000

    .line 82
    .line 83
    .line 84
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_7

    .line 89
    .line 90
    const-wide/16 v9, 0x800

    .line 91
    .line 92
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_8

    .line 97
    .line 98
    :cond_7
    const-wide/32 v9, 0x20000

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_9

    .line 106
    .line 107
    const-wide/16 v9, 0x2000

    .line 108
    .line 109
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_9

    .line 114
    .line 115
    :cond_8
    const/16 p0, 0x1f

    .line 116
    .line 117
    filled-new-array {p0, v7}, [I

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 122
    .line 123
    .line 124
    :cond_9
    const-wide/16 v9, 0x8

    .line 125
    .line 126
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_a

    .line 131
    .line 132
    const/16 p0, 0xb

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 135
    .line 136
    .line 137
    :cond_a
    const-wide/16 v9, 0x40

    .line 138
    .line 139
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_b

    .line 144
    .line 145
    const/16 p0, 0xc

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 148
    .line 149
    .line 150
    :cond_b
    const-wide/16 v9, 0x100

    .line 151
    .line 152
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eqz p0, :cond_c

    .line 157
    .line 158
    const/4 p0, 0x5

    .line 159
    const/4 v9, 0x4

    .line 160
    filled-new-array {p0, v9}, [I

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 165
    .line 166
    .line 167
    :cond_c
    const-wide/16 v9, 0x20

    .line 168
    .line 169
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_d

    .line 174
    .line 175
    const/16 p0, 0x9

    .line 176
    .line 177
    const/16 v9, 0x8

    .line 178
    .line 179
    filled-new-array {p0, v9}, [I

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 184
    .line 185
    .line 186
    :cond_d
    const-wide/16 v9, 0x10

    .line 187
    .line 188
    invoke-static {v3, v4, v9, v10}, LE3/t;->k0(JJ)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    const/4 v9, 0x6

    .line 193
    if-eqz p0, :cond_e

    .line 194
    .line 195
    const/4 p0, 0x7

    .line 196
    filled-new-array {p0, v9}, [I

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 201
    .line 202
    .line 203
    :cond_e
    const-wide/32 v10, 0x400000

    .line 204
    .line 205
    .line 206
    invoke-static {v3, v4, v10, v11}, LE3/t;->k0(JJ)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_f

    .line 211
    .line 212
    const/16 p0, 0xd

    .line 213
    .line 214
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 215
    .line 216
    .line 217
    :cond_f
    const-wide/16 v10, 0x1

    .line 218
    .line 219
    invoke-static {v3, v4, v10, v11}, LE3/t;->k0(JJ)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_10

    .line 224
    .line 225
    const/4 p0, 0x3

    .line 226
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 227
    .line 228
    .line 229
    :cond_10
    const/16 p0, 0x22

    .line 230
    .line 231
    const/16 v10, 0x1a

    .line 232
    .line 233
    if-ne p1, v8, :cond_11

    .line 234
    .line 235
    filled-new-array {v10, p0}, [I

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_11
    if-ne p1, v7, :cond_12

    .line 244
    .line 245
    const/16 p1, 0x19

    .line 246
    .line 247
    const/16 v7, 0x21

    .line 248
    .line 249
    filled-new-array {v10, p0, p1, v7}, [I

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 254
    .line 255
    .line 256
    :cond_12
    :goto_1
    new-array p0, v9, [I

    .line 257
    .line 258
    fill-array-data p0, :array_0

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, p0}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 262
    .line 263
    .line 264
    and-long p0, p2, v5

    .line 265
    .line 266
    cmp-long p0, p0, v1

    .line 267
    .line 268
    if-eqz p0, :cond_13

    .line 269
    .line 270
    const/16 p0, 0x14

    .line 271
    .line 272
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 273
    .line 274
    .line 275
    const-wide/16 p0, 0x1000

    .line 276
    .line 277
    invoke-static {v3, v4, p0, p1}, LE3/t;->k0(JJ)Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-eqz p0, :cond_13

    .line 282
    .line 283
    const/16 p0, 0xa

    .line 284
    .line 285
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 286
    .line 287
    .line 288
    :cond_13
    if-eqz p4, :cond_15

    .line 289
    .line 290
    const-wide/32 p0, 0x40000

    .line 291
    .line 292
    .line 293
    invoke-static {v3, v4, p0, p1}, LE3/t;->k0(JJ)Z

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    if-eqz p0, :cond_14

    .line 298
    .line 299
    const/16 p0, 0xf

    .line 300
    .line 301
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 302
    .line 303
    .line 304
    :cond_14
    const-wide/32 p0, 0x200000

    .line 305
    .line 306
    .line 307
    invoke-static {v3, v4, p0, p1}, LE3/t;->k0(JJ)Z

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-eqz p0, :cond_15

    .line 312
    .line 313
    const/16 p0, 0xe

    .line 314
    .line 315
    invoke-virtual {v0, p0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 316
    .line 317
    .line 318
    :cond_15
    invoke-virtual {v0}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    return-object p0

    .line 323
    :array_0
    .array-data 4
        0x17
        0x11
        0x12
        0x10
        0x15
        0x20
    .end array-data
.end method

.method public static P(Lq2/C;ILandroid/graphics/Bitmap;)LF3/n$h;
    .locals 1

    .line 1
    invoke-static {p0, p2}, LE3/t;->t(Lq2/C;Landroid/graphics/Bitmap;)LF3/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, LE3/t;->Q(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    new-instance v0, LF3/n$h;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, LF3/n$h;-><init>(LF3/l;J)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static Q(I)J
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    return-wide v0

    .line 7
    :cond_0
    int-to-long v0, p0

    .line 8
    return-wide v0
.end method

.method public static R(LF3/w;)Lq2/S;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/w;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lq2/M;

    .line 20
    .line 21
    invoke-virtual {p0}, LF3/w;->b()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-direct {v0, p0}, Lq2/M;-><init>(F)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance p0, Lq2/M;

    .line 30
    .line 31
    invoke-direct {p0}, Lq2/M;-><init>()V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x5

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Lq2/T;

    .line 43
    .line 44
    invoke-virtual {p0}, LF3/w;->e()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-direct {v0, v1, p0}, Lq2/T;-><init>(IF)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    new-instance p0, Lq2/T;

    .line 53
    .line 54
    invoke-direct {p0, v1}, Lq2/T;-><init>(I)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v1, 0x4

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    new-instance v0, Lq2/T;

    .line 66
    .line 67
    invoke-virtual {p0}, LF3/w;->e()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-direct {v0, v1, p0}, Lq2/T;-><init>(IF)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_3
    new-instance p0, Lq2/T;

    .line 76
    .line 77
    invoke-direct {p0, v1}, Lq2/T;-><init>(I)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_3
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v1, 0x3

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    new-instance v0, Lq2/T;

    .line 89
    .line 90
    invoke-virtual {p0}, LF3/w;->e()F

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    invoke-direct {v0, v1, p0}, Lq2/T;-><init>(IF)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_4
    new-instance p0, Lq2/T;

    .line 99
    .line 100
    invoke-direct {p0, v1}, Lq2/T;-><init>(I)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    new-instance v0, Lq2/V;

    .line 111
    .line 112
    invoke-virtual {p0}, LF3/w;->h()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-direct {v0, p0}, Lq2/V;-><init>(Z)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_5
    new-instance p0, Lq2/V;

    .line 121
    .line 122
    invoke-direct {p0}, Lq2/V;-><init>()V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_5
    invoke-virtual {p0}, LF3/w;->g()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    new-instance v0, Lq2/z;

    .line 133
    .line 134
    invoke-virtual {p0}, LF3/w;->f()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-direct {v0, p0}, Lq2/z;-><init>(Z)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_6
    new-instance p0, Lq2/z;

    .line 143
    .line 144
    invoke-direct {p0}, Lq2/z;-><init>()V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static S(Lq2/S;)LF3/w;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p0}, LE3/t;->h0(Lq2/S;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lq2/S;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, LF3/w;->m(I)LF3/w;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    check-cast p0, Lq2/M;

    .line 25
    .line 26
    invoke-virtual {p0}, Lq2/M;->e()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, LF3/w;->j(F)LF3/w;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_1
    check-cast p0, Lq2/T;

    .line 36
    .line 37
    invoke-virtual {p0}, Lq2/T;->f()F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {v1, p0}, LF3/w;->k(IF)LF3/w;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_2
    check-cast p0, Lq2/V;

    .line 47
    .line 48
    invoke-virtual {p0}, Lq2/V;->e()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, LF3/w;->l(Z)LF3/w;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_3
    check-cast p0, Lq2/z;

    .line 58
    .line 59
    invoke-virtual {p0}, Lq2/z;->e()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0}, LF3/w;->i(Z)LF3/w;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static T(I)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "Unrecognized PlaybackStateCompat.RepeatMode: "

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " was converted to `Player.REPEAT_MODE_OFF`"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "LegacyConversions"

    .line 39
    .line 40
    invoke-static {v0, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_0
    return v0

    .line 45
    :cond_1
    return v1
.end method

.method public static U(LF3/v;Z)LE3/U6;
    .locals 3

    .line 1
    new-instance v0, LE3/U6$b;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/U6$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LE3/U6$b;->c()LE3/U6$b;

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const p1, 0x9c4a

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, LE3/U6$b;->f(I)LE3/U6$b;

    .line 15
    .line 16
    .line 17
    :cond_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, LF3/v;->f()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, LF3/v$d;

    .line 38
    .line 39
    invoke-virtual {p1}, LF3/v$d;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, LF3/v$d;->d()Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v2, LE3/T6;

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 52
    .line 53
    :cond_1
    invoke-direct {v2, v1, p1}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, LE3/U6$b;->a(LE3/T6;)LE3/U6$b;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v0}, LE3/U6$b;->e()LE3/U6;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method static V(IILjava/lang/CharSequence;Landroid/os/Bundle;Landroid/content/Context;)LE3/V6;
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-static {p1}, LE3/t;->X(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, LE3/V6;

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {p0, p4}, LE3/t;->i0(ILandroid/content/Context;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :goto_0
    if-eqz p3, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 28
    .line 29
    :goto_1
    invoke-direct {p1, p0, p2, p3}, LE3/V6;-><init>(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static W(LF3/v;Landroid/content/Context;)LE3/V6;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/v;->o()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, LF3/v;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, LF3/v;->h()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, LF3/v;->i()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {v0, v1, v2, p0, p1}, LE3/t;->V(IILjava/lang/CharSequence;Landroid/os/Bundle;Landroid/content/Context;)LE3/V6;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method private static X(I)I
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :pswitch_0
    const/16 p0, -0x6d

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :pswitch_2
    const/16 p0, -0x6b

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_3
    const/16 p0, -0x6e

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_4
    const/16 p0, -0x6a

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_5
    const/16 p0, -0x69

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_6
    const/16 p0, -0x68

    .line 24
    .line 25
    return p0

    .line 26
    :pswitch_7
    const/16 p0, -0x67

    .line 27
    .line 28
    return p0

    .line 29
    :pswitch_8
    const/16 p0, -0x66

    .line 30
    .line 31
    return p0

    .line 32
    :pswitch_9
    const/4 p0, -0x6

    .line 33
    return p0

    .line 34
    :pswitch_a
    const/4 p0, -0x2

    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static Y(I)Z
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Unrecognized ShuffleMode: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :goto_0
    return v0

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static Z(LF3/v;LF3/m;J)J
    .locals 2

    .line 1
    invoke-static {p0, p1, p2, p3}, LE3/t;->e(LF3/v;LF3/m;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p0, p1, p2, p3}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    sub-long/2addr v0, p0

    .line 10
    return-wide v0
.end method

.method public static a(LF3/a;)Lq2/c;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/c;->h:Lq2/c;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/c$e;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/c$e;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LF3/a;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Lq2/c$e;->c(I)Lq2/c$e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, LF3/a;->b()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lq2/c$e;->d(I)Lq2/c$e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, LF3/a;->d()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-virtual {v0, p0}, Lq2/c$e;->g(I)Lq2/c$e;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lq2/c$e;->a()Lq2/c;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static a0(Lq2/C;I)Lq2/Y$d;
    .locals 21

    .line 1
    new-instance v0, Lq2/Y$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v19, 0x0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    const-wide/16 v8, 0x0

    .line 24
    .line 25
    const/4 v10, 0x1

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const-wide/16 v13, 0x0

    .line 29
    .line 30
    move/from16 v18, p1

    .line 31
    .line 32
    move-object/from16 v2, p0

    .line 33
    .line 34
    move/from16 v17, p1

    .line 35
    .line 36
    invoke-virtual/range {v0 .. v20}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static b(LF3/j$e;)Lq2/c;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/c;->h:Lq2/c;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, LF3/j$e;->a()LF3/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, LE3/t;->a(LF3/a;)Lq2/c;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static b0(Landroid/os/Bundle;)I
    .locals 2

    .line 1
    const-string v0, "androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static c(Lq2/c;)LF3/a;
    .locals 2

    .line 1
    new-instance v0, LF3/a$d;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/a$d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lq2/c;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LF3/a$d;->b(I)LF3/a$d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lq2/c;->b:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LF3/a$d;->c(I)LF3/a$d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget p0, p0, Lq2/c;->c:I

    .line 19
    .line 20
    invoke-virtual {v0, p0}, LF3/a$d;->d(I)LF3/a$d;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, LF3/a$d;->a()LF3/a;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method private static c0(LF3/v;J)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-virtual {p0, p1}, LF3/v;->e(Ljava/lang/Long;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0
.end method

.method public static d(LF3/v;LF3/m;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LE3/t;->e(LF3/v;LF3/m;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    invoke-static {p1}, LE3/t;->j(LF3/m;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {p2, p3, p0, p1}, LE3/L6;->c(JJ)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private static varargs d0(LF3/m;[Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {p0, v2}, LF3/m;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, LF3/m;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static e(LF3/v;LF3/m;J)J
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    :goto_0
    move-wide v2, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, LF3/v;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    invoke-static {p0, p1, p2, p3}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    invoke-static {p1}, LE3/t;->j(LF3/m;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v6

    .line 20
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long p0, v6, p0

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    return-wide p0

    .line 34
    :cond_1
    invoke-static/range {v2 .. v7}, Lt2/a0;->s(JJJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0
.end method

.method private static varargs e0(LF3/m;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {p0, v2}, LF3/m;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, LF3/m;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method private static f(Landroid/graphics/Bitmap;)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_1
    move-exception v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    throw p0
.end method

.method public static f0(Ljava/util/concurrent/Future;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x0

    .line 6
    move-wide v3, p1

    .line 7
    :goto_0
    :try_start_0
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    invoke-interface {p0, v3, v4, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :catch_0
    const/4 v2, 0x1

    .line 26
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    sub-long/2addr v3, v0

    .line 31
    cmp-long v5, v3, p1

    .line 32
    .line 33
    if-gez v5, :cond_1

    .line 34
    .line 35
    sub-long v3, p1, v3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    :goto_1
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 51
    .line 52
    .line 53
    :cond_2
    throw p0
.end method

.method public static g(LF3/v;LF3/m;J)J
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, LF3/v;->o()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x3

    .line 11
    if-ne v2, v3, :cond_1

    .line 12
    .line 13
    invoke-static {p0, p2, p3}, LE3/t;->c0(LF3/v;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :goto_0
    move-wide v2, p2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, LF3/v;->m()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    invoke-static {p1}, LE3/t;->j(LF3/m;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long p0, v6, p0

    .line 34
    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0

    .line 42
    :cond_2
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    invoke-static/range {v2 .. v7}, Lt2/a0;->s(JJJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    return-wide p0
.end method

.method public static g0(Lq2/c;)I
    .locals 1

    .line 1
    invoke-static {p0}, LE3/t;->c(Lq2/c;)LF3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, LF3/a;->c()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v0, -0x80000000

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    :cond_0
    return p0
.end method

.method public static h(LF3/j$e;Ljava/lang/String;)Lq2/p;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lq2/p;->e:Lq2/p;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/p$b;

    .line 7
    .line 8
    invoke-virtual {p0}, LF3/j$e;->d()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x2

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-direct {v0, v1}, Lq2/p$b;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LF3/j$e;->c()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0, p0}, Lq2/p$b;->f(I)Lq2/p$b;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, p1}, Lq2/p$b;->h(Ljava/lang/String;)Lq2/p$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lq2/p$b;->e()Lq2/p;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static h0(Lq2/S;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lq2/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    instance-of v0, p0, Lq2/V;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    instance-of v0, p0, Lq2/T;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    check-cast p0, Lq2/T;

    .line 18
    .line 19
    invoke-virtual {p0}, Lq2/T;->e()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v0, 0x3

    .line 24
    if-eq p0, v0, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    if-eq p0, v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    if-eq p0, v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v0

    .line 34
    :cond_3
    instance-of p0, p0, Lq2/M;

    .line 35
    .line 36
    if-eqz p0, :cond_4

    .line 37
    .line 38
    const/4 p0, 0x6

    .line 39
    return p0

    .line 40
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static i(LF3/j$e;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/j$e;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private static i0(ILandroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    if-eq p0, v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_5

    .line 7
    .line 8
    const/4 v0, -0x6

    .line 9
    if-eq p0, v0, :cond_4

    .line 10
    .line 11
    const/4 v0, -0x5

    .line 12
    if-eq p0, v0, :cond_3

    .line 13
    .line 14
    const/4 v0, -0x4

    .line 15
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, -0x3

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, -0x2

    .line 21
    if-eq p0, v0, :cond_0

    .line 22
    .line 23
    packed-switch p0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    sget p0, LE3/Q6;->h:I

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget p0, LE3/Q6;->b:I

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    sget p0, LE3/Q6;->p:I

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    sget p0, LE3/Q6;->d:I

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_3
    sget p0, LE3/Q6;->n:I

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_4
    sget p0, LE3/Q6;->l:I

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_5
    sget p0, LE3/Q6;->r:I

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_6
    sget p0, LE3/Q6;->q:I

    .line 76
    .line 77
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_7
    sget p0, LE3/Q6;->g:I

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_8
    sget p0, LE3/Q6;->e:I

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_0
    sget p0, LE3/Q6;->j:I

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_1
    sget p0, LE3/Q6;->c:I

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_2
    sget p0, LE3/Q6;->o:I

    .line 111
    .line 112
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_3
    sget p0, LE3/Q6;->k:I

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_4
    sget p0, LE3/Q6;->m:I

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :cond_5
    sget p0, LE3/Q6;->i:I

    .line 132
    .line 133
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_6
    sget p0, LE3/Q6;->f:I

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch -0x6e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static j(LF3/m;)J
    .locals 6

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const-string v2, "android.media.metadata.DURATION"

    .line 9
    .line 10
    invoke-virtual {p0, v2}, LF3/m;->a(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v2}, LF3/m;->e(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long p0, v2, v4

    .line 24
    .line 25
    if-gtz p0, :cond_1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_1
    return-wide v2

    .line 29
    :cond_2
    :goto_0
    return-wide v0
.end method

.method private static j0(Ljava/lang/String;Lq2/I;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "android.media.metadata.ALBUM_ARTIST"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x6

    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string v0, "android.media.metadata.TITLE"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x5

    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v0, "android.media.metadata.ALBUM"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x4

    .line 45
    goto :goto_0

    .line 46
    :sswitch_3
    const-string v0, "android.media.metadata.COMPOSER"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x3

    .line 56
    goto :goto_0

    .line 57
    :sswitch_4
    const-string v0, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const/4 v1, 0x2

    .line 67
    goto :goto_0

    .line 68
    :sswitch_5
    const-string v0, "android.media.metadata.WRITER"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_5

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/4 v1, 0x1

    .line 78
    goto :goto_0

    .line 79
    :sswitch_6
    const-string v0, "android.media.metadata.ARTIST"

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_6

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    const/4 v1, 0x0

    .line 89
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return-object p0

    .line 94
    :pswitch_0
    iget-object p0, p1, Lq2/I;->d:Ljava/lang/CharSequence;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_1
    iget-object p0, p1, Lq2/I;->a:Ljava/lang/CharSequence;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_2
    iget-object p0, p1, Lq2/I;->c:Ljava/lang/CharSequence;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_3
    iget-object p0, p1, Lq2/I;->A:Ljava/lang/CharSequence;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_4
    iget-object p0, p1, Lq2/I;->f:Ljava/lang/CharSequence;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_5
    iget-object p0, p1, Lq2/I;->z:Ljava/lang/CharSequence;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_6
    iget-object p0, p1, Lq2/I;->b:Ljava/lang/CharSequence;

    .line 113
    .line 114
    return-object p0

    .line 115
    :sswitch_data_0
    .sparse-switch
        -0x6e7c6d63 -> :sswitch_6
        -0x48f6a837 -> :sswitch_5
        0xb9aeaeb -> :sswitch_4
        0x6467f2f6 -> :sswitch_3
        0x70098439 -> :sswitch_2
        0x71142822 -> :sswitch_1
        0x7522ca0d -> :sswitch_0
    .end sparse-switch

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static k(I)J
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "Unrecognized FolderType: "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :pswitch_0
    const-wide/16 v0, 0x6

    .line 28
    .line 29
    return-wide v0

    .line 30
    :pswitch_1
    const-wide/16 v0, 0x5

    .line 31
    .line 32
    return-wide v0

    .line 33
    :pswitch_2
    const-wide/16 v0, 0x4

    .line 34
    .line 35
    return-wide v0

    .line 36
    :pswitch_3
    const-wide/16 v0, 0x3

    .line 37
    .line 38
    return-wide v0

    .line 39
    :pswitch_4
    const-wide/16 v0, 0x2

    .line 40
    .line 41
    return-wide v0

    .line 42
    :pswitch_5
    const-wide/16 v0, 0x1

    .line 43
    .line 44
    return-wide v0

    .line 45
    :pswitch_6
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    return-wide v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static k0(JJ)Z
    .locals 0

    .line 1
    and-long/2addr p0, p2

    .line 2
    const-wide/16 p2, 0x0

    .line 3
    .line 4
    cmp-long p0, p0, p2

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method private static l(J)I
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const-wide/16 v2, 0x1

    .line 10
    .line 11
    cmp-long v0, p0, v2

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const-wide/16 v2, 0x2

    .line 18
    .line 19
    cmp-long v0, p0, v2

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :cond_2
    const-wide/16 v2, 0x3

    .line 26
    .line 27
    cmp-long v0, p0, v2

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    return p0

    .line 33
    :cond_3
    const-wide/16 v2, 0x4

    .line 34
    .line 35
    cmp-long v0, p0, v2

    .line 36
    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    const/4 p0, 0x4

    .line 40
    return p0

    .line 41
    :cond_4
    const-wide/16 v2, 0x5

    .line 42
    .line 43
    cmp-long v0, p0, v2

    .line 44
    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    const/4 p0, 0x5

    .line 48
    return p0

    .line 49
    :cond_5
    const-wide/16 v2, 0x6

    .line 50
    .line 51
    cmp-long p0, p0, v2

    .line 52
    .line 53
    if-nez p0, :cond_6

    .line 54
    .line 55
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_6
    return v1
.end method

.method public static m(LF3/j$e;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/j$e;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    return v0
.end method

.method private static n(LF3/v;LF3/m;J)Z
    .locals 4

    .line 1
    invoke-static {p1}, LE3/t;->j(LF3/m;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    invoke-static {p0, p1, p2, p3}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    cmp-long p0, p0, v0

    .line 21
    .line 22
    if-ltz p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    return v3
.end method

.method public static o(LF3/v;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/v;->o()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne p0, v1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    return v0
.end method

.method public static p(LF3/m;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "android.media.metadata.ADVERTISEMENT"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, LF3/m;->e(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long p0, v1, v3

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    return v0
.end method

.method public static q(I)I
    .locals 2

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, -0x6d

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, -0x6

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, -0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :pswitch_0
    const/4 p0, 0x3

    .line 24
    return p0

    .line 25
    :pswitch_1
    const/4 p0, 0x4

    .line 26
    return p0

    .line 27
    :pswitch_2
    const/4 p0, 0x5

    .line 28
    return p0

    .line 29
    :pswitch_3
    const/4 p0, 0x6

    .line 30
    return p0

    .line 31
    :pswitch_4
    const/4 p0, 0x7

    .line 32
    return p0

    .line 33
    :pswitch_5
    const/16 p0, 0x9

    .line 34
    .line 35
    return p0

    .line 36
    :cond_0
    const/16 p0, 0xa

    .line 37
    .line 38
    return p0

    .line 39
    :cond_1
    return v1

    .line 40
    :cond_2
    const/4 p0, 0x2

    .line 41
    return p0

    .line 42
    :cond_3
    const/16 p0, 0xb

    .line 43
    .line 44
    return p0

    .line 45
    :cond_4
    const/16 p0, 0x8

    .line 46
    .line 47
    return p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch -0x6b
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Lq2/N;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/N;->a:I

    .line 2
    .line 3
    invoke-static {p0}, LE3/t;->q(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static s(LF3/v;Lq2/P$b;Landroid/os/Bundle;)LP9/u;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, LF3/v;->f()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, LP9/u$a;

    .line 13
    .line 14
    invoke-direct {v0}, LP9/u$a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, LF3/v$d;

    .line 32
    .line 33
    invoke-virtual {v1}, LF3/v$d;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1}, LF3/v$d;->d()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const-string v5, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"

    .line 45
    .line 46
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :cond_1
    new-instance v5, LE3/b$b;

    .line 51
    .line 52
    invoke-virtual {v1}, LF3/v$d;->e()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-direct {v5, v4, v6}, LE3/b$b;-><init>(II)V

    .line 57
    .line 58
    .line 59
    new-instance v4, LE3/T6;

    .line 60
    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v6, v3

    .line 67
    :goto_1
    invoke-direct {v4, v2, v6}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v4}, LE3/b$b;->i(LE3/T6;)LE3/b$b;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1}, LF3/v$d;->f()Ljava/lang/CharSequence;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v2, v1}, LE3/b$b;->c(Ljava/lang/CharSequence;)LE3/b$b;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v2, 0x1

    .line 83
    invoke-virtual {v1, v2}, LE3/b$b;->d(Z)LE3/b$b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    const-string v2, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT"

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    const/4 v2, 0x0

    .line 97
    :goto_2
    if-eqz v2, :cond_5

    .line 98
    .line 99
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v4, "content"

    .line 108
    .line 109
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    const-string v4, "android.resource"

    .line 116
    .line 117
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    :cond_4
    invoke-virtual {v1, v2}, LE3/b$b;->g(Landroid/net/Uri;)LE3/b$b;

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {v1}, LE3/b$b;->a()LE3/b;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_6
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0, p1, p2}, LE3/b;->i(Ljava/util/List;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0
.end method

.method public static t(Lq2/C;Landroid/graphics/Bitmap;)LF3/l;
    .locals 10

    .line 1
    new-instance v0, LF3/l$c;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/l$c;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq2/C;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Lq2/C;->a:Ljava/lang/String;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, v1}, LF3/l$c;->f(Ljava/lang/String;)LF3/l$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lq2/C;->e:Lq2/I;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, LF3/l$c;->d(Landroid/graphics/Bitmap;)LF3/l$c;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p1, v1, Lq2/I;->I:Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    new-instance v2, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v2, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v2

    .line 41
    :cond_2
    iget-object v2, v1, Lq2/I;->p:Ljava/lang/Integer;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v5, -0x1

    .line 52
    if-eq v2, v5, :cond_3

    .line 53
    .line 54
    move v2, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move v2, v3

    .line 57
    :goto_1
    iget-object v5, v1, Lq2/I;->H:Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    move v5, v4

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move v5, v3

    .line 64
    :goto_2
    if-nez v2, :cond_5

    .line 65
    .line 66
    if-eqz v5, :cond_8

    .line 67
    .line 68
    :cond_5
    if-nez p1, :cond_6

    .line 69
    .line 70
    new-instance p1, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    :cond_6
    if-eqz v2, :cond_7

    .line 76
    .line 77
    iget-object v2, v1, Lq2/I;->p:Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-static {v2}, LE3/t;->k(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const-string v2, "android.media.extra.BT_FOLDER_TYPE"

    .line 94
    .line 95
    invoke-virtual {p1, v2, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 96
    .line 97
    .line 98
    :cond_7
    if-eqz v5, :cond_8

    .line 99
    .line 100
    iget-object v2, v1, Lq2/I;->H:Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    int-to-long v5, v2

    .line 113
    const-string v2, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 114
    .line 115
    invoke-virtual {p1, v2, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 116
    .line 117
    .line 118
    :cond_8
    iget-object v2, v1, Lq2/I;->J:LP9/u;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_a

    .line 125
    .line 126
    if-nez p1, :cond_9

    .line 127
    .line 128
    new-instance p1, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    :cond_9
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object v5, v1, Lq2/I;->J:LP9/u;

    .line 136
    .line 137
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    const-string v5, "androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"

    .line 141
    .line 142
    invoke-virtual {p1, v5, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    iget-object v2, v1, Lq2/I;->e:Ljava/lang/CharSequence;

    .line 146
    .line 147
    if-eqz v2, :cond_c

    .line 148
    .line 149
    iget-object v3, v1, Lq2/I;->f:Ljava/lang/CharSequence;

    .line 150
    .line 151
    iget-object v4, v1, Lq2/I;->g:Ljava/lang/CharSequence;

    .line 152
    .line 153
    if-nez p1, :cond_b

    .line 154
    .line 155
    new-instance p1, Landroid/os/Bundle;

    .line 156
    .line 157
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 158
    .line 159
    .line 160
    :cond_b
    const-string v5, "androidx.media3.mediadescriptioncompat.title"

    .line 161
    .line 162
    iget-object v6, v1, Lq2/I;->a:Ljava/lang/CharSequence;

    .line 163
    .line 164
    invoke-virtual {p1, v5, v6}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_c
    const/4 v2, 0x3

    .line 169
    new-array v5, v2, [Ljava/lang/CharSequence;

    .line 170
    .line 171
    move v6, v3

    .line 172
    move v7, v6

    .line 173
    :goto_3
    if-ge v6, v2, :cond_e

    .line 174
    .line 175
    sget-object v8, LF3/m;->d:[Ljava/lang/String;

    .line 176
    .line 177
    array-length v9, v8

    .line 178
    if-ge v7, v9, :cond_e

    .line 179
    .line 180
    add-int/lit8 v9, v7, 0x1

    .line 181
    .line 182
    aget-object v7, v8, v7

    .line 183
    .line 184
    invoke-static {v7, v1}, LE3/t;->j0(Ljava/lang/String;Lq2/I;)Ljava/lang/CharSequence;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-nez v8, :cond_d

    .line 193
    .line 194
    add-int/lit8 v8, v6, 0x1

    .line 195
    .line 196
    aput-object v7, v5, v6

    .line 197
    .line 198
    move v6, v8

    .line 199
    :cond_d
    move v7, v9

    .line 200
    goto :goto_3

    .line 201
    :cond_e
    aget-object v2, v5, v3

    .line 202
    .line 203
    aget-object v3, v5, v4

    .line 204
    .line 205
    const/4 v4, 0x2

    .line 206
    aget-object v4, v5, v4

    .line 207
    .line 208
    :goto_4
    invoke-virtual {v0, v2}, LF3/l$c;->i(Ljava/lang/CharSequence;)LF3/l$c;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0, v3}, LF3/l$c;->h(Ljava/lang/CharSequence;)LF3/l$c;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0, v4}, LF3/l$c;->b(Ljava/lang/CharSequence;)LF3/l$c;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v1, v1, Lq2/I;->m:Landroid/net/Uri;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, LF3/l$c;->e(Landroid/net/Uri;)LF3/l$c;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object p0, p0, Lq2/C;->h:Lq2/C$i;

    .line 227
    .line 228
    iget-object p0, p0, Lq2/C$i;->a:Landroid/net/Uri;

    .line 229
    .line 230
    invoke-virtual {v0, p0}, LF3/l$c;->g(Landroid/net/Uri;)LF3/l$c;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-virtual {p0, p1}, LF3/l$c;->c(Landroid/os/Bundle;)LF3/l$c;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {p0}, LF3/l$c;->a()LF3/l;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0
.end method

.method public static u(LF3/l;)Lq2/C;
    .locals 2

    .line 1
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {p0, v0, v1}, LE3/t;->v(LF3/l;ZZ)Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static v(LF3/l;ZZ)Lq2/C;
    .locals 3

    .line 1
    invoke-virtual {p0}, LF3/l;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lq2/C$c;

    .line 6
    .line 7
    invoke-direct {v1}, Lq2/C$c;-><init>()V

    .line 8
    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1, v0}, Lq2/C$c;->d(Ljava/lang/String;)Lq2/C$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lq2/C$i$a;

    .line 19
    .line 20
    invoke-direct {v1}, Lq2/C$i$a;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LF3/l;->h()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Lq2/C$i$a;->f(Landroid/net/Uri;)Lq2/C$i$a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lq2/C$i$a;->d()Lq2/C$i;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lq2/C$c;->g(Lq2/C$i;)Lq2/C$c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {p0, v1, p1, p2}, LE3/t;->B(LF3/l;IZZ)Lq2/I;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Lq2/C$c;->e(Lq2/I;)Lq2/C$c;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lq2/C$c;->a()Lq2/C;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static w(LF3/m;I)Lq2/C;
    .locals 1

    .line 1
    const-string v0, "android.media.metadata.MEDIA_ID"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LF3/m;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0, p1}, LE3/t;->y(Ljava/lang/String;LF3/m;I)Lq2/C;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static x(LF3/n$h;)Lq2/C;
    .locals 0

    .line 1
    invoke-virtual {p0}, LF3/n$h;->c()LF3/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LE3/t;->u(LF3/l;)Lq2/C;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static y(Ljava/lang/String;LF3/m;I)Lq2/C;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lq2/C$c;->d(Ljava/lang/String;)Lq2/C$c;

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string p0, "android.media.metadata.MEDIA_URI"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, LF3/m;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    new-instance v1, Lq2/C$i$a;

    .line 20
    .line 21
    invoke-direct {v1}, Lq2/C$i$a;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v1, p0}, Lq2/C$i$a;->f(Landroid/net/Uri;)Lq2/C$i$a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lq2/C$i$a;->d()Lq2/C$i;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Lq2/C$c;->g(Lq2/C$i;)Lq2/C$c;

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {p1, p2}, LE3/t;->C(LF3/m;I)Lq2/I;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Lq2/C$c;->e(Lq2/I;)Lq2/C$c;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lq2/C$c;->a()Lq2/C;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static z(Lq2/Y;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lq2/Y$d;

    .line 7
    .line 8
    invoke-direct {v1}, Lq2/Y$d;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Lq2/Y;->t()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v2, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v3, v3, Lq2/Y$d;->c:Lq2/C;

    .line 23
    .line 24
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v0
.end method
