.class final LP9/M;
.super LP9/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final j:LP9/M;


# instance fields
.field private final transient e:Ljava/lang/Object;

.field final transient f:[Ljava/lang/Object;

.field private final transient g:I

.field private final transient h:I

.field private final transient i:LP9/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP9/M;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/M;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP9/M;->j:LP9/M;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, LP9/r;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LP9/M;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, LP9/M;->f:[Ljava/lang/Object;

    .line 4
    iput v0, p0, LP9/M;->g:I

    .line 5
    iput v0, p0, LP9/M;->h:I

    .line 6
    iput-object p0, p0, LP9/M;->i:LP9/M;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;ILP9/M;)V
    .locals 0

    .line 15
    invoke-direct {p0}, LP9/r;-><init>()V

    .line 16
    iput-object p1, p0, LP9/M;->e:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LP9/M;->f:[Ljava/lang/Object;

    const/4 p1, 0x1

    .line 18
    iput p1, p0, LP9/M;->g:I

    .line 19
    iput p3, p0, LP9/M;->h:I

    .line 20
    iput-object p4, p0, LP9/M;->i:LP9/M;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 2

    .line 7
    invoke-direct {p0}, LP9/r;-><init>()V

    .line 8
    iput-object p1, p0, LP9/M;->f:[Ljava/lang/Object;

    .line 9
    iput p2, p0, LP9/M;->h:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, LP9/M;->g:I

    const/4 v1, 0x2

    if-lt p2, v1, :cond_0

    .line 11
    invoke-static {p2}, LP9/w;->t(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-static {p1, p2, v1, v0}, LP9/O;->v([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LP9/M;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 13
    invoke-static {p1, p2, v1, v0}, LP9/O;->v([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    .line 14
    new-instance v1, LP9/M;

    invoke-direct {v1, v0, p1, p2, p0}, LP9/M;-><init>(Ljava/lang/Object;[Ljava/lang/Object;ILP9/M;)V

    iput-object v1, p0, LP9/M;->i:LP9/M;

    return-void
.end method


# virtual methods
.method e()LP9/w;
    .locals 4

    .line 1
    new-instance v0, LP9/O$a;

    .line 2
    .line 3
    iget-object v1, p0, LP9/M;->f:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LP9/M;->g:I

    .line 6
    .line 7
    iget v3, p0, LP9/M;->h:I

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, v3}, LP9/O$a;-><init>(LP9/v;[Ljava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method f()LP9/w;
    .locals 4

    .line 1
    new-instance v0, LP9/O$c;

    .line 2
    .line 3
    iget-object v1, p0, LP9/M;->f:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LP9/M;->g:I

    .line 6
    .line 7
    iget v3, p0, LP9/M;->h:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LP9/O$c;-><init>([Ljava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    new-instance v1, LP9/O$b;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0}, LP9/O$b;-><init>(LP9/v;LP9/u;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LP9/M;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LP9/M;->f:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LP9/M;->h:I

    .line 6
    .line 7
    iget v3, p0, LP9/M;->g:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, LP9/O;->w(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    return-object p1
.end method

.method i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LP9/M;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public u()LP9/r;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/M;->i:LP9/M;

    .line 2
    .line 3
    return-object v0
.end method
