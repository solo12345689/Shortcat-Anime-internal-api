.class LXg/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Ljava/util/Map;


# direct methods
.method constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LXg/f;->d:Ljava/util/Map;

    .line 10
    .line 11
    const v1, -0xffff

    .line 12
    .line 13
    .line 14
    and-int/2addr v1, p1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iput p1, p0, LXg/f;->a:I

    .line 19
    .line 20
    add-int/lit8 v1, p1, 0x3f

    .line 21
    .line 22
    ushr-int/lit8 v1, v1, 0x6

    .line 23
    .line 24
    iput v1, p0, LXg/f;->b:I

    .line 25
    .line 26
    mul-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    iput v1, p0, LXg/f;->c:I

    .line 29
    .line 30
    invoke-static {v0, p1}, LXg/f;->b(Ljava/util/Map;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method private static a(III)I
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    const-wide v1, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-lt p2, v3, :cond_0

    .line 10
    .line 11
    mul-int v4, p1, v0

    .line 12
    .line 13
    int-to-long v4, v4

    .line 14
    and-long/2addr v1, v4

    .line 15
    int-to-long v4, p0

    .line 16
    mul-long/2addr v1, v4

    .line 17
    int-to-long v4, v0

    .line 18
    add-long/2addr v1, v4

    .line 19
    ushr-long v0, v1, v3

    .line 20
    .line 21
    long-to-int v0, v0

    .line 22
    add-int/lit8 p2, p2, -0x20

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-lez p2, :cond_1

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    neg-int v4, p2

    .line 29
    ushr-int/2addr v3, v4

    .line 30
    mul-int/2addr p1, v0

    .line 31
    and-int/2addr p1, v3

    .line 32
    int-to-long v3, p1

    .line 33
    and-long/2addr v1, v3

    .line 34
    int-to-long p0, p0

    .line 35
    mul-long/2addr v1, p0

    .line 36
    int-to-long p0, v0

    .line 37
    add-long/2addr v1, p0

    .line 38
    ushr-long p0, v1, p2

    .line 39
    .line 40
    long-to-int p0, p0

    .line 41
    return p0

    .line 42
    :cond_1
    return v0
.end method

.method private static b(Ljava/util/Map;I)V
    .locals 8

    .line 1
    add-int/lit8 v0, p1, -0x2

    .line 2
    .line 3
    invoke-static {v0}, LOh/e;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    rsub-int/lit8 v1, v1, 0x20

    .line 8
    .line 9
    neg-int v2, p1

    .line 10
    invoke-static {v2}, LUg/b;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v1, :cond_2

    .line 17
    .line 18
    add-int/lit8 v5, v4, -0x1

    .line 19
    .line 20
    shl-int v5, v3, v5

    .line 21
    .line 22
    const/16 v6, 0x40

    .line 23
    .line 24
    if-lt v5, v6, :cond_0

    .line 25
    .line 26
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {p0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-nez v7, :cond_0

    .line 35
    .line 36
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-static {p1, v2, v5}, LXg/f;->a(III)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-interface {p0, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    shl-int v5, v3, v4

    .line 52
    .line 53
    and-int v7, v0, v5

    .line 54
    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    add-int/lit8 v5, v5, -0x1

    .line 58
    .line 59
    and-int/2addr v5, v0

    .line 60
    if-lt v5, v6, :cond_1

    .line 61
    .line 62
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {p0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_1

    .line 71
    .line 72
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {p1, v2, v5}, LXg/f;->a(III)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-static {v5}, LOh/e;->b(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-interface {p0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-void
.end method
