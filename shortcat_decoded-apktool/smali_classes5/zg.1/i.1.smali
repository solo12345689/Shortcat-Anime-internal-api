.class public abstract Lzg/i;
.super Lzg/y;


# static fields
.field static final f:Lzg/L;


# instance fields
.field a:Lzg/t;

.field b:Lzg/o;

.field c:Lzg/y;

.field d:I

.field e:Lzg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/i$a;

    .line 2
    .line 3
    const-class v1, Lzg/i;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/i$a;-><init>(Ljava/lang/Class;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lzg/i;->f:Lzg/L;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Lzg/B;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Lzg/y;-><init>()V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lzg/i;->D(Lzg/B;I)Lzg/y;

    move-result-object v1

    instance-of v2, v1, Lzg/t;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    check-cast v1, Lzg/t;

    iput-object v1, p0, Lzg/i;->a:Lzg/t;

    invoke-static {p1, v3}, Lzg/i;->D(Lzg/B;I)Lzg/y;

    move-result-object v1

    move v0, v3

    :cond_0
    instance-of v2, v1, Lzg/o;

    if-eqz v2, :cond_1

    check-cast v1, Lzg/o;

    iput-object v1, p0, Lzg/i;->b:Lzg/o;

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lzg/i;->D(Lzg/B;I)Lzg/y;

    move-result-object v1

    :cond_1
    instance-of v2, v1, Lzg/G;

    if-nez v2, :cond_2

    iput-object v1, p0, Lzg/i;->c:Lzg/y;

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lzg/i;->D(Lzg/B;I)Lzg/y;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, Lzg/B;->size()I

    move-result p1

    add-int/2addr v0, v3

    if-ne p1, v0, :cond_4

    instance-of p1, v1, Lzg/G;

    if-eqz p1, :cond_3

    check-cast v1, Lzg/G;

    invoke-virtual {v1}, Lzg/G;->K()I

    move-result p1

    invoke-static {p1}, Lzg/i;->z(I)I

    move-result p1

    iput p1, p0, Lzg/i;->d:I

    invoke-static {v1}, Lzg/i;->B(Lzg/G;)Lzg/y;

    move-result-object p1

    iput-object p1, p0, Lzg/i;->e:Lzg/y;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No tagged object found in sequence. Structure doesn\'t seem to be of type External"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "input sequence too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>(Lzg/t;Lzg/o;Lzg/y;ILzg/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    iput-object p1, p0, Lzg/i;->a:Lzg/t;

    iput-object p2, p0, Lzg/i;->b:Lzg/o;

    iput-object p3, p0, Lzg/i;->c:Lzg/y;

    invoke-static {p4}, Lzg/i;->z(I)I

    move-result p1

    iput p1, p0, Lzg/i;->d:I

    invoke-static {p4, p5}, Lzg/i;->A(ILzg/y;)Lzg/y;

    move-result-object p1

    iput-object p1, p0, Lzg/i;->e:Lzg/y;

    return-void
.end method

.method private static A(ILzg/y;)Lzg/y;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object p0, Lzg/b;->b:Lzg/L;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1}, Lzg/L;->a(Lzg/y;)Lzg/y;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object p0, Lzg/u;->b:Lzg/L;

    .line 16
    .line 17
    goto :goto_0
.end method

.method private static B(Lzg/G;)Lzg/y;
    .locals 3

    .line 1
    invoke-static {p0}, Lzg/M;->a(Lzg/G;)Lzg/G;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzg/G;->K()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p0, v2}, Lzg/b;->B(Lzg/G;Z)Lzg/b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "invalid tag: "

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lzg/M;->f(Lzg/G;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    invoke-static {p0, v2}, Lzg/u;->A(Lzg/G;Z)Lzg/u;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-virtual {p0}, Lzg/G;->F()Lzg/r;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lzg/r;->e()Lzg/y;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method private static D(Lzg/B;I)Lzg/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/B;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-le v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lzg/B;->B(I)Lzg/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lzg/e;->e()Lzg/y;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p1, "too few objects in input sequence"

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method private static z(I)I
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    return p0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "invalid encoding value: "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method


# virtual methods
.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/i;->a:Lzg/t;

    .line 2
    .line 3
    invoke-static {v0}, LOh/f;->b(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lzg/i;->b:Lzg/o;

    .line 8
    .line 9
    invoke-static {v1}, LOh/f;->b(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    iget-object v1, p0, Lzg/i;->c:Lzg/y;

    .line 15
    .line 16
    invoke-static {v1}, LOh/f;->b(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    xor-int/2addr v0, v1

    .line 21
    iget v1, p0, Lzg/i;->d:I

    .line 22
    .line 23
    xor-int/2addr v0, v1

    .line 24
    iget-object v1, p0, Lzg/i;->e:Lzg/y;

    .line 25
    .line 26
    invoke-virtual {v1}, Lzg/y;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    xor-int/2addr v0, v1

    .line 31
    return v0
.end method

.method l(Lzg/y;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lzg/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lzg/i;

    .line 12
    .line 13
    iget-object v1, p0, Lzg/i;->a:Lzg/t;

    .line 14
    .line 15
    iget-object v3, p1, Lzg/i;->a:Lzg/t;

    .line 16
    .line 17
    invoke-static {v1, v3}, LOh/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lzg/i;->b:Lzg/o;

    .line 24
    .line 25
    iget-object v3, p1, Lzg/i;->b:Lzg/o;

    .line 26
    .line 27
    invoke-static {v1, v3}, LOh/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lzg/i;->c:Lzg/y;

    .line 34
    .line 35
    iget-object v3, p1, Lzg/i;->c:Lzg/y;

    .line 36
    .line 37
    invoke-static {v1, v3}, LOh/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget v1, p0, Lzg/i;->d:I

    .line 44
    .line 45
    iget v3, p1, Lzg/i;->d:I

    .line 46
    .line 47
    if-ne v1, v3, :cond_2

    .line 48
    .line 49
    iget-object v1, p0, Lzg/i;->e:Lzg/y;

    .line 50
    .line 51
    iget-object p1, p1, Lzg/i;->e:Lzg/y;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Lzg/y;->u(Lzg/y;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    return v0

    .line 60
    :cond_2
    return v2
.end method

.method n(Lzg/w;Z)V
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lzg/w;->s(ZI)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lzg/i;->y()Lzg/B;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p2, p1, v0}, Lzg/y;->n(Lzg/w;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method p()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method t(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/i;->y()Lzg/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lzg/y;->t(Z)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method w()Lzg/y;
    .locals 6

    .line 1
    new-instance v0, Lzg/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lzg/i;->a:Lzg/t;

    .line 4
    .line 5
    iget-object v2, p0, Lzg/i;->b:Lzg/o;

    .line 6
    .line 7
    iget-object v3, p0, Lzg/i;->c:Lzg/y;

    .line 8
    .line 9
    iget v4, p0, Lzg/i;->d:I

    .line 10
    .line 11
    iget-object v5, p0, Lzg/i;->e:Lzg/y;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lzg/f0;-><init>(Lzg/t;Lzg/o;Lzg/y;ILzg/y;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method abstract y()Lzg/B;
.end method
