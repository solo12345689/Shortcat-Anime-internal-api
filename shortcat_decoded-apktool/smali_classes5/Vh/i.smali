.class public LVh/i;
.super Lai/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVh/i$a;
    }
.end annotation


# instance fields
.field private final a:LYh/h;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(CII)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lai/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LYh/h;

    .line 5
    .line 6
    invoke-direct {v0}, LYh/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVh/i;->a:LYh/h;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, LVh/i;->c:Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LYh/h;->s(C)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, LYh/h;->u(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, LYh/h;->t(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method static synthetic j(Ljava/lang/CharSequence;II)LVh/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LVh/i;->l(Ljava/lang/CharSequence;II)LVh/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(LVh/i;)LYh/h;
    .locals 0

    .line 1
    iget-object p0, p0, LVh/i;->a:LYh/h;

    .line 2
    .line 3
    return-object p0
.end method

.method private static l(Ljava/lang/CharSequence;II)LVh/i;
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v3, p1

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/16 v4, 0x7e

    .line 9
    .line 10
    const/16 v5, 0x60

    .line 11
    .line 12
    if-ge v3, v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-eq v6, v5, :cond_1

    .line 19
    .line 20
    if-eq v6, v4, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_2
    const/4 v0, 0x0

    .line 32
    const/4 v3, 0x3

    .line 33
    if-lt v1, v3, :cond_4

    .line 34
    .line 35
    if-nez v2, :cond_4

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    invoke-static {v5, p0, p1}, LXh/f;->b(CLjava/lang/CharSequence;I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p1, -0x1

    .line 43
    if-eq p0, p1, :cond_3

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_3
    new-instance p0, LVh/i;

    .line 47
    .line 48
    invoke-direct {p0, v5, v1, p2}, LVh/i;-><init>(CII)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    if-lt v2, v3, :cond_5

    .line 53
    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    new-instance p0, LVh/i;

    .line 57
    .line 58
    invoke-direct {p0, v4, v2, p2}, LVh/i;-><init>(CII)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_5
    return-object v0
.end method

.method private m(Ljava/lang/CharSequence;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LVh/i;->a:LYh/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LYh/h;->o()C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LVh/i;->a:LYh/h;

    .line 8
    .line 9
    invoke-virtual {v1}, LYh/h;->q()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v0, p1, p2, v2}, LXh/f;->m(CLjava/lang/CharSequence;II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int/2addr v0, p2

    .line 22
    const/4 v2, 0x0

    .line 23
    if-ge v0, v1, :cond_0

    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    add-int/2addr p2, v0

    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {p1, p2, v0}, LXh/f;->o(Ljava/lang/CharSequence;II)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p2, p1, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_1
    return v2
.end method


# virtual methods
.method public e(LZh/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LVh/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, LVh/i;->b:Ljava/lang/String;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, LVh/i;->c:Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-virtual {p1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LVh/i;->c:Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v0, 0xa

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public f()LYh/a;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/i;->a:LYh/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, LVh/i;->a:LYh/h;

    .line 2
    .line 3
    iget-object v1, p0, LVh/i;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, LXh/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LYh/h;->v(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LVh/i;->a:LYh/h;

    .line 17
    .line 18
    iget-object v1, p0, LVh/i;->c:Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, LYh/h;->w(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public i(Lai/h;)Lai/c;
    .locals 5

    .line 1
    invoke-interface {p1}, Lai/h;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lai/h;->getIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Lai/h;->a()LZh/f;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {p1}, Lai/h;->b()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sget v3, LXh/f;->a:I

    .line 22
    .line 23
    if-ge p1, v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-ge v0, p1, :cond_0

    .line 30
    .line 31
    invoke-interface {v2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v3, p0, LVh/i;->a:LYh/h;

    .line 36
    .line 37
    invoke-virtual {v3}, LYh/h;->o()C

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne p1, v3, :cond_0

    .line 42
    .line 43
    invoke-direct {p0, v2, v0}, LVh/i;->m(Ljava/lang/CharSequence;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-static {}, Lai/c;->c()Lai/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_0
    iget-object p1, p0, LVh/i;->a:LYh/h;

    .line 55
    .line 56
    invoke-virtual {p1}, LYh/h;->p()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :goto_0
    if-lez p1, :cond_1

    .line 65
    .line 66
    if-ge v1, v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/16 v4, 0x20

    .line 73
    .line 74
    if-ne v3, v4, :cond_1

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    add-int/lit8 p1, p1, -0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-static {v1}, Lai/c;->b(I)Lai/c;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method
