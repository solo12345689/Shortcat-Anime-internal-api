.class public Lsh/s$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lsh/r;

.field private b:J

.field private c:J

.field private d:[B

.field private e:[B

.field private f:[B

.field private g:[B

.field private h:Lsh/b;

.field private i:[B

.field private j:Lsh/x;


# direct methods
.method public constructor <init>(Lsh/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lsh/s$b;->b:J

    .line 7
    .line 8
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    iput-wide v0, p0, Lsh/s$b;->c:J

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lsh/s$b;->d:[B

    .line 14
    .line 15
    iput-object v0, p0, Lsh/s$b;->e:[B

    .line 16
    .line 17
    iput-object v0, p0, Lsh/s$b;->f:[B

    .line 18
    .line 19
    iput-object v0, p0, Lsh/s$b;->g:[B

    .line 20
    .line 21
    iput-object v0, p0, Lsh/s$b;->h:Lsh/b;

    .line 22
    .line 23
    iput-object v0, p0, Lsh/s$b;->i:[B

    .line 24
    .line 25
    iput-object v0, p0, Lsh/s$b;->j:Lsh/x;

    .line 26
    .line 27
    iput-object p1, p0, Lsh/s$b;->a:Lsh/r;

    .line 28
    .line 29
    return-void
.end method

.method static synthetic a(Lsh/s$b;)Lsh/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->a:Lsh/r;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lsh/s$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->i:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lsh/s$b;)Lsh/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->j:Lsh/x;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lsh/s$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsh/s$b;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic e(Lsh/s$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(Lsh/s$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->e:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(Lsh/s$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->f:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(Lsh/s$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->g:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i(Lsh/s$b;)Lsh/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/s$b;->h:Lsh/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(Lsh/s$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsh/s$b;->c:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public k()Lsh/s;
    .locals 2

    .line 1
    new-instance v0, Lsh/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lsh/s;-><init>(Lsh/s$b;Lsh/s$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public l(Lsh/b;)Lsh/s$b;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lsh/b;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lsh/b;

    .line 12
    .line 13
    iget-object v1, p0, Lsh/s$b;->a:Lsh/r;

    .line 14
    .line 15
    invoke-virtual {v1}, Lsh/r;->a()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long v4, v2, v1

    .line 22
    .line 23
    sub-long/2addr v4, v2

    .line 24
    invoke-direct {v0, p1, v4, v5}, Lsh/b;-><init>(Lsh/b;J)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lsh/s$b;->h:Lsh/b;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    iput-object p1, p0, Lsh/s$b;->h:Lsh/b;

    .line 31
    .line 32
    return-object p0
.end method

.method public m(J)Lsh/s$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lsh/s$b;->b:J

    .line 2
    .line 3
    return-object p0
.end method

.method public n(J)Lsh/s$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lsh/s$b;->c:J

    .line 2
    .line 3
    return-object p0
.end method

.method public o([B)Lsh/s$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/s$b;->f:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public p([B)Lsh/s$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/s$b;->g:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public q([B)Lsh/s$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/s$b;->e:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public r([B)Lsh/s$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/s$b;->d:[B

    .line 6
    .line 7
    return-object p0
.end method
