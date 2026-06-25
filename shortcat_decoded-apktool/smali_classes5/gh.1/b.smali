.class Lgh/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Lgh/c;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:Lgh/l;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lgh/b;->b:I

    .line 5
    .line 6
    const/16 v0, 0x80

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq p1, v3, :cond_2

    .line 13
    .line 14
    if-eq p1, v1, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    iput v3, p0, Lgh/b;->f:I

    .line 20
    .line 21
    const/16 v0, 0xa0

    .line 22
    .line 23
    iput v0, p0, Lgh/b;->d:I

    .line 24
    .line 25
    mul-int/lit16 v0, p1, 0x160

    .line 26
    .line 27
    :goto_0
    iput v0, p0, Lgh/b;->e:I

    .line 28
    .line 29
    iput v2, p0, Lgh/b;->q:I

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "K: "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, " is not supported for Crystals Kyber"

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_1
    iput v3, p0, Lgh/b;->f:I

    .line 61
    .line 62
    :goto_1
    iput v0, p0, Lgh/b;->d:I

    .line 63
    .line 64
    mul-int/lit16 v0, p1, 0x140

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iput v1, p0, Lgh/b;->f:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    mul-int/lit16 p1, p1, 0x180

    .line 71
    .line 72
    iput p1, p0, Lgh/b;->c:I

    .line 73
    .line 74
    add-int/lit8 v0, p1, 0x20

    .line 75
    .line 76
    iput v0, p0, Lgh/b;->g:I

    .line 77
    .line 78
    iput p1, p0, Lgh/b;->h:I

    .line 79
    .line 80
    iget v1, p0, Lgh/b;->e:I

    .line 81
    .line 82
    iget v3, p0, Lgh/b;->d:I

    .line 83
    .line 84
    add-int/2addr v1, v3

    .line 85
    iput v1, p0, Lgh/b;->i:I

    .line 86
    .line 87
    iput v0, p0, Lgh/b;->j:I

    .line 88
    .line 89
    add-int/2addr p1, v0

    .line 90
    add-int/lit8 p1, p1, 0x40

    .line 91
    .line 92
    iput p1, p0, Lgh/b;->k:I

    .line 93
    .line 94
    iput v1, p0, Lgh/b;->l:I

    .line 95
    .line 96
    iput v2, p0, Lgh/b;->m:I

    .line 97
    .line 98
    iput p1, p0, Lgh/b;->n:I

    .line 99
    .line 100
    iput v0, p0, Lgh/b;->o:I

    .line 101
    .line 102
    iput v1, p0, Lgh/b;->p:I

    .line 103
    .line 104
    new-instance p1, Lgh/l$a;

    .line 105
    .line 106
    invoke-direct {p1}, Lgh/l$a;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lgh/b;->r:Lgh/l;

    .line 110
    .line 111
    new-instance p1, Lgh/c;

    .line 112
    .line 113
    invoke-direct {p1, p0}, Lgh/c;-><init>(Lgh/b;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lgh/b;->a:Lgh/c;

    .line 117
    .line 118
    return-void
.end method

.method public static c()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method


# virtual methods
.method public a([B[B)[[B
    .locals 8

    .line 1
    iget-object v0, p0, Lgh/b;->a:Lgh/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lgh/c;->a([B)[[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lgh/b;->h:I

    .line 8
    .line 9
    new-array v4, v1, [B

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aget-object v2, v0, v2

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v2, v3, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x20

    .line 19
    .line 20
    new-array v5, v1, [B

    .line 21
    .line 22
    iget-object v1, p0, Lgh/b;->r:Lgh/l;

    .line 23
    .line 24
    aget-object v2, v0, v3

    .line 25
    .line 26
    invoke-virtual {v1, v5, v2, v3}, Lgh/l;->b([B[BI)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lgh/b;->g:I

    .line 30
    .line 31
    new-array v2, v1, [B

    .line 32
    .line 33
    aget-object v0, v0, v3

    .line 34
    .line 35
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v0, v1, -0x20

    .line 39
    .line 40
    invoke-static {v2, v3, v0}, LOh/a;->m([BII)[B

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v2, v0, v1}, LOh/a;->m([BII)[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1, p2}, LOh/a;->h([B[B)[B

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    move-object v6, p2

    .line 53
    move-object v2, v3

    .line 54
    move-object v3, v0

    .line 55
    filled-new-array/range {v2 .. v7}, [[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lgh/b;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public l()Lgh/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lgh/b;->r:Lgh/l;

    .line 2
    .line 3
    return-object v0
.end method
