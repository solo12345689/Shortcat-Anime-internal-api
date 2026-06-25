.class public final LUc/e;
.super LUc/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOc/e;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LUc/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Z

.field private e:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LUc/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LUc/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LUc/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JZLjava/util/Date;)V
    .locals 1

    const-string v0, "triggerDate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, LUc/a;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, LUc/e;->b:Ljava/lang/String;

    .line 5
    iput-wide p2, p0, LUc/e;->c:J

    .line 6
    iput-boolean p4, p0, LUc/e;->d:Z

    .line 7
    iput-object p5, p0, LUc/e;->e:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JZLjava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 1
    new-instance p5, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p6

    const/16 v0, 0x3e8

    int-to-long v0, v0

    mul-long/2addr v0, p2

    add-long/2addr p6, v0

    invoke-direct {p5, p6, p7}, Ljava/util/Date;-><init>(J)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, LUc/e;-><init>(Ljava/lang/String;JZLjava/util/Date;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LUc/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Ljava/util/Date;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, LUc/e;->d:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, LUc/e;->e:Ljava/util/Date;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-wide v1, p0, LUc/e;->c:J

    .line 19
    .line 20
    const/16 v3, 0x3e8

    .line 21
    .line 22
    int-to-long v3, v3

    .line 23
    mul-long/2addr v1, v3

    .line 24
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    iget-object v5, p0, LUc/e;->e:Ljava/util/Date;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    sub-long/2addr v3, v5

    .line 35
    rem-long/2addr v3, v1

    .line 36
    sub-long/2addr v1, v3

    .line 37
    iget-object v3, p0, LUc/e;->e:Ljava/util/Date;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    add-long/2addr v4, v1

    .line 44
    invoke-virtual {v3, v4, v5}, Ljava/util/Date;->setTime(J)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v1, p0, LUc/e;->e:Ljava/util/Date;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_1
    iget-object v0, p0, LUc/e;->e:Ljava/util/Date;

    .line 58
    .line 59
    return-object v0
.end method

.method public u()Landroid/os/Bundle;
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, "timeInterval"

    .line 4
    .line 5
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, p0, LUc/e;->d:Z

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "repeats"

    .line 16
    .line 17
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-wide v2, p0, LUc/e;->c:J

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "seconds"

    .line 28
    .line 29
    invoke-static {v3, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, LUc/a;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LUc/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, LUc/e;->c:J

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 14
    .line 15
    .line 16
    iget-boolean p2, p0, LUc/e;->d:Z

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, LUc/e;->e:Ljava/util/Date;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
