.class public final LJb/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LJb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJb/e;

    .line 2
    .line 3
    invoke-direct {v0}, LJb/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJb/e;->a:LJb/e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(F)I
    .locals 7

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    float-to-double v0, p1

    .line 13
    const-wide v2, 0x3f69a5c37387b719L    # 0.0031308

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmpg-double p1, v0, v2

    .line 19
    .line 20
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 21
    .line 22
    const/16 v4, 0xff

    .line 23
    .line 24
    if-gtz p1, :cond_0

    .line 25
    .line 26
    const-wide v5, 0x4029d70a3d70a3d7L    # 12.92

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    :goto_0
    mul-double/2addr v0, v5

    .line 32
    int-to-double v4, v4

    .line 33
    mul-double/2addr v0, v4

    .line 34
    add-double/2addr v0, v2

    .line 35
    double-to-int p1, v0

    .line 36
    return p1

    .line 37
    :cond_0
    const p1, 0x3ed55555

    .line 38
    .line 39
    .line 40
    float-to-double v5, p1

    .line 41
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    double-to-float p1, v0

    .line 46
    float-to-double v0, p1

    .line 47
    const-wide v5, 0x3fac28f5c28f5c29L    # 0.055

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    sub-double/2addr v0, v5

    .line 53
    const-wide v5, 0x3ff0e147ae147ae1L    # 1.055

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0
.end method

.method public final b(FF)F
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    float-to-double v2, p2

    .line 7
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    double-to-float p2, v0

    .line 12
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    mul-float/2addr p2, p1

    .line 17
    return p2
.end method

.method public final c(I)F
    .locals 4

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x437f0000    # 255.0f

    .line 3
    .line 4
    div-float/2addr p1, v0

    .line 5
    const v0, 0x3d25aee6    # 0.04045f

    .line 6
    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const v0, 0x414eb852    # 12.92f

    .line 13
    .line 14
    .line 15
    div-float/2addr p1, v0

    .line 16
    return p1

    .line 17
    :cond_0
    const v0, 0x3d6147ae    # 0.055f

    .line 18
    .line 19
    .line 20
    add-float/2addr p1, v0

    .line 21
    const v0, 0x3f870a3d    # 1.055f

    .line 22
    .line 23
    .line 24
    div-float/2addr p1, v0

    .line 25
    float-to-double v0, p1

    .line 26
    const p1, 0x4019999a    # 2.4f

    .line 27
    .line 28
    .line 29
    float-to-double v2, p1

    .line 30
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    double-to-float p1, v0

    .line 35
    return p1
.end method
