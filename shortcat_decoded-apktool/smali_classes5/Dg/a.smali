.class public LDg/a;
.super Lzg/r;


# instance fields
.field private a:Lzg/t;

.field private b:Lzg/e;


# direct methods
.method private constructor <init>(Lzg/B;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Lzg/r;-><init>()V

    invoke-virtual {p1}, Lzg/B;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Lzg/B;->size()I

    move-result v0

    const/4 v2, 0x2

    if-gt v0, v2, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    move-result-object v0

    invoke-static {v0}, Lzg/t;->F(Ljava/lang/Object;)Lzg/t;

    move-result-object v0

    iput-object v0, p0, LDg/a;->a:Lzg/t;

    invoke-virtual {p1}, Lzg/B;->size()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1, v1}, Lzg/B;->B(I)Lzg/e;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LDg/a;->b:Lzg/e;

    return-void

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad sequence size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lzg/B;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lzg/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/r;-><init>()V

    iput-object p1, p0, LDg/a;->a:Lzg/t;

    return-void
.end method

.method public constructor <init>(Lzg/t;Lzg/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lzg/r;-><init>()V

    iput-object p1, p0, LDg/a;->a:Lzg/t;

    iput-object p2, p0, LDg/a;->b:Lzg/e;

    return-void
.end method

.method public static n(Ljava/lang/Object;)LDg/a;
    .locals 1

    .line 1
    instance-of v0, p0, LDg/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LDg/a;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance v0, LDg/a;

    .line 11
    .line 12
    invoke-static {p0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, LDg/a;-><init>(Lzg/B;)V

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
    .locals 2

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lzg/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LDg/a;->a:Lzg/t;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LDg/a;->b:Lzg/e;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v1, Lzg/r0;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public l()Lzg/t;
    .locals 1

    .line 1
    iget-object v0, p0, LDg/a;->a:Lzg/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Lzg/e;
    .locals 1

    .line 1
    iget-object v0, p0, LDg/a;->b:Lzg/e;

    .line 2
    .line 3
    return-object v0
.end method
