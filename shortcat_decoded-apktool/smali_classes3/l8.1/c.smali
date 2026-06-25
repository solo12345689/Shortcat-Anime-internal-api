.class public Ll8/c;
.super Ll8/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final m:I


# instance fields
.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:B

.field j:Ll8/a;

.field k:Ll8/i;

.field l:Ll8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ANMF"

    .line 2
    .line 3
    invoke-static {v0}, Ll8/e;->a(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Ll8/c;->m:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll8/e;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method b(Lm8/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lm8/a;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iput v1, p0, Ll8/c;->d:I

    .line 10
    .line 11
    invoke-virtual {p1}, Lm8/a;->d()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Ll8/c;->e:I

    .line 16
    .line 17
    invoke-virtual {p1}, Lm8/a;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Ll8/c;->f:I

    .line 22
    .line 23
    invoke-virtual {p1}, Lm8/a;->a()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, p0, Ll8/c;->g:I

    .line 28
    .line 29
    invoke-virtual {p1}, Lm8/a;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Ll8/c;->h:I

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iput-byte v1, p0, Ll8/c;->i:B

    .line 40
    .line 41
    iget v1, p0, Ll8/e;->b:I

    .line 42
    .line 43
    sub-int/2addr v0, v1

    .line 44
    int-to-long v0, v0

    .line 45
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-long v2, v2

    .line 50
    cmp-long v2, v2, v0

    .line 51
    .line 52
    if-lez v2, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, Ll8/m;->c(Lm8/a;)Ll8/e;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    instance-of v3, v2, Ll8/a;

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    check-cast v2, Ll8/a;

    .line 63
    .line 64
    iput-object v2, p0, Ll8/c;->j:Ll8/a;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    instance-of v3, v2, Ll8/i;

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    check-cast v2, Ll8/i;

    .line 72
    .line 73
    iput-object v2, p0, Ll8/c;->k:Ll8/i;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    instance-of v3, v2, Ll8/j;

    .line 77
    .line 78
    if-eqz v3, :cond_0

    .line 79
    .line 80
    check-cast v2, Ll8/j;

    .line 81
    .line 82
    iput-object v2, p0, Ll8/c;->l:Ll8/j;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    return-void
.end method

.method d()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ll8/c;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method e()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ll8/c;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method
