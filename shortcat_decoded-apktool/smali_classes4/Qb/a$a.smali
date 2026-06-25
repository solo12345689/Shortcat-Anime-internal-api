.class final LQb/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:[F


# direct methods
.method public constructor <init>(II)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    move v3, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    :goto_1
    mul-int v4, v3, p2

    .line 15
    .line 16
    sub-int v5, p2, v1

    .line 17
    .line 18
    mul-int/2addr v5, p1

    .line 19
    if-ge v4, v5, :cond_1

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    new-array p1, v2, [F

    .line 30
    .line 31
    iput-object p1, p0, LQb/a$a;->a:[F

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a([BIIF)I
    .locals 5

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQb/a$a;->a:[F

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    shr-int/lit8 v2, p3, 0x1

    .line 13
    .line 14
    add-int/2addr v2, p2

    .line 15
    aget-byte v2, p1, v2

    .line 16
    .line 17
    and-int/lit8 v3, p3, 0x1

    .line 18
    .line 19
    shl-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    shr-int/2addr v2, v3

    .line 22
    iget-object v3, p0, LQb/a$a;->a:[F

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0xf

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    const/high16 v4, 0x40f00000    # 7.5f

    .line 28
    .line 29
    div-float/2addr v2, v4

    .line 30
    const/high16 v4, 0x3f800000    # 1.0f

    .line 31
    .line 32
    sub-float/2addr v2, v4

    .line 33
    mul-float/2addr v2, p4

    .line 34
    aput v2, v3, v1

    .line 35
    .line 36
    add-int/lit8 p3, p3, 0x1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return p3
.end method

.method public final b()[F
    .locals 1

    .line 1
    iget-object v0, p0, LQb/a$a;->a:[F

    .line 2
    .line 3
    return-object v0
.end method
