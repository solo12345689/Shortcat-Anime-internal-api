.class public final Li0/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/p$a;
    }
.end annotation


# static fields
.field public static final e:Li0/p$a;

.field private static final f:Li0/p;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:[J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Li0/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li0/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li0/p;->e:Li0/p$a;

    .line 8
    .line 9
    new-instance v2, Li0/p;

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    invoke-direct/range {v2 .. v9}, Li0/p;-><init>(JJJ[J)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Li0/p;->f:Li0/p;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>(JJJ[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Li0/p;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Li0/p;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Li0/p;->c:J

    .line 9
    .line 10
    iput-object p7, p0, Li0/p;->d:[J

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic b(Li0/p;)[J
    .locals 0

    .line 1
    iget-object p0, p0, Li0/p;->d:[J

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d()Li0/p;
    .locals 1

    .line 1
    sget-object v0, Li0/p;->f:Li0/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e(Li0/p;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/p;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic f(Li0/p;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/p;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic i(Li0/p;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/p;->a:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Li0/p$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Li0/p$b;-><init>(Li0/p;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LCf/l;->b(Lkotlin/jvm/functions/Function2;)LCf/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final l(Li0/p;)Li0/p;
    .locals 12

    .line 1
    sget-object v0, Li0/p;->f:Li0/p;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_1
    iget-wide v0, p1, Li0/p;->c:J

    .line 10
    .line 11
    iget-wide v7, p0, Li0/p;->c:J

    .line 12
    .line 13
    cmp-long v0, v0, v7

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p1, Li0/p;->d:[J

    .line 18
    .line 19
    iget-object v9, p0, Li0/p;->d:[J

    .line 20
    .line 21
    if-ne v0, v9, :cond_2

    .line 22
    .line 23
    new-instance v2, Li0/p;

    .line 24
    .line 25
    iget-wide v0, p0, Li0/p;->a:J

    .line 26
    .line 27
    iget-wide v3, p1, Li0/p;->a:J

    .line 28
    .line 29
    not-long v3, v3

    .line 30
    and-long/2addr v3, v0

    .line 31
    iget-wide v0, p0, Li0/p;->b:J

    .line 32
    .line 33
    iget-wide v5, p1, Li0/p;->b:J

    .line 34
    .line 35
    not-long v5, v5

    .line 36
    and-long/2addr v5, v0

    .line 37
    invoke-direct/range {v2 .. v9}, Li0/p;-><init>(JJJ[J)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_2
    invoke-static {p1}, Li0/p;->b(Li0/p;)[J

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    array-length v2, v0

    .line 49
    move-object v4, p0

    .line 50
    move v3, v1

    .line 51
    :goto_0
    if-ge v3, v2, :cond_4

    .line 52
    .line 53
    aget-wide v5, v0, v3

    .line 54
    .line 55
    invoke-virtual {v4, v5, v6}, Li0/p;->n(J)Li0/p;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v4, p0

    .line 63
    :cond_4
    invoke-static {p1}, Li0/p;->f(Li0/p;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    cmp-long v0, v2, v5

    .line 70
    .line 71
    const-wide/16 v2, 0x1

    .line 72
    .line 73
    const/16 v7, 0x40

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    move v0, v1

    .line 78
    :goto_1
    if-ge v0, v7, :cond_6

    .line 79
    .line 80
    invoke-static {p1}, Li0/p;->f(Li0/p;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    shl-long v10, v2, v0

    .line 85
    .line 86
    and-long/2addr v8, v10

    .line 87
    cmp-long v8, v8, v5

    .line 88
    .line 89
    if-eqz v8, :cond_5

    .line 90
    .line 91
    invoke-static {p1}, Li0/p;->e(Li0/p;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    int-to-long v10, v0

    .line 96
    add-long/2addr v8, v10

    .line 97
    invoke-virtual {v4, v8, v9}, Li0/p;->n(J)Li0/p;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    invoke-static {p1}, Li0/p;->i(Li0/p;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    cmp-long v0, v8, v5

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    :goto_2
    if-ge v1, v7, :cond_8

    .line 113
    .line 114
    invoke-static {p1}, Li0/p;->i(Li0/p;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    shl-long v10, v2, v1

    .line 119
    .line 120
    and-long/2addr v8, v10

    .line 121
    cmp-long v0, v8, v5

    .line 122
    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-static {p1}, Li0/p;->e(Li0/p;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    int-to-long v10, v1

    .line 130
    add-long/2addr v8, v10

    .line 131
    int-to-long v10, v7

    .line 132
    add-long/2addr v8, v10

    .line 133
    invoke-virtual {v4, v8, v9}, Li0/p;->n(J)Li0/p;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v4, v0

    .line 138
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_8
    return-object v4
.end method

.method public final n(J)Li0/p;
    .locals 12

    .line 1
    iget-wide v0, p0, Li0/p;->c:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    int-to-long v2, v2

    .line 7
    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const-wide/16 v7, 0x1

    .line 14
    .line 15
    const/16 v9, 0x40

    .line 16
    .line 17
    if-ltz v4, :cond_0

    .line 18
    .line 19
    int-to-long v10, v9

    .line 20
    invoke-static {v0, v1, v10, v11}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-gez v4, :cond_0

    .line 25
    .line 26
    long-to-int p1, v0

    .line 27
    shl-long p1, v7, p1

    .line 28
    .line 29
    iget-wide v0, p0, Li0/p;->b:J

    .line 30
    .line 31
    and-long v2, v0, p1

    .line 32
    .line 33
    cmp-long v2, v2, v5

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    new-instance v3, Li0/p;

    .line 38
    .line 39
    iget-wide v4, p0, Li0/p;->a:J

    .line 40
    .line 41
    not-long p1, p1

    .line 42
    and-long v6, v0, p1

    .line 43
    .line 44
    iget-wide v8, p0, Li0/p;->c:J

    .line 45
    .line 46
    iget-object v10, p0, Li0/p;->d:[J

    .line 47
    .line 48
    invoke-direct/range {v3 .. v10}, Li0/p;-><init>(JJJ[J)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_0
    int-to-long v10, v9

    .line 53
    invoke-static {v0, v1, v10, v11}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ltz v4, :cond_1

    .line 58
    .line 59
    const/16 v4, 0x80

    .line 60
    .line 61
    int-to-long v10, v4

    .line 62
    invoke-static {v0, v1, v10, v11}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-gez v4, :cond_1

    .line 67
    .line 68
    long-to-int p1, v0

    .line 69
    sub-int/2addr p1, v9

    .line 70
    shl-long p1, v7, p1

    .line 71
    .line 72
    iget-wide v0, p0, Li0/p;->a:J

    .line 73
    .line 74
    and-long v2, v0, p1

    .line 75
    .line 76
    cmp-long v2, v2, v5

    .line 77
    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    new-instance v3, Li0/p;

    .line 81
    .line 82
    not-long p1, p1

    .line 83
    and-long v4, v0, p1

    .line 84
    .line 85
    iget-wide v6, p0, Li0/p;->b:J

    .line 86
    .line 87
    iget-wide v8, p0, Li0/p;->c:J

    .line 88
    .line 89
    iget-object v10, p0, Li0/p;->d:[J

    .line 90
    .line 91
    invoke-direct/range {v3 .. v10}, Li0/p;-><init>(JJJ[J)V

    .line 92
    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_1
    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-gez v0, :cond_2

    .line 100
    .line 101
    iget-object v0, p0, Li0/p;->d:[J

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    invoke-static {v0, p1, p2}, Li0/q;->a([JJ)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-ltz p1, :cond_2

    .line 110
    .line 111
    new-instance v1, Li0/p;

    .line 112
    .line 113
    iget-wide v2, p0, Li0/p;->a:J

    .line 114
    .line 115
    iget-wide v4, p0, Li0/p;->b:J

    .line 116
    .line 117
    iget-wide v6, p0, Li0/p;->c:J

    .line 118
    .line 119
    invoke-static {v0, p1}, Li0/q;->e([JI)[J

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-direct/range {v1 .. v8}, Li0/p;-><init>(JJJ[J)V

    .line 124
    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_2
    return-object p0
.end method

.method public final p(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-wide v3, v0, Li0/p;->c:J

    .line 6
    .line 7
    sub-long v3, v1, v3

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    int-to-long v6, v5

    .line 11
    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    const-wide/16 v11, 0x1

    .line 16
    .line 17
    const/4 v13, 0x1

    .line 18
    const/16 v14, 0x40

    .line 19
    .line 20
    const-wide/16 v15, 0x0

    .line 21
    .line 22
    if-ltz v8, :cond_1

    .line 23
    .line 24
    int-to-long v9, v14

    .line 25
    invoke-static {v3, v4, v9, v10}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-gez v8, :cond_1

    .line 30
    .line 31
    long-to-int v1, v3

    .line 32
    shl-long v1, v11, v1

    .line 33
    .line 34
    iget-wide v3, v0, Li0/p;->b:J

    .line 35
    .line 36
    and-long/2addr v1, v3

    .line 37
    cmp-long v1, v1, v15

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    return v13

    .line 42
    :cond_0
    return v5

    .line 43
    :cond_1
    int-to-long v8, v14

    .line 44
    invoke-static {v3, v4, v8, v9}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-ltz v8, :cond_3

    .line 49
    .line 50
    const/16 v8, 0x80

    .line 51
    .line 52
    int-to-long v8, v8

    .line 53
    invoke-static {v3, v4, v8, v9}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-gez v8, :cond_3

    .line 58
    .line 59
    long-to-int v1, v3

    .line 60
    sub-int/2addr v1, v14

    .line 61
    shl-long v1, v11, v1

    .line 62
    .line 63
    iget-wide v3, v0, Li0/p;->a:J

    .line 64
    .line 65
    and-long/2addr v1, v3

    .line 66
    cmp-long v1, v1, v15

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    return v13

    .line 71
    :cond_2
    return v5

    .line 72
    :cond_3
    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-lez v3, :cond_4

    .line 77
    .line 78
    return v5

    .line 79
    :cond_4
    iget-object v3, v0, Li0/p;->d:[J

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    invoke-static {v3, v1, v2}, Li0/q;->a([JJ)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ltz v1, :cond_5

    .line 88
    .line 89
    return v13

    .line 90
    :cond_5
    return v5
.end method

.method public final r(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Li0/p;->d:[J

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    aget-wide p1, v0, p1

    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_0
    iget-wide v0, p0, Li0/p;->b:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-wide p1, p0, Li0/p;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v0, v0

    .line 24
    add-long/2addr p1, v0

    .line 25
    return-wide p1

    .line 26
    :cond_1
    iget-wide v0, p0, Li0/p;->a:J

    .line 27
    .line 28
    cmp-long v2, v0, v2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-wide p1, p0, Li0/p;->c:J

    .line 33
    .line 34
    const/16 v2, 0x40

    .line 35
    .line 36
    int-to-long v2, v2

    .line 37
    add-long/2addr p1, v2

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    add-long/2addr p1, v0

    .line 44
    :cond_2
    return-wide p1
.end method

.method public final t(Li0/p;)Li0/p;
    .locals 12

    .line 1
    sget-object v0, Li0/p;->f:Li0/p;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_1
    iget-wide v0, p1, Li0/p;->c:J

    .line 10
    .line 11
    iget-wide v7, p0, Li0/p;->c:J

    .line 12
    .line 13
    cmp-long v0, v0, v7

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p1, Li0/p;->d:[J

    .line 18
    .line 19
    iget-object v9, p0, Li0/p;->d:[J

    .line 20
    .line 21
    if-ne v0, v9, :cond_2

    .line 22
    .line 23
    new-instance v2, Li0/p;

    .line 24
    .line 25
    iget-wide v0, p0, Li0/p;->a:J

    .line 26
    .line 27
    iget-wide v3, p1, Li0/p;->a:J

    .line 28
    .line 29
    or-long/2addr v3, v0

    .line 30
    iget-wide v0, p0, Li0/p;->b:J

    .line 31
    .line 32
    iget-wide v5, p1, Li0/p;->b:J

    .line 33
    .line 34
    or-long/2addr v5, v0

    .line 35
    invoke-direct/range {v2 .. v9}, Li0/p;-><init>(JJJ[J)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    iget-object v0, p0, Li0/p;->d:[J

    .line 40
    .line 41
    const-wide/16 v1, 0x1

    .line 42
    .line 43
    const/16 v3, 0x40

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const-wide/16 v5, 0x0

    .line 47
    .line 48
    if-nez v0, :cond_8

    .line 49
    .line 50
    invoke-static {p0}, Li0/p;->b(Li0/p;)[J

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    array-length v7, v0

    .line 57
    move v8, v4

    .line 58
    :goto_0
    if-ge v8, v7, :cond_3

    .line 59
    .line 60
    aget-wide v9, v0, v8

    .line 61
    .line 62
    invoke-virtual {p1, v9, v10}, Li0/p;->u(J)Li0/p;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    add-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {p0}, Li0/p;->f(Li0/p;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v7

    .line 73
    cmp-long v0, v7, v5

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    move v0, v4

    .line 78
    :goto_1
    if-ge v0, v3, :cond_5

    .line 79
    .line 80
    invoke-static {p0}, Li0/p;->f(Li0/p;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    shl-long v9, v1, v0

    .line 85
    .line 86
    and-long/2addr v7, v9

    .line 87
    cmp-long v7, v7, v5

    .line 88
    .line 89
    if-eqz v7, :cond_4

    .line 90
    .line 91
    invoke-static {p0}, Li0/p;->e(Li0/p;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    int-to-long v9, v0

    .line 96
    add-long/2addr v7, v9

    .line 97
    invoke-virtual {p1, v7, v8}, Li0/p;->u(J)Li0/p;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {p0}, Li0/p;->i(Li0/p;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v7

    .line 108
    cmp-long v0, v7, v5

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    :goto_2
    if-ge v4, v3, :cond_7

    .line 113
    .line 114
    invoke-static {p0}, Li0/p;->i(Li0/p;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    shl-long v9, v1, v4

    .line 119
    .line 120
    and-long/2addr v7, v9

    .line 121
    cmp-long v0, v7, v5

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-static {p0}, Li0/p;->e(Li0/p;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    int-to-long v9, v4

    .line 130
    add-long/2addr v7, v9

    .line 131
    int-to-long v9, v3

    .line 132
    add-long/2addr v7, v9

    .line 133
    invoke-virtual {p1, v7, v8}, Li0/p;->u(J)Li0/p;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    return-object p1

    .line 141
    :cond_8
    invoke-static {p1}, Li0/p;->b(Li0/p;)[J

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    array-length v7, v0

    .line 148
    move-object v9, p0

    .line 149
    move v8, v4

    .line 150
    :goto_3
    if-ge v8, v7, :cond_a

    .line 151
    .line 152
    aget-wide v10, v0, v8

    .line 153
    .line 154
    invoke-virtual {v9, v10, v11}, Li0/p;->u(J)Li0/p;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_9
    move-object v9, p0

    .line 162
    :cond_a
    invoke-static {p1}, Li0/p;->f(Li0/p;)J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    cmp-long v0, v7, v5

    .line 167
    .line 168
    if-eqz v0, :cond_c

    .line 169
    .line 170
    move v0, v4

    .line 171
    :goto_4
    if-ge v0, v3, :cond_c

    .line 172
    .line 173
    invoke-static {p1}, Li0/p;->f(Li0/p;)J

    .line 174
    .line 175
    .line 176
    move-result-wide v7

    .line 177
    shl-long v10, v1, v0

    .line 178
    .line 179
    and-long/2addr v7, v10

    .line 180
    cmp-long v7, v7, v5

    .line 181
    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    invoke-static {p1}, Li0/p;->e(Li0/p;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v7

    .line 188
    int-to-long v10, v0

    .line 189
    add-long/2addr v7, v10

    .line 190
    invoke-virtual {v9, v7, v8}, Li0/p;->u(J)Li0/p;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    move-object v9, v7

    .line 195
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_c
    invoke-static {p1}, Li0/p;->i(Li0/p;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    cmp-long v0, v7, v5

    .line 203
    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    :goto_5
    if-ge v4, v3, :cond_e

    .line 207
    .line 208
    invoke-static {p1}, Li0/p;->i(Li0/p;)J

    .line 209
    .line 210
    .line 211
    move-result-wide v7

    .line 212
    shl-long v10, v1, v4

    .line 213
    .line 214
    and-long/2addr v7, v10

    .line 215
    cmp-long v0, v7, v5

    .line 216
    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    invoke-static {p1}, Li0/p;->e(Li0/p;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    int-to-long v10, v4

    .line 224
    add-long/2addr v7, v10

    .line 225
    int-to-long v10, v3

    .line 226
    add-long/2addr v7, v10

    .line 227
    invoke-virtual {v9, v7, v8}, Li0/p;->u(J)Li0/p;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v9, v0

    .line 232
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_e
    return-object v9
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " ["

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-static {p0, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v9, 0x3f

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-static/range {v2 .. v10}, Li0/c;->d(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x5d

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public final u(J)Li0/p;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-wide v3, v0, Li0/p;->c:J

    .line 6
    .line 7
    sub-long v3, v1, v3

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    int-to-long v6, v5

    .line 11
    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    const-wide/16 v9, 0x1

    .line 16
    .line 17
    const/16 v11, 0x40

    .line 18
    .line 19
    const-wide/16 v12, 0x0

    .line 20
    .line 21
    if-ltz v8, :cond_0

    .line 22
    .line 23
    int-to-long v14, v11

    .line 24
    invoke-static {v3, v4, v14, v15}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-gez v8, :cond_0

    .line 29
    .line 30
    long-to-int v1, v3

    .line 31
    shl-long v1, v9, v1

    .line 32
    .line 33
    iget-wide v3, v0, Li0/p;->b:J

    .line 34
    .line 35
    and-long v5, v3, v1

    .line 36
    .line 37
    cmp-long v5, v5, v12

    .line 38
    .line 39
    if-nez v5, :cond_c

    .line 40
    .line 41
    new-instance v6, Li0/p;

    .line 42
    .line 43
    iget-wide v7, v0, Li0/p;->a:J

    .line 44
    .line 45
    or-long v9, v3, v1

    .line 46
    .line 47
    iget-wide v11, v0, Li0/p;->c:J

    .line 48
    .line 49
    iget-object v13, v0, Li0/p;->d:[J

    .line 50
    .line 51
    invoke-direct/range {v6 .. v13}, Li0/p;-><init>(JJJ[J)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_0
    int-to-long v14, v11

    .line 56
    invoke-static {v3, v4, v14, v15}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    move/from16 v16, v5

    .line 61
    .line 62
    const/16 v5, 0x80

    .line 63
    .line 64
    move-wide/from16 v17, v9

    .line 65
    .line 66
    if-ltz v8, :cond_1

    .line 67
    .line 68
    int-to-long v9, v5

    .line 69
    invoke-static {v3, v4, v9, v10}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-gez v8, :cond_1

    .line 74
    .line 75
    long-to-int v1, v3

    .line 76
    sub-int/2addr v1, v11

    .line 77
    shl-long v1, v17, v1

    .line 78
    .line 79
    iget-wide v3, v0, Li0/p;->a:J

    .line 80
    .line 81
    and-long v5, v3, v1

    .line 82
    .line 83
    cmp-long v5, v5, v12

    .line 84
    .line 85
    if-nez v5, :cond_c

    .line 86
    .line 87
    new-instance v6, Li0/p;

    .line 88
    .line 89
    or-long v7, v3, v1

    .line 90
    .line 91
    iget-wide v9, v0, Li0/p;->b:J

    .line 92
    .line 93
    iget-wide v11, v0, Li0/p;->c:J

    .line 94
    .line 95
    iget-object v13, v0, Li0/p;->d:[J

    .line 96
    .line 97
    invoke-direct/range {v6 .. v13}, Li0/p;-><init>(JJJ[J)V

    .line 98
    .line 99
    .line 100
    return-object v6

    .line 101
    :cond_1
    int-to-long v8, v5

    .line 102
    invoke-static {v3, v4, v8, v9}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const/4 v4, 0x1

    .line 107
    if-ltz v3, :cond_a

    .line 108
    .line 109
    invoke-virtual/range {p0 .. p2}, Li0/p;->p(J)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_c

    .line 114
    .line 115
    move-wide/from16 v19, v12

    .line 116
    .line 117
    iget-wide v12, v0, Li0/p;->a:J

    .line 118
    .line 119
    move-wide/from16 v21, v12

    .line 120
    .line 121
    iget-wide v11, v0, Li0/p;->b:J

    .line 122
    .line 123
    move-wide/from16 v23, v8

    .line 124
    .line 125
    iget-wide v8, v0, Li0/p;->c:J

    .line 126
    .line 127
    int-to-long v4, v4

    .line 128
    add-long v25, v1, v4

    .line 129
    .line 130
    div-long v25, v25, v14

    .line 131
    .line 132
    move-wide/from16 v27, v4

    .line 133
    .line 134
    mul-long v3, v25, v14

    .line 135
    .line 136
    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-gez v5, :cond_2

    .line 141
    .line 142
    const-wide v3, 0x7fffffffffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    sub-long v3, v3, v23

    .line 148
    .line 149
    add-long v3, v3, v27

    .line 150
    .line 151
    :cond_2
    const/4 v5, 0x0

    .line 152
    move-wide/from16 v22, v21

    .line 153
    .line 154
    :goto_0
    invoke-static {v8, v9, v3, v4}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-gez v6, :cond_7

    .line 159
    .line 160
    cmp-long v6, v11, v19

    .line 161
    .line 162
    if-eqz v6, :cond_5

    .line 163
    .line 164
    if-nez v5, :cond_3

    .line 165
    .line 166
    new-instance v5, Li0/o;

    .line 167
    .line 168
    iget-object v6, v0, Li0/p;->d:[J

    .line 169
    .line 170
    invoke-direct {v5, v6}, Li0/o;-><init>([J)V

    .line 171
    .line 172
    .line 173
    :cond_3
    move/from16 v6, v16

    .line 174
    .line 175
    :goto_1
    const/16 v10, 0x40

    .line 176
    .line 177
    if-ge v6, v10, :cond_5

    .line 178
    .line 179
    shl-long v24, v17, v6

    .line 180
    .line 181
    and-long v24, v11, v24

    .line 182
    .line 183
    cmp-long v7, v24, v19

    .line 184
    .line 185
    move-wide/from16 v24, v11

    .line 186
    .line 187
    if-eqz v7, :cond_4

    .line 188
    .line 189
    int-to-long v10, v6

    .line 190
    add-long/2addr v10, v8

    .line 191
    invoke-virtual {v5, v10, v11}, Li0/o;->a(J)V

    .line 192
    .line 193
    .line 194
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 195
    .line 196
    move-wide/from16 v11, v24

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_5
    cmp-long v6, v22, v19

    .line 200
    .line 201
    if-nez v6, :cond_6

    .line 202
    .line 203
    move-wide/from16 v26, v3

    .line 204
    .line 205
    move-wide/from16 v24, v19

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_6
    add-long/2addr v8, v14

    .line 209
    move-wide/from16 v11, v22

    .line 210
    .line 211
    move-wide/from16 v22, v19

    .line 212
    .line 213
    goto :goto_0

    .line 214
    :cond_7
    move-wide/from16 v24, v11

    .line 215
    .line 216
    move-wide/from16 v26, v8

    .line 217
    .line 218
    :goto_2
    new-instance v21, Li0/p;

    .line 219
    .line 220
    if-eqz v5, :cond_9

    .line 221
    .line 222
    invoke-virtual {v5}, Li0/o;->b()[J

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-nez v3, :cond_8

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    :goto_3
    move-object/from16 v28, v3

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_9
    :goto_4
    iget-object v3, v0, Li0/p;->d:[J

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :goto_5
    invoke-direct/range {v21 .. v28}, Li0/p;-><init>(JJJ[J)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v3, v21

    .line 239
    .line 240
    invoke-virtual {v3, v1, v2}, Li0/p;->u(J)Li0/p;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    return-object v1

    .line 245
    :cond_a
    iget-object v3, v0, Li0/p;->d:[J

    .line 246
    .line 247
    if-nez v3, :cond_b

    .line 248
    .line 249
    new-instance v5, Li0/p;

    .line 250
    .line 251
    iget-wide v6, v0, Li0/p;->a:J

    .line 252
    .line 253
    iget-wide v8, v0, Li0/p;->b:J

    .line 254
    .line 255
    iget-wide v10, v0, Li0/p;->c:J

    .line 256
    .line 257
    new-array v12, v4, [J

    .line 258
    .line 259
    aput-wide v1, v12, v16

    .line 260
    .line 261
    invoke-direct/range {v5 .. v12}, Li0/p;-><init>(JJJ[J)V

    .line 262
    .line 263
    .line 264
    return-object v5

    .line 265
    :cond_b
    invoke-static {v3, v1, v2}, Li0/q;->a([JJ)I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-gez v5, :cond_c

    .line 270
    .line 271
    add-int/2addr v5, v4

    .line 272
    neg-int v4, v5

    .line 273
    invoke-static {v3, v4, v1, v2}, Li0/q;->d([JIJ)[J

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    new-instance v5, Li0/p;

    .line 278
    .line 279
    iget-wide v6, v0, Li0/p;->a:J

    .line 280
    .line 281
    iget-wide v8, v0, Li0/p;->b:J

    .line 282
    .line 283
    iget-wide v10, v0, Li0/p;->c:J

    .line 284
    .line 285
    invoke-direct/range {v5 .. v12}, Li0/p;-><init>(JJJ[J)V

    .line 286
    .line 287
    .line 288
    return-object v5

    .line 289
    :cond_c
    return-object v0
.end method
