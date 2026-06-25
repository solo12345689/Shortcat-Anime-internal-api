.class public LDg/b;
.super Lzg/r;


# instance fields
.field private a:LDg/a;

.field private b:Lzg/b;


# direct methods
.method public constructor <init>(LDg/a;Lzg/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/r;-><init>()V

    new-instance v0, Lzg/e0;

    invoke-direct {v0, p2}, Lzg/e0;-><init>(Lzg/e;)V

    iput-object v0, p0, LDg/b;->b:Lzg/b;

    iput-object p1, p0, LDg/b;->a:LDg/a;

    return-void
.end method

.method public constructor <init>(LDg/a;[B)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lzg/r;-><init>()V

    new-instance v0, Lzg/e0;

    invoke-direct {v0, p2}, Lzg/e0;-><init>([B)V

    iput-object v0, p0, LDg/b;->b:Lzg/b;

    iput-object p1, p0, LDg/b;->a:LDg/a;

    return-void
.end method

.method public constructor <init>(Lzg/B;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Lzg/r;-><init>()V

    invoke-virtual {p1}, Lzg/B;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lzg/B;->D()Ljava/util/Enumeration;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LDg/a;->n(Ljava/lang/Object;)LDg/a;

    move-result-object v0

    iput-object v0, p0, LDg/b;->a:LDg/a;

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    move-result-object p1

    iput-object p1, p0, LDg/b;->b:Lzg/b;

    return-void

    :cond_0
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

.method public static n(Ljava/lang/Object;)LDg/b;
    .locals 1

    .line 1
    instance-of v0, p0, LDg/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LDg/b;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance v0, LDg/b;

    .line 11
    .line 12
    invoke-static {p0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, LDg/b;-><init>(Lzg/B;)V

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
    .locals 3

    .line 1
    new-instance v0, Lzg/r0;

    .line 2
    .line 3
    iget-object v1, p0, LDg/b;->a:LDg/a;

    .line 4
    .line 5
    iget-object v2, p0, LDg/b;->b:Lzg/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/r0;-><init>(Lzg/e;Lzg/e;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public l()LDg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LDg/b;->a:LDg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Lzg/b;
    .locals 1

    .line 1
    iget-object v0, p0, LDg/b;->b:Lzg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Lzg/y;
    .locals 1

    .line 1
    iget-object v0, p0, LDg/b;->b:Lzg/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/b;->D()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lzg/y;->v([B)Lzg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
