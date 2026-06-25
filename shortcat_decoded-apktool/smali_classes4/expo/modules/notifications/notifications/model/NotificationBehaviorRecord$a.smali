.class public final Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;
    .locals 8

    .line 1
    const-string v0, "parcel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    move v4, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v4, v3

    .line 29
    move v3, v0

    .line 30
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v5, v4

    .line 39
    move v4, v0

    .line 40
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    move v6, v5

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move v6, v5

    .line 49
    move v5, v0

    .line 50
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    move v6, v0

    .line 58
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-direct/range {v1 .. v7}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;-><init>(ZZZZZLjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public final b(I)[Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;
    .locals 0

    .line 1
    new-array p1, p1, [Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord$a;->a(Landroid/os/Parcel;)Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord$a;->b(I)[Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
