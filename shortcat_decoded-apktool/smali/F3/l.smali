.class public final LF3/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/l$b;,
        LF3/l$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LF3/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/CharSequence;

.field private final c:Ljava/lang/CharSequence;

.field private final d:Ljava/lang/CharSequence;

.field private final e:Landroid/graphics/Bitmap;

.field private final f:Landroid/net/Uri;

.field private final g:Landroid/os/Bundle;

.field private final h:Landroid/net/Uri;

.field private i:Landroid/media/MediaDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF3/l$a;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/l$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF3/l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LF3/l;->b:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput-object p3, p0, LF3/l;->c:Ljava/lang/CharSequence;

    .line 9
    .line 10
    iput-object p4, p0, LF3/l;->d:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iput-object p5, p0, LF3/l;->e:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    iput-object p6, p0, LF3/l;->f:Landroid/net/Uri;

    .line 15
    .line 16
    iput-object p7, p0, LF3/l;->g:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p8, p0, LF3/l;->h:Landroid/net/Uri;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Landroid/media/MediaDescription;)LF3/l;
    .locals 8

    .line 1
    new-instance v0, LF3/l$c;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/l$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, LF3/l$c;->f(Ljava/lang/String;)LF3/l$c;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, LF3/l$c;->i(Ljava/lang/CharSequence;)LF3/l$c;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, LF3/l$c;->h(Ljava/lang/CharSequence;)LF3/l$c;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, LF3/l$c;->b(Ljava/lang/CharSequence;)LF3/l$c;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, LF3/l$c;->d(Landroid/graphics/Bitmap;)LF3/l$c;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, LF3/l$c;->e(Landroid/net/Uri;)LF3/l$c;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, LF3/n;->y(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    new-instance v2, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {v2, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v2

    .line 64
    :cond_0
    const/4 v2, 0x0

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    const-string v3, "android.support.v4.media.description.MEDIA_URI"

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Landroid/net/Uri;

    .line 74
    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    const-string v5, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 78
    .line 79
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const/4 v7, 0x2

    .line 90
    if-ne v6, v7, :cond_2

    .line 91
    .line 92
    move-object v1, v2

    .line 93
    :cond_1
    :goto_0
    move-object v2, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    :goto_1
    invoke-virtual {v0, v1}, LF3/l$c;->c(Landroid/os/Bundle;)LF3/l$c;

    .line 103
    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {v0, v2}, LF3/l$c;->g(Landroid/net/Uri;)LF3/l$c;

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    invoke-static {p0}, LF3/l$b;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, LF3/l$c;->g(Landroid/net/Uri;)LF3/l$c;

    .line 116
    .line 117
    .line 118
    :goto_2
    invoke-virtual {v0}, LF3/l$c;->a()LF3/l;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object p0, v0, LF3/l;->i:Landroid/media/MediaDescription;

    .line 123
    .line 124
    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->d:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->g:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->e:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Landroid/media/MediaDescription;
    .locals 2

    .line 1
    iget-object v0, p0, LF3/l;->i:Landroid/media/MediaDescription;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroid/media/MediaDescription$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/media/MediaDescription$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LF3/l;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setMediaId(Ljava/lang/String;)Landroid/media/MediaDescription$Builder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LF3/l;->b:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LF3/l;->c:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LF3/l;->d:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LF3/l;->e:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/media/MediaDescription$Builder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, LF3/l;->f:Landroid/net/Uri;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LF3/l;->g:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, LF3/l;->h:Landroid/net/Uri;

    .line 47
    .line 48
    invoke-static {v0, v1}, LF3/l$b;->b(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/MediaDescription$Builder;->build()Landroid/media/MediaDescription;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, LF3/l;->i:Landroid/media/MediaDescription;

    .line 56
    .line 57
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->h:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->c:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/l;->b:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LF3/l;->b:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LF3/l;->c:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LF3/l;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF3/l;->f()Landroid/media/MediaDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
