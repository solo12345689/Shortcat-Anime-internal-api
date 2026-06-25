.class public final LG2/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG2/e;


# static fields
.field private static final f:[I


# instance fields
.field private final a:I

.field private b:Lr3/r$a;

.field private c:Z

.field private d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LG2/c;->f:[I

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x8
        0xd
        0xb
        0x2
        0x0
        0x1
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1}, LG2/c;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LG2/c;->a:I

    .line 4
    iput-boolean p2, p0, LG2/c;->e:Z

    .line 5
    new-instance p1, Lr3/g;

    invoke-direct {p1}, Lr3/g;-><init>()V

    iput-object p1, p0, LG2/c;->b:Lr3/r$a;

    return-void
.end method

.method private static f(ILjava/util/List;)V
    .locals 2

    .line 1
    sget-object v0, LG2/c;->f:[I

    .line 2
    .line 3
    invoke-static {v0, p0}, LS9/f;->k([II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method private h(ILq2/x;Ljava/util/List;Lt2/O;)LU2/p;
    .locals 8

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_5

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/16 v0, 0xb

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/16 p3, 0xd

    .line 21
    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, LG2/k;

    .line 27
    .line 28
    iget-object p2, p2, Lq2/x;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p3, p0, LG2/c;->b:Lr3/r$a;

    .line 31
    .line 32
    iget-boolean v0, p0, LG2/c;->c:Z

    .line 33
    .line 34
    invoke-direct {p1, p2, p4, p3, v0}, LG2/k;-><init>(Ljava/lang/String;Lt2/O;Lr3/r$a;Z)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    iget v1, p0, LG2/c;->a:I

    .line 39
    .line 40
    iget-boolean v2, p0, LG2/c;->e:Z

    .line 41
    .line 42
    iget-object v6, p0, LG2/c;->b:Lr3/r$a;

    .line 43
    .line 44
    iget-boolean v7, p0, LG2/c;->c:Z

    .line 45
    .line 46
    move-object v3, p2

    .line 47
    move-object v4, p3

    .line 48
    move-object v5, p4

    .line 49
    invoke-static/range {v1 .. v7}, LG2/c;->j(IZLq2/x;Ljava/util/List;Lt2/O;Lr3/r$a;Z)LB3/K;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    move-object v3, p2

    .line 55
    move-object v4, p3

    .line 56
    move-object v2, p4

    .line 57
    iget-object v0, p0, LG2/c;->b:Lr3/r$a;

    .line 58
    .line 59
    iget-boolean v1, p0, LG2/c;->c:Z

    .line 60
    .line 61
    iget v5, p0, LG2/c;->d:I

    .line 62
    .line 63
    invoke-static/range {v0 .. v5}, LG2/c;->i(Lr3/r$a;ZLt2/O;Lq2/x;Ljava/util/List;I)Lo3/h;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_3
    new-instance p1, Ln3/f;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    const-wide/16 p3, 0x0

    .line 72
    .line 73
    invoke-direct {p1, p2, p3, p4}, Ln3/f;-><init>(IJ)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_4
    new-instance p1, LB3/h;

    .line 78
    .line 79
    invoke-direct {p1}, LB3/h;-><init>()V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_5
    new-instance p1, LB3/e;

    .line 84
    .line 85
    invoke-direct {p1}, LB3/e;-><init>()V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_6
    new-instance p1, LB3/b;

    .line 90
    .line 91
    invoke-direct {p1}, LB3/b;-><init>()V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method

.method private static i(Lr3/r$a;ZLt2/O;Lq2/x;Ljava/util/List;I)Lo3/h;
    .locals 7

    .line 1
    invoke-static {p3}, LG2/c;->m(Lq2/x;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p3, 0x0

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    sget-object p0, Lr3/r$a;->a:Lr3/r$a;

    .line 13
    .line 14
    or-int/lit8 p3, p3, 0x20

    .line 15
    .line 16
    :cond_1
    move-object v1, p0

    .line 17
    invoke-static {p5}, Lo3/h;->k(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    or-int v2, p3, p0

    .line 22
    .line 23
    new-instance v0, Lo3/h;

    .line 24
    .line 25
    if-eqz p4, :cond_2

    .line 26
    .line 27
    :goto_1
    move-object v5, p4

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    goto :goto_1

    .line 34
    :goto_2
    const/4 v6, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    move-object v3, p2

    .line 37
    invoke-direct/range {v0 .. v6}, Lo3/h;-><init>(Lr3/r$a;ILt2/O;Lo3/t;Ljava/util/List;LU2/O;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private static j(IZLq2/x;Ljava/util/List;Lt2/O;Lr3/r$a;Z)LB3/K;
    .locals 8

    .line 1
    or-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    or-int/lit8 v0, p0, 0x30

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    new-instance p0, Lq2/x$b;

    .line 11
    .line 12
    invoke-direct {p0}, Lq2/x$b;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string p1, "application/cea-608"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lq2/x$b;->P()Lq2/x;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object p3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 31
    .line 32
    :goto_0
    iget-object p0, p2, Lq2/x;->k:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    const-string p1, "audio/mp4a-latm"

    .line 41
    .line 42
    invoke-static {p0, p1}, Lq2/K;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    or-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    :cond_2
    const-string p1, "video/avc"

    .line 51
    .line 52
    invoke-static {p0, p1}, Lq2/K;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    or-int/lit8 v0, v0, 0x4

    .line 59
    .line 60
    :cond_3
    if-nez p6, :cond_4

    .line 61
    .line 62
    sget-object p5, Lr3/r$a;->a:Lr3/r$a;

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    :goto_1
    move v3, p0

    .line 66
    move-object v4, p5

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/4 p0, 0x0

    .line 69
    goto :goto_1

    .line 70
    :goto_2
    new-instance v1, LB3/K;

    .line 71
    .line 72
    new-instance v6, LB3/j;

    .line 73
    .line 74
    invoke-direct {v6, v0, p3}, LB3/j;-><init>(ILjava/util/List;)V

    .line 75
    .line 76
    .line 77
    const v7, 0x1b8a0

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x2

    .line 81
    move-object v5, p4

    .line 82
    invoke-direct/range {v1 .. v7}, LB3/K;-><init>(IILr3/r$a;Lt2/O;LB3/L$c;I)V

    .line 83
    .line 84
    .line 85
    return-object v1
.end method

.method private static m(Lq2/x;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Lq2/x;->l:Lq2/J;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p0}, Lq2/J;->e()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lq2/J;->d(I)Lq2/J$a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, LG2/h;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    check-cast v2, LG2/h;

    .line 23
    .line 24
    iget-object p0, v2, LG2/h;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    xor-int/lit8 p0, p0, 0x1

    .line 31
    .line 32
    return p0

    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v0
.end method

.method private static o(LU2/p;LU2/q;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, LU2/p;->f(LU2/q;)Z

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {p1}, LU2/q;->g()V

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-interface {p1}, LU2/q;->g()V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :catch_0
    invoke-interface {p1}, LU2/q;->g()V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method


# virtual methods
.method public bridge synthetic a(Lr3/r$a;)LG2/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG2/c;->n(Lr3/r$a;)LG2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)LG2/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG2/c;->l(I)LG2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Z)LG2/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG2/c;->k(Z)LG2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Lq2/x;)Lq2/x;
    .locals 4

    .line 1
    iget-boolean v0, p0, LG2/c;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LG2/c;->b:Lr3/r$a;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lr3/r$a;->b(Lq2/x;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lq2/x;->b()Lq2/x$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "application/x-media3-cues"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, LG2/c;->b:Lr3/r$a;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Lr3/r$a;->c(Lq2/x;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lq2/x$b;->Y(I)Lq2/x$b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p1, Lq2/x;->o:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v2, p1, Lq2/x;->k:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, " "

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lq2/x;->k:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-string p1, ""

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-wide v0, 0x7fffffffffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Lq2/x$b;->C0(J)Lq2/x$b;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :cond_1
    return-object p1
.end method

.method public bridge synthetic e(Landroid/net/Uri;Lq2/x;Ljava/util/List;Lt2/O;Ljava/util/Map;LU2/q;LB2/K1;)LG2/f;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, LG2/c;->g(Landroid/net/Uri;Lq2/x;Ljava/util/List;Lt2/O;Ljava/util/Map;LU2/q;LB2/K1;)LG2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Landroid/net/Uri;Lq2/x;Ljava/util/List;Lt2/O;Ljava/util/Map;LU2/q;LB2/K1;)LG2/a;
    .locals 12

    .line 1
    iget-object v0, p2, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq2/s;->a(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static/range {p5 .. p5}, Lq2/s;->b(Ljava/util/Map;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {p1}, Lq2/s;->c(Landroid/net/Uri;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    sget-object v3, LG2/c;->f:[I

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, LG2/c;->f(ILjava/util/List;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, LG2/c;->f(ILjava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v2}, LG2/c;->f(ILjava/util/List;)V

    .line 30
    .line 31
    .line 32
    array-length v4, v3

    .line 33
    const/4 v5, 0x0

    .line 34
    move v6, v5

    .line 35
    :goto_0
    if-ge v6, v4, :cond_0

    .line 36
    .line 37
    aget v7, v3, v6

    .line 38
    .line 39
    invoke-static {v7, v2}, LG2/c;->f(ILjava/util/List;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v6, v6, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-interface/range {p6 .. p6}, LU2/q;->g()V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-ge v5, v4, :cond_4

    .line 54
    .line 55
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    move-object/from16 v9, p4

    .line 66
    .line 67
    invoke-direct {p0, v4, p2, p3, v9}, LG2/c;->h(ILq2/x;Ljava/util/List;Lt2/O;)LU2/p;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-static {v7}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, LU2/p;

    .line 76
    .line 77
    move-object/from16 v8, p6

    .line 78
    .line 79
    invoke-static {v7, v8}, LG2/c;->o(LU2/p;LU2/q;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_1

    .line 84
    .line 85
    new-instance v6, LG2/a;

    .line 86
    .line 87
    iget-object v10, p0, LG2/c;->b:Lr3/r$a;

    .line 88
    .line 89
    iget-boolean v11, p0, LG2/c;->c:Z

    .line 90
    .line 91
    move-object v8, p2

    .line 92
    invoke-direct/range {v6 .. v11}, LG2/a;-><init>(LU2/p;Lq2/x;Lt2/O;Lr3/r$a;Z)V

    .line 93
    .line 94
    .line 95
    return-object v6

    .line 96
    :cond_1
    if-nez v3, :cond_3

    .line 97
    .line 98
    if-eq v4, v0, :cond_2

    .line 99
    .line 100
    if-eq v4, v1, :cond_2

    .line 101
    .line 102
    if-eq v4, p1, :cond_2

    .line 103
    .line 104
    const/16 v9, 0xb

    .line 105
    .line 106
    if-ne v4, v9, :cond_3

    .line 107
    .line 108
    :cond_2
    move-object v3, v7

    .line 109
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    new-instance v6, LG2/a;

    .line 113
    .line 114
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    move-object v7, p1

    .line 119
    check-cast v7, LU2/p;

    .line 120
    .line 121
    iget-object v10, p0, LG2/c;->b:Lr3/r$a;

    .line 122
    .line 123
    iget-boolean v11, p0, LG2/c;->c:Z

    .line 124
    .line 125
    move-object v8, p2

    .line 126
    move-object/from16 v9, p4

    .line 127
    .line 128
    invoke-direct/range {v6 .. v11}, LG2/a;-><init>(LU2/p;Lq2/x;Lt2/O;Lr3/r$a;Z)V

    .line 129
    .line 130
    .line 131
    return-object v6
.end method

.method public k(Z)LG2/c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LG2/c;->c:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public l(I)LG2/c;
    .locals 0

    .line 1
    iput p1, p0, LG2/c;->d:I

    .line 2
    .line 3
    return-object p0
.end method

.method public n(Lr3/r$a;)LG2/c;
    .locals 0

    .line 1
    iput-object p1, p0, LG2/c;->b:Lr3/r$a;

    .line 2
    .line 3
    return-object p0
.end method
