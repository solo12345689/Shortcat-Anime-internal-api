.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;",
        "",
        "()V",
        "ZERO",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;",
        "getZERO",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;",
        "fromInterval",
        "interval",
        "",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromInterval(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;
    .locals 7

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    div-long/2addr p1, v0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    const v0, 0x15180

    .line 12
    .line 13
    .line 14
    int-to-long v0, v0

    .line 15
    div-long v2, p1, v0

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    rem-long v0, p1, v0

    .line 19
    .line 20
    const/16 v3, 0xe10

    .line 21
    .line 22
    int-to-long v3, v3

    .line 23
    div-long/2addr v0, v3

    .line 24
    long-to-int v0, v0

    .line 25
    rem-long v3, p1, v3

    .line 26
    .line 27
    const/16 v1, 0x3c

    .line 28
    .line 29
    int-to-long v5, v1

    .line 30
    div-long/2addr v3, v5

    .line 31
    long-to-int v1, v3

    .line 32
    rem-long/2addr p1, v5

    .line 33
    long-to-int p1, p1

    .line 34
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 35
    .line 36
    invoke-direct {p2, v2, v0, v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;-><init>(IIII)V

    .line 37
    .line 38
    .line 39
    return-object p2
.end method

.method public final getZERO()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;
    .locals 1

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->access$getZERO$cp()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
