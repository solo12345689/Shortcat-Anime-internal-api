.class public Lsh/z$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lsh/x;

.field private b:[B

.field private c:[B

.field private d:[B


# direct methods
.method public constructor <init>(Lsh/x;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lsh/z$b;->b:[B

    .line 6
    .line 7
    iput-object v0, p0, Lsh/z$b;->c:[B

    .line 8
    .line 9
    iput-object v0, p0, Lsh/z$b;->d:[B

    .line 10
    .line 11
    iput-object p1, p0, Lsh/z$b;->a:Lsh/x;

    .line 12
    .line 13
    return-void
.end method

.method static synthetic a(Lsh/z$b;)Lsh/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/z$b;->a:Lsh/x;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lsh/z$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/z$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lsh/z$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/z$b;->b:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lsh/z$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lsh/z$b;->c:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()Lsh/z;
    .locals 2

    .line 1
    new-instance v0, Lsh/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lsh/z;-><init>(Lsh/z$b;Lsh/z$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public f([B)Lsh/z$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/z$b;->d:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public g([B)Lsh/z$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/z$b;->c:[B

    .line 6
    .line 7
    return-object p0
.end method

.method public h([B)Lsh/z$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lsh/A;->c([B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh/z$b;->b:[B

    .line 6
    .line 7
    return-object p0
.end method
