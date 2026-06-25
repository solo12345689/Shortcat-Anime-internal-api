.class public LWh/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/util/List;

.field private b:I

.field private c:I

.field private d:LZh/f;

.field private e:I


# direct methods
.method constructor <init>(Ljava/util/List;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LWh/m;->d:LZh/f;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, LWh/m;->e:I

    .line 15
    .line 16
    iput-object p1, p0, LWh/m;->a:Ljava/util/List;

    .line 17
    .line 18
    iput p2, p0, LWh/m;->b:I

    .line 19
    .line 20
    iput p3, p0, LWh/m;->c:I

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p2, p3}, LWh/m;->a(II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LZh/f;

    .line 36
    .line 37
    invoke-direct {p0, p1}, LWh/m;->p(LZh/f;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method private a(II)V
    .locals 3

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LWh/m;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LWh/m;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LZh/f;

    .line 18
    .line 19
    if-ltz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-gt p2, v0, :cond_0

    .line 30
    .line 31
    return-void

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
    const-string v2, "Index "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, " out of range, line length: "

    .line 48
    .line 49
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v1, "Line index "

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p1, " out of range, number of lines: "

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, LWh/m;->a:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p2
.end method

.method public static k(LZh/g;)LWh/m;
    .locals 2

    .line 1
    new-instance v0, LWh/m;

    .line 2
    .line 3
    invoke-virtual {p0}, LZh/g;->d()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v1}, LWh/m;-><init>(Ljava/util/List;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private p(LZh/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LWh/m;->d:LZh/f;

    .line 2
    .line 3
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, LWh/m;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public b(C)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    return p1

    .line 10
    :cond_0
    if-ne v1, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p0}, LWh/m;->h()V

    .line 16
    .line 17
    .line 18
    goto :goto_0
.end method

.method public c(LXh/b;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-interface {p1, v1}, LXh/b;->a(C)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    return v0

    .line 17
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    invoke-virtual {p0}, LWh/m;->h()V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public d(LWh/l;LWh/l;)LZh/g;
    .locals 4

    .line 1
    iget v0, p1, LWh/l;->a:I

    .line 2
    .line 3
    iget v1, p2, LWh/l;->a:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LZh/f;

    .line 14
    .line 15
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, p1, LWh/l;->b:I

    .line 20
    .line 21
    iget p2, p2, LWh/l;->b:I

    .line 22
    .line 23
    invoke-interface {v1, v2, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0}, LZh/f;->b()LYh/x;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, LYh/x;->c()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0}, LYh/x;->a()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget p1, p1, LWh/l;->b:I

    .line 42
    .line 43
    add-int/2addr v0, p1

    .line 44
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {v1, v0, p1}, LYh/x;->d(III)LYh/x;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 p1, 0x0

    .line 54
    :goto_0
    invoke-static {p2, p1}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, LZh/g;->g(LZh/f;)LZh/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_1
    invoke-static {}, LZh/g;->b()LZh/g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 68
    .line 69
    iget v2, p1, LWh/l;->a:I

    .line 70
    .line 71
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LZh/f;

    .line 76
    .line 77
    iget v2, p1, LWh/l;->b:I

    .line 78
    .line 79
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v1, v2, v3}, LZh/f;->d(II)LZh/f;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, LZh/g;->a(LZh/f;)V

    .line 92
    .line 93
    .line 94
    iget p1, p1, LWh/l;->a:I

    .line 95
    .line 96
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 97
    .line 98
    iget v1, p2, LWh/l;->a:I

    .line 99
    .line 100
    if-ge p1, v1, :cond_2

    .line 101
    .line 102
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, LZh/f;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, LZh/g;->a(LZh/f;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    iget-object p1, p0, LWh/m;->a:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, LZh/f;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    iget p2, p2, LWh/l;->b:I

    .line 124
    .line 125
    invoke-virtual {p1, v1, p2}, LZh/f;->d(II)LZh/f;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v0, p1}, LZh/g;->a(LZh/f;)V

    .line 130
    .line 131
    .line 132
    return-object v0
.end method

.method public e()Z
    .locals 3

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    iget v1, p0, LWh/m;->e:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget v0, p0, LWh/m;->b:I

    .line 10
    .line 11
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v1, v2

    .line 18
    if-ge v0, v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public f(LXh/b;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p1, v1}, LXh/b;->a(C)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-virtual {p0}, LWh/m;->h()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return v0
.end method

.method public g(C)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v1, p1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0}, LWh/m;->h()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LWh/m;->c:I

    .line 6
    .line 7
    iget v1, p0, LWh/m;->e:I

    .line 8
    .line 9
    if-le v0, v1, :cond_1

    .line 10
    .line 11
    iget v0, p0, LWh/m;->b:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p0, LWh/m;->b:I

    .line 16
    .line 17
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ge v0, v1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LWh/m;->a:Ljava/util/List;

    .line 26
    .line 27
    iget v1, p0, LWh/m;->b:I

    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, LZh/f;

    .line 34
    .line 35
    invoke-direct {p0, v0}, LWh/m;->p(LZh/f;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v0, ""

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v1}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0, v0}, LWh/m;->p(LZh/f;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 v0, 0x0

    .line 50
    iput v0, p0, LWh/m;->c:I

    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public i(C)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LWh/m;->l()C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LWh/m;->h()V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public j(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    iget v1, p0, LWh/m;->e:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/2addr v0, v1

    .line 13
    iget v1, p0, LWh/m;->e:I

    .line 14
    .line 15
    if-gt v0, v1, :cond_2

    .line 16
    .line 17
    move v0, v2

    .line 18
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, LWh/m;->d:LZh/f;

    .line 25
    .line 26
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget v3, p0, LWh/m;->c:I

    .line 31
    .line 32
    add-int/2addr v3, v0

    .line 33
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eq v1, v3, :cond_0

    .line 42
    .line 43
    return v2

    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget v0, p0, LWh/m;->c:I

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    add-int/2addr v0, p1

    .line 54
    iput v0, p0, LWh/m;->c:I

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_2
    return v2
.end method

.method public l()C
    .locals 2

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    iget v1, p0, LWh/m;->e:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LWh/m;->d:LZh/f;

    .line 8
    .line 9
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, LWh/m;->c:I

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, LWh/m;->b:I

    .line 21
    .line 22
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    if-ge v0, v1, :cond_1

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    return v0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return v0
.end method

.method public m()I
    .locals 3

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    iget v1, p0, LWh/m;->e:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LWh/m;->d:LZh/f;

    .line 8
    .line 9
    invoke-virtual {v0}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, LWh/m;->c:I

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget v1, p0, LWh/m;->c:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    iget v2, p0, LWh/m;->e:I

    .line 30
    .line 31
    if-ge v1, v2, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, LWh/m;->d:LZh/f;

    .line 34
    .line 35
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget v2, p0, LWh/m;->c:I

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :cond_0
    return v0

    .line 58
    :cond_1
    iget v0, p0, LWh/m;->b:I

    .line 59
    .line 60
    iget-object v1, p0, LWh/m;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/lit8 v1, v1, -0x1

    .line 67
    .line 68
    if-ge v0, v1, :cond_2

    .line 69
    .line 70
    const/16 v0, 0xa

    .line 71
    .line 72
    return v0

    .line 73
    :cond_2
    const/4 v0, 0x0

    .line 74
    return v0
.end method

.method public n()I
    .locals 4

    .line 1
    iget v0, p0, LWh/m;->c:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    iget-object v2, p0, LWh/m;->d:LZh/f;

    .line 8
    .line 9
    invoke-virtual {v2}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LWh/m;->d:LZh/f;

    .line 26
    .line 27
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    add-int/lit8 v0, v0, -0x2

    .line 32
    .line 33
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {v0, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    return v0

    .line 48
    :cond_0
    return v2

    .line 49
    :cond_1
    iget v0, p0, LWh/m;->b:I

    .line 50
    .line 51
    if-lez v0, :cond_2

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    return v0

    .line 56
    :cond_2
    const/4 v0, 0x0

    .line 57
    return v0
.end method

.method public o()LWh/l;
    .locals 3

    .line 1
    new-instance v0, LWh/l;

    .line 2
    .line 3
    iget v1, p0, LWh/m;->b:I

    .line 4
    .line 5
    iget v2, p0, LWh/m;->c:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LWh/l;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public q(LWh/l;)V
    .locals 2

    .line 1
    iget v0, p1, LWh/l;->a:I

    .line 2
    .line 3
    iget v1, p1, LWh/l;->b:I

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, LWh/m;->a(II)V

    .line 6
    .line 7
    .line 8
    iget v0, p1, LWh/l;->a:I

    .line 9
    .line 10
    iput v0, p0, LWh/m;->b:I

    .line 11
    .line 12
    iget p1, p1, LWh/l;->b:I

    .line 13
    .line 14
    iput p1, p0, LWh/m;->c:I

    .line 15
    .line 16
    iget-object p1, p0, LWh/m;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, LZh/f;

    .line 23
    .line 24
    invoke-direct {p0, p1}, LWh/m;->p(LZh/f;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public r()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-virtual {p0}, LWh/m;->h()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
