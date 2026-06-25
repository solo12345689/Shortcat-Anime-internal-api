.class public final LU/k0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(JJJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LU/k0;->a:J

    .line 4
    iput-wide p3, p0, LU/k0;->b:J

    .line 5
    iput-wide p5, p0, LU/k0;->c:J

    .line 6
    iput-wide p7, p0, LU/k0;->d:J

    .line 7
    iput-wide p9, p0, LU/k0;->e:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, LU/k0;-><init>(JJJJJ)V

    return-void
.end method


# virtual methods
.method public final a(F)J
    .locals 5

    .line 1
    iget-wide v0, p0, LU/k0;->a:J

    .line 2
    .line 3
    iget-wide v2, p0, LU/k0;->b:J

    .line 4
    .line 5
    invoke-static {}, Lw/F;->c()Lw/D;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-interface {v4, p1}, Lw/D;->a(F)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, v2, v3, p1}, Ls0/s0;->i(JJF)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
.end method

.method public final b(JJJJJ)LU/k0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x10

    .line 4
    .line 5
    cmp-long v3, p1, v1

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-wide/from16 v6, p1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v3, v0, LU/k0;->a:J

    .line 13
    .line 14
    move-wide v6, v3

    .line 15
    :goto_0
    cmp-long v3, p3, v1

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-wide/from16 v8, p3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-wide v3, v0, LU/k0;->b:J

    .line 23
    .line 24
    move-wide v8, v3

    .line 25
    :goto_1
    cmp-long v3, p5, v1

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    move-wide/from16 v10, p5

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    iget-wide v3, v0, LU/k0;->c:J

    .line 33
    .line 34
    move-wide v10, v3

    .line 35
    :goto_2
    cmp-long v3, p7, v1

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    move-wide/from16 v12, p7

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    iget-wide v3, v0, LU/k0;->d:J

    .line 43
    .line 44
    move-wide v12, v3

    .line 45
    :goto_3
    cmp-long v1, p9, v1

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    move-wide/from16 v14, p9

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    iget-wide v1, v0, LU/k0;->e:J

    .line 53
    .line 54
    move-wide v14, v1

    .line 55
    :goto_4
    new-instance v5, LU/k0;

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    invoke-direct/range {v5 .. v16}, LU/k0;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    return-object v5
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU/k0;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU/k0;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU/k0;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_7

    .line 7
    .line 8
    instance-of v2, p1, LU/k0;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-wide v2, p0, LU/k0;->a:J

    .line 14
    .line 15
    check-cast p1, LU/k0;

    .line 16
    .line 17
    iget-wide v4, p1, LU/k0;->a:J

    .line 18
    .line 19
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-wide v2, p0, LU/k0;->b:J

    .line 27
    .line 28
    iget-wide v4, p1, LU/k0;->b:J

    .line 29
    .line 30
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    iget-wide v2, p0, LU/k0;->c:J

    .line 38
    .line 39
    iget-wide v4, p1, LU/k0;->c:J

    .line 40
    .line 41
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_4

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    iget-wide v2, p0, LU/k0;->d:J

    .line 49
    .line 50
    iget-wide v4, p1, LU/k0;->d:J

    .line 51
    .line 52
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    return v1

    .line 59
    :cond_5
    iget-wide v2, p0, LU/k0;->e:J

    .line 60
    .line 61
    iget-wide v4, p1, LU/k0;->e:J

    .line 62
    .line 63
    invoke-static {v2, v3, v4, v5}, Ls0/r0;->s(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_6

    .line 68
    .line 69
    return v1

    .line 70
    :cond_6
    return v0

    .line 71
    :cond_7
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, LU/k0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ls0/r0;->y(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, LU/k0;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ls0/r0;->y(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-wide v1, p0, LU/k0;->c:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Ls0/r0;->y(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-wide v1, p0, LU/k0;->d:J

    .line 28
    .line 29
    invoke-static {v1, v2}, Ls0/r0;->y(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-wide v1, p0, LU/k0;->e:J

    .line 37
    .line 38
    invoke-static {v1, v2}, Ls0/r0;->y(J)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    return v0
.end method
