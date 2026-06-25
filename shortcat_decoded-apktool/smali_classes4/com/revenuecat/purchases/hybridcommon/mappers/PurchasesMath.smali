.class Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesMath;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static addExact(II)I
    .locals 1

    .line 1
    add-int v0, p0, p1

    .line 2
    .line 3
    xor-int/2addr p0, v0

    .line 4
    xor-int/2addr p1, v0

    .line 5
    and-int/2addr p0, p1

    .line 6
    if-ltz p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 10
    .line 11
    const-string p1, "integer overflow"

    .line 12
    .line 13
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method static multiplyExact(II)I
    .locals 4

    .line 1
    int-to-long v0, p0

    .line 2
    int-to-long p0, p1

    .line 3
    mul-long/2addr v0, p0

    .line 4
    long-to-int p0, v0

    .line 5
    int-to-long v2, p0

    .line 6
    cmp-long p1, v2, v0

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 12
    .line 13
    const-string p1, "integer overflow"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method
