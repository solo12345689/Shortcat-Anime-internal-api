.class Lgh/i;
.super Ljava/lang/Object;


# instance fields
.field private a:[S

.field private b:Lgh/b;

.field private c:I

.field private d:I

.field private e:I

.field private f:Lgh/l;


# direct methods
.method public constructor <init>(Lgh/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x100

    .line 5
    .line 6
    new-array v0, v0, [S

    .line 7
    .line 8
    iput-object v0, p0, Lgh/i;->a:[S

    .line 9
    .line 10
    iput-object p1, p0, Lgh/i;->b:Lgh/b;

    .line 11
    .line 12
    invoke-virtual {p1}, Lgh/b;->h()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lgh/i;->c:I

    .line 17
    .line 18
    invoke-virtual {p1}, Lgh/b;->b()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lgh/i;->d:I

    .line 23
    .line 24
    invoke-static {}, Lgh/b;->c()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lgh/i;->e:I

    .line 29
    .line 30
    invoke-virtual {p1}, Lgh/b;->l()Lgh/l;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lgh/i;->f:Lgh/l;

    .line 35
    .line 36
    return-void
.end method

.method public static b(Lgh/i;Lgh/i;Lgh/i;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    const/16 v3, 0x40

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    mul-int/lit8 v5, v2, 0x4

    .line 11
    .line 12
    invoke-virtual {v0, v5}, Lgh/i;->e(I)S

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    add-int/lit8 v3, v5, 0x1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Lgh/i;->e(I)S

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    invoke-virtual {v1, v5}, Lgh/i;->e(I)S

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    invoke-virtual {v1, v3}, Lgh/i;->e(I)S

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    sget-object v3, Lgh/h;->a:[S

    .line 31
    .line 32
    add-int/lit8 v11, v2, 0x40

    .line 33
    .line 34
    aget-short v10, v3, v11

    .line 35
    .line 36
    move-object/from16 v4, p0

    .line 37
    .line 38
    invoke-static/range {v4 .. v10}, Lgh/h;->a(Lgh/i;ISSSSS)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v13, v5, 0x2

    .line 42
    .line 43
    invoke-virtual {v0, v13}, Lgh/i;->e(I)S

    .line 44
    .line 45
    .line 46
    move-result v14

    .line 47
    add-int/lit8 v5, v5, 0x3

    .line 48
    .line 49
    invoke-virtual {v0, v5}, Lgh/i;->e(I)S

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    invoke-virtual {v1, v13}, Lgh/i;->e(I)S

    .line 54
    .line 55
    .line 56
    move-result v16

    .line 57
    invoke-virtual {v1, v5}, Lgh/i;->e(I)S

    .line 58
    .line 59
    .line 60
    move-result v17

    .line 61
    aget-short v3, v3, v11

    .line 62
    .line 63
    mul-int/lit8 v3, v3, -0x1

    .line 64
    .line 65
    int-to-short v3, v3

    .line 66
    move-object/from16 v12, p0

    .line 67
    .line 68
    move/from16 v18, v3

    .line 69
    .line 70
    invoke-static/range {v12 .. v18}, Lgh/h;->a(Lgh/i;ISSSSS)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lgh/i;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lgh/i;->e(I)S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1, v0}, Lgh/i;->e(I)S

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    int-to-short v1, v1

    .line 16
    invoke-virtual {p0, v0, v1}, Lgh/i;->j(IS)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lgh/i;->e(I)S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lgh/k;->b(S)S

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lgh/i;->j(IS)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lgh/i;->e(I)S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    mul-int/lit16 v1, v1, 0x549

    .line 11
    .line 12
    invoke-static {v1}, Lgh/k;->c(I)S

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0, v0, v1}, Lgh/i;->j(IS)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public e(I)S
    .locals 1

    .line 1
    iget-object v0, p0, Lgh/i;->a:[S

    .line 2
    .line 3
    aget-short p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public f()[S
    .locals 1

    .line 1
    iget-object v0, p0, Lgh/i;->a:[S

    .line 2
    .line 3
    return-object v0
.end method

.method public g([BB)V
    .locals 2

    .line 1
    iget v0, p0, Lgh/i;->d:I

    .line 2
    .line 3
    mul-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    div-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iget-object v1, p0, Lgh/i;->f:Lgh/l;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1, p2}, Lgh/l;->c([B[BB)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lgh/i;->d:I

    .line 15
    .line 16
    invoke-static {p0, v0, p1}, Lgh/a;->c(Lgh/i;[BI)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgh/i;->f()[S

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lgh/h;->c([S)[S

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lgh/i;->k([S)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lgh/i;->i()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lgh/i;->e(I)S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lgh/k;->a(S)S

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lgh/i;->j(IS)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public j(IS)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgh/i;->a:[S

    .line 2
    .line 3
    aput-short p2, v0, p1

    .line 4
    .line 5
    return-void
.end method

.method public k([S)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgh/i;->a:[S

    .line 2
    .line 3
    return-void
.end method

.method public l()[B
    .locals 7

    .line 1
    const/16 v0, 0x180

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    invoke-virtual {p0}, Lgh/i;->c()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    const/16 v2, 0x80

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v2, v1, 0x2

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lgh/i;->e(I)S

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lgh/i;->e(I)S

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    mul-int/lit8 v4, v1, 0x3

    .line 26
    .line 27
    int-to-byte v5, v3

    .line 28
    aput-byte v5, v0, v4

    .line 29
    .line 30
    add-int/lit8 v5, v4, 0x1

    .line 31
    .line 32
    shr-int/lit8 v3, v3, 0x8

    .line 33
    .line 34
    shl-int/lit8 v6, v2, 0x4

    .line 35
    .line 36
    or-int/2addr v3, v6

    .line 37
    int-to-byte v3, v3

    .line 38
    aput-byte v3, v0, v5

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x2

    .line 41
    .line 42
    shr-int/lit8 v2, v2, 0x4

    .line 43
    .line 44
    int-to-byte v2, v2

    .line 45
    aput-byte v2, v0, v4

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lgh/i;->a:[S

    .line 13
    .line 14
    array-length v3, v2

    .line 15
    if-ge v1, v3, :cond_1

    .line 16
    .line 17
    aget-short v2, v2, v1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lgh/i;->a:[S

    .line 23
    .line 24
    array-length v2, v2

    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    if-eq v1, v2, :cond_0

    .line 28
    .line 29
    const-string v2, ", "

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v1, "]"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
