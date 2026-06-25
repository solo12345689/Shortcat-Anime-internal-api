.class public LPc/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;
.implements LOc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPc/e$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LPc/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Number;

.field private e:Z

.field private f:Landroid/net/Uri;

.field private g:Z

.field private h:[J

.field private i:Lorg/json/JSONObject;

.field private j:LMc/d;

.field private k:Ljava/lang/Number;

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LPc/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LPc/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LPc/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPc/e;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPc/e;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPc/e;->c:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, LPc/e;->d:Ljava/lang/Number;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LPc/e;->e:Z

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, LPc/e;->f:Landroid/net/Uri;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, LPc/e;->g:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->createLongArray()[J

    move-result-object v0

    iput-object v0, p0, LPc/e;->h:[J

    .line 11
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LPc/e;->i:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, LMc/d;->c(I)LMc/d;

    move-result-object v0

    iput-object v0, p0, LPc/e;->j:LMc/d;

    .line 14
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, LPc/e;->k:Ljava/lang/Number;

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    iput-boolean v0, p0, LPc/e;->l:Z

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPc/e;->m:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-ne p1, v2, :cond_4

    move v1, v2

    :cond_4
    iput-boolean v1, p0, LPc/e;->n:Z

    return-void
.end method

.method static bridge synthetic a(LPc/e;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LPc/e;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic b(LPc/e;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->d:Ljava/lang/Number;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic c(LPc/e;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->i:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic d(LPc/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic e(LPc/e;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->k:Ljava/lang/Number;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic f(LPc/e;LMc/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->j:LMc/d;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic g(LPc/e;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LPc/e;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic h(LPc/e;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LPc/e;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic i(LPc/e;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic j(LPc/e;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LPc/e;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic k(LPc/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic l(LPc/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic m(LPc/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic o(LPc/e;[J)V
    .locals 0

    .line 1
    iput-object p1, p0, LPc/e;->h:[J

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public D()LMc/d;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->j:LMc/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/e;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public G()[J
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->h:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public I()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->k:Ljava/lang/Number;

    .line 2
    .line 3
    return-object v0
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/e;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public L()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public M(Landroid/content/Context;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string p2, "expo.modules.notifications.large_notification_icon"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/16 v2, 0x80

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    return-object p1

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catch_1
    move-exception p1

    .line 43
    :goto_0
    const-string p2, "expo-notifications"

    .line 44
    .line 45
    const-string v0, "Could not have fetched large notification icon."

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/e;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->f:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public Q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public R()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->i:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public T()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->d:Ljava/lang/Number;

    .line 2
    .line 3
    return-object v0
.end method

.method public U()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/e;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public V()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->c:Ljava/lang/String;

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

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, LPc/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LPc/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, LPc/e;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, LPc/e;->d:Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p2, p0, LPc/e;->e:Z

    .line 22
    .line 23
    int-to-byte p2, p2

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, LPc/e;->f:Landroid/net/Uri;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 31
    .line 32
    .line 33
    iget-boolean p2, p0, LPc/e;->g:Z

    .line 34
    .line 35
    int-to-byte p2, p2

    .line 36
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, LPc/e;->h:[J

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeLongArray([J)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, LPc/e;->i:Lorg/json/JSONObject;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object p2, v0

    .line 55
    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, LPc/e;->j:LMc/d;

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p2}, LMc/d;->k()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, LPc/e;->k:Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 76
    .line 77
    .line 78
    iget-boolean p2, p0, LPc/e;->l:Z

    .line 79
    .line 80
    int-to-byte p2, p2

    .line 81
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, LPc/e;->m:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-boolean p2, p0, LPc/e;->n:Z

    .line 90
    .line 91
    int-to-byte p2, p2

    .line 92
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
