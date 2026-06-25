.class public Lsh/t$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lsh/r;

.field private b:[B

.field private c:[B

.field private d:[B


# direct methods
.method public constructor <init>(Lsh/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lsh/t$b;->b:[B

    .line 6
    .line 7
    iput-object v0, p0, Lsh/t$b;->c:[B

    .line 8
    .line 9
    iput-object v0, p0, Lsh/t$b;->d:[B

    .line 10
    .line 11
    iput-object p1, p0, Lsh/t$b;->a:Lsh/r;

    .line 12
    .line 13
    return-void
.end method

.method static synthetic a(Lsh/t$b;)Lsh/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/t$b;->a:Lsh/r;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lsh/t$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/t$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lsh/t$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/t$b;->b:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lsh/t$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/t$b;->c:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()Lsh/t;
    .locals 2

    .line 1
    new-instance v0, Lsh/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lsh/t;-><init>(Lsh/t$b;Lsh/t$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public f([B)Lsh/t$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/t$b;->d:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public g([B)Lsh/t$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/t$b;->c:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public h([B)Lsh/t$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/t$b;->b:[B

    .line 6
    .line 7
    return-object p0
.end method
