.class public final Lq2/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/b$a;
    }
.end annotation


# static fields
.field public static final g:Lq2/b;

.field private static final h:Lq2/b$a;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:I

.field private final f:[Lq2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lq2/b;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    new-array v2, v8, [Lq2/b$a;

    .line 5
    .line 6
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, Lq2/b;-><init>(Ljava/lang/Object;[Lq2/b$a;JJI)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lq2/b;->g:Lq2/b;

    .line 19
    .line 20
    new-instance v0, Lq2/b$a;

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lq2/b$a;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v8}, Lq2/b$a;->l(I)Lq2/b$a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lq2/b;->h:Lq2/b$a;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lq2/b;->i:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lq2/b;->j:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lq2/b;->k:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lq2/b;->l:Ljava/lang/String;

    .line 60
    .line 61
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;[Lq2/b$a;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2/b;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p3, p0, Lq2/b;->c:J

    .line 7
    .line 8
    iput-wide p5, p0, Lq2/b;->d:J

    .line 9
    .line 10
    array-length p1, p2

    .line 11
    add-int/2addr p1, p7

    .line 12
    iput p1, p0, Lq2/b;->b:I

    .line 13
    .line 14
    iput-object p2, p0, Lq2/b;->f:[Lq2/b$a;

    .line 15
    .line 16
    iput p7, p0, Lq2/b;->e:I

    .line 17
    .line 18
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lq2/b;
    .locals 11

    .line 1
    sget-object v0, Lq2/b;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-array v0, v1, [Lq2/b$a;

    .line 11
    .line 12
    move-object v5, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-array v2, v2, [Lq2/b$a;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v1, v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-static {v3}, Lq2/b$a;->c(Landroid/os/Bundle;)Lq2/b$a;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aput-object v3, v2, v1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v5, v2

    .line 42
    :goto_1
    sget-object v0, Lq2/b;->j:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v1, Lq2/b;->g:Lq2/b;

    .line 45
    .line 46
    iget-wide v2, v1, Lq2/b;->c:J

    .line 47
    .line 48
    invoke-virtual {p0, v0, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sget-object v0, Lq2/b;->k:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v2, v1, Lq2/b;->d:J

    .line 55
    .line 56
    invoke-virtual {p0, v0, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    sget-object v0, Lq2/b;->l:Ljava/lang/String;

    .line 61
    .line 62
    iget v1, v1, Lq2/b;->e:I

    .line 63
    .line 64
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    new-instance v3, Lq2/b;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-direct/range {v3 .. v10}, Lq2/b;-><init>(Ljava/lang/Object;[Lq2/b$a;JJI)V

    .line 72
    .line 73
    .line 74
    return-object v3
.end method

.method private f(JJI)Z
    .locals 6

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    return v3

    .line 9
    :cond_0
    invoke-virtual {p0, p5}, Lq2/b;->b(I)Lq2/b$a;

    .line 10
    .line 11
    .line 12
    move-result-object p5

    .line 13
    iget-wide v4, p5, Lq2/b$a;->a:J

    .line 14
    .line 15
    cmp-long v0, v4, v0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, p3, v4

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p5}, Lq2/b$a;->i()Z

    .line 30
    .line 31
    .line 32
    move-result p5

    .line 33
    if-nez p5, :cond_2

    .line 34
    .line 35
    cmp-long p1, p1, p3

    .line 36
    .line 37
    if-gez p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v3

    .line 41
    :cond_2
    :goto_0
    return v1

    .line 42
    :cond_3
    cmp-long p1, p1, v4

    .line 43
    .line 44
    if-gez p1, :cond_4

    .line 45
    .line 46
    return v1

    .line 47
    :cond_4
    return v3
.end method


# virtual methods
.method public b(I)Lq2/b$a;
    .locals 2

    .line 1
    iget v0, p0, Lq2/b;->e:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lq2/b;->h:Lq2/b$a;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v1, p0, Lq2/b;->f:[Lq2/b$a;

    .line 9
    .line 10
    sub-int/2addr p1, v0

    .line 11
    aget-object p1, v1, p1

    .line 12
    .line 13
    return-object p1
.end method

.method public c(JJ)I
    .locals 7

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, -0x1

    .line 6
    if-eqz v2, :cond_5

    .line 7
    .line 8
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v2, p3, v4

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    cmp-long v4, p1, p3

    .line 18
    .line 19
    if-ltz v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget v4, p0, Lq2/b;->e:I

    .line 23
    .line 24
    :goto_0
    iget v5, p0, Lq2/b;->b:I

    .line 25
    .line 26
    if-ge v4, v5, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Lq2/b;->b(I)Lq2/b$a;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-wide v5, v5, Lq2/b$a;->a:J

    .line 33
    .line 34
    cmp-long v5, v5, v0

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Lq2/b;->b(I)Lq2/b$a;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-wide v5, v5, Lq2/b$a;->a:J

    .line 43
    .line 44
    cmp-long v5, v5, p1

    .line 45
    .line 46
    if-lez v5, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0, v4}, Lq2/b;->b(I)Lq2/b$a;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Lq2/b$a;->j()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget p1, p0, Lq2/b;->b:I

    .line 62
    .line 63
    if-ge v4, p1, :cond_5

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Lq2/b;->b(I)Lq2/b$a;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-wide p1, p1, Lq2/b$a;->a:J

    .line 72
    .line 73
    cmp-long p1, p1, p3

    .line 74
    .line 75
    if-gtz p1, :cond_5

    .line 76
    .line 77
    :cond_4
    return v4

    .line 78
    :cond_5
    :goto_1
    return v3
.end method

.method public d(JJ)I
    .locals 7

    .line 1
    iget v0, p0, Lq2/b;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lq2/b;->e(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    move v6, v0

    .line 11
    :goto_0
    move-object v1, p0

    .line 12
    if-ltz v6, :cond_0

    .line 13
    .line 14
    move-wide v2, p1

    .line 15
    move-wide v4, p3

    .line 16
    invoke-direct/range {v1 .. v6}, Lq2/b;->f(JJI)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    add-int/lit8 v6, v6, -0x1

    .line 23
    .line 24
    move-wide p1, v2

    .line 25
    move-wide p3, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-ltz v6, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v6}, Lq2/b;->b(I)Lq2/b$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lq2/b$a;->h()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    return v6

    .line 40
    :cond_1
    const/4 p1, -0x1

    .line 41
    return p1
.end method

.method public e(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lq2/b;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq2/b;->b(I)Lq2/b$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lq2/b$a;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
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
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lq2/b;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lq2/b;

    .line 18
    .line 19
    iget-object v2, p0, Lq2/b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v3, p1, Lq2/b;->a:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget v2, p0, Lq2/b;->b:I

    .line 30
    .line 31
    iget v3, p1, Lq2/b;->b:I

    .line 32
    .line 33
    if-ne v2, v3, :cond_2

    .line 34
    .line 35
    iget-wide v2, p0, Lq2/b;->c:J

    .line 36
    .line 37
    iget-wide v4, p1, Lq2/b;->c:J

    .line 38
    .line 39
    cmp-long v2, v2, v4

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iget-wide v2, p0, Lq2/b;->d:J

    .line 44
    .line 45
    iget-wide v4, p1, Lq2/b;->d:J

    .line 46
    .line 47
    cmp-long v2, v2, v4

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget v2, p0, Lq2/b;->e:I

    .line 52
    .line 53
    iget v3, p1, Lq2/b;->e:I

    .line 54
    .line 55
    if-ne v2, v3, :cond_2

    .line 56
    .line 57
    iget-object v2, p0, Lq2/b;->f:[Lq2/b$a;

    .line 58
    .line 59
    iget-object p1, p1, Lq2/b;->f:[Lq2/b$a;

    .line 60
    .line 61
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    return v0

    .line 68
    :cond_2
    :goto_0
    return v1
.end method

.method public g()Landroid/os/Bundle;
    .locals 6

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lq2/b;->f:[Lq2/b$a;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_0
    if-ge v4, v3, :cond_0

    .line 16
    .line 17
    aget-object v5, v2, v4

    .line 18
    .line 19
    invoke-virtual {v5}, Lq2/b$a;->k()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    sget-object v2, Lq2/b;->i:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-wide v1, p0, Lq2/b;->c:J

    .line 41
    .line 42
    sget-object v3, Lq2/b;->g:Lq2/b;

    .line 43
    .line 44
    iget-wide v4, v3, Lq2/b;->c:J

    .line 45
    .line 46
    cmp-long v4, v1, v4

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    sget-object v4, Lq2/b;->j:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v4, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-wide v1, p0, Lq2/b;->d:J

    .line 56
    .line 57
    iget-wide v4, v3, Lq2/b;->d:J

    .line 58
    .line 59
    cmp-long v4, v1, v4

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    sget-object v4, Lq2/b;->k:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v4, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget v1, p0, Lq2/b;->e:I

    .line 69
    .line 70
    iget v2, v3, Lq2/b;->e:I

    .line 71
    .line 72
    if-eq v1, v2, :cond_4

    .line 73
    .line 74
    sget-object v2, Lq2/b;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    :cond_4
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lq2/b;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lq2/b;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    :goto_0
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-wide v1, p0, Lq2/b;->c:J

    .line 19
    .line 20
    long-to-int v1, v1

    .line 21
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-wide v1, p0, Lq2/b;->d:J

    .line 25
    .line 26
    long-to-int v1, v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    mul-int/lit8 v0, v0, 0x1f

    .line 29
    .line 30
    iget v1, p0, Lq2/b;->e:I

    .line 31
    .line 32
    add-int/2addr v0, v1

    .line 33
    mul-int/lit8 v0, v0, 0x1f

    .line 34
    .line 35
    iget-object v1, p0, Lq2/b;->f:[Lq2/b$a;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v0, v1

    .line 42
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "AdPlaybackState(adsId="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lq2/b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", adResumePositionUs="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lq2/b;->c:J

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", adGroups=["

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    move v2, v1

    .line 33
    :goto_0
    iget-object v3, p0, Lq2/b;->f:[Lq2/b$a;

    .line 34
    .line 35
    array-length v3, v3

    .line 36
    const-string v4, "])"

    .line 37
    .line 38
    if-ge v2, v3, :cond_8

    .line 39
    .line 40
    const-string v3, "adGroup(timeUs="

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lq2/b;->f:[Lq2/b$a;

    .line 46
    .line 47
    aget-object v3, v3, v2

    .line 48
    .line 49
    iget-wide v5, v3, Lq2/b$a;->a:J

    .line 50
    .line 51
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v3, ", ads=["

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move v3, v1

    .line 60
    :goto_1
    iget-object v5, p0, Lq2/b;->f:[Lq2/b$a;

    .line 61
    .line 62
    aget-object v5, v5, v2

    .line 63
    .line 64
    iget-object v5, v5, Lq2/b$a;->f:[I

    .line 65
    .line 66
    array-length v5, v5

    .line 67
    const-string v6, ", "

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    if-ge v3, v5, :cond_6

    .line 71
    .line 72
    const-string v5, "ad(state="

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v5, p0, Lq2/b;->f:[Lq2/b$a;

    .line 78
    .line 79
    aget-object v5, v5, v2

    .line 80
    .line 81
    iget-object v5, v5, Lq2/b$a;->f:[I

    .line 82
    .line 83
    aget v5, v5, v3

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    if-eq v5, v7, :cond_3

    .line 88
    .line 89
    const/4 v8, 0x2

    .line 90
    if-eq v5, v8, :cond_2

    .line 91
    .line 92
    const/4 v8, 0x3

    .line 93
    if-eq v5, v8, :cond_1

    .line 94
    .line 95
    const/4 v8, 0x4

    .line 96
    if-eq v5, v8, :cond_0

    .line 97
    .line 98
    const/16 v5, 0x3f

    .line 99
    .line 100
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_0
    const/16 v5, 0x21

    .line 105
    .line 106
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    const/16 v5, 0x50

    .line 111
    .line 112
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    const/16 v5, 0x53

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const/16 v5, 0x52

    .line 123
    .line 124
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    const/16 v5, 0x5f

    .line 129
    .line 130
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    :goto_2
    const-string v5, ", durationUs="

    .line 134
    .line 135
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v5, p0, Lq2/b;->f:[Lq2/b$a;

    .line 139
    .line 140
    aget-object v5, v5, v2

    .line 141
    .line 142
    iget-object v5, v5, Lq2/b$a;->g:[J

    .line 143
    .line 144
    aget-wide v8, v5, v3

    .line 145
    .line 146
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const/16 v5, 0x29

    .line 150
    .line 151
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget-object v5, p0, Lq2/b;->f:[Lq2/b$a;

    .line 155
    .line 156
    aget-object v5, v5, v2

    .line 157
    .line 158
    iget-object v5, v5, Lq2/b$a;->f:[I

    .line 159
    .line 160
    array-length v5, v5

    .line 161
    sub-int/2addr v5, v7

    .line 162
    if-ge v3, v5, :cond_5

    .line 163
    .line 164
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object v3, p0, Lq2/b;->f:[Lq2/b$a;

    .line 174
    .line 175
    array-length v3, v3

    .line 176
    sub-int/2addr v3, v7

    .line 177
    if-ge v2, v3, :cond_7

    .line 178
    .line 179
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0
.end method
