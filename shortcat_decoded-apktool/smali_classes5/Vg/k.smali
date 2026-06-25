.class public LVg/k;
.super Lzg/r;


# instance fields
.field private final a:Lzg/o;

.field private final b:I

.field private final c:LDg/a;


# direct methods
.method public constructor <init>(ILDg/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lzg/r;-><init>()V

    new-instance v0, Lzg/o;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lzg/o;-><init>(J)V

    iput-object v0, p0, LVg/k;->a:Lzg/o;

    iput p1, p0, LVg/k;->b:I

    iput-object p2, p0, LVg/k;->c:LDg/a;

    return-void
.end method

.method private constructor <init>(Lzg/B;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lzg/r;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    move-result-object v0

    invoke-static {v0}, Lzg/o;->z(Ljava/lang/Object;)Lzg/o;

    move-result-object v0

    iput-object v0, p0, LVg/k;->a:Lzg/o;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    move-result-object v0

    invoke-static {v0}, Lzg/o;->z(Ljava/lang/Object;)Lzg/o;

    move-result-object v0

    invoke-virtual {v0}, Lzg/o;->G()I

    move-result v0

    iput v0, p0, LVg/k;->b:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    move-result-object p1

    invoke-static {p1}, LDg/a;->n(Ljava/lang/Object;)LDg/a;

    move-result-object p1

    iput-object p1, p0, LVg/k;->c:LDg/a;

    return-void
.end method

.method public static n(Ljava/lang/Object;)LVg/k;
    .locals 1

    .line 1
    instance-of v0, p0, LVg/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LVg/k;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance v0, LVg/k;

    .line 11
    .line 12
    invoke-static {p0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, LVg/k;-><init>(Lzg/B;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method


# virtual methods
.method public e()Lzg/y;
    .locals 4

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lzg/f;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVg/k;->a:Lzg/o;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lzg/o;

    .line 12
    .line 13
    iget v2, p0, LVg/k;->b:I

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    invoke-direct {v1, v2, v3}, Lzg/o;-><init>(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LVg/k;->c:LDg/a;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lzg/r0;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, LVg/k;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public p()LDg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LVg/k;->c:LDg/a;

    .line 2
    .line 3
    return-object v0
.end method
