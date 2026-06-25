.class public final LIb/u;
.super LIb/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final j:Lexpo/modules/image/records/DecodeFormat;

.field private final k:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lexpo/modules/image/records/DecodeFormat;)V
    .locals 1

    .line 1
    const-string v0, "decodeFormat"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LIb/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 10
    .line 11
    new-instance p1, LIb/t;

    .line 12
    .line 13
    invoke-direct {p1}, LIb/t;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LIb/u;->k:Lkotlin/Lazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic c()I
    .locals 1

    .line 1
    invoke-static {}, LIb/u;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private final d()I
    .locals 1

    .line 1
    iget-object v0, p0, LIb/u;->k:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private static final e()I
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getInt"

    .line 16
    .line 17
    const-class v3, Ljava/lang/String;

    .line 18
    .line 19
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    const-string v1, "ro.hwui.max_texture_allocation_size"

    .line 34
    .line 35
    const/high16 v3, 0x6400000

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    filled-new-array {v1, v4}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0, v3}, Loe/j;->e(II)I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    return v0

    .line 66
    :catchall_0
    return v2
.end method


# virtual methods
.method public a(IIII)Lb5/n$g;
    .locals 0

    .line 1
    sget-object p1, Lb5/n$g;->a:Lb5/n$g;

    .line 2
    .line 3
    return-object p1
.end method

.method public b(IIII)F
    .locals 2

    .line 1
    invoke-direct {p0}, LIb/u;->d()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/high16 p4, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-gtz p3, :cond_0

    .line 8
    .line 9
    return p4

    .line 10
    :cond_0
    mul-int p3, p1, p2

    .line 11
    .line 12
    iget-object v0, p0, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 13
    .line 14
    invoke-virtual {v0}, Lexpo/modules/image/records/DecodeFormat;->toBytes()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    mul-int/2addr p3, v0

    .line 19
    invoke-direct {p0}, LIb/u;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-gt p3, v0, :cond_1

    .line 24
    .line 25
    return p4

    .line 26
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    int-to-double p3, p3

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-double v0, v0

    .line 36
    div-double/2addr p3, v0

    .line 37
    invoke-direct {p0}, LIb/u;->d()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 42
    .line 43
    invoke-virtual {v1}, Lexpo/modules/image/records/DecodeFormat;->toBytes()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    div-int/2addr v0, v1

    .line 48
    int-to-double v0, v0

    .line 49
    div-double/2addr v0, p3

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide p3

    .line 54
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide p3

    .line 58
    double-to-int p3, p3

    .line 59
    int-to-double p3, p3

    .line 60
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-double p1, p1

    .line 65
    div-double/2addr p3, p1

    .line 66
    double-to-float p1, p3

    .line 67
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LIb/u;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 12
    .line 13
    check-cast p1, LIb/u;

    .line 14
    .line 15
    iget-object p1, p1, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 16
    .line 17
    if-ne v1, p1, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, LIb/c;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, LIb/u;->j:Lexpo/modules/image/records/DecodeFormat;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
.end method
