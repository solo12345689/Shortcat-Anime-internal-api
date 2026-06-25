.class public final LF3/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/m$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LF3/m;",
            ">;"
        }
    .end annotation
.end field

.field static final c:Lt/a;

.field public static final d:[Ljava/lang/String;


# instance fields
.field final a:Landroid/os/Bundle;

.field private b:Landroid/media/MediaMetadata;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lt/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF3/m;->c:Lt/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "android.media.metadata.TITLE"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v2, "android.media.metadata.ARTIST"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "android.media.metadata.DURATION"

    .line 29
    .line 30
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v3, "android.media.metadata.ALBUM"

    .line 34
    .line 35
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string v3, "android.media.metadata.AUTHOR"

    .line 39
    .line 40
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string v3, "android.media.metadata.WRITER"

    .line 44
    .line 45
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string v3, "android.media.metadata.COMPOSER"

    .line 49
    .line 50
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const-string v3, "android.media.metadata.COMPILATION"

    .line 54
    .line 55
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const-string v3, "android.media.metadata.DATE"

    .line 59
    .line 60
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v3, "android.media.metadata.YEAR"

    .line 64
    .line 65
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-string v3, "android.media.metadata.GENRE"

    .line 69
    .line 70
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const-string v3, "android.media.metadata.TRACK_NUMBER"

    .line 74
    .line 75
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v3, "android.media.metadata.NUM_TRACKS"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v3, "android.media.metadata.DISC_NUMBER"

    .line 84
    .line 85
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const-string v3, "android.media.metadata.ALBUM_ARTIST"

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const/4 v3, 0x2

    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v4, "android.media.metadata.ART"

    .line 99
    .line 100
    invoke-virtual {v0, v4, v3}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v4, "android.media.metadata.ART_URI"

    .line 104
    .line 105
    invoke-virtual {v0, v4, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    const-string v4, "android.media.metadata.ALBUM_ART"

    .line 109
    .line 110
    invoke-virtual {v0, v4, v3}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    const-string v4, "android.media.metadata.ALBUM_ART_URI"

    .line 114
    .line 115
    invoke-virtual {v0, v4, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x3

    .line 119
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const-string v5, "android.media.metadata.USER_RATING"

    .line 124
    .line 125
    invoke-virtual {v0, v5, v4}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    const-string v5, "android.media.metadata.RATING"

    .line 129
    .line 130
    invoke-virtual {v0, v5, v4}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    const-string v4, "android.media.metadata.DISPLAY_TITLE"

    .line 134
    .line 135
    invoke-virtual {v0, v4, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-string v4, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 139
    .line 140
    invoke-virtual {v0, v4, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string v4, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 144
    .line 145
    invoke-virtual {v0, v4, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    const-string v4, "android.media.metadata.DISPLAY_ICON"

    .line 149
    .line 150
    invoke-virtual {v0, v4, v3}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    .line 154
    .line 155
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    const-string v3, "android.media.metadata.MEDIA_ID"

    .line 159
    .line 160
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    const-string v3, "android.media.metadata.BT_FOLDER_TYPE"

    .line 164
    .line 165
    invoke-virtual {v0, v3, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    const-string v3, "android.media.metadata.MEDIA_URI"

    .line 169
    .line 170
    invoke-virtual {v0, v3, v1}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-string v1, "android.media.metadata.ADVERTISEMENT"

    .line 174
    .line 175
    invoke-virtual {v0, v1, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    const-string v1, "android.media.metadata.DOWNLOAD_STATUS"

    .line 179
    .line 180
    invoke-virtual {v0, v1, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    const-string v10, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 184
    .line 185
    const-string v11, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 186
    .line 187
    const-string v3, "android.media.metadata.TITLE"

    .line 188
    .line 189
    const-string v4, "android.media.metadata.ARTIST"

    .line 190
    .line 191
    const-string v5, "android.media.metadata.ALBUM"

    .line 192
    .line 193
    const-string v6, "android.media.metadata.ALBUM_ARTIST"

    .line 194
    .line 195
    const-string v7, "android.media.metadata.WRITER"

    .line 196
    .line 197
    const-string v8, "android.media.metadata.AUTHOR"

    .line 198
    .line 199
    const-string v9, "android.media.metadata.COMPOSER"

    .line 200
    .line 201
    filled-new-array/range {v3 .. v11}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sput-object v0, LF3/m;->d:[Ljava/lang/String;

    .line 206
    .line 207
    new-instance v0, LF3/m$a;

    .line 208
    .line 209
    invoke-direct {v0}, LF3/m$a;-><init>()V

    .line 210
    .line 211
    .line 212
    sput-object v0, LF3/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 213
    .line 214
    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 3
    invoke-static {v0}, LF3/n;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-class v0, LF3/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    iput-object p1, p0, LF3/m;->a:Landroid/os/Bundle;

    return-void
.end method

.method public static b(Ljava/lang/Object;)LF3/m;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast p0, Landroid/media/MediaMetadata;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 14
    .line 15
    .line 16
    sget-object v1, LF3/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LF3/m;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 25
    .line 26
    .line 27
    iput-object p0, v1, LF3/m;->b:Landroid/media/MediaMetadata;

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    const-string v0, "MediaMetadata"

    .line 12
    .line 13
    const-string v1, "Failed to retrieve a key as Bitmap."

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
.end method

.method public d()Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object v1, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e(Ljava/lang/String;)J
    .locals 3

    .line 1
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public f()Landroid/media/MediaMetadata;
    .locals 5

    .line 1
    iget-object v0, p0, LF3/m;->b:Landroid/media/MediaMetadata;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    new-instance v0, Landroid/media/MediaMetadata$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/MediaMetadata$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_8

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    sget-object v3, LF3/m;->c:Lt/a;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Integer;

    .line 39
    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_7

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    if-eq v3, v4, :cond_6

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    if-eq v3, v4, :cond_5

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    if-eq v3, v4, :cond_4

    .line 61
    .line 62
    iget-object v3, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    instance-of v4, v3, Ljava/lang/CharSequence;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    .line 76
    .line 77
    if-eqz v4, :cond_0

    .line 78
    .line 79
    check-cast v3, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    invoke-virtual {v0, v2, v3, v4}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    :goto_1
    check-cast v3, Ljava/lang/CharSequence;

    .line 90
    .line 91
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iget-object v3, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/media/Rating;

    .line 102
    .line 103
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroid/media/Rating;)Landroid/media/MediaMetadata$Builder;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    iget-object v3, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Landroid/graphics/Bitmap;

    .line 114
    .line 115
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    iget-object v3, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    iget-object v3, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    invoke-virtual {v0, v2, v3, v4}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    invoke-virtual {v0}, Landroid/media/MediaMetadata$Builder;->build()Landroid/media/MediaMetadata;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, LF3/m;->b:Landroid/media/MediaMetadata;

    .line 144
    .line 145
    :cond_9
    iget-object v0, p0, LF3/m;->b:Landroid/media/MediaMetadata;

    .line 146
    .line 147
    return-object v0
.end method

.method public g(Ljava/lang/String;)LF3/w;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LF3/w;->a(Ljava/lang/Object;)LF3/w;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string v0, "MediaMetadata"

    .line 14
    .line 15
    const-string v1, "Failed to retrieve a key as Rating."

    .line 16
    .line 17
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public i(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, LF3/m;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
